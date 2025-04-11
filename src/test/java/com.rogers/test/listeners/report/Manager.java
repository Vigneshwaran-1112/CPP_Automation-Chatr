package com.rogers.test.listeners.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import utils.FormFiller;

import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Manager {
        private static ExtentReports extent;
        public static String pathToReport;
        public static String absolutePathToReport;
        public static String relativePathToReport;
        public static String localTime;
        public static String projectName;



        public synchronized static ExtentReports getReporter() throws IOException {
            /**
             * The if block will get executed if the test run is triggered from local machine or any machine
             * where BUILD_TIMESTAMP is not setup. BUILD_TIMESTAMP env variable is set by Jenkins job.
             */
            if(extent == null){
                if((System.getenv("BUILD_TIMESTAMP")==null||System.getenv("BUILD_TIMESTAMP").equals(""))) {
                    //Set HTML reporting file location
                    Calendar cal = Calendar.getInstance();
                    localTime = ZonedDateTime.now(ZoneId.of("America/Montreal")).format(DateTimeFormatter.ofPattern("KK-mm a")).replace(" ", "");
                    String workingDir = System.getProperty("user.dir");
                    workingDir = workingDir.replace("\\", "/");
                    String[] strTestApplication = workingDir.split("/");
                    projectName = strTestApplication[strTestApplication.length - 1];
                    relativePathToReport = projectName + "/" + cal.get(Calendar.YEAR) + "/" + (cal.get(Calendar.MONTH) + 1) + "/" + cal.get(Calendar.DATE) + "/" + localTime.replace(".", "").toUpperCase() + "/";
                    absolutePathToReport = workingDir + "/" + relativePathToReport;
                    pathToReport = absolutePathToReport + strTestApplication[strTestApplication.length - 1] + "Results_" + FormFiller.generatelocalDateTime() + ".html";
                }
                else {
                    String jobName = System.getenv("JOB_NAME");
                    String buildTimeStamp = System.getenv("BUILD_TIMESTAMP");
                    String testProfile = System.getenv("TestProfile");
                    relativePathToReport = jobName.replaceAll("\\s+", "").replace("digital-qe/","") + "/" +testProfile+"/"+ buildTimeStamp.replaceAll("\\s+", "")+"/";
                    String[] relativePath = relativePathToReport.split("/");
                    projectName = relativePath[1];
                    String currentWorkingDirectory = System.getProperty("user.dir");
                    absolutePathToReport = currentWorkingDirectory.replace("\\", "/") + "/report/" + relativePathToReport;
                    pathToReport = absolutePathToReport + "results.html";
                }
                ExtentSparkReporter reporter = new ExtentSparkReporter(pathToReport);
                reporter.config().setDocumentTitle("Automation Report");
//          reporter.loadXMLConfig(configFile);
                extent = new ExtentReports();
                extent.attachReporter(reporter);

            }
            return extent;
        }

    }
