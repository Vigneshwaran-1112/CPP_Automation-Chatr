package com.rogers.test.listeners.report;

import com.google.common.collect.ListMultimap;

import java.util.*;

public class TemplateReport {
        public static String body="";

        /**
         * This Class will Generate Mail Report Table Format
         * @param testCaseName_StatusMap pass testCaseName and Status Map as parameter
         * @param reportLink pass reportLink as parameter
         * @param testDescriptionMap pass testDescription Map as parameter
         * @param testType Pass testType string as parameter
         * @return This method will return String html report Mail Body Report Table Format
         */
        public static String composeHTMLReport (ListMultimap<String,String> testCaseName_StatusMap, String reportLink, ListMultimap<String,String> testDescriptionMap, String testType, ListMultimap<String,String> testGroupNameMap)
        {
            Iterator<Map.Entry<String, String>> itrTestCaseName = testCaseName_StatusMap.entries().iterator();
            ArrayList<String> testCaseStatus = new ArrayList<>(testCaseName_StatusMap.values());
            Iterator<Map.Entry<String, String>> itrTestDescName = testDescriptionMap.entries().iterator();
            List<String> testHeader = new ArrayList<>();

            body += "<TABLE BORDER=1 ID=AutomationTestingReportHeader CELLPADDING=3 CELLSPACING=1 WIDTH=100%>"+
                    "<TR>"+
                    "<TD ALIGN=CENTER BGCOLOR=#2288AA WIDTH=60%>"+
                    "<FONT FACE=VERDANA COLOR=WHITE SIZE=3><B>Automation Test Result Summary</B></FONT>"+
                    "</TD>"+
                    "</TR>"+
                    "</TABLE>"+
                    "<TABLE BORDER=1 ID=TotalTestScenariosSummary CELLPADDING=3 CELLSPACING=1 WIDTH=100%>"+
                    "<TR>"+
                    "<TD ALIGN=RIGHT BGCOLOR=#E5E7E9 WIDTH=20%>"+
                    "<FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Total Test Modules</B></FONT>"+
                    "</TD>"+
                    "<TD ALIGN=CENTER WIDTH=5%>"+
                    "<FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>"+testGroupNameMap.values().stream().distinct().count()+"</B></FONT>"+
                    "</TD>"+
                    "<TD ALIGN=RIGHT BGCOLOR=#E5E7E9 WIDTH=20%>"+
                    "<FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Total Test Scenarios</B></FONT>"+
                    "</TD>"+
                    "<TD ALIGN=CENTER WIDTH=5%>"+
                    "<FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>"+testCaseName_StatusMap.size()+"</B></FONT>"+
                    "</TD>"+
                    "<TD ALIGN=RIGHT BGCOLOR=#E5E7E9 WIDTH=20%>"+
                    "<FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Total Passed</B></FONT>"+
                    "</TD>"+
                    "<TD ALIGN=CENTER BGCOLOR=GREEN WIDTH=5%>"+
                    "<FONT FACE=VERDANA COLOR=WHITE SIZE=2><B>"+ Collections.frequency(testCaseStatus,"Pass")+"</B></FONT>"+
                    "</TD>"+
                    "<TD ALIGN=RIGHT BGCOLOR=#E5E7E9 WIDTH=20%>"+
                    "<FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Total Failed</B></FONT>"+
                    "</TD>"+
                    "<TD ALIGN=CENTER BGCOLOR=RED WIDTH=5%>"+
                    "<FONT FACE=VERDANA COLOR=WHITE SIZE=2><B>"+Collections.frequency(testCaseStatus, "Fail")+"</B></FONT>"+
                    "</TD>"+
                    "</TR></TABLE>"+
                    "<TABLE BORDER=1 ID=IndividualTestScenarios CELLPADDING=3 CELLSPACING=1 WIDTH=100%>"+
                    "<TR>"+
                    "<TD ALIGN=CENTER BGCOLOR=#28A3CC WIDTH=20%>"+
                    "<FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Test Module</B></FONT>"+
                    "</TD>"+
                    "<TD ALIGN=CENTER BGCOLOR=#28A3CC WIDTH=60%>"+
                    "<FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>TestCase Name</B></FONT>"+
                    "</TD>"+
                    "<TD ALIGN=CENTER BGCOLOR=#28A3CC WIDTH=20%>"+
                    "<FONT FACE=VERDANA COLOR=BLACK SIZE=2><B> Status </B></FONT>"+
                    "</TD></TR></TABLE>";
            if(testType!=null) {
                if (testType.toUpperCase().contains("DATA")) {
                    while (itrTestDescName.hasNext()) {
                        Map.Entry<String, String> strTestDescriptionDetails = itrTestDescName.next();
                        if (!testHeader.contains(strTestDescriptionDetails.getKey())) {
                            testHeader.add(strTestDescriptionDetails.getKey());
                            body += "<TABLE BORDER=1 ID=IterationTestHeader CELLPADDING=2 CELLSPACING=1 WIDTH=100%>" +
                                    "<TR>" +
                                    "<TD ALIGN=LEFT BGCOLOR=#83d1ed WIDTH=100%>" +
                                    "<FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>" + strTestDescriptionDetails.getKey() + "</B></FONT>" +
                                    "</TD>" +
                                    "</TR>" +
                                    "</TABLE>";
                            testDescriptionMap.get(strTestDescriptionDetails.getKey()).stream().forEach(
                                    testName -> {
                                        body += "<TABLE BORDER=1 CELLPADDING=3 CELLSPACING=1 style='table-layout: fixed; width: 100%'>" +
                                                "<TR><TD ALIGN=LEFT WIDTH=80% style='word-wrap:break-word;'>" +
                                                "<p style='word-break:break-all;padding: 0px; margin: 0px;'>" +
                                                "<FONT FACE=VERDANA COLOR=BLACK SIZE=2 BGCOLOR=#99D6EA>" + testName + "</p></FONT>" +
                                                "</TD>" +
                                                "<TD ALIGN=CENTER WIDTH=20%>";
                                        if (testCaseName_StatusMap.get(testName).toString().toUpperCase().contains("PASS")) {
                                            if (reportLink.isEmpty()) {
                                                body += "<FONT FACE=VERDANA COLOR=GREEN SIZE=2 BGCOLOR=#99D6EA><B>" + "Pass" + "";
                                            } else {
                                                body += "<FONT FACE=VERDANA COLOR=GREEN SIZE=2 BGCOLOR=#99D6EA><B>" +
                                                        "<a href=" + reportLink + " " +
                                                        "style=Color:GREEN;font-weight:bold>" +
                                                        "Pass" + "</a>";
                                            }
                                        } else {
                                            if (reportLink.isEmpty()) {
                                                body += "<FONT FACE=VERDANA COLOR=RED SIZE=2 BGCOLOR=#99D6EA><B>" +
                                                        testCaseName_StatusMap.get(testName).toString().replaceAll("[\\[\\]]", "") + "";
                                            } else {
                                                body += "<FONT FACE=VERDANA COLOR=RED SIZE=2 BGCOLOR=#99D6EA><B>" +
                                                        "<a href=" + reportLink + " " +
                                                        "style=Color:#dc3545;font-weight:bold>" + testCaseName_StatusMap.get(testName).toString().replaceAll("[\\[\\]]", "") + "</a>";
                                            }
                                        }
                                        body += "</B></FONT></TD></TR></TABLE>";
                                    }
                            );
                        }
                    }
                    return body;
                }
            }
            else {
                while (itrTestCaseName.hasNext()) {
                    Map.Entry<String, String> strTestCasedetails = itrTestCaseName.next();
                    body += "<TABLE BORDER=1 CELLPADDING=3 CELLSPACING=1 style='table-layout: fixed; width: 100%'>" +
                            "<TR>" +
                            "<TD ALIGN=LEFT WIDTH=20% style='word-wrap:break-word;'>" +
                            "<p style='word-break:break-all;padding: 0px; margin: 0px;'>" +
                            "<FONT FACE=VERDANA COLOR=BLACK SIZE=2 BGCOLOR=#99D6EA>" + testGroupNameMap.get(strTestCasedetails.getKey())+ "</p></FONT>" +
                            "</TD>" +
                            "<TD ALIGN=LEFT WIDTH=60% style='word-wrap:break-word;'>" +
                            "<p style='word-break:break-all;padding: 0px; margin: 0px;'>" +
                            "<FONT FACE=VERDANA COLOR=BLACK SIZE=2 BGCOLOR=#99D6EA>" + strTestCasedetails.getKey() + "</p></FONT>" +
                            "</TD>" +
                            "<TD ALIGN=CENTER WIDTH=20%>";
                    if (strTestCasedetails.getValue().equalsIgnoreCase("PASS")) {
                        if (reportLink.isEmpty()) {
                            body += "<FONT FACE=VERDANA COLOR=GREEN SIZE=2 BGCOLOR=#99D6EA><B>" + strTestCasedetails.getValue() + "";
                        } else {
                            body += "<FONT FACE=VERDANA COLOR=GREEN SIZE=2 BGCOLOR=#99D6EA><B>" +
                                    "<a href=" + reportLink + " " +
                                    "style=Color:GREEN;font-weight:bold>" +
                                    strTestCasedetails.getValue() + "</a>";
                        }
                    } else {
                        if (reportLink.isEmpty()) {
                            body += "<FONT FACE=VERDANA COLOR=RED SIZE=2 BGCOLOR=#99D6EA><B>" + strTestCasedetails.getValue() + "";
                        } else {
                            body += "<FONT FACE=VERDANA COLOR=RED SIZE=2 BGCOLOR=#99D6EA><B>" +
                                    "<a href=" + reportLink + " " +
                                    "style=Color:#dc3545;font-weight:bold>" +
                                    strTestCasedetails.getValue() + "</a>";
                        }
                    }
                    body += "</B></FONT></TD></TR></TABLE>";
                }
            }
            return body;
        }
    }
