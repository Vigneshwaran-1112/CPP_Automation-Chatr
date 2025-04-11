package com.rogers.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import static com.rogers.test.base.BaseTest.getEASPage;

public class SignInPage extends BasePage {
    @FindBy(xpath = "//input[@type='email']")
    WebElement emailInput;
    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    WebElement proceedCTA;
    @FindBy(xpath = "//button[@title='FR Proceed']")
    WebElement frProceedCTA;
    @FindBy(xpath = "//h4[@class='text-title-4']")
    WebElement welcomeText;
    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordInput;
    @FindBy(xpath = "(//a[@aria-labe='Sign into my chatr'])[3]")
    WebElement signInCTA;
    @FindBy(xpath = "//button[@title='FR Sign in']")
    WebElement signInFrenchCTA;
    @FindBy(xpath = "//h1[contains(text(),'Hello')]")
    WebElement helloTextBanner;
    @FindBy(xpath = "(//span[@role='img'])[2]")
    WebElement errorIcon;
    @FindBy(xpath = "//span[contains(text(),'This field is required')]")
    WebElement fieldRequiredText;
    @FindBy(xpath = "//span[contains(text(),'Email format is incorrect')]")
    WebElement emailFormatIncorrectText;
    @FindBy(xpath = "//span[contains(text(),'There is no account with this email')]")
    WebElement noAccountWEmailText;
    @FindBy(xpath = "(//span[@role='img'])[1]")
    WebElement clearEmailCTA;
    @FindBy(xpath = "//a[normalize-space()='Legacy Sign in']")
    WebElement legacySignIn;
    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    WebElement continueButton;
    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    WebElement signInCtaEas;
    @FindBy(xpath = "//h1[contains(text(),'Sign in')]")
    WebElement siginHeader;

    @FindBy(xpath = "//span[contains(text(),'Ouvrir une session')]")
    WebElement signInCtaEasFrench;

    @FindBy(xpath = "//h3[contains(text(),'Manage add-ons')]")  //h2[contains(text(),'Add-ons')]
    WebElement visElementMAO_Page;

    @FindBy(xpath = "//p[contains(text(),'temporarily locked')]")
    WebElement accountLockedError;
    @FindBy(xpath = "//a[normalize-space()='My chatr']")
    WebElement myChatr;
    @FindBy(xpath = "//div[@class='dsa-orderTable']/div/div[2]/div[2]/span")
    WebElement orderNumberInOrderPage;
    public SignInPage(WebDriver driver) {
        super(driver);
    }
    public static String emailId;
    /**
     * method to receive custom username and password
     */
    public void signIn(String username, String password) {
        getReusableActions().isElementVisible(emailInput, 10);
        emailInput.click();
        getReusableActions().clickWhenReady(emailInput, 10);
        emailInput.sendKeys(username);
        proceedCTA.click();
        passwordInput.sendKeys(password);
        signInCTA.click();
        getReusableActions().isElementVisible(helloTextBanner, 10);
        //helloTextBanner.isDisplayed();
        System.out.println("*** Successfully Signed In ***");
    }

    public void signInFrench(String username, String password) {
        getReusableActions().isElementVisible(emailInput, 10);
        emailInput.click();
        getReusableActions().clickWhenReady(emailInput, 10);
        emailInput.sendKeys(username);
        frProceedCTA.click();
        getReusableActions().clickWhenReady(welcomeText, 10);
        welcomeText.isDisplayed();
        passwordInput.sendKeys(password);
        signInFrenchCTA.click();
        getReusableActions().isElementVisible(helloTextBanner, 10);
        helloTextBanner.isDisplayed();
        System.out.println("*** Successfully Signed In ***");
    }

    public void validateSignIn() {
        emailInput.sendKeys("");
        proceedCTA.click();
        errorIcon.isDisplayed();
        fieldRequiredText.isDisplayed();
        reporter.reportLogWithScreenshot("Empty email field validated");
        emailInput.sendKeys("abc");
        proceedCTA.click();
        errorIcon.isDisplayed();
        emailFormatIncorrectText.isDisplayed();
        reporter.reportLogWithScreenshot("Incorrect email field validated");
        clearEmailCTA.click();
        emailInput.sendKeys("abc@gmail.com");
        proceedCTA.click();
        errorIcon.isDisplayed();
        noAccountWEmailText.isDisplayed();
        reporter.reportLogWithScreenshot("No account validated");
        clearEmailCTA.click();
    }

    public void clickOnLegacySignIn() {
        getReusableActions().javascriptScrollByVisibleElement(legacySignIn);
        getReusableActions().staticWait(2000);
        legacySignIn.click();
    }

    public void signInEas(String username, String password) {
        getReusableActions().staticWait(5000);
        int setSize = getDriver().getWindowHandles().size();
        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(setSize - 1));
        getReusableActions().isElementVisible(emailInput, 20);
        //getReusableActions().clickWhenReady(emailInput, 30);
        emailInput.click();
        emailInput.sendKeys(username);
        //getReusableActions().getWhenReady(emailInput).sendKeys(username);
        getReusableActions().staticWait(2000);
        reporterSnapshot(emailInput,username,"","NULL");
        continueButton.click();
        getReusableActions().staticWait(5000);
//        if (getDriver().findElements(By.xpath("//input[@type='password']")).size() < 1)
//        {
//            getDriver().navigate().back();
//            getReusableActions().staticWait(2000);
//            getDriver().navigate().forward();
//            getReusableActions().staticWait(4000);
//            if (getDriver().findElements(By.xpath("//span[contains(text(),'Continue')]")).size() > 0)
//            {
//                getDriver().findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
//                getReusableActions().staticWait(1000);
//            }
//        }

        System.out.println("CurrentURL-- " +getDriver().getCurrentUrl());
        for (int i=0;i<=1;i++) {
            if (getDriver().getCurrentUrl().equals("https://auto-cpp.chatrwireless.com/eas/error?errorType=rc01")) {
                getDriver().findElement(By.xpath("(//span[@role='text'])[2]")).click();
                getReusableActions().staticWait(3000);
                getReusableActions().clickWhenReady(signInCTA);
                getReusableActions().staticWait(3000);
                if (getDriver().findElements(By.xpath("//span[contains(text(),'Submit')]")).size() > 0) {
                    getDriver().findElement(By.xpath("//input[@type='text']")).click();
                    //getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("4163197179"); //QA-AUTO2
                    getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("4168172628"); //QA-AUTO
                    getDriver().findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
                    getReusableActions().staticWait(7000);
                }
                if (getDriver().findElements(By.xpath("//span[contains(text(),'Continue')]")).size() > 0) {
                    getDriver().findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
                    getReusableActions().staticWait(2000);
                }
            }
        }
        getReusableActions().staticWait(2000);
        passwordInput.sendKeys(password);
        reporterSnapshot(passwordInput,password,"","NULL");
        signInCtaEas.click();
        getReusableActions().staticWait(2000);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickVerifyEmail();
            getReusableActions().staticWait(3000);
            String emailCode = GetOTPFromENStest(username);
            getEASPage().enterEmailVerificationCode(emailCode);
            getReusableActions().staticWait(7000);
        }
        myChatr.click();
        getReusableActions().staticWait(1000);
        getReusableActions().isElementVisible(helloTextBanner, 10);
        helloTextBanner.isDisplayed();
        System.out.println("*** Successfully Signed In ***");
        reporterSnapshot(helloTextBanner,"hello Text Banner","","NULL");
    }
    public void signInEas1(String username, String password) {
        reporterSnapshot(emailInput,"Re direct to Sign in Page","","NULL");
        getReusableActions().isElementVisible(emailInput, 10);
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(username);
        //getReusableActions().getWhenReady(emailInput).sendKeys(username);
        getReusableActions().staticWait(1000);
        reporterSnapshot(emailInput,username,"","NULL");
        continueButton.click();
        getReusableActions().staticWait(5000);
        for (int i=0;i<=1;i++) {
            if (getDriver().getCurrentUrl().equals("https://auto-cpp.chatrwireless.com/eas/error?errorType=rc01")) {
                getDriver().findElement(By.xpath("(//span[@role='text'])[2]")).click();
                getReusableActions().staticWait(3000);
                getReusableActions().clickWhenReady(signInCTA);
                getReusableActions().staticWait(3000);
                if (getDriver().findElements(By.xpath("//span[contains(text(),'Submit')]")).size() > 0) {
                    getDriver().findElement(By.xpath("//input[@type='text']")).click();
                   // getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("4163197179");
                    getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("4168172628"); //QA-AUTO
                    getDriver().findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
                    getReusableActions().staticWait(6000);
                    /*getDriver().findElement(By.xpath("//span[@role='text']")).click();
                    getReusableActions().staticWait(3000);
                    getDriver().findElement(By.xpath("//span[contains(text(),'Sign in to My chatr ')]")).click();
                    getReusableActions().staticWait(3000);*/
                }
                if (getDriver().findElements(By.xpath("//span[contains(text(),'Continue')]")).size() > 0) {
                    getDriver().findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
                    getReusableActions().staticWait(2000);
                }
            }
            if (getDriver().findElements(By.xpath("//span[contains(text(),'Sign in')]")).size() > 0) {
                getReusableActions().staticWait(3000);
                passwordInput.sendKeys(password);
                reporterSnapshot(passwordInput, password, "", "NULL");
                signInCtaEas.click();
                break;
            }
        }
    /*    if (getDriver().findElements(By.xpath("//input[@type='password']")).size() < 1)
        {
            getDriver().navigate().back();
            getReusableActions().staticWait(2000);
            getDriver().navigate().forward();
            getReusableActions().staticWait(2000);
            if (getDriver().findElements(By.xpath("//span[contains(text(),'Continue')]")).size() > 0)
            {
                getReusableActions().staticWait(1000);
                getDriver().findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
                getReusableActions().staticWait(1000);
            }
        }
        getReusableActions().staticWait(2000);
        passwordInput.sendKeys(password);
        reporterSnapshot(passwordInput,password,"","NULL");
        signInCtaEas.click();*/
        getReusableActions().staticWait(2000);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickVerifyEmail();
            String emailCode = GetOTPFromENStest(username);
            getEASPage().enterEmailVerificationCode(emailCode);
            getReusableActions().staticWait(7000);
        }
    }

    public void signInEasFrench(String username, String password) {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(emailInput, 10);
        getReusableActions().clickWhenReady(emailInput, 10);
        emailInput.sendKeys(username);
        continueButton.click();
        getReusableActions().staticWait(1000);
        passwordInput.sendKeys(password);
        signInCtaEasFrench.click();
        getReusableActions().isElementVisible(helloTextBanner, 10);
        helloTextBanner.isDisplayed();
        System.out.println("*** Successfully Signed In ***");
    }
    public void validateURLLogin(String URL,String username,String password){
        getDriver().get(URL);
        //reporter.softAssert(!getDriver().getCurrentUrl().equalsIgnoreCase(URL),"History Report direct URL is entered","History Report direct URL is not entered");
        reporterSnapshot(siginHeader,URL,"","Notlink");
        //reporter.softAssert(siginHeader.isDisplayed(),"Sign in page is displayed and User is not logged in ","Sign in page is not displayed");
        reporterSnapshot(siginHeader,"Sign-in Header","","display");
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(emailInput,10);
        getReusableActions().clickWhenReady(emailInput,10);
        emailInput.sendKeys(username);
        continueButton.click();
        getReusableActions().staticWait(2000);
        if (getDriver().findElements(By.xpath("//input[@type='password']")).size() < 1)
        {
            getDriver().navigate().back();
            getReusableActions().staticWait(2000);
            getDriver().navigate().forward();
            getReusableActions().staticWait(2000);
            if (getDriver().findElements(By.xpath("//span[contains(text(),'Continue')]")).size() > 0)
            {
                getDriver().findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
                getReusableActions().staticWait(1000);
            }
        }
        getReusableActions().staticWait(2000);
        passwordInput.sendKeys(password);
        signInCtaEas.click();
    }
    public void validateDirectURL_MAO(String url){
        //getDriver().get(url);
        getReusableActions().staticWait(2000);
        //reporter.reportLogWithScreenshot("Current Url : "+getDriver().getCurrentUrl());
        reporterSnapshot(visElementMAO_Page,url,"","link");
        //reporter.softAssert(visElementMAO_Page.isDisplayed(),"Direct Url opened successfully","Direct Url didnot open successfully");
        reporterSnapshot(visElementMAO_Page,"Direct Manage Add-On","","display");
    }
    public String GetOTPFromENStest(String emailId) {
        ENSQuery ensQuery = null;
        try {
            ensQuery = new ENSQuery();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        getReusableActions().staticWait(18000);
        System.out.println("ENS connection established successfully");
        System.out.println("emailId"+emailId);
        String notification_id = ensQuery.getNotificationID(emailId);
        String OTPCode= null;
        try {
            OTPCode = ensQuery.getOTPMail(notification_id);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Notification id " + notification_id);
        System.out.println("Verification_CodeFromENS=" +OTPCode);
        //reporter.reportLogPass("Notification ID"+notification_id);
        return OTPCode;
    }
    public void signInEasFromExcel(String status) {
        String userpassid = getEasid(status);
        String[] temp = userpassid.split(";");
        String username = temp[0];
        String password = temp[1];
        getReusableActions().staticWait(5000);
        getReusableActions().isElementVisible(emailInput, 20);
        //getReusableActions().clickWhenReady(emailInput, 30);
        emailInput.click();
        emailInput.sendKeys(username);
        //getReusableActions().getWhenReady(emailInput).sendKeys(username);
        getReusableActions().staticWait(1000);
        reporterSnapshot(emailInput,username,"","NULL");
        continueButton.click();
        getReusableActions().staticWait(5000);
//        if (getDriver().findElements(By.xpath("//input[@type='password']")).size() < 1)
//        {
//            getDriver().navigate().back();
//            getReusableActions().staticWait(2000);
//            getDriver().navigate().forward();
//            getReusableActions().staticWait(2000);
//            if (getDriver().findElements(By.xpath("//span[contains(text(),'Continue')]")).size() > 0)
//            {
//                getDriver().findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
//                getReusableActions().staticWait(1000);
//            }
//        }
        System.out.println("CurrentURL-- " +getDriver().getCurrentUrl());
        for (int i=0;i<=3;i++) {
            if (getDriver().getCurrentUrl().equals("https://auto-cpp.chatrwireless.com/eas/error?errorType=rc01")) {
                getDriver().findElement(By.xpath("(//span[@role='text'])[2]")).click();
                getReusableActions().staticWait(3000);
                getReusableActions().clickWhenReady(signInCTA);
                getReusableActions().staticWait(3000);
                if (getDriver().findElements(By.xpath("//span[contains(text(),'Submit')]")).size() > 0) {
                    getDriver().findElement(By.xpath("//input[@type='text']")).click();
                    //getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("4163197179"); //QA-AUTO 2
                    getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("4168172628"); //QA-AUTO
                    getReusableActions().javascriptScrollByVisibleElement(getDriver().findElement(By.xpath("//span[contains(text(),'Submit')]")));
                    getDriver().findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
                    getReusableActions().staticWait(6000);
                    /*getDriver().findElement(By.xpath("//span[@role='text']")).click();
                    getReusableActions().staticWait(3000);
                    getDriver().findElement(By.xpath("//span[contains(text(),'Sign in to My chatr ')]")).click();
                    getReusableActions().staticWait(3000);*/
                }
                if (getDriver().findElements(By.xpath("//span[contains(text(),'Continue')]")).size() > 0) {
                    getDriver().findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
                    getReusableActions().staticWait(2000);
                }
            }
            if (getDriver().findElements(By.xpath("//span[contains(text(),'Sign in')]")).size() > 0) {
                getReusableActions().staticWait(3000);
                passwordInput.sendKeys(password);
                reporterSnapshot(passwordInput, password, "", "NULL");
                signInCtaEas.click();
                break;
            }
        }
        getReusableActions().staticWait(2000);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickVerifyEmail();
            getReusableActions().staticWait(2000);
            String emailCode = GetOTPFromENStest(username);
            getEASPage().enterEmailVerificationCode(emailCode);
            getReusableActions().staticWait(7000);
        }
//        myChatr.click();
//        getReusableActions().staticWait(3000);
        getReusableActions().isElementVisible(helloTextBanner, 10);
        helloTextBanner.isDisplayed();
        System.out.println("*** Successfully Signed In ***");
        reporterSnapshot(helloTextBanner,"hello Text Banner","","NULL");
        setEasid(username,status);
    }
    public String getmailOTP(String username) {
        String emailCode = GetOTPFromENStest(username);
        return emailCode;
    }

    public void validatingAccountLocked( String username,String password) {
        getReusableActions().staticWait(5000);
        getReusableActions().isElementVisible(emailInput, 20);
        emailInput.click();
        emailInput.sendKeys(username);
        getReusableActions().staticWait(1000);
        reporterSnapshot(emailInput,username,"","NULL");
        continueButton.click();
        getReusableActions().staticWait(5000);
        System.out.println("CurrentURL-- " +getDriver().getCurrentUrl());
        for (int i=0;i<=1;i++) {
            if (getDriver().getCurrentUrl().equals("https://auto-cpp.chatrwireless.com/eas/error?errorType=rc01")) {
                getDriver().findElement(By.xpath("(//span[@role='text'])[2]")).click();
                getReusableActions().staticWait(3000);
                getReusableActions().clickWhenReady(signInCTA);
                getReusableActions().staticWait(3000);
                if (getDriver().findElements(By.xpath("//span[contains(text(),'Submit')]")).size() > 0) {
                    getDriver().findElement(By.xpath("//input[@type='text']")).click();
                    //getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("4163197179"); //QA-AUTO 2
                    getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("4168172628"); //QA-AUTO
                    getDriver().findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
                    getReusableActions().staticWait(3000);
                }
                if (getDriver().findElements(By.xpath("//span[contains(text(),'Continue')]")).size() > 0) {
                    getDriver().findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
                    getReusableActions().staticWait(2000);
                }
            }
        }
        getReusableActions().staticWait(5000);
        passwordInput.sendKeys(password);
        reporterSnapshot(passwordInput,password,"","NULL");
         for(int i=0;i<11;i++) {
             getReusableActions().scrollToElement(signInCtaEas);
        signInCtaEas.click();}
        getReusableActions().staticWait(2000);
        reporterSnapshot(accountLockedError," account has been temporarily locked","","COMMON");
    }
    public String getOrderNumberFromENStest(String emailId,String templateType) {
        ENSQuery ensQuery = null;
        try {
            ensQuery = new ENSQuery();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        getReusableActions().staticWait(18000);
        System.out.println("ENS connection established successfully");
        System.out.println("emailId"+emailId);
        String notification_id = ensQuery.getOrderID(emailId,templateType);
        String OTPCode= null;
        try {
            OTPCode = ensQuery.orderDetail(notification_id,templateType);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Notification id " + notification_id);
        System.out.println("Verification_CodeFromENS=" +OTPCode);
        //reporter.reportLogPass("Notification ID"+notification_id);
        return OTPCode;
    }
    public void validateActivationOrderIdForManageAddon( ArrayList<String> order,String template){
        String orderDetails = getOrderNumberFromENStest(order.get(1),template);

        String[] strArray = orderDetails.split(";");
            System.out.println("CTN Number from ENS -- "+strArray[0]);
        Assert.assertEquals(order.get(2),strArray[0]);
            System.out.println("Oreder Number from ENS -- "+strArray[1]);
        Assert.assertEquals(order.get(0),strArray[1]);
            System.out.println("MSF VALUE from ENS -- "+strArray[2]);
        Assert.assertEquals(order.get(3),strArray[2]);
    }
    public void validateActivationOrderIdForNacFlow( String mailId,String orderDetails,String orderNumber,String plan,String ctn){ //PPC and NAC flow
        String detailReplace=orderDetails.replaceAll(">",":").replaceAll("<",":").replaceAll("/",":");
        String[] strArray = detailReplace.split(":");
        System.out.println("Order Number from Application -- "+orderNumber);
        System.out.println("E MAIL ID from Application -- "+mailId);
        System.out.println("CTN Number from Application -- "+ctn.replaceAll("-",""));
        System.out.println("PLAN Number from Application -- "+plan);
        String a[]={orderNumber,ctn.replaceAll("-",""),plan};
        for(int i=0;i<a.length;i++){
            String expectedENS="";
            for(String ens:strArray){
                //System.out.println(" ENS DEtails -- "+ens);
                if(ens.contains(a[i])){
                    expectedENS=ens;
//                    System.out.println("input Array -- "+a[i]);
//                     System.out.println("Expected From ENS -- "+expectedENS);
                }
            }
            if(expectedENS.length()>11){
                System.out.println("Order Number from ENS -- "+expectedENS);
                // Assert.assertEquals(orderNumber,expectedENS.substring(11));
                reporterSnapshot(orderNumberInOrderPage,expectedENS.substring(11),orderNumber,"ENS");
            }
            if(expectedENS.length()==10){
                System.out.println("CTN Number from ENS -- "+expectedENS);
                //Assert.assertEquals(ctn.replaceAll("-",""),expectedENS);
                reporterSnapshot(orderNumberInOrderPage,expectedENS,ctn.replaceAll("-",""),"ENS");
            }
            if(expectedENS.length()<6){
                System.out.println("plan from ENS -- "+expectedENS);
                //Assert.assertEquals(plan,expectedENS);
                reporterSnapshot(orderNumberInOrderPage,expectedENS,plan,"ENS");
            }
        }
    }

    public String generateRandomEmail() {
        int min = 1; // Minimum value of range
        int max = 1000; // Maximum value of range
// Generate random int value from min to max
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
// Printing the generated random numbers

        System.out.println(random_int);
        emailId = "emailvalidationuitest" + random_int + "@gmail.com";
        reporter.reportLog("Email ID generated" + emailId);
        return emailId;
    }
    public void signInEasFromExcelForError(String status) {
        String userpassid = getEasid(status);
        String[] temp = userpassid.split(";");
        String username = temp[0];
        getReusableActions().staticWait(5000);
        getReusableActions().isElementVisible(emailInput, 20);
        emailInput.click();
        emailInput.sendKeys(username);
        getReusableActions().staticWait(1000);
        reporterSnapshot(emailInput,username,"","NULL");
        continueButton.click();
        getReusableActions().staticWait(5000);
        System.out.println("CurrentURL-- " +getDriver().getCurrentUrl());
        for (int i=0;i<=1;i++) {
            if (getDriver().getCurrentUrl().equals("https://auto-cpp.chatrwireless.com/eas/error?errorType=rc01")) {
                getDriver().findElement(By.xpath("(//span[@role='text'])[2]")).click();
                getReusableActions().staticWait(3000);
                getReusableActions().clickWhenReady(signInCTA);
                getReusableActions().staticWait(3000);
                if (getDriver().findElements(By.xpath("//span[contains(text(),'Submit')]")).size() > 0) {
                    getDriver().findElement(By.xpath("//input[@type='text']")).click();
                    //getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("4163197179"); //QA-AUTO 2
                    getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("4168172628"); //QA-AUTO
                    getDriver().findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
                    getReusableActions().staticWait(5000);
                    /*getDriver().findElement(By.xpath("//span[@role='text']")).click();
                    getReusableActions().staticWait(3000);
                    getDriver().findElement(By.xpath("//span[contains(text(),'Sign in to My chatr ')]")).click();
                    getReusableActions().staticWait(3000);*/
                }
                if (getDriver().findElements(By.xpath("//span[contains(text(),'Continue')]")).size() > 0) {
                    getDriver().findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
                    getReusableActions().staticWait(2000);
                }
            }
            if (getDriver().findElements(By.xpath("//span[contains(text(),'Sign in')]")).size() > 0) {
                break;
            }
        }
    }
}
