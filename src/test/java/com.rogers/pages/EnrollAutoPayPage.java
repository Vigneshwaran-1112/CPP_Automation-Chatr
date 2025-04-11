package com.rogers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static java.time.format.DateTimeFormatter.ofPattern;

public class EnrollAutoPayPage extends BasePage {
    @FindBy(xpath = "//span[contains(text(),'Enroll')]")
    WebElement enrollCTA;
    @FindBy(xpath = "//h3[contains(text(),'Enroll in auto-pay')]")
    WebElement subscribeText;
    @FindBy(xpath = "//input[@inputmode='numeric']")
    WebElement extraMoneyInput;
    @FindBy(xpath = "(//*[contains(text(),'Extra money')])")
    WebElement extraMoneyText;
    @FindBy(xpath = "//span[text()='Extra money']")////span[text()='Extra money']/following-sibling::ds-price
    WebElement extraMoneyAmount;
    @FindBy(xpath = "//ds-error")
    WebElement errorAmount;
    @FindBy(xpath = "//span[text()='Proceed']")
    WebElement proceedCTA;
    @FindBy(xpath = "//h3[contains(text(),'Select credit card')]")
    WebElement selectCreditCardText;
    @FindBy(xpath = "//p[contains(text(),'Services')]")
    WebElement servicesTextStepper;
    @FindBy(xpath = "//p[contains(text(),'Payment details')]")
    WebElement paymentTextStepper;
    @FindBy(xpath = "(//p[contains(text(),'Review')])[2]")
    WebElement reviewTextStepper;
    @FindBy(xpath = "//p[contains(text(),'Success')]")
    WebElement successTextStepper;
    @FindBy(xpath = "//input[@id='credit-card-input']")
    WebElement creditCardInput;
    @FindBy(xpath = "//input[@id='month-year-input']")
    WebElement monthInput;
    @FindBy(xpath = "//input[@id='security-code-input']")
    WebElement ccvInput;
    @FindBy(xpath = "//input[@formcontrolname='firstName']")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@formcontrolname='lastName']")
    WebElement lastNameField;
    @FindBy(xpath = "//app-address-autocomplete//input")
    WebElement addressInput;
    @FindBy(xpath = "//ul[@role='listbox']/li")
    WebElement autoCompleteAddress;
    @FindBy(xpath = "//input[@formcontrolname='postalCode']")
    WebElement postalCode;
    @FindBy(xpath = "//ds-checkbox[@formcontrolname='saveCard']")
    WebElement saveCardCheckbox;
    @FindBy(xpath = "//span[contains(text(),'Agree')]")
    WebElement saveCardCheckboxError;
    @FindBy(xpath = "//h3[contains(text(),'Review autopay subscription')]")
    WebElement reviewAutopayBanner;
    @FindBy(xpath = "//h3[contains(text(),'List of services to be included to autopay')]")
    WebElement reviewServicesBanner;
    @FindBy(xpath = "//h3[contains(text(),'Autopay credit card')]")
    WebElement reviewCreditCardBanner;
    @FindBy(xpath = "//h3[contains(text(),'List of services to be included to autopay')]/following::a[@title=' Step 1 desc']")
    WebElement editStepOneCTA;
    @FindBy(xpath = "//h3[contains(text(),'Autopay credit card')]/following::a[@title=' Step 2 desc']")
    WebElement editStepTwoCTA;
    @FindBy(xpath = "//button[@variant='secondary']")
    WebElement backCTA;
    @FindBy(xpath = "(//a[@aria-labe='Sign into my chatr'])[3]")
    WebElement myChatrCTA;
    @FindBy(xpath = "//input[@formcontrolname='firstName']/following::ds-error[1]")
    WebElement firstNameFieldError;
    @FindBy(xpath = "//input[@formcontrolname='lastName']/following::ds-error[1]")
    WebElement lastNameFieldError;
    @FindBy(xpath = "//app-address-autocomplete//input/following::ds-error[1]")
    WebElement addressInputError;
    @FindBy(xpath = "//input[@formcontrolname='city']/following::ds-error[1]")
    WebElement cityInputError;
    @FindBy(xpath = "//input[@formcontrolname='postalCode']/following::ds-error[1]")
    WebElement postalCodeError;
    @FindBy(xpath = "//ds-selection[@class='ds-radioButton']")
    WebElement cardIsExisting;
    @FindBy(xpath = "//*[contains(text(),'Saved Cards')]")
    WebElement savedCardsBanner;
    @FindBy(xpath = "//h3[contains(text(),'Select credit card')]")
    WebElement selectCreditCardBanner;
    @FindBy(xpath = "//*[contains(text(),'Are you sure you want to leave this page?')]")
    WebElement backLeaveBanner;
    @FindBy(xpath = "//*[contains(text(),'Stay on page')]")
    WebElement stayPageCTA;
    @FindBy(xpath = "//*[contains(text(),'Leave page')]")
    WebElement leavePageCTA;
    @FindBy(xpath = "//ds-selection[@class='ds-radioButton']/following::p[contains(text(),'card')]")
    WebElement addCardCard;
    @FindBy(xpath = "//iframe[@class]")
    WebElement ccDetailsFrame;
    @FindBy(xpath = "//div[@class='ds-checkbox__box my-12']") // //input[@id='ds-checkbox-id-4']
    WebElement termsAndCondition;
    @FindBy(xpath = "//div[contains(text(),'nrolled')]")
    WebElement enrollAutoPay;
    @FindBy(xpath = "(//input[@inputmode='numeric'])[1]")
    WebElement paymentExtraInput;
    @FindBy(xpath = "//span[contains(text(),'Unenroll')]")
    WebElement unEnrollAutoPay;
    @FindAll({@FindBy(xpath = "//span[contains(text(),'Enroll')]"),@FindBy(xpath = "//p[contains(text(),'Enroll')]"),@FindBy(xpath = "//p[normalize-space()='Enroll']")})//p[contains(text(),'Enroll')]  //span[contains(text(),'Enroll')]//p[normalize-space()='Enroll']
    WebElement enrolltoAutoPay;
    @FindBy(xpath = "//div[contains(text(),'nroll')]/following-sibling::div")
    WebElement enrollInAutoPay;
    @FindBy(xpath = "//div[contains(text(),'Extra money')]/following-sibling::ds-price")
    WebElement extraMoneyDetail;
    @FindBy(xpath = "//div[contains(text(),'Auto-pay')]/following-sibling::a")
    WebElement editStepThreeCTA;
    @FindBy(xpath = "(//div[contains(text(),'Monthly service')])[1]")
    WebElement monthlyServiceDetails;
    @FindBy(xpath = "//div[@class='text-overline']")
    WebElement autoPaySection;
    @FindBy(xpath = "//input[@value='[object Object]']/following-sibling::span")
    WebElement saveCreditCard;
    @FindBy(xpath = "//span[@aria-relevant='additions']")
    WebElement errorSaveCC;
    @FindBy(xpath = "//span[@aria-live='polite']/child::p")
    WebElement errorEnrollment;
    @FindBy(xpath = "//p[normalize-space()='Add a card']")
    WebElement ppcAddNewCC;
    @FindBy(xpath = "//span[normalize-space()='Monthly auto-pay total:']/following-sibling::ds-price")
    WebElement ppcExtraMoneyDetail;
    @FindBy(xpath = "//p[contains(text(),'Add a card')]")
    WebElement addCardOption;
    @FindBy(xpath = "//span[contains(text(),'Unenroll')]")
    WebElement unEnrollFlow;
    @FindBy(xpath = "//p[contains(text(),'sure you want to unenroll')]")
    WebElement confirmationTiltleText;
    @FindBy(xpath = "(//span[contains(text(),'Unenroll')])[2]")
    WebElement yesUnEnroll;
    @FindBy(xpath = "//span[contains(text(),'Stay')]")
    WebElement noStayEnrolled;
    @FindBy(xpath = "(//span[@role='img'])[5]")
    WebElement crossMark;
    @FindBy(xpath = "//span[contains(text(),\" Show top-up options \")]")
    List<WebElement> showTopUpOptions;
    @FindBy(xpath = "//h3[contains(text(),'Successfully enroll')]")
    WebElement successText;
    @FindBy(xpath = "(//span[contains(text(),'Error! Agree to the terms')])")
    WebElement errorText;
    @FindBy(xpath = "//span[contains(text(),'Stay on')]")
    WebElement stayOnPage;
    @FindBy(xpath = "//span[contains(text(),'Leave page')]")
    WebElement leavePage;
    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    WebElement continueCTA;
    @FindBy(xpath = "//h3[contains(text(),'Auto-pay card')]")
    WebElement reviewCreditCard;
    @FindBy(xpath = "//h3[contains(text(),'Services included in auto-pay')]")
    WebElement reviewService;
    @FindBy(xpath = "//p[contains(text(),'payment card')]")
    WebElement errorTextInPayment;
    @FindBy(xpath = "//span[@class='text-bold ml-4 mt-4']")
    WebElement dateFromSuccessPage;
    @FindBy(xpath = "//a[contains(text(),'My chatr')]") //a[contains(@aria-label,'Sign in now')]")  (//a[@title='Sign into my chatr'])[1]
    WebElement signInCTA;
    @FindBy(xpath = "//p[contains(text(),'Add a card')]")
    List <WebElement> addCardOptionList;
    @FindBy(xpath = "//p[contains(text(),'t enroll')]")
    WebElement unEnrollAutoPayBtn;
    @FindBy(xpath = "//p[contains(text(),'Enroll')]")
    WebElement enrollAutoPayBtn;
    public EnrollAutoPayPage(WebDriver driver){ super(driver); }
    public void enrollAutopay(){
        getReusableActions().staticWait(9000);
        /*getReusableActions().javascriptScrollByVisibleElement(enrollCTA);*/
        scrollToMiddleOfElement(enrollCTA);
        getReusableActions().clickWhenReady(enrollCTA,10);
        getReusableActions().staticWait(4000);
        reporterSnapshot(subscribeText,subscribeText.getText(),"","display");
    }
    public void addExtraMoney(String money){
        getReusableActions().staticWait(5000);
        //getReusableActions().javascriptScrollByVisibleElement(extraMoneyInput);
        scrollToMiddleOfElement(extraMoneyInput);
        extraMoneyInput.click();
        extraMoneyInput.sendKeys(money);
        extraMoneyInput.sendKeys(Keys.TAB);
        //reporter.reportLogWithScreenshot("extra money enter");
        //subscribeText.click();
        //getReusableActions().isElementVisible(extraMoneyText,10);
        getReusableActions().staticWait(2000);
       // getReusableActions().javascriptScrollByVisibleElement(extraMoneyInput);
        scrollToMiddleOfElement(extraMoneyInput);
        //reporter.softAssert(extraMoneyAmount.isDisplayed(),"Extra money is appearing","Extra money is not appearing");
        reporterSnapshot(extraMoneyAmount,"Extra Money","","display");
    }
    public void validateAddExtraMoneyError(){
        getReusableActions().staticWait(5000);
/*        getReusableActions().javascriptScrollByVisibleElement(ppcExtraMoneyDetail);
        String strExistVal = ppcExtraMoneyDetail.getText().replace("\n","").replace("$","");
        String[] strArray=strExistVal.split("\\.");
        String extraMoney = strArray[0];
        int iextraMoney = 301 - Integer.parseInt(extraMoney);
        extraMoney = Integer.toString(iextraMoney);*/
        getReusableActions().javascriptScrollByVisibleElement(extraMoneyInput);
        extraMoneyInput.click();
        extraMoneyInput.sendKeys("300");
        getReusableActions().staticWait(3000);
        reporterSnapshot(errorAmount,"exceed $300","","common");
    }
    public void validateEnrollAutoPayScreen(){
        reporter.softAssert(subscribeText.isDisplayed(),"Services page is still shown","Services page is not shown");
    }
    public void clickOnProceed(){
        //getReusableActions().clickWhenReady(proceedCTA,10);
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(proceedCTA);
        proceedCTA.click();
        getReusableActions().staticWait(5000);
    }
    public void validatePaymentDetails(){
        reporter.softAssert(selectCreditCardText.isDisplayed(),"Select credit card text is appearing","Select credit card text is not appearing");
    }
    public void validateStepper(){
        getReusableActions().scrollToElement(servicesTextStepper);
        servicesTextStepper.isDisplayed();
        paymentTextStepper.isDisplayed();
        servicesTextStepper.isDisplayed();
        reporter.softAssert(getReusableActions().isElementVisible(reviewTextStepper),"Stepper is appearing","Stepper is not appearing");
    }
    public void setPaymentInfo(String creditCard, String expDate, String cvv){
        //if(getReusableActions().isElementVisible(savedCardsBanner)){
            //cardIsExisting.click();
        //} else {
            getReusableActions().staticWait(2000);
            getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame, 30);
            getReusableActions().javascriptScrollByVisibleElement(creditCardInput);
            getReusableActions().staticWait(1000);
            getReusableActions().clickWhenReady(creditCardInput, 10);
            creditCardInput.sendKeys(creditCard);
            getReusableActions().clickWhenReady(monthInput, 10);
            monthInput.sendKeys(expDate);
            getReusableActions().clickWhenReady(ccvInput, 10);
            ccvInput.sendKeys(cvv);
            //reporter.reportLogWithScreenshot("Credit card details are populated");
            reporterSnapshot(creditCardInput,"Credit Card Details","","NULL");
            getDriver().switchTo().defaultContent();
        //}
    }
    public void setAddress(String city){
        if(getReusableActions().isElementVisible(savedCardsBanner)){
            //cardIsExisting.click();
        } else {
            getReusableActions().javascriptScrollByVisibleElement(addressInput);
            addressInput.click();
            addressInput.sendKeys(city);
            getReusableActions().isElementVisible(autoCompleteAddress, 10);
            getReusableActions().clickWhenReady(autoCompleteAddress, 10);
            //Second time Address is Populating
            getReusableActions().isElementVisible(autoCompleteAddress, 10);
            getReusableActions().clickWhenReady(autoCompleteAddress, 10);
            waitForAttributeToBeNotEmpty(postalCode, "value", 10);
            reporter.reportLogWithScreenshot("Address is populated");
        }
    }
    public void setName(String firstName, String lastName){
        //if(getReusableActions().isElementVisible(savedCardsBanner)){
        //} else {
            firstNameField.sendKeys(firstName);
            lastNameField.sendKeys(lastName);
            scrollToMiddleOfElement(lastNameField);
            reporterSnapshot(lastNameField,"First Name , Last Name","","DISPLAY");
            getReusableActions().staticWait(2000);
        //}
    }
    public void clickOnAddNewCC(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(ppcAddNewCC);
        ppcAddNewCC.click();
    }
    public void validateCheckboxError(){
        getReusableActions().staticWait(5000);
        //reporter.softAssert(saveCardCheckboxError.getText().equals("Please, check the checkbox in order to proceed"),saveCardCheckbox.getText() + " is showing","No error on checkbox");
        reporterSnapshot(saveCardCheckboxError,"Agree","","common");
    }
    public void clickOnSaveCardCheckbox(){
        if(getReusableActions().isElementVisible(savedCardsBanner)){
        } else {
            getReusableActions().clickWhenReady(saveCardCheckbox, 10);
        }
    }
    public void validateReviewPage(){
        reviewAutopayBanner.isDisplayed();
        reviewServicesBanner.isDisplayed();
        editStepOneCTA.isDisplayed();
        reviewCreditCardBanner.isDisplayed();
        reporter.softAssert(getReusableActions().isElementVisible(editStepTwoCTA),"Review page is appearing","Review elements are not appearing");
    }
    public void clickOnBack(){
        getReusableActions().clickWhenReady(backCTA,10);
    }
    public void clickOnMyChatr(){
        getReusableActions().clickWhenReady(signInCTA,10);
    }
    public void validateAddressErrors(){
        firstNameFieldError.isDisplayed();
        lastNameFieldError.isDisplayed();
        addressInputError.isDisplayed();
        cityInputError.isDisplayed();
        reporter.softAssert(getReusableActions().isElementVisible(postalCodeError),"The errors in address fields are being displayed","The errors in address fields are not being displayed");
    }
    public void clickOnReviewStepOne(){
        editStepOneCTA.click();
    }
    public void clickOnReviewStepTwo(){
        editStepTwoCTA.click();
    }
    public void validateExistingCard(){
        selectCreditCardBanner.isDisplayed();
        reporter.softAssert(getReusableActions().isElementVisible(cardIsExisting),"Credit Card is existing","There is no credit card stored");
    }
    public void validateBackModal(){
        backLeaveBanner.isDisplayed();
        leavePageCTA.isDisplayed();
        reporter.softAssert(getReusableActions().isElementVisible(stayPageCTA),"Back modal is showing","back modal is not showing");
    }
    public void clickOnAddCard(){
        getReusableActions().javascriptScrollByVisibleElement(saveCreditCard);
        if(addCardCard.isDisplayed()) {
            getReusableActions().clickWhenReady(addCardCard, 10);
            getReusableActions().staticWait(3000);
        } else {
            reporter.reportLogFail("This account doesnt have an existing credit card");
        }
    }
    public void setPaymentInfoAddCard(String creditCard, String expDate, String cvv){
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame, 30);
        getReusableActions().clickWhenReady(creditCardInput, 10);
        creditCardInput.sendKeys(creditCard);
        getReusableActions().clickWhenReady(monthInput, 10);
        monthInput.sendKeys(expDate);
        getReusableActions().clickWhenReady(ccvInput, 10);
        ccvInput.sendKeys(cvv);
        reporter.reportLogWithScreenshot("Credit card details are populated");
        getDriver().switchTo().defaultContent();
    }
    public void validatePaymentInfoCC(){
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame, 30);
        reporterSnapshot(creditCardInput,"credit Card","","display");
        reporterSnapshot(monthInput,"Expiry Date","","display");
        reporterSnapshot(ccvInput,"CVV","","display");
        getDriver().switchTo().defaultContent();
    }
    public void setAddressAddCard(String city){
        getReusableActions().javascriptScrollByVisibleElement(addressInput);
        addressInput.click();
        addressInput.sendKeys(city);
        getReusableActions().isElementVisible(autoCompleteAddress, 10);
        getReusableActions().clickWhenReady(autoCompleteAddress, 10);
        //Second time Address is Populating
        getReusableActions().isElementVisible(autoCompleteAddress, 10);
        getReusableActions().clickWhenReady(autoCompleteAddress, 10);
       // waitForAttributeToBeNotEmpty(postalCode, "value", 20);
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScript("document.body.style.zoom='70%'");
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(firstNameField);
        reporter.reportLogWithScreenshot("Address is populated");
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(2000);
    }
    public void setNameAddCard(String firstName, String lastName){
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
    }
    public void clickOnSaveCardCheckboxAddCard(){
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(saveCardCheckbox, 10);
        getReusableActions().staticWait(3000);
    }
    public void validateTermsAndConditions(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(termsAndCondition);
        reporterSnapshot(termsAndCondition,"Tearms and Condition","","display");
        termsAndCondition.click();
        //reporter.softAssert(getReusableActions().isElementVisible(termsAndCondition),"The terms and conditions is appearing","T&C not appearing");
    }
    public void clickOnEnrollAutopay(){
        getReusableActions().staticWait(2000);
        scrollToMiddleOfElement(enrolltoAutoPay);
        getReusableActions().staticWait(1000);
        reporterSnapshot(enrolltoAutoPay,"enroll to AutoPay","","NULL");
        getReusableActions().executeJavaScriptClick(enrolltoAutoPay);
        getReusableActions().staticWait(4000);
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(subscribeText);
        reporterSnapshot(subscribeText,"AutoPay Service Page","","NULL");
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(4000);
    }
    public void setExtraMoneyInPayment(String money){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(paymentExtraInput);
        paymentExtraInput.click();
        paymentExtraInput.sendKeys(money);
        paymentExtraInput.sendKeys(Keys.TAB);
        //reporter.reportLogWithScreenshot("extra money added");
        reporterSnapshot(paymentExtraInput,money,"","NULL");
    }
    public void clickOnUnEnrollAutoPay(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(unEnrollAutoPayBtn);
        //reporter.softAssert(enrolltoAutoPay.isDisplayed(),"unEnroll Autopay display","unEnroll Autopay not display");
        getReusableActions().isElementVisible(unEnrollAutoPayBtn);
        //unEnrollAutoPayBtn.click();
        getReusableActions().executeJavaScriptClick(unEnrollAutoPayBtn);
        reporterSnapshot(unEnrollAutoPayBtn,"Unenroll to AutoPay","","NULL");
    }
    public void clickOnEnrollAutoPay(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(enrollAutoPayBtn);
        //reporter.softAssert(enrolltoAutoPay.isDisplayed(),"unEnroll Autopay display","unEnroll Autopay not display");
        getReusableActions().isElementVisible(enrollAutoPayBtn);
        getReusableActions().executeJavaScriptClick(enrollAutoPayBtn);
        //enrolltoAutoPay.click();
        reporterSnapshot(enrollAutoPayBtn,"enroll to AutoPay","","NULL");
    }
    public void validateAutoPayEnroll(){
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollByVisibleElement(enrollInAutoPay);
        getReusableActions().isElementVisible(enrollInAutoPay);
        //reporter.softAssert(enrollInAutoPay.getText().equals("Yes"),"customer is enroll :"+enrollInAutoPay.getText(),"not enroll");
        reporterSnapshot(enrollInAutoPay,"Enroll","","common");
    }
    public void clickOnReviewStepThree(){
        editStepThreeCTA.click();
        getReusableActions().staticWait(2000);
        getDriver().switchTo().alert().dismiss();
    }
    public void modifyAddExtraMoney(String money){
        getReusableActions().javascriptScrollByVisibleElement(extraMoneyInput);
        getReusableActions().staticWait(2000);
        extraMoneyInput.click();
        extraMoneyInput.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        extraMoneyInput.sendKeys(money);
        getReusableActions().staticWait(2000);
        extraMoneyInput.sendKeys(Keys.TAB);
        getReusableActions().staticWait(2000);
        //subscribeText.click();
        getReusableActions().isElementVisible(extraMoneyText,10);
        reporter.softAssert(extraMoneyAmount.isDisplayed(),"Extra money is appearing","Extra money is not appearing");
    }
    public String getExtraMoney(){
        getReusableActions().javascriptScrollByVisibleElement(extraMoneyDetail);
        getReusableActions().isElementVisible(extraMoneyDetail);
        reporter.reportLogWithScreenshot("extra money in autoPay");
        String money =extraMoneyDetail.getText();
        return money;
    }
    public void validateModifiedExtraMoney(String previewInputAmount){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(monthlyServiceDetails);
        getReusableActions().isElementVisible(extraMoneyDetail);
        reporter.softAssert(!extraMoneyDetail.getText().equals(previewInputAmount),"extra money is modified","extra money not modified");
    }
    public void selectTheSaveCreditCard(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(saveCreditCard);
        getReusableActions().isElementVisible(saveCreditCard);
        //saveCreditCard.click();
        getReusableActions().executeJavaScriptClick(saveCreditCard);
        reporterSnapshot(saveCreditCard,"Saved Credit Card","","Display");
        getReusableActions().staticWait(2000);
    }
    public void validateExtraMoneyReflect(String Money){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(monthlyServiceDetails);
        getReusableActions().isElementVisible(extraMoneyDetail);
        System.out.println("extra money  "+extraMoneyDetail.getText());
        String amount =extraMoneyDetail.getText().replaceAll("\\n","");
        System.out.println("++++++ "+amount);
        String extraAmount ="$"+Money+".00/mo.";
        System.out.println("****** "+extraAmount);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(amount.equals(extraAmount),"extra money is reflect","extra money not reflect");
        reporterSnapshot(extraMoneyDetail,amount,extraAmount,"compare");
    }
    public void validateErrorMessageForSaveCC(){
        getReusableActions().javascriptScrollByVisibleElement(proceedCTA);
        getReusableActions().staticWait(2000);
        proceedCTA.click();
        getReusableActions().staticWait(5000);
        proceedCTA.click();
        getReusableActions().javascriptScrollByVisibleElement(errorSaveCC);
        //reporter.softAssert(errorSaveCC.getText().equals("Please, check the checkbox in order to proceed"),errorSaveCC.getText(),"error message not display");
        reporterSnapshot(errorSaveCC,"Please, check the checkbox in order to proceed","","NULL");
    }
    public void clickOnLeavePageBanner(){
        getReusableActions().isElementVisible(leavePageCTA);
        leavePageCTA.click();
    }

    public void validateErrorMessageForEnrollment(String extraMoney){
        getReusableActions().staticWait(2000);
        extraMoneyInput.click();
        extraMoneyInput.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        extraMoneyInput.sendKeys(extraMoney);
        getReusableActions().staticWait(2000);
        reporter.softAssert(errorEnrollment.isDisplayed(),"Error Message : "+errorEnrollment.getText(),"Error Message not display");
    }
    public void validateAutoPayUnEnroll(){
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(enrollAutoPay);
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(enrollAutoPay);
        //reporter.softAssert(enrollInAutoPay.getText().equals("No"),"customer is enroll :"+enrollInAutoPay.getText(),"not enroll");
        reporterSnapshot(enrollAutoPay,"NOT ENROLLED","","Common");
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(3000);
    }
    public void validateCCTransactionRestricted(){
        if (showTopUpOptions.size() > 0) {
            showTopUpOptions.get(0).click();
        }
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='70%'");
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollToMiddleOfPage();
       // reporter.softAssert(!getReusableActions().isElementVisible(addCardOption),"add card option not visible","add card option visible");
        reporterSnapshot(addCardOption,"Add Card","","NOTVISIBLE");
//        reporter.reportLogWithScreenshot("add card option not visible");
    }
    public void clickOnUnEnrollment(){
        //getReusableActions().javascriptScrollByVisibleElement(unEnrollAutoPay);
        scrollToMiddleOfElement(unEnrollAutoPay);
        getReusableActions().staticWait(2000);
        unEnrollAutoPay.click();
        reporterSnapshot(unEnrollAutoPay,"unEnrollAutoPay","","Null");
    }
    public void validate_modal_window(){
        getReusableActions().staticWait(3000);
        //reporter.softAssert(crossMark.isDisplayed(), "X Icon displayed", "X Icon not displayed");
        //reporter.softAssert(confirmationTiltleText.isDisplayed(), confirmationTiltleText.getText(), "Text not displayed");
        reporterSnapshot(crossMark,"cross Mark","","display");
        reporterSnapshot(confirmationTiltleText,"confirmation Text","","display");
        getReusableActions().staticWait(2000);
        //reporter.softAssert(yesUnEnroll.isEnabled(), "Yes Enroll button is Enabled", "Yes Enroll button is disabled");
        //reporter.softAssert(noStayEnrolled.isEnabled(),"No Stay Enrolled button is enabled", "No stay Enrolled button is disabled");
        reporterSnapshot(yesUnEnroll,"Yes Unrolled","","display");
        reporterSnapshot(noStayEnrolled,"No Stay Enrolled","","display");
    }
    public void clickOnYesUnEnroll(){
        reporterSnapshot(yesUnEnroll,"Yes UnEnroll","","NULL");
        getReusableActions().clickWhenReady(yesUnEnroll);
    }
    public String getAutoPayEnrollStatus(){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(enrollAutoPay);
        getReusableActions().isElementVisible(enrollAutoPay);
        reporterSnapshot(enrollAutoPay,enrollAutoPay.getText(),"","NULL");
        return enrollAutoPay.getText();
    }
    public void validateAutopaySucessfulMessage(){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(successText);
        getReusableActions().staticWait(2000);
        reporterSnapshot(successText,successText.getText(),"","display");
    }
    public void validateErrorMessage(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(termsAndCondition);
        getReusableActions().staticWait(2000);
        reporterSnapshot(errorText,errorText.getText(),"","display");
    }
    public void validateStayThisPageModal(){
        getReusableActions().staticWait(2000);
        reporterSnapshot(stayOnPage,"Stay On Page","","display");
        stayOnPage.click();
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(firstNameField);
        reporterSnapshot(firstNameField,"First Name","","display");
    }
    public void validateLeaveThisPageModal(){
        getReusableActions().staticWait(3000);
        reporterSnapshot(leavePage,"Leave Page","","display");
        leavePage.click();
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(extraMoneyInput);
        reporterSnapshot(extraMoneyInput,"Extram Money","","display");
    }
    public void clickOnContinue(){
        //getReusableActions().clickWhenReady(proceedCTA,10);
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(continueCTA);
        continueCTA.click();
        getReusableActions().staticWait(5000);
    }
    public void validateSavedCreditCard(){
        getReusableActions().staticWait(2000);
        //getReusableActions().javascriptScrollByVisibleElement(saveCreditCard);
        scrollToMiddleOfElement(saveCreditCard);
        saveCreditCard.click();
        getReusableActions().staticWait(1000);
        reporterSnapshot(saveCreditCard,"saved Credit Card","","display");
    }
    public void validateReviewAutoPayPage(){
        getReusableActions().staticWait(2000);
       getReusableActions().javascriptScrollByVisibleElement(reviewService);
       getReusableActions().staticWait(1000);
       reporterSnapshot(reviewService,reviewService.getText(),"","DISPLAY");
       getReusableActions().javascriptScrollByVisibleElement(reviewCreditCard);
       getReusableActions().staticWait(1000);
       reporterSnapshot(reviewCreditCard,reviewCreditCard.getText(),"","DISPLAY");
    }
    public void validateErrorMessageInPaymentPage(){
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollByVisibleElement(saveCardCheckbox);
        getReusableActions().staticWait(2000);
        reporterSnapshot(errorTextInPayment,errorTextInPayment.getText(),"","display");
    }
    public void validateAnniversaryDateGreaterThanAutoPayEnrollment(){  // 24 Hours Calculated as Day
        getReusableActions().staticWait(2000);
        LocalDate autoPayEnrollDate = LocalDate.now();
        System.out.println("Auto Pay Entroll Date - "+autoPayEnrollDate);
        String dateFromApp = dateFromSuccessPage.getText();
        LocalDate anniversaryDate = LocalDate.parse(dateFromApp,DateTimeFormatter.ofPattern("MM/dd/uuuu"));
        System.out.println("Anniversary Date - "+anniversaryDate);
        long timeDifference = anniversaryDate.getDayOfYear()-autoPayEnrollDate.getDayOfYear();
        System.out.println("Time Difference - "+timeDifference);
            if (timeDifference > 0) { // greater than 24 Hours  ( 1 Day = 24 Hours)
                reporterSnapshot(dateFromSuccessPage, "Anniversary Date > Auto Enroll Pay Date ", "", "Display");
            } else {   // Less Than 24 hours
                reporterSnapshot(dateFromSuccessPage, "Anniversary Date < Auto Enroll Pay Date ", "", "Display");
            }
    }
    public void validateAddCardTileNotPresent(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(saveCreditCard);
        reporterSnapshot(null,"Add Card Tile",
                String.valueOf(addCardOptionList==null?0:addCardOptionList.size()),"HIDDEN");
    }
    public void unenrollAutopay(){
        getReusableActions().staticWait(2000);
        unEnrollAutoPay.click();
        getReusableActions().clickWhenReady(yesUnEnroll);
        getReusableActions().staticWait(2000);
    }
    public void autoPayEnrollStatus(){
        getReusableActions().staticWait(3000);
       scrollToMiddleOfElement(enrollAutoPay);
        reporterSnapshot(enrollAutoPay,"ENROLLED","","COMMON");
    }
    public void validateAddExtranMoneyInEnrollPage(){
        //extraMoneyInput.sendKeys(Keys.TAB);
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='70%'");
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(extraMoneyInput);
        reporterSnapshot(extraMoneyText,"Extra money","","COMMON");
    }
}
