package com.rogers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class TopUpFormPage extends BasePage {
    @FindBy(xpath = "(//span[@role='img'])[1]")
    WebElement phoneNumberCheck;
    @FindBy(xpath = "//*[@class='text-body-sm mb-0 text-italic ml-4']")
    WebElement numberVerifiedMessage;
    @FindBy(xpath = "//div[contains(text(),'Mastercard')]")
    WebElement creditCardRadio;
    @FindBy(xpath = "//input[contains(@formcontrolname,'amount')]")
    WebElement topupAmountField;
    @FindBy(xpath = "(//span[contains(text(),'Continue')])[2]")
    WebElement paymentMethodContinueCTA;
    @FindBy(xpath = "//p[contains(text(),'Confirm payment')]")
    WebElement confirmPaymentText;
    @FindBy(xpath = "//p[contains(text(),'Confirmer le paiement')]")
    WebElement confirmPaymentFrenchText;
    @FindBy(xpath = "//*[@title='First Step Completed']")
    WebElement firstStepCheck;
    @FindBy(xpath = "//*[@title='Second Step Completed']")
    WebElement secondStepCheck;
    @FindBy(xpath = "//*[@title='Third Step Completed']")
    WebElement thirdStepCheck;
    @FindBy(xpath = "//span[contains(text(),'Edit')]")
    WebElement editCTA;
    @FindBy(xpath = "//div[contains(text(),'Mastercard')]")//(//*[@class='ds-radioButton__innerCircle'])[1]")
    WebElement radioButtonCreditCard;
    @FindBy(xpath = "//div[contains(text(),'tr top-up')]")//(//*[@class='ds-radioButton__outerCircle my-12'])[4]")
    WebElement radioButtonVoucher;
    @FindBy(xpath = "//iframe[@class]")
    WebElement ccDetailsFrame;
    @FindBy(xpath = "//input[@id='credit-card-input']")
    WebElement creditCardField;
    @FindBy(xpath = "//input[@id='month-year-input']")
    WebElement expDateField;
    @FindBy(xpath = "//input[@id='security-code-input']")
    WebElement cvvField;
    @FindBy(xpath = "(//span[@role='img'])[11]")
    WebElement visaLogoIcon;
    @FindBy(xpath = "//input[@id='credit-card-input']")
    WebElement existingCCNumberText;
    @FindBy(xpath = "//input[@id='month-year-input']") //span[contains(text(),'Exp.:')]
    WebElement existingExpDateText;
    @FindBy(xpath = "//p[contains(text(),'Use other card')]")
    WebElement useAnotherCCCTA;
    @FindBy(xpath = "(//div[@class='text-bold'])[1]")
    WebElement confirmPaymentPhoneNumber;
    @FindBy(xpath = "(//div[@class='text-bold'])[3]")
    WebElement confirmPaymentCreditCard;
    @FindBy(xpath = "(//div[@class='text-bold'])[4]")
    WebElement confirmPaymentTopup;
    @FindBy(xpath ="//p[contains(text(),'have read')]")
   WebElement vestaServiceAgreementCheckbox;
    @FindBy(xpath = "//p[contains(text(),'des transactions')]")
    WebElement getVestaServiceAgreementFrenchCheckbox;
    @FindBy(xpath = "(//input[@type='checkbox']/following-sibling::div)[1]")
    WebElement authorizeChargeCheckbox;
    @FindBy(xpath = "//p[contains(text(),'ma carte de crédit fournie')]")
    WebElement authorizeChargeFrenchCheckbox;
    @FindBy(xpath = "(//span[contains(text(),'Continue')])[3]")
    WebElement confirmPaymentContinueCTA;
    @FindBy(xpath = "(//input[@type='tel'])[1]")
    WebElement phoneNumberField;
    @FindBy(xpath = "(//span[contains(text(),'Continue')])[1]") //button[@type='submit']")
    WebElement continueButtonTopup;
    @FindBy(xpath = "//app-top-up-payment-method/div/div/button[1]")
    WebElement continueButtonAddress;
    @FindBy(xpath = "//input[@formcontrolname='firstName']")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@formcontrolname='lastName']")
    WebElement lastNameField;
    @FindBy(xpath = "//app-address-autocomplete//input")
    WebElement addressInput;
    @FindBy(xpath = "//ul[@role='listbox']/li")
    WebElement autoCompleteAddressInput;
    @FindBy(xpath = "//input[@formcontrolname='city']")
    WebElement cityInput;
    @FindBy(xpath = "//select[@formcontrolname='province']")
    WebElement provinceDropDown;
    @FindBy(xpath = "//option[@value='ON']")
    WebElement provinceOntarioOption;
    @FindBy(xpath = "//input[@formcontrolname='postalCode']")
    WebElement postalCodeInput;
    @FindBy(xpath = "//h3[contains(text(),'Top')]")
    WebElement topUpYourAccountText;
    @FindBy(xpath = "//p[contains(text(),'Confirmation')]")
    WebElement receiptBanner;
    @FindBy(xpath = "//div[contains(text(),'Success')]")
    WebElement successMessage;
    @FindBy(xpath = "//ds-step[4]/div/div[2]/div/div/div[1]")
    WebElement receiptFrenchBanner;
    @FindBy(xpath = "//ds-step[4]/div/div[2]/div/div/div[2]/app-top-up-result/div[1]")
    WebElement successFrenchMessage;
    @FindBy(xpath = "(//div[contains(text(),'Phone number')])[1]//following-sibling::div")
    WebElement receiptPhoneNumber;
    @FindBy(xpath = "(//div[contains(text(),'Card details')])[1]//following-sibling::div")
    WebElement receiptCreditCard;
    @FindBy(xpath = "(//div[contains(text(),'Subtotal')])[1]//following-sibling::div")
    WebElement receiptSubtotal;
    @FindBy(xpath = "(//div[contains(text(),'phone')])[1]//following-sibling::div")
    WebElement receiptPhoneNumberFrench;
    @FindBy(xpath = "(//div[contains(text(),'la carte')])[1]//following-sibling::div")
    WebElement receiptCreditCardFrench;
    @FindBy(xpath = "(//div[contains(text(),'Sous')])[1]//following-sibling::div")
    WebElement receiptSubtotalFrench;
    @FindBy(xpath = "(//div[contains(text(),'HST')])[1]//following-sibling::div")
    WebElement receiptHSTtotal;
    @FindBy(xpath = "//div/ds-error/span[2]/p")
    WebElement invalidPhoneNumberField;
    @FindBy(xpath = "//span[@title='Clear all']")
    WebElement clickOnClearIcon;
    @FindBy(xpath = "//button[@title='Edit step 1']")
    WebElement editButtonPhoneNumber;
    @FindBy(xpath = "//button[@title='Edit step 2']")
    WebElement paymentMethodEdit;
    @FindBy(xpath = "(//*[@class='text-bold'])[2]")
    WebElement phoneNumberReviewPage;
    @FindBy(xpath = "(//*[@class='text-bold'])[4]") ////app-top-up-summary/div[2]/div[3]/div[2]
    WebElement creditCardNumberReviewPage;
    @FindBy(xpath = "(//*[contains(@class,'ds-checkbox__box my-12')])[2]")
    WebElement checkBoxReviewPage;
    @FindBy(xpath = "//select[@formcontrolname='country']")
    WebElement countryDropDown;
    @FindBy(xpath = "//p[contains(text(),'account balance will be charged')]")
    WebElement planRenewalNotice;
    @FindBy(xpath = "//ds-icon[@name='info']")
    WebElement paymentInfoIcon;
    @FindBy(xpath = "//div[contains(text(),'Suggested top-up amount')]")
    WebElement suggestedTopUpMessage;
    @FindBy(xpath = "(//ds-icon[@name='close'])[2]")
    WebElement paymentMethodInfoCloseCTA;
    @FindBy(xpath = "//app-top-up-payment-method/div/div/button[2]")
    WebElement selectCancelButton;
    @FindBy(xpath = "//*[@title='No, proceed']")
    WebElement noProceedButton;
    @FindBy(xpath = "//ds-radio-button[1]/label/div[1]/div")
    WebElement canadaRadioButton;
    @FindBy(xpath = "//ds-radio-button[2]/label/div[1]")
    WebElement otherRadioButton;
    @FindBy(xpath = "(//span[contains(text(),'Please, check the checkbox to proceed.')])[1]")
    WebElement vestaCheckboxError;
    @FindBy(xpath = "(//span[contains(text(),'Please, check the checkbox to proceed.')])[2]")
    WebElement authorizeCheckboxError;
    @FindBy(xpath = "//span[contains(text(),'Save receipt')]")
    WebElement saveReceiptCTA;
    @FindBy(xpath = "//a[contains(normalize-space(),'Start')]")
    WebElement newTopUpCTA;
    @FindBy(xpath = "(//a[@title='Recharge'])[1]")
    WebElement newTopUpCTAFrench;
    @FindBy(xpath = "//ds-error")
    WebElement errorIcon;
    @FindBy(xpath = "//span[contains(text(),'exceed $300')]")
    WebElement accountBalanceExceed;
    @FindBy(xpath = "//span[contains(text(),'Register')]")
    WebElement registerHere;
    @FindBy(xpath = "//*[@id='content']/app-top-up/div[1]/div/div[1]/h3")
    WebElement topUpAsGuestText;
    @FindBy(xpath = "//span[contains(text(),'Agree to the terms')]")
    WebElement errorMessage;
    @FindBy(xpath = "//input[contains(@formcontrolname,'extra')]")
    WebElement topUpInput;
    @FindBy(css = "div[class='top-up__step-content pl-xs-0'] div:nth-child(2) div:nth-child(2)")
    WebElement phoneNumberOnReceipt;
    @FindBy(xpath = "//app-top-up-result/div[3]/div[4]/div[2]")
    WebElement creditCardNumberOnReceipt;
    @FindBy(xpath = "//div[4]/button[2]/span[1]/span[1]")
    WebElement selectCancelPayment;
    @FindBy(xpath = "//div[contains(text(),'If you cancel, all data will be erased and you wil')]")
    WebElement popUpWindowMessage;
    @FindBy(xpath = "//form/div/div/ds-error/span[2]")
    WebElement creditCardErrorMessage;
    @FindBy(xpath = "//input[@formcontrolname='addressLine1']") //app-address-autocomplete/ds-form-field/div/div[1]
    WebElement addressLine1Input;
    @FindBy(xpath = "(//input[@type='text'])[6]")
    WebElement provinceDropDownOtherCountry;
    @FindBy(xpath = "//ds-radio-group/div/ds-selection/label/span")
    WebElement useAnotherCard;
    @FindBy(xpath = "//input[@formcontrolname='phonenumber']")
    WebElement phoneNumberFieldEas;
    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    WebElement submitButton;
    @FindBy(xpath = "//ds-radio-group/div[1]/ds-radio-button/label/div[1]")
    WebElement creditCardRadioFrench;
    @FindBy(xpath = "//span[contains(text(),'Forgot username')]")
    WebElement forgotUserName;
    @FindBy(xpath = "//h1[contains(text(),'Hello')]")
    WebElement helloBanner;
    @FindBy(xpath = "//h1[contains(text(),'Bonjour')]")
    WebElement helloBannerFrench;
    @FindBy(xpath = "(//span[contains(text(),'$')])[1]")
    WebElement balanceBanner;
    @FindBy(xpath = "//app-account-header/div/div/div/div[2]/div[2]/span[1]")
    WebElement anniversaryDate;
    @FindBy(xpath = "//span[contains(text(),'Your account balance')]")
    WebElement accountBalance;
    @FindBy(xpath = "(//a[@title='Top-up'])[1]")
    WebElement topUp;
    @FindBy(xpath = "//span[contains(text(),'Recharge')]")
    WebElement topUpFrench;
    @FindBy(xpath = "//span[contains(text(),'Solde de votre compte')]")
    WebElement accountBalanceFrench;
    @FindBy(xpath = "//span[contains(text(),'Address 1')]/following-sibling::span")
    WebElement profileAddress;
    @FindBy(xpath = "//span[contains(text(),'City')]/following-sibling::span")
    WebElement profileCity;
    @FindBy(xpath = "//span[contains(text(),'Postal code')]/following-sibling::span")
    WebElement profilePostalCode;
    @FindBy(xpath = "(//ds-form-field[1]/div[1]/div[1]/input[1])[4]")
    WebElement ppcPaymentAddress;
    @FindBy(xpath = "(//ds-form-field[1]/div[1]/div[1]/input[1])[5]")
    WebElement ppcPaymentCity;
    @FindBy(xpath = "(//ds-form-field[1]/div[1]/div[1]/input[1])[6]")
    WebElement ppcPaymentPostalCode;
    @FindBy(xpath = "//span[contains(text(),'Province')]//ancestor::div[1]/input")
    WebElement provinceInput;
    @FindBy(xpath = "//input[@formcontrolName ='addressLine1']")
    WebElement addressLine;
    @FindBy(xpath = "//div[@class='ds-checkbox__box my-12'][1]")
    WebElement authorizeChargeCheckboxFrench;
    @FindBy(xpath = "//*[@id=\"content\"]/app-top-up/div[1]/div/div/h3")
    WebElement topupGuestBanner;
    @FindBy(xpath = "//ds-step[1]/div/div[1]/div/div/div/div/ds-icon")
    WebElement firstStepCheckFrench;
    @FindBy(xpath = "//ds-step[2]/div/div[1]/div/div/div/div/div")
    WebElement secondStepCheckFrench;
    @FindBy(xpath = "//ds-step[3]/div/div[1]/div/div/div/div/div")
    WebElement thirdStepCheckFrench;
    @FindBy(xpath = "//app-top-up-payment-method//div//div//button[@title='Cancel']")
    WebElement paymentCancelButton;
    @FindBy(xpath = "(//span[contains(text(),'Continue')])[3]")
    WebElement popupContinueButton;
    @FindBy(xpath = "//span[contains(text(),'Enroll')]")
    WebElement autoPayEnrollLink;
    @FindBy(xpath = "//input[@type='tel']")
    WebElement autopayTopupAmountField;
    @FindBy(xpath = "//p[contains(text(),'exceed $300')]")
    WebElement autopayTopupErrorMsgField;
    @FindBy(xpath = "//a[normalize-space()='Top-up another chatr account']")
    WebElement newTopUpCTALink;
    @FindBy(xpath = "(//p[text()='Current account balance:']//following-sibling::p)[1]")
    WebElement currentBalance;
    @FindBy(xpath = "(//span[contains(text(),'$')])[2]")
    WebElement balanceBottom;
    @FindBy(xpath ="//*[contains(text(),'Top-up card PIN')]")
    WebElement careTopUpAmountField;
    @FindBy(xpath ="//a[normalize-space()='My chatr']")
    WebElement myChatrHome;
    @FindBy(xpath = "//span[contains(text(),'exceed $300')]")
    WebElement topupErrorMsgField;
    @FindBy(xpath = "//span[contains(text(),\" Show top-up options \")]")
    List<WebElement> showTopUpOptions;
    @FindBy(xpath ="(//a[@aria-labe='Sign into my chatr'])[3]")
    WebElement myChatr;
    @FindBy(xpath = "//p[contains(text(),' understood and agree to Vesta service agreement(s)')]")
    WebElement vestaServiceAgreementCheckboxSS;
    @FindBy(xpath = "//strong[contains(text(),'I authorise')]/parent::p")
    WebElement checkAuthorizeCheckboxSS;
    @FindBy(xpath = "//span[contains(text(),'suggest')]")
    WebElement suggestTopUpMessage;
    @FindBy(xpath = "(//div[@class='text-bold'])[1]")
    WebElement reciptDateTimePath;
    @FindBy(xpath="//*[contains(@formcontrolname,'firstName')]")
    WebElement firstnameBillng;
    @FindBy(xpath="//*[contains(@formcontrolname,'lastName')]")
    WebElement lastnameBillng;
    @FindBy(xpath ="//span[contains(text(),'Continue')]/ancestor::button")
    WebElement continueBtn;
    @FindBy(xpath="//span[contains(text(),'Back to customer dashboard')]")
    WebElement backToDasboard;
    @FindBy(xpath = "//a[contains(text(),'another')]")
    WebElement anotherTopUp;
    @FindBy(xpath = "//p[contains(text(),'your payment card information')]")
    WebElement saveCCCheckbox;
    @FindBy(xpath = "(//span[contains(text(),' Continue ')])[2]")
    WebElement continueInPopup;

    @FindBy(xpath = "//button[@id='ds-stepper-id-1-editButtonId-1']")
    WebElement editVoucherPin;

    @FindBy(xpath = "//span[contains(text(),'Edit')]")
    List<WebElement> editLink;

    @FindBy(xpath = "//app-top-up-summary/div[5]/button[1]/span/span")
    WebElement continueReview;
    @FindBy(xpath = "//*[contains(text(),'Keep')]")
    WebElement lookingGood;
    @FindBy(xpath = "//*[@id=\"ds-tabs-0-tab-1\"]")
    WebElement currentPlanCTA;
    @FindBy(xpath = "//span[contains(text(),'Change plan')]/ancestor::button")
    WebElement changePlanButton;
    @FindBy(xpath = "//*[@id=\"ds-tabs-0-tab-2\"]")
    WebElement profileCTA;
    @FindBy(xpath = "(//p[@class='mt-8 text-bold'])[1]")
    WebElement populatedphoneNumber;


    public TopUpFormPage(WebDriver driver) {
        super(driver);
    }

    public void validateTopUpPageText() {
        //reporter.softAssert(getReusableActions().isElementVisible(topUpYourAccountText), "you are in Authenticated top up", "you are NOT in authenticated top up");
        reporterSnapshot(topUpYourAccountText,"topUp Account","","display");
    }

    public void validateAccountRenewal() {
        reporter.softAssert(getReusableActions().isElementVisible(planRenewalNotice), "Plan renewal message appear", "Plan renewal message didn't appear");
    }

    public void clickOnPaymentInfoIcon() {
        getReusableActions().staticWait(3000);
        //getReusableActions().javascriptScrollByVisibleElement(paymentInfoIcon);
        paymentInfoIcon.click();
    }

    public void validatePaymentInfo() {
        getReusableActions().staticWait(2000);
        //reporter.softAssert(getReusableActions().isElementVisible(suggestedTopUpMessage), "Suggested topup amount message is appearing", "Suggested topup amount message is not appearing");
        reporterSnapshot(suggestedTopUpMessage,"Payment Info","","visible");
        //getReusableActions().clickWhenReady(paymentMethodInfoCloseCTA, 10);

    }

    public void clickCreditCard() {
        getReusableActions().staticWait(3000);
        phoneNumberCheck.isDisplayed();
        //reporter.reportLogWithScreenshot("Chatr phone number prepopulated");
        reporterSnapshot(phoneNumberCheck,"Chatr Phone Number","","NULL");
        getReusableActions().waitForElementVisibility(creditCardRadio, 10);
        creditCardRadio.click();
    }
    public void selectCreditCard() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(creditCardRadio);
        getReusableActions().waitForElementVisibility(creditCardRadio, 10);
        creditCardRadio.click();
    }
    public void completeSecondStepTopUpForm(String topUp) {
        getReusableActions().staticWait(2000);
        scrollToMiddleOfElement(topupAmountField);
        getReusableActions().staticWait(1000);
        topupAmountField.click();
        topupAmountField.sendKeys(topUp);
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(3000);
        reporterSnapshot(topupAmountField,"Top-Up Amount","","NULL");
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(3000);
        getReusableActions().waitForElementTobeClickable(paymentMethodContinueCTA, 10);
        paymentMethodContinueCTA.click();
        getReusableActions().staticWait(2000);
        //getReusableActions().waitForElementVisibility(confirmPaymentText, 20);
        //reporter.reportLogWithScreenshot("TopUp completed");
    }

    public void completeSecondStepTopUpFormFrench() {
        topupAmountField.click();
        topupAmountField.sendKeys("1");
        getReusableActions().waitForElementTobeClickable(paymentMethodContinueCTA, 10);
        paymentMethodContinueCTA.click();
        getReusableActions().waitForElementVisibility(confirmPaymentFrenchText, 10);
        reporter.reportLogWithScreenshot("TopUp completed");
    }

    public void clickEditSecondStepTopUpForm() {
        getReusableActions().waitForElementVisibility(firstStepCheck, 10);
        getReusableActions().waitForElementVisibility(secondStepCheck, 10);
        getReusableActions().waitForElementVisibility(editCTA, 10);
        getReusableActions().javascriptScrollByVisibleElement(editCTA);
        getReusableActions().clickWhenReady(editCTA, 10);
        reporter.reportLogWithScreenshot("Second step check mark is visible");
    }

    public void validateCreditCardFields() {
        getReusableActions().waitForElementTobeClickable(topupAmountField, 10);
        getReusableActions().waitForElementVisibility(topupAmountField, 10);
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame, 30);
        getReusableActions().javascriptScrollByVisibleElement(creditCardField);
        getReusableActions().waitForElementVisibility(creditCardField, 10);
        getReusableActions().waitForElementVisibility(expDateField, 10);
        getReusableActions().waitForElementVisibility(cvvField, 10);
        reporter.reportLogWithScreenshot("credit card fields are being displayed");
    }

    public void cancelRefreshPage() throws AWTException {
        Robot robot = new Robot();
        getDriver().navigate().refresh();
        getReusableActions().staticWait(3000);
        robot.keyPress(KeyEvent.VK_ESCAPE);
        getReusableActions().staticWait(5000);
        getReusableActions().waitForElementVisibility(phoneNumberCheck, 10);
    }

    public void acceptRefreshPage() throws AWTException {
        Robot robot = new Robot();
        getDriver().navigate().refresh();
        getReusableActions().staticWait(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        getReusableActions().staticWait(5000);
        getReusableActions().waitForElementVisibility(phoneNumberCheck, 10);
    }

    public void getTopUpInputValue() {
        String input = topupAmountField.getAttribute("value");
        if (input != "") {
            reporter.reportLogPass("The input value still remains");
        }
        System.out.println(input);
        reporter.reportLogWithScreenshot("TopUp input is still populated");
    }

    public void validateCreditCardRadioBtnAppears() {
        getDriver().findElement(By.xpath("(//span[@role='img'])[1]")).isDisplayed();
        reporter.reportLogWithScreenshot("Chatr phone number prepolutaded");
        getReusableActions().waitForElementVisibility(creditCardRadio, 10);
        reporter.reportLogWithScreenshot("Credit Card radio button appears");
    }

    public void validateCreditCardCard() {
        phoneNumberCheck.isDisplayed();
        reporter.reportLogWithScreenshot("Chatr phone number prepolutaded");
        creditCardRadio.click();
        reporter.softAssert(getReusableActions().isElementVisible(visaLogoIcon), "Visa logo is appearing", "Visa logo is not appearing");
        reporter.softAssert(getReusableActions().isElementVisible(existingCCNumberText), "CC number is appearing", "CC number is not appearing");
        reporter.softAssert(getReusableActions().isElementVisible(existingExpDateText), "Expiration date is appearing", "Expiration date is not appearing");
        reporter.softAssert(getReusableActions().isElementVisible(useAnotherCCCTA), "use another card button is appearing", "use another card is no appearing");
    }

    public void confirmPaymentInfo(String phoneNumber, String creditCard, String topUp) {
        getReusableActions().waitForElementVisibility(confirmPaymentPhoneNumber, 10);
        reporter.softAssert(verifyPhoneNumber(phoneNumber, confirmPaymentPhoneNumber), "its the same phone number", "its not the same phone number");
        getReusableActions().waitForElementVisibility(confirmPaymentCreditCard, 10);
        //reporter.softAssert(verifyCreditCard(creditCard,confirmPaymentCreditCard), "is the same credit card", "its not the same credit card");
        reporter.softAssert(verifyTopUpAmount(topUp, confirmPaymentTopup), "its the same topup", "its not the same topup");
    }

    public boolean verifyPhoneNumber(String phoneNumber, WebElement elemntToValidate) {
        String reciptPhoneNumber = elemntToValidate.getText();
        reciptPhoneNumber = removeSpecialCharacters(reciptPhoneNumber, "-");
        phoneNumber = removeSpecialCharacters(phoneNumber, "-");
        Boolean isEqual = false;
        if (reciptPhoneNumber.equals(phoneNumber)) {
            isEqual = true;
        }
        return isEqual;
    }

    public boolean verifyCreditCard(String creditCard, WebElement elementToValidate) {
        String reciptCreditCard = elementToValidate.getText();
        reciptCreditCard = removeSpecialCharacters(reciptCreditCard, "*");
        reciptCreditCard = removeSpecialCharacters(reciptCreditCard, " ");
        String last4digitsCC = "";
        last4digitsCC = last4digitsCC + creditCard.charAt(creditCard.length() - 4);
        last4digitsCC = last4digitsCC + creditCard.charAt(creditCard.length() - 3);
        last4digitsCC = last4digitsCC + creditCard.charAt(creditCard.length() - 2);
        last4digitsCC = last4digitsCC + creditCard.charAt(creditCard.length() - 1);
        Boolean isEqual = false;
        if (last4digitsCC.equals(reciptCreditCard)) {
            isEqual = true;
        }
        return isEqual;
    }

    public boolean verifyTopUpAmount(String topup, WebElement elementToValidate) {
        String reciptTopUp = elementToValidate.getText();
        reciptTopUp = removeSpecialCharacters(reciptTopUp, "$");
        float topUpasInt = Float.parseFloat(reciptTopUp);
        int topUpInput = Integer.parseInt(topup);
        Boolean isEqual = false;
        if (topUpInput == topUpasInt) {
            isEqual = true;
        }
        return isEqual;
    }

    public void checkServiceAgreementCheckbox() {
        getReusableActions().staticWait(3000);
        getReusableActions().waitForElementVisibility(vestaServiceAgreementCheckbox, 10);
        //vestaServiceAgreementCheckbox.click();
        getReusableActions().executeJavaScriptClick(vestaServiceAgreementCheckbox);
    }

    public void checkServiceAgreementFrenchCheckbox() {
        getReusableActions().waitForElementVisibility(getVestaServiceAgreementFrenchCheckbox, 10);
        getVestaServiceAgreementFrenchCheckbox.click();
    }

    public void checkAuthorizeCheckbox() {
        //getReusableActions().waitForElementVisibility(authorizeChargeCheckbox, 10);
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(authorizeChargeCheckbox);
        authorizeChargeCheckbox.click();
        reporterSnapshot(authorizeChargeCheckbox,"Autherization Check Box","","NULL");
    }

    public void checkAuthorizeFrenchCheckbox() {
        getReusableActions().waitForElementVisibility(authorizeChargeFrenchCheckbox, 10);
        authorizeChargeFrenchCheckbox.click();
    }

    public void clickOnContinueConfirmPayment() {
        getReusableActions().staticWait(4000);
        getReusableActions().waitForElementVisibility(confirmPaymentContinueCTA, 10);
        confirmPaymentContinueCTA.click();
        getReusableActions().staticWait(3000);
    }

    public void clickOnContinuePaymentMethod() {
        getReusableActions().waitForElementVisibility(paymentMethodContinueCTA, 10);
        getReusableActions().javascriptScrollByVisibleElement(paymentMethodContinueCTA);
        paymentMethodContinueCTA.click();

    }

    public void fillCreditCardInfo(String topup, String creditCard, String cvv, String expirydate) {
        //set Topup
        //getReusableActions().javascriptScrollByVisibleElement(topupAmountField);
        getReusableActions().isElementVisible(topupAmountField, 20);
        getReusableActions().executeJavaScriptClick(topupAmountField);
        //topupAmountField.click();
        topupAmountField.sendKeys(topup);
        //app vesta iframe
        WebElement ccDetailsFrame = getDriver().findElement(By.xpath("//iframe[@class]"));
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame, 30);
        //set Credit Card Number
        getReusableActions().waitForElementTobeClickable(creditCardField, 30);
        creditCardField.click();
        creditCardField.sendKeys(creditCard);
        //set CVV
        getReusableActions().waitForElementTobeClickable(cvvField, 30);
        cvvField.click();
        cvvField.sendKeys(cvv);
        //set ExpiryDate
        getReusableActions().waitForElementTobeClickable(expDateField, 30);
        expDateField.click();
        expDateField.sendKeys(expirydate);
        //reporter.reportLogWithScreenshot("Credit card details are populated");
        reporterSnapshot(creditCardField,"Credit Card Details","","NULL");
        getDriver().switchTo().defaultContent();
    }

    public void setNames(String firstName, String lastName) {
        getReusableActions().javascriptScrollByVisibleElement(otherRadioButton);
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
    }

    public void setAddress(String city) {
        //getReusableActions().javascriptScrollByVisibleElement(firstNameField);
        addressInput.click();
        addressInput.sendKeys(city);
        getReusableActions().waitForElementTobeClickable(autoCompleteAddressInput, 20);
        autoCompleteAddressInput.click();
        //getReusableActions().waitForElementTobeClickable(autoCompleteAddressInput, 20);
        //autoCompleteAddressInput.click();
//        waitForAttributeToBeNotEmpty(postalCodeInput, "value", 20);
        //reporter.reportLogWithScreenshot("Address is populated");
        reporterSnapshot(addressInput,"Address Details","","NULL");
    }

    public void setAddressSecond(String city) {
        //getReusableActions().javascriptScrollByVisibleElement(firstNameField);
        addressInput.click();
        addressInput.sendKeys(city);
        getReusableActions().waitForElementTobeClickable(autoCompleteAddressInput, 20);
        autoCompleteAddressInput.click();
        getReusableActions().waitForElementTobeClickable(autoCompleteAddressInput, 20);
        autoCompleteAddressInput.click();
        waitForAttributeToBeNotEmpty(postalCodeInput, "value", 10);
        //reporter.reportLogWithScreenshot("Address is populated");
        reporterSnapshot(addressInput,"Address Details","","NULL");
    }
    public void verifyReceipt(String phoneNumber, String creditCard, String topup) {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(firstStepCheck);
        reporterSnapshot(firstStepCheck,"first Step Check","","Visible");
        getReusableActions().javascriptScrollByVisibleElement(secondStepCheck);
        reporterSnapshot(secondStepCheck,"second Step Check","","Visible");
        getReusableActions().javascriptScrollByVisibleElement(thirdStepCheck);
        reporterSnapshot(thirdStepCheck,"third Step Check","","Visible");
        getReusableActions().javascriptScrollByVisibleElement(receiptBanner);
        reporterSnapshot(receiptBanner,"receipt Banner","","Visible");
        getReusableActions().javascriptScrollByVisibleElement(successMessage);
        reporterSnapshot(successMessage,"success Message","","Visible");

        //reporter.softAssert(verifyPhoneNumber(phoneNumber, receiptPhoneNumber), "the phone number is the same", "the phone number is not the same");
       // reporterSnapshot(receiptPhoneNumber,phoneNumber,"","gen");
        String numberActVal = receiptPhoneNumber.getText().replaceAll("-","");
        System.out.println("From EXCEL : " +phoneNumber);
        System.out.println("From RECIPT : " +numberActVal);
        reporterSnapshot(receiptPhoneNumber,phoneNumber,numberActVal,"match");
        //reporter.softAssert(verifyCreditCard(creditCard, receiptCreditCard), "the last 4 digits are the same", "the last 4 digits are not the same");
        reporterSnapshot(receiptCreditCard,creditCard.substring(12),receiptCreditCard.getText().substring(15),"match");

        //reporter.softAssert(verifyTopUpAmount(topup, receiptSubtotal), "the topup amount is the same", "the topup amount is not the same");
        String tempActVal = receiptSubtotal.getText().replace("$","");
        int endStrVal = tempActVal.length() - 3;
        reporterSnapshot(receiptSubtotal,topup,tempActVal.substring(0,endStrVal),"match");
    }

    public void verifyReceiptFrench(String phoneNumber, String creditCard, String topup) {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(firstStepCheckFrench);
        reporterSnapshot(firstStepCheckFrench,"first Step Check","","display");
        getReusableActions().javascriptScrollByVisibleElement(secondStepCheckFrench);
        reporterSnapshot(secondStepCheckFrench,"second Step Check","","display");
        getReusableActions().javascriptScrollByVisibleElement(thirdStepCheckFrench);
        reporterSnapshot(thirdStepCheckFrench,"third Step Check","","display");
        getReusableActions().javascriptScrollByVisibleElement(receiptFrenchBanner);
        reporterSnapshot(receiptFrenchBanner,"receipt Banner","","display");
        getReusableActions().javascriptScrollByVisibleElement(successFrenchMessage);
        reporterSnapshot(successFrenchMessage,"success Message","","display");
        //reporter.softAssert(verifyPhoneNumber(phoneNumber, receiptPhoneNumber), "the phone number is the same", "the phone number is not the same");
        reporterSnapshot(receiptPhoneNumberFrench,phoneNumber,"","gen");
        //reporter.softAssert(verifyCreditCard(creditCard, receiptCreditCard), "the last 4 digits are the same", "the last 4 digits are not the same");
        reporterSnapshot(receiptCreditCardFrench,creditCard.substring(12),receiptCreditCardFrench.getText().substring(15),"match");
        //reporter.softAssert(verifyTopUpAmount(topup, receiptSubtotal), "the topup amount is the same", "the topup amount is not the same");
        String tempActVal = receiptSubtotalFrench.getText().replace("$","");
        int endStrVal = tempActVal.length() - 3;
        reporterSnapshot(receiptSubtotalFrench,topup,tempActVal.substring(0,endStrVal),"match");
    }

    public void verifyHSTReceipt() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(successFrenchMessage);
        String tempActVal = receiptHSTtotal.getText().replace("$","");
        reporterSnapshot(receiptHSTtotal,"0.00",tempActVal,"NOTBLANK");
    }


    public void validateInValidPhoneNumber(String phoneNumber2) {
        getReusableActions().isElementVisible(phoneNumberField);
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber2);
        continueButtonTopup.click();
        getReusableActions().isElementVisible(invalidPhoneNumberField);
        //reporter.softAssert(invalidPhoneNumberField.getText().equals("Please enter a 10-digit chatr number."), "valid  error message", "invalid message");
        reporterSnapshot(invalidPhoneNumberField,"Error! Phone number must be exactly 10-digits. Try again.","","GEN");
        clickOnClearIcon.click();
        getReusableActions().staticWait(1000);
    }

    public void validateEditButtonForPhoneNumber(String editPhoneNumber) {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(editButtonPhoneNumber);
        getReusableActions().executeJavaScriptClick(editButtonPhoneNumber);
        //editButtonPhoneNumber.click();
        //reporter.reportLogWithScreenshot("Edit Phone Number button is clicked");
        reporterSnapshot(editButtonPhoneNumber,"Edit Phone Number Details","","NULL");
        getReusableActions().isElementVisible(clickOnClearIcon);
        clickOnClearIcon.click();
        phoneNumberField.clear();
        phoneNumberField.click();
        phoneNumberField.sendKeys(editPhoneNumber);
        getReusableActions().isElementVisible(numberVerifiedMessage);
        getReusableActions().clickWhenReady(continueButtonTopup);
    }

    public void validateEditButtonForPaymentMethod(String topUp) {
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollToTopOfPage();
        //getReusableActions().javascriptScrollByVisibleElement(paymentMethodEdit);
        getReusableActions().isElementVisible(paymentMethodEdit);
        getReusableActions().clickWhenReady(paymentMethodEdit, 10);
        //reporter.reportLogWithScreenshot("Edit payment method button is clicked");
        getReusableActions().clickWhenReady(topupAmountField, 10);
        topupAmountField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        int itopUp = Integer.parseInt(topUp) + 1;
        topUp = Integer.toString(itopUp);
        topupAmountField.sendKeys(topUp);
        //reporter.reportLogWithScreenshot("topUp amount is changed");
        reporterSnapshot(topupAmountField,"Edit Top-Up Amount Details","","NULL");
        getReusableActions().staticWait(1000);
    }

    public void validatePhoneNumber(String phoneNumber) {
        getReusableActions().staticWait(3000);
        getReusableActions().isElementVisible(phoneNumberField);
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
        //reporter.softAssert(numberVerifiedMessage.getText().equals("Phone number found."), "valid phone number message", "invalid message");
        reporterSnapshot(numberVerifiedMessage,"Phone number found.","","GEN");
    }

    public void clickContinueButtonPhoneNumber() {
        getReusableActions().isElementVisible(continueButtonTopup);
        continueButtonTopup.click();
    }

    public void clickContinueButtonPaymentMethod() {
        getReusableActions().staticWait(4000);
        getReusableActions().isElementVisible(continueButtonAddress);
        continueButtonAddress.click();
        //getReusableActions().executeJavaScriptClick(continueButtonAddress);
        getReusableActions().staticWait(2000);
    }

    public void clickCancelAndContinueButtonPaymentMethod() {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(paymentCancelButton);
        paymentCancelButton.click();
        getReusableActions().staticWait(2000);
        getDriver().switchTo().defaultContent();
        reporterSnapshot(paymentCancelButton,"Payment Cancel Button","","NULL");
        getReusableActions().isElementVisible(popupContinueButton);
        popupContinueButton.click();
        getReusableActions().staticWait(2000);
        getDriver().switchTo().defaultContent();
        getReusableActions().isElementVisible(continueButtonAddress);
        //continueButtonAddress.click();
        getReusableActions().executeJavaScriptClick(continueButtonAddress);
    }

    public void selectPaymentMethod(String paymentMethod) {
        getReusableActions().staticWait(6000);
        if (showTopUpOptions.size() > 0) {
            //showTopUpOptions.get(0).click();
            getReusableActions().executeJavaScriptClick( showTopUpOptions.get(0));
        }
        /*getReusableActions().javascriptScrollToMiddleOfPage();*/
        if (paymentMethod.contains("Credit")) {
            getReusableActions().isElementVisible(radioButtonCreditCard);
            getReusableActions().javascriptScrollByVisibleElement(radioButtonCreditCard);
            //radioButtonCreditCard.click();
            getReusableActions().executeJavaScriptClick(radioButtonCreditCard);
            getReusableActions().staticWait(2000);
            getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
            getReusableActions().staticWait(2000);
            getReusableActions().javascriptScrollByVisibleElement(radioButtonCreditCard);
            reporterSnapshot(radioButtonCreditCard, "Credit card Payment", "", "NULL");
            getReusableActions().staticWait(2000);
            getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
            getReusableActions().staticWait(2000);
        } else {
            getReusableActions().isElementVisible(radioButtonVoucher);
            getReusableActions().javascriptScrollByVisibleElement(radioButtonVoucher);
            radioButtonVoucher.click();
            reporterSnapshot(radioButtonVoucher, "Voucher", "", "Display");
        }
    }

    public void populateTopUpAmount(String topUp) {
        topupAmountField.click();
        topupAmountField.sendKeys(topUp);
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(2000);
        reporterSnapshot(topupAmountField,topUp,"","NULL");
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(3000);
    }

    public void validateReviewPage(String creditCard, String phoneNumber) {
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(phoneNumberReviewPage);
        getReusableActions().staticWait(1000);
        getReusableActions().isElementVisible(phoneNumberReviewPage, 20);
        getReusableActions().staticWait(3000);
//        System.out.println(phoneNumberReviewPage.getText());
//        reporterSnapshot(phoneNumberReviewPage,phoneNumber,"","gen");
        String numberActVal = receiptPhoneNumber.getText().replace("-","");
        reporterSnapshot(receiptPhoneNumber,phoneNumber,numberActVal,"match");
        //String text = creditCardNumberReviewPage.getText();
        String cardNumber = "**** **** **** " + creditCard.substring(12);
        reporterSnapshot(creditCardNumberReviewPage,cardNumber,"","common");
        getReusableActions().staticWait(1000);
        scrollToMiddleOfElement(checkBoxReviewPage);
        getReusableActions().staticWait(1000);
        getReusableActions().clickWhenReady(checkBoxReviewPage, 10);
        reporterSnapshot(addressInput,"Confirm Payment Details","","NULL");
    }
    public void validateReviewPageFrench(String creditCard, String phoneNumber) {
        getReusableActions().isElementVisible(phoneNumberReviewPage, 20);
        getReusableActions().staticWait(3000);
        System.out.println(phoneNumberReviewPage.getText());
        //reporter.softAssert(phoneNumberReviewPage.getText().equals(phoneNumber), "valid phoneNumber in confirm payment step", "invalid phoneNumber");
        reporterSnapshot(phoneNumberReviewPage,phoneNumber,"","gen");
        //String text = creditCardNumberReviewPage.getText();
        String cardNumber = "**** **** **** " + creditCard.substring(12);
        //reporter.softAssert(text.equals(cardNumber), "valid cardNumber in in confirm payment step", "invalid cardNumber");
        reporterSnapshot(creditCardNumberReviewPage,cardNumber,"","gen");
        getReusableActions().staticWait(2000);
        //getReusableActions().clickWhenReady(checkBoxReviewPage, 10);
        //reporter.reportLogWithScreenshot("Confirm payment step message");
        reporterSnapshot(addressInput,"Confirm Payment Details","","NULL");
    }
    public void selectCountry(String country) {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(otherRadioButton);
        //getReusableActions().javascriptScrollByVisibleElement(countryDropDown);
        getReusableActions().clickWhenReady(countryDropDown);
        getReusableActions().selectWhenReadyByVisibleText(countryDropDown, country);
        getReusableActions().clickWhenReady(countryDropDown);
        //reporter.reportLogWithScreenshot("Country: " + country + " is selected");
        reporterSnapshot(countryDropDown,country,"","NULL");
    }

    public void selectCancelButton() {
        getReusableActions().clickWhenReady(selectCancelButton);
        getReusableActions().isElementVisible(noProceedButton, 10);
        getReusableActions().clickWhenReady(noProceedButton);
        //reporter.reportLogWithScreenshot("Alert info");
        reporterSnapshot(noProceedButton,"Alert Info","","NULL");
    }

    public void setManuallyBillingAddress(String address, String city, String postalCode) {
        getReusableActions().isElementVisible(addressInput, 10);
        addressInput.clear();
        addressInput.sendKeys(address);
        getReusableActions().staticWait(3000);
        getReusableActions().isElementVisible(cityInput, 10);
        cityInput.clear();
        cityInput.sendKeys(city);
        getReusableActions().staticWait(3000);
        getReusableActions().isElementVisible(provinceDropDown, 10);
        provinceDropDown.click();
        provinceOntarioOption.click();
        getReusableActions().staticWait(3000);
        getReusableActions().isElementVisible(postalCodeInput, 10);
        postalCodeInput.click();
        //postalCodeInput.clear();
        postalCodeInput.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        postalCodeInput.sendKeys(postalCode);
        getReusableActions().staticWait(2000);
        //reporter.reportLogWithScreenshot("Address is manually filled");
        reporterSnapshot(addressInput,"Address Details","","NULL");
    }

    public void validateCheckboxError() {
        reporter.softAssert(vestaCheckboxError.getText().equals("Please, check the checkbox to proceed."), "Error message in Vesta checkbox is being displayed", "Error is not being displayed");
        reporter.softAssert(authorizeCheckboxError.getText().equals("Please, check the checkbox to proceed."), "Error message in authorize checkbox is being displayed", "Error is not being displayed");
    }

    public void verifySaveReceiptCTA() {
        reporter.softAssert(saveReceiptCTA.isDisplayed(), "Save receipt CTA is being displayed", "Save recept CTA is not being displayed");
        reporter.softAssert(newTopUpCTA.isDisplayed(), "Start a new topup CTA is being displayed", "Start a new topup CTA is not being displayed");
    }

    public void validateTopUpQuantity() {
        getReusableActions().waitForElementVisibility(topupAmountField, 10);
        topupAmountField.click();
        topupAmountField.sendKeys("10");
        creditCardRadio.click();
        reporter.softAssert(!getReusableActions().isElementVisible(errorIcon), "There is no error being displayed", "there is an error being displayed");
        topupAmountField.clear();
        topupAmountField.sendKeys("100");
        reporter.softAssert(!getReusableActions().isElementVisible(errorIcon), "There is no error being displayed", "there is an error being displayed");
        topupAmountField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        topupAmountField.sendKeys("300");
        reporter.softAssert(accountBalanceExceed.getText().equals("Sorry, Your account balance cannot exceed $300. Please enter a lower amount."), accountBalanceExceed.getText(), "error message is not correct");
        topupAmountField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        topupAmountField.sendKeys("0");
        reporter.softAssert(accountBalanceExceed.getText().equals("Amount should be at least $0.01"), accountBalanceExceed.getText(), "error message is not correct");
    }

    public void clickNewTopUp() {
        getReusableActions().staticWait(6000);
        //getReusableActions().javascriptScrollByVisibleElement(saveReceiptCTA);
        getReusableActions().clickWhenReady(newTopUpCTA, 10);
        getReusableActions().staticWait(6000);
    }

    public void clickNewTopUpButtonLink() {
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(newTopUpCTALink);
        getReusableActions().clickWhenReady(newTopUpCTALink, 10);
    }

    public void modifyBillingAddress(String address) {
        addressInput.clear();
        getReusableActions().isElementVisible(addressInput, 10);
        addressInput.click();
        addressInput.sendKeys(address);
    }

    public void validateBillingAddressFields(String address, String city, String province, String postalCode) {
        String print;
        address.equals(addressInput.getAttribute("value"));
        city.equals(cityInput.getAttribute("value"));
        province.equals(provinceDropDown.getAttribute("value"));
        reporter.softAssert(postalCode.equals(postalCodeInput.getAttribute("value")), "Address: " + address + "City: " + city + "Province: " + province + "PostalCode: " + postalCode, "The fields dont match");
    }

    public void clickRegisterHere() {

        getReusableActions().clickWhenReady(registerHere, 10);
        reporterSnapshot(registerHere,"Register Here","","NULL");
    }

    public void validationForTheCountryChange(String value) {
        if (value.equals("Canada")) {
            getReusableActions().selectWhenReady(countryDropDown, "CA");
            //System.out.println(getReusableActions().getSelectedValue(countryDropDown));
            String strActVal = getReusableActions().getSelectedValue(countryDropDown);
            //reporter.softAssert(getReusableActions().getSelectedValue(countryDropDown).equals("Canada"), " canada is selected", "canada is not selected");
            reporterSnapshot(countryDropDown,value,strActVal,"COMPARE");

        } else {
            getReusableActions().selectWhenReady(countryDropDown, "US");
            //System.out.println(getReusableActions().getSelectedValue(countryDropDown));
            String strActVal = getReusableActions().getSelectedValue(countryDropDown);
            //reporter.softAssert(getReusableActions().getSelectedValue(countryDropDown).equals("Canada"), " canada is selected", "canada is not selected");
            reporterSnapshot(countryDropDown,value,strActVal,"COMPARE");
        }
    }

    public void validateCheckboxErrorMessage() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(errorMessage);
        //reporter.softAssert(errorMessage.getText().equals("Please, check the checkbox to proceed."), "valid error", "invalid error");
        reporterSnapshot(errorMessage,"Agree to the terms before continuing.","","common");
    }

    public void validateGuestTopUpPageText() {
        getReusableActions().javascriptScrollByVisibleElement(topUpAsGuestText);
        //reporter.softAssert(getReusableActions().isElementVisible(topUpAsGuestText), "you are in UnAuthenticated top up", "you are NOT in UnAuthenticated top up");
        reporterSnapshot(topUpAsGuestText,"Top-up as Guest","","VISIBLE");
    }

    public void validateAccountBalanceExceed() {
        getReusableActions().javascriptScrollByVisibleElement(accountBalanceExceed);
        //reporter.softAssert(accountBalanceExceed.getText().equals("Error! Account balance cannot exceed $300. Please enter a lower amount."), accountBalanceExceed.getText(), "error message is not correct");
        reporterSnapshot(accountBalanceExceed,"exceed $300","","Common");
    }
    public void validateTopUpFieldWithEqualAmount(String topUp) {
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(topUpInput);
        topUpInput.click();
        topUpInput.sendKeys(topUp);
        topUpInput.sendKeys(Keys.TAB);
        //reporter.softAssert(!getReusableActions().isElementVisible(errorIcon), "There is no error being displayed", "there is an error being displayed");
        reporterSnapshot(errorIcon,"topUpInput","","notvisible");
    }

    public void validateOrderConfirmPage(String phoneNumber, String creditCard) {
        getReusableActions().isElementVisible(phoneNumberOnReceipt, 20);
        getReusableActions().staticWait(3000);
        System.out.println(phoneNumberOnReceipt.getText());
        reporter.softAssert(phoneNumberOnReceipt.getText().equals(phoneNumber), "valid phoneNumber in confirm payment step", "invalid phoneNumber");
        String text = creditCardNumberOnReceipt.getText();
        String cardNumber = "**** **** **** " + creditCard.substring(12);
        reporter.softAssert(text.equals(cardNumber), "valid cardNumber in in confirm payment step", "invalid cardNumber");
        reporter.reportLogWithScreenshot("Confirm payment step message");
    }

    public void selectCancelButtonInConfirmPayment() {
        getReusableActions().javascriptScrollByVisibleElement(selectCancelPayment);
        selectCancelPayment.click();
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(popUpWindowMessage);
        System.out.println(popUpWindowMessage.getText());
        reporter.softAssert(popUpWindowMessage.getText().equals("If you cancel, all data will be erased and you will be redirected to the first step of the flow."), popUpWindowMessage.getText(), "invalid message");
        noProceedButton.click();
    }

    public void clearTheTopUpAmountField() {
        getReusableActions().javascriptScrollByVisibleElement(topupAmountField);
        topupAmountField.click();
        topupAmountField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        getReusableActions().staticWait(2000);
    }

    public void validateCreditCardErrorMessage() {
        getReusableActions().javascriptScrollByVisibleElement(creditCardErrorMessage);
        getReusableActions().staticWait(2000);
        reporter.softAssert(creditCardErrorMessage.getText().equals("Sorry, there was an error. Please refresh the page and try again."), creditCardErrorMessage.getText(), "Error message not found");
    }

    public void setManuallyBillingAddressOtherCountry(String address, String city, String postalCode, String province) {
        getReusableActions().isElementVisible(addressLine1Input, 10);
        //addressInput.clear();
        addressLine1Input.sendKeys(address);
        getReusableActions().isElementVisible(cityInput, 10);
        //cityInput.clear();
        cityInput.sendKeys(city);
        getReusableActions().isElementVisible(provinceDropDownOtherCountry, 10);
        provinceDropDownOtherCountry.click();
        provinceDropDownOtherCountry.sendKeys(province);
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(postalCodeInput, 10);
        postalCodeInput.click();
        //postalCodeInput.clear();
        postalCodeInput.sendKeys(postalCode);
        getReusableActions().staticWait(2000);
        //reporter.reportLogWithScreenshot("Address is manually filled");
        reporterSnapshot(postalCodeInput,"Address Details","","NULL");
    }

    public void clearFillCreditCardInfo() {
        //set Topup
        getReusableActions().javascriptScrollByVisibleElement(topupAmountField);
        getReusableActions().waitForElementVisibility(topupAmountField, 20);
        topupAmountField.click();
        topupAmountField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        topupAmountField.sendKeys(Keys.DELETE);
        //app vesta iframe
        WebElement ccDetailsFrame = getDriver().findElement(By.xpath("//iframe[@class]"));
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame, 30);
        //set Credit Card Number
        getReusableActions().waitForElementTobeClickable(creditCardField, 30);
        creditCardField.click();
        creditCardField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        creditCardField.sendKeys(Keys.DELETE);
        //set CVV
        getReusableActions().waitForElementTobeClickable(cvvField, 30);
        cvvField.click();
        cvvField.sendKeys(Keys.BACK_SPACE);
        cvvField.sendKeys(Keys.BACK_SPACE);
        cvvField.sendKeys(Keys.BACK_SPACE);
        //set ExpiryDate
        getReusableActions().waitForElementTobeClickable(expDateField, 30);
        expDateField.click();
        expDateField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        expDateField.sendKeys(Keys.DELETE);
        getReusableActions().staticWait(8000);
        //reporter.reportLogWithScreenshot("Credit card details are populated");
        reporterSnapshot(expDateField,"Credit card details","","NULL");
        getDriver().switchTo().defaultContent();
    }

    public void selectAnotherCard() {
        getReusableActions().isElementVisible(useAnotherCard);
        useAnotherCard.click();
    }

    public void submitPhoneNumberSignIn(String phoneNumber) {
        getReusableActions().isElementVisible(phoneNumberFieldEas);
        phoneNumberFieldEas.click();
        phoneNumberFieldEas.sendKeys(phoneNumber);
    }

    public void clickSubmitButton() {
        getReusableActions().clickWhenReady(submitButton, 10);
    }

    public void clickCreditCardFrench() {
        getReusableActions().staticWait(2000);
        phoneNumberCheck.isDisplayed();
        reporterSnapshot(phoneNumberCheck,"Chatr Phone Number","","NULL");
        getReusableActions().waitForElementVisibility(creditCardRadioFrench, 10);
        creditCardRadioFrench.click();

    }

    public void checkboxErrorMessage() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(errorMessage);
        //reporter.softAssert(errorMessage.getText().equals("Please, check the checkbox to proceed."), "valid error", "invalid error");
        reporterSnapshot(errorMessage,"Please, check the checkbox to proceed.","","GEN");
    }

    public void addressClear() {
        getReusableActions().clickWhenReady(addressInput);
        addressInput.clear();
    }

    public void validateTopUpAmountMoreThan$300(String topUp) {
        topupAmountField.sendKeys(topUp);
        getReusableActions().staticWait(1000);
        topupAmountField.sendKeys(Keys.TAB);
        getReusableActions().staticWait(1000);
        scrollToMiddleOfElement(topupErrorMsgField);
        getReusableActions().staticWait(2000);
        reporterSnapshot(topupErrorMsgField,"exceed $300. Try a lo","","common");
    }
    public void validateAutoPayTopUpAmountMoreThan$300() {
        getReusableActions().javascriptScrollByVisibleElement(autopayTopupErrorMsgField);
        //reporter.softAssert(autopayTopupErrorMsgField.isDisplayed(), accountBalanceExceed.getText(), "error message is not correct");
        reporterSnapshot(autopayTopupErrorMsgField,"exceed $300. Try a lo","","common");
    }
    public void fillAutoPayTopUpAmount(String topUp) {
        autopayTopupAmountField.sendKeys(topUp);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(autopayTopupErrorMsgField.isDisplayed(), accountBalanceExceed.getText(), "error message is not correct");
        //reporterSnapshot(autopayTopupErrorMsgField,"exceed $300. Try a lo","","gen");
    }
    public void clickNewTopUFrench() {
        getReusableActions().clickWhenReady(newTopUpCTAFrench, 10);
    }

    public void clickForgotUserName() {
        getReusableActions().clickWhenReady(forgotUserName, 10);
        reporterSnapshot(forgotUserName,"forgot UserName","","NULL");
    }

    public void validateHelloBanner() {
        getReusableActions().javascriptScrollByVisibleElement(helloBanner);
        getReusableActions().isElementVisible(helloBanner);
        reporterSnapshot(helloBanner,"Hello","","common");
        //reporter.softAssert(balanceBanner.getText().replace("$", "").trim().matches("([0-9]+)([/.])([0-9]+)"),"VALID FIELD - \"" + balanceBanner.getText() + "\" ARE DISPLAYED EXPECTED FORMAT SUCCESSFULLY","INVALID : FIELD - \"" + balanceBanner.getText() + "\" ARE NOT DISPLAYED EXPECTED FORMAT SUCCESSFULLY");
        reporterSnapshot(balanceBanner,"([/$])([0-9]+)([/.])([0-9]+)","","format");
        reporterSnapshot(anniversaryDate,"anniversary Date","","display");
    }
    public void validateAccountBalanceEnglish(){
        getReusableActions().javascriptScrollByVisibleElement(accountBalance);
        reporterSnapshot(accountBalance,"account Balance","","display");
        reporterSnapshot(balanceBanner,"([/$])([0-9]+)([/.])([0-9]+)","","format");
        reporterSnapshot(topUp,"TopUp","","display");

    }
    public void validateAccountBalanceFrench(){
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(accountBalanceFrench);
        reporterSnapshot(accountBalanceFrench,"account Balance","","display");
        reporterSnapshot(balanceBanner,"([0-9]+)([/,])([0-9]+)([\\s*?])([/$])","","format");
        reporterSnapshot(topUpFrench,"TopUp","","display");
    }
    public void validateHelloBannerFrench() {
        getReusableActions().javascriptScrollByVisibleElement(helloBannerFrench);
        reporterSnapshot(helloBannerFrench,"Bonjour","","common");
        //reporter.softAssert(balanceBanner.getText().replace(" $", "").trim().matches("([0-9]+)([/,])([0-9]+)"),"VALID FIELD - \"" + balanceBanner.getText() + "\" ARE DISPLAYED EXPECTED FORMAT SUCCESSFULLY","INVALID : FIELD - \"" + balanceBanner.getText() + "\" ARE NOT DISPLAYED EXPECTED FORMAT SUCCESSFULLY");
        reporterSnapshot(balanceBanner,"([0-9]+)([/,])([0-9]+)([\\s*?])([/$])","","format");
        reporterSnapshot(anniversaryDate,"anniversary Date","","display");
    }
    public String getAddressLine1(){
        String addressField =addressInput.getAttribute("value");
        return addressField;
    }
    public String getCity(){
        String cityField =cityInput.getAttribute("value");
        return cityField;
    }
    public String getPostalCode(){
        String postalCode = postalCodeInput.getAttribute("value");
        return postalCode;
    }
    public void validateProfileAddressField(String address, String city, String postalCode){
        reporter.softAssert(!profileAddress.getText().equals(address),"addressField change: "+profileAddress.getText(),"addressField not change");
        reporter.softAssert(!profileCity.getText().equals(city),"cityField change: "+profileCity.getText(),"CityField not change");
        reporter.softAssert(!profilePostalCode.getText().equals(postalCode),"postalCode change: "+profilePostalCode.getText(),"postalCode not change");
    }
    public void validateBillingAddressField(){
        reporterSnapshot(ppcPaymentAddress,"profile Address","","NOTEMPTY");
        reporterSnapshot(ppcPaymentCity,"profile City","","NOTEMPTY");
        reporterSnapshot(ppcPaymentPostalCode,"profile PostalCode","","NOTEMPTY");
    }
    public void validateBillingAddressWithProfile(String address1, String city, String postalCode){
       String post = postalCode.substring(0,3);
       String post1= postalCode.substring(3,6);
       reporterSnapshot(ppcPaymentAddress,address1,"","value");
       reporterSnapshot(ppcPaymentCity,city,"","value");
       reporterSnapshot(ppcPaymentPostalCode,post+" "+post1,"","value");
//        ppcPaymentAddress.click();
//        reporterSnapshot(ppcPaymentAddress,address1,"","Value");
//        ppcPaymentCity.click();
//        reporterSnapshot(ppcPaymentCity,city,"","Value");
//        ppcPaymentPostalCode.click();
//        reporterSnapshot(ppcPaymentPostalCode,postalCode,"","Value");

    }
    public void validateBillingAddressChange(String address, String city, String postalCode){
        reporter.softAssert(!addressInput.getAttribute("value").equals(address),"address not match","address is match");
        reporter.softAssert(!cityInput.getAttribute("value").equals(city),"city not match","city is match");
        reporter.softAssert(!postalCodeInput.getAttribute("value").equals(postalCode),"postal code not match","postalCode is match");

    }
    public void clickOnRefreshPage() throws AWTException {
        getReusableActions().staticWait(4000);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_R);
        r.delay(100);
        r.keyPress(KeyEvent.VK_ENTER);
        getReusableActions().staticWait(100);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_R);
        r.keyRelease(KeyEvent.VK_ENTER);
        getReusableActions().staticWait(5000);
        reporterSnapshot(provinceInput,"Refresh A Page","","NULL");
        getReusableActions().staticWait(5000);
    }
    public void setInternationalAddress(String province, String address, String city, String postalCode){
        getReusableActions().isElementVisible(provinceInput,10);
        provinceInput.sendKeys(province);
        getReusableActions().isElementVisible(autoCompleteAddressInput);
        getReusableActions().clickWhenReady(autoCompleteAddressInput);
        addressLine.sendKeys(address);
        cityInput.sendKeys(city);
        postalCodeInput.click();
        postalCodeInput.sendKeys(postalCode);
        //reporter.reportLogWithScreenshot("Address is manually filled");
        reporterSnapshot(provinceInput,"International Address Details","","NULL");
    }

    public void validatePhoneNumberFrench(String phoneNumber) {
        getReusableActions().isElementVisible(phoneNumberField);
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
        getReusableActions().staticWait(1000);
        //reporter.softAssert(numberVerifiedMessage.getText().contains("phone trouv"), "valid phone number message", "invalid message");
        reporterSnapshot(numberVerifiedMessage,"phone trouv","","common");
    }



    public void checkAuthorizeCheckboxFrench() {
        getReusableActions().staticWait(3000);
        getReusableActions().waitForElementVisibility(authorizeChargeCheckboxFrench, 10);
        authorizeChargeCheckboxFrench.click();
        getReusableActions().staticWait(1000);
    }
    public void clickAutoPayEnrollLink() {
        getReusableActions().javascriptScrollByVisibleElement(myChatrHome);
        myChatrHome.click();
        getReusableActions().staticWait(3000);
        getReusableActions().waitForElementVisibility(autoPayEnrollLink, 10);
        getReusableActions().clickWhenReady(autoPayEnrollLink, 10);
        reporterSnapshot(autoPayEnrollLink,"auto Pay Enroll Link","","NULL");
    }
    public void validateCurrentAccountBalance(){
        getReusableActions().javascriptScrollByVisibleElement(currentBalance);
        //reporter.softAssert(getReusableActions().isElementVisible(currentBalance),currentBalance.getText(),"current account balance not visible");
        reporterSnapshot(currentBalance,"current Balance","","visible");
    }
    public void validatePaymentPageAppears(){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(radioButtonVoucher);
        reporterSnapshot(radioButtonVoucher,"Payment Page","","DISPLAY");

    }
    public void validateSavedDataErased(){
        //reporter.softAssert(topupAmountField.getAttribute("value").isEmpty(),"data erased","data not erased");
        reporterSnapshot(topupAmountField,"topup Amount","","empty");
    }
    public void validateSavedDataErasedCreditCard(){
        WebElement ccDetailsFrame = getDriver().findElement(By.xpath("//iframe[@class]"));
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame, 30);
        //reporter.softAssert(creditCardField.getAttribute("value").isEmpty(),"card number data erased","card number data not erased");
        //reporter.softAssert(cvvField.getAttribute("value").isEmpty(),"cvv data erased","cvv data not erased");
        //reporter.softAssert(expDateField.getAttribute("value").isEmpty(),"expiryDate data erased","expiryDate data not erased");
        reporterSnapshot(creditCardField,"creditCard","","empty");
        reporterSnapshot(cvvField,"cvv","","empty");
        reporterSnapshot(expDateField,"expDate","","empty");
        getDriver().switchTo().defaultContent();
    }
    public void populateTopUpAmount_care(String topUp) {
        careTopUpAmountField.click();
        careTopUpAmountField.sendKeys(topUp);
        reporterSnapshot(careTopUpAmountField,topUp,"","NULL");
    }
    public void validateCreditCardField() {
        //getReusableActions().isElementVisible(topupAmountField, 20);
        getReusableActions().staticWait(3000);
        WebElement ccDetailsFrame = getDriver().findElement(By.xpath("//iframe[@class]"));
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame, 20);
        getReusableActions().javascriptScrollByVisibleElement(existingCCNumberText);
        getReusableActions().staticWait(3000);
        reporterSnapshot(existingCCNumberText,"creditCard","","ENABLE");
        reporterSnapshot(cvvField,"CVV","","ENABLE");
        reporterSnapshot(expDateField,"expDate","","ENABLE");
        getDriver().switchTo().defaultContent();
    }
    public void validateBillingAddressFieldDisplay() {
        reporterSnapshot(profileAddress, "profile Address", "", "Display");
        reporterSnapshot(profileCity, "profile City", "", "Display");
        reporterSnapshot(profilePostalCode, "profile PostalCode", "", "Display");
    }
    public void clickOnMyChatr(){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(myChatr);
        myChatr.click();
        getReusableActions().staticWait(3000);
        reporterSnapshot(myChatr,"My Chatr","","NULL");
    }
    public void validateContinueConfirmButtonEnabled() {
        getReusableActions().waitForElementVisibility(confirmPaymentContinueCTA, 10);
        //confirmPaymentContinueCTA.click();
        getReusableActions().staticWait(3000);
        reporterSnapshot(confirmPaymentContinueCTA,"confirm","","ENABLED");
    }
    public void validateTopUpAmtDisplay(String topUp) {
        getReusableActions().staticWait(1000);
        creditCardRadio.click();
        getReusableActions().staticWait(1000);
        topupAmountField.click();
        topupAmountField.sendKeys(topUp);
        getReusableActions().waitForElementTobeClickable(paymentMethodContinueCTA, 10);
        getReusableActions().staticWait(2000);
        reporterSnapshot(topupAmountField,"Top-Up Amount","","DISPLAY");
    }
    public void checkServiceAgreementCheckboxSS() {
        getReusableActions().waitForElementVisibility(vestaServiceAgreementCheckboxSS, 10);
        vestaServiceAgreementCheckboxSS.click();
    }
    public void checkAuthorizeCheckboxSS() {
        getReusableActions().waitForElementVisibility(checkAuthorizeCheckboxSS, 10);
        checkAuthorizeCheckboxSS.click();
    }
    public void clickOnReviewCheckbox() {
        getReusableActions().staticWait(3000);
        getReusableActions().clickWhenReady(checkBoxReviewPage, 10);
    }
    public void validatePaymentInfotopup() {
        getReusableActions().staticWait(2000);
        scrollToMiddleOfElement(suggestTopUpMessage);
        getReusableActions().staticWait(500);
        //reporter.softAssert(getReusableActions().isElementVisible(suggestedTopUpMessage), "Suggested topup amount message is appearing", "Suggested topup amount message is not appearing");
        reporterSnapshot(suggestTopUpMessage,"Payment Info","","visible");
        //getReusableActions().clickWhenReady(paymentMethodInfoCloseCTA, 10);

    }
    public long getDateAndTime() {
        getReusableActions().staticWait(3000);
        String reciptDateandTime = reciptDateTimePath.getText();
        reporterSnapshot(reciptDateTimePath,"Recipt Date and Time","","Display");
        System.out.println(reciptDateandTime);
        String plainDate=reciptDateandTime.replaceAll("[^a-zA-Z0-9]","");
        long dateAndTime=Long.parseLong(plainDate);
        System.out.println(dateAndTime);
        return dateAndTime;
    }
    public void clickOnContinue() {
        getReusableActions().staticWait(3000);
        //getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().javascriptScrollByVisibleElement(continueBtn);
//        getReusableActions().waitForElementVisibility(continueBtn, 10);
      //  getReusableActions().javascriptScrollByVisibleElement(continueBtn);
        continueBtn.click();

    }
    public void clickOnBackToDashboard() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollToTopOfPage();
        getReusableActions().javascriptScrollByVisibleElement(backToDasboard);
        backToDasboard.click();
        getReusableActions().staticWait(3000);
        reporterSnapshot(backToDasboard, "My Chatr", "", "NULL");
    }
    public void selectAnotherTopup() {
        getReusableActions().javascriptScrollByVisibleElement(anotherTopUp);
        getReusableActions().isElementVisible(anotherTopUp);
        anotherTopUp.click();
        getReusableActions().staticWait(3000);
    }
    public void selectonsaveCCDetails() {
        getReusableActions().javascriptScrollByVisibleElement(saveCCCheckbox);
        getReusableActions().isElementVisible(saveCCCheckbox);
        saveCCCheckbox.click();
        reporterSnapshot(saveCCCheckbox,"CHECK BOX SELCTED","","NULL");
        getReusableActions().staticWait(3000);
    }
    public void validateSelectCancelandContinuFlow(){
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(continueInPopup);
        reporterSnapshot(continueInPopup,"Cancel","","DISPLAY");
        continueInPopup.click();
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(paymentMethodContinueCTA);
        reporterSnapshot(paymentMethodContinueCTA,"Continue","","DISPLAY");
        paymentMethodContinueCTA.click();
    }
    public void validateSaveReceiptCTA(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(saveReceiptCTA);
        getReusableActions().staticWait(1000);
        reporterSnapshot(saveReceiptCTA,"Save Receipt CTA","","DISPLAY");
    }
    public void verifyReceiptVoucher(String phoneNumber) {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(firstStepCheck);
        reporterSnapshot(firstStepCheck,"first Step Check","","Visible");
        getReusableActions().javascriptScrollByVisibleElement(secondStepCheck);
        reporterSnapshot(secondStepCheck,"second Step Check","","Visible");
        getReusableActions().javascriptScrollByVisibleElement(thirdStepCheck);
        reporterSnapshot(thirdStepCheck,"third Step Check","","Visible");
        getReusableActions().javascriptScrollByVisibleElement(receiptBanner);
        reporterSnapshot(receiptBanner,"receipt Banner","","Visible");
        getReusableActions().javascriptScrollByVisibleElement(successMessage);
        reporterSnapshot(successMessage,"success Message","","Visible");

        //reporter.softAssert(verifyPhoneNumber(phoneNumber, receiptPhoneNumber), "the phone number is the same", "the phone number is not the same");
        reporterSnapshot(receiptPhoneNumber,phoneNumber,receiptPhoneNumber.getText().replace("-",""),"compare");

        //reporter.softAssert(verifyCreditCard(creditCard, receiptCreditCard), "the last 4 digits are the same", "the last 4 digits are not the same");
        //reporterSnapshot(receiptCreditCard,creditCard.substring(12),receiptCreditCard.getText().substring(15),"match");

        //reporter.softAssert(verifyTopUpAmount(topup, receiptSubtotal), "the topup amount is the same", "the topup amount is not the same");
        //String tempActVal = receiptSubtotal.getText().replace("$","");
        //int endStrVal = tempActVal.length() - 3;
        //reporterSnapshot(receiptSubtotal,topup,tempActVal.substring(0,endStrVal),"match");
    }
    public String setToPhoneNumberExcel(String status) {
        String phoneNumber = getUnusedNAC(status);
        getReusableActions().staticWait(3000);
        getReusableActions().isElementVisible(phoneNumberField);
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
        //reporter.softAssert(numberVerifiedMessage.getText().equals("Phone number found."), "valid phone number message", "invalid message");
        reporterSnapshot(numberVerifiedMessage,"Phone number found.","","GEN");
        setUsedNACStatus(phoneNumber);
        return phoneNumber;
    }
    public void getToPhoneNumberExcel(String status) {
        String phoneNumber = getUnusedNAC(status);
        getReusableActions().staticWait(3000);
        getReusableActions().isElementVisible(phoneNumberField);
        phoneNumberField.click();
        phoneNumberField.sendKeys(phoneNumber);
        //reporter.softAssert(numberVerifiedMessage.getText().equals("Phone number found."), "valid phone number message", "invalid message");
        reporterSnapshot(numberVerifiedMessage,"Phone number found.","","GEN");
    }

    public void clickEditVoucherPin(){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollToTopOfPage();
        reporterSnapshot(editVoucherPin,"Edit","","GEN");
        editVoucherPin.click();
    }

    public void validateEditOptionIsDisabled() {
        getReusableActions().staticWait(5000);
        System.out.println("============ >>Size is "+editLink.size());
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(topUpYourAccountText);
        reporterSnapshot(null, "Edit Option", String.valueOf(
                editLink == null ? 0 : editLink.size()), "HIDDEN");
        getReusableActions().javascriptScrollByVisibleElement(receiptBanner);
        reporterSnapshot(null, "Edit Option", String.valueOf(
                editLink == null ? 0 : editLink.size()), "HIDDEN");
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(2000);
    }
    public void clickOnReviewContinueButton() {
        getReusableActions().staticWait(2000);
        getReusableActions().waitForElementVisibility(continueReview, 10);
        continueReview.click();
        getReusableActions().staticWait(3000);
    }
    public void validateSuccessTopUpMessage(){
        getReusableActions().staticWait(7000);
        reporterSnapshot(successMessage,"Success!","","Gen");
        //reporterSnapshot(successVoucherMessage,"completed your chatr top-up payment","","COMMON");
        //reporter.softAssert(saveReceiptCTA.isDisplayed(), "Save receipt CTA is being displayed", "Save recept CTA is not being displayed");
    }
    public void validateAllMandatoryFiledInBillingAddress(){
        getReusableActions().javascriptScrollByVisibleElement(firstNameField);
        firstNameField.click();
        getReusableActions().staticWait(2000);
        lastNameField.click();
        getReusableActions().staticWait(2000);
        addressLine1Input.click();
        getReusableActions().staticWait(3000);
        provinceDropDownOtherCountry.click();
        getReusableActions().staticWait(3000);
        cityInput.click();
        getReusableActions().staticWait(2000);
        postalCodeInput.click();
        getReusableActions().staticWait(2000);
        cityInput.click();
        getReusableActions().staticWait(2000);
        List<WebElement> allError = getDriver().findElements(By.xpath("//span[text()='Error! This field is required.']"));
        reporter.softAssert((allError.size())==6, "VALID : ALL MANDATORY FIELDS WERE DISPLAYED ", "INVALID :ALL MANDATORY FIELDS WERE NOT DISPLAYED ");
    }
    public void validateAllDashboardTab() {
        getReusableActions().staticWait(4000);
        getReusableActions().executeJavaScript("document.body.style.zoom='50%'");
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(helloBanner);
        getReusableActions().isElementVisible(helloBanner);
        getReusableActions().isElementVisible(autoPayEnrollLink);
        getReusableActions().isElementVisible(lookingGood);
        reporterSnapshot(lookingGood,"My Chatr Dasboard page","","display");
        getReusableActions().executeJavaScriptClick(currentPlanCTA);
        getReusableActions().staticWait(2000);
        reporterSnapshot(changePlanButton,"Plan Details Dasboard page","","display");
        getReusableActions().executeJavaScriptClick(profileCTA);
        getReusableActions().staticWait(2000);
        reporterSnapshot(profileCTA,"Profile Dasboard page","","display");
    }
    public void validatePopulateCTN(){
        getReusableActions().staticWait(4000);
        scrollToMiddleOfElement(populatedphoneNumber);
        reporterSnapshot(populatedphoneNumber,"Phone Number","","DISPLAY");
    }
    public void validateSavedDataErasedAddress(){
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(otherRadioButton);
        reporterSnapshot(firstNameField,"Name Field","","empty");
        reporterSnapshot(addressInput,"Adress Filed","","empty");
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(2000);
    }
}

