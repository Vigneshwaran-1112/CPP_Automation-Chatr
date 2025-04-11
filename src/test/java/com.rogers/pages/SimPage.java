package com.rogers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;
import java.util.List;

public class SimPage extends BasePage {


    @FindBy(xpath = "//a[contains(@title,'Order a SIM card')]")
    WebElement OrderSimLink;
    @FindBy(xpath = "//form/ds-form-field/div/div[1]/input")
    WebElement simSerialNumberInput;
    @FindBy(xpath = "//span[contains(text(),'Available for')]")  //div/ds-success/span
    WebElement validSimMessage;
    @FindBy(xpath = "//*[@id='ds-radio-input-id-2-label']")//*[@id='ds-radio-input-id-2']
    WebElement phoneNumbersList;
    @FindBy(xpath = "//*[text()='Transfer existing phone number']")
    WebElement keepExistingNumber;
    @FindBy(xpath = "//select[@formcontrolname='oldReseller']")
    WebElement dropdown;
    @FindBy(xpath = "//*[@id=\"ds-form-input-id-17\"]")
    WebElement dropdownCare;
    @FindBy(xpath = "(//span[contains(text(),'Yes')])[1]")
    WebElement dslProviderYes;
    @FindBy(xpath = "(//span[contains(text(),'No')])[1]")
    WebElement dslProviderNo;
    @FindBy(xpath = "//ds-form-group[1]/fieldset/ds-radio-group/div/ds-selection[1]")
    WebElement personalRadioButton;
    @FindBy(xpath = "//ds-form-group[1]/fieldset/ds-radio-group/div/ds-selection[2]")
    WebElement businessRadioButton;
    @FindBy(xpath = "//*[@formcontrolname='phoneNumber']")
    WebElement phoneNumber;
    @FindBy(xpath = "//*[@formcontrolname='esnImeiMeid']")
    WebElement phoneSerialNumber;
    @FindBy(xpath = "//*[@formcontrolname='accountNumber']")
    WebElement accountNumber;
    @FindBy(xpath = "//*[@formcontrolname='accountPin']")
    WebElement accountPin;
    @FindBy(xpath = "//*[@id='ds-form-input-id-12']")
    WebElement businessName;
    @FindBy(xpath = "//ds-form-group[1]/fieldset/div/ds-form-field/div/div[1]")
    WebElement businessNameDisplayed;
    @FindBy(xpath = "(//ds-checkbox/label/div[1])[1]")
    WebElement checkboxDsl;
    @FindBy(xpath = "//p[contains(text(),'authorize')]")
    WebElement checkBoxAuthorise;
    @FindBy(xpath = "//p[contains(text(),'I confirm')]") //ds-checkbox[1]/label/div[1]"
    WebElement checkBoxConfirm;
    @FindBy(xpath = "//div/ds-checkbox[1]/label/div[1]")
    WebElement checkBoxConfirmLandLine;
    @FindBy(xpath = "//ds-checkbox[3]/label/div[1]")
    WebElement checkBoxSms;
    @FindBy(xpath = "//span[contains(text(),'Please check the checkbox in order to proceed')]")
    WebElement errorMessage;
    @FindBy(xpath = "//*[@formcontrolname='firstName']")
    WebElement firstNameInput;
    @FindBy(xpath = "//*[@formcontrolname='lastName']")
    WebElement lastNameInput;
    @FindBy(xpath = "//*[@formcontrolname='email']")
    WebElement emailInput;
    @FindBy(xpath = "//*[@formcontrolname='dateOfBirth']")
    WebElement dateOfBirthInput;
    @FindBy(xpath = "//*[@formcontrolname='altPhoneNumber']")
    WebElement altPhoneNumberInput;
    @FindBy(xpath = "(//*[@formcontrolname='altPhoneNumber'])[2]")
    WebElement altPhoneNumberInput1;
    @FindBy(xpath = "//app-address-autocomplete//input")
    WebElement addressInput;
    @FindBy(xpath = "//ul[@role='listbox']/li")
    WebElement autoCompleteAddress;
    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    WebElement continueButton;//app-port-in-page/div/div/div/button
    @FindBy(css = "button.-secondary")
    WebElement backButton;
    @FindBy(xpath = "//input[@formcontrolname='postalCode']")
    WebElement postalCode;
    @FindBy(xpath = "//select[@formcontrolname='oldReseller']")
    WebElement oldServiceProviderDDL;
    @FindBy(xpath = "//option[@value='BroadConnect']")
    WebElement optionBroadConnect;
    @FindBy(xpath = "//option[@value='Cable Cable']")
    WebElement optionCableCable;
    @FindBy(xpath = "//option[@value='Compton Communications']")
    WebElement optionComptionComm;
    @FindBy(xpath = "//option[@value='Comwave']")
    WebElement optionComwave;
    @FindBy(xpath = "//option[@value='Execulink']")
    WebElement optionExecuLink;
    @FindBy(xpath = "//option[@value='Nor-Del Cablevision Ltd']")
    WebElement optionNorDelCable;
    @FindBy(xpath = "//option[@value='Primus']")
    WebElement optionPrimus;
    @FindBy(xpath = "//option[@value='Source Cable']")
    WebElement optionSourceCable;
    @FindBy(xpath = "//option[@value='Telehop']")
    WebElement optionTelehop;
    @FindBy(xpath = "//option[@value='Telizon']")
    WebElement optionTelizon;
    @FindBy(xpath = "//option[@value='Vonage']")
    WebElement optionVonage;
    @FindBy(xpath = "//option[@value='ACN Inc']")
    WebElement optionACNInc;
    @FindBy(xpath = "(//ds-checkbox/label/div[1])[1]")
    WebElement anyExistingServicesCheckbox;
    @FindBy(xpath = "(//ds-checkbox[1]/label/div[1])[2]")
    WebElement confirmAccountHolderCheckbox;
    @FindBy(xpath = "//ds-checkbox[2]/label/div[1]")
    WebElement authorizeChatrCheckbox;
    @FindBy(xpath = "//*[contains(text(),'Continue')]")
    WebElement continueButtonPortIn;
    @FindBy(xpath = "//div/div[2]/ds-success/span")
    WebElement portInMessage;
    @FindBy(xpath = "//p[contains(text(),'carrier:')]")
    WebElement serviceProviderMessage;
    @FindBy(xpath = "(//*[@class='ds-icon d-inline-flex cds-icon-close'])[3]")
    WebElement deleteAltNumberFromAccount;
    @FindBy(xpath = "(//*[@class='ds-icon d-inline-flex cds-icon-close'])[2]")
    WebElement deleteAltNumberFromPort;
    @FindBy(xpath = "(//span[text()='Error! This field is required.'])[1]")
    WebElement errorMessageFirstName;
    @FindBy(xpath = "(//span[text()='Error! This field is required.'])[2]")
    WebElement errorMessageLastName;
    @FindBy(xpath = "//*[@id='formfield-19-messages']/div/ds-error/span")
    WebElement errorMessageFirstNameStandaLone;
    @FindBy(xpath = "//*[@id='formfield-19-messages']/div/ds-error/span")
    WebElement errorMessageLastNameStandaLone;
    @FindBy(xpath = "(//span[contains(text(),'This field is required.')])[1]")
    WebElement errorMessageBusinessName;
    @FindBy(xpath = "(//span[contains(text(),'This field is required.')])[1]")
    WebElement errorMessageBusinessNameStandaLone;
    @FindBy(xpath = " //*[@id='ds-form-input-id-17']")
    WebElement clearCity;
    @FindBy(xpath = "//ds-radio-button[1]/label/div[1]/div")
    WebElement canadaRadioButton;
    @FindBy(xpath = "//ds-radio-button[2]/label/div[1]")
    WebElement otherRadioButton;
    @FindBy(xpath = "//*[@id='ds-form-input-id-18']")
    WebElement addressText;
    @FindBy(xpath = "//app-info-block/div/p")
    WebElement locationNotification;
    @FindBy(xpath = "//span[contains(text(),' Yes, cancel ')]")
    WebElement yesCancelOption;
    @FindBy(xpath = "//span[contains(text(),'Change location (step 1)')]")
    WebElement changeLocationStep;
    @FindBy(xpath = "//p[contains(text(),'selected region')]")
    WebElement notificationMessageCTN;
    @FindBy(xpath = "//div/form/div/div[2]/ds-form-field/div/div[3]/div/ds-error/span[1]")
    WebElement accountFieldErrorMessage;
    @FindBy(xpath = "//div/ds-error/ds-icon/span")
    WebElement accountFieldErrorMessageIcon;
    @FindBy(xpath = "//lib-landline-port-in/form/fieldset[1]/ds-error/span")
    WebElement dslYesNoErrorMessage;
    @FindBy(xpath = "//lib-landline-port-in/form/fieldset[2]/ds-error/span")
    WebElement dslCheckBoxErrorMessage;
    @FindBy(xpath = "//lib-landline-port-in/form/fieldset[1]/legend")
    WebElement dslNotification;
    @FindBy(xpath = "//div[contains(text(),'Pay once')]") //*[@id=\"ds-radio-input-id-10\"]
    WebElement payOnceRadioButton;
    @FindBy(xpath = "(//span[contains(text(),'Edit')])[1]")
    WebElement backStepQuickLink1;
    @FindBy(xpath = "//ds-radio-group/div/ds-selection[1]/label/span")
    WebElement payOnceRadioButtonClick;
    @FindBy(xpath = "//ds-radio-group/div/ds-selection[2]")
    WebElement autoPayRadioButtonClick;
    @FindBy(xpath = "//app-plan-select-step/app-plan-select/div[1]/h3")
    WebElement selectPlan;
    @FindBy(xpath = "(//span[contains(text(),'t eligible')])")
    WebElement portInError;
    @FindBy(xpath = "(//span[contains(text(),'Agree')])")
    WebElement errorCheckBoxMessage;
    @FindBy(xpath = "//span[contains(text(),'Recharge')]")
    WebElement topUp;
    @FindBy(xpath = "//span[contains(text(),'This field is required')]")
    WebElement errorMessageOneLastName;
    @FindBy(xpath = "//input[@type='tel']")
    WebElement voucherInput;
    @FindBy(xpath = "//span[contains(text(),'This top up card is not recognized. Try another one ')]")
    WebElement voucherInputMoreLength;
    @FindBy(xpath = "//span[contains(text(),'Please enter top-up PIN to continue')]")
    WebElement voucherInputLessLength;
    @FindBy(xpath = "//span[contains(text(),'Top-Up card is valid')]")
    WebElement voucherCodeValid;
    @FindBy(xpath = "//*[@formcontrolname='altPhoneNumber']")//lib-port-in/div/div[3]/div[2]/form/ds-form-field/div/div[1]")
    WebElement altPhoneNumberInputDisplayed;
    @FindBy(xpath = "//lib-port-in/div/div[3]/div[3]/div/div/div[2]/p")
    WebElement temporaryCtnAvailable;
    @FindBy(xpath = "//a[contains(@title,'Commander une carte SIM')]")
    WebElement OrderSimLinkFrench;
    @FindBy(xpath="(//*[contains(text(),'Toronto, Ontario')])[1]")
    WebElement defaultLocation;
    @FindBy(xpath = "//span[contains(text(),'PIN exactly')]")
    WebElement voucherErrorinvalid;
    @FindBy(xpath = "//span[contains(text(),'Agree')]")
    WebElement errorMessageCheckBox;
    @FindBy(xpath = "(//*[@formcontrolname='firstName'])[2]")
    WebElement firstNameInput1;
    @FindBy(xpath = "(//*[@formcontrolname='lastName'])[2]")
    WebElement lastNameInput1;
    @FindBy(xpath = "(//input[@formcontrolname='esnImeiMeid'])[1]")
    WebElement phoneSerialNumber1;
    @FindBy(xpath = "//span[contains(text(),'Proceed')]")
    WebElement proceedButton;
    @FindBy(xpath = "//span[contains(text(),'Keep')]")
    WebElement dslProviderKeep;
    @FindBy(xpath = "//span[contains(text(),'Disconnect')]")
    WebElement dslProviderDisconnect;
    @FindBy(xpath = "//ds-selection[1]/label/input")
    WebElement disconnectRadioButtonSelected;
    @FindBy(xpath = "//p[contains(text(),' Current car')]")
    WebElement currentCarrier;
    @FindBy(xpath = "(//span[contains(text(),'Yes')])[3]")
    WebElement yesPortInPopUp;
    @FindBy(xpath = "//p[contains(text(),'Port-in request succes')]")
    WebElement portInSuccessMessage;
    @FindBy(xpath = "//span[contains(text(),'Phone number must be exactly 10')]")   //ds-selection[1]/label/input
    WebElement invalidCTNError;
    @FindBy(xpath = "//span[contains(text(),'Personal')]")
    WebElement personalOption;

    @FindBy(xpath = "(//span[contains(text(),'Yes')])[2]")
    WebElement dslProviderYes1;
    @FindBy(xpath = "(//span[contains(text(),'No')])[2]")
    WebElement dslProviderNo1;
    @FindBy(xpath = "//app-port-in-page/div/div/div/button")
    WebElement continueButtonDisable;
    @FindBy(xpath = "//span[contains(text(),'Available for')]")
    List<WebElement> validSimMessageList;
    @FindBy(xpath = "//span[contains(text(),'Back To')]")
    WebElement backToCustomerSearch;
    @FindBy(xpath = "(//span[@role='img'])[4]")
    WebElement step1Active;
    @FindBy(xpath = "//span[contains(text(),'10-digits')]")
    WebElement altNumberErrorMessage;
    @FindBy(xpath = "//span[contains(text(),'one piece of information')]")
    WebElement accountDetailsError;
    @FindBy(xpath="(//div[@class='ds-radioButton__innerCircle'])[1]")
    WebElement esim;
    @FindBy(xpath="(//div[@class='ds-radioButton__innerCircle'])[2]")
    WebElement physicalsim;

    public void chooseSim(String sim){
        getReusableActions().isElementVisible(esim, 10);
        if(sim.equalsIgnoreCase("esim")){
            esim.click();
        }
        if(sim.equalsIgnoreCase("psim")) {
            physicalsim.click();
        }

    }


    public SimPage(WebDriver driver) {
        super(driver);
    }

    public void waitForSimPageLoad() {
        getReusableActions().isElementVisible(simSerialNumberInput, 20);
    }

    public void validateOrderSimLink() {
        getReusableActions().isElementVisible(OrderSimLink);
        String parentWindow = getDriver().getWindowHandle();
        getReusableActions().clickWhenReady(OrderSimLink, 10);
        getReusableActions().switchToNewWindow(parentWindow);
        //reporter.softAssert(getDriver().getCurrentUrl().contains("https://shopchatrmobile.ca/"), "Order Sim Link is working", "Order Sim Link not working");
        reporterSnapshot(OrderSimLink,"https://shopchatrmobile.ca/","","Link");
        getReusableActions().closeCurrentWindow();
        getReusableActions().switchToMainWindow(parentWindow);
        getReusableActions().staticWait(2000);
    }

    public String getPhoneNumber(int index) {
        WebElement phoneValueXpath = getDriver().findElement(By.xpath("//ds-radio-group/div/ds-selection[" + index + "]/label/input"));
        String phoneNumber = phoneValueXpath.getAttribute("value");
        return phoneNumber;
    }

    public void setSimDetails(String simSerialNumber) {
        //Set simSerialNumber
        getReusableActions().clickWhenReady(simSerialNumberInput, 10);
        //simSerialNumberInput.sendKeys(simSerialNumber.substring(8));
        simSerialNumberInput.click();
        simSerialNumberInput.sendKeys(simSerialNumber.substring(8));
        simSerialNumberInput.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        simSerialNumberInput.sendKeys(simSerialNumber);
        getReusableActions().isElementVisible(validSimMessage, 10);
        //reporter.softAssert(validSimMessage.getText().equals("Available for activation"), "Sim Number: " + simSerialNumber + " is Valid", "Sim Number is not Valid");
        reporterSnapshot(validSimMessage,"Available for activation","","Common");
        reporterSnapshot(simSerialNumberInput,"SIM NUMBER",simSerialNumber,"null");
    }

    public void selectPhoneNumber(int index) {
        getReusableActions().staticWait(5000);
        WebElement phoneXpath = getDriver().findElement(By.xpath("//ds-radio-group/div/ds-selection["+index+"]/label/input"));
        getReusableActions().isElementVisible(phoneNumbersList, 10);//ds-radio-group[1]/div[1]/ds-selection[3]/label[1]/span[1]
        getReusableActions().javascriptScrollByVisibleElement(phoneXpath);
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScriptClick(phoneXpath);
        //getReusableActions().clickWhenReady(phoneXpath, 10);
        //reporter.reportLogWithScreenshot("Phone Number is selected");
        reporterSnapshot(phoneXpath,"Phone Number","","DISPLAY");
    }

    public void setProfileDetails(String firstName, String lastName, String email, String dateOfBirth, String altPhoneNumber) {
        getReusableActions().isElementVisible(firstNameInput, 10);
        getReusableActions().javascriptScrollByVisibleElement(firstNameInput);
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        dateOfBirthInput.click();
        dateOfBirthInput.sendKeys(dateOfBirth);
        altPhoneNumberInput.click();
        altPhoneNumberInput.sendKeys(altPhoneNumber);
        //reporter.reportLogWithScreenshot("Profile details are populated");
        reporterSnapshot(firstNameInput,"Profile Details","","NULL");
    }

    public void setProfileDetailsPortIn(String firstName, String lastName, String email, String dateOfBirth, String altPhoneNumber) {
        getReusableActions().isElementVisible(firstNameInput, 10);
        getReusableActions().javascriptScrollByVisibleElement(firstNameInput);
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        dateOfBirthInput.click();
        dateOfBirthInput.sendKeys(dateOfBirth);
        altPhoneNumberInput1.click();
        altPhoneNumberInput1.sendKeys(altPhoneNumber);
        //reporter.reportLogWithScreenshot("Profile details are populated");
        reporterSnapshot(firstNameInput,"Account Details","","NULL");
    }
    public void setProfileDetailsPortIn1(String firstName, String lastName, String email, String dateOfBirth, String altPhoneNumber) {
        getReusableActions().isElementVisible(firstNameInput1, 10);
        getReusableActions().javascriptScrollByVisibleElement(firstNameInput1);
        firstNameInput1.sendKeys(firstName);
        lastNameInput1.sendKeys(lastName);
        emailInput.sendKeys(email);
        dateOfBirthInput.click();
        dateOfBirthInput.sendKeys(dateOfBirth);
        altPhoneNumberInput1.click();
        altPhoneNumberInput1.sendKeys(altPhoneNumber);
        //reporter.reportLogWithScreenshot("Profile details are populated");
        reporterSnapshot(firstNameInput1,"Account Details","","NULL");
    }

    public void setAddress(String city) {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(addressInput);
        addressInput.click();
        if (city.equals("Edmonton")){
            addressInput.sendKeys("Edmonton");
        }else{
            addressInput.sendKeys(city);
        }
        getReusableActions().isElementVisible(autoCompleteAddress, 10);
        getReusableActions().clickWhenReady(autoCompleteAddress, 20);
        //Second time Address is Populating
        getReusableActions().isElementVisible(autoCompleteAddress, 10);
        getReusableActions().clickWhenReady(autoCompleteAddress, 20);
        waitForAttributeToBeNotEmpty(postalCode, "value", 10);
        //reporter.reportLogWithScreenshot("Address is populated");
        reporterSnapshot(addressInput,"Address Details","","NULL");
    }

    public void clickOnContinue() {
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(continueButton);
        getReusableActions().staticWait(1000);
        reporterSnapshot(continueButton,"Continue Button","","Display");
        getReusableActions().clickWhenReady(continueButton, 10);

    }

    public void clickOnBack() {
        getReusableActions().clickWhenReady(backButton, 10);
    }

    public void populateExistingNumber(String ExistingPhoneNumber) {
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(keepExistingNumber);
        reporterSnapshot(keepExistingNumber,"Transfer Existing Phonenumber","","DISPLAY");
        getReusableActions().clickWhenReady(keepExistingNumber, 10);
        //getReusableActions().javascriptScrollByVisibleElement(phoneNumber);
        scrollToMiddleOfElement(phoneNumber);
        //phoneNumber.click();
        getReusableActions().executeJavaScriptClick(phoneNumber);
        phoneNumber.sendKeys(ExistingPhoneNumber);
        getReusableActions().staticWait(2000);
        //reporter.reportLogWithScreenshot("phone Number is populated");
        reporterSnapshot(phoneNumber,ExistingPhoneNumber,"","NULL");
    }

    public void verifyThreePortInFields(String serialNumber, String phoneAccountNumber, String pin) {
        //getReusableActions().javascriptScrollByVisibleElement(phoneSerialNumber);
        scrollToMiddleOfElement(accountNumber);
        getReusableActions().isElementVisible(phoneSerialNumber, 10);
        phoneSerialNumber.sendKeys(serialNumber);
        reporterSnapshot(phoneSerialNumber,"serial Number","","enable");
//        getReusableActions().isElementVisible(accountNumber, 10);
//        accountNumber.sendKeys(phoneAccountNumber);
//        reporterSnapshot(accountNumber,"account Number","","enable");
        getReusableActions().isElementVisible(accountPin, 10);
        accountPin.sendKeys(pin);
        reporterSnapshot(accountPin,"account Pin","","enable");
    }

    public void clickCheckBoxesForPortIn() {
        scrollToMiddleOfElement(checkBoxAuthorise);
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(checkBoxAuthorise, 10);
        getReusableActions().clickWhenReady(checkBoxConfirm, 10);
        getReusableActions().clickWhenReady(checkBoxSms, 10);
        reporterSnapshot(checkBoxSms,"Port-In Check Box","","NULL");
    }

    public void selectOldServiceProvider(String alternatePhoneNumber, String oldReseller) {
        getReusableActions().isElementVisible(dropdown);
        dropdown.click();
        getReusableActions().selectWhenReady(dropdown, oldReseller);
        altPhoneNumberInput.click();
        altPhoneNumberInput.sendKeys(alternatePhoneNumber);
        //reporter.reportLogWithScreenshot("altphoneNumber");
        reporterSnapshot(altPhoneNumberInput,oldReseller,"","NULL");
    }

    public void validateCheckBoxErrorMessage() {
        //getReusableActions().javascriptScrollByVisibleElement(errorMessageCheckBox);
        scrollToMiddleOfElement(checkBoxAuthorise);
        reporterSnapshot(errorMessageCheckBox,"Agree","","common");
        //getReusableActions().clickWhenReady(checkBoxAuthorise, 10);
        //getReusableActions().clickWhenReady(checkBoxConfirm, 10);
        //getReusableActions().clickWhenReady(checkBoxSms, 10);
        //reporter.softAssert(errorMessage.getText().equals("Please check the checkbox in order to proceed"), "valid error", "invalid error");
    }

    public void enterOneVerificationField(String serialNumber) {
        getReusableActions().isElementVisible(phoneSerialNumber, 10);
        phoneSerialNumber.sendKeys(serialNumber);
        reporterSnapshot(accountNumber,serialNumber,"","Empty");
        reporterSnapshot(accountPin,serialNumber,"","Empty");
        reporterSnapshot(accountNumber,"Port In Details","","Null");
    }

    public void clickOnOldReseller() {
        getReusableActions().isElementVisible(oldServiceProviderDDL, 10);
        oldServiceProviderDDL.click();
        reporter.softAssert(oldServiceProviderDDL.getAttribute("value").isEmpty(), "field is empty", "field is not empty");
    }

    public void validateOldReseller() {
        //optionBroadConnect.isDisplayed();
        optionCableCable.isDisplayed();
        optionComptionComm.isDisplayed();
        optionComwave.isDisplayed();
        optionExecuLink.isDisplayed();
        optionNorDelCable.isDisplayed();
        optionPrimus.isDisplayed();
        optionSourceCable.isDisplayed();
        optionTelehop.isDisplayed();
        optionTelizon.isDisplayed();
        optionVonage.isDisplayed();
        optionACNInc.isDisplayed();
        reporter.reportLogWithScreenshot("options in Old Reseller are being displayed");
    }

    public void setEmailDOB(String email, String dateOfBirth) {
        emailInput.sendKeys(email);
        dateOfBirthInput.click();
        dateOfBirthInput.sendKeys(dateOfBirth);
    }

    public void clickOnContinuePortIn() {
        getReusableActions().clickWhenReady(continueButtonPortIn, 10);
    }

    public void clickDSLService(String option) {
        switch (option) {
            case "Yes":
                dslProviderYes.click();
                break;
            case "No":
                getReusableActions().clickWhenReady(dslProviderNo, 10);
                break;
        }
    }

    public void clickExistingServicesCheckbox() {
        getReusableActions().clickWhenReady(anyExistingServicesCheckbox, 10);

    }

    public void setNameBillingContact(String firstName, String lastName) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
    }

    public void clickOnConfirmAccountHolderCheckbox() {
        getReusableActions().clickWhenReady(confirmAccountHolderCheckbox, 10);
    }

    public void clickOnAuthorizeChatrCheckbox() {
        getReusableActions().clickWhenReady(authorizeChatrCheckbox, 10);
    }

    public void setOldServiceProvider(String options) {
        getReusableActions().isElementVisible(oldServiceProviderDDL, 10);
        oldServiceProviderDDL.click();
        switch (options) {
            case "BroadConnect":
                optionBroadConnect.click();
                getReusableActions().staticWait(3000);
                //reporter.softAssert(optionBroadConnect.isSelected(), "option is selected", "option not selected");
                break;
            case "CableCable":
                optionCableCable.click();
                getReusableActions().staticWait(3000);
                //reporter.softAssert(optionCableCable.isSelected(), "option is selected", "option not selected");
                break;
            case "ComptionComm":
                optionComptionComm.click();
                getReusableActions().staticWait(3000);
                //reporter.softAssert(optionComptionComm.isSelected(), "option is selected", "option not selected");
                break;
            case "Comwave":
                optionComwave.click();
                getReusableActions().staticWait(3000);
                //reporter.softAssert(optionComwave.isSelected(), "option is selected", "option not selected");
                break;
            case "ExecuLink":
                optionExecuLink.click();
                getReusableActions().staticWait(3000);
                //reporter.softAssert(optionExecuLink.isSelected(), "option is selected", "option not selected");
                break;
            case "NorDelCable":
                optionNorDelCable.click();
                getReusableActions().staticWait(3000);
                //reporter.softAssert(optionNorDelCable.isSelected(), "option is selected", "option not selected");
                break;
            case "Primus":
                optionPrimus.click();
                getReusableActions().staticWait(3000);
                //reporter.softAssert(optionPrimus.isSelected(), "option is selected", "option not selected");
                break;
            case "SourceCable":
                optionSourceCable.click();
                getReusableActions().staticWait(3000);
                //reporter.softAssert(optionSourceCable.isSelected(), "option is selected", "option not selected");
                break;
            case "Telehop":
                optionTelehop.click();
                getReusableActions().staticWait(3000);
                //reporter.softAssert(optionTelehop.isSelected(), "option is selected", "option not selected");
                break;
            case "Telizon":
                optionTelizon.click();
                getReusableActions().staticWait(3000);
                //reporter.softAssert(optionTelizon.isSelected(), "option is selected", "option not selected");
                break;
            case "Vonage":
                optionVonage.click();
                getReusableActions().staticWait(3000);
                //reporter.softAssert(optionVonage.isSelected(), "option is selected", "option not selected");
                break;
            case "ACNInc":
                optionACNInc.click();
                getReusableActions().staticWait(3000);
                //reporter.softAssert(optionACNInc.isSelected(), "option is selected", "option not selected");
                break;
        }
    }

    public void selectBillingContact(String billing) {
        if (billing.toLowerCase().equals("personal")) {
            getReusableActions().clickWhenReady(personalRadioButton);
            //reporter.softAssert(personalRadioButton.isDisplayed(), "personal radio button is displayed", "personal radio button is not displayed");
            reporterSnapshot(personalRadioButton,"Personal","","display");
        } else {
            getReusableActions().clickWhenReady(businessRadioButton);
            //reporter.softAssert(businessRadioButton.isDisplayed(), "business radio button is displayed", "business radio button is  not displayed");
            reporterSnapshot(businessRadioButton,"Business","","display");
        }
    }

    public void selectDslProvider(String dslProvider) {
        if (dslProvider.toLowerCase().equals("yes")) {
            if (getDriver().findElements(By.xpath("(//span[contains(text(),'Yes')])")).size() > 1) {
                //getDriver().findElement(By.xpath("(//span[contains(text(),'Yes')])[1]")).click();
                getReusableActions().executeJavaScriptClick(getDriver().findElement(By.xpath("(//span[contains(text(),'Yes')])[1]")));
                getDriver().findElement(By.xpath("(//span[contains(text(),'Yes')])[2]")).click();
            }
            else
                getReusableActions().clickWhenReady(dslProviderYes);

        } else {
            if (getDriver().findElements(By.xpath("(//span[contains(text(),'No')])")).size() > 1) {
                getDriver().findElement(By.xpath("(//span[contains(text(),'No')])[1]")).click();
                //getDriver().findElement(By.xpath("(//span[contains(text(),'No')])[2]")).click();
            }
            else
                getReusableActions().clickWhenReady(dslProviderNo);
        }
    }

    public void checkBoxDsl() {
        getReusableActions().javascriptScrollByVisibleElement(checkboxDsl);
        getReusableActions().clickWhenReady(checkboxDsl);
        //reporter.reportLogWithScreenshot("checkbox");
        reporterSnapshot(checkboxDsl,"DSL checkbox","","NULL");
    }

    public void setAlternatePhoneNumber(String alternatePhoneNumber) {
        altPhoneNumberInput.click();
        altPhoneNumberInput.sendKeys(alternatePhoneNumber);
        //reporter.reportLogWithScreenshot("altphoneNumber");
    }

    public void enterFirstLastname(String firstname, String lastname) {
        //reporter.softAssert(firstNameInput.isDisplayed(), "first name field is displayed", "first name field is not displayed");
        //reporter.softAssert(lastNameInput.isDisplayed(), "last name field is displayed", "last name field is not displayed");
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        //reporter.reportLogWithScreenshot("first last name entered");
        reporterSnapshot(firstNameInput,firstname + " " + lastname,"","NULL");
    }

    public void enterBusinessName(String name) {
        getReusableActions().isElementVisible(businessName, 10);
        businessName.click();
        businessName.sendKeys(name);
        //reporter.reportLogWithScreenshot("Business Name entered");
        reporterSnapshot(businessName,"Business Name","","NULL");
    }

    public void clickCheckBoxesForLandLinePortIn() {
        getReusableActions().javascriptScrollByVisibleElement(checkBoxConfirmLandLine);
        checkBoxConfirmLandLine.click();
        checkBoxAuthorise.click();
        //reporter.reportLogWithScreenshot("Two CheckBoxes");
        reporterSnapshot(checkBoxAuthorise,"Authorise Checkbox","","NULL");
    }
    public void clickOneCheckBoxesForLandLinePortIn() {
        getReusableActions().javascriptScrollByVisibleElement(checkBoxConfirmLandLine);
        checkBoxConfirmLandLine.click();
        //checkBoxAuthorise.click();
        //reporter.reportLogWithScreenshot("Two CheckBoxes");
        reporterSnapshot(checkBoxAuthorise,"Authorise Checkbox","","NULL");
    }
    public void validatePortInApplicationMessage() {
        //reporter.softAssert(portInMessage.getText().equals("You may proceed with port in application"), "validMessage", "invalidMessage");
        reporterSnapshot(portInMessage,"proceed","","common");
    }

    public void validateOldServiceProviders() {
        getReusableActions().staticWait(2000);
        // reporter.softAssert(serviceProviderMessage.getAttribute("class").equalsIgnoreCase("read-only"),"yes","not");
        serviceProviderMessage.isEnabled();
        String providersMessage = serviceProviderMessage.getText();
        System.out.println(providersMessage);
        String msg = providersMessage.substring(0, 16);
        System.out.println(msg);
        String providers = providersMessage.substring(17).trim().toUpperCase();
        System.out.println(providers);
        reporter.softAssert(providers.equals("BELL ONTARIO") || providers.equals("TELUS MOBILITY") || providers.equals("BELL MOBILITY") || providers.equals("XYZ"),"VALID FIELD - \"" + providers.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE ","INVALID : FIELD - \"" + providers.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE");
    }

    public void clickCheckBoxesForPortInWireless() {
        checkBoxConfirm.click();
        checkBoxAuthorise.click();
        //reporter.reportLogWithScreenshot("click checkboxes");
    }

    public void VerifyAfterDeleteAltPhoneNumberFromAccountSection(String altPhoneNumber1) {
        deleteAltNumberFromAccount.click();
        reporterSnapshot(deleteAltNumberFromAccount,"Removed Alt Phone","","NULL");
        getReusableActions().javascriptScrollByVisibleElement(altPhoneNumberInput);
        getReusableActions().staticWait(2000);
        altPhoneNumberInput.click();
        deleteAltNumberFromPort.click();
        altPhoneNumberInput.sendKeys(altPhoneNumber1);
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(altPhoneNumberInput1);
        altPhoneNumberInput1.click();
        reporterSnapshot(altPhoneNumberInput,altPhoneNumber1,"","NULL");
    }

    public void errorMessageForPersonalNameFields() {
       // getReusableActions().javascriptScrollByVisibleElement(errorMessageFirstName);
        //reporter.softAssert(errorMessageFirstName.getText().equals("Error! This field is required."), "valid error FirstName", "invalid error FirstName");
        //reporter.softAssert(errorMessageLastName.getText().equals("Error! This field is required."), "valid error LastName", "invalid error LastName");
        scrollToMiddleOfElement(errorMessageFirstName);
        reporterSnapshot(errorMessageFirstName,"Error! This field is required.","","GEN");
        reporterSnapshot(errorMessageLastName,"Error! This field is required.","","GEN");
    }

    public void errorMessageForBusinessNameFields() {
        //getReusableActions().javascriptScrollByVisibleElement(errorMessageBusinessName);
        scrollToMiddleOfElement(errorMessageBusinessName);
        //reporter.softAssert(errorMessageBusinessName.getText().equals("This field is required"), "valid error BusinessName", "invalid error BusinessName");
        reporterSnapshot(errorMessageBusinessName,"Error! This field is required.","","GEN");
    }

    public void changeCityName(String city, String cityaddress) {
        getReusableActions().clickWhenReady(clearCity);
        String address = addressText.getAttribute("value");
        System.out.println(address);
        clearCity.clear();
        clearCity.sendKeys(city);
        reporter.softAssert(address.equals(cityaddress), "Address Not changed", "Address changed");
    }

    public void selectOtherBillingAddress(String billingDetails) {
        getReusableActions().staticWait(2000);
        switch (billingDetails) {
            case "Canada/USA":
                getReusableActions().javascriptScrollByVisibleElement(canadaRadioButton);
                getReusableActions().staticWait(1000);
                canadaRadioButton.click();
                reporterSnapshot(otherRadioButton,"Canada/USA Card Selected","","display");
                getReusableActions().staticWait(1000);
                break;
            case "Other Countries":
                getReusableActions().javascriptScrollByVisibleElement(otherRadioButton);
                getReusableActions().staticWait(1000);
                getReusableActions().clickWhenReady(otherRadioButton, 10);
                reporterSnapshot(otherRadioButton,"International Card Selected","","display");
                getReusableActions().staticWait(1000);
                break;
        }
    }

    public void locationNotificationMessage() {
        //reporter.softAssert(locationNotification.getText().equals("Please note, that rate plans are shown for the selected location. Make sure your geolocation is correct."), "valid Notification", "invalid Notification");
        reporterSnapshot(defaultLocation,"Toronto, Ontario","","GEN");
        reporterSnapshot(locationNotification,"The plans shown are for your selected region only, so make sure your location is correct before continuing.","","GEN");
    }

    public void validateAlternatePhoneNumber(String altPhoneNumber) {
        getReusableActions().javascriptScrollByVisibleElement(altPhoneNumberInput);
        altPhoneNumberInput.click();
        altPhoneNumberInput.sendKeys(altPhoneNumber);
        String number = altPhoneNumberInput.getAttribute("value");
        getReusableActions().staticWait(2000);
        System.out.println(number);
        reporter.softAssert(number.equals(altPhoneNumber), "Number entered", "Number NotNumber");
    }

    public void clickOnExistingNumber() {
        getReusableActions().isElementVisible(keepExistingNumber);
        getReusableActions().clickWhenReady(keepExistingNumber, 10);
    }

    public void validationForTelusMobility() {
        getReusableActions().javascriptScrollByVisibleElement(phoneNumber);
        reporterSnapshot(portInMessage,"This phone number is eligible for transfer.","","Gen");

        getReusableActions().javascriptScrollByVisibleElement(phoneSerialNumber1);
        phoneSerialNumber1.sendKeys("12345678912345678");
        accountNumber.click();

        //Acceptable length are either 3, 4, 5, 6, 7, 8, 9, 10, or 14 digits
        //enter 2 digit length invalid data "12"
        accountNumber.sendKeys("12");
        getReusableActions().staticWait(3000);
        String errorMessage5 = accountFieldErrorMessage.getText();
        reporterSnapshot(accountFieldErrorMessage,errorMessage5,"","Gen");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        //enter 10 digit length invalid data "12345678901"
        accountNumber.sendKeys("12345678901");
        getReusableActions().staticWait(3000);
        errorMessage5 = accountFieldErrorMessage.getText();
        reporterSnapshot(accountFieldErrorMessage,errorMessage5,"","Gen");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        //enter 10 digit length valid data start with 5 "0s"  "0000012345"
        accountNumber.click();
        accountNumber.sendKeys("0000012345");
        getReusableActions().staticWait(2000);
        int xpathCount = getDriver().findElements(By.xpath("//div/ds-error/ds-icon/span")).size();
        reporterSnapshot(accountFieldErrorMessageIcon,"Error Icon",Integer.toString(xpathCount),"match1");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        //enter 10 digit length number start with three "0s" invalid data  "00045678901"
        accountNumber.sendKeys("00045678901");
        getReusableActions().staticWait(2000);
        reporterSnapshot(accountFieldErrorMessage,errorMessage5,"","Gen");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        //If 14 digits it should start with a "1" followed by six or seven "0's": 1000000 or 10000000
        //enter 14 digits start with 2 and follows 7 "0s" invalid data  "20000000901234"
        accountNumber.sendKeys("20000000901234");
        getReusableActions().staticWait(2000);
        reporterSnapshot(accountFieldErrorMessage,errorMessage5,"","Gen");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        //enter 14 digits start with 1 and follows 5 "0s" invalid data  "10000090123456"
        accountNumber.sendKeys("10000090123456");
        getReusableActions().staticWait(2000);
        reporterSnapshot(accountFieldErrorMessage,errorMessage5,"","Gen");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        //enter 14 digits start with 1 and follows 7 "0s" valid data "10000000901234"
        accountNumber.sendKeys("10000000901234");
        getReusableActions().staticWait(2000);
        xpathCount = getDriver().findElements(By.xpath("//div/ds-error/ds-icon/span")).size();
        reporterSnapshot(accountFieldErrorMessageIcon,"Error Icon",Integer.toString(xpathCount),"match1");
    }

    public void validationForSaskTellMobility() {
        getReusableActions().javascriptScrollByVisibleElement(phoneNumber);
        reporterSnapshot(portInMessage,"This phone number is eligible for transfer.","","Gen");
        getReusableActions().javascriptScrollByVisibleElement(phoneSerialNumber1);
        phoneSerialNumber1.sendKeys("12345678912345678");
        accountNumber.click();

        //enter seven digit numbers (Invalid Data)
        accountNumber.sendKeys("1234567");
        getReusableActions().staticWait(2000);
        String errorMessage = accountFieldErrorMessage.getText();
        reporterSnapshot(accountFieldErrorMessage,errorMessage,"","Gen");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        //enter nine digit number (Invalid Data)
        accountNumber.sendKeys("123456789");
        getReusableActions().staticWait(2000);
        reporterSnapshot(accountFieldErrorMessage,errorMessage,"","Gen");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        //enter eight digit number (valid Data)
        accountNumber.sendKeys("02345678");
        getReusableActions().staticWait(2000);
        int xpathCount = getDriver().findElements(By.xpath("//div/ds-error/ds-icon/span")).size();
        reporterSnapshot(accountFieldErrorMessageIcon,"Error Icon",Integer.toString(xpathCount),"match1");
    }

    public void validationForFidoMobility() {
        getReusableActions().javascriptScrollByVisibleElement(phoneNumber);
        reporterSnapshot(portInMessage,"This phone number is eligible for transfer.","","Gen");

        getReusableActions().javascriptScrollByVisibleElement(phoneSerialNumber1);
        phoneSerialNumber1.sendKeys("12345678912345678");
        accountNumber.click();

        //enter 8 digit invalid data
        accountNumber.sendKeys("12345678");
        getReusableActions().staticWait(2000);
        String errorMessage2 = accountFieldErrorMessage.getText();
        reporterSnapshot(accountFieldErrorMessage,errorMessage2,"","Gen");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        //enter ten digit (invalid Data)
        accountNumber.sendKeys("1234567890");
        getReusableActions().staticWait(2000);
        errorMessage2 = accountFieldErrorMessage.getText();
        reporterSnapshot(accountFieldErrorMessage,errorMessage2,"","Gen");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        //enter number start with alphabets
        accountNumber.sendKeys("D12345678");
        getReusableActions().staticWait(2000);
        errorMessage2 = accountFieldErrorMessage.getText();
        reporterSnapshot(accountFieldErrorMessage,errorMessage2,"","Gen");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        // enter nine digit (valid Data) // with all valid combination
        accountNumber.sendKeys("523456789");
        getReusableActions().staticWait(2000);
        int xpathCount = getDriver().findElements(By.xpath("//div/ds-error/ds-icon/span")).size();
        reporterSnapshot(accountFieldErrorMessageIcon,"Error Icon",Integer.toString(xpathCount),"match1");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        for (int i = 0; i <= 4; i++) {
            int[] num = {1, 4, 5, 6, 8};
            String temp = num[i] + "34982375";
            accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            accountNumber.sendKeys(temp);
            getReusableActions().staticWait(2000);
            xpathCount = getDriver().findElements(By.xpath("//div/ds-error/ds-icon/span")).size();
            reporterSnapshot(accountFieldErrorMessageIcon,temp,Integer.toString(xpathCount),"match1");
        }
        for (int i = 0; i <= 4; i++) {
            int[] num = {0, 2, 3, 7, 9};
            String temp = num[i] + "34982375";
            accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            accountNumber.sendKeys(temp);
            getReusableActions().staticWait(2000);
            reporterSnapshot(accountFieldErrorMessageIcon,temp,"","display");
        }
    }

    public void validationForRogersMobility() {
        getReusableActions().javascriptScrollByVisibleElement(phoneNumber);
        reporterSnapshot(portInMessage,"eligible for transfer","","Common");

        getReusableActions().javascriptScrollByVisibleElement(phoneSerialNumber1);
        phoneSerialNumber1.click();
        phoneSerialNumber1.sendKeys("12345678912345678");
        accountNumber.click();

        //enter 8 digit invalid data
        accountNumber.sendKeys("12345678");
        getReusableActions().staticWait(2000);
        String errorMessage3 = accountFieldErrorMessage.getText();
        reporterSnapshot(accountFieldErrorMessage,errorMessage3,"","Gen");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        //enter ten digit (invalid Data)
        accountNumber.sendKeys("12345678901");
        getReusableActions().staticWait(2000);
        errorMessage3 = accountFieldErrorMessage.getText();
        reporterSnapshot(accountFieldErrorMessage,errorMessage3,"","Gen");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        // enter nine digit (valid Data)
        for (int i = 0; i <= 3; i++) {
            int[] num = {1, 4, 5, 6};
            String temp = num[i] + "34982375";
            accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            accountNumber.sendKeys(temp);
            getReusableActions().staticWait(2000);
            int xpathCount = getDriver().findElements(By.xpath("//div/ds-error/ds-icon/span")).size();
            reporterSnapshot(accountFieldErrorMessageIcon,temp,Integer.toString(xpathCount),"match1");
        }
        for (int i = 0; i <= 5; i++) {
            int[] num = {0, 2, 3, 7, 8, 9};
            String temp1 = num[i] + "34982375";
            accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            accountNumber.sendKeys(temp1);
            getReusableActions().staticWait(2000);
            reporterSnapshot(accountFieldErrorMessageIcon,temp1,"","display");
        }

    }

    public void validationForFreedomMobility() {
        getReusableActions().javascriptScrollByVisibleElement(phoneNumber);
        reporterSnapshot(portInMessage,"This phone number is eligible for transfer.","","Gen");

        getReusableActions().javascriptScrollByVisibleElement(phoneSerialNumber1);
        phoneSerialNumber1.sendKeys("12345678912345678");
        accountNumber.click();

        //enter 3 alphabet and 10 digit (valid/invalid)
        accountNumber.sendKeys("BAC1234567890");
        getReusableActions().staticWait(2000);
        String errorMessage4 = accountFieldErrorMessage.getText();
        reporterSnapshot(accountFieldErrorMessage,errorMessage4,"","Gen");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        //enter only 2 alphabets and 11 digit (invalid/valid)
        accountNumber.sendKeys("BA12345678901");
        getReusableActions().staticWait(2000);
        errorMessage4 = accountFieldErrorMessage.getText();
        reporterSnapshot(accountFieldErrorMessage,errorMessage4,"","Gen");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        //enter 2 alphabet and 12 digit (invalid/invalid)
        accountNumber.sendKeys("BA123456789012");
        getReusableActions().staticWait(2000);
        errorMessage4 = accountFieldErrorMessage.getText();
        reporterSnapshot(accountFieldErrorMessage,errorMessage4,"","Gen");
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

        // valid Data 3 alphabet and 11 digit
        accountNumber.click();
        String temp = "DBA00045678901";
        accountNumber.sendKeys(temp);
        getReusableActions().staticWait(2000);
        int xpathCount = getDriver().findElements(By.xpath("//div/ds-error/ds-icon/span")).size();
        reporterSnapshot(accountFieldErrorMessageIcon,temp,Integer.toString(xpathCount),"match1");
    }

    public void validationForBellMobility() {
        getReusableActions().javascriptScrollByVisibleElement(phoneNumber);
        reporterSnapshot(portInMessage,"This phone number is eligible for transfer.","","Gen");
        //Invalid Data
        String tests = "12345678912345678;12345678;1234567890;100456789012;10045678901234;5289107uoz080;52891076uz080;52891076uoz08";
        String[] strArray=tests.split(";");
        for (int i=0;i<=strArray.length-1;i++) {
            String temp = strArray[i];
            accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            accountNumber.sendKeys(temp);
            getReusableActions().staticWait(2000);
            String errorMessage = accountFieldErrorMessage.getText();
            reporterSnapshot(accountFieldErrorMessage,errorMessage,"","Gen");
        }
        //Valid Data
        String tests1 = "523456789;1004567890123;52891076uoz080";
        String[] strArray1=tests1.split(";");
        for (int i=0;i<=strArray1.length-1;i++) {
            String temp = strArray1[i];
            accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            accountNumber.sendKeys(temp);
            getReusableActions().staticWait(2000);
            int xpathCount = getDriver().findElements(By.xpath("//div/ds-error/ds-icon/span")).size();
            reporterSnapshot(accountFieldErrorMessageIcon, temp, Integer.toString(xpathCount), "match1");
        }
    }

    public void clickYesCancelOption() {
        getReusableActions().clickWhenReady(yesCancelOption, 10);
    }

    public void validateSetProfileDetails(String firstName, String lastName, String email, String dateOfBirth) {
        getReusableActions().javascriptScrollByVisibleElement(firstNameInput);
        reporterSnapshot(firstNameInput,firstName,"","Value");
        reporterSnapshot(lastNameInput,lastName,"","Value");
        reporterSnapshot(emailInput,email,"","Value");
        reporterSnapshot(dateOfBirthInput,dateOfBirth,"","Value");
    }

    public void clickOnChangeLocationButton() {
        getReusableActions().javascriptScrollByVisibleElement(changeLocationStep);
        getReusableActions().isElementVisible(changeLocationStep);
        getReusableActions().clickWhenReady(changeLocationStep, 10);
    }

    public void validateNotificationMessageForNewNumber() {
        getReusableActions().javascriptScrollByVisibleElement(notificationMessageCTN);
        notificationMessageCTN.isDisplayed();
        getReusableActions().staticWait(2000);
        //reporter.reportLogWithScreenshot("notification message display");
        reporterSnapshot(notificationMessageCTN,"Notification","","Display");
    }

    public void validateSimInputField(String simSerialNumber) {
        System.out.println(simSerialNumber);
        getReusableActions().javascriptScrollByVisibleElement(simSerialNumberInput);
        getReusableActions().staticWait(2000);
        String simNumber = simSerialNumberInput.getAttribute("value").replaceAll(" ", "");
        reporterSnapshot(simSerialNumberInput,simNumber,simSerialNumber,"Compare");
        reporterSnapshot(validSimMessage,"activation","","Common");
    }

    public void changePopulateExistingNumber(String ExistingPhoneNumber) {
        getReusableActions().javascriptScrollByVisibleElement(phoneNumber);
        phoneNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        getReusableActions().staticWait(2000);
        phoneNumber.click();
        phoneNumber.sendKeys(ExistingPhoneNumber);
    }

    public void setDetailsverifyThreePortInFields(String serialNumber, String phoneAccountNumber, String pin) {
        getReusableActions().javascriptScrollByVisibleElement(phoneSerialNumber);
        getReusableActions().isElementVisible(phoneSerialNumber, 10);
        phoneSerialNumber.click();
        phoneSerialNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        phoneSerialNumber.sendKeys(serialNumber);
        accountNumber.click();
        accountNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        accountNumber.sendKeys(phoneAccountNumber);
        accountPin.click();
        accountPin.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        accountPin.sendKeys(pin);
        reporter.reportLogWithScreenshot("portIn Fields");
    }

    public void validateKeepExistingNumber(String existNumber) {
        getReusableActions().javascriptScrollByVisibleElement(phoneNumber);
        getReusableActions().staticWait(2000);
        reporter.softAssert(phoneNumber.getAttribute("value").equals(existNumber), "existing number same", "existing number change");
    }

    public void validateDetailForThreePortInField(String serialNumber, String phoneAccountNumber, String pin) {
        getReusableActions().javascriptScrollByVisibleElement(phoneSerialNumber);
        reporter.softAssert(phoneSerialNumber.getAttribute("value").equals(serialNumber), "serial number is equal", "serial number is not equal");
        reporter.softAssert(accountNumber.getAttribute("value").equals(phoneAccountNumber), "account number is equal", "account number is not equal");
        reporter.softAssert(accountPin.getAttribute("value").equals(pin), "account pin equal", "account pin is not equal");
    }

    public void changeProfileDetailsPortIn(String firstName, String lastName, String email, String dateOfBirth, String altPhoneNumber) {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(firstNameInput, 10);
        getReusableActions().javascriptScrollByVisibleElement(firstNameInput);
        firstNameInput.click();
        firstNameInput.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        firstNameInput.sendKeys(firstName);
        getReusableActions().staticWait(2000);
        lastNameInput.click();
        lastNameInput.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        lastNameInput.sendKeys(lastName);
        getReusableActions().staticWait(2000);
        emailInput.click();
        emailInput.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        emailInput.sendKeys(email);
        getReusableActions().staticWait(2000);
        dateOfBirthInput.click();
        dateOfBirthInput.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        dateOfBirthInput.sendKeys(dateOfBirth);
        getReusableActions().staticWait(2000);
        //altPhoneNumberInput1.click();
        //altPhoneNumberInput1.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        //altPhoneNumberInput1.sendKeys(altPhoneNumber);
        reporter.reportLogWithScreenshot("Profile details are populated");
    }

    public void clickOnSMSCheckBox() {
        getReusableActions().isElementVisible(checkBoxSms, 10);
        checkBoxSms.click();
        scrollToMiddleOfElement(checkBoxAuthorise);
        getReusableActions().staticWait(1000);
        reporterSnapshot(checkBoxAuthorise,"Check Box ","","Display");
    }

    public void validateSetProfileDetailsChange(String firstName, String lastName, String email, String dateOfBirth) {
        getReusableActions().javascriptScrollByVisibleElement(firstNameInput);
        /*reporter.softAssert(!firstNameInput.getAttribute("value").equals(firstName), "Firstname field change", "Firstname field not change");
        reporter.softAssert(!lastNameInput.getAttribute("value").equals(lastName), "lastname field change", "lastname field is not change");
        reporter.softAssert(!emailInput.getAttribute("value").equals(email), "email field change", "email field is not change");
        reporter.softAssert(!dateOfBirthInput.getAttribute("value").equals(dateOfBirth), "dateOfBirth field change", "dateOfBirth field is not change");*/
        reporterSnapshot(firstNameInput,firstName,"","value1");
        reporterSnapshot(lastNameInput,lastName,"","value1");
        reporterSnapshot(emailInput,email,"","value1");
        reporterSnapshot(dateOfBirthInput,dateOfBirth,"","value1");

    }

    public void validateSetAddressCityChange(String city) {
        getReusableActions().javascriptScrollByVisibleElement(addressInput);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(!addressInput.getAttribute("value").equals(city), "city  change", "city not change");
        reporterSnapshot(addressInput,city,"","value1");
    }

    public void changeSimSerialNumber(String simSerialNumber) {
        getReusableActions().clickWhenReady(simSerialNumberInput, 10);
        simSerialNumberInput.sendKeys(simSerialNumber.substring(8));
        getReusableActions().staticWait(3000);
        getReusableActions().isElementVisible(validSimMessage, 10);
        reporter.softAssert(validSimMessage.getText().equals("Available for activation"), "Sim Number: " + simSerialNumber + " is Valid", "Sim Number is not Valid");
    }

    public void validateTheSimNumberChange(String simSerialNumber) {
        getReusableActions().javascriptScrollByVisibleElement(simSerialNumberInput);
        //reporter.softAssert(!simSerialNumberInput.getAttribute("value").equals(simSerialNumber), "simNumber Change", "simNumber not change");
        reporterSnapshot(simSerialNumberInput,simSerialNumber,"","value1");
    }

    public void validateFirstNameLatNameDisplayed() {
        getReusableActions().javascriptScrollByVisibleElement(firstNameInput);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(firstNameInput.isEnabled(), "firstname is displayed", "firstname is not diplayed");
        //reporter.softAssert(lastNameInput.isEnabled(), "lastname is displayed", "lastname is not diplayed");
        reporterSnapshot(firstNameInput,"firstName","","enable");
        reporterSnapshot(lastNameInput,"lastName","","enable");
    }

    public void validateBusinessNameLatNameDisplayed() {
        getReusableActions().staticWait(2000);
        //reporter.softAssert(businessNameDisplayed.isDisplayed(), "businessName is displayed", "businessName is not diplayed");
        reporterSnapshot(businessNameDisplayed,"business Name","","display");
    }

    public void clickOnStandaloneNumberInput(String ExistingPhoneNumber) {
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(phoneNumber);
       // getReusableActions().javascriptScrollByVisibleElement(phoneNumber);
       // phoneNumber.click();
        getReusableActions().executeJavaScriptClick(phoneNumber);
        phoneNumber.sendKeys(ExistingPhoneNumber);
        reporterSnapshot(phoneNumber,"Port-In CTN ","","Display");
        getReusableActions().staticWait(3000);

    }

    public void errorMessageForPersonalNameFieldsStandaLone() {
        getReusableActions().javascriptScrollByVisibleElement(errorMessageFirstNameStandaLone);
        //reporter.softAssert(errorMessageFirstNameStandaLone.getText().equals("This field is required"), "valid error FirstName", "invalid error FirstName");
        //reporter.softAssert(errorMessageLastNameStandaLone.getText().equals("This field is required"), "valid error LastName", "invalid error LastName");
        reporterSnapshot(errorMessageFirstNameStandaLone,"FirstName Standalone","","Message");
        reporterSnapshot(errorMessageFirstNameStandaLone,"lastName Standalone","","Message");
    }

    public void errorMessageForBusinessNameFieldsStandaLone() {
        getReusableActions().javascriptScrollByVisibleElement(errorMessageBusinessNameStandaLone);
        //reporter.softAssert(errorMessageBusinessNameStandaLone.getText().equals("This field is required"), "valid error BusinessName", "invalid error BusinessName");
        reporterSnapshot(errorMessageBusinessNameStandaLone,"Business Name","","Message");
    }

        public void validateDslNotificationMessage() {
        getReusableActions().javascriptScrollByVisibleElement(dslNotification);
        getReusableActions().isElementVisible(dslNotification);
        //reporter.softAssert(dslNotification.getText().equals("Do you have a DSL service with this provider?"), "correct Dsl Notification", "Incorrect Dsl Notification");
        reporterSnapshot(dslNotification,"Do you have DSL service","","common");
    }

    public void validateDslYesNoAndCheckBoxErrorMessage() {
        getReusableActions().javascriptScrollByVisibleElement(dslYesNoErrorMessage);
        getReusableActions().isElementVisible(dslYesNoErrorMessage);
        //reporter.softAssert(dslYesNoErrorMessage.getText().equals("This field is required"), "valid Dsl errorMessage", "invalid Dsl errorMessage");
        //reporter.softAssert(dslCheckBoxErrorMessage.getText().equals("This field is required"), "valid DslCheckBox errorMessage", "invalid DslCheckBox errorMessage");
        reporterSnapshot(dslYesNoErrorMessage,"dslYesNo","","Message");
        reporterSnapshot(dslCheckBoxErrorMessage,"Agree to the terms","","common");
    }
    public void verifyPaymentMethodAsPayOnce() {
        getReusableActions().isElementVisible(payOnceRadioButton);
        reporter.softAssert(payOnceRadioButton.isSelected(), "payOnce is selected", "payOnce not selected");
    }

    public void clickOnBackStepOne() {
        getReusableActions().javascriptScrollByVisibleElement(backStepQuickLink1);
        getReusableActions().isElementVisible(backStepQuickLink1);
        getReusableActions().staticWait(2000);
        backStepQuickLink1.click();
    }

    public void validatePageOnStepOne() {
        getReusableActions().javascriptScrollByVisibleElement(selectPlan);
        getReusableActions().isElementVisible(selectPlan);
        //reporter.softAssert(selectPlan.getText().equals("Select a plan"), "page on first step", "page not on first step");
        reporterSnapshot(selectPlan,"Plan Page","","Display");
    }

    public void selectPaymentMethod(String paymentMethod) {
        getReusableActions().staticWait(2000);
        switch (paymentMethod) {
            case "Pay once":
                getReusableActions().clickWhenReady(payOnceRadioButtonClick, 10);
                break;
            case "Auto-Pay":
                getReusableActions().clickWhenReady(autoPayRadioButtonClick, 10);
                break;
        }
    }
    public void validateErrorScenarioForPort(){
        getReusableActions().javascriptScrollByVisibleElement(portInError);
        //reporter.softAssert(portInError.getText().equals("Not open for port"),portInError.getText(),"error message not display");
        reporterSnapshot(portInError,"ELIGIBLE TO TRANSFER","","common");
    }
    public void validateErrorForCheckBox() {
        getReusableActions().javascriptScrollByVisibleElement(errorCheckBoxMessage);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(errorCheckBoxMessage.getText().equals("Please specify atleast one of the above information to continue"), errorCheckBoxMessage.getText(), "error message not display");
        reporterSnapshot(errorCheckBoxMessage,"Error! Agree to the terms before continuing.","","Gen");
    }
    public void clickTopUpEasFrench() {
        getReusableActions().clickWhenReady(topUp, 10);
    }

    public void errorMessageForPersonalLastNameFields() {
        getReusableActions().javascriptScrollByVisibleElement(firstNameInput);
        getReusableActions().isElementVisible(errorMessageOneLastName);
        //reporter.softAssert(errorMessageOneLastName.getText().equals("This field is required"), "valid error LastName", "invalid error LastName");
        reporterSnapshot(errorMessageOneLastName,"Last Name","","Message");
    }
    public void validateVoucherAbleToAddOnlyOne(String voucherPIN){
        getReusableActions().javascriptScrollByVisibleElement(voucherInput);
        //reporter.softAssert(voucherInput.isDisplayed(),"voucher field one is displaying","voucher field one is not displaying");
        reporterSnapshot(voucherInput,"Voucher PIN","","Display");
        //reporter.softAssert(!voucherInput.getAttribute("value").isEmpty(),"voucher details entered","voucher details entered");
        reporterSnapshot(voucherInput,"Voucher PIN " + voucherPIN,"","NotEmpty");
        if(voucherInput.getAttribute("value").isEmpty()){
             voucherInput.sendKeys(voucherPIN);
        }
        else {
            System.out.println("Only One Voucher can enter");
        }
    }
    public void validateVoucherPinLength(){
        getReusableActions().staticWait(3000);
//        //getReusableActions().clickWhenReady(voucherInput);
//        voucherInput.clear();
//        getReusableActions().staticWait(2000);
//        voucherInput.sendKeys(voucherPIN);
        getReusableActions().javascriptScrollByVisibleElement(voucherErrorinvalid);
        getReusableActions().staticWait(2000);
        reporterSnapshot(voucherErrorinvalid,"PIN exactly","","COMMON");
    }

    public void validateVoucherShouldNotDisplayed(){
        getReusableActions().javascriptScrollByVisibleElement(voucherInput);
        //reporter.softAssert(!voucherInput.isDisplayed(),"Voucher not displayed","voucher displayed");
        reporterSnapshot(voucherInput,"Voucher","","NotDisplay");
    }
    public void validateAlternateCtnAndTemporaryCtnSectionDisplayed(){
        getReusableActions().javascriptScrollByVisibleElement(altPhoneNumberInputDisplayed);
       getReusableActions().staticWait(2000);
       getReusableActions().isElementVisible(altPhoneNumberInputDisplayed);
       //reporter.softAssert(altPhoneNumberInputDisplayed.isDisplayed(),"alternate field  displayed","alternate field not displayed");
       //reporterSnapshot(altPhoneNumberInputDisplayed,"altPhoneNumber","","display");
       getReusableActions().isElementVisible(temporaryCtnAvailable,20);
        //reporter.softAssert(temporaryCtnAvailable.isDisplayed(),"temporary Ctn field  displayed","temporary Ctn field not displayed");
        reporterSnapshot(temporaryCtnAvailable,temporaryCtnAvailable.getText(),"","display");
    }
    public void validateAlternateCtnFieldNotEmpty(){
        getReusableActions().javascriptScrollByVisibleElement(altPhoneNumberInput);
        getReusableActions().isElementVisible(altPhoneNumberInput);
        altPhoneNumberInput.click();
        altPhoneNumberInput.sendKeys("1234567890");
        //reporter.softAssert(!altPhoneNumberInput.getAttribute("value").isEmpty(),"altPhoneNumber Entered","altPhoneNumber Not Entered");
        reporterSnapshot(altPhoneNumberInput,"1234567890","","NOTEMPTY");
    }
    public void enterOneVerificationFieldStandALone(String serialNumber) {
        //getReusableActions().javascriptScrollByVisibleElement(accountPin);
        scrollToMiddleOfElement(accountNumber);
        getReusableActions().staticWait(1000);
        getReusableActions().isElementVisible(accountPin, 10);
        accountPin.sendKeys(serialNumber);
        reporterSnapshot(accountPin,"account PIN","","NULL");
    }

    public void validateOrderSimLinkFrench() {
        getReusableActions().javascriptScrollByVisibleElement(OrderSimLinkFrench);
        getReusableActions().isElementVisible(OrderSimLinkFrench);
        String parentWindow = getDriver().getWindowHandle();
        getReusableActions().clickWhenReady(OrderSimLinkFrench, 10);
        getReusableActions().switchToNewWindow(parentWindow);
        //reporter.softAssert(getDriver().getCurrentUrl().contains("https://shopchatrmobile.ca/"), "Order Sim Link is working", "Order Sim Link not working");
        reporterSnapshot(OrderSimLink,"https://shopchatrmobile.ca/","","Link");
        getReusableActions().closeCurrentWindow();
        getReusableActions().switchToMainWindow(parentWindow);
        getReusableActions().staticWait(2000);
    }
    public void setSimDetailsFrench(String simSerialNumber) {
        //Set simSerialNumber
        getReusableActions().clickWhenReady(simSerialNumberInput, 10);
        simSerialNumberInput.sendKeys(simSerialNumber.substring(8));
        //  getReusableActions().isElementVisible(validSimMessage, 10);
        // reporter.softAssert(validSimMessage.getText().equals("Available for activation"), "Sim Number: " + simSerialNumber + " is Valid", "Sim Number is not Valid");
        //reporterSnapshot(validSimMessage,"Available for activation",simSerialNumber,"GEN");
        reporterSnapshot(simSerialNumberInput,"SIM NUMBER",simSerialNumber,"null");
    }

    public void errorMessageForCheckboxFields() {
        getReusableActions().javascriptScrollByVisibleElement(errorMessageBusinessName);
        //reporter.softAssert(errorMessageBusinessName.getText().equals("This field is required"), "valid error BusinessName", "invalid error BusinessName");
        reporterSnapshot(errorMessageBusinessName,"Error! This field is required.","","GEN");
    }
    public void validateContinueEnabled() {
        getReusableActions().staticWait(3000);
        getReusableActions().scrollToElement(continueButtonDisable);
        reporterSnapshot(continueButtonDisable,"CONTINUE","","NOTENABLE");
    }
    public void clickOnProceed() {
        getReusableActions().clickWhenReady(proceedButton, 10);
    }
    public void selectKeepDslProvider(String dslProviderOptions) {
        if (dslProviderOptions.toLowerCase().equals("Keep")) {
            getReusableActions().clickWhenReady(dslProviderKeep);
        } else {
            getReusableActions().clickWhenReady(dslProviderDisconnect);
        }
    }
    public void validateDisconnectOptionSelected() {
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(disconnectRadioButtonSelected);
    }
    public void validatePrepopulateOlderServiceProvider(){
        getReusableActions().staticWait(3000);
        reporterSnapshot(currentCarrier,"Current Service Provider","","DISPLAY");
    }
    public void sendPhoneNumber(String PhoneNumber) {
        getReusableActions().javascriptScrollByVisibleElement(phoneNumber);
        phoneNumber.click();
        phoneNumber.sendKeys(PhoneNumber);
        getReusableActions().staticWait(2000);
        reporterSnapshot(phoneNumber,PhoneNumber,"","NULL");
    }
    public void validateListOfResellerDropDown(){
        getReusableActions().staticWait(2000);
        dropdown.click();
        getReusableActions().staticWait(3000);
        reporterSnapshot(optionCableCable,"List of Older Reseller Dropdown","","DISPLAY");
    }
    public void clickYesPortInPopUp(){
        getReusableActions().staticWait(2000);
        reporterSnapshot(yesPortInPopUp,"Port-In Yes","","DISPLAY");
        yesPortInPopUp.click();
    }
    public void validatePortInSuccessMessage(){
        getReusableActions().staticWait(4000);
        reporterSnapshot(portInSuccessMessage,portInSuccessMessage.getText(),"","DISPLAY");
    }
    public void validateInValidCTNErrorMessage() {
        getReusableActions().isElementVisible(invalidCTNError);
        System.out.println("======== "+invalidCTNError);
        reporterSnapshot(invalidCTNError,"Error! Phone number must be exactly 10-digits. Try again.","","GEN");
    }
    public void validatePersonalOption(){
        getReusableActions().scrollToElement(personalOption);
        reporterSnapshot(personalOption,"Personal","","COMMON");
        getReusableActions().isElementVisible(firstNameInput, 5);
        getReusableActions().isElementVisible(lastNameInput, 5);
    }

    public void validateDSLProviderOptions(){
        getReusableActions().javascriptScrollByVisibleElement(dslNotification);
        getReusableActions().isElementVisible(dslNotification);
        reporterSnapshot(dslNotification,"Do you have DSL service","","common");
        reporterSnapshot(dslProviderKeep,"Do you want to keep your DSL service with this provider?","","common");
    }

    public void validateDSLProviderOption(String option){
        switch (option) {
            case "Yes":
                dslProviderYes.click();
                break;
            case "No":
                getReusableActions().clickWhenReady(dslProviderNo, 10);
                break;
        }
        reporterSnapshot(dslProviderYes1,"YesOption","","DISPLAY");
        reporterSnapshot(dslProviderNo,"NoOption","","DISPLAY");

    }
    public void enterAlternatePhoneNumber() {
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(altPhoneNumberInput);
        altPhoneNumberInput.click();
        altPhoneNumberInput.sendKeys("12344");
        getReusableActions().staticWait(3000);
        getReusableActions().isElementVisible(altNumberErrorMessage);
        reporterSnapshot(altNumberErrorMessage, "10-digits", "", "common");

    }

    public void validateErrorMessage() {
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(accountNumber);
        getReusableActions().staticWait(500);
        reporterSnapshot(accountDetailsError,"You must fill in at least one piece of information","","Common");

    }

    public void validateUnFilledField(){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollToMiddleOfPage();
        dslProviderYes1.sendKeys(Keys.TAB);
    }
    public void setAddress1(String city) {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(addressInput);
        addressInput.click();
        addressInput.sendKeys(city);
        getReusableActions().isElementVisible(autoCompleteAddress, 10);
        getReusableActions().clickWhenReady(autoCompleteAddress, 20);
        reporterSnapshot(addressInput,"Address Details","","NULL");
    }
    public void validateMadeChengesRemainSame(){
        getReusableActions().staticWait(3000);
        getDriver().navigate().refresh();
        getReusableActions().staticWait(3000);
        getDriver().switchTo().alert().dismiss();
        getReusableActions().staticWait(3000);
        getDriver().navigate().refresh();
        getReusableActions().staticWait(3000);
        getDriver().switchTo().alert().dismiss();
        getReusableActions().javascriptScrollByVisibleElement(validSimMessage);
        reporterSnapshot(validSimMessage,"Available for activation","","Common");
        getReusableActions().javascriptScrollByVisibleElement(addressInput);
        getReusableActions().staticWait(1000);
        reporterSnapshot(addressInput,"Address Details","","DISPLAY");
    }
    public void validateMadeChengesErased(){
        getReusableActions().staticWait(3000);
        getDriver().navigate().refresh();
        getReusableActions().staticWait(3000);
        getDriver().switchTo().alert().accept();
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollToTopOfPage();
        getReusableActions().staticWait(2000);
        reporterSnapshot(null,"SIM Number Erased", String.valueOf(
                validSimMessageList==null ? 0 : validSimMessageList.size()), "HIDDEN");
    }
    public void validateNotChangesInAddressDetailsInSimpage(){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(validSimMessage);
        reporterSnapshot(validSimMessage,"Available for activation","","Common");
        getReusableActions().javascriptScrollByVisibleElement(firstNameInput);
        getReusableActions().staticWait(1000);
        reporterSnapshot(firstNameInput,"Account Details","","DISPLAY");
        getReusableActions().javascriptScrollByVisibleElement(addressInput);
        getReusableActions().staticWait(1000);
        reporterSnapshot(addressInput,"Address Details","","DISPLAY");
    }
    public void validateFirstStepActive(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(backToCustomerSearch);
        getReusableActions().staticWait(3000);
        reporterSnapshot(step1Active, "Validate New SIM", "", "visible");
    }
    public void validateBothCtnNoteSame(int index,String number1,String number2){
        WebElement phoneXpath = getDriver().findElement(By.xpath("//ds-radio-group/div/ds-selection[" + index + "]"));
        getReusableActions().isElementVisible(phoneNumbersList, 10);
        getReusableActions().javascriptScrollByVisibleElement(phoneXpath);
        reporter.softAssert(!(number1.equals(number2)), "VALID FIELD - \"" +number1 + "\" EXPECTED VALUE IS NOT MATCH WITH ACTUAL VALUE \"" + number2 + "\"", "INVALID : FIELD - \"" + number1 + "\" EXPECTED VALUE IS MATCHED WITH ACTUAL VALUE \"" + number2 + "\"");

    }
    public void enterFirstLastnameandPostacode(String firstname, String lastname,String postal) {
        getReusableActions().staticWait(2000);
        firstNameInput.sendKeys(firstname);
        getReusableActions().staticWait(1000);
        lastNameInput.sendKeys(lastname);
        getReusableActions().staticWait(1000);
        postalCode.sendKeys(postal);
        reporterSnapshot(firstNameInput,firstname + " " + lastname + " " +postal,"","NULL");
    }

}

