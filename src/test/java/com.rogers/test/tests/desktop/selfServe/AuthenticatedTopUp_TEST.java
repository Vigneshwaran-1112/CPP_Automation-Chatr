package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;

public class AuthenticatedTopUp_TEST extends BaseTest {

//    @Test(groups = {"SignIn", "Regression","Scrum"})
//    public void CPP_25548_validateTopUpSignIn() {
//        getHeaderComponent().clickTopUp();
//        getTopUpPage().clickSignInNow();
//        getSignInPage().validateSignIn();
//    }
//    @Test(groups = {"ATPCC","EAS", "qa1"})
//    public void CPP_25548_navigateToAuthenticatedTopUp(){
//        String username = TestDataHandler.accountData.getAccountData().get(0).get("username");
//        String password = TestDataHandler.accountData.getAccountData().get(0).get("password");
//        getHeaderComponent().clickTopUp();
//        getTopUpPage().clickSignInNow();
//        getSignInPage().signIn(username,password);
//        getHeaderComponent().clickTopUp();
//        getTopUpFormPage().validateTopUpPageText();
//        getTopUpFormPage().validateAccountRenewal();
//    }
//    @Test(groups = {"ATPCC","EAS", "qa1"})
//    public void CPP_25549_selectCreditCardAuthenticatedTopUp() {
//        String username = TestDataHandler.accountData.getAccountData().get(0).get("username");
//        String password = TestDataHandler.accountData.getAccountData().get(0).get("password");
//        getHeaderComponent().clickTopUp();
//        getTopUpPage().clickSignInNow();
//        getSignInPage().signIn(username,password);
//        getHeaderComponent().clickTopUp();
//        getTopUpFormPage().selectPaymentMethod("Credit");
//        getTopUpFormPage().validateCreditCardCard();
//        getTopUpFormPage().clickOnPaymentInfoIcon();
//        getTopUpFormPage().validatePaymentInfo();
//    }
//    @Test(groups = {"ATPCC","EAS", "qa1"})
//    public void CPP_25551_validateStepNumerationIconsAndRefreshMessage() throws AWTException {
//        String username = TestDataHandler.accountData.getAccountData().get(0).get("username");
//        String password = TestDataHandler.accountData.getAccountData().get(0).get("password");
//        String topUp = TestDataHandler.planData.getPlanData().get(2).get("topUp");
//        getHeaderComponent().clickTopUp();
//        getTopUpPage().clickSignInNow();
//        getSignInPage().signIn(username,password);
//        getHeaderComponent().clickTopUp();
//        getTopUpFormPage().selectPaymentMethod("Credit");
//        getTopUpFormPage().completeSecondStepTopUpForm(topUp);
//        getTopUpFormPage().clickEditSecondStepTopUpForm();
//        getTopUpFormPage().clickOnContinuePaymentMethod();
//        getTopUpFormPage().cancelRefreshPage();
//        getTopUpFormPage().getTopUpInputValue();
//        getTopUpFormPage().acceptRefreshPage();
//        getTopUpFormPage().validateCreditCardRadioBtnAppears();
//    }
//    @Test(groups = {"ATPCC","EAS", "qa1"})
//    public void CPP_25550_selectCreditCardAuthenticatedTopUp() {
//        String usernameNoCard = TestDataHandler.accountData.getAccountData().get(2).get("username");
//        String passwordNoCard = TestDataHandler.accountData.getAccountData().get(2).get("password");
//        getHeaderComponent().clickTopUp();
//        getTopUpPage().clickSignInNow();
//        getSignInPage().signIn(usernameNoCard, passwordNoCard);
//        getHeaderComponent().clickTopUp();
//        getTopUpFormPage().selectPaymentMethod("Credit");
//        getTopUpFormPage().validateCreditCardFields();
//    }
//    @Test(groups = {"ATPCC","EAS", "qa1", "E2E"})
//    public void CPP_24168_e2e_Validate_Topup_Saved_Credit_Card(){
//        String username = TestDataHandler.accountData.getAccountData().get(0).get("username");
//        String password = TestDataHandler.accountData.getAccountData().get(0).get("password");
//        getHeaderComponent().clickTopUp();
//        getTopUpPage().clickSignInNow();
//        getSignInPage().signIn(username,password);
//        getHeaderComponent().clickTopUp();
//        getTopUpFormPage().selectPaymentMethod("Credit");
//        getTopUpFormPage().validateCreditCardCard();
//    }
//    @Test(groups = {"AuthenticatedTopUp", "Regression", "E2E","Scrum"})
//    public void CPP_24168_Validate_TopUp_Payment_Saved_Credit_Card(){
//        String username = TestDataHandler.accountData.getAccountData().get(6).get("username");
//        String password = TestDataHandler.accountData.getAccountData().get(6).get("password");
//        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
//        String topUp = TestDataHandler.planData.getPlanData().get(2).get("topUp");
//        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(3).get("phoneNumber");
//        getHeaderComponent().clickTopUp();
//        getTopUpPage().clickSignInNow();
//        getSignInPage().signIn(username,password);
//        getHeaderComponent().clickTopUp();
//        getTopUpFormPage().selectPaymentMethod("Credit");
//        getTopUpFormPage().completeSecondStepTopUpForm(topUp);
//        getTopUpFormPage().confirmPaymentInfo(phoneNumber,creditCard,topUp);
//        getTopUpFormPage().checkAuthorizeCheckbox();
//        getTopUpFormPage().checkAuthorizeCheckbox();
//       // getTopUpFormPage().clickOnContinueConfirmPayment();
//       // getTopUpFormPage().verifyReceipt(phoneNumber, creditCard, topup);
//    }
//    @Test(groups = {"ATPCC","EAS", "French","Scrum"})
//    public void CPP_24168_Validate_Payment_Method_French(){
//        String username = TestDataHandler.accountData.getAccountData().get(0).get("username");
//        String password = TestDataHandler.accountData.getAccountData().get(0).get("password");
//        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
//        String topup = TestDataHandler.planData.getPlanData().get(2).get("topUp");
//        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("phoneNumber");
//        getHeaderComponent().changeLanguage("French");
//        getHeaderComponent().clickTopUpFrench();
//        getTopUpPage().clickOuvrirUneSession();
//        getSignInPage().signInFrench(username,password);
//        getHeaderComponent().clickTopUpFrench();
//        getTopUpFormPage().selectPaymentMethod("Credit");
//        getTopUpFormPage().completeSecondStepTopUpFormFrench();
//        getTopUpFormPage().confirmPaymentInfo(phoneNumber,creditCard,topup);
//        getTopUpFormPage().checkServiceAgreementFrenchCheckbox();
//        getTopUpFormPage().checkAuthorizeFrenchCheckbox();
//        getTopUpFormPage().clickOnContinueConfirmPayment();
//        getTopUpFormPage().verifyReceiptFrench(phoneNumber, creditCard, topup);
//        getHeaderComponent().changeLanguage("English");
//    }
//    @Test(groups = {"ATPCC","EAS", "qaAuto"})
//    public void CPP_24174_ValidateUnauthenticatedTopUpFormUsingCreditCard(){
//        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(12).get("phoneNumber");
//        String phoneNumber2 = TestDataHandler.customerData.getCustomerData().get(5).get("phoneNumber2");
//        String editphoneNumber = TestDataHandler.customerData.getCustomerData().get(6).get("editPhoneNumber");
//        String topUp = TestDataHandler.planData.getPlanData().get(0).get("topUp");
//        String firstName = TestDataHandler.customerData.getCustomerData().get(3).get("firstName");
//        String lastName = TestDataHandler.customerData.getCustomerData().get(3).get("lastName");
//        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
//        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
//        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
//        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
//
//        getHeaderComponent().clickSignIn();
//        getTopUpFormPage().validateInValidPhoneNumber(phoneNumber2);
//        getTopUpFormPage().validatePhoneNumber(phoneNumber);
//        getTopUpFormPage().clickContinueButtonPhoneNumber();
//        getTopUpFormPage().validateEditButtonForPhoneNumber(editphoneNumber);
//        getTopUpFormPage().selectPaymentMethod("Credit Card");
//        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
//        getTopUpFormPage().setNames(firstName, lastName);
//        getTopUpFormPage().setAddress(city);
//        getTopUpFormPage().clickContinueButtonPaymentMethod();
//        getTopUpFormPage().validateEditButtonForPaymentMethod();
//        getTopUpFormPage().clickContinueButtonPaymentMethod();
//      }
//    @Test(groups = {"ATPCC","EAS", "qa1", "E2E"})
//    public void CPP_30293_ValidateTopupSummaryPageCheckboxError() {
//        String username = TestDataHandler.accountData.getAccountData().get(0).get("username");
//        String password = TestDataHandler.accountData.getAccountData().get(0).get("password");
//        String topUp = TestDataHandler.planData.getPlanData().get(2).get("topUp");
//        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
//        String topup = TestDataHandler.planData.getPlanData().get(2).get("topUp");
//        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(3).get("phoneNumber");
//        getHeaderComponent().clickTopUp();
//        getTopUpPage().clickSignInNow();
//        getSignInPage().signIn(username, password);
//        getHeaderComponent().clickTopUp();
//        getTopUpFormPage().selectPaymentMethod("Credit");
//        getTopUpFormPage().completeSecondStepTopUpForm(topUp);
//        getTopUpFormPage().confirmPaymentInfo(phoneNumber, creditCard, topup);
//        getTopUpFormPage().clickOnContinueConfirmPayment();
//        getTopUpFormPage().validateCheckboxError();
//    }
    /*@Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_34859_Validate_authenticated_top_up_from_CPP_Digital_for_active_subscription_SS() {
        String username = TestDataHandler.accountData.getAccountData().get(3).get("username");
        String password = TestDataHandler.accountData.getAccountData().get(3).get("password");
        String topup = TestDataHandler.planData.getPlanData().get(3).get("topUp");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getAccountManagementPage().validateAccountBalanceDetails();
        getAccountManagementPage().validateAccountStatusDetails("Active");
        getHeaderComponent().clickTopUp();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().fillCreditCardInfo(topup, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickOnContinuePaymentMethod();
        getTopUpFormPage().checkAuthorizeCheckbox();
        getTopUpFormPage(). clickOnContinueConfirmPayment();
        getHeaderComponent().clickOnMyChatr();
        getCarePortalDashBoard().validateAccountStatusDetails();
        getCarePortalDashBoard().validateAccountBalanceDetails();
    }
    @Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_34860_Validate_authenticated_top_up_from_CPP_Digital_for_Expired_subscription_SS() {
        String username = TestDataHandler.accountData.getAccountData().get(6).get("username");
        String password = TestDataHandler.accountData.getAccountData().get(6).get("password");
        String topup = TestDataHandler.planData.getPlanData().get(3).get("topUp");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");

        getHeaderComponent().clickTopUp();
        getTopUpPage().clickSignInNow();
        getSignInPage().signInEas(username, password);
        getAccountManagementPage().validateAccountBalanceDetails();
        getAccountManagementPage().validateAccountStatusDetails("inactive");
        getHeaderComponent().clickTopUp();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().fillCreditCardInfo(topup, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickOnContinuePaymentMethod();
        getTopUpFormPage().checkAuthorizeCheckbox();
        getTopUpFormPage(). clickOnContinueConfirmPayment();
        getHeaderComponent().clickOnMyChatr();
        getCarePortalDashBoard().validateAccountStatusDetails();
        getCarePortalDashBoard().validateAccountBalanceDetails();
    }*/
    @Test(groups = {"ATPCC","EAS","qa1","Sanity","DAYONE"})
    public void CPP_e2e_24168_Validate_Topup_Payment_Unsaved_Credit_Card(){
        String usernameNoCard = TestDataHandler.atpData.getAtpData().get(0).get("username");
        String passwordNoCard = TestDataHandler.atpData.getAtpData().get(0).get("password");
        String city = TestDataHandler.atpData.getAtpData().get(0).get("city");
        String creditCard = TestDataHandler.atpData.getAtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.atpData.getAtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.atpData.getAtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.atpData.getAtpData().get(0).get("topUp");
        String firstName = TestDataHandler.atpData.getAtpData().get(0).get("firstName");
        String lastName = TestDataHandler.atpData.getAtpData().get(0).get("lastName");
        String phoneNumber = TestDataHandler.atpData.getAtpData().get(0).get("phoneNumber");

        getHeaderComponent().clickSignIn();
        //getSignInPage().signInEasFromExcel("NOCC");
        getSignInPage().signInEas(usernameNoCard, passwordNoCard);
        getHeaderComponent().clickTopUp();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickOnContinuePaymentMethod();
        getTopUpFormPage().checkAuthorizeCheckbox();
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().verifyReceipt(phoneNumber, creditCard, topUp);
    }
    @Test(groups = {"ATPCC","EAS", "qa1", "DAYONE","SS","P1","ATOPUP"})
    public void CPP_30916_ValidateTopUp_InternationalCreditCard() {
        String usernameNoCard = TestDataHandler.atpData.getAtpData().get(0).get("username");
        String passwordNoCard = TestDataHandler.atpData.getAtpData().get(0).get("password");
        String creditCard = TestDataHandler.atpData.getAtpData().get(1).get("cardNumber");
        String cvv = TestDataHandler.atpData.getAtpData().get(1).get("cvv");
        String expiryDate = TestDataHandler.atpData.getAtpData().get(1).get("expiryDate");
        String topUp = TestDataHandler.atpData.getAtpData().get(0).get("topUp");
        String firstName = TestDataHandler.atpData.getAtpData().get(0).get("firstName");
        String lastName = TestDataHandler.atpData.getAtpData().get(0).get("lastName");
        String phoneNumber = TestDataHandler.atpData.getAtpData().get(0).get("phoneNumber");
        String postalCode = TestDataHandler.atpData.getAtpData().get(1).get("postalCode");
        String province = TestDataHandler.atpData.getAtpData().get(1).get("provinceFullName");
        String city = TestDataHandler.atpData.getAtpData().get(1).get("city");
        String country = TestDataHandler.atpData.getAtpData().get(1).get("country");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(usernameNoCard, passwordNoCard);
        getHeaderComponent().clickTopUp();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getSimPage().selectOtherBillingAddress("Other Countries");
        getTopUpFormPage().setNames(firstName,lastName);
        getTopUpFormPage().selectCountry(country);
        getTopUpFormPage().setManuallyBillingAddressOtherCountry("Auto Test",city,postalCode,province);
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().checkAuthorizeCheckbox();
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().verifyReceipt(phoneNumber, creditCard, topUp);
    }
    @Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_26954_Validate_Footer_TopUp_Payment_Unsaved_Credit_Card() {
        String usernameNoCard = TestDataHandler.atpData.getAtpData().get(0).get("username");
        String passwordNoCard = TestDataHandler.atpData.getAtpData().get(0).get("password");
        String city = TestDataHandler.atpData.getAtpData().get(0).get("city");
        String creditCard = TestDataHandler.atpData.getAtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.atpData.getAtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.atpData.getAtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.atpData.getAtpData().get(0).get("topUp");
        String firstName = TestDataHandler.atpData.getAtpData().get(0).get("firstName");
        String lastName = TestDataHandler.atpData.getAtpData().get(0).get("lastName");
        String phoneNumber = TestDataHandler.atpData.getAtpData().get(0).get("phoneNumber");
        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(usernameNoCard, passwordNoCard);
        getHeaderComponent().clickTopUpCTA();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickOnContinuePaymentMethod();
        getTopUpFormPage().checkAuthorizeCheckbox();
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().verifyReceipt(phoneNumber, creditCard, topUp);
    }

    @Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_26951_Validate_Topup_Payment_Saved_Credit_Card() {
        String username = TestDataHandler.atpData.getAtpData().get(1).get("username");
        String password = TestDataHandler.atpData.getAtpData().get(1).get("password");
        String creditCard = TestDataHandler.atpData.getAtpData().get(0).get("cardNumber");
        String topUp = TestDataHandler.atpData.getAtpData().get(0).get("topUp");
        String phoneNumber = TestDataHandler.atpData.getAtpData().get(1).get("phoneNumber");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getHeaderComponent().clickTopUp();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().completeSecondStepTopUpForm(topUp);
        getTopUpFormPage().validateReviewPage(creditCard,phoneNumber);
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().verifyReceipt(phoneNumber, creditCard, topUp);
    }
    @Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_29292_e2e_Validate_Topup_Payment_Saved_Credit_Card_NewPaymentStart() {
        String username = TestDataHandler.atpData.getAtpData().get(1).get("username");
        String password = TestDataHandler.atpData.getAtpData().get(1).get("password");
        String creditCard = TestDataHandler.atpData.getAtpData().get(0).get("cardNumber");
        String topUp = TestDataHandler.atpData.getAtpData().get(0).get("topUp");
        String phoneNumber = TestDataHandler.atpData.getAtpData().get(1).get("phoneNumber");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getHeaderComponent().clickTopUp();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().completeSecondStepTopUpForm(topUp);
        getTopUpFormPage().validateReviewPage(creditCard,phoneNumber);
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().verifyReceipt(phoneNumber, creditCard, topUp);
        getTopUpFormPage().clickNewTopUp();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().completeSecondStepTopUpForm(topUp);
        getTopUpFormPage().validateReviewPage(creditCard,phoneNumber);
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().verifyReceipt(phoneNumber, creditCard, topUp);
    }

    @Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_27636_ValidateTopUpAmountExceedsBalanceLimit$300() {
        String usernameNoCard = TestDataHandler.atpData.getAtpData().get(0).get("username");
        String passwordNoCard = TestDataHandler.atpData.getAtpData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(usernameNoCard, passwordNoCard);
        getHeaderComponent().clickTopUp();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().validateTopUpAmountMoreThan$300("301");
        //getTopUpFormPage().validateAccountBalanceExceed();
    }

    @Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_27913_validateConfirm_Payment_summary_AuthenticatedTopup_Flow() {
        String usernameNoCard = TestDataHandler.atpData.getAtpData().get(0).get("username");
        String passwordNoCard = TestDataHandler.atpData.getAtpData().get(0).get("password");
        String city = TestDataHandler.atpData.getAtpData().get(0).get("city");
        String creditCard = TestDataHandler.atpData.getAtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.atpData.getAtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.atpData.getAtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.atpData.getAtpData().get(0).get("topUp");
        String firstName = TestDataHandler.atpData.getAtpData().get(0).get("firstName");
        String lastName = TestDataHandler.atpData.getAtpData().get(0).get("lastName");
        String phoneNumber = TestDataHandler.atpData.getAtpData().get(0).get("phoneNumber");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(usernameNoCard, passwordNoCard);
        getHeaderComponent().clickTopUp();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickOnContinuePaymentMethod();
        getTopUpFormPage().validateReviewPage(creditCard,phoneNumber);
    }

    @Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_27645_validate_Authenticated_BillingAddress_Override() {
        String usernameNoCard = TestDataHandler.atpData.getAtpData().get(0).get("username");
        String passwordNoCard = TestDataHandler.atpData.getAtpData().get(0).get("password");
        String city = TestDataHandler.atpData.getAtpData().get(0).get("city");
        String creditCard = TestDataHandler.atpData.getAtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.atpData.getAtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.atpData.getAtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.atpData.getAtpData().get(0).get("topUp");
        String firstName = TestDataHandler.atpData.getAtpData().get(0).get("firstName");
        String lastName = TestDataHandler.atpData.getAtpData().get(0).get("lastName");
        String phoneNumber = TestDataHandler.atpData.getAtpData().get(0).get("phoneNumber");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(usernameNoCard, passwordNoCard);
        getHeaderComponent().clickTopUp();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().addressClear();
        getTopUpFormPage().setAddress("Ontario");
        getTopUpFormPage().clickOnContinuePaymentMethod();
        getTopUpFormPage().validateReviewPage(creditCard,phoneNumber);
    }

    @Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_27616_SuggestTopUp_AmountShouldNot_Display() {
        String usernameNoCard = TestDataHandler.atpData.getAtpData().get(0).get("username");
        String passwordNoCard = TestDataHandler.atpData.getAtpData().get(0).get("password");
        String city = TestDataHandler.atpData.getAtpData().get(0).get("city");
        String creditCard = TestDataHandler.atpData.getAtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.atpData.getAtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.atpData.getAtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.atpData.getAtpData().get(0).get("topUp");
        String firstName = TestDataHandler.atpData.getAtpData().get(0).get("firstName");
        String lastName = TestDataHandler.atpData.getAtpData().get(0).get("lastName");
        String phoneNumber = TestDataHandler.atpData.getAtpData().get(0).get("phoneNumber");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(usernameNoCard, passwordNoCard);
        getHeaderComponent().clickTopUp();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickOnContinuePaymentMethod();
        getTopUpFormPage().validateReviewPage(creditCard,phoneNumber);
    }

    @Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_27618_validateCustomer_CanAble_toSee_InformationAboutSuggestedAmount() {
        String username = TestDataHandler.atpData.getAtpData().get(0).get("username");
        String password = TestDataHandler.atpData.getAtpData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getHeaderComponent().clickTopUp();
        getPaymentPage().waitForPaymentPageLoad();
        //getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().clickOnPaymentInfoIcon();
        getTopUpFormPage().validatePaymentInfo();
    }

    @Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_29064_Authenticated_Topup_Payment_CheckBoxNotChecked() {
        String usernameNoCard = TestDataHandler.atpData.getAtpData().get(0).get("username");
        String passwordNoCard = TestDataHandler.atpData.getAtpData().get(0).get("password");
        String city = TestDataHandler.atpData.getAtpData().get(0).get("city");
        String creditCard = TestDataHandler.atpData.getAtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.atpData.getAtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.atpData.getAtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.atpData.getAtpData().get(0).get("topUp");
        String firstName = TestDataHandler.atpData.getAtpData().get(0).get("firstName");
        String lastName = TestDataHandler.atpData.getAtpData().get(0).get("lastName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("NOCC");
        getHeaderComponent().clickTopUp();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickOnContinuePaymentMethod();
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().validateCheckboxErrorMessage();
    }

    @Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_26958_Validate_Payment_Method_FR() {
        String usernameNoCard = TestDataHandler.atpData.getAtpData().get(0).get("username");
        String passwordNoCard = TestDataHandler.atpData.getAtpData().get(0).get("password");
        String city = TestDataHandler.atpData.getAtpData().get(0).get("city");
        String creditCard = TestDataHandler.atpData.getAtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.atpData.getAtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.atpData.getAtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.atpData.getAtpData().get(0).get("topUp");
        String firstName = TestDataHandler.atpData.getAtpData().get(0).get("firstName");
        String lastName = TestDataHandler.atpData.getAtpData().get(0).get("lastName");
        String phoneNumber = TestDataHandler.atpData.getAtpData().get(0).get("phoneNumber");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(usernameNoCard, passwordNoCard);
        getHeaderComponent().changeLanguage("French");
        getTopUpFormPage().clickNewTopUFrench();
        getTopUpFormPage().clickCreditCardFrench();
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickOnContinuePaymentMethod();
        getTopUpFormPage().checkServiceAgreementFrenchCheckbox();
        getTopUpFormPage().validateReviewPageFrench(creditCard,phoneNumber);
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().verifyReceiptFrench(phoneNumber, creditCard, topUp);
    }
    @Test(groups = {"ATPCC","EAS", "DAYONE","qaAuto"})
    public void CPP_34802_Validate_Successful_Log_in_EAS_validates_then_back_to_CPP_when_accepted() {
        String usernameNoCard = TestDataHandler.atpData.getAtpData().get(0).get("username");
        String passwordNoCard = TestDataHandler.atpData.getAtpData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("NOCC");
        getAccountManagementPage().validateMyChatrOnDashBoard();
        getAccountManagementPage().validateAccountBalanceDetails();
        getAccountManagementPage().validateAccountStatusDetails("Active");
        getAccountManagementPage().validateAnniversaryDetails();
        getAccountManagementPage().validateAutoPayBlock();
    }
    @Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_26166_validate_Topup_Payment_RefreshPage() throws AWTException {
        String usernameNoCard = TestDataHandler.atpData.getAtpData().get(0).get("username");
        String passwordNoCard = TestDataHandler.atpData.getAtpData().get(0).get("password");
        String city = TestDataHandler.atpData.getAtpData().get(0).get("city");
        String creditCard = TestDataHandler.atpData.getAtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.atpData.getAtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.atpData.getAtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.atpData.getAtpData().get(0).get("topUp");
        String firstName = TestDataHandler.atpData.getAtpData().get(0).get("firstName");
        String lastName = TestDataHandler.atpData.getAtpData().get(0).get("lastName");
        String phoneNumber = TestDataHandler.atpData.getAtpData().get(0).get("phoneNumber");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(usernameNoCard, passwordNoCard);
        getHeaderComponent().clickTopUp();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickOnRefreshPage();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickOnContinuePaymentMethod();
        getTopUpFormPage().validateReviewPage(creditCard,phoneNumber);
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().verifyReceipt(phoneNumber, creditCard, topUp);
    }
    @Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_30937_Validate_Adding_extra_money() {
        String usernameNoCard = TestDataHandler.atpData.getAtpData().get(0).get("username");
        String passwordNoCard = TestDataHandler.atpData.getAtpData().get(0).get("password");

        /*getHeaderComponent().clickSignIn();
        //getSignInPage().signInEas(usernameNoCard, passwordNoCard);
        getSignInPage().signInEasFromExcel("Active1");
        getTopUpFormPage().clickAutoPayEnrollLink();
        getTopUpFormPage().fillAutoPayTopUpAmount("300");
        getTopUpFormPage().validateAutoPayTopUpAmountMoreThan$300();*/
        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("Active1");
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney("40");
        getAutoPay().validateAddExtranMoneyInEnrollPage();
    }
    @Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_26169_ValidateRefreshPageUnSavedCard() throws AWTException {
        String usernameNoCard = TestDataHandler.atpData.getAtpData().get(0).get("username");
        String passwordNoCard = TestDataHandler.atpData.getAtpData().get(0).get("password");
        String city = TestDataHandler.atpData.getAtpData().get(0).get("city");
        String creditCard = TestDataHandler.atpData.getAtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.atpData.getAtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.atpData.getAtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.atpData.getAtpData().get(0).get("topUp");
        String firstName = TestDataHandler.atpData.getAtpData().get(0).get("firstName");
        String lastName = TestDataHandler.atpData.getAtpData().get(0).get("lastName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("NOCC");
        getHeaderComponent().clickTopUp();
        getTopUpFormPage().validatePopulateCTN();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().waitForPaymentPageLoad();
        //getTopUpFormPage().selectAnotherCard();
        getTopUpFormPage().fillCreditCardInfo(topUp,creditCard,cvv,expiryDate);
        getTopUpFormPage().setNames(firstName,lastName);
        getTopUpFormPage().setAddress(city);
        //getTopUpFormPage().clickOnContinuePaymentMethod();
        getTopUpFormPage().acceptRefreshPage();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().validateSavedDataErased();
        getTopUpFormPage().validateSavedDataErasedCreditCard();
        getTopUpFormPage().validateSavedDataErasedAddress();
    }
    @Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_27615_validate_SuggestedTopup_NonAutopayCustomer() {
        String usernameNoCard = TestDataHandler.atpData.getAtpData().get(0).get("username");
        String passwordNoCard = TestDataHandler.atpData.getAtpData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        //getSignInPage().signInEas(usernameNoCard, passwordNoCard);
        getSignInPage().signInEasFromExcel("NOCC");
        getHeaderComponent().clickTopUp();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().validatePaymentInfotopup();
    }
    @Test(groups = {"ATPCC","EAS", "DAYONE", "qaAuto"})
    public void CPP_27656_validate_alertInfo_forExpiredAccount() {
        String usernameNoCard = TestDataHandler.atpData.getAtpData().get(0).get("username");
        String passwordNoCard = TestDataHandler.atpData.getAtpData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(usernameNoCard, passwordNoCard);
        getHeaderComponent().clickTopUp();
        getTopUpFormPage().selectPaymentMethod("Credit");
    }
}
