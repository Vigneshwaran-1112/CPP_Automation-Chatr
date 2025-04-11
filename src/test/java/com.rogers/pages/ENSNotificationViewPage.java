package com.rogers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


public class ENSNotificationViewPage extends BasePage {

    public ENSNotificationViewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//a[contains(text(),\"Notification Viewer\")]")
    WebElement menuNotificationViewer;

    @FindBy (xpath = "//input[@id='accountID']")
    WebElement txtAccountId;

    @FindBy (xpath = "//input[@value='Search Notificatons']")
    WebElement btnSearchNotification;

    //@FindBy(xpath = "//td[contains(text(),' Verification code: ')]//following::td[1]")
    //WebElement notificationText;

    @FindBy (xpath = "//div[@class='bd']/table/tbody/tr/td")
    WebElement notificationText;

    @FindBy (xpath = "//button[contains(text(),'OK')]")
    WebElement btnOk;

    @FindBy(id="contactEmail")
    WebElement txtContactEmail;

    @FindBy (xpath = "//img[@alt='Set password']")
    WebElement btnSetPasswordInEmail;

    @FindBy(xpath = "//table[2]/tbody/tr[2]/td")
    // @FindBy(xpath = "//td[text()=' Verification code: ' or contains(text(),'Code de v')]/parent::tr/following-sibling::tr/td")
    WebElement lblYourVerificationCode;

    /**
     * Click on menu Notification Viewer
     */
    public void clkMenuNotifViewer() {
        System.out.println("commenting notification viewer click");
       // getReusableActions().clickWhenVisible(menuNotificationViewer,20);
    }

    /**
     * Set account ID for notification
     * @param strAccountId, string of account ID
     */
    public void setAccountId(String strAccountId) {
        getReusableActions().getWhenReady(txtAccountId).clear();
        getReusableActions().getWhenReady(txtAccountId).sendKeys(strAccountId);
    }

    /**
     * Click the button "Search Notification" in ENS page
     */
    public void clkBtnSearchNotification() {
        getReusableActions().staticWait(5000);
        getReusableActions().clickWhenVisible(btnSearchNotification);
        btnSearchNotification.click();
    }
    /**
     * To verify in email by clicking the html file image by locating the first(latest) record by account ID.
     * @param strAccountId, string of account email
     */
    public void clkLnkHtmlForEmailVerify(String strAccountId) {
        getReusableActions().staticWait(3000);
        getDriver().findElement(By.xpath("//input[@id='contactEmail']")).click();
        getDriver().findElement(By.xpath("//input[@id='contactEmail']")).sendKeys(strAccountId);
        getDriver().findElement(By.xpath("//input[@id='searchNotificationInViewer']")).click();
        getReusableActions().waitForAllElementsVisible(getDriver().findElements(By.xpath("//td[contains(text(),'" + strAccountId + "')]")), 30);
        List<WebElement> lnkHtml = getDriver().findElements(By.xpath("//td[contains(text(),'" + strAccountId + "')]//following-sibling::td/a[@class='img_html_png']"));
        getReusableActions().getWhenReady(lnkHtml.get(0), 30).click();
        getReusableActions().waitForNumberOfWindowsToBe(3, 20);
    }

    /**
     * To get verify code in SMS by clicking the pdf file image by locating the first(latest) record by phone number.
     * @param strPhoneNum, string of phone number
     */
    public void clkLnkPdfForSmsVerify(String strPhoneNum) {
        //getDriver().findElement(By.xpath("//input[@id='contactPhone']")).sendKeys(strPhoneNum);
        //getDriver().findElement(By.xpath("//input[@id='searchNotificationInViewer']")).click();
        getReusableActions().waitForAllElementsVisible(getDriver().findElements(By.xpath("//td[contains(text(),'" + strPhoneNum + "')]//following-sibling::td/a[@class='img_pdf_png']")), 30);
        List<WebElement> lnkHtml = getDriver().findElements(By.xpath("//td[contains(text(),'" + strPhoneNum + "')]//following-sibling::td/a[@class='img_pdf_png']"));
        getReusableActions().getWhenVisible(lnkHtml.get(0)).click();
    }

    /**
     * To get the notification code from the last 6 digital string.
     * @return verification code, string
     */
    public String getNotificationCode() {
        getReusableActions().staticWait(5000);
        String strNotification = notificationText.getText();
        String strCode = strNotification.substring(strNotification.length()-6);
        System.out.println("++++++++++++" + strNotification + "******************");
        return strCode;
    }

    public String getVerificationCode() {
        getReusableActions().isElementVisible(lblYourVerificationCode,10);
        String strMsg = lblYourVerificationCode.getText();
        System.out.println("++++++++++++" + strMsg + "******************");
        return strMsg.trim();
    }

    /**
     * To get the notification email from t
     * @return login username, string
     */
    public String getUserName() {
        getReusableActions().staticWait(5000);
        String strNotification = notificationText.getText();
        String struserName = strNotification.split(": ")[1].trim();
        return struserName;
    }

    /**
     * To click the OK button in the pdf pop up.
     */
    public void clkBtnOk() {
        getReusableActions().clickWhenVisible(btnOk, 10);
    }

    /**
     * Sets the email id
     * @param strEmail, email string.
     */
    public void setEmailId(String strEmail) {
        getReusableActions().getWhenReady(txtContactEmail).sendKeys(strEmail);
    }

    /**
     * Switch to specific tab
     * @param intTabIndex the index of the tab
     */
    public void switchToNewTab(int intTabIndex) {
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(intTabIndex));
    }

    /**
     * To click set password button in email details page
     */
    public void clkBtnSetPasswordInEmail() {
        getReusableActions().clickWhenReady(btnSetPasswordInEmail, 30);
    }

    /**
     * Close the ENS Window
     */
    public void closeEnsWindow() {
        getReusableActions().closeCurrentWindow();
    }



}