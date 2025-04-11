package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

public class UnAuthenticated_TopUp_Test extends BaseTest {

    /*
    @Test(groups = {"UnAuthenticated", "E2E", "Regression", "Scrum"})
    public void CPP_25470_validate_ReviewPage_Unauthenticated_topUp() {
        String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");
        String firstName = TestDataHandler.gtpData.getGtpData().get(0).get("firstName");
        String lastName = TestDataHandler.gtpData.getGtpData().get(0).get("lastName");
        String city = TestDataHandler.gtpData.getGtpData().get(0).get("city");
        String creditCard = TestDataHandler.gtpData.getGtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.gtpData.getGtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.gtpData.getGtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.gtpData.getGtpData().get(0).get("topUp");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().validateReviewPage(creditCard, phoneNumber);
    }

    @Test(groups = {"UnAuthenticated", "Regression"})
    public void CPP_24174_Validate_UnauthenticatedTopUp_Form_UsingCreditCard() {
        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(3).get("phoneNumber");
        String phoneNumber2 = TestDataHandler.customerData.getCustomerData().get(5).get("phoneNumber2");
        String editPhoneNumber = TestDataHandler.customerData.getCustomerData().get(6).get("editPhoneNumber");
        String topUp = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String firstName = TestDataHandler.customerData.getCustomerData().get(3).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(3).get("lastName");
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validateInValidPhoneNumber(phoneNumber2);
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().validateEditButtonForPhoneNumber(phoneNumber);
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().validateEditButtonForPaymentMethod();
        getTopUpFormPage().clickContinueButtonPaymentMethod();
    }

    @Test(groups = {"UnAuthenticated", "Regression", "Scrum"})
    public void CPP_27951_AutoComplete_BillingAddress_UnAuthenticatedTopUp() {
        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(3).get("phoneNumber");
        String firstName = TestDataHandler.customerData.getCustomerData().get(3).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(3).get("lastName");
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String topUp = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
    }

    @Test(groups = {"UnAuthenticated", "Regression", "Scrum"})
    public void CPP_27952_AutoComplete_BillingAddress_For_US_UnAuthenticatedTopUp() {
        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(3).get("phoneNumber");
        String firstName = TestDataHandler.customerData.getCustomerData().get(3).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(3).get("lastName");
        String city = TestDataHandler.cityData.getCityData().get(4).get("city");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String topUp = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String country = TestDataHandler.cityData.getCityData().get(4).get("country");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().selectCountry(country);
        getTopUpFormPage().setAddress(city);
    }

    @Test(groups = {"UnAuthenticated", "Regression"})
    public void CPP_26185_validate_CancelButton_Unauthenticated_topUp() {
        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(3).get("phoneNumber");
        String firstName = TestDataHandler.customerData.getCustomerData().get(3).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(3).get("lastName");
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String topUp = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().selectCancelButton();
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().validateReviewPage(creditCard, phoneNumber);
    }

    @Test(groups = {"UnAuthenticated", "Scrum"})
    public void CPP_31295_validate_manually_input_billing_address() {
        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(3).get("phoneNumber");
        String firstName = TestDataHandler.customerData.getCustomerData().get(3).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(3).get("lastName");
        String address = TestDataHandler.cityData.getCityData().get(0).get("address");
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
        String postalCode = TestDataHandler.cityData.getCityData().get(2).get("postalCode");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String topUp = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setManuallyBillingAddress(address, city, postalCode);
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().validateReviewPage(creditCard, phoneNumber);
    }

    @Test(groups = {"UnAuthenticated", "qa1", "E2E"})
    public void CPP_30577_ValidateTopUpAmountExceedsBalanceLimit() {
        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(10).get("phoneNumber");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().validateTopUpQuantity();
    }

    @Test(groups = {"UnAuthenticated", "Scrum"})
    public void CPP_31740_validate_modify_fields_billing_address() {
        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(3).get("phoneNumber");
        String firstName = TestDataHandler.customerData.getCustomerData().get(3).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(3).get("lastName");
        String address = TestDataHandler.cityData.getCityData().get(2).get("address");
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
        String province = TestDataHandler.cityData.getCityData().get(0).get("province");
        String postalCode = TestDataHandler.cityData.getCityData().get(2).get("postalCode");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String topUp = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().modifyBillingAddress(address);
        getTopUpFormPage().validateBillingAddressFields(address, city, province, postalCode);
    }
*/
    @Test(groups = {"GTPCC", "DAYONE", "qaAuto", "ptwo"})
    public void CPP_29103_validate_Unauthenticated_topUp_checkBoxesClick_paymentSummaryPage() {
        String phoneNumber = "416-319-7202" ;//TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");
        String firstName = TestDataHandler.gtpData.getGtpData().get(0).get("firstName");
        String lastName = TestDataHandler.gtpData.getGtpData().get(0).get("lastName");
        String city = TestDataHandler.gtpData.getGtpData().get(0).get("city");
        String creditCard = TestDataHandler.gtpData.getGtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.gtpData.getGtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.gtpData.getGtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.gtpData.getGtpData().get(0).get("topUp");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        //String phoneNumber = getCarePortalHomePage().customerSearchfromExcel("");
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().checkAuthorizeCheckbox();
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().verifyReceipt(phoneNumber, creditCard, topUp);
    }

    @Test(groups = {"GTPCC", "DAYONE", "qaAuto", "ptwo"})
    public void CPP_29105_validate_Unauthenticated_topUp_checkBoxNotChecked_paymentSummaryPage() {
        String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");
        String firstName = TestDataHandler.gtpData.getGtpData().get(0).get("firstName");
        String lastName = TestDataHandler.gtpData.getGtpData().get(0).get("lastName");
        String city = TestDataHandler.gtpData.getGtpData().get(0).get("city");
        String creditCard = TestDataHandler.gtpData.getGtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.gtpData.getGtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.gtpData.getGtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.gtpData.getGtpData().get(0).get("topUp");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().validateCheckboxErrorMessage();
    }

    @Test(groups = {"GTPCC", "DAYONE", "qaAuto", "ptwo"})
    public void CPP_29292_validate_Unauthenticated_topUp_initiateNew_Topup() {
        String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");
        String firstName = TestDataHandler.gtpData.getGtpData().get(0).get("firstName");
        String lastName = TestDataHandler.gtpData.getGtpData().get(0).get("lastName");
        String city = TestDataHandler.gtpData.getGtpData().get(0).get("city");
        String creditCard = TestDataHandler.gtpData.getGtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.gtpData.getGtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.gtpData.getGtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.gtpData.getGtpData().get(0).get("topUp");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().checkAuthorizeCheckbox();
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().clickNewTopUpButtonLink();
        getTopUpFormPage().validateGuestTopUpPageText();
    }

    @Test(groups = {"GTPCC", "DAYONE", "qaAuto", "ptwo"})
    public void CPP_29102_validate_Unauthenticated_topUp_creditCard_paymentDesktop() {
        String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");
        String firstName = TestDataHandler.gtpData.getGtpData().get(0).get("firstName");
        String lastName = TestDataHandler.gtpData.getGtpData().get(0).get("lastName");
        String city = TestDataHandler.gtpData.getGtpData().get(0).get("city");
        String creditCard = TestDataHandler.gtpData.getGtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.gtpData.getGtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.gtpData.getGtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.gtpData.getGtpData().get(0).get("topUp");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().validateReviewPage(creditCard, phoneNumber);
    }

    @Test(groups = {"GTPCC", "qaAuto", "DAYONE", "pthree"})
    public void CPP_29449_ValidateTopUpAmountExceedsBalanceLimit() {
        String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().clickCreditCard();
        getTopUpFormPage().validateTopUpAmountMoreThan$300("300");
    }

    @Test(groups = {"GTPCC", "DAYONE", "qaAuto", "pfour"})
    public void CPP_27651_validate_Autocomplete_Billing_Address() {
        String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");
        String firstName = TestDataHandler.gtpData.getGtpData().get(0).get("firstName");
        String lastName = TestDataHandler.gtpData.getGtpData().get(0).get("lastName");
        String city = TestDataHandler.gtpData.getGtpData().get(0).get("city");
        String creditCard = TestDataHandler.gtpData.getGtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.gtpData.getGtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.gtpData.getGtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.gtpData.getGtpData().get(0).get("topUp");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
    }

    @Test(groups = {"GTPCC", "DAYONE", "qaAuto", "pfour"})
    public void CPP_27643_validate_AutoSuggestion_Field_For_AddressLine() {
        String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");
        String firstName = TestDataHandler.gtpData.getGtpData().get(0).get("firstName");
        String lastName = TestDataHandler.gtpData.getGtpData().get(0).get("lastName");
        String city = TestDataHandler.gtpData.getGtpData().get(0).get("city");
        String creditCard = TestDataHandler.gtpData.getGtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.gtpData.getGtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.gtpData.getGtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.gtpData.getGtpData().get(0).get("topUp");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
    }

    @Test(groups = {"GTPCC", "DAYONE", "qaAuto", "ptwo"})
    public void CPP_24648_Validate_Edit_PhoneNumber_And_Edit_TopUp_Amount() {
        String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");
        String firstName = TestDataHandler.gtpData.getGtpData().get(0).get("firstName");
        String lastName = TestDataHandler.gtpData.getGtpData().get(0).get("lastName");
        String city = TestDataHandler.gtpData.getGtpData().get(0).get("city");
        String creditCard = TestDataHandler.gtpData.getGtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.gtpData.getGtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.gtpData.getGtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.gtpData.getGtpData().get(0).get("topUp");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().validateEditButtonForPhoneNumber(phoneNumber);
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().validateEditButtonForPaymentMethod(topUp);
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().checkAuthorizeCheckbox();
        getTopUpFormPage().clickOnContinueConfirmPayment();
        int itopUp = Integer.parseInt(topUp) + 1;
        topUp = Integer.toString(itopUp);
        getTopUpFormPage().verifyReceipt(phoneNumber, creditCard, topUp);
    }

    @Test(groups = {"GTPCC", "DAYONE", "qaAuto", "ptwo"})
    public void CPP_26185_Validate_Cancel_Than_again_proceed_UnauthenticatedTopUp() {
        String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");
        String firstName = TestDataHandler.gtpData.getGtpData().get(0).get("firstName");
        String lastName = TestDataHandler.gtpData.getGtpData().get(0).get("lastName");
        String city = TestDataHandler.gtpData.getGtpData().get(0).get("city");
        String creditCard = TestDataHandler.gtpData.getGtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.gtpData.getGtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.gtpData.getGtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.gtpData.getGtpData().get(0).get("topUp");

        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        //getTopUpFormPage().validateEditButtonForPhoneNumber(phoneNumber);
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickCancelAndContinueButtonPaymentMethod();
        getTopUpFormPage().checkAuthorizeCheckbox();
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().verifyHSTReceipt();
    }

    @Test(groups = {"GTPCC", "DAYONE", "qaAuto", "ptwo"})
    public void CPP_30917_User_able_to_use_International_CC_for_unauthenticated_Guest_Top_Up_flow() {
        String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");
        String firstName = TestDataHandler.gtpData.getGtpData().get(0).get("firstName");
        String lastName = TestDataHandler.gtpData.getGtpData().get(0).get("lastName");
        String city = TestDataHandler.gtpData.getGtpData().get(1).get("city");
        String creditCard = TestDataHandler.gtpData.getGtpData().get(1).get("cardNumber");
        String cvv = TestDataHandler.gtpData.getGtpData().get(1).get("cvv");
        String expiryDate = TestDataHandler.gtpData.getGtpData().get(1).get("expiryDate");
        String topUp = TestDataHandler.gtpData.getGtpData().get(0).get("topUp");
        String country = TestDataHandler.gtpData.getGtpData().get(1).get("country");
        String postalCode = TestDataHandler.gtpData.getGtpData().get(1).get("postalCode");
        String province = TestDataHandler.gtpData.getGtpData().get(1).get("provinceFullName");

        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        //getTopUpFormPage().validateEditButtonForPhoneNumber(phoneNumber);
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getSimPage().selectOtherBillingAddress("Other Countries");
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().selectCountry(country);
        getTopUpFormPage().setManuallyBillingAddressOtherCountry("Auto Test", city, postalCode, province);
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().checkAuthorizeCheckbox();
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().verifyReceipt(phoneNumber, creditCard, topUp);
    }

    @Test(groups = {"GTPCC", "DAYONE", "qaAuto", "Sanity","ptwo"})
    public void CPP_28943_validate_Unauthenticated_topUp_SuccessMessage() {
        String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");
        String firstName = TestDataHandler.gtpData.getGtpData().get(0).get("firstName");
        String lastName = TestDataHandler.gtpData.getGtpData().get(0).get("lastName");
        String city = TestDataHandler.gtpData.getGtpData().get(0).get("city");
        String creditCard = TestDataHandler.gtpData.getGtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.gtpData.getGtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.gtpData.getGtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.gtpData.getGtpData().get(0).get("topUp");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().checkAuthorizeCheckbox();
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().verifyReceipt(phoneNumber, creditCard, topUp);
    }
    /*@Test(groups = {"GTPCC","qaAuto", "Sanity","ptwo"})
    public void CPP_28943_validate_Unauthenticated_topUp_SuccessMessage_FR() {
        String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");
        String firstName = TestDataHandler.gtpData.getGtpData().get(0).get("firstName");
        String lastName = TestDataHandler.gtpData.getGtpData().get(0).get("lastName");
        String city = TestDataHandler.gtpData.getGtpData().get(0).get("city");
        String creditCard = TestDataHandler.gtpData.getGtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.gtpData.getGtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.gtpData.getGtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.gtpData.getGtpData().get(0).get("topUp");
        getHeaderComponent().changeLanguage("French");
        getHeaderComponent().clickTopUpFrench();
        getTopUpPage().clickTopUpTodayFrench();
        getTopUpFormPage().validatePhoneNumberFrench(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().checkAuthorizeCheckboxFrench();
        //getTopUpFormPage().checkServiceAgreementCheckbox();
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().verifyReceiptFrench(phoneNumber, creditCard, topUp);
    }*/


}

