package com.rogers.pages;

import com.rogers.data.handlers.ExcelUtility;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static com.rogers.data.handlers.TestDataHandler.filePath;

public class EASPage extends BasePage {
    @FindBy(xpath = "//app-register-form/div/form/button/span")
    WebElement registerFormContinueButton;
    @FindBy(xpath = "//ds-error/span[2]")
    WebElement errorMessage;
    @FindBy(xpath = "//app-ctn-form/app-register-form/div/div/p")
    WebElement alreadyRegisteredMessage;
    @FindBy(xpath = "//input[@type='tel']") ////parent::div//parent::div
    WebElement phoneNumberField;
    @FindBy(xpath = "//span[contains(text(),'Register')]")
    WebElement registerButton;
    @FindBy(xpath = "/html/body/pre")
    WebElement otpData;
    @FindBy(xpath = "//ds-code-input/div/div[2]/input")
    WebElement inputCode;
    @FindBy(xpath = "//*[contains(text(),'ontinue')]")
    WebElement continueButton;
    @FindBy(xpath = "//ds-alert/div/div/div/div/div/p")
    WebElement alertMessage;
    @FindBy(xpath = "//button[@title='Close alert']")
    WebElement alertCloseButton;
    @FindBy(xpath = "//h1[contains(text(),'Too many')]")
    WebElement lockedMessage;
    @FindBy(xpath = "//button[@title='Proceed']")
    WebElement proceedButton;
    @FindBy(xpath = "//input[@type='email']")
    WebElement emailInput;
    @FindBy(xpath = "//button[@title='Continue']")
    WebElement continueButtonInEmail;
    @FindBy(xpath = "//button[@title='E-mail propre']")
    WebElement emailClearButton;
    @FindBy(xpath = "//button[@title='Redirect to the Reset Password Page']")
    WebElement resetPasswordButton;
    @FindBy(xpath = "//button[@title='Redirect to Sign In Page']")
    WebElement signInButton;
    @FindBy(xpath = "//app-register-form/div/p")
    WebElement emailAlreadyRegisteredMessage;
    @FindBy(xpath = "//h1[text()='Receive verification code']")
    WebElement mfaWindow;
    @FindBy(xpath = "//button[contains(@title,'email address')]")
    WebElement emailButton;
    @FindBy(xpath = "//h1[contains(text(),'Too many')]")
    List<WebElement> lockedMessageList;
    @FindAll({
            @FindBy(xpath = "//span[contains(text(),'Continue') or contains(text(),'Continuer')]/ancestor::button"),
            @FindBy(xpath = "//button[contains(text(),'Continue') or contains(text(),'Continuer')]"),
            @FindBy(xpath = "//button[@class='w-100 mb-16 ds-button ds-corners ds-pointer text-center mw-100 d-inline-block -primary -large']")
    })
    WebElement btnContinue;
    @FindBy(xpath = "//input[@title='Enter your new password']")
    WebElement newPasswordInput;
    @FindBy(xpath = "//input[@title='Enter your new password again to confirm.']")
    WebElement confirmPasswordInput;
    @FindBy(xpath = "//button[@title='Change Password']")
    WebElement continueButtonInPasswordChange;
    @FindBy(xpath = "//*[contains(text(),'Success')]")
    WebElement successMessage;
    @FindBy(xpath = "//a[@title='Select to retrieve your username']")
    WebElement forgotUsernameBtn;
    @FindBy(xpath = "//a[@title='Select to use your account information to recover username.']")
    WebElement accountInfoLnk;
    @FindBy(xpath = "//*[contains(text(),\"Recover username\")]")
    WebElement recUnameHeader;
    @FindBy(xpath = "//input[@id='ds-form-input-id-0']")
    WebElement recoverCTNInput;
    @FindBy(xpath = "//input[@id='ds-form-input-id-1']")
    WebElement recoverPostalInput;
    @FindBy(xpath = "(//form/div)[2]/div/ds-form-field//input")
    WebElement recoverDOBInput;

    @FindBy(xpath = "((//form/div)[3]/button)[1]")
    WebElement recoverContinueBtn;

    @FindBy(xpath = "//h1[contains(text(),\"Receive verification code\")]")
    WebElement receiveOTPHeader;

    @FindBy(xpath = "//*[contains(text(),\"The phone number must have 10-digits.\")]")
    WebElement recCTNError;

    @FindBy(xpath = "//*[contains(text(),\"Enter postal code\")]")
    WebElement recPostalCodeError;

    @FindBy(xpath = "//*[contains(text(),\"Enter date of birth\")]")
    WebElement recDOBError;
    @FindBy(xpath = "//span[contains(text(),'Register')]")
    WebElement registerNew;
    @FindBy(xpath = "(//span[contains(text(),'Learn more')])[3]")
    WebElement internationalTalkSaver;
    @FindBy(id = "#longDistContainer")
    WebElement longDistance;
    @FindBy(xpath = "//input[@id='countrySelect_input']")
    WebElement destinationDropdown;
    @FindBy(xpath = "//li[@id='countrySelect_input_Canada & US|index~1']")
    WebElement canadaAndUS;
    @FindBy(xpath = "//table[@id='activePlanUSGrid1']")
    WebElement longDistanceRates;
    @FindBy(xpath = "(//span[contains(text(),'Roaming Rates')])[4]")
    WebElement roamingRatesLink;
    @FindBy(xpath = "//li[@id='countrySelect_input_US|index~1']")
    WebElement countryUS;

    @FindBy(xpath = "//html/body/iframe[1]")
    WebElement iframeLongDistance;
    @FindBy(xpath = "(//span[contains(text(),'Details')])[1]")
    WebElement planDetail;
    @FindBy(xpath = "(//span[contains(text(),'Rate finder')])[1]")
    WebElement ratesLink;
    @FindBy(xpath = "//h3[contains(text(),'within Canada')]")
    WebElement payWithCanada;
    @FindBy(xpath = "//h3[contains(text(),'Long distance')]")
    WebElement longDistanceDetail;
    @FindBy(xpath = "//h3[contains(text(),'Roaming')]")
    WebElement roamingDetail;
    @FindBy(xpath = "//span[contains(text(),'India')]")
    WebElement countryClick;
    @FindBy(xpath = "//h1[contains(text(),'Enter your email')]")
    WebElement emailHeadlne;
    @FindBy(xpath = "//app-otp-form[1]/app-register-form[1]/div[2]/div[1]/b[1]")
    WebElement numberFormat;
    @FindBy(xpath = "//span[contains(text(),'Resend code')]")
    WebElement resendOTP;
    @FindBy(xpath = "//ds-alert[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")
    WebElement otpError;
    @FindBy(xpath = "//p[contains(text(),'has expired')]")
    WebElement otpExpired;
    @FindBy(xpath = "//span[contains(text(),'Go to My chatr')]")
    WebElement gotoChatr;
    @FindBy(xpath = "//h1[contains(text(),'Hello')]")
    WebElement helloTextBanner;
    @FindBy(xpath = "//span[contains(text(),'valid email address')]")
    WebElement emailError;
    @FindBy(xpath = "//h1[contains(text(),'Already registered')]")
    WebElement alreadyRegemailAlert;
    @FindBy(xpath = "(//span[contains(text(),'Reset password')])[2]")
    WebElement resetPasswordLink;
    @FindBy(xpath = "//span[contains(text(),'Sign in to My chatr')]")
    WebElement myChatrLink;
    @FindBy(xpath = "//span[contains(text(),'Check your Inbox!')]")
    WebElement emailVerficodde;
    @FindBy(xpath = "//a[contains(text(),'  Change phone number ')]")
    WebElement changwMobileNumberButton;
    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordInput;
    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    WebElement signInCtaEas;


    public EASPage(WebDriver driver) {
        super(driver);
    }

    public void clickRegister() {
        getReusableActions().staticWait(1500);
        getReusableActions().javascriptScrollByVisibleElement(registerButton);
        getReusableActions().staticWait(500);
        reporterSnapshot(registerButton, "SIGN IN Page", "", "NULL");
        registerButton.click();
        getReusableActions().isElementVisible(phoneNumberField, 10);
        getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().staticWait(500);
        reporterSnapshot(registerButton, "Register", "", "NULL");
    }

    public void waitForPageLoad(){
        getReusableActions().staticWait(2000);
        getReusableActions().waitForElementVisibility(registerButton,10);

    }
    public void validateInvalidPhoneNumber(String phoneNumber) {
        phoneNumberField.clear();
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
        registerFormContinueButton.click();
        getReusableActions().isElementVisible(errorMessage, 10);
        reporter.softAssert(errorMessage.getText().equals("Please enter a valid Chatr number"), "valid message", "Invalid message");
    }

    public void validateIncorrectNumberLength(String phoneNumber) {
        phoneNumberField.clear();
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
        registerFormContinueButton.click();
        getReusableActions().isElementVisible(errorMessage, 10);
        reporter.softAssert(errorMessage.getText().equals("The phone number must have 10-digits."), "valid error: For Number Length", "Invalid error: For Number Length");
    }

    public void validateMessageForRegisterNumber(String phoneNumber) {
        phoneNumberField.clear();
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
        registerFormContinueButton.click();
        getReusableActions().staticWait(2000);
        reporter.softAssert(alreadyRegisteredMessage.getText().equals("Phone number already registered"), "Already Registered Message", "Not registered Message");
    }

    public void enterPhoneNumber(String phoneNumber) {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollToBottomOfPage();
        //phoneNumberField.click();
        //phoneNumberField.sendKeys(phoneNumber);
        getReusableActions().executeJavaScriptClick(phoneNumberField);
        getReusableActions().enterText(phoneNumberField,phoneNumber,10);
        reporterSnapshot(phoneNumberField, phoneNumber, "", "NULL");
        getReusableActions().staticWait(1000);
        registerFormContinueButton.click();
        getReusableActions().isElementVisible(inputCode, 20);
        getReusableActions().staticWait(2000);
    }

    public String enterValidPhoneNumber(String status) {
        String phoneNumber = getUnusedNAC(status);
        System.out.println("phoneNumber" + phoneNumber);
        //String[] strArray=phoneNumber.split(";");
        //for (int i=0;i<=strArray.length-1;i++){
        //    phoneNumber = strArray[i];
        //if (inputCode.isDisplayed()) {
        //    break;
        //}
        //else {
        phoneNumberField.clear();
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
        getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().staticWait(500);
        reporterSnapshot(phoneNumberField, phoneNumber, "", "NULL");
        registerFormContinueButton.click();
        getReusableActions().staticWait(2000);
        //if (alertCloseButton.isDisplayed())
        //    getReusableActions().clickWhenReady(alertCloseButton, 10);
        //}
        //}
        setUsedNACStatus1(phoneNumber, status);
        return phoneNumber;
    }

    public String getPhoneNumberOtp(String phoneNumber) {
        String code = "";
        getReusableActions().switchToNewWindow();
        String data = otpData.getText();
        JSONArray jsonArray = new JSONArray(data);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            if (jsonObject.optString("ctn").equals(phoneNumber.replace("-", ""))) {
                System.out.println(jsonObject.optString("code"));
                code = jsonObject.optString("code");
            }
        }
        reporter.reportLogWithScreenshot("OTP code generated");
        getReusableActions().closeCurrentWindow();
        getReusableActions().switchToMainWindow();
        return code;
    }

    public void enterCode(String code) {
        getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().staticWait(500);
        getReusableActions().getWhenReady(inputCode).sendKeys(code);
        //getReusableActions().staticWait(2000);
        reporterSnapshot(inputCode, "Mobile OTP Page", "", "NULL");
    }

    public void clickContinue() {
        getReusableActions().clickWhenReady(continueButton, 10);
        getReusableActions().staticWait(5000);
    }

    public void validateInvalidCode(String value, int loopCnt) {
        inputCode.clear();
        inputCode.sendKeys(value);
        for (int count = 1; count <= loopCnt; count++) {
            continueButton.click();
            getReusableActions().staticWait(2000);
        }
        reporterSnapshot(alertMessage, "valid 6", "", "common");
/*
        if(value.equalsIgnoreCase("locked")){
            reporterSnapshot(lockedMessage,"Locked Message","","display");
        }
        else {
            reporterSnapshot(alertMessage,"has expired","","Common");
        }
*/
        //getReusableActions().clickWhenReady(proceedButton);
        //getReusableActions().staticWait(2000);
    }

    public void validateInvalidEmail() {
        getReusableActions().isElementVisible(emailInput, 10);
        emailInput.click();
        getReusableActions().getWhenReady(emailInput).sendKeys("test123");
        getReusableActions().clickWhenReady(continueButtonInEmail);
        reporter.softAssert(errorMessage.getText().trim().equals("Please enter a valid email"), "Valid error message", "Invalid Error message");
    }

    public void validateExistingMail(String existingMail) {
        getReusableActions().isElementVisible(emailInput, 10);
        if (!(emailInput.getAttribute("value").isEmpty())) {
            getReusableActions().clickWhenReady(emailClearButton);
        }
        emailInput.click();
        getReusableActions().getWhenReady(emailInput).sendKeys(existingMail);
        getReusableActions().clickWhenReady(continueButtonInEmail);
        reporter.softAssert(getReusableActions().isElementVisible(resetPasswordButton)
                        && getReusableActions().isElementVisible(signInButton)
                        && emailAlreadyRegisteredMessage.getText().trim().contains("Email already registered"),
                "Valid Existing mail message", "Invalid Message for existing email");
    }

    public String emailGenerator() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("MMMMyyyyddHHmm");
        String formattedValue = formatter.format(cal.getTime());
        String emailGenerated = formattedValue.toLowerCase() + "@rci.rogers.com";
        return emailGenerated;
    }

    public void enterEmail(String email) {
        getReusableActions().isElementVisible(emailInput, 10);
        getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().staticWait(500);
        if (!(emailInput.getAttribute("value").isEmpty())) {
            getReusableActions().clickWhenReady(emailClearButton);
        }
        emailInput.click();
        getReusableActions().getWhenReady(emailInput).sendKeys(email);
        //reporter.reportLogWithScreenshot(email + " is entered");
        reporterSnapshot(emailInput, email, "", "NULL");
        getReusableActions().clickWhenReady(continueButtonInEmail);
        getReusableActions().staticWait(10000);
    }

    public boolean isMFAPresent() {
        if (getReusableActions().isElementVisible(mfaWindow, 10)) {
            return true;
        }
        return false;
    }

    public void clickVerifyEmail() {
        getReusableActions().clickWhenReady(emailButton, 5);
        //reporter.reportLogWithScreenshot("email button is clicked");
        reporterSnapshot(emailButton, "Email OTP Page", "", "NULL");
    }

    public void enterEmailVerificationCode(String recoveryCode) {
        getReusableActions().staticWait(2000);
        ArrayList<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(0));
        System.out.println(getDriver().getTitle());
        //reporter.reportLogWithScreenshot("Switched to first tab");
        getReusableActions().getWhenReady(inputCode).sendKeys(recoveryCode);
        //getReusableActions().staticWait(1000);
        reporterSnapshot(inputCode, recoveryCode, "", "NULL");
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(btnContinue);
        //reporter.reportLogWithScreenshot("recovery code provided");
    }

    public void setPassword(String password) {
        getReusableActions().isElementVisible(newPasswordInput, 10);
        newPasswordInput.click();
        getReusableActions().getWhenReady(newPasswordInput).sendKeys(password);
        confirmPasswordInput.click();
        getReusableActions().getWhenReady(confirmPasswordInput).sendKeys(password);
        reporterSnapshot(newPasswordInput, password, "", "NULL");
        getReusableActions().clickWhenReady(continueButtonInPasswordChange);
        getReusableActions().staticWait(3000);
    }

    public void validateSuccessRegisterMessage(String email) {
        //reporter.softAssert(getReusableActions().isElementVisible(successMessage,10),"Registration Successful","registration Unsuccessful");
        reporterSnapshot(successMessage, email, "", "NULL");
        reporterSnapshot(successMessage, "Success", "", "COMMON");
    }

    public void clickForgotUsername() {
        forgotUsernameBtn.click();
        getReusableActions().isElementVisible(emailInput, 10);
    }

    public void clickAccountInformation() {
        accountInfoLnk.click();
        reporter.reportLogWithScreenshot("");
    }

    public void enterRecoverDetails(String recoverCTN, String recoverPostal, String recoverDOB) {
        getReusableActions().staticWait(3000);
        recoverCTNInput.sendKeys(recoverCTN);
        recoverPostalInput.sendKeys(recoverPostal);
        recoverDOBInput.sendKeys(recoverDOB);
//        getReusableActions().staticWait(2000);
//        getReusableActions().clickWhenReady(recoverPostalInput);
//        recoverPostalInput.clear();
//        recoverPostalInput.sendKeys(recoverPostal);
//        getReusableActions().staticWait(2000);
//        getReusableActions().clickWhenReady(recoverDOBInput);
//        recoverDOBInput.clear();
//        recoverDOBInput.sendKeys(recoverDOB);
        reporterSnapshot(recoverDOBInput, "recovery details", "", "NULL");
        getReusableActions().clickWhenReady(recoverContinueBtn, 2000);
    }

    public void validateSelectOTP_Page() {
        getReusableActions().staticWait(2000);
        //reporter.softAssert(receiveOTPHeader.isDisplayed(),"Select OTP method page is displayed","elect OTP method page is not displayed");
        reporterSnapshot(receiveOTPHeader, "OTP Page", "", "display");
    }

    public void validateRecoveryFieldsErrors() {
        getReusableActions().staticWait(3000);
        reporterSnapshot(recUnameHeader, "recover Username", "", "NULL");
        getReusableActions().clickWhenReady(recoverContinueBtn, 2000);
        reporterSnapshot(recCTNError, "recover CTN", "", "NULL");
        reporterSnapshot(recPostalCodeError, "recover Postal Code", "", "NULL");
        reporterSnapshot(recDOBError, "recover DOB", "", "NULL");
        getReusableActions().staticWait(3000);
    }

    public void validateAlreadyUsedCTN(String number) {
        getReusableActions().staticWait(2000);
        phoneNumberField.clear();
        phoneNumberField.click();
        phoneNumberField.sendKeys(number);
        scrollToMiddleOfElement(phoneNumberField);
        getReusableActions().staticWait(1000);
        reporterSnapshot(phoneNumberField, "CTN entered for Registration", "", "display");
        registerFormContinueButton.click();
        getReusableActions().staticWait(2000);
        String appText = alreadyRegisteredMessage.getText().toUpperCase();
        System.out.println(appText);
        reporterSnapshot(alreadyRegisteredMessage, "Already", "", "Common");
        /*if (appText.contains(expText.toUpperCase())){
            reporterSnapshot(alreadyRegisteredMessage,"Already Registered CTN","","DISPLAY");
            System.out.println("Already Registered CTN");
        }*/
    }

    public void clickRegisterNew() {
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(registerNew);
        getReusableActions().staticWait(1000);
        reporterSnapshot(registerButton, "Register", "", "NULL");
        registerNew.click();
    }

    public void validateInvalidCode5Times(String value, int loopCnt) {
        inputCode.clear();
        inputCode.sendKeys(value);
        for (int count = 1; count <= loopCnt; count++) {
            if (getDriver().findElements(By.xpath("//*[contains(text(),'ontinue')]")).size() > 0) {
                continueButton.click();
            }
            getReusableActions().staticWait(2000);
        }
        reporterSnapshot(alertMessage, "has expired", "", "Common");
        //reporterSnapshot(lockedMessage,"Locked Message","","display");
    }

    public void validateInvalidCodelock(String value, int loopCnt) {
        inputCode.clear();
        inputCode.sendKeys(value);
        getReusableActions().staticWait(500);
        reporterSnapshot(inputCode, "INVALID PIN ", "", "display");
        int loopCount=0;
        for (int count = 1; count <= loopCnt; count++) {
            if (getDriver().findElements(By.xpath("//*[contains(text(),'ontinue')]")).size() > 0) {
                continueButton.click();
                getReusableActions().staticWait(2000);
            } else if (getDriver().findElements(By.xpath("//span[contains(text(),'Text')]")).size() > 0) {
                getDriver().findElement(By.xpath("//span[contains(text(),'Text')]")).click();
                getReusableActions().staticWait(2000);
                inputCode.clear();
                inputCode.sendKeys(value);
                getReusableActions().staticWait(2000);
            }else if (lockedMessageList.size() > 0) {
                    break;
                }
                loopCount = count+0;
        }
        System.out.println("Loop Count = " + loopCount);
        reporterSnapshot(lockedMessage, "Locked Message", "", "display");
    }

    public void clickOnEmail() {
        getReusableActions().staticWait(2000);
        emailButton.click();
        reporterSnapshot(emailButton,"MFA PAGE","","NULL");
    }

    public void clickInternationalTalkSaver() {
        getReusableActions().staticWait(15000);
        getReusableActions().javascriptScrollToMiddleOfPage();
        getReusableActions().scrollToElement(internationalTalkSaver);
        //getReusableActions().clickWhenReady(internationalTalkSaver);

    }

    public void validateLongDistanceRates() {
        getReusableActions().staticWait(3000);
        getDriver().findElement(By.xpath("//*[@id=\"ds-tabs-0-tab-1\"]")).click();
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(planDetail);
        planDetail.click();
        reporterSnapshot(ratesLink, "Rate Finder Link ", "", "Display");
        ratesLink.click();
        getReusableActions().staticWait(1000);
        getReusableActions().switchToNewWindow();
        getReusableActions().staticWait(2000);
        getReusableActions().scrollToElement(payWithCanada);
        reporterSnapshot(payWithCanada, "Pay With In Canda", "", "DISPLAY");
//        WebElement landing = getDriver().findElement(By.xpath("//*[@id=\"destination_publishing_iframe_rogers_0\"]"));
//        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(landing, 30);
//
//        getReusableActions().staticWait(3000);
//        getReusableActions().waitForElementVisibility(longDistance);
//        //  getReusableActions().javascriptScrollByVisibleElement(longDistance);
//        getReusableActions().javascriptScrollByVisibleElement(longDistance);
//        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(iframeLongDistance, 30);
//
//        getReusableActions().staticWait(3000);
//        reporterSnapshot(longDistance, "Long Distance", "", "GEN");
//        destinationDropdown.click();
//        getReusableActions().staticWait(2000);
//        reporterSnapshot(canadaAndUS, "Most commonly searched country", "", "DISPLAY");
//        reporterSnapshot(canadaAndUS, "Canada & US", "", "COMMON");
//        canadaAndUS.click();
//        getReusableActions().waitForElementVisibility(longDistanceRates);
//        reporterSnapshot(longDistanceRates, "Long Distance Rates and Plans", "", "DISPLAY");
    }

    public void validateRoamingRates() {
        getReusableActions().staticWait(3000);
        getDriver().findElement(By.xpath("//*[@id=\"ds-tabs-0-tab-1\"]")).click();
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(planDetail);
        planDetail.click();
//        getReusableActions().scrollToElement(internationalTalkSaver);
//        internationalTalkSaver.click();
//        getReusableActions().waitForElementVisibility(longDistance);
//        getReusableActions().javascriptScrollToBottomOfPage();
        reporterSnapshot(ratesLink, "Rate Finder Link ", "", "Display");
        ratesLink.click();
        getReusableActions().staticWait(1000);
        getReusableActions().switchToNewWindow();
        getReusableActions().staticWait(2000);
        getReusableActions().scrollToElement(payWithCanada);
        reporterSnapshot(payWithCanada, "Pay With In Canda", "", "DISPLAY");
        getReusableActions().staticWait(1000);
        getReusableActions().scrollToElement(longDistanceDetail);
        reporterSnapshot(longDistanceDetail, "Long Distance", "", "DISPLAY");
        getReusableActions().staticWait(1000);
        getReusableActions().scrollToElement(roamingDetail);
        reporterSnapshot(roamingDetail, "Roaming", "", "DISPLAY");
        getReusableActions().staticWait(1000);
        getReusableActions().scrollToElement(longDistanceDetail);
        getReusableActions().executeJavaScriptClick(countryClick);
        getReusableActions().staticWait(2000);
        reporterSnapshot(longDistanceDetail, "Long Distance", "", "DISPLAY");
        getReusableActions().staticWait(1000);
        getReusableActions().scrollToElement(roamingDetail);
        getReusableActions().executeJavaScriptClick(countryClick);
        getReusableActions().staticWait(2000);
        reporterSnapshot(roamingDetail, "Roaming", "", "DISPLAY");

//        destinationDropdown.click();
//        reporterSnapshot(countryUS,"most commonly searched country","","DISPLAY");

    }

    public String getValidPhoneNumberFromNac(String status) {
        String phoneNumber = getUnusedNAC(status);
        System.out.println("phoneNumber" + phoneNumber);
        setUsedNACStatus1(phoneNumber, status);
        return phoneNumber;
    }
    public void validateEnterEmailPage() {
        getReusableActions().staticWait(2000);
        reporterSnapshot(emailHeadlne, "Enter your", "", "Common");
    }
    public void validateNumberFormet(String number) {
        getReusableActions().staticWait(2000);
        System.out.println("Number -- "+number);
        String frt = number.charAt(0)+"**-***-**"+number.substring(8,10);
        System.out.println("Number formet "+frt);
        reporterSnapshot(numberFormat, frt, "", "Common");
    }
    public void validateResendOTP() {
        reporterSnapshot(resendOTP, "COUNTOWN START", "", "NULL");
        getReusableActions().staticWait(60000);
        reporterSnapshot(resendOTP, "COUNTOWN STOP", "", "NULL");
        resendOTP.click();
        getReusableActions().staticWait(2000);
    }
    public void validateWrongOTPCodeError() {
        getReusableActions().staticWait(2000);
        reporterSnapshot(otpError, "  Please enter a valid 6-digit code. ", "", "Common");
    }
    public void validateWrongOTPCodeExpired() {
        getReusableActions().staticWait(600000);
        getReusableActions().clickWhenReady(continueButton, 10);
        getReusableActions().staticWait(2000);
        reporterSnapshot(otpExpired, "has expired", "", "Common");
    }
    public void validategotoToChatr() {
        getReusableActions().staticWait(3000);
        gotoChatr.click();
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(helloTextBanner, 10);
        helloTextBanner.isDisplayed();
        System.out.println("*** Successfully Signed In ***");
        reporterSnapshot(helloTextBanner,"hello Text Banner","","NULL");
    }
    public void validateCppRemeberUserName(String userName) {
        getReusableActions().staticWait(3000);
        getReusableActions().isElementVisible(helloTextBanner, 10);
        reporterSnapshot(helloTextBanner,userName,"","COMMON");
    }
    public void validateEmailError() {
        getReusableActions().staticWait(2000);
        emailInput.click();
        getReusableActions().getWhenReady(emailInput).sendKeys("ram@nujam@gmail,com");
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(continueButtonInEmail);
        getReusableActions().staticWait(2000);
        reporterSnapshot(emailError, "Enter a valid email address.", "", "Common");
    }
    public void validateAlreadyRegisteredEmailAlert() {
        getReusableActions().staticWait(2000);
        emailInput.click();
        getReusableActions().getWhenReady(emailInput).sendKeys("october2024091339@rci.rogers.com");
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(continueButtonInEmail);
        getReusableActions().staticWait(2000);
        reporterSnapshot(alreadyRegemailAlert, "Already registered", "", "Common");
        reporterSnapshot(resetPasswordLink, "Reset password", "", "Common");
        reporterSnapshot(myChatrLink, "Sign in to My chatr", "", "Common");
    }
    public void validateEmailOTPPage() {
        getReusableActions().staticWait(2000);
        reporterSnapshot(emailVerficodde, "Check your Inbox!", "", "Common");
    }
    public void openMobileViewApplication() throws AWTException {
        getReusableActions().staticWait(3000);
        Robot robot = new Robot();
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_I);
        robot.delay(2000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_I);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_M);
        robot.delay(2000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_M);
        robot.delay(2000);
    }
    public void closeMobileViewApplication() throws AWTException {
        getReusableActions().staticWait(3000);
        Robot robot = new Robot();
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_M);
        robot.delay(2000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_M);
        robot.delay(2000);
    }
    public void clickChangePhoneNumber() {
        getReusableActions().staticWait(3000);
        changwMobileNumberButton.click();
        getReusableActions().isElementVisible(changwMobileNumberButton, 10);
        reporterSnapshot(changwMobileNumberButton, "Change Mobile Number", "", "NULL");
    }
    public void validatePhoneNumberField() {
        getReusableActions().staticWait(3000);
        reporterSnapshot(phoneNumberField, "Phone Number Field", "", "DISPLAY");
    }

    public void setCreatedCTN(String phoneNumber,String plan) {
        String sheetName = "CTNDATA";
        String excelPath = System.getProperty("user.dir") + filePath.replace("env", System.getProperty("Environment")+"/testData.xlsx");
        excelUtility = new ExcelUtility(excelPath);
        int i = excelUtility.getRowCount(sheetName)+1;
        excelUtility.setCellData(sheetName, "CTN", i, phoneNumber.replaceAll("-",""));
        excelUtility.setCellData(sheetName, "PLAN", i, plan);

    }
    public void enterInvalidPassword(String password) {
            getReusableActions().staticWait(3000);
            passwordInput.sendKeys(password);
            reporterSnapshot(passwordInput, password, "", "NULL");
            for (int i = 1;  i>=0; i++) {
                signInCtaEas.click();
                if(lockedMessageList.size() > 0){
                    reporterSnapshot(lockedMessageList.get(0), "Too many unsuccessful attempts", "", "COMMON");
                    System.out.println("Count == "+i);
                    break;
                }
            }
    }
    public void validateRememberUsernameinSigninPage(String expected) {
        getReusableActions().staticWait(3000);
        reporterSnapshot(emailInput,expected,"","VALUE");
    }
}
