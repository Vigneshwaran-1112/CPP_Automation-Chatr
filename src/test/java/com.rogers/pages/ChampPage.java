package com.rogers.pages;

import com.rogers.data.handlers.TestDataHandler;
import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import utils.ReusableActions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.rogers.test.base.BaseTest.getCarePortalDashBoard;

public class ChampPage extends BasePage {

    @FindBy(xpath = "//input[@name='loginfmt']")
    WebElement usernameInput;
    @FindBy(xpath = "//input[@value='Next']")
    WebElement nextButton;
    @FindBy(xpath = "//input[@name='passwd']")
    WebElement passwordInput;
    @FindAll({@FindBy(xpath = "//button[@id='idSIButton9']"),@FindBy(xpath = "//input[@value='Sign in']")})
    WebElement submitButton;
    @FindAll({@FindBy(xpath = "//button[@id='declineButton']"),@FindBy(xpath = "//*[@id=\"idBtn_Back\"]")}) //button[@id='declineButton'] OR //*[@id="idBtn_Back"]
    WebElement noButton;
    @FindBy(xpath = "//input[@type='password']") //*[@id=\"ds-form-input-id-0\"]")
    List<WebElement> dealerCodeInput;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton1;
    @FindBy(xpath = "//div/div/div/div[2]/div/raap-tile/ds-tile/div/div/div/div[2]") ////span[normalize-space()='Chatr-Auto2']
    WebElement chatrButton;
    @FindBy(xpath = "//a[contains(text(),'Welcome')]")
    WebElement welcomeElement;
    @FindBy(xpath = "//span[contains(text(),'Logout')]")
    WebElement logoutButton;
    @FindBy(xpath = "//span/ds-radio-button/label/div[1]/div")
    WebElement radioButton;
    @FindBy(xpath = "//span[contains(text(),'OK')]")
    WebElement okButton;
    @FindBy(xpath = "//button/span/span[contains(text(),' Accept / Accepter ')]")
    WebElement warningAcceptButton;

    @FindBy(xpath = "//div[contains(@id,'usernameError')]")
    WebElement userNameError;
    @FindBy(xpath = "//div[contains(@id,'i0118Error')]")
    WebElement passwordError;
    @FindBy(xpath = "//ds-radio-button[1]")
    WebElement champRadioButton;
    @FindBy(xpath = "//span[contains(text(),'OK')]")
    WebElement champOkButton;
    @FindBy(xpath = "//html[1]/body[1]/div[5]/table[2]/tbody[1]/tr[2]/td[1]/a[1]")
    WebElement latestNotificationID;
    @FindBy(xpath = "/html[1]/body[1]/div[10]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[6]")
    WebElement latestNotificationStatus;
    @FindBy(xpath = "//input[@id='topSearchInput']")
    WebElement outlookTopSearch;
    @FindBy(xpath = "//h2[normalize-space()='Order summary']")
    WebElement outlookOrderSumm;
    @FindBy(xpath = "//span[contains(text(),'chatr Mobile')]")
    List <WebElement> nacSubject;
    @FindBy(xpath = "//tbody[1]/tr[13]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/p[1]")
    WebElement outlookOrderIdNAC;
    @FindBy(xpath = "//tbody[1]/tr[12]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/p[1]")
    WebElement outlookOrderIdPPC;
    @FindBy(xpath = "//tbody[1]/tr[10]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/p[1]")
    WebElement outlookOrderIdAPU;
    @FindBy(xpath = "//tbody[1]/tr[13]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/p[1]")
    WebElement outlookOrderIdAPE;
    @FindBy(xpath = "//h2[normalize-space()='Auto-pay']")
    WebElement outlookAutopay;
    @FindBy(xpath = "//table[1]/tbody[1]/tr[9]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/p[1]")
    WebElement outlookAutopayStatus;
    @FindBy(xpath = "(//div[contains(text(),'TC')])[1]")
    WebElement profile;
    @FindBy(xpath = "(//div[contains(text(),'Sign in with a different account')])[1]")
    WebElement profileSignout;
    @FindBy(xpath = "(//div[contains(text(),'Use another account')])[1]")
    WebElement useanotherAcc;

    public ChampPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToCarePortal() {
        String username = TestDataHandler.retailData.getRetailData().get(2).get("username");
        String password = TestDataHandler.retailData.getRetailData().get(2).get("password");
        String dealerCode = TestDataHandler.retailData.getRetailData().get(2).get("dealerCode");

        getDriver().get(TestDataHandler.landingPageData.getChampLandingPage());
        getReusableActions().isElementVisible(usernameInput);
        usernameInput.sendKeys(username);
        nextButton.click();
        getReusableActions().isElementVisible(passwordInput, 10);
        passwordInput.sendKeys(password);
        submitButton.click();
        getReusableActions().isElementVisible(noButton);
        noButton.click();
        if (getReusableActions().isElementVisible(warningAcceptButton, 5)) {
            warningAcceptButton.click();
        }
        if (dealerCodeInput.size() > 0) {
            dealerCodeInput.get(0).click();
            dealerCodeInput.get(0).sendKeys(dealerCode);
            reporterSnapshot(chatrButton, "Care Portal", "", "NULL");
            getReusableActions().clickWhenReady(submitButton1, 10);
        } else {
            reporterSnapshot(chatrButton, "Care Portal", "", "NULL");
            champRadioButton.click();
            champOkButton.click();
        }
        selectEnvButton();
    }

    public void navigateToRetailerPage() {
        String username = TestDataHandler.retailData.getRetailData().get(0).get("username");
        String password = TestDataHandler.retailData.getRetailData().get(0).get("password");
        String dealerCode = TestDataHandler.retailData.getRetailData().get(0).get("dealerCode");

        getDriver().get(TestDataHandler.landingPageData.getChampLandingPage());
        getReusableActions().isElementVisible(usernameInput);
        usernameInput.sendKeys(username);
        nextButton.click();
        getReusableActions().isElementVisible(passwordInput, 10);
        passwordInput.sendKeys(password);
        submitButton.click();
        getReusableActions().isElementVisible(noButton);
        noButton.click();
        if (getReusableActions().isElementVisible(warningAcceptButton, 3)) {
            warningAcceptButton.click();
        }
        if (dealerCodeInput.size() > 0) {
            dealerCodeInput.get(0).click();
            dealerCodeInput.get(0).sendKeys(dealerCode);
            reporterSnapshot(chatrButton, "Retail Page", "", "NULL");
            getReusableActions().clickWhenReady(submitButton1, 10);
        } else {
            reporterSnapshot(chatrButton, "Retail Page", "", "NULL");
            champRadioButton.click();
            champOkButton.click();
        }
        selectEnvButton();
    }

    public void navigateToRetailerPageWithInvalidCredential(String username) {
        getDriver().get(TestDataHandler.landingPageData.getChampLandingPage());
        getReusableActions().isElementVisible(usernameInput);
        usernameInput.sendKeys(username.replace("retail", "Automation123"));
        nextButton.click();
        //reporter.softAssert(userNameError.getText().equals("We couldn't find an account with that username."),userNameError.getText(),"error not display");
        reporterSnapshot(userNameError, "t find an account with that username.", "", "Common");
        usernameInput.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        usernameInput.sendKeys(username);
        nextButton.click();
        getReusableActions().isElementVisible(passwordInput, 10);
        passwordInput.sendKeys("Automation");
        submitButton.click();
        //reporter.softAssert(passwordError.getText().equals("Your account or password is incorrect. If you don't remember your password, reset it now."),passwordError.getText(),"error not display");
        reporterSnapshot(passwordError, "Your account or password is incorrect", "", "Common");
    }

    public void navigateToRetailerCorporatePage() {
        String username = TestDataHandler.retailData.getRetailData().get(1).get("username");
        String password = TestDataHandler.retailData.getRetailData().get(1).get("password");
        String dealerCode = TestDataHandler.retailData.getRetailData().get(1).get("dealerCode");
        getDriver().get(TestDataHandler.landingPageData.getChampLandingPage());
        getReusableActions().isElementVisible(usernameInput);
        usernameInput.sendKeys(username);
        nextButton.click();
        getReusableActions().isElementVisible(passwordInput, 10);
        passwordInput.sendKeys(password);
        submitButton.click();
        getReusableActions().isElementVisible(noButton);
        noButton.click();
        if (getReusableActions().isElementVisible(warningAcceptButton, 3)) {
            warningAcceptButton.click();
        }
        getReusableActions().staticWait(1000);

        if (dealerCodeInput.size() > 0) {
            dealerCodeInput.get(0).click();
            dealerCodeInput.get(0).sendKeys(dealerCode);
            reporterSnapshot(chatrButton, "Retail Corporate Page", "", "NULL");
            getReusableActions().clickWhenReady(submitButton1, 10);
        } else {
            reporterSnapshot(chatrButton, "Retail Corporate Page", "", "NULL");
            champRadioButton.click();
            champOkButton.click();
        }
        selectEnvButton();
    }

    public void navigateToKioskPortal() {
        String username = TestDataHandler.retailData.getRetailData().get(3).get("username");
        String password = TestDataHandler.retailData.getRetailData().get(3).get("password");
        String dealerCode = TestDataHandler.retailData.getRetailData().get(3).get("dealerCode");

        getDriver().get(TestDataHandler.landingPageData.getChampLandingPage());
        getReusableActions().isElementVisible(usernameInput);
        usernameInput.sendKeys(username);
        nextButton.click();
        getReusableActions().isElementVisible(passwordInput, 10);
        passwordInput.sendKeys(password);
        submitButton.click();
        getReusableActions().isElementVisible(noButton);
        noButton.click();
        if (getReusableActions().isElementVisible(warningAcceptButton, 5)) {
            warningAcceptButton.click();
        }
        if (dealerCodeInput.size() > 0) {
            dealerCodeInput.get(0).click();
            dealerCodeInput.get(0).sendKeys(dealerCode);
            reporterSnapshot(chatrButton, "Kisok Agent Portal", "", "NULL");
            getReusableActions().clickWhenReady(submitButton1, 10);
        } else {
            reporterSnapshot(chatrButton, "Kisok Agent Portal", "", "NULL");
            champRadioButton.click();
            champOkButton.click();
        }
        selectEnvButton();
    }

    public void navigateCareBotPortal() {
        String username = TestDataHandler.retailData.getRetailData().get(4).get("username");
        String password = TestDataHandler.retailData.getRetailData().get(4).get("password");
        String dealerCode = TestDataHandler.retailData.getRetailData().get(4).get("dealerCode");

        getDriver().get(TestDataHandler.landingPageData.getChampLandingPage());
        getReusableActions().isElementVisible(usernameInput);
        usernameInput.sendKeys(username);
        nextButton.click();
        getReusableActions().isElementVisible(passwordInput, 10);
        passwordInput.sendKeys(password);
        submitButton.click();
        getReusableActions().isElementVisible(noButton);
        noButton.click();
        if (getReusableActions().isElementVisible(warningAcceptButton, 5)) {
            warningAcceptButton.click();
        }
        if (dealerCodeInput.size() > 0) {
            dealerCodeInput.get(0).click();
            dealerCodeInput.get(0).sendKeys(dealerCode);
            reporterSnapshot(chatrButton, "Care Bot Portal", "", "NULL");
            getReusableActions().clickWhenReady(submitButton1, 10);
        } else {
            reporterSnapshot(chatrButton, "Care Bot Portal", "", "NULL");
            champRadioButton.click();
            champOkButton.click();
        }
        selectEnvButton();
//        String parentWindow = getDriver().getWindowHandle();
////        getDriver().findElement(By.xpath("//span[contains(normalize-space(),'Chatr Care-Auto CARE')]")).click();
//        getDriver().findElement(By.xpath("(//span[contains(normalize-space(),'Chatr Care')])[3]")).click();
//        getReusableActions().switchToNewWindow(parentWindow);
//        getReusableActions().waitForPageLoad();
    }
    public void selectEnvButton(){
        getReusableActions().staticWait(2000);
        String parentWindow = getDriver().getWindowHandle();
        String envValue ="";
        if (System.getProperty("Environment").equals("qa4")){
            envValue = "//span[contains(normalize-space(),'Chatr-QA4')]";}
        else if (System.getProperty("Environment").equals("qaAuto")) {
            //envValue = "(//span[contains(normalize-space(),'Chatr Care-Auto CARE')])[1]";
            //envValue = "(//span[contains(normalize-space(),'CHATR Golden-Auto')])[1]";
            envValue = "(//span[contains(normalize-space(),'CHATR-Auto')])[2]";
            //envValue = "(//span[contains(normalize-space(),'Chatr')])[5]";
             }
        else if (System.getProperty("Environment").equals("qa7")) {
            envValue = "//span[contains(text(),'QA7')]";}
        else if (System.getProperty("Environment").equals("qaAuto2")) {
            envValue = "(//span[contains(normalize-space(),'CHATR-Auto2')])[1]";}
        getDriver().findElement(By.xpath(envValue)).click();
        getReusableActions().switchToNewWindow(parentWindow);
        getReusableActions().waitForPageLoad();
    }
    public void navigateToLarAgentPortal() {
        String username = TestDataHandler.retailData.getRetailData().get(5).get("username");
        String password = TestDataHandler.retailData.getRetailData().get(5).get("password");
        String dealerCode = TestDataHandler.retailData.getRetailData().get(5).get("dealerCode");

        getDriver().get(TestDataHandler.landingPageData.getChampLandingPage());
        getReusableActions().isElementVisible(usernameInput);
        usernameInput.sendKeys(username);
        nextButton.click();
        getReusableActions().isElementVisible(passwordInput, 10);
        passwordInput.sendKeys(password);
        submitButton.click();
        getReusableActions().isElementVisible(noButton);
        noButton.click();
        if (getReusableActions().isElementVisible(warningAcceptButton, 5)) {
            warningAcceptButton.click();
        }
        if (dealerCodeInput.size() > 0) {
            dealerCodeInput.get(0).click();
            dealerCodeInput.get(0).sendKeys(dealerCode);
            reporterSnapshot(chatrButton, "Lar Agent Portal", "", "NULL");
            getReusableActions().clickWhenReady(submitButton1, 10);
        } else {
            reporterSnapshot(chatrButton, "Lar Agent Portal", "", "NULL");
            champRadioButton.click();
            champOkButton.click();
        }
        selectEnvButton();
    }
    public void openNewTabInSameWindowForCare() {
        String username = TestDataHandler.retailData.getRetailData().get(2).get("username");
        String password = TestDataHandler.retailData.getRetailData().get(2).get("password");
        String dealerCode = TestDataHandler.retailData.getRetailData().get(2).get("dealerCode");

        JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        String openNewWindow = "window.open('https://qa01-unilogin.rogers.com/')";
        executor.executeScript(openNewWindow);
        ENSHomePage.getReusableActionsInstance().waitForNumberOfWindowsToBe(2, 10);
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
        getReusableActions().isElementVisible(usernameInput);
        usernameInput.sendKeys(username);
        nextButton.click();
        getReusableActions().isElementVisible(passwordInput, 10);
        passwordInput.sendKeys(password);
        submitButton.click();
        getReusableActions().isElementVisible(noButton);
        noButton.click();
        if (getReusableActions().isElementVisible(warningAcceptButton, 5)) {
            warningAcceptButton.click();
        }
        if (dealerCodeInput.size() > 0) {
            dealerCodeInput.get(0).click();
            dealerCodeInput.get(0).sendKeys(dealerCode);
            reporterSnapshot(chatrButton, "Care  Portal", "", "NULL");
            getReusableActions().clickWhenReady(submitButton1, 10);
        } else {
            reporterSnapshot(chatrButton, "Care Portal", "", "NULL");
            champRadioButton.click();
            champOkButton.click();
        }
        selectEnvButton();
    }
    public void openNewTabInSameWindowForENSPortal(String email,String ctn,String envENS) throws InterruptedException, IOException {
        JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        String openNewWindow = "window.open('https://ensqa"+envENS+".rogers.com/ENS/notificationsViewer.action')";
        executor.executeScript(openNewWindow);
        ENSHomePage.getReusableActionsInstance().waitForNumberOfWindowsToBe(2, 10);
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        // Replace 'your-email@example.com' and 'your-password' with your Outlook credentials
        getDriver().findElement(By.xpath("//input[@name='loginfmt']")).click();
        getDriver().findElement(By.xpath("//input[@name='loginfmt']")).sendKeys("");
        getDriver().findElement(By.id("idSIButton9")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.name("passwd")).click();
        getDriver().findElement(By.name("passwd")).sendKeys("");
        getDriver().findElement(By.id("idSIButton9")).click();
        Thread.sleep(1000);
        getDriver().findElement(By.id("idSIButton9")).click();
        Thread.sleep(3000);
        getDriver().findElement(By.id("contactEmail")).click();
        getDriver().findElement(By.id("contactEmail")).sendKeys(email);
        Thread.sleep(1000);
        getDriver().findElement(By.id("dateOfLast90")).click();
        Thread.sleep(2000);
        getDriver().findElement(By.id("searchNotificationInViewer")).click();
        Thread.sleep(3000);
        reporterSnapshot(latestNotificationID,"Notifiaction ID","","NULL");
        latestNotificationID.click();
        Thread.sleep(3000);
        reporterSnapshot(latestNotificationStatus,"Complete - Success","","COMMON");




//        getDriver().findElement(By.xpath("//html[1]/body[1]/div[5]/table[2]/tbody[1]/tr[2]/td[12]/a[1]")).click();// PDF BUTTON CLICK
//        Thread.sleep(3000);

//        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
//        System.out.println("SIZE -- "+tabs2.size());
//       //getDriver().switchTo().window(tabs2.get(2));
//        getDriver().switchTo().activeElement();
//        getReusableActions().staticWait(3000);
//        System.out.println("Current URL -- "+getDriver().getCurrentUrl());
//        ChromeOptions options = new ChromeOptions();
//// Creating a driver instance with the previous capabilitiesWebDriver driver = new ChromeDriver(options);
//// Load page & take screenshot of full-screen pagedriver.get("http://google.com");
//        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(scrFile, new File("screenshot.png"));
//        scrollToMiddleOfElement(ctnInEnsPage);
//        getReusableActions().staticWait(2000);
//        reporterSnapshot(ctnInEnsPage,ctn,"","GEN");

    }
    public void openNewTabInSameWindowForOutlook(String orderId , String flow) throws InterruptedException {
         getReusableActions().staticWait(3000);
            // Navigate to Outlook login page
           /* JavascriptExecutor executor = (JavascriptExecutor) getDriver();
            String openNewWindow = "window.open('https://outlook.office.com')";
            executor.executeScript(openNewWindow);
           // ENSHomePage.getReusableActionsInstance().waitForNumberOfWindowsToBe(2, 10);
            ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
            //getDriver().switchTo().window(tabs.get(1));
            getDriver().switchTo().window(tabs.get(tabs.size()-1));
            getReusableActions().staticWait(3000);
            System.out.println("Current page URL => "+getDriver().getCurrentUrl());
            System.out.println("Number of Tabs in Logout Session " +tabs.size());
            // Replace 'your-email@example.com' and 'your-password' with your Outlook credentials
            getDriver().findElement(By.xpath("")).click();
            getReusableActions().staticWait(2000);
           *//* getDriver().findElement(By.name("loginfmt")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
            getDriver().findElement(By.name("loginfmt")).sendKeys(Keys.BACK_SPACE);
            getReusableActions().staticWait(1000);*/


            getDriver().findElement(By.name("loginfmt")).sendKeys("");
            getDriver().findElement(By.id("idSIButton9")).click();
             Thread.sleep(2000);
            getDriver().findElement(By.name("passwd")).sendKeys("");
            getDriver().findElement(By.id("idSIButton9")).click();
            if (getDriver().findElements(By.id("idSIButton9")).size()>0){
                Thread.sleep(1000);
                getDriver().findElement(By.id("idSIButton9")).click();
            }
            // Wait for the inbox page to lad
            getReusableActions().staticWait(3000);
            outlookTopSearch.click();
            outlookTopSearch.sendKeys(orderId);
            outlookTopSearch.sendKeys(Keys.ENTER);
        getReusableActions().staticWait(2000);
        // Get all the email subjects
            System.out.println("e mail Subject = "+nacSubject.size());
           if (nacSubject.size()>0){
               getReusableActions().staticWait(3000);
               nacSubject.get(0).click();
               getReusableActions().staticWait(2000);
               getReusableActions().javascriptScrollByVisibleElement(outlookOrderSumm);
               getReusableActions().staticWait(500);
               if (flow.equalsIgnoreCase("NAC")) {
                   reporterSnapshot(outlookOrderIdNAC, orderId, "", "COMMON");
               } else if (flow.equals("PPC")) {
                   reporterSnapshot(outlookOrderIdPPC, orderId, "", "COMMON");
               } else if (flow.equals("APU")) {
                   reporterSnapshot(outlookOrderIdAPU, orderId, "", "COMMON");
               } else if (flow.equals("APE")) {
                   reporterSnapshot(outlookOrderIdAPE, orderId, "", "COMMON");
               }
           }
           else{
               reporterSnapshot(outlookOrderSumm,"Email Not triggered pls check","","DISPLAY");
           }
    }
    public void validateAutopayStatusInEmail(String status) {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(outlookAutopay);
        getReusableActions().staticWait(500);
        if (status.equalsIgnoreCase("Enroll")) {
            reporterSnapshot(outlookAutopayStatus, "ENROLLED", "", "COMMON");
        } else {
            reporterSnapshot(outlookAutopayStatus, "NOT ENROLLED", "", "COMMON");
        }
    }
        public void accountLogOut (String channel) throws InterruptedException {
            JavascriptExecutor executor = (JavascriptExecutor) getDriver();
            String openNewWindow = "window.open('https://outlook.office.com')";
            executor.executeScript(openNewWindow);
            //ENSHomePage.getReusableActionsInstance().waitForNumberOfWindowsToBe(2, 10);
            ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
            getDriver().switchTo().window(tabs.get(tabs.size()-1));
            getReusableActions().staticWait(3000);
            System.out.println("Current page URL => "+getDriver().getCurrentUrl());
            System.out.println("Number of Tabs in Logout Session " +tabs.size());
            if(channel.equalsIgnoreCase("CARE")) {
                getReusableActions().javascriptScrollByVisibleElement(profile);
                getReusableActions().staticWait(500);
                //profile.click();
                getReusableActions().executeJavaScriptClick(profile);
                profileSignout.click();
                useanotherAcc.click();
            }
        }
    }
