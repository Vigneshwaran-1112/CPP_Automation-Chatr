package com.rogers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindAll;
import org.json.JSONArray;
import org.json.JSONObject;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static java.time.LocalDate.parse;
import static java.time.format.DateTimeFormatter.ofPattern;

public class RegisterPage extends BasePage {
    @FindBy(xpath = "//app-register-form/div/form/button/span")
    WebElement registerFormContinueButton;
    @FindBy(xpath = "//span[@role='alert']")
    WebElement errorMessageForValidCtn;
    @FindBy(xpath = "//h1[contains(text(),'Already registered')]")
    WebElement alreadyRegisteredMessage;
    @FindBy(xpath =  "//input[@type='tel']")
    WebElement phoneNumberField;
    @FindBy(xpath = "//a[@title='Select to register yourself on Chatr']")
    WebElement registerButton;
    @FindBy(xpath = "/html/body/pre")
    WebElement otpData;
    @FindBy(xpath = "//ds-code-input/div/div[2]/input")
    WebElement inputCode;
    @FindBy(xpath = "//button[@title='Continue']")
    WebElement continueButton;
    @FindBy(xpath = "//ds-alert/div/div/div/div/div/p")
    WebElement alertMessage;
    @FindBy(xpath = "//button[@title='Close alert']")
    WebElement alertCloseButton;
    @FindBy(xpath = "//div/p[contains(text(),'Too many failed attempt')]")
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
    @FindBy(xpath = "//ds-error/span[2]")
    WebElement errorMessage;
    @FindAll({
            @FindBy(xpath = "//span[contains(text(),'Continue') or contains(text(),'Continuer')]/ancestor::button"),
            @FindBy (xpath = "//button[contains(text(),'Continue') or contains(text(),'Continuer')]"),
            @FindBy (xpath = "//button[@class='w-100 mb-16 ds-button ds-corners ds-pointer text-center mw-100 d-inline-block -primary -large']")
    })
    WebElement btnContinue;
    @FindBy(xpath = "//input[@title='Enter your new password']")
    WebElement newPasswordInput;
    @FindBy(xpath = "//input[@title='Enter your new password again to confirm.']")
    WebElement confirmPasswordInput;
    @FindBy(xpath = "//button[@title='Change Password']")
    WebElement continueButtonInPasswordChange;
    @FindBy(xpath = "//span[contains(text(),'Success')]")
    WebElement successMessage;
    @FindBy(xpath = "//a[contains(text(),'account information.')]")
    WebElement accountInformation;
    @FindBy(xpath = "//p[contains(text(),'match our records')]")
    WebElement incorrectDetailsErrorMessage;
    @FindBy(xpath = "//input[@formcontrolname='postalcode']")
    WebElement postalCodeInputRecoverPage;
    @FindBy(xpath = "//input[@formcontrolname='dob']")
    WebElement dateOfBirthInputRecoverPage;
    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    WebElement continueCTA;
    @FindBy(xpath = "//input[@formcontrolname='phonenumber']")
    WebElement phoneNumberInputRecoverPage;
    @FindBy(xpath = "//h1[contains(text(),'Too many')]")
    WebElement failedAttempts;
    @FindBy(xpath = "(//button[@role='button'])[3]")
    WebElement textField;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    public void validateAlreadyRegisterPhoneNumber(String phoneNumber){
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
        reporterSnapshot(phoneNumberField,phoneNumber,"","NULL");
        registerFormContinueButton.click();
        getReusableActions().staticWait(2000);
        reporterSnapshot(alreadyRegisteredMessage,"Already registered","","Common");
    }
    public void validateIncorrectNumberLength(String phoneNumber){
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
        reporterSnapshot(phoneNumberField,phoneNumber,"","NULL");
        registerFormContinueButton.click();
        getReusableActions().staticWait(2000);
        reporterSnapshot(errorMessageForValidCtn,"10 DIGITS","","common");
    }
    public void validateInValidNumber(String phoneNumber){
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
        reporterSnapshot(phoneNumberField,phoneNumber,"","NULL");
        registerFormContinueButton.click();
        getReusableActions().staticWait(2000);
        reporterSnapshot(errorMessageForValidCtn,"FIND AN ACCOUNT FOR THIS PHONE NUMBER","","common");
    }
    public void validateMessageForRegisterNumber(String phoneNumber){
        getReusableActions().clickWhenReady(phoneNumberField);
        phoneNumberField.sendKeys(phoneNumber);
        registerFormContinueButton.click();
        getReusableActions().staticWait(2000);
        reporter.softAssert(alreadyRegisteredMessage.getText().equals("Phone number already registered"),"Already Registered Message","Not registered Message");
    }

    public String getPhoneNumberOtp(String phoneNumber){
        String code = "";
        getReusableActions().switchToNewWindow();
        String data = otpData.getText();
        JSONArray jsonArray = new JSONArray(data);
        for(int i=0;i< jsonArray.length();i++){
            JSONObject  jsonObject = jsonArray.getJSONObject(i);
            if(jsonObject.optString("ctn").equals(phoneNumber.replace("-",""))){
                System.out.println(jsonObject.optString("code"));
                code = jsonObject.optString("code");
            }
        }
        reporter.reportLogWithScreenshot("OTP code generated");
        getReusableActions().closeCurrentWindow();
        getReusableActions().switchToMainWindow();
        return code;
    }
    public void enterCode(String code){
        getReusableActions().getWhenReady(inputCode).sendKeys(code);
        getReusableActions().staticWait(2000);
        reporter.reportLogWithScreenshot("OTP code entered");
    }
    public void clickContinue(){
        getReusableActions().clickWhenReady(continueButton,10);
        getReusableActions().staticWait(5000);
    }

    public void validateInvalidEmail(){
        getReusableActions().isElementVisible(emailInput,10);
        emailInput.click();
        getReusableActions().getWhenReady(emailInput).sendKeys("test123");
        getReusableActions().clickWhenReady(continueButtonInEmail);
        reporter.softAssert(errorMessage.getText().trim().equals("Please enter a valid email"),"Valid error message","Invalid Error message");
    }
    public void validateExistingMail(String existingMail){
        getReusableActions().isElementVisible(emailInput,10);
        if(!(emailInput.getAttribute("value").isEmpty())) {
            getReusableActions().clickWhenReady(emailClearButton);
        }
        emailInput.click();
        getReusableActions().getWhenReady(emailInput).sendKeys(existingMail);
        getReusableActions().clickWhenReady(continueButtonInEmail);
        reporter.softAssert(getReusableActions().isElementVisible(resetPasswordButton)
                        && getReusableActions().isElementVisible(signInButton)
                        && emailAlreadyRegisteredMessage.getText().trim().contains("Email already registered"),
                "Valid Existing mail message","Invalid Message for existing email");
    }
    public String emailGenerator(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("MMMMyyyyddHHmm");
        String formattedValue = formatter.format(cal.getTime());
        String emailGenerated = formattedValue+"@rci.rogers.com";
        return emailGenerated;
    }
    public void enterEmail(String email){
        getReusableActions().isElementVisible(emailInput,10);
        if(!(emailInput.getAttribute("value").isEmpty())) {
            getReusableActions().clickWhenReady(emailClearButton);
        }
        emailInput.click();
        getReusableActions().getWhenReady(emailInput).sendKeys(email);
        reporter.reportLogWithScreenshot(email + " is entered");
        getReusableActions().clickWhenReady(continueButtonInEmail);
        getReusableActions().staticWait(10000);
    }
    public boolean isMFAPresent(){
        if (getReusableActions().isElementVisible(mfaWindow, 10)) {
            return true;
        }
        return  false;
    }
    public void clickVerifyEmail(){
        getReusableActions().clickWhenReady(emailButton,5);
        reporter.reportLogWithScreenshot("email button is clicked");
    }
    public void enterEmailVerificationCode(String recoveryCode){
        ArrayList<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(0));
        System.out.println(getDriver().getTitle());
        getReusableActions().getWhenReady(inputCode).sendKeys(recoveryCode);
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(btnContinue);
        reporter.reportLogWithScreenshot("recovery code provided");
    }
    public void setPassword(String password){
        getReusableActions().isElementVisible(newPasswordInput,10);
        newPasswordInput.click();
        getReusableActions().getWhenReady(newPasswordInput).sendKeys(password);
        reporter.reportLogWithScreenshot("Password set");
        confirmPasswordInput.click();
        getReusableActions().getWhenReady(confirmPasswordInput).sendKeys(password);
        getReusableActions().clickWhenReady(continueButtonInPasswordChange);
    }
    public  void validateSuccessRegisterMessage(){
        reporter.softAssert(getReusableActions().isElementVisible(successMessage,10),"Registration Successful","registration Unsuccessful");
    }
    public void clickAccountInformation() {
        getReusableActions().clickWhenReady(accountInformation, 10);
        reporterSnapshot(accountInformation,"account Information","","NULL");
    }
    public void populateThreeRecoverFields(String postalCode){
        getReusableActions().staticWait(2000);
        phoneNumberInputRecoverPage.click();
        phoneNumberInputRecoverPage.sendKeys("0123456789");
        postalCodeInputRecoverPage.click();
        postalCodeInputRecoverPage.sendKeys(postalCode);
        Format f = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = f.format(new Date());
        System.out.println(strDate);
        dateOfBirthInputRecoverPage.click();
        dateOfBirthInputRecoverPage.sendKeys(strDate);
    }
    public void clickOnContinue(){
        getReusableActions().isElementVisible(continueCTA);
        continueCTA.click();
    }
    public void validateIncorrectDetailsMessage(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(incorrectDetailsErrorMessage);
        reporterSnapshot(incorrectDetailsErrorMessage,"t match our records","","Common");
    }
    public void enterPhoneNumber(String phoneNumber) {
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
    }
    public void validateErrormsgForExceededAttempts(String phoneNumber){
        getReusableActions().staticWait(2000);
        phoneNumberField.click();
        //getReusableActions().clickWhenReady(phoneNumberField);
        phoneNumberField.sendKeys(phoneNumber);
        registerFormContinueButton.click();
        getReusableActions().staticWait(2000);
    }

    public void enterCodeForExceeds(String code) {
        for (int i = 1; i <= 5; i++) {
            getReusableActions().staticWait(3000);
            if (getDriver().findElements(By.xpath("//h1[contains(text(),'Too many')]")).size() > 0 )
            {
                reporterSnapshot(failedAttempts,"too many","","Common");
                break;
            }
            else {
                continueButton.click();
                getReusableActions().staticWait(3000);
            }
        }
    }
}
