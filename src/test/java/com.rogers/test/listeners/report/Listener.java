package com.rogers.test.listeners.report;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import org.apache.commons.io.output.WriterOutputStream;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.*;
import org.testng.internal.TestResult;
import utils.SauceLabsUtils;
import utils.XrayUtils;

import javax.mail.MessagingException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Listener implements ITestListener, IInvokedMethodListener, IExecutionListener{
        private String strBrowser=System.getProperty("Browser");
        private String strLanguage=System.getProperty("Language");
        ListMultimap<String,String> testCaseName_StatusMap = ArrayListMultimap.create();
        ListMultimap<String,String> testCaseName_GroupMap = ArrayListMultimap.create();
        protected static final ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();
        String[] groups;
        String[] groupNames;
        public static HashMap<Long, PrintStream> printStreams = new HashMap<Long, PrintStream>();
        public static HashMap<Long, String> logFiles = new HashMap<Long, String>();
        public FileWriter fileWriter;
        public static ListMultimap<String, String> testDescriptionMap = ArrayListMultimap.create();
        private String testDesc="";
        private String reportLink;

        private static WebDriver getDriver() {
            return webDriverThreadLocal.get();
        }

        private static String getTestMethodName(ITestResult iTestResult) {
            return iTestResult.getMethod().getConstructorOrMethod().getName();
        }

        private String getStackTraceMsg(ITestResult iTestResult, String strStatus){
            String exceptionMsg;
            Optional<StackTraceElement> stackTraceFirst = Arrays.stream(iTestResult.getThrowable().getStackTrace()).findFirst();
            String stackTraceMsg = "<br>at <B>- class -</B>"
                    + stackTraceFirst.get().getClassName()
                    + " <B>- method - </B>"
                    + stackTraceFirst.get().getMethodName()
                    + " <B>- line - </B>"
                    + stackTraceFirst.get().getLineNumber();
            List<StackTraceElement> list = Arrays.stream(iTestResult.getThrowable().getStackTrace()).collect(Collectors.toList());
            for (StackTraceElement element : list){
                String className = element.getClassName();
                if (className.toLowerCase().contains("page")){
                    stackTraceMsg = "<br>at <B>- class -</B>"
                            + className
                            + " <B>- method - </B>"
                            + element.getMethodName()
                            + " <B>- line - </B>"
                            + element.getLineNumber();
                    break;
                }
            }

            String throwableMsg;
            if(iTestResult.getThrowable().toString().startsWith("Custom Exception")) {
                throwableMsg = iTestResult.getThrowable().toString().split("Build")[0].replace("<", "&lt;")+"\"";
            }else {
                throwableMsg = iTestResult.getThrowable().toString().split("Build")[0].replace("<", "&lt;").replace("\"", "");
            }
            if(iTestResult.getThrowable().toString().toLowerCase().contains("assert")){
                exceptionMsg = "Test Case " + "\""+  iTestResult.getName()+"\" " + strStatus + " for execution <br>"
                        + throwableMsg;
            } else {
                exceptionMsg = "Test Case " + "\""+  iTestResult.getName()+"\" " + strStatus + " for execution <br>"
                        + "Exception occured: <br>"
                        + throwableMsg
                        + stackTraceMsg;
            }
            return exceptionMsg;
        }

        public static void setDriver(WebDriver driver){
            //Get driver from BaseTest and assign to local webdriver variable.
            webDriverThreadLocal.set(driver);
        }

        //Before starting all tests, below method runs.
        @Override
        public void onStart(ITestContext iTestContext) {
            System.out.println(" in onStart test " + iTestContext.getName());
            // iTestContext.setAttribute("WebDriver", getDriver());
        }

        // After ending all tests, below method runs.
        @Override
        public void onFinish(ITestContext iTestContext) {
            System.out.println(" in onFinish method " + iTestContext.getName());
            // Do tier down operations for extentreports reporting!
            try {
                Manager.getReporter().flush();
                //Collect the group names to add them in the email title
                String executeGroup = iTestContext.getSuite().getName();
                if(iTestContext.getIncludedGroups().length > 0){
                    executeGroup = Stream.of(iTestContext.getIncludedGroups()).collect(Collectors.joining());
                }
                String emailRecipient = System.getProperty("user.name")+"@rci.rogers.com";
                String propEmailRecipient = System.getProperty("EmailId");
                if(!(propEmailRecipient==null || propEmailRecipient.isEmpty())){
                    emailRecipient = System.getProperty("user.name")+"@rci.rogers.com"+"," + propEmailRecipient;
                }
                String strReportPath;
                String baseLink;
                if(System.getenv("NETSTORAGE_ACCESS_KEY")!=null) {
                    strReportPath = UploadFile.UploadToNetStorage();
                    baseLink = "https://qa1.rogers.com/Digital-QE/report/";
                }else{
                    strReportPath = UploadFile.extentReportsUpload();
                    baseLink = "http://10.18.97.209/";
                }
                reportLink = baseLink + strReportPath;
                //The if block will get executed if the test run is triggered from local machine or any machine
                //where BUILD_TIMESTAMP is not setup. BUILD_TIMESTAMP env variable is set by Jenkins job.
                if((System.getenv("BUILD_BUILDNUMBER")==null) || System.getenv("BUILD_BUILDNUMBER").equals("")){
                    //Upload test reports to server and send email
                    SendMail.sendEmail(executeGroup, emailRecipient, reportLink, testCaseName_StatusMap,testDescriptionMap, TestManager.testType,testCaseName_GroupMap);
                }else if(!(propEmailRecipient==null || propEmailRecipient.isEmpty())) {
                    //Don't send email to system user when run tests on Jenkins
                    SendMail.sendEmail(executeGroup, propEmailRecipient,reportLink, testCaseName_StatusMap,testDescriptionMap,TestManager.testType,testCaseName_GroupMap);
                }
            } catch (IOException | MessagingException e) {
                e.printStackTrace();
            }

        }

        /** This Method will be called after report generation phase for Xray Import
         */
        @Override
        public void onExecutionFinish() {
            System.out.println("Before Xray import");
            String xrayImportFlag = System.getProperty("XrayImportFlag");
            if(xrayImportFlag != null && xrayImportFlag.equalsIgnoreCase("true")){
                System.out.println("Inside Xray import");
                XrayUtils updateJira = new XrayUtils();
                updateJira.XrayListener(reportLink);
            }
            System.out.println("After Xray import");
        }

        @Override
        public void onTestStart(ITestResult iTestResult) {
            String sauceSessionId;
            testDesc = getTestDescription(iTestResult);
            int dataIteratorIndex = ((TestResult) iTestResult).getParameterIndex();
            Object[] dataParam = iTestResult.getParameters();
            System.out.println(" in onTestStart method " +  getTestMethodName(iTestResult) + "-" + dataIteratorIndex + " start");
            String testClassName = getTestName(iTestResult);
            if(TestManager.testType!=null) {
                if(TestManager.testType.isEmpty()){
                    TestManager.startTest(testClassName, iTestResult.getName());
                }
                else if (TestManager.testType.toUpperCase().contains("DATA")) {
                    createReportForApiTest(testDesc, testClassName);
                }
            }
            else {
                TestManager.startTest(testClassName, iTestResult.getName());
            }
            //To add test data in extent report for data iteration tests
            if(dataParam.length!=0 && !dataParam[0].toString().contains(".xml")) {
                if(dataParam[0].getClass().equals(HashMap.class)){
                    TestManager.getTest().info("Test Data" + ((HashMap) dataParam[0]).values().toString());
                } else if(dataParam[0].getClass().equals(LinkedHashMap.class)){
                    TestManager.getTest().info("Test Data" + ((LinkedHashMap) dataParam[0]).values().toString());
                } else if (dataParam[0].getClass().equals(String[].class)) {
                    String[] stringArray = Arrays.copyOf(((String[]) dataParam[0]), ((String[]) dataParam[0]).length, String[].class);
                    TestManager.getTest().info("Test Data" + Arrays.toString(stringArray));
                }
            }
            //To add video in the report when tests run on SauceLabs
            if(strBrowser!=null)
            {
                if(strBrowser.contains("sauce")){
                    sauceSessionId = (((RemoteWebDriver) getDriver()).getSessionId()).toString();
                    String[] strLinks = SauceLabsUtils.getSauceJobLinks(sauceSessionId);
                    if (System.getProperty("VideoRequiredInReport") == null || System.getProperty("VideoRequiredInReport").isEmpty()
                            || !(System.getProperty("VideoRequiredInReport").equalsIgnoreCase("No"))) {
                        TestManager.getTest().info("Video Started" + "<iframe width=\"597\" height=\"448\" src=\"" + strLinks[0] + "&width=597&height=448\">\r\n" +
                                "</iframe>");
                    }
                    TestManager.getTest().info("<a href='"+ strLinks[1] +"' target='_blank'>Click here for Detailed SauceLabs report</a>");

                }
            }
        }

        @Override
        public void onTestSuccess(ITestResult iTestResult) {
            try {
                System.out.println(" in onTestSuccess method " +  getTestMethodName(iTestResult) + " succeed");
                //Extentreports log operation for passed tests.
                if(strBrowser!=null && strBrowser.contains("sauce"))
                {
                    ((JavascriptExecutor) getDriver()).executeScript("sauce:job-result=" + "passed");
                    ((JavascriptExecutor)getDriver()).executeScript("sauce:job-name="+getTestMethodName(iTestResult));
                    String sauceSessionId = (((RemoteWebDriver) getDriver()).getSessionId()).toString();
                    if(sauceSessionId != null){
                        String message = String.format("SauceOnDemandSessionID=%1$s job-name=%2$s", sauceSessionId, getTestMethodName(iTestResult));
                        System.out.println(message);
                    } else {
                        System.out.println("Sauce Session is terminated unexpected, please check!!!!!");
                    }
                }
            } finally {				//Added finally block So that it will update the extent report without any issues irrespective of the whether the try block will execute with any exception or not
                TestManager.getTest().pass("Test passed");
                assignGroup_DeviceInReport(iTestResult);
                addTestResultToMap(iTestResult);
                addTestGroupToMap(iTestResult);
            }

        }

        @Override
        public void onTestFailure(ITestResult iTestResult) {
            System.out.println(" in onTestFailure method " +  getTestMethodName(iTestResult) + " failed");
            try {

                if(strBrowser!=null && strBrowser.contains("sauce"))
                {
                    ((JavascriptExecutor) getDriver()).executeScript("sauce:job-result=" + "failed");
                    ((JavascriptExecutor)getDriver()).executeScript("sauce:job-name="+getTestMethodName(iTestResult));
                    String sauceSessionId = (((RemoteWebDriver) getDriver()).getSessionId()).toString();
                    String message = String.format("SauceOnDemandSessionID=%1$s job-name=%2$s", sauceSessionId, getTestMethodName(iTestResult));
                    System.out.println(message);
                }
            }
            finally{	//Added finally block So that it will update the extent report without any issues irrespective of the whether the try block will execute with any exception or not
                String exceptionMsg = getStackTraceMsg(iTestResult, "FAILED");
                //Extentreports log and screenshot operations for failed tests.
                if(getDriver() != null){
                        TestManager.getTest().fail(exceptionMsg,
                                MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen.getScreenShot(getDriver())).build());
                } else {
                    TestManager.getTest().fail(exceptionMsg);
                }
                assignGroup_DeviceInReport(iTestResult);
                addTestResultToMap(iTestResult);
                addTestGroupToMap(iTestResult);
            }
//               finally{	//Added finally block So that it will update the extent report without any issues irrespective of the whether the try block will execute with any exception or not
//                String exceptionMsg = getStackTraceMsg(iTestResult, "FAILED");
//                //Extentreports log and screenshot operations for failed tests.
//                if(getDriver() != null){
//                    try {
//                        TestManager.getTest().fail(exceptionMsg,
//                                MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen.getScreenShot(getDriver())).build());
//                    }
//                } else {
//                    TestManager.getTest().fail(exceptionMsg);
//                }
//                assignGroup_DeviceInReport(iTestResult);
//                addTestResultToMap(iTestResult);
//                addTestGroupToMap(iTestResult);
//            }
        }

        @Override
        public void onTestSkipped(ITestResult iTestResult) {
            System.out.println(" in onTestSkipped method " + getTestMethodName(iTestResult) + " skipped");
            try {
                if(strBrowser!=null && strBrowser.contains("sauce"))
                {
                    ((JavascriptExecutor) getDriver()).executeScript("sauce:job-result=" + "skipped");
                    ((JavascriptExecutor)getDriver()).executeScript("sauce:job-name="+getTestMethodName(iTestResult));
                    String sauceSessionId = (((RemoteWebDriver) getDriver()).getSessionId()).toString();
                    String message = String.format("SauceOnDemandSessionID=%1$s job-name=%2$s", sauceSessionId, getTestMethodName(iTestResult));
                    System.out.println(message);
                }

            } finally {		//Added finally block So that it will update the extent report without any issues irrespective of the whether the try block will execute with any exception or not
                String exceptionMsg = getStackTraceMsg(iTestResult, "SKIPPED");
                // Extentreports log operation for skipped tests.
                if(iTestResult.getSkipCausedBy().size() == 0){
//                ExtentTestManager.getTest().skip(exceptionMsg,
//                        MediaEntityBuilder.createScreenCaptureFromPath(ScreenCapture.getScreenShot(getDriver())).build());
                    System.out.println("Test method skipped for rerun, don't include it in extent report.");
                    TestManager.getTest().getExtent().removeTest(TestManager.getTest());
                } else {
                    TestManager.getTest().fail(exceptionMsg);
                    addTestResultToMap(iTestResult);
                }
            }

        }

        @Override
        public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
            System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
        }

        /**
         * This listener method is invoked after a method is invoked by TestNG
         */
        @Override
        public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
            if(testResult.getMethod().isTest()) {
                if(testResult.getStatus() == ITestResult.SUCCESS) {
                    if(TestManager.getFailFlag()) {
                        Reporter.getCurrentTestResult().setStatus(ITestResult.FAILURE);
                        Reporter.getCurrentTestResult().setThrowable(new AssertionError("Assertion Failed"));
                    }
                }
            }
        }

        /**
         * This Method will Return Currently Executing Class Method Language and Browser Name for Report
         * @param iTestResult passing iTestResult Parameter
         * @return It will return Class Method Browser Details
         * @author Karthic.Hasan
         */

        public String getTestName(ITestResult iTestResult) {
            String testClassName = iTestResult.getMethod().getInstance().getClass().getSimpleName();
            int dataIteratorIndex = ((TestResult) iTestResult).getParameterIndex();
            if (!testClassName.equals(getTestMethodName(iTestResult))) {
                testClassName = testClassName + "." + getTestMethodName(iTestResult);
            }
            if (strBrowser != null && strLanguage != null) {
                testClassName =  testClassName + "_" + strBrowser + "_" + strLanguage.toUpperCase();
            } else if (strBrowser != null) {
                testClassName = testClassName + "_" + strBrowser;
            } else if (strLanguage != null){
                testClassName = testClassName + "_" + strLanguage;
            }
            if (iTestResult.getParameters().length != 0) {
                testClassName = testClassName + "_DataSet-" + (dataIteratorIndex + 1);
            }
            return testClassName;
        }

        /**
         * This Method will add Group and Device to Extent Report on Test Pass and Failure
         * @param iTestResult passing iTestResult Parameter
         * @author Karthic.Hasan
         */

        public void assignGroup_DeviceInReport(ITestResult iTestResult) {
            if (strBrowser != null)
                TestManager.getTest().assignDevice(strBrowser);
            groups = iTestResult.getMethod().getGroups();
            if (groups != null && TestManager.testType==null)
                for (String group : groups) {
                    TestManager.getTest().assignCategory(group);
                }
        }

        /**
         * This Method will setup the PrintStreams for logging request and response for the created file
         * @param testClassName class name of the test
         * @throws IOException will be thrown
         * @author praveen.kumar7
         */
        public synchronized void setup(String testClassName) throws IOException {
            File file = new File(Manager.absolutePathToReport + "/" + testClassName + ".txt");
            file.getParentFile().mkdirs();
            logFiles.put(Thread.currentThread().getId(),testClassName + ".txt");
            fileWriter = new FileWriter(file);
            PrintStream printStream = new PrintStream(new WriterOutputStream(fileWriter, Charset.defaultCharset()), true);
            printStreams.put(Thread.currentThread().getId(),printStream);
        }

        /**
         * This Method will return the PrintStream for logging
         * @return the PrintStream HashMap
         * @author praveen.kumar7
         */
        public synchronized static HashMap<Long, PrintStream> getPrintStream() {
            return printStreams;
        }

        /**
         * This Method will return the LogFiles which has the .txt files for logging
         * @return the LogFiles HashMap
         * @author praveen.kumar7
         */
        public synchronized static HashMap<Long, String> getLogFiles() {
            return logFiles;
        }

        /**
         * This Method will return the test description for the test if present, else returns the test class name
         * @param iTestResult passing iTestResult Parameter
         * @return test description
         * @author praveen.kumar7
         */
        public String getTestDescription(ITestResult iTestResult) {
            String testDescription = iTestResult.getMethod().getDescription();
            if(testDescription.isEmpty() || testDescription==null) {
                return iTestResult.getMethod().getInstance().getClass().getSimpleName();
            }
            else {
                return iTestResult.getMethod().getDescription();
            }
        }

        /**
         * This Method will create the report for API test with nodes and adds the testdescriptin and testclassname in the map
         * @param testDesc description of the @Test method
         * @param testClassName class name of the test
         * @author praveen.kumar7
         */
        public synchronized void createReportForApiTest(String testDesc,String testClassName) {
            if (!testDescriptionMap.containsKey(testDesc)) {
                TestManager.startTest(testDesc, testDesc);
            }
            TestManager.createNode(testClassName, testDesc);
            try {
                setup(testClassName);
            } catch (IOException e) {
                e.printStackTrace();
            }
            testDescriptionMap.put(testDesc, testClassName);
        }

        /**
         * This Method will add TestCasName and Status in Map with Synchronized way to handle thread Safety
         * @param iTestResult passing iTestResult Parameter
         * @author Karthic.Hasan
         */
        public synchronized void addTestResultToMap(ITestResult iTestResult)
        {
            testCaseName_StatusMap.put(getTestName(iTestResult), String.valueOf(TestManager.getTest().getStatus()));
        }
        public synchronized void addTestGroupToMap(ITestResult iTestResult)

        {
            groupNames=iTestResult.getMethod().getGroups();
            ArrayList<String> groupValues = new ArrayList<>();
            for (String group : groupNames) {
                if(group.equalsIgnoreCase("regression") || group.equalsIgnoreCase("e2e") || group.equalsIgnoreCase("scrum") ){
                    continue;
                }
                else {
                   groupValues.add(group);
                }
            }
            String result = String.join(",",groupValues);
            testCaseName_GroupMap.put(getTestName(iTestResult),result);
        }
    }
