package com.rogers.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import java.sql.SQLOutput;

public class GeneralEnquiryPage extends BasePage{

    @FindBy(xpath= "//*[@title='Contact us']")
    WebElement ContactUs;

    @FindBy(xpath="//*[contains(text(),'Get in touch')]")
    WebElement generalEnquiry;

    @FindBy(xpath ="(//*[@role='text'])[2]")
    WebElement clickOnYesButton;

    @FindBy(xpath ="(//button[@role='button'])[2]")
    WebElement clickOnNoButton;

    @FindBy(xpath ="//*[contains(text(),'General Inquiry')]")
    WebElement generalInquiry;

    @FindBy(xpath="//*[contains(text(),'Account Maintenance')]")
    WebElement accountMaintenance;

    @FindBy(xpath="//*[contains(text(),' Talk to Us - General Feedback ')]")
    WebElement generalFeedback;

    @FindBy(xpath="//input[@formcontrolname='email']")
    WebElement emailField;

    @FindBy(xpath="(//*[contains(text(),'Invalid email format')])[2]")
    WebElement emailErrorMessage;

    @FindBy(xpath="//*[@formcontrolname='firstName']")
    WebElement firstName;

    @FindBy(xpath="//*[@formcontrolname='lastName']")
    WebElement lastName;

    @FindBy(xpath="//*[@formcontrolname='chatrPhoneNumber']")
    WebElement chatrPhoneNumber;

    @FindBy(xpath="//*[@formcontrolname='phoneNumber']")
    WebElement alternatePhoneNumberField;

    @FindBy(xpath="//*[@formcontrolname='postalCode']")
    WebElement postalCodeField;

    @FindBy(xpath="//*[@formcontrolname='dateOfBirth']")
    WebElement dateOfBirthField;

    @FindBy(xpath="//*[@formcontrolname='askAway']")
    WebElement askAwayField;

    @FindBy(xpath="//*[@formcontrolname='helpSelect']")
    WebElement helpSelect;

    @FindBy(xpath= "//*[contains(text(),' Submit ')]")
    WebElement submitButton;

    @FindBy(xpath = "//*[@id='specificArea']")
    WebElement specificArea;

    @FindBy(xpath="//*[contains(text(),'Price Plan')]")
    WebElement pricePlanOption;

    @FindBy(xpath = "//*[@formcontrolname='phoneNumber']")
    WebElement phoneNumberOption;

    @FindBy(xpath="//div[1]/app-title/div/h1")
    WebElement feedbackMessage;


    public GeneralEnquiryPage(WebDriver driver) {super(driver);}

    public void clickOnContactUs(){
        getReusableActions().javascriptScrollByVisibleElement(ContactUs);
        getReusableActions().clickWhenReady(ContactUs,10);
    }

    public void clickOnGeneralEnquiry(){
        getReusableActions().javascriptScrollByVisibleElement(generalEnquiry);
        getReusableActions().clickWhenReady(generalEnquiry,10);
    }

    public void clickOnYesButton(){
        getReusableActions().clickWhenReady(clickOnYesButton,10);
    }

    public void selectGeneralEnquiry(){
        getReusableActions().javascriptScrollByVisibleElement(helpSelect);
        helpSelect.click();
        //reporter.reportLogWithScreenshot("General Enquiry is Selected");
        reporterSnapshot(helpSelect,"General Enquiry","","NULL");
        getReusableActions().clickWhenReady(generalInquiry,10);
        getReusableActions().staticWait(2000);
    }
    public void setTheProfileDetails(String firstname, String lastname, String email, String phoneNumber, String alternatePhoneNumber){
        getReusableActions().isElementVisible(firstName);
        getReusableActions().javascriptScrollByVisibleElement(firstName);
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        emailField.sendKeys(email);
        chatrPhoneNumber.click();
        chatrPhoneNumber.sendKeys(phoneNumber);
        alternatePhoneNumberField.sendKeys(alternatePhoneNumber);
        //reporter.reportLogWithScreenshot("profile Detail Populated");
        reporterSnapshot(firstName,"Profile Details","","NULL");
    }
    public void setDetailPostalCode(String postalCode){
        postalCodeField.click();
        postalCodeField.sendKeys(postalCode);
    }

    public void setDateOfBirth(String dateOfBirth){
        dateOfBirthField.click();
        dateOfBirthField.sendKeys(dateOfBirth);
    }

    public void setDetailAskAwayField(String askAway){
        getReusableActions().javascriptScrollByVisibleElement(askAwayField);
        getReusableActions().clickWhenReady(askAwayField,10);
        askAwayField.sendKeys(askAway);
        reporterSnapshot(askAwayField,askAway,"","NULL");
    }

    public void clickOnSubmitButton(){
        getReusableActions().javascriptScrollByVisibleElement(submitButton);
        submitButton.isEnabled();
        submitButton.click();
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(feedbackMessage);
        //reporter.reportLogWithScreenshot("Success Feedback Message");
        reporterSnapshot(feedbackMessage,"Success Feedback Message","","NULL");
    }
    
    public void validateErrorMessageForEmail(String email1, String email){
        getReusableActions().javascriptScrollByVisibleElement(emailField);
        emailField.click();
        emailField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        emailField.sendKeys(email1);
        reporter.softAssert(emailErrorMessage.getText().equals("Invalid email format. Email must be xxx@yyy.zzz."),"valid Email Error message","invalid Email Error Message message");
        emailField.sendKeys(email);
    }

    public void validationForOptionalField(){
        getReusableActions().javascriptScrollByVisibleElement(alternatePhoneNumberField);
        alternatePhoneNumberField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        getReusableActions().staticWait(2000);
        reporter.reportLogWithScreenshot("remove the optional field");
    }

    public void selectAccountMaintenance(){
        getReusableActions().javascriptScrollByVisibleElement(helpSelect);
        helpSelect.click();
        reporter.reportLogWithScreenshot("Account Maintenance is selected");
        getReusableActions().clickWhenReady(accountMaintenance,10);
    }

    public void selectGeneralFeedBack(){
        getReusableActions().javascriptScrollByVisibleElement(helpSelect);
        helpSelect.click();
        reporter.reportLogWithScreenshot("General feedback is selected");
        getReusableActions().clickWhenReady(generalFeedback,10);
    }

    public void selectSpecificAreaField(){
        specificArea.click();
        getReusableActions().clickWhenReady(pricePlanOption,10);
    }

    public void clickOnNoButton(){
        getReusableActions().clickWhenReady(clickOnNoButton,10);
    }

    public void setTheProfileDetails(String firstname, String lastname, String email, String phoneNumber){
        getReusableActions().isElementVisible(firstName);
        getReusableActions().javascriptScrollByVisibleElement(firstName);
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        emailField.sendKeys(email);
        phoneNumberOption.click();
        phoneNumberOption.sendKeys(phoneNumber);
        reporter.reportLogWithScreenshot("profile Detail Populated");
    }
}
