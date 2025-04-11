package com.rogers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeadGenPage extends BasePage {

    @FindBy(xpath="//*[@formcontrolname='firstname']")
    WebElement firstNameInput;
    @FindBy(xpath="//*[@formcontrolname='lastname']")
    WebElement lastNameInput;
    @FindBy(xpath="//*[@formcontrolname='email']")
    WebElement emailInput;
    @FindBy(xpath="//*[@formcontrolname='phonenumber']")
    WebElement phoneNumberInput;
    @FindBy(xpath="//*[@formcontrolname='postalcode']")
    WebElement postalCodeInput;
    @FindBy(xpath="//div[1]/form/ds-checkbox/label/div[1]")
    WebElement checkboxInput;
    @FindBy(xpath="(//*[@role='button'])[1]")
    WebElement submitBtn;
    @FindBy(xpath="//*[contains(text(),' Thanks for joining us! ')]")
    WebElement successMessage;
    @FindBy(xpath="(//*[contains(text(),'Please fill out this field')])[1]")
    WebElement postalCodeErrorMessage;
    @FindBy(xpath="//div[1]/form/ds-error/span[1]")
    WebElement ConsentErrorMessage;
    @FindBy(xpath="(//*[contains(text(),'Please fill out this field')])[2]")
    WebElement firstNameErrorMessage;
    @FindBy(xpath="(//*[contains(text(),'Please fill out this field')])[4]")
    WebElement lastNameErrorMessage;
    @FindBy(xpath="(//*[contains(text(),'Please fill out this field')])[6]")
    WebElement emailErrorMessage;
    @FindBy(xpath="//*[@formcontrolname='currentprovider']")
    WebElement currentCarrier;

    public LeadGenPage(WebDriver driver){super(driver);}

    public void setUserDetails(String firstName, String lastName, String email, String phoneNumber, String postalCode){
        getReusableActions().javascriptScrollByVisibleElement(firstNameInput);
        getReusableActions().isElementVisible(firstNameInput,10);
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        phoneNumberInput.sendKeys(phoneNumber.replace("-",""));
        postalCodeInput.click();
        postalCodeInput.sendKeys(postalCode);
        pageZoomin(firstNameInput,67,firstNameInput,"User Details","NULL");
        //reporterSnapshot(firstNameInput,"User Details","","NULL");
    }
    public void selectCurrentCarrier(String provider){
        getReusableActions().javascriptScrollByVisibleElement(currentCarrier);
        getReusableActions().isElementVisible(currentCarrier);
        getReusableActions().clickWhenReady(currentCarrier);
        reporter.reportLogWithScreenshot("List of the providers");
        getReusableActions().selectWhenReady(currentCarrier,provider);
        reporter.reportLogWithScreenshot("Select the provider");
    }

    public void clickOnTermAndConditions(){
        getReusableActions().javascriptScrollByVisibleElement(checkboxInput);
        getReusableActions().isElementVisible(checkboxInput,10);
        checkboxInput.click();
        getReusableActions().staticWait(1000);
        reporterSnapshot(checkboxInput,"Terms and Conditions","","NULL");
    }
    public void submitButton(){
        getReusableActions().isElementVisible(submitBtn,10);
        scrollToMiddleOfElement(submitBtn);
        submitBtn.click();
        getReusableActions().staticWait(2000);
        reporterSnapshot(submitBtn,"Submit","","NULL");

    }

    public void validateSuccessMessage(){
        getReusableActions().staticWait(4000);
        //reporter.softAssert(successMessage.getText().equals("Thanks for joining us! Get ready for great offers delivered right to your inbox."), successMessage.getText(),"unsuccessful message");
        reporterSnapshot(successMessage,"Thanks for joining us! Get ready for great offers delivered right to your inbox.","","Gen");
    }
    public void validateErrorMessages(){
        getReusableActions().isElementVisible(firstNameErrorMessage,10);
        getReusableActions().javascriptScrollByVisibleElement(firstNameErrorMessage);
        reporter.softAssert(firstNameErrorMessage.getText().equals("Please fill out this field"),firstNameErrorMessage.getText() ,"Invalid Error Message");
        getReusableActions().isElementVisible(lastNameErrorMessage,10);
        reporter.softAssert(lastNameErrorMessage.getText().equals("Please fill out this field"),lastNameErrorMessage.getText(),"Invalid Error Message");
        getReusableActions().isElementVisible(emailErrorMessage,10);
        reporter.softAssert(emailErrorMessage.getText().equals("Please fill out this field"),emailErrorMessage.getText(),"Invalid Error Message");
        getReusableActions().isElementVisible(postalCodeErrorMessage,10);
        reporter.softAssert(postalCodeErrorMessage.getText().equals("Please fill out this field"),postalCodeErrorMessage.getText(),"Invalid Error message");
        reporter.reportLogWithScreenshot("Error Message Display");
        getReusableActions().isElementVisible(ConsentErrorMessage,10);
        reporter.softAssert(ConsentErrorMessage.getText().equals("Your consent is required"),ConsentErrorMessage.getText(),"invalid message");
    }
    public void validatePostalCodeErrorMessage(){
        scrollToMiddleOfElement(postalCodeErrorMessage);
        reporterSnapshot(postalCodeErrorMessage,"Please fill out this field","","GEN");
    }
    public void validateConsentErrorMessage() {
        getReusableActions().javascriptScrollByVisibleElement(checkboxInput);
        reporterSnapshot(ConsentErrorMessage,"Your consent is required","","GEN");
    }
}
