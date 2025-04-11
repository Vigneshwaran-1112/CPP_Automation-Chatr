package com.rogers.test.listeners.report;

import com.google.common.collect.ListMultimap;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Locale;
import java.util.Properties;

public class SendMail {
    /**
     * This method will sent the email after the test execution suites completes
     * @param strMessageBody Email body content
     * @param strSuiteName Name of the TestNG Suite - ISuite.getName()
     * @param emailReceipient Email Receipients need to be passed for triggering report
     * @param testCaseName_StatusMap Executed Test case Name and Status Map
     * @param testDescriptionMap pass testDescription Map as parameter
     * @param testType Pass testType string as parameter
     */
    public  static void sendEmail(String strSuiteName, String emailReceipient, String strMessageBody, ListMultimap<String,String> testCaseName_StatusMap, ListMultimap<String,String> testDescriptionMap, String testType,ListMultimap<String,String> testGroupNameMap)  {
        String emailUser = System.getenv("EMAIL_USERNAME");
        String emailPass = System.getenv("EMAIL_PASSWORD");
        String browser="";
        Properties props = new Properties();

        if(!(emailUser == null || emailUser.isEmpty()) && !(emailPass == null || emailPass.isEmpty())){
            props.put("mail.smtp.user",emailUser);
            props.put("mail.smtp.host", "smtp.rci.rogers.com");
            props.put("mail.smtp.port","25");
        } else {
            props.put("mail.smtp.user","automation.service@rogersQeAutomation.ca");
            props.put("mail.smtp.host","10.18.97.209");
            props.put("mail.smtp.port","587");
        }
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable","false");
        props.put("mail.smtp.ssl.enable","false");
        props.put("mail.smtp.socketFactory.fallback","true");
        props.put("mail.smtp.socketFactory.port","587");

        try
        {
            Authenticator auth = new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    if(!(emailUser == null || emailUser.isEmpty()) && !(emailPass == null || emailPass.isEmpty())){
                        return new PasswordAuthentication(emailUser, emailPass);  //"sbgrpzghtinvrvdx"
                    }else{
                        return  new PasswordAuthentication("automation.service@RogersDigitalQaAutomation.ca","rogers123");
                    }
                }
            };
            if(System.getProperty("Browser").contains("sauce")){
                String browserName = System.getProperty("Browser").substring(5);
                String firstLetter = browserName.substring(0,1).toUpperCase();
                browser = firstLetter + browserName.substring(1);
            }
            else{
                browser = System.getProperty("Browser");
            }
            System.out.println("######## Try to authenticate email for user:" + System.getenv("EMAIL_USERNAME"));
            String msgBody = composeEmailBody(strMessageBody,testCaseName_StatusMap,testDescriptionMap,testType,testGroupNameMap,browser);
            MimeBodyPart mimeBodyPart=new MimeBodyPart();
            mimeBodyPart.setContent(msgBody,"text/html");
            MimeMultipart multipart=new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);
            Session session = Session.getInstance(props, auth);

            MimeMessage msg = new MimeMessage(session);
            msg.setContent(multipart);
            msg.setSubject("Automation Testing Result - " + System.getProperty("Environment") + " " + browser);
            msg.setFrom(new InternetAddress("automation.service@RogersQeAutomation.ca"));

            msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(emailReceipient));
            msg.setText(msgBody,"UTF-8","html");
            Transport.send(msg);
        }catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

    /**
     * This method will create the email body
     * @param strReportLinkAddress string containing the Extent report link
     * @param testCaseName_StatusMap Executed Test case Name and Status Map
     * @param testDescriptionMap pass testDescription Map as parameter
     * @param testType Pass testType string as parameter
     * @return string having the email body content
     */
    public static String composeEmailBody(String strReportLinkAddress, ListMultimap<String,String> testCaseName_StatusMap,ListMultimap<String,String> testDescriptionMap,String testType,ListMultimap<String,String> testGroupNameMap,String browser) {
        String body = "<i> Hi Team </i><br><br>";
        body += "<i> The Latest Test execution report link is below for the env: " + "<b>" +System.getProperty("Environment")+  "</b>" + "</i><br><br>";
        body += "<i> Browser Details: " +  "</i><br>";
        switch (browser.toLowerCase()){
            case "chrome":
                body += "<i> platformName: Windows 10 " +  "</i><br>";
                body += "<i> browserName: Chrome " +  "</i><br>";
                body += "<i> browserVersion: latest " +  "</i><br><br>";
                break;
            case "edge":
                body += "<i> platformName: Windows 10 " +  "</i><br>";
                body += "<i> browserName: Edge " +  "</i><br>";
                body += "<i> browserVersion: latest " +  "</i><br><br>";
                break;
            case "safari":
                body += "<i> platformName: macOS 11" +  "</i><br>";
                body += "<i> browserName: Safari " +  "</i><br>";
                body += "<i> browserVersion: latest " +  "</i><br><br>";
                break;
            case "firefox":
                body += "<i> platformName: Windows 10 " +  "</i><br>";
                body += "<i> browserName: Firefox " +  "</i><br>";
                body += "<i> browserVersion: latest" +  "</i><br><br>";
                break;
            case "androidchrome":
                body += "<i> platformName: Android " +  "</i><br>";
                body += "<i> platformVersion: 11.0 " +  "</i><br>";
                body += "<i> browserName: Chrome " +  "</i><br>";
                body += "<i> deviceName: Android GoogleAPI Emulator " +  "</i><br><br>";
                break;
            default:
                body += "<i> platformName: Windows 10 " +  "</i><br>";
                body += "<i> browserName: Chrome " +  "</i><br>";
                body += "<i> browserVersion: latest" +  "</i><br><br>";
                break;
        }
        if(testCaseName_StatusMap.containsValue("Fail")) {
            body += "<i> Failure is being analyzed & if needed, defect will be raised for the same.  </i><br><br>";
        }
        if (!strReportLinkAddress.isEmpty()) {
            body +=	 "<a href="+strReportLinkAddress+">Automation Report Link</a><br><br>";
        }
        body+=  TemplateReport.composeHTMLReport(testCaseName_StatusMap,strReportLinkAddress,testDescriptionMap,testType,testGroupNameMap);
        body += "<br><br><font color=black>Thank you</font>";
        body += "<br><br><font color=black>Automation Team</font>";
        return body;
    }

}
