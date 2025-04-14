package com.rogers.pages;

import com.rogers.data.handlers.TestDataHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class CP_HomePage extends BasePage {

    @FindBy(xpath = "//*[@id='ds-form-input-id-0']")
    WebElement phoneNumberInput;
    @FindBy(xpath = "//input[@formcontrolname='firstName']")
    WebElement firstNameInput;
    @FindBy(xpath = "//input[@formcontrolname='lastName']")
    WebElement lastNameInput;
    @FindBy(xpath = "//input[@formcontrolname='email']")
    WebElement emailInput1;
    @FindBy(xpath = "//input[@formcontrolname='postalCode']")
    WebElement postalCodeInput1;
    @FindBy(xpath = "//button[contains(@title,'Search')]")
    WebElement searchButton;
    @FindBy(xpath = "//button[contains(@title,'Search')]")
    WebElement searchButtonCare;
    @FindBy(xpath = "//span[contains(text(),'Clear')]")
    WebElement resetButton;
    @FindBy(xpath = "(//div[1]/table)[2]")
    WebElement customerTable;
    @FindBy(xpath = "//div[1]/table/tbody/tr/td[3]")
    WebElement pinCodeElement;
    @FindBy(xpath = "//table[@role='table']/tbody/tr/td[6]")
    WebElement emailElement;
    @FindBy(xpath = "//select")
    WebElement paginationDropdown;
    @FindBy(xpath = "//div[1]/table/tbody/tr/td[7]/button")
    WebElement checkButton;
    @FindAll({@FindBy(name = "dateOfBirth"),@FindBy(id = "ds-form-input-id-5"),@FindBy(xpath = "//input[@formcontrolname='dateOfBirth']")})
    WebElement dateOfBirthInput;
    @FindBy(xpath = "(//input[@formcontrolname='postalCode'])[2]")
    WebElement postalCodeInput2;
    @FindBy(xpath = "//input[@formcontrolname='email']")
    WebElement emailInput2;
    @FindBy(xpath = "//input[@formcontrolname='anniversaryDay']")
    WebElement anniversaryDayInput;
    @FindBy(xpath = "//input[@formcontrolname='creditCardLast4Digits']")
    WebElement creditCardInput;
    @FindBy(xpath = "//button[contains(@title,'Submit')]") //(//button)[13]")
    WebElement confirmButton;
    @FindBy(xpath = "(//button[contains(@title,'Clear')])[2]")
    WebElement reset;
    @FindBy(xpath = "//app-search/ds-error/span[1]")
    WebElement searchErrorMessage;
    @FindBy(xpath = "//span[contains(text(),'birth format')]")
    WebElement dateOfBirthErrorMessage;
    @FindBy(xpath = "//span[contains(text(),'code format')]")
    WebElement postalCodeErrorMessage;
    @FindBy(xpath = "//span[contains(text(),'Email format')]")
    WebElement emailErrorMessage;
    @FindBy(xpath = "//span[contains(text(),'date format')]")
    WebElement anniversaryDayErrorMessage;
    @FindBy(xpath = "//span[contains(text(),'enter last 4')]")
    WebElement creditCardErrorMessage;
    @FindBy(xpath = "//span[contains(text(),'One or more of the answers provided')]")
    WebElement invalidDetailsErrorMessage;
    @FindBy(xpath = "//*[@id='ds-checkbox-id-0-label-container']")
    WebElement portInCheckbox;
    @FindBy(xpath = "//span[contains(text(),'Make sure you enter')]")
    WebElement moreSearchInfoMessage;
    @FindBy(xpath = "//app-modal-auth/ds-modal/div[1]/p")
    WebElement customerName;
    @FindBy(xpath = "//app-modal-auth/ds-modal/div[2]/div[1]/div/div")
    WebElement answeringCriteriaMessage;
    @FindBy(xpath = "//ds-table-container/div[1]/table[2]/tr/td")
    WebElement noResultsFoundMessage;
    @FindBy(xpath = "//a[contains(@title,'NAC')]")
    WebElement nacFlowLink;
    @FindBy(xpath = "//span[contains(text(),'ancel')]")
    WebElement noDealerCodeButton;
    @FindBy(xpath = "//button[contains(@title,'Activate')]")
    WebElement nacFlowButton;
    @FindBy(xpath = "//button[@title='Sign out']")
    WebElement signOutButton;
    @FindBy(xpath = "//h2")
    WebElement logoutHeader;
    @FindBy(xpath = "//h5")
    WebElement logoutMessage;
    @FindBy(xpath = "//span[contains(text(),'SIM buy flow')]")
    WebElement simBuyFlowLink;
    @FindBy(xpath = "//a[contains(@title,'Guest')]")
    WebElement anonymousTopUpLink;
    @FindBy(xpath = "//span[contains(text(),'Authentication')]")
    WebElement warningMessage;
    @FindBy(xpath = "//ds-modal/div[1]/button/span/ds-icon/span")
    WebElement closeIcon;
    @FindBy(xpath = "//input[@name='dealerCode']")
    WebElement dealerCodeInput;
    @FindBy(xpath = "//*[text()='Code has been applied']")
    WebElement dealerCodeMessage;
    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    WebElement proceedCodeButton;
    @FindBy(xpath = "//span[contains(text(),'without authentication')]")
    WebElement clickHereButton;
    @FindBy(xpath = "//*[contains(text(),'enough detail')]")
    WebElement warningMessageWildCard;
    @FindBy(xpath = "//caption[normalize-space()='table containing search results']//parent::table//tbody/tr")
    List<WebElement> noOfRows;
    @FindBy(xpath = "//span[contains(text(),'Telephone')]")
    WebElement TelephoneNumberChangeBtn;
    @FindBy(xpath = "//ds-radio-group/div/ds-selection[1]")
    WebElement avlblTelephoneno1;
    @FindBy(xpath = "//span[contains(text(),'Proceed')]")
    WebElement ProceedBtn;
    @FindBy(xpath = "//button[contains(@title,'Yes')]")
    WebElement TelephoneChangeYesBtn;
    @FindBy(xpath = "//span[contains(text(),'Change your location')]")
    WebElement TNCChngLocationBtn;
    @FindBy(xpath = "//div[@class='locations-container']//div[10]") //5
    WebElement TNCSelectProvince;
    @FindBy(xpath = "//select[@id='ds-form-input-id-6']") //select[@id='ds-form-input-id-0']
    WebElement TNCSelectcityDD;
    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    WebElement TNCContinuebtn;
    @FindBy(xpath = "//p[@class='text-body mb-0']")//
    WebElement TNCDiffProvinceError;
    @FindBy(xpath = "//span[contains(text(),'adjustment')]")
    WebElement adjustmentLink;
    @FindBy(xpath = "//p[contains(text(),'adjustment')]")
    WebElement adjustmentModel;
    @FindBy(xpath = "//p[contains(text(),'current balance')]")
    WebElement currentBalance;
    @FindBy(xpath = "//select[@formcontrolname='balanceCode']")
    WebElement balanceCode;
    @FindBy(xpath = "//ds-radio-button[2]/label/div[1]/div")
    WebElement debitOption;
    @FindBy(xpath = "//input[@formcontrolname='enterAdjustmentAmount']")
    WebElement adjustmentAmountField;
    @FindBy(xpath = "//span[contains(text(),'deduct from balance')]")//span[contains(text(),'deduct this amount')]
    WebElement errorMessage;
    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    WebElement windowSubmitButton;
    @FindBy(xpath = "//span[contains(text(),'Cancel')]")
    WebElement windowCancelButton;
    @FindBy(xpath = "//span[contains(text(),'charge')]")
    WebElement chargeableTransactionLink;
    @FindBy(xpath = "//p[contains(text(),'Administrative')]")
    WebElement chargeableTransactionModel;
    @FindBy(xpath = "//select[@formcontrolname='code']")
    WebElement codeOptions;
    @FindBy(xpath = "//select[@formcontrolname='charge']")
    WebElement chargeOptions;
    @FindBy(xpath = "//select[@formcontrolname='exception']")
    WebElement exceptionOptions;
    @FindBy(xpath = "//span[text()='GO TO TOP-UP']")
    WebElement topUpLink;
    @FindBy(xpath = "//h2[contains(text(),'Telephone number change success')]")//h2[normalize-space()='Telephone number change success']
    WebElement TNCSuccessHeader;
    @FindBy(xpath = "//*[contains(text(),'Manage PIN')]")
    List<WebElement> managePIN;
   // @FindBy(css = ".pl-8")
    @FindBy(xpath = "//span[contains(text(),'t change your autopay ')]")
    WebElement paymentFailedMessage;
    @FindBy(xpath = "//h4[text()='Auto-pay ']")
    WebElement autoPayBlock;
    @FindBy(xpath = "//span[contains(text(),'validation')]")
    WebElement voucherValidation;
    @FindBy(xpath = "//span[contains(text(),'Back to')]")
    WebElement backToScreen;
    @FindBy(xpath = "//span[contains(text(),'card not found')]")
    WebElement voucherError;
    @FindBy(xpath = "//span[contains(text(),'serial number exactly')]")
    WebElement voucherFormatError;
    @FindBy(xpath = "//button[contains(@title,'Top-up')]") //(//span[@class='ds-link__copy'])[2]")
    WebElement topUpCardLink;
    @FindBy(xpath = "//span[contains(text(),'already')]")
    WebElement topUpSerialNumberError;
    @FindBy(xpath = "//span[contains(text(),'This top-up card is not recognized. Try another one ')]")
    WebElement invalidVoucherError;
    @FindBy(xpath = "//span[contains(@class,'success')]") //span[contains(text(),'success')] //span[contains(text(),'Top-up card value')]
    WebElement voucherAdded;
    @FindBy(xpath = "//button[@title='Edit']")
    WebElement editAccountInfo;
    @FindBy(xpath = "//span[contains(text(),'success')]")
    List<WebElement> PINChangeOption;
    @FindBy(xpath = "//span[contains(text(),'Email address')]/ancestor::ds-form-field[contains(@class,'ds-formField')]")
    WebElement emailField_accountInfo;
    @FindBy(xpath = "//*[contains(text(),'Top-up')]/ancestor::button")
    WebElement careTopUp;
    @FindBy(xpath = "//*[contains(@title,'Skip')]")
    List<WebElement> clickHereButton_retail;
    @FindBy(xpath = "//span[contains(text(),'another')]")
    WebElement addOneMoreCardLink;
    @FindBy(xpath = "//span[contains(text(),'try entering')]")
    WebElement tryAgainvoucherError;
    @FindBy(xpath = "//button[contains(text(),'Try Again')]")
    WebElement tryAgainBtn;
    @FindBy(xpath = "(//span[contains(text(),'STORE')])[1]")
    WebElement storeLocatorLink;
    @FindBy(xpath = "//*[contains(text(),'Use my location')]/parent::span/parent::button")
    WebElement useMyLocation;
    @FindBy(xpath = "//div[@aria-label='1']")
    WebElement currentLocationTag;
    @FindBy(xpath = "//p[contains(text(),'Exclusive Offer')]")
    WebElement exclusiveTargetedOffer;
    @FindBy(xpath = "(//div[contains(text(),'Mastercard')])[1]")
    List<WebElement> creditCardRadioList;
    @FindBy(xpath = "(//div[contains(text(),'hatr top')])[1]") //ds-radio-group[@aria-label='Payment method']/div")
    List<WebElement> paymentRadioList;
    @FindBy(xpath = "//p[normalize-space()='Add a card']")
    List<WebElement> addNewCCList;
    @FindBy(xpath = "//span[contains(text(),\" Show top-up options \")]")
    List<WebElement> showTopUpOptions;
    @FindBy(xpath = "//p[contains(text(),'unsuccessful attempts')]")
    List<WebElement> showDashBoardErrorMsg;
    @FindBy(xpath = "//p[contains(text(),'unsuccessful attempts')]")
    WebElement showDashBoardErrorMsgElement;
    @FindBy(xpath = "//span[contains(text(),'dashboard')]")
    WebElement backToDashBoardButton;
    @FindBy(xpath = "//span[contains(text(),'Enable')]")
    WebElement backToDashBoardEnableLink;
    @FindBy(xpath = "//span[text()=' Submit ']")
    WebElement submitButton;
    @FindBy(xpath = "//span[contains(text(),'Continue')]") //Confirm(//button)[13]")
    WebElement continueButton;
    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    List<WebElement> clickHereButton_care;
    @FindBy(xpath = "//span[contains(text(),'used')]")
    List<WebElement> voucherAlreadyUsedError;
    @FindBy(xpath = "//span[contains(text(),'PIN exactly')]")
    WebElement unrecognisedVoucherError;
    @FindBy(xpath = "//span[contains(text(),'Submit')]") //(//button)[13]")
    WebElement submitBtn;

    @FindBy(xpath = "//span[contains(text(),'charge')]")
    List<WebElement> chargeableTransaction;
    @FindBy(xpath = "//lib-add-ons/div/div[3]/h4")//lib-usage-statistics/div[2]/div[2]/div/h2
    WebElement promotionTitle;
    @FindBy(xpath = "//lib-usage-statistics/div[2]/div[2]/div/div[1]")
    WebElement promotionDetails;
    @FindBy(xpath = "//a[contains(@title,'NAC')]")
    List<WebElement> nacFlowLinkList;
    @FindBy(xpath = "//a[contains(@title,'Guest')]")
    List<WebElement> anonymousTopUpLinkList;
    @FindBy(xpath = "//span[contains(text(),'charge')]")
    List<WebElement> chargeableTransactionLinkList;
    @FindBy(xpath = "//span[contains(text(),'Make an adjustment')]")
    List<WebElement> adjustmentLinkList;
    @FindBy(xpath = "//span[contains(text(),'Telephone')]")
    List<WebElement> telephoneNumberChangeLinkList;
    @FindBy(xpath = "//input[@type='tel']")
    List<WebElement> voucherList;
    @FindBy(xpath = "//p[contains(text(),'Confirm port-in request')]")
    List<WebElement> portInList;
    @FindBy(xpath = "//span[contains(text(),'Port-out')]")
    List<WebElement> portOutList;
    @FindBy(xpath = "(//input[@type='text'])[3]")
    WebElement address1;
    @FindBy(xpath = "//span[contains(text(),'Save')]")
    WebElement saveBtn;
    @FindBy(xpath = "//td[@class='ds-table-column-number ds-table-cell -cell text-left ng-star-inserted']")
    List<WebElement> customerDataList;
    @FindBy(xpath = "//button[@type='button']")
    List<WebElement> pageBtnList;
    @FindBy(xpath = "//h2")
    WebElement logoutText;
    @FindBy(xpath = "//span[contains(text(),'Date ')]/following-sibling::span[1]")
    WebElement  dateOfBirthElement;
    @FindBy(xpath = "//span[contains(text(),'Postal ')]/following-sibling::span[1]")
    WebElement postalCodeElement;
    @FindBy(xpath = "//span[contains(text(),'Port-out')]")
    WebElement portOutLink;
    @FindBy(xpath = "(//span[contains(text(),'Enable')])[2]")
    WebElement backToDashBoardEnableBtn;

    @FindBy(xpath = "//lib-port-out-request/ds-modal")
    WebElement portOutPopUp;
    @FindBy(xpath ="//p[contains(text(),'Confirmat')]")
    WebElement cofirmationBtn;
    @FindBy(xpath = "//button[contains(@title,'No')]")
    WebElement TelephoneChangeNoBtn;//
    @FindBy(xpath = "(//input[@type='radio'])[1]")
    WebElement TelephoneNoBtn;
    @FindBy(xpath = "//h2[contains(text(),'Session expired')]")
    WebElement sessionExpired;

    @FindBy(xpath = "//p[contains(text(),'access the portal through')]")
    WebElement toBeginNewSession;
    @FindBy(xpath = "//input[@type='tel']")//*[@aria-label='1st Serial Number']")
    WebElement voucherInput;
    @FindBy(xpath = "//select[@formcontrolname='city']")
    WebElement cityDropdown;
    @FindBy(xpath = "(//span[contains(normalize-space(),'CHATR-Auto')])[1]")
    WebElement envButton;
    @FindBy(xpath = "//p[normalize-space()='Continue with this administrative charge?']")
    WebElement cahrgeableContinueWindow;
    @FindBy(xpath = "//p[normalize-space()='Administrative charge completed successfully']")
    WebElement cahrgeableSuccessWindow;
    @FindBy(xpath="//span[contains(text(),' Authenticate')]")
    WebElement authenticatebtn;
    @FindBy(xpath="//span[contains(text(),'Date of birth MM/DD')]")
    WebElement dateOfBirth;
    @FindAll({@FindBy(xpath ="//a[@title='Start NAC flow']"),@FindBy(xpath = "//span[contains(text(),'activation')]")})
    WebElement nacActivate;

    public CP_HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToLandingPage() {
        getDriver().get(TestDataHandler.landingPageData.getCarePortalLandingPage());
        getReusableActions().isElementVisible(phoneNumberInput, 20);

    }
    public void activateNac(){
        getReusableActions().isElementVisible(nacActivate, 20);
        reporterSnapshot(nacActivate,"New activation","","COMMON");
        nacActivate.click();
    }
    public void waitForCareHomePageLoad(){
        getReusableActions().isElementVisible(phoneNumberInput, 20);
    }


    public void searchCTN(String phoneNumber) {
        phoneNumberInput.click();
        phoneNumberInput.sendKeys(phoneNumber);
        scrollToMiddleOfElement(searchButton);
        searchButton.click();
        authenticatebtn.click();
        getReusableActions().staticWait(4000);
        getReusableActions().isElementVisible(dateOfBirthInput, 20);
        dateOfBirthInput.sendKeys("01/01");
        getReusableActions().clickWhenVisible(submitButton,10);
    }

    public void customerSearch(String phoneNumber) {
        getReusableActions().staticWait(1000);
        //getReusableActions().javascriptScrollByVisibleElement(phoneNumberInput);
        scrollToMiddleOfElement(phoneNumberInput);
        phoneNumberInput.click();
        phoneNumberInput.sendKeys(phoneNumber);
        //reporter.reportLogWithScreenshot("Customer Search using Phone Number");
        reporterSnapshot(phoneNumberInput, phoneNumber, "", "NULL");
        getReusableActions().staticWait(1000);
        //scrollToMiddleOfElement(searchButton);
        getReusableActions().javascriptScrollByVisibleElement(searchButton);
        getReusableActions().clickWhenReady(searchButton, 10);
        getReusableActions().staticWait(1000);
        List<WebElement> customerTable = getDriver().findElements(By.xpath("//div[1]/table"));
        for (int i = 0; i < customerTable.size(); i++) {
            if (customerTable.get(i).isDisplayed()) {
                getReusableActions().staticWait(1000);
                if (getReusableActions().isElementVisible(checkButton)) {
                    reporterSnapshot(checkButton, "CHECK BUTTON", "", "DISPLAY");
                    break;
                }
                //reporter.reportLogWithScreenshot("SEARCH ERROR MESSAGE");
            }
        }
    }

    public void customerSearchCare(String phoneNumber) {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(phoneNumberInput);
        phoneNumberInput.click();
        phoneNumberInput.sendKeys(phoneNumber);
        //reporter.reportLogWithScreenshot("Customer Search using Phone Number");
        reporterSnapshot(phoneNumberInput, phoneNumber, "", "NULL");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(searchButtonCare);
        getReusableActions().clickWhenReady(searchButtonCare, 10);
        getReusableActions().staticWait(2000);
        List<WebElement> customerTable = getDriver().findElements(By.xpath("//div[1]/table"));
        for (int i = 0; i < customerTable.size(); i++) {
            if (customerTable.get(i).isDisplayed()) {
                getReusableActions().staticWait(1000);
                if (getReusableActions().isElementVisible(checkButton)) {
                    reporterSnapshot(checkButton, "CHECK BUTTON", "", "DISPLAY");
                    break;
                }
                //reporter.reportLogWithScreenshot("SEARCH ERROR MESSAGE");
            }
        }
    }

    public void customerSearchPortIn(String phoneNumber) {
        getReusableActions().javascriptScrollToMiddleOfPage();
        phoneNumberInput.click();
        phoneNumberInput.sendKeys(phoneNumber);
        //reporter.reportLogWithScreenshot("Customer Search using Phone Number");
        getReusableActions().clickWhenReady(portInCheckbox);
        //reporter.softAssert((searchButton.isEnabled()), "Search Button is Enabled before clicking", "Search Button is Disabled before clicking");
        reporterSnapshot(searchButton, "search", "", "enable");
        getReusableActions().javascriptScrollByVisibleElement(searchButton);
        getReusableActions().clickWhenReady(searchButton, 10);
    }

    public void customerSearchPortInCare(String phoneNumber) {
        getReusableActions().javascriptScrollToMiddleOfPage();
        phoneNumberInput.click();
        phoneNumberInput.sendKeys(phoneNumber);
        //reporter.reportLogWithScreenshot("Customer Search using Phone Number");
        getReusableActions().clickWhenReady(portInCheckbox);
        //reporter.softAssert((searchButton.isEnabled()), "Search Button is Enabled before clicking", "Search Button is Disabled before clicking");
        reporterSnapshot(searchButtonCare, "search", "", "enable");
        getReusableActions().javascriptScrollByVisibleElement(searchButtonCare);
        getReusableActions().clickWhenReady(searchButtonCare, 10);
    }

    public void customerSearchWithInvalidPortInNumber(String phoneNumber) {
        scrollToMiddleOfElement(phoneNumberInput);
        phoneNumberInput.click();
        phoneNumberInput.sendKeys(phoneNumber);
        reporterSnapshot(invalidDetailsErrorMessage, "10-digits", "", "common");
        //reporter.softAssert(invalidDetailsErrorMessage.getText().equals("Please enter a 10-digit chatr number"), "Valid error message", "Invalid error message");
        //getReusableActions().clickWhenReady(portInCheckbox);
        //reporter.softAssert(!(searchButton.isEnabled()), "Search Button is Disabled", "Search Button is Enabled");
        //reporterSnapshot(searchButton,"search","","ENABLENOT");
    }

    public void customerSearchWithPhoneNumberNotPresentInEnv(String phoneNumber) {
        //getReusableActions().javascriptScrollToMiddleOfPage();
        scrollToMiddleOfElement(phoneNumberInput);
        phoneNumberInput.click();
        phoneNumberInput.sendKeys(phoneNumber);
        reporterSnapshot(phoneNumberInput, phoneNumber, "", "DISPLAY");
        //getReusableActions().javascriptScrollByVisibleElement(searchButton);
        scrollToMiddleOfElement(searchButton);
        reporterSnapshot(searchButton, "Search Button" , "", "DISPLAY");
        getReusableActions().clickWhenReady(searchButton, 10);
        getReusableActions().isElementVisible(customerTable, 10);
        getReusableActions().isElementVisible(noResultsFoundMessage);
        getReusableActions().javascriptScrollByVisibleElement(searchButton);
        reporterSnapshot(noResultsFoundMessage, "No results found", "", "GEN");
        // reporter.softAssert(noResultsFoundMessage.getText().equals("No results found"), "Valid Message", "Invalid Message");
    }

    public void validatePostalCode(String postalCode) {
        getReusableActions().javascriptScrollByVisibleElement(customerTable);
        String maskedText = "*** " + postalCode.substring(3);
        reporterSnapshot(pinCodeElement, maskedText, "", "GEN");
        //reporter.softAssert(pinCodeElement.getText().equals(maskedText), "Pin Code is Masked", "Pin Code is Unmasked");
    }

    public void validatePagination() {
        getReusableActions().javascriptScrollByVisibleElement(paginationDropdown);
        getReusableActions().clickWhenReady(paginationDropdown);
        //reporter.reportLogWithScreenshot("Pagination Validated");
        getReusableActions().clickWhenReady(paginationDropdown);
    }

    public void clickOnCheck() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(searchButton);
        getReusableActions().clickWhenReady(checkButton, 10);
        getReusableActions().staticWait(3000);
        //getReusableActions().isElementVisible(dateOfBirthInput, 20);
    }

    public void validatePostalCodePortIn() {
        String postalCode = pinCodeElement.getText();
        //reporter.softAssert(postalCode.substring(0, 3).equals("***"), "first 3 digits of postal code are masked", "the postal code is not masked");
        reporterSnapshot(pinCodeElement, postalCode.substring(0, 3), "***", "compare");
    }


    public void validateEmailPortIn() {
        //String email = emailElement.getText();
        //reporter.softAssert(email.matches("([^/*][^/*])([/*]+)([/@])([^/*]+)"), "first 2 digits of the email are not masked", "the email is not masked");
        reporterSnapshot(emailElement, "Email", "([^/*][^/*])([/*]+)([/@])([^/*]+)", "MATCHES");
    }

    public void validateCustomerSearchFieldsStatus() {
        scrollToMiddleOfElement(postalCodeInput1);
        getReusableActions().staticWait(1000);
        boolean firstName = firstNameInput.isEnabled();
        boolean lastName = lastNameInput.isEnabled();
        boolean postalCode = postalCodeInput1.isEnabled();

        if (firstName == false && lastName == false && postalCode == false) {
            reporterSnapshot(postalCodeInput1, "First name, Last Name and Postal Code ", "", "ENABLENOT");
            //reporter.softAssert(postalCodeInput1.getText(),"First name, Last Name and Postal Code","validate Customer SearchFieldsStatus NOT ENABLE ","validate Customer SearchFieldsStatus  ENABLE");
            getReusableActions().staticWait(4000);
        } else if (firstName && lastName && postalCode) {
            //reporter.softAssert(postalCodeInput1.getText(),"First name, Last Name and Postal Code","validate Customer SearchFieldsStatus  ENABLE ","validate Customer SearchFieldsStatus  Not ENABLE");
            getReusableActions().staticWait(4000);
            reporterSnapshot(postalCodeInput1, "First name, Last Name and Postal Code ", "", "ENABLE");
        } else {
            //reporter.softAssert(postalCodeInput1.getText(),"First name, Last Name and Postal Code","validate Customer SearchFieldsStatus ENABLE ","validate Customer SearchFieldsStatus  Not ENABLE");
            getReusableActions().staticWait(4000);
            reporterSnapshot(postalCodeInput1, "Any One First name, Last Name and Postal Code", "", "ENABLE");
        }
    }

    public void refreshPage() {
        getReusableActions().staticWait(7000);
        getDriver().navigate().refresh();
        getReusableActions().staticWait(7000);
    }

    public void validatePhoneNumberEmpty() {
        //String phoneNumber = phoneNumberInput.getText();
        //reporter.softAssert(phoneNumber.isEmpty(), "PHONE NUMBER IS EMPTY", "PHONE NUMBER IS NOT EMPTY");
        reporterSnapshot(phoneNumberInput, "phone Number", "", "Empty");
    }


    public void populateCustomerDetails(String dateOfBirth, String postalCode, String email, String
            anniversaryDate, String creditCard) {
        getReusableActions().staticWait(2000);
        if (dateOfBirth.isEmpty()) {
            System.out.println("DOB is empty");
        } else {
            getReusableActions().staticWait(2000);
            dateOfBirthInput.click();
            dateOfBirthInput.sendKeys(dateOfBirth.substring(0, 5));
            dateOfBirthInput.sendKeys(Keys.TAB);
        }
        if (postalCode.isEmpty()) {
            System.out.println("postal code is empty");
        } else {
            postalCodeInput2.click();
            postalCodeInput2.sendKeys(postalCode);
            postalCodeInput2.sendKeys(Keys.TAB);
        }
        if (email.isEmpty()) {
            System.out.println("email is empty");
        } else {
            emailInput2.click();
            emailInput2.sendKeys(email);
            emailInput2.sendKeys(Keys.TAB);
        }
        if (anniversaryDate.isEmpty()) {
            System.out.println("Anniversary Date is empty");
        } else {
            anniversaryDayInput.click();
            anniversaryDayInput.sendKeys(anniversaryDate);
            anniversaryDayInput.sendKeys(Keys.TAB);
        }
            if(creditCardInput.isEnabled()) {
                if (creditCard.isEmpty()) {
                    System.out.println("Credit Card is empty");
                } else {
                    getReusableActions().scrollToElement(creditCardInput);
                    creditCardInput.click();
                    creditCardInput.sendKeys(creditCard.substring(12, 16));
                    creditCardInput.sendKeys(Keys.TAB);
                    creditCardInput.sendKeys(Keys.TAB);
                }
                creditCardInput.sendKeys(Keys.TAB);
            }
        getReusableActions().staticWait(2000);
            pageZoomin(dateOfBirthInput,60,creditCardInput,"Verification field","NULL");
    }

    public void clickOnResetModal() {
        getReusableActions().javascriptScrollByVisibleElement(resetButton);
        getReusableActions().clickWhenReady(resetButton);
        reporterSnapshot(resetButton, "RESET", "", "NULL");
    }

    public void clickOnResetAuthModal() {

        getReusableActions().javascriptScrollToMiddleOfPage();
        getReusableActions().staticWait(2000);
        reset.click();
        //reporter.reportLogWithScreenshot("Reset button is clicked");
    }

    public void clickOnConfirm() {
        getReusableActions().staticWait(2000);
        confirmButton.click();
        getReusableActions().staticWait(5000);
    }

    public void confirmButtonIsEnabled() {
        getReusableActions().staticWait(2000);
        //getReusableActions().javascriptScrollByVisibleElement(searchButton);
        scrollToMiddleOfElement(searchButton);
        //searchButton.isEnabled();
        //reporter.reportLogWithScreenshot("Confirm button is enabled");
        reporterSnapshot(searchButton, "search button", "", "ENABLE");
    }

    public void clickOnReset() {
        reset.click();
    }

    public void validateSearchFieldsEmpty() {
        String dobField = dateOfBirthInput.getText();
        String postalCodeField = postalCodeInput1.getText();
        String emailField = emailInput1.getText();
        String anniversaryField = anniversaryDayInput.getText();
        String creditCardField = creditCardInput.getText();
        if (dobField.isEmpty() && postalCodeField.isEmpty() && emailField.isEmpty() && anniversaryField.isEmpty() && creditCardField.isEmpty()) {
            getReusableActions().staticWait(2000);
            getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
            getReusableActions().staticWait(2000);
            reporter.reportLogWithScreenshot("VALID FIELD - ALL FIELDS  DISPLAYED AS EMPTY");
        } else {
            getReusableActions().staticWait(2000);
            getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
            getReusableActions().staticWait(2000);
            reporter.reportLogWithScreenshot("INVALID FIELD - ALL FIELDS  NOT DISPLAYED AS EMPTY ");
        }
    }

    public void validateErrorMessageForInvalidCustomerSearch() {
        getReusableActions().javascriptScrollByVisibleElement(searchButton);
        getReusableActions().isElementVisible(searchErrorMessage);
        reporterSnapshot(searchErrorMessage, "find a customer with the information provided", "", "common");
    }

    public void validateErrorMessagesForInvalidCustomerDetails(String dateOfBirth, String postalCode, String
            email, String anniversaryDate, String creditCardLast4Digits) {
        dateOfBirthInput.sendKeys(dateOfBirth);
        postalCodeInput2.click();
        postalCodeInput2.sendKeys(Keys.HOME);
        postalCodeInput2.sendKeys(postalCode);
        emailInput2.click();
        emailInput2.sendKeys(email);
        anniversaryDayInput.click();
        anniversaryDayInput.sendKeys(Keys.HOME);
        anniversaryDayInput.sendKeys(anniversaryDate);
        getReusableActions().javascriptScrollByVisibleElement(creditCardInput);
        creditCardInput.click();
        creditCardInput.sendKeys(Keys.HOME);
        creditCardInput.sendKeys(creditCardLast4Digits);
        getReusableActions().javascriptScrollByVisibleElement(dateOfBirthErrorMessage);
        reporterSnapshot(dateOfBirthErrorMessage, "Date of birth format is incorrect", "", "common");
        // reporter.softAssert(dateOfBirthErrorMessage.getText().equals("Date of birth format is incorrect"), "Valid Error Message", "Invalid Error Message");
        reporterSnapshot(postalCodeErrorMessage, "Postal code format is incorrect", "", "common");
        // reporter.softAssert(postalCodeErrorMessage.getText().equals("Postal code format is incorrect"), "Valid Error Message", "Invalid Error Message");
        getReusableActions().javascriptScrollByVisibleElement(anniversaryDayErrorMessage);
        reporterSnapshot(emailErrorMessage, "Email format is incorrect", "", "common");
        //reporter.softAssert(emailErrorMessage.getText().equals("Email format is incorrect"), "Valid Error Message", "Invalid Error Message");
        reporterSnapshot(anniversaryDayErrorMessage, "Anniversary date format is incorrect", "", "common");
        //reporter.softAssert(anniversaryDayErrorMessage.getText().equals("Anniversary date format is incorrect"), "Valid Error Message", "Invalid Error Message");
        //reporter.softAssert(creditCardErrorMessage.getText().equals("Please provide 4 last digits of CC"),"Valid Error Message","Invalid Error Message");
        reporterSnapshot(creditCardErrorMessage, "last 4 digits", "", "common");
    }

    public void validateSubmitButton() {
        getReusableActions().staticWait(2000);
        reporterSnapshot(windowSubmitButton, "SUBMIT", "", "ENABLE");
        // reporter.softAssert(windowSubmitButton.isEnabled(), "submit button is enabled", "submit button is not enabled");

    }

    public void validateErrorMessageForValidAndInValidCustomerDetails() {
        getReusableActions().staticWait(5000);
        getReusableActions().isElementVisible(invalidDetailsErrorMessage);
        reporterSnapshot(invalidDetailsErrorMessage, "One or more", "", "common");
        //reporter.softAssert(!(confirmButton.isEnabled()), "Confirm Button is Disabled", "Confirm Button is Enabled");
    }

    public void confirmButtonIsDisabled(String option) {
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(confirmButton);
        if (option.equalsIgnoreCase("Enabled"))
            reporterSnapshot(confirmButton, "SUBMIT", "", "Enable");
        else
            reporterSnapshot(confirmButton, "SUBMIT", "", "NOTENABLE");
    }

    public void notValidValueErrorMessage() {
        String errorText = invalidDetailsErrorMessage.getText();
        if (errorText.equals("One or more values are not valid.")) {
            //reporter.reportLogWithScreenshot("input values are not valid");
        }
    }

    public void validateSearchInformation() {
        String errorText = moreSearchInfoMessage.getText();
        reporterSnapshot(moreSearchInfoMessage, "Make sure you enter enough details to complete", "", "Common");
    }

    public void validateCustomerAuthenticateWindow(String firstName, String lastName) {
        String message = "Authenticate Customer: " + firstName + " " + lastName;
        System.out.println("======== message == >" + message);
        reporterSnapshot(customerName, message.toUpperCase(), "", "common");
        //reporter.softAssert(customerName.getText().equals(message), "Valid Customer Name", "Invalid Customer Name");
        reporterSnapshot(answeringCriteriaMessage, "Answer at least 1", "", "common");
        //reporter.softAssert(answeringCriteriaMessage.getText().equals("Please authenticate at least 1of top questions below"), "Valid criteria message", "Invalid criteria message");
    }


    public void clickNacFlowButton() {
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(nacFlowLink, 10);
        getReusableActions().isElementVisible(nacFlowButton, 10);
        getReusableActions().clickWhenReady(nacFlowButton, 10);
        getReusableActions().isElementVisible(noDealerCodeButton, 10);
        //reporter.softAssert(noDealerCodeButton.isDisplayed(), "Dealer code screen display", "Dealer code screen display");
        reporterSnapshot(noDealerCodeButton, "No Dealer", "", "display");
        noDealerCodeButton.click();
/*      dealerCodeInput.click();
        dealerCodeInput.sendKeys("QC7BL");
        getReusableActions().staticWait(7000);
        proceedCodeButton.click();
        proceedCodeButton.click();*/

        getReusableActions().staticWait(5000);
    }

    public void validateSignOut() {
        getReusableActions().clickWhenReady(signOutButton);
        getReusableActions().isElementVisible(logoutMessage, 10);
        /*reporter.softAssert(logoutHeader.getText().equals("Logged Out") && logoutMessage.getText().equals("To start a new session, launch the portal from Champ")
                , "Agent SignOut successful", "Agent SignOut Unsuccessful");*/
        reporterSnapshot(logoutHeader, "Logged Out", "", "Gen");
        reporterSnapshot(logoutMessage, "To start a new session, launch the portal from Champ", "", "Gen");
    }

    public void validateCloseIconEnabled() {
        //closeIcon.isEnabled();
        reporterSnapshot(closeIcon, "CLose", "", "ENABLE");
    }

    public void validateWarningMessage() {
        reporterSnapshot(warningMessage, "Authentication warning Message", "", "DISPLAY");
        //warningMessage.isDisplayed();
    }

    public void validateTheBlockLinkOnSearchPage() {
        getReusableActions().isElementVisible(nacFlowLink);
        reporterSnapshot(nacFlowLink, "nacFlow Link", "", "DISPLAY");
        //getReusableActions().isElementVisible(simBuyFlowLink);
        //reporterSnapshot(simBuyFlowLink,"simBuyFlow Link","","DISPLAY");
        getReusableActions().isElementVisible(anonymousTopUpLink);
        reporterSnapshot(anonymousTopUpLink, "Guest TopUp Link", "", "DISPLAY");
    }

    public void validateCustomerTable() {
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(customerTable);
        getReusableActions().staticWait(1000);
        reporterSnapshot(customerTable, "customer Table", "", "DISPLAY");
        //getReusableActions().isElementVisible(customerTable, 10);
    }

    public void populateCustomerDetails(String firstName, String lastName, String email, String postalCode) {
        if (firstName.isEmpty()) {
            System.out.println("firstName is empty");
        } else {
            firstNameInput.sendKeys(firstName);
        }
        if (lastName.isEmpty()) {
            System.out.println(" lastName  is empty");
        } else {
            lastNameInput.click();
            lastNameInput.sendKeys(lastName);
        }
        if (postalCode.isEmpty()) {
            System.out.println(" postalCode is empty");
        } else {
            postalCodeInput1.click();
            postalCodeInput1.sendKeys(postalCode);
        }
        reporterSnapshot(firstNameInput,"Field Input","","NULL");
    }

    public void notValidValueErrorMessageInWindow() {
        getReusableActions().javascriptScrollByVisibleElement(invalidDetailsErrorMessage);
        getReusableActions().staticWait(2000);
        //String errorText = invalidDetailsErrorMessage.getText();
        reporterSnapshot(invalidDetailsErrorMessage, "One or more of the answers", "", "common");
        // reporter.softAssert(errorText.equals("One or more values are not valid."), invalidDetailsErrorMessage.getText(), "Invalid Message");
    }

    public void validationForCustomerResultNotFound() {
        getReusableActions().javascriptScrollByVisibleElement(noResultsFoundMessage);
        getReusableActions().staticWait(2000);
        reporterSnapshot(noResultsFoundMessage, "No results found", "", "GEN");
        //reporter.softAssert(noResultsFoundMessage.getText().equals("No results found"), "Valid Message", "Invalid Message");
    }

    public void clickOnSearchButton() {
        getReusableActions().javascriptScrollByVisibleElement(searchButton);
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScriptClick(searchButton);
        //searchButton.click();
        getReusableActions().staticWait(3000);
    }

    public void clickNacFlowButtonWithDealerCode(String dealerCode) {
        getReusableActions().clickWhenReady(nacFlowLink, 10);
        getReusableActions().isElementVisible(nacFlowButton, 10);
        getReusableActions().clickWhenReady(nacFlowButton, 10);
        dealerCodeInput.click();
        dealerCodeInput.sendKeys(dealerCode);
        getReusableActions().isElementVisible(dealerCodeMessage);
        proceedCodeButton.click();
    }

    public void clickOnClickHere() {
        getReusableActions().staticWait(2000);
        reporterSnapshot(clickHereButton, "Authentication Window", "", "NULL");
        clickHereButton.click();
        getReusableActions().staticWait(3000);
        //reporter.reportLogWithScreenshot("Dashboard populated");
    }

    public void populateCustomerSearchDetails(String firstName, String lastName, String email, String postalCode) {
        if (firstName.isEmpty()) {
            System.out.println("firstName is empty");
        } else {
            scrollToMiddleOfElement(firstNameInput);
            getReusableActions().staticWait(1000);
            firstNameInput.click();
            firstNameInput.sendKeys(firstName);
           // reporterSnapshot(firstNameInput, firstName, "", "NULL");
        }
        if (lastName.isEmpty()) {
            System.out.println("lastName is empty");
        } else {
            scrollToMiddleOfElement(lastNameInput);
            getReusableActions().staticWait(1000);
            lastNameInput.click();
            lastNameInput.sendKeys(lastName);
            reporterSnapshot(lastNameInput, firstName+ "   "+lastName, "", "NULL");
        }
        if (email.isEmpty()) {
            System.out.println("email is empty");
        } else {
            emailInput1.click();
            emailInput1.sendKeys(email);
            reporterSnapshot(emailInput1, email, "", "NULL");
        }
        if (postalCode.isEmpty()) {
            System.out.println("postalCode is empty");
        } else {
            getReusableActions().javascriptScrollToMiddleOfPage();
            postalCodeInput1.click();
            postalCodeInput1.sendKeys(postalCode);
            reporterSnapshot(postalCodeInput1, postalCode, "", "NULL");
        }
    }

    public void validateErrorMessageForInvalidWildCardCustomer() {
        getReusableActions().javascriptScrollByVisibleElement(searchButton);
        getReusableActions().isElementVisible(warningMessageWildCard);
        reporterSnapshot(warningMessageWildCard, "enough detail", "", "common");
    }

    public void validateCustomerSearchRecords() {
        //getReusableActions().javascriptScrollByVisibleElement(searchButtonCare);
        //getReusableActions().clickWhenReady(searchButtonCare, 10);
        getReusableActions().staticWait(3000);
        getReusableActions().isElementVisible(customerTable, 10);
        //getReusableActions().javascriptScrollByVisibleElement(customerTable);
        getReusableActions().staticWait(3000);
        reporterSnapshot(customerTable, "CUSTOMER", "", "display");
    }

    public void validateErrorMessagesForWrongDOBFormat(String dateOfBirth) {
        dateOfBirthInput.click();
        dateOfBirthInput.sendKeys(dateOfBirth);
        dateOfBirthInput.sendKeys(Keys.TAB);
        getReusableActions().javascriptScrollByVisibleElement(dateOfBirthErrorMessage);
        reporterSnapshot(dateOfBirthErrorMessage, "birth format is incorrect", "", "common");
    }

    public void validateEmailCustomerSearch() {
        getReusableActions().javascriptScrollByVisibleElement(emailElement);
        getReusableActions().staticWait(2000);
        String email = emailElement.getText();
        //reporter.softAssert(email.matches("([^/*][^/*])([/*]+)([/@])([^/*]+)"), "first 2 digits of the email are not masked", "the email is not masked");
        reporterSnapshot(emailElement, "Email First 2 Digit", "([^/*][^/*])([/*]+)([/@])([^/*]+)", "MATCHES");
    }

    public void validatePort_In_only_One_record() {
        String count = "";
        if (noOfRows.size() == 1) {
            count = "one record";
        } else count = "more records";
        reporterSnapshot(null, count, "one record", "compare");
    }

    public void validatePort_In_TelephoneNoChangeCurrentProvince() {
        getReusableActions().javascriptScrollByVisibleElement(TelephoneNumberChangeBtn);
        getReusableActions().staticWait(2000);
        TelephoneNumberChangeBtn.click();
        getReusableActions().staticWait(2000);
        int setSize = getDriver().getWindowHandles().size();
        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(setSize - 1));
        getReusableActions().staticWait(3000);
        avlblTelephoneno1.click();
        getReusableActions().executeJavaScriptClick(windowSubmitButton);
        //getReusableActions().clickWhenReady(windowSubmitButton, 10);
        getReusableActions().waitForElementVisibility(TelephoneChangeYesBtn, 20);
        reporterSnapshot(TelephoneChangeYesBtn, "Telephone Change Yes", "", "DISPLAY");
        // reporter.softAssert(TelephoneChangeYesBtn.isDisplayed(), "Confirmation page is displayed", "Confirmation page is not displayed");
        //getReusableActions().clickWhenReady(TelephoneChangeYesBtn, 10);
        getReusableActions().staticWait(4000);
        getReusableActions().executeJavaScriptClick(TelephoneChangeYesBtn);
    }

    public void validateAuthenticatedWindowModelStatus() {
        getReusableActions().javascriptScrollByVisibleElement(dateOfBirthInput);
        reporterSnapshot(dateOfBirthInput, "date Of Birth", "", "enable");
        getReusableActions().javascriptScrollByVisibleElement(postalCodeInput2);
        reporterSnapshot(postalCodeInput2, "postal Code", "", "enable");
        getReusableActions().javascriptScrollByVisibleElement(emailInput2);
        reporterSnapshot(emailInput2, "email", "", "enable");
        getReusableActions().javascriptScrollByVisibleElement(anniversaryDayInput);
        reporterSnapshot(anniversaryDayInput, "anniversary Day", "", "enable");
        getReusableActions().javascriptScrollByVisibleElement(creditCardInput);
        reporterSnapshot(creditCardInput, "credit Card", "", "ENABLE");
    }

    public void validateNoValidPhoneNumber(String phoneNumber) {
        getReusableActions().javascriptScrollByVisibleElement(searchButton);
        getReusableActions().clickWhenReady(searchButton, 10);
        //reporterSnapshot(moreSearchInfoMessage,"Please enter more customer search information","","GEN");
        getReusableActions().javascriptScrollByVisibleElement(phoneNumberInput);
        phoneNumberInput.click();
        phoneNumberInput.sendKeys("123456");
        getReusableActions().staticWait(2000);
        reporterSnapshot(invalidDetailsErrorMessage, "10-digits", "", "common");
    }

    public void validateCustomerPhoneNumberField() {
        getReusableActions().javascriptScrollByVisibleElement(phoneNumberInput);
        getReusableActions().staticWait(2000);
        if (phoneNumberInput.isEnabled()) {
            reporterSnapshot(phoneNumberInput, "PHONE NUMBER", "", "ENABLE");
        } else {
            //reporter.softAssert(!phoneNumberInput.isEnabled(),"phone number field disable","phone number field not disable");
            reporterSnapshot(phoneNumberInput, "PHONE NUMBER", "", "ENABLENOT");
        }
    }

    public void validateManagePinLinkUnAvailable() {
        getReusableActions().javascriptScrollToMiddleOfPage();
        String expectedValue = "Manage PIN";
        String expected ="";
        if (managePIN.size() == 0){
            expected="PASS";
        }else{
            expected="FAIL";
        }
        reporter.softAssert("PASS", expected,"VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY");
    }

    public void validateReasonForAutopayFailed() {
        getReusableActions().javascriptScrollByVisibleElement(paymentFailedMessage);
        //reporterSnapshot(autoPayBlock, "AUTO-PAY", "", "GEN");
        reporterSnapshot(autoPayBlock, "AUTO-PAY", "", "COMMON");
        //reporter.softAssert(autoPayBlock.isDisplayed(),autoPayBlock.getText()+" is display","autoPay block is not display");
        //reporterSnapshot(paymentFailedMessage, "Your payment failed. Contact your card provider for further details.", "", "GEN");
        //reporterSnapshot(paymentFailedMessage, "change your autopay status because you have an order in progress", "", "COMMON");
        reporter.softAssert(paymentFailedMessage.getText().equals("Your payment failed. Contact your card provider for further details."),paymentFailedMessage.getText(),"payment failed message not display");
    }
    public void clickCustomerSearch() {
        //reporter.reportLogWithScreenshot("Customer Search using Phone Number");
        getReusableActions().javascriptScrollByVisibleElement(searchButton);
        getReusableActions().clickWhenReady(searchButton, 10);
        getReusableActions().isElementVisible(customerTable, 10);
    }

    public void clickBackCustomerSearch() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollToTopOfPage();
        getReusableActions().isElementVisible(backToScreen, 10);
        getReusableActions().clickWhenReady(backToScreen, 10);
    }

    public void validateCareCustomerPage() {
        getReusableActions().staticWait(5000);
        String actualValueTemp = getDriver().getCurrentUrl();
        String expectedValue = "https://auto-cpp.chatrwireless.com/care/";  //"https://chatr-qa-auto2.qa01.eks.rogers.com/care/";
        reporter.softAssert(actualValueTemp.contains(expectedValue), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"");
    }

    public void validateVoucherFormatError() {
        getReusableActions().staticWait(3000);
        //getReusableActions().javascriptScrollByVisibleElement(voucherFormatError);
        scrollToMiddleOfElement(voucherFormatError);
        //reporter.softAssert(voucherFormatError.getText().equals("The format of the Serial number is invalid. Please enter again"),"Voucher entered invalid format","Voucher entered valid format");
        reporterSnapshot(voucherFormatError, "serial number exactly", "", "common");
    }

    public void clickOnClickHereRetail(String postalCode) {
        getReusableActions().isElementVisible(postalCodeInput2, 10);
        postalCodeInput2.click();
        postalCodeInput2.sendKeys(postalCode);
        emailInput2.click();
        reporterSnapshot(postalCodeInput2, postalCode, "", "Null");
        confirmButton.click();
    }

    public void clickOnTopUpCardLink() {
        getReusableActions().staticWait(3000);
        //getReusableActions().javascriptScrollByVisibleElement(topUpCardLink);
        scrollToMiddleOfElement(topUpCardLink);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(topUpCardLink.isDisplayed(),"topUp link display","topUp link not display");
        reporterSnapshot(topUpCardLink, "topUp Card Link", "", "display");
        topUpCardLink.click();
    }

    public void validateErrorMessageForTopUpSerialNumber() {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(topUpSerialNumberError);
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollToTopOfPage();
        //reporter.softAssert(topUpSerialNumberError.getText().equals("Please check the Top-up card serial number. This has already been entered on this page"),topUpSerialNumberError.getText(),"top up error message not display");
        reporterSnapshot(topUpSerialNumberError, "already been entered", "", "common");
    }

    public void validateVoucherErrorForInvalidNumber() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(invalidVoucherError);
        //System.out.println(invalidVoucherError.getText());
        //reporter.softAssert(invalidVoucherError.getText().equals("This top-up card is not recognized. Try another one Try again"),invalidVoucherError.getText(),"invalid voucher message");
        reporterSnapshot(invalidVoucherError, "This top-up card is not recognized. Try another one Try again", "", "common");
    }

    public void validate_TNC_Success_page() {
        getReusableActions().staticWait(3000);
        reporterSnapshot(TNCSuccessHeader, "TNC Success Header", "", "DISPLAY");
        //reporter.softAssert(TNCSuccessHeader.isDisplayed(), "TNC Success page displayed", "TNC Success page not displayed");
    }

    public void validatePort_In_TelephoneNoChangeDifferentProvinceError() {
        getReusableActions().javascriptScrollByVisibleElement(TelephoneNumberChangeBtn);
        getReusableActions().staticWait(2000);
        TelephoneNumberChangeBtn.click();
        getReusableActions().staticWait(2000);
        int setSize = getDriver().getWindowHandles().size();
        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(setSize - 1));
        getReusableActions().staticWait(3000);
        avlblTelephoneno1.click();
        getReusableActions().executeJavaScriptClick(TNCChngLocationBtn);
//        getReusableActions().clickWhenReady(TNCChngLocationBtn, 10);
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScriptClick(TNCSelectProvince);
        // Select the province
        getReusableActions().staticWait(1000);
        getReusableActions().executeJavaScriptClick(getDriver().findElement(By.xpath("//label[contains(text(),'Alberta ')]")));
//        getReusableActions().clickWhenReady(TNCSelectProvince, 20);
        getReusableActions().staticWait(2000);
//        getReusableActions().clickWhenReady(TNCSelectcityDD, 20);
//        getReusableActions().selectWhenReady(TNCSelectcityDD, 1, 20);
        getReusableActions().isElementVisible(cityDropdown, 10);
//        getReusableActions().executeJavaScriptClick(cityDropdown);
        getReusableActions().staticWait(1000);
        getReusableActions().clickWhenReady(cityDropdown);
        getReusableActions().selectWhenReadyByVisibleText(cityDropdown,"Calgary" );
//        getReusableActions().clickWhenReady(TNCContinuebtn, 10);
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScriptClick(TNCContinuebtn);
        getReusableActions().staticWait(4000);
        //String errortext = "The current subscription province differs from the new telephone number province. Taxes will be calculated based on the telephone number province.";
        getReusableActions().javascriptScrollByVisibleElement(TNCDiffProvinceError);
        //reporter.reportLogWithScreenshot("Error position");
        reporterSnapshot(TNCDiffProvinceError, "The new telephone number province", "", "COMMON");
        //reporter.softAssert(TNCDiffProvinceError.getText(), errortext, "Warning message validated successfully", "Warning message validation failed");
    }

    public void clickOnAdjustmentLink() {
        getReusableActions().isElementVisible(adjustmentLink);
        getReusableActions().clickWhenReady(adjustmentLink, 10);
    }

    public void validateAdjustmentWindowModel(String balanceCodeOption, String amount) {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(adjustmentModel);
        reporterSnapshot(currentBalance, "current Balance", "", "DISPLAY");
        // reporter.softAssert(currentBalance.isDisplayed(), "current balance display", "current balance not display");
        getReusableActions().staticWait(2000);
        balanceCode.sendKeys(Keys.DOWN);
        balanceCode.sendKeys(Keys.ENTER);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(balanceCode.getAttribute("value").equals(balanceCodeOption), "option is selected", "option not selected");
        reporterSnapshot(balanceCode, "balance Code", "", "NUll");
        //reporter.softAssert(!adjustmentAmountField.isDisplayed(), "adjustmentAmount field is disable ", "adjustmentAmount field enabled");
        //reporterSnapshot(adjustmentAmountField,"adjustment Amount","","display");
        debitOption.click();
        adjustmentAmountField.click();
        adjustmentAmountField.sendKeys(amount);
        getReusableActions().staticWait(9000);
        getReusableActions().javascriptScrollByVisibleElement(errorMessage);
        getReusableActions().staticWait(1000);
        reporterSnapshot(errorMessage, "deduct from balance", "", "common");
        //reporter.softAssert(errorMessage.getText().equals("Debit amount is greater than current balance"), errorMessage.getText(), "error message not display");
        reporterSnapshot(windowCancelButton, "Cancel Button", "", "ENABLE");
        //reporter.softAssert(windowCancelButton.isEnabled(), "cancel Button is enable", "cancel button is disable");
    }

    public void clickOnChargeableTransactionLink() {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(chargeableTransactionLink);
        chargeableTransactionLink.click();
    }

    public void validateChargeableTransactionWindowModel(String codeOption, String chargeOption) {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(chargeableTransactionModel);
        getReusableActions().isElementVisible(codeOptions);
        //getReusableActions().clickWhenReady(codeOptions);
        getReusableActions().executeJavaScriptClick(codeOptions);
        getReusableActions().selectWhenReady(codeOptions, codeOption);
        getReusableActions().executeJavaScriptClick(codeOptions);
       // getReusableActions().clickWhenReady(codeOptions);
        reporterSnapshot(codeOptions, codeOption, "", "DROPDOWN");
        // reporter.softAssert(codeOptions.getAttribute("value").equals(codeOption), "code option is selected", "code option is not selected");
        getReusableActions().javascriptScrollByVisibleElement(chargeOptions);
        getReusableActions().staticWait(1000);
        getReusableActions().isElementVisible(chargeOptions);
        //getReusableActions().clickWhenReady(chargeOptions);
        getReusableActions().executeJavaScriptClick(chargeOptions);
        getReusableActions().selectWhenReady(chargeOptions, chargeOption);
       // getReusableActions().executeJavaScriptClick(codeOptions);
        //getReusableActions().clickWhenReady(chargeOptions);
        reporterSnapshot(chargeOptions, chargeOption, "", "DROPDOWN1");
        //reporter.softAssert(chargeOptions.getAttribute("value").equals(chargeOption), "charge option is selected", "charge option is not selected");
        //reporterSnapshot(exceptionOptions,"exception Options","","VALUE1");
        //reporter.softAssert(exceptionOptions.isEnabled(), "exception option is enabled", "exception option is not enabled");
    }

    public void validateExceptionOptions(String exceptionOption) {
        getReusableActions().javascriptScrollByVisibleElement(exceptionOptions);
        //reporterSnapshot(exceptionOptions,"exception Options","","VALUE");
        //reporter.softAssert(exceptionOptions.isEnabled(), "exception option is enabled", "exception option is not enabled");
        //exceptionOptions.click();
        getReusableActions().executeJavaScriptClick(exceptionOptions);
        getReusableActions().staticWait(2000);
        exceptionOptions.sendKeys(Keys.DOWN);
        exceptionOptions.sendKeys(Keys.DOWN);
        exceptionOptions.sendKeys(Keys.ENTER);
        //getReusableActions().isElementVisible(exceptionOptions, 10);
        //getReusableActions().clickWhenReady(exceptionOptions, 20);
        //reporter.reportLogWithScreenshot("options is populated");
        //getReusableActions().selectWhenReady(exceptionOptions, exceptionOption);
        //getReusableActions().clickWhenReady(exceptionOptions);
        reporterSnapshot(exceptionOptions, exceptionOption, "", "DROPDOWN");
        // reporter.softAssert(exceptionOptions.getAttribute("value").equals(exceptionOption), "exception option is selected", "exception option is not selected");
    }

    public void validateAlertPopUpForChargeableTransaction() {
        //getReusableActions().javascriptScrollByVisibleElement(topUpLink);
        getReusableActions().staticWait(3000);
//        //topUpLink.click();
//        getDriver().navigate().refresh();
//        //reporter.reportLogWithScreenshot("screenshot");
//        getReusableActions().staticWait(5000);
//        getDriver().switchTo().alert().dismiss();
        getReusableActions().isElementVisible(chargeableTransactionModel);
        reporterSnapshot(chargeableTransactionModel, "Chargeabli Tansaction Module", "", "DISPLAY");
        //reporter.reportLogWithScreenshot("chargeable window visible");
    }

    public void clickVoucherValidation() {
        getReusableActions().staticWait(2000);
        //getReusableActions().javascriptScrollByVisibleElement(voucherValidation);
        getReusableActions().isElementVisible(voucherValidation, 10);
        reporterSnapshot(voucherValidation, "Voucher Link ", "", "NULL");
        getReusableActions().staticWait(1000);
        getReusableActions().clickWhenReady(voucherValidation, 10);
    }

    public void validateVoucherError() {
        getReusableActions().staticWait(2000);
        int cnt = getDriver().findElements(By.xpath("//input[contains(@type,'tel')]")).size();
        String locator = "(//input[contains(@type,'tel')])[%s]";
        locator = String.format(locator,cnt);
        System.out.println("locator - "+ cnt + locator);
        scrollToMiddleOfElement(getDriver().findElement(By.xpath(locator)));
        //getReusableActions().javascriptScrollByVisibleElement(voucherError);
        getReusableActions().staticWait(4000);
        //reporter.softAssert(voucherError.getText().equals("The format of the Serial number is invalid. Please enter again"),"Invalid voucher error validated successfully","Invalid voucher error validation failed");
        reporterSnapshot(topUpSerialNumberError, "already been used", "", "common");
    }

    public void validateValidVoucherAdded() {
        getReusableActions().javascriptScrollByVisibleElement(voucherInput);
        getReusableActions().staticWait(2000);
        reporterSnapshot(voucherAdded, "Success", "", "display");
        //reporter.softAssert(voucherAdded.getText().equals("The format of the Serial number is invalid. Please enter again"),"Invalid voucher error validated successfully","Invalid voucher error validation failed");
    }

    public void clickOnNacFlowOnRetail() {
        getReusableActions().staticWait(2000);
        //reporter.softAssert(getReusableActions().isElementVisible(nacFlowLink),"element is visible","element is not visible");
        reporterSnapshot(nacFlowLink, "nacFlow Link", "", "visible");
        nacFlowLink.click();
        getReusableActions().staticWait(3000);
    }

    public void validateCarePageAppears() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(dealerCodeInput);
        reporterSnapshot(dealerCodeInput, "Care Authorize Page", "", "DISPLAY");
    }

    public void clickOnEditAccountInfo() {
        getReusableActions().staticWait(5000);
        //getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().javascriptScrollByVisibleElement(editAccountInfo);
        getReusableActions().clickWhenReady(editAccountInfo, 5);
        getReusableActions().staticWait(2000);
    }

    public void validatePINChangeOption() {
        getReusableActions().javascriptScrollToTopOfPage();
        getReusableActions().staticWait(2000);
        getReporter().softAssert(PINChangeOption.size() == 0, "VALID FIELD - \"" + "PIN CHANGE" + "\" ARE NOT DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"" + "PIN CHANGE" + "\" ARE DISPLAYED SUCCESSFULLY");
    }

    public void validateEmailChangeOption() {
        //getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(emailField_accountInfo);
        getReusableActions().staticWait(2000);
        emailField_accountInfo.click();
        //getReporter().softAssert(emailField_accountInfo.getAttribute("class").contains("disabled"),"Email Address field is disabled","Email Address field is not disabled");
        reporterSnapshot(emailField_accountInfo, "disabled", "Email Field", "Class");
    }

    public void clickNacFlowButton_Retail() {
        getReusableActions().clickWhenReady(nacFlowLink, 10);
        //    getReusableActions().isElementVisible(nacFlowButton, 10);
//        getReusableActions().clickWhenReady(nacFlowButton, 10);
//        getReusableActions().isElementVisible(noDealerCodeButton, 10);
//        reporter.softAssert(noDealerCodeButton.isDisplayed(), "Dealer code screen display", "Dealer code screen display");
//        noDealerCodeButton.click();
    }

    public void clickOnCareTopUp() {
        getReusableActions().javascriptScrollByVisibleElement(careTopUp);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(topUpCardLink.isDisplayed(),"topUp link display","topUp link not display");
        reporterSnapshot(careTopUp, "care Top Up", "", "display");
        careTopUp.click();
    }

    public void clickOnClickHere_retail(String dateOfBirth, String postalCode, String email, String
            anniversaryDate, String creditCard) {
        getReusableActions().staticWait(2000);
        if (clickHereButton_retail.size() > 0) {
            getReusableActions().javascriptScrollToBottomOfPage();
            clickHereButton_retail.get(0).click();
            getReusableActions().staticWait(2000);
            //reporter.reportLogWithScreenshot("Dashboard populated");
        } else {
            populateCustomerDetails(dateOfBirth, postalCode, email, anniversaryDate, creditCard);
            getReusableActions().staticWait(4000);
            clickOnSubmit();
            getReusableActions().staticWait(3000);
        }
    }


    public void clickOnAddTopUpCardLink() {
        getReusableActions().staticWait(4000);
        scrollToMiddleOfElement(addOneMoreCardLink);
        //reporter.softAssert(topUpCardLink.isDisplayed(),"topUp link display","topUp link not display");
        reporterSnapshot(addOneMoreCardLink, "topUp Card Link", "", "display");
        addOneMoreCardLink.click();
        getReusableActions().staticWait(5000);
    }

    public void validateTryAgainVoucherError() {
        getReusableActions().javascriptScrollByVisibleElement(tryAgainvoucherError);
        getReusableActions().staticWait(2000);
/*        tryAgainBtn.click();
        getReusableActions().staticWait(4000);*/
        //reporter.softAssert(voucherError.getText().equals("The format of the Serial number is invalid. Please enter again"),"Invalid voucher error validated successfully","Invalid voucher error validation failed");
        reporterSnapshot(tryAgainvoucherError, "try entering", "", "common");
    }

    public void clickOnStoreLocator() {
        getReusableActions().javascriptScrollByVisibleElement(storeLocatorLink);
        getReusableActions().clickWhenReady(storeLocatorLink, 10);
        reporterSnapshot(storeLocatorLink, "StoreLocatorIcon", "", "DISPLAY");
        getReusableActions().staticWait(6000);

    }

    public void clickOnUseMyLocation() {
        getReusableActions().javascriptScrollByVisibleElement(useMyLocation);
        getReusableActions().clickWhenReady(useMyLocation, 10);
        getReusableActions().staticWait(3000);
        reporterSnapshot(useMyLocation, useMyLocation.getText(), useMyLocation.getText(), "ENABLE");
        //getDriver().switchTo().alert().accept();
        getReusableActions().staticWait(3000);
    }

    public void validateCurrentLocationOnMap() {
        getReusableActions().javascriptScrollToMiddleOfPage();
        getReusableActions().javascriptScrollByVisibleElement(currentLocationTag);
        reporterSnapshot(currentLocationTag, currentLocationTag.getText(), currentLocationTag.getText(), "ENABLE");
    }

    public void validateExclusiveOffer() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(exclusiveTargetedOffer);
        getReusableActions().staticWait(500);
        reporterSnapshot(exclusiveTargetedOffer, "Exclusive Offer Banner", "", "DISPLAY");
    }

    public void validateChargeableTransactionLink() {
        getReusableActions().isElementVisible(chargeableTransactionLink);
        scrollToMiddleOfElement(chargeableTransactionLink);
        getReusableActions().staticWait(500);
        reporterSnapshot(chargeableTransactionLink, "CHARGEABLE TRANSACTION LINK", "", "DISPLAY");
    }

    public void validateCCAndVoucherIsDisplay(String option) {
        getReusableActions().staticWait(3000);
        if (showTopUpOptions.size() > 0) {
            showTopUpOptions.get(0).click();
        }
        int ccCount = creditCardRadioList.size();
        int paymentCount = paymentRadioList.size();
        int addCardCount = addNewCCList.size();
        System.out.println("paymentCount-" + paymentCount);
        String expectedValue = "CreditCard, Voucher, add a Card option";
        //getReusableActions().javascriptScrollToMiddleOfPage();
        if (option.toUpperCase().contains("AGENT")) {
            //getReusableActions().javascriptScrollByVisibleElement(paymentRadioList.get(0));
            creditCardRadioList.get(0).click();
            scrollToMiddleOfElement(creditCardRadioList.get(0));
            getReusableActions().staticWait(4000);
            getReusableActions().executeJavaScript("document.body.style.zoom='70%'");
            getReusableActions().staticWait(4000);
            addCardCount = addNewCCList.size();
            reporter.softAssert(paymentCount >= 1 && ccCount >= 1, "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY", "INVALID : FIELD - ALL / ANY ONE OF \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY");
        } else {
            getReusableActions().staticWait(4000);
            getReusableActions().executeJavaScript("document.body.style.zoom='80%'");
            getReusableActions().staticWait(4000);
            scrollToMiddleOfElement(paymentRadioList.get(0));
            getReusableActions().staticWait(2000);
            //getReusableActions().javascriptScrollByVisibleElement(paymentRadioList.get(0));
            reporter.softAssert(paymentCount >= 1 && ccCount == 0, "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY", "INVALID : FIELD - ALL / ANY ONE OF \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY");
        }
    }

    public void validateCCAndVoucherIsDisplayNAC(String option) {
        getReusableActions().staticWait(3000);
        int ccCount = creditCardRadioList.size();
        int paymentCount = paymentRadioList.size();
        int addCardCount = addNewCCList.size();
        String expectedValue = "CreditCard, Voucher";
        //getReusableActions().javascriptScrollByVisibleElement(paymentRadioList.get(0));
        scrollToMiddleOfElement(paymentRadioList.get(0));
        getReusableActions().staticWait(2000);
        if (option.toUpperCase().contains("AGENT"))
            reporter.softAssert(paymentCount >= 1 && ccCount >= 1, "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY", "INVALID : FIELD - ALL / ANY ONE OF \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY");
        else
            reporter.softAssert(paymentCount >= 1 && ccCount == 0, "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY", "INVALID : FIELD - ALL / ANY ONE OF \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY");
    }

    public boolean validateDashboardMessageObject() {
        boolean flag;
        getReusableActions().staticWait(4000);
        if (showDashBoardErrorMsg.size() > 0) {
            flag = true;
        } else {
            flag = false;
        }

        return flag;
    }

    public void clickOnBackToDashboard() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(backToDashBoardButton);
        backToDashBoardButton.click();
        getReusableActions().staticWait(3000);
    }

    public void validateDashboardMessage() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(showDashBoardErrorMsgElement);
        reporterSnapshot(showDashBoardErrorMsgElement, "UNSUCCESSFUL ATTEMPTS", "", "Common");
    }

    public void validateDashboardEnableLink() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(backToDashBoardEnableLink);
        reporterSnapshot(backToDashBoardEnableLink, "Enable Top-Up Card", "", "Display");
    }

    public void clickOnClickHere_care(String dateOfBirth, String postalCode, String email, String
            anniversaryDate, String creditCard) {

        if (clickHereButton_care.size() > 0) {
            getReusableActions().javascriptScrollToBottomOfPage();
            clickHereButton_care.get(0).click();
            getReusableActions().staticWait(2000);
            //reporter.reportLogWithScreenshot("Dashboard populated");
        } else {
            populateCustomerDetails(dateOfBirth, postalCode, email, anniversaryDate, creditCard);
            clickOnSubmit();
        }
    }

    public void clickOnSubmit() {
        getReusableActions().staticWait(3000);
        //submitButton.click();
        getReusableActions().executeJavaScriptClick(submitButton);
        getReusableActions().staticWait(6000);
    }

    public void clickOnClickHere_Care(String dateOfBirth, String postalCode, String email, String
            anniversaryDate, String creditCard) {
        getReusableActions().staticWait(2000);
        if (clickHereButton_retail.size() > 0) {
            getReusableActions().javascriptScrollToBottomOfPage();
            clickHereButton_retail.get(0).click();
            getReusableActions().staticWait(2000);
            //reporter.reportLogWithScreenshot("Dashboard populated");
        } else {
            populateCustomerDetails(dateOfBirth, postalCode, email, anniversaryDate, creditCard);
            clickOnSubmit();
        }
    }

    public void validateVoucherAlreadyUsedError() {
       /* getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollByVisibleElement(voucherAlreadyUsedError.get(0));
        getReusableActions().staticWait(2000);*/
        getReusableActions().staticWait(2000);
        int cnt = getDriver().findElements(By.xpath("//input[contains(@type,'tel')]")).size();
        String locator = "(//input[contains(@type,'tel')])[%s]";
        locator = String.format(locator,cnt);
        System.out.println("locator - "+ cnt + locator);
        scrollToMiddleOfElement(getDriver().findElement(By.xpath(locator)));
        reporterSnapshot(voucherAlreadyUsedError.get(0), "already been used", "", "common");
    }

    public void skipAuthenticationNotPresent() {
        reporterSnapshot(null, "Skip", String.valueOf(
                clickHereButton_retail == null ? 0 : clickHereButton_retail.size()), "hidden");
    }

    public void clickUnrecognizedVoucherValidation() {
        getReusableActions().javascriptScrollByVisibleElement(unrecognisedVoucherError);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(voucherError.getText().equals("The format of the Serial number is invalid. Please enter again"),"Invalid voucher error validated successfully","Invalid voucher error validation failed");
        reporterSnapshot(unrecognisedVoucherError, "PIN exactly", "", "common");
    }

    public void validateHideNACandGuestTopupHidden() {
        getReusableActions().staticWait(2000);
        reporterSnapshot(null, "NAC Link", String.valueOf(
                nacFlowLinkList == null ? 0 : nacFlowLinkList.size()), "HIDDEN");
        reporterSnapshot(null, "Guest Top UP", String.valueOf(
                anonymousTopUpLinkList == null ? 0 : anonymousTopUpLinkList.size()), "HIDDEN");

    }

    public void validateQuickLinksHiddenRetailDashboard() {
        getReusableActions().javascriptScrollToMiddleOfPage();
        reporterSnapshot(null, "Chargeable Link", String.valueOf(
                chargeableTransactionLinkList == null ? 0 : chargeableTransactionLinkList.size()), "HIDDEN");
        reporterSnapshot(null, "Adjustment Link", String.valueOf(
                adjustmentLinkList == null ? 0 : adjustmentLinkList.size()), "HIDDEN");
        reporterSnapshot(null, "Telephone number Change Link", String.valueOf(
                telephoneNumberChangeLinkList == null ? 0 : telephoneNumberChangeLinkList.size()), "HIDDEN");
        reporterSnapshot(null, "Voucher Link", String.valueOf(
                voucherList == null ? 0 : voucherList.size()), "HIDDEN");
        reporterSnapshot(null, "Port In Link", String.valueOf(
                portInList == null ? 0 : portInList.size()), "HIDDEN");
        reporterSnapshot(null, "Port Out Link", String.valueOf(
                portOutList == null ? 0 : portOutList.size()), "HIDDEN");
    }

    public void saveNewPersonalAdressInformation(String fName, String lName, String dob, String postal) {
        getReusableActions().staticWait(2000);
        getReusableActions().scrollToElement(address1);
        reporterSnapshot(firstNameInput, "Before Add New Info", "", "NULL");
        firstNameInput.clear();
        firstNameInput.sendKeys(fName);
        getReusableActions().staticWait(1000);
        lastNameInput.clear();
        lastNameInput.sendKeys(lName);
        getReusableActions().staticWait(1000);
        dateOfBirthInput.sendKeys(dob);
        getReusableActions().staticWait(1000);
        reporterSnapshot(firstNameInput, "After Add New Info", "", "NULL");
        getReusableActions().scrollToElement(saveBtn);
        reporterSnapshot(firstNameInput, "Before Add New Address", "", "NULL");
//        address1.sendKeys();
        getReusableActions().staticWait(1000);
        postalCodeInput1.sendKeys(postal);
        getReusableActions().staticWait(1000);
        reporterSnapshot(firstNameInput, "After Add New Address", "", "NULL");
        saveBtn.click();
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(postalCodeElement);
        getReusableActions().staticWait(1000);
        reporterSnapshot(postalCodeElement, "Postal Code", "", "DISPLAY");
        reporterSnapshot(postalCodeElement, "Date Of Birth", "", "DISPLAY");
    }

    public void validateDateFieldAuthendicatedWindow() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(dateOfBirthInput);
        getReusableActions().staticWait(1000);
        reporterSnapshot(dateOfBirthInput, "Date Of Birth", "", "NULL");
    }

    public void validateCustomerTableDataCount(int expPage, int expDataCount) {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(searchButton);
        getReusableActions().staticWait(2000);
        reporterSnapshot(searchButton, "Result", "", "NULL");
        //getReusableActions().javascriptScrollByVisibleElement(pageBtnList.get(0));
        scrollToMiddleOfElement(pageBtnList.get(0));
        int dataCount = 0;
        int pageCount = pageBtnList.size() - 4;
        if (pageCount <= expPage) {
            for (int i = 2; i < pageBtnList.size() - 2; i++) {
                pageBtnList.get(i).click();
                dataCount = dataCount + customerDataList.size();
                scrollToMiddleOfElement(pageBtnList.get(i));
                reporterSnapshot(pageBtnList.get(i), "Page No" + pageBtnList.get(i).getText(), "", "display");
                getReusableActions().staticWait(2000);
            }
            reporter.softAssert(dataCount <= expDataCount, "VALID FIELD - \"" + expDataCount + "\" EXPECTED VALUE LESS THAN OR EQUAL TO ACTUAL VALUE \"" + dataCount + "\"", "INVALID : FIELD - \"" + expDataCount + "\" EXPECTED VALUE EXCEED ACTUAL VALUE \"" + dataCount + "\"");
        }
        reporter.softAssert(pageCount <= expPage, "VALID FIELD - \"" + expPage + "\" EXPECTED VALUE LESS THAN OR EQUAL TO ACTUAL VALUE \"" + pageCount + "\"", "INVALID : FIELD - \"" + expPage + "\" EXPECTED VALUE EXCEED ACTUAL VALUE \"" + pageCount + "\"");
    }

    public void validateLogoutWhenMultipleCtnPassing() throws AWTException {
        /*for (int i = 0; i <= 9; i++){
            String phoneNumber = getUnusedNAC("");
        }*/
        Robot robot = new Robot();
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);
        }
        getReusableActions().javascriptScrollByVisibleElement(phoneNumberInput);
        String[] ctnStore = {"4168431431","4168175083","4168175075","4168175077","4162780265","4164170218","4162190010","4162190075","4162190078","6043604192 "};
        Boolean actualValueBoolan;
    for (int i = 0; i <9; i++) {
            resetButton.click();
            getReusableActions().staticWait(2000);
            phoneNumberInput.click();
            phoneNumberInput.sendKeys(ctnStore[i]);
            actualValueBoolan = phoneNumberInput.isDisplayed();
            reporterSnapshot(phoneNumberInput, ctnStore[i], "", "NULL");
            getReusableActions().staticWait(1000);
            searchButton.click();
        }
        reporterSnapshot(logoutText, "logged out", "", "COMMON");
    }

    public void validateRetailUserUnableToUpdateEmail() {
        getReusableActions().staticWait(2000);
        getReusableActions().scrollToElement(address1);
        getReusableActions().staticWait(1000);
        reporterSnapshot(emailInput1, "Email", "", "ENABLENOT");
    }

    public void clickOnEnableLink() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(backToDashBoardEnableLink);
        backToDashBoardEnableLink.click();
        getReusableActions().staticWait(3000);
        backToDashBoardEnableBtn.click();
        getReusableActions().staticWait(3000);
    }
    public String customerSearchfromExcel(String status) {
        String phoneNumber = getUnusedNAC(status);
        System.out.println("phoneNumber" + phoneNumber);
        getReusableActions().staticWait(1000);
        //getReusableActions().javascriptScrollByVisibleElement(phoneNumberInput);
       // scrollToMiddleOfElement(phoneNumberInput);
        phoneNumberInput.click();
        phoneNumberInput.sendKeys(phoneNumber);
        //reporter.reportLogWithScreenshot("Customer Search using Phone Number");
        reporterSnapshot(phoneNumberInput, phoneNumber, "", "NULL");
        //reporter.softAssert(phoneNumber,phoneNumber,"Phone Number","Not Phone Nubmber");
        //getReusableActions().javascriptScrollByVisibleElement(searchButton);
        scrollToMiddleOfElement(searchButton);
        getReusableActions().clickWhenReady(searchButton, 10);
        reporterSnapshot(searchButton, "SEARCH BUTTON", "", "DISPLAY");
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(checkButton);
        List<WebElement> customerTable = getDriver().findElements(By.xpath("//div[1]/table"));
        for (int i = 0; i < customerTable.size(); i++){
            if (customerTable.get(i).isDisplayed()) {
                getReusableActions().staticWait(1000);
                if (getReusableActions().isElementVisible(checkButton)) {
                    reporterSnapshot(checkButton, "CHECK BUTTON", "", "DISPLAY");
                    setUsedNACStatus1(phoneNumber, status);
                    break;
                }
            }
        }
        phoneNumber = phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6, 10);
        return phoneNumber;
    }

    public void validateChargeableTransactionLinkHidden() {
        getReusableActions().staticWait(4000);
        reporterSnapshot(null, "chargeableTransactionHidden", String.valueOf(
                chargeableTransaction == null ? 0 : chargeableTransaction.size()), "HIDDEN");
    }

    public void validatePromotionDetails() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(promotionTitle);
        reporterSnapshot(promotionTitle, "Promotions", "", "common");
        reporter.softAssert(getReusableActions().isElementVisible(promotionTitle), "Promotion details present", "Promotion Details is not present");
    }
    public void clickOnPortOutButton() {
        getReusableActions().staticWait(3000);
        reporterSnapshot(portOutLink, "Port-out request", "", "GEN");
        portOutLink.click();
        reporterSnapshot(portOutPopUp, "Port Out window", "", "DISPLAY");
    }
    public void validateAlertPopUpWarning() {
        getReusableActions().staticWait(3000);
        getDriver().switchTo().alert().equals(true);
        reporter.reportLogWithScreenshot("warning");
    }
    public void clickTelephoneNumberChageButton(){
        getReusableActions().staticWait(3000);
        //getReusableActions().javascriptScrollByVisibleElement(TelephoneNumberChangeBtn);
        scrollToMiddleOfElement(TelephoneNumberChangeBtn);
        getReusableActions().staticWait(500);
        reporterSnapshot(TelephoneNumberChangeBtn,"Telephone Number Change Buttonn","","DISPLAY");
        //TelephoneNumberChangeBtn.click();
        getReusableActions().executeJavaScriptClick(TelephoneNumberChangeBtn);
    }
    public void validateTelephoneNumberChageCancel(){
        getReusableActions().staticWait(2000);
        getReusableActions().switchToNewWindow();
        //WebElement numberSelect = getDriver().findElement(By.xpath("(//input[@type='radio'])["+number+"]"));
        reporterSnapshot(TelephoneNoBtn,"Telephone Number","","DISPLAY");
        //TelephoneNoBtn.click();
        getReusableActions().executeJavaScriptClick(TelephoneNoBtn);
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScriptClick(submitBtn);
        //submitBtn.click();
        reporterSnapshot(cofirmationBtn,"Confirmation","","DISPLAY");
        getReusableActions().executeJavaScriptClick(TelephoneChangeNoBtn);
        //TelephoneChangeNoBtn.click();
        getReusableActions().staticWait(2000);
        reporterSnapshot(TelephoneNoBtn,"Telephone Number","","DISPLAY");
    }
    public void validateTelephoneNumberChageSuccess() {
        getReusableActions().staticWait(2000);
        getReusableActions().switchToNewWindow();
        scrollToMiddleOfElement(TelephoneNoBtn);
        getReusableActions().staticWait(500);
        getReusableActions().executeJavaScriptClick(TelephoneNoBtn);
        getReusableActions().staticWait(2500);
        reporterSnapshot(TelephoneNoBtn,"Telephone Number","","DISPLAY");
        getReusableActions().executeJavaScriptClick(submitBtn);
        getReusableActions().staticWait(3000);
        getReusableActions().waitForElementVisibility(TelephoneChangeYesBtn, 20);
        reporterSnapshot(TelephoneChangeYesBtn, "CONFEIRMATION Window", "", "DISPLAY");
        getReusableActions().executeJavaScriptClick(TelephoneChangeYesBtn);
        getReusableActions().staticWait(4000);
        scrollToMiddleOfElement(TNCSuccessHeader);
        getReusableActions().staticWait(500);
        reporterSnapshot(TNCSuccessHeader, "TNC Success Header", "", "DISPLAY");
    }

    public void validateSessionTimeout() {
        getReusableActions().waitForElementVisibility(sessionExpired, 900);
        reporterSnapshot(sessionExpired, "Session expired", "", "GEN");
        reporterSnapshot(toBeginNewSession, "To begin a new session, access the portal through", "", "COMMON");
    }

    public void validatePort_In_Multiple_record() {
        getReusableActions().staticWait(3000);
        String count = "";
        if (noOfRows.size() > 1) {
            count = "more records";
        } else count = "one record";
        reporterSnapshot(null, count, "more records", "compare");
        //reporter.softAssert(count, "more records", "VALID FIELD - \"" + count.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY","INVALID : FIELD - \"" + count.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY");
    }
    public void validatePort_New_Session_Open_In_Same_Page() {
        getReusableActions().staticWait(6000);
        getReusableActions().executeJavaScript("document.body.style.zoom='50%'");
        getReusableActions().staticWait(4000);
        reporterSnapshot(phoneNumberInput, "PHONE NUMBER INPUT PAGE 1", "", "NULL");
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(4000);
        getReusableActions().waitForPageLoad();
        getReusableActions().switchToMainWindow();
        getReusableActions().staticWait(2000);
        envButton.click();
        getReusableActions().switchToNewWindow();
        getReusableActions().staticWait(6000);
        getReusableActions().executeJavaScript("document.body.style.zoom='50%'");
        getReusableActions().staticWait(4000);
        reporterSnapshot(phoneNumberInput, "PHONE NUMBER INPUT PAGE2", "", "NULL");
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(4000);
        getReusableActions().waitForPageLoad();
    }
    public void clickandvalidateSubmitButton() {
        getReusableActions().staticWait(2000);
        reporterSnapshot(windowSubmitButton, "SUBMIT", "", "ENABLE");
        windowSubmitButton.click();
        getReusableActions().staticWait(2000);
        reporterSnapshot(cahrgeableContinueWindow, "Continue with this administrative charge", "", "common");
        continueButton.click();
        getReusableActions().staticWait(3000);
        reporterSnapshot(cahrgeableSuccessWindow, "Administrative charge completed successfully", "", "common");
    }
    public void customerSearchCare1(String phoneNumber) {
        getReusableActions().staticWait(3000);
       scrollToMiddleOfElement(phoneNumberInput);
        /*phoneNumberInput.click();
        phoneNumberInput.sendKeys(phoneNumber);*/
        reporterSnapshot(phoneNumberInput, "CTN FIELD", "", "EMPTY");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(searchButtonCare);
        getReusableActions().clickWhenReady(searchButtonCare, 10);
        getReusableActions().staticWait(2000);
        List<WebElement> customerTable = getDriver().findElements(By.xpath("//div[1]/table"));
        for (int i = 0; i < customerTable.size(); i++) {
            if (customerTable.get(i).isDisplayed()) {
                getReusableActions().staticWait(1000);
                if (getReusableActions().isElementVisible(checkButton)) {
                    reporterSnapshot(checkButton, "CHECK BUTTON", "", "DISPLAY");
                    break;
                }
                //reporter.reportLogWithScreenshot("SEARCH ERROR MESSAGE");
            }
        }
    }

}


