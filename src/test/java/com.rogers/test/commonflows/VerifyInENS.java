
package com.rogers.test.commonflows;

import com.rogers.data.handlers.TestDataHandler;

import com.rogers.pages.BasePage;
import com.rogers.test.base.BaseTest;
import org.apache.http.client.ClientProtocolException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VerifyInENS extends BasePage {
    @FindBy(xpath = "//input[@value='Search Notificatons']")
    WebElement btnSearchNotification;
    @FindBy(xpath = "//table[2]/tbody/tr[2]/td")
    // @FindBy(xpath = "//td[text()=' Verification code: ' or contains(text(),'Code de v')]/parent::tr/following-sibling::tr/td")
    WebElement lblYourVerificationCode;
    public VerifyInENS(WebDriver driver ) {
        super(driver);
    }

    /**
     * To launch the ENS URL, it will be different for different QA environment.
     */
    private void startVerify() {

        BaseTest.getENSHomePage().openNewTabForEns(TestDataHandler.landingPageData.getEnsLandingPage());
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Ens Window");
    }

    /**
     * To login to ENS using operator name and password.
     */
    private void loginToEns() {
        // BaseTest.getENSHomePage().setEmail(System.getenv("ENS_USERNAME"));
        BaseTest.getENSHomePage().setEmail(System.getProperty("EmailId"));
        reporter.reportLogWithScreenshot("Set ENS Login details");
        BaseTest.getENSHomePage().clkBtnNext();
        //Password not needed
        getReusableActions().staticWait(5000);
        if(System.getProperty("Browser").equals("saucesafari")){
            BaseTest.getENSHomePage().setPassword(System.getenv("ENS_PASSWORD"));
            BaseTest.getENSHomePage().clkBtnSignIn();
        }
    }

    /**
     * To get the verify code in pdf file from ENS and close ENS window.
     * @param strPhoneNum, the recovery phone number
     * @return String, the verification code.
     * @throws ClientProtocolException
     * @throws IOException
     */
    public String getVerifyCode(String strPhoneNum){

        this.startVerify();
        this.loginToEns();

        //BaseTest.getENSNotificationViewPage().clkMenuNotifViewer();
        BaseTest.getENSNotificationViewPage().clkBtnSearchNotification();
        BaseTest.getENSNotificationViewPage().clkLnkPdfForSmsVerify(strPhoneNum);
        String strVerifyCode = BaseTest.getENSNotificationViewPage().getNotificationCode();
        reporter.reportLogWithScreenshot("Got notification code: " + strVerifyCode);
        BaseTest.getENSNotificationViewPage().clkBtnOk();
        BaseTest.getENSNotificationViewPage().closeEnsWindow();
        return strVerifyCode;
    }

    /**
     * To get the email notification by clicking the html link in ENS, and switch to the new openned tab.
     * @param strAccountId
     * @throws ClientProtocolException
     * @throws IOException
     * @author ning.xue
     */
    public void getEmailVerifyPage(String strAccountId){
        this.startVerify();
        this.loginToEns();
        //BaseTest.getENSNotificationViewPage().clkMenuNotifViewer();
        getReusableActions().staticWait(3000);
        BaseTest.getENSNotificationViewPage().clkBtnSearchNotification();
        BaseTest.getENSNotificationViewPage().clkLnkHtmlForEmailVerify(strAccountId);
        BaseTest.getENSNotificationViewPage().switchToNewTab(2);
    }

    /**
     * To get verify code in html from ENS and close ENS window.
     * @return String, the verification code.
     */
    public String getEmailVerifyCode(){
        String strVerifyCode = BaseTest.getENSNotificationViewPage().getVerificationCode();
        //reporter.reportLogWithScreenshot("Got notification code: " + strVerifyCode);
        BaseTest.getENSNotificationViewPage().closeEnsWindow();
        return strVerifyCode;
    }

    /**
     * To get the user name sent to the recovery number in pdf file from ENS and close ENS window.
     * @param strPhoneNum, String, recovery number.
     * @return String, the verification code
     */
    public String getAccountUserName(String strPhoneNum) {
        this.startVerify();
        this.loginToEns();

        BaseTest.getENSNotificationViewPage().clkMenuNotifViewer();
        BaseTest.getENSNotificationViewPage().clkBtnSearchNotification();
        BaseTest.getENSNotificationViewPage().clkLnkPdfForSmsVerify(strPhoneNum);
        String strVerifyCode = BaseTest.getENSNotificationViewPage().getUserName();
        reporter.reportLogWithScreenshot("Got message notification code.");
        BaseTest.getENSNotificationViewPage().clkBtnOk();
        BaseTest.getENSNotificationViewPage().closeEnsWindow();
        return strVerifyCode;
    }

}
