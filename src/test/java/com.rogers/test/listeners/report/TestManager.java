package com.rogers.test.listeners.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Reporter;



import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class TestManager implements Reporter{
        @SuppressWarnings("rawtypes")
        static Map extentTestMap = new HashMap();
        static Map extentParentMap = new HashMap();
        static ExtentReports extent;
        static ExtentTest apiTest;
        public static String testType;
        private static final ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();
        public static HashMap<Long, Boolean> failFlags = new HashMap<>();

        static {
            try {
                extent = Manager.getReporter();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * Constructor for the class ExtentTestManager
         */
        public TestManager() {
        }

        /**
         * Constructor for the class ExtentTestManager for assigning the WebDriver instance
         * @param driver WebDriver
         */
        public TestManager(WebDriver driver) {
            webDriverThreadLocal.set(driver);
        }

        public static synchronized ExtentTest getTest() {
            long threadId = Thread.currentThread().getId();
            return (ExtentTest)extentTestMap.get((int) (long) (Thread.currentThread().getId()));
        }

        public static void endTest() {
            extent.removeTest((ExtentTest)extentTestMap.get((int) (long) (Thread.currentThread().getId())));
            System.out.println("--------------End Test-------------" + Thread.currentThread().getId());
        }

        @SuppressWarnings("unchecked")
        public static synchronized ExtentTest startTest(String testName, String desc) {
            ExtentTest test = extent.createTest(testName, desc);
            if(testType!=null) {
                if (testType.toUpperCase().contains("DATA")) {
                    extentParentMap.put(testName, test);
                }
            }
            extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
            failFlags.put(Thread.currentThread().getId(), false);
            return test;
        }

        public static synchronized ExtentTest createNode(String testName, String desc) {
            extentTestMap.put((int) (long) (Thread.currentThread().getId()), ((ExtentTest)extentParentMap.get(desc)).createNode("<FONT COLOR=#277EB7>"+testName+"></FONT>", desc));
            failFlags.put(Thread.currentThread().getId(), false);
            return apiTest;
        }

        @Override
        public void reportLog(String stepName) {
            getTest().info(stepName);
        }

        @Override
        public void reportLogWithScreenshot(String stepName) {
            try {
                getTest().info( stepName,
                        MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen.getScreenShot(getDriver())).build());
            }catch (UnhandledAlertException alertExcpt) {
                getTest().info(alertExcpt.toString());
                alertExcpt.printStackTrace();
            }
        }

    @Override
    public void reportLogWithFullPageScreenshot(String stepName) {

    }
//    @Override
//    public void reportLogWithScreenshot(String stepName) {
//        try {
//            getTest().info( stepName,
//                    MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen.getScreenShotwithFullPage(getDriver())).build());
//        }catch (UnhandledAlertException alertExcpt) {
//            getTest().info(alertExcpt.toString());
//            alertExcpt.printStackTrace();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

   /* @Override
    public void reportLogWithFullPageScreenshot(String stepName) {

    }*/

    @Override
        public void reportLogPass(String stepName) {
        /**
         *  old method of reporterLogPass
         */
        // getTest().pass(stepName);
        try {
            getTest().pass( stepName,
                    MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen.getScreenShotwithFullPage(getDriver())).build());
        }catch (UnhandledAlertException alertExcpt) {
            getTest().info(alertExcpt.toString());
            alertExcpt.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }

        @Override
        public void reportLogPassWithScreenshot(String stepName) {
            getTest().pass(stepName,
                    MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen.getScreenShot(getDriver())).build());

        }
        @Override
        public void reportLogFail(String stepName) {
            /**getTest().fail(stepName);
            failFlags.replace(Thread.currentThread().getId(), true); OLDER METHOD*/
            /**
             * New Method for LOG FAIL WITH FULL Screen Shot
             */
            try {
                getTest().fail( stepName,
                        MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen.getScreenShotwithFullPage(getDriver())).build());
                        failFlags.replace(Thread.currentThread().getId(), true);
            }catch (UnhandledAlertException alertExcpt) {
                getTest().info(alertExcpt.toString());
                alertExcpt.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    @Override
    public void reportLogFail(Markup markup) {

    }

    @Override
    public void reportLogWarning(String warningMsg) {

    }

    /*@Override
    public void reportLogFail(Markup markup) {

    }*/

   /* @Override
    public void reportLogWarning(String warningMsg) {

    }*/

    @Override
        public void reportLogFailWithScreenshot(String stepName) {
            getTest().fail(stepName,
                    MediaEntityBuilder.createScreenCaptureFromPath(CaptureScreen.getScreenShot(getDriver())).build());
            failFlags.replace(Thread.currentThread().getId(), true);
        }

    @Override
    public void reportLogFailWithFullPageScreenshot(String stepName) {

    }
       /* @Override
        public void reportLogFailWithFullPageScreenshot(String stepName) {
            getTest().fail(stepName,
                MediaEntityBuilder.createScreenCaptureFromPath(ScreenCapture.getFullPageScreenshot(getDriver())).build());
        failFlags.replace(Thread.currentThread().getId(), true);
    }*/

        @Override
        public void softAssert(boolean condition, String passMsg, String failMsg) {
            if(condition) {
                reportLogPassWithScreenshot(passMsg);
            } else {
                reportLogFailWithScreenshot("Soft assert failed due to exception: - "+failMsg);
            }
        }

        @Override
        public void hardAssert(boolean condition, String passMsg, String failMsg) {
            if(condition) {
                reportLogPassWithScreenshot(passMsg);
            } else {
                throw new WebDriverException("Hard assert failed due to exception: -"+failMsg);
            }
        }

        @Override
        public void softAssert(String actual, String expected, String passMsg, String failMsg) {
            if (actual.replaceAll(" ", "").equalsIgnoreCase(expected.replaceAll(" ", ""))) {
                reportLogPass(passMsg);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                reportLogFail("Soft assert failed due to exception: - " + failMsg);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    @Override
    public void hardAssert(String actual, String expected, String passMsg, String failMsg) {

    }

    @Override
    public void hardAssert(String s, boolean b, String s1, String s2) {

    }

   /* @Override
    public void hardAssert(String actual, String expected, String passMsg, String failMsg) {

    }*/

    @Override
        public ExtentTest assignAuthor(String author) {
            ExtentTest test = getTest().assignAuthor(author);
            return test;
        }

        @Override
        public ExtentTest assignCategory(String category) {
            ExtentTest test = getTest().assignCategory(category);
            return test;
        }

        @Override
        public ExtentTest assignDevice(String device) {
            ExtentTest test = getTest().assignDevice(device);
            return test;
        }

        @Override
        public void reportLogJason(String jsonFilePath){
            String jsonCode = null;
            try {
                jsonCode = FileUtils.readFileToString(new File(jsonFilePath), StandardCharsets.UTF_8);
            } catch (IOException e) {
                System.out.println("Jason File doesn't exist.");
                e.printStackTrace();
            }
            getTest().info(MarkupHelper.createCodeBlock(jsonCode, CodeLanguage.JSON));
        }

        @Override
        public void reportLogXml(String xmlFilePath){
            String xmlCode = null;
            try {
                xmlCode = FileUtils.readFileToString(new File(xmlFilePath), StandardCharsets.UTF_8);
            } catch (IOException e) {
                System.out.println("XML File doesn't exist.");
                e.printStackTrace();
            }
            getTest().info(MarkupHelper.createCodeBlock(xmlCode, CodeLanguage.XML));
        }

        @Override
        public void reportLogTable(String[][] tableData){
            getTest().info(MarkupHelper.createTable(tableData));
        }

        /**
         * Returns the value of the flag set for indicating soft asserts
         * @return true or false
         * @author rajesh.varalli1
         */
        public static boolean getFailFlag() {
            return failFlags.get(Thread.currentThread().getId());
        }

        /**
         * This method returns the WebDriver instance from the ThreadLocal
         */
        private WebDriver getDriver(){
            return webDriverThreadLocal.get();
        }

    }
