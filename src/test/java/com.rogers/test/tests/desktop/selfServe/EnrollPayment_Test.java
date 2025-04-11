package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;

public class EnrollPayment_Test extends BaseTest {

    /*
    @Test(groups = {"qaAuto", "EAS", "AutoPay"})
    public void CPP_32037_ValidateExtraMoneyAutopayEnroll() {
        String username = TestDataHandler.accountData.getAccountData().get(6).get("username");
        String password = TestDataHandler.accountData.getAccountData().get(6).get("password");
        String extraMoney = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String maxExtraMoney = TestDataHandler.planData.getPlanData().get(1).get("topUp");

        getHeaderComponent().clickSignIn();
        getSignInPage().signIn(username, password);
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().validateAddExtraMoneyError(maxExtraMoney);
        getAutoPay().validateEnrollAutoPayScreen();
    }
    @Test(groups = {"qaAuto", "EAS", "AutoPay"})
    public void CPP_32039_ValidateExtraMoneyAutopayEnrollPaymentPage() {
        String username = TestDataHandler.accountData.getAccountData().get(6).get("username");
        String password = TestDataHandler.accountData.getAccountData().get(6).get("password");
        String extraMoney = TestDataHandler.planData.getPlanData().get(0).get("topUp");

        getHeaderComponent().clickSignIn();
        getSignInPage().signIn(username, password);
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnProceed();
        getAutoPay().validatePaymentDetails();
        getAutoPay().validateStepper();
    }
    @Test(groups = {"qaAuto", "EAS", "AutoPay"})
    public void CPP_32481_ValidateSaveCreditCardErrorCheckbox() {
        String username = TestDataHandler.accountData.getAccountData().get(7).get("username");
        String password = TestDataHandler.accountData.getAccountData().get(7).get("password");
        String extraMoney = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");

        getHeaderComponent().clickSignIn();
        getSignInPage().signIn(username, password);
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnProceed();
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getAutoPay().setName(firstName, lastName);
        getAutoPay().setAddress(city);
        getAutoPay().clickOnProceed();
        getAutoPay().validateCheckboxError();

    }
    @Test(groups = {"qaAuto", "EAS", "AutoPay"})
    public void CPP__ValidateAddressEmptyFieldErrors() {
        String username = TestDataHandler.accountData.getAccountData().get(7).get("username");
        String password = TestDataHandler.accountData.getAccountData().get(7).get("password");
        String extraMoney = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");

        getHeaderComponent().clickSignIn();
        getSignInPage().signIn(username, password);
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnProceed();
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getAutoPay().clickOnProceed();
        getAutoPay().validateAddressErrors();
    }
    @Test(groups = {"qaAuto", "EAS", "AutoPay"})
    public void CPP_33343_ValidateEnrollmentReviewScreen() {
        String username = TestDataHandler.accountData.getAccountData().get(7).get("username");
        String password = TestDataHandler.accountData.getAccountData().get(7).get("password");
        String extraMoney = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");

        getHeaderComponent().clickSignIn();
        getSignInPage().signIn(username, password);
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnProceed();
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getAutoPay().setName(firstName, lastName);
        getAutoPay().setAddress(city);
        getAutoPay().clickOnSaveCardCheckbox();
        getAutoPay().clickOnProceed();
        getAutoPay().validateReviewPage();
        //starts flow to delete card
        getAutoPay().clickOnMyChatr();
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().goToManageSavedCards();
        getAccountManagementPage().clickOnDeleteSavedCard();
        getAccountManagementPage().validateConfirmDeleteModal();
        getAccountManagementPage().clickOnYesConfirm();
        getAccountManagementPage().validateCardIsNotPresent();
    }
    @Test(groups = {"qaAuto", "EAS", "AutoPay"})
    public void CPP__ValidateEditCTAOnReview() {
        String username = TestDataHandler.accountData.getAccountData().get(7).get("username");
        String password = TestDataHandler.accountData.getAccountData().get(7).get("password");
        String extraMoney = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");

        getHeaderComponent().clickSignIn();
        getSignInPage().signIn(username, password);
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnProceed();
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getAutoPay().setName(firstName, lastName);
        getAutoPay().setAddress(city);
        getAutoPay().clickOnSaveCardCheckbox();
        getAutoPay().clickOnProceed();
        getAutoPay().clickOnReviewStepOne();
        getAutoPay().validateEnrollAutoPayScreen();
        getAutoPay().clickOnProceed();
        getAutoPay().validateExistingCard();
        getAutoPay().clickOnProceed();
        getAutoPay().validateReviewPage();
        getAutoPay().clickOnReviewStepTwo();
        getAutoPay().validateExistingCard();
        getAutoPay().clickOnProceed();
        getAutoPay().validateReviewPage();
        getAutoPay().validateTermsAndConditions();
    }
    @Test(groups = {"qaAuto", "EAS", "AutoPay"})
    public void CPP_33342_ValidateBackModal() {
        String username = TestDataHandler.accountData.getAccountData().get(7).get("username");
        String password = TestDataHandler.accountData.getAccountData().get(7).get("password");
        String extraMoney = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");

        getHeaderComponent().clickSignIn();
        getSignInPage().signIn(username, password);
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnProceed();
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getAutoPay().setName(firstName, lastName);
        getAutoPay().setAddress(city);
        getAutoPay().clickOnSaveCardCheckbox();
        getAutoPay().clickOnBack();
        getAutoPay().validateBackModal();
    }
    @Test(groups = {"qaAuto", "EAS", "AutoPay"})
    public void CPP_34093_ValidateAddNewCard() {
        String username = TestDataHandler.accountData.getAccountData().get(7).get("username");
        String password = TestDataHandler.accountData.getAccountData().get(7).get("password");
        String extraMoney = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");

        getHeaderComponent().clickSignIn();
        getSignInPage().signIn(username, password);
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnProceed();
        getAutoPay().clickOnAddCard();
        getAutoPay().setPaymentInfoAddCard(creditCard, expiryDate, cvv);
        getAutoPay().setNameAddCard(firstName, lastName);
        getAutoPay().setAddressAddCard(city);
        getAutoPay().clickOnSaveCardCheckboxAddCard();
        getAutoPay().clickOnProceed();
        getAutoPay().validateReviewPage();
        //starts flow to delete card
        getAutoPay().clickOnMyChatr();
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().goToManageSavedCards();
        getAccountManagementPage().clickOnDeleteSavedCard();
        getAccountManagementPage().validateConfirmDeleteModal();
        getAccountManagementPage().clickOnYesConfirm();
        getAccountManagementPage().validateCardIsNotPresent();
    }*/
    @Test(groups = {"ENROLLT", "EAS", "AutoPay"})
    public void CPP_33309_Validate_User_Submit_Autopay_Enrollment_With_Selected_Terms_Conditions_Checkbox() throws InterruptedException {
        String extraMoney = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("topUp");
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("Bipin7");
        //getSignInPage().signInEas(username,password);
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnContinue();
        getAutoPay().validateSavedCreditCard();
        getAutoPay().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().validateReviewAutoPayPage();
        getAutoPay().validateTermsAndConditions();
        getAutoPay().clickOnContinue();
        getAutoPay().validateAutopaySucessfulMessage();
        /** EMAIL NOTIFICATION VALIDATION */
       /* getHeaderComponent().clickOnMyChatr();
        getCarePortalHomePage().refreshPage();
        getPaymentPage().waitForPaymentPageLoad();
        getCarePortalHomePage().refreshPage();
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        String orderId = getHistoryReportsPage().getLatestOrderIdForSS();
        getChampPage().accountLogOut("SS");
        getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();
        getChampPage().openNewTabInSameWindowForOutlook(orderId,"APE");*/
    }
    @Test(groups = {"ENROLLT", "EAS", "AutoPay"})
    public void CPP_33310_Validate_User_Submit_Autopay_Enrollment_Without_Selected_Terms_Conditions_Checkbox() {
//        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(11).get("username");
//        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(11).get("password");
        String extraMoney = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("topUp");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLL");
        getAutoPay().validateAutoPayUnEnroll();
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnContinue();
        getAutoPay().validateSavedCreditCard();
        getAutoPay().clickOnContinue();
        getAutoPay().validateReviewAutoPayPage();
        getAutoPay().clickOnContinue();
        getAutoPay().validateErrorMessage();
    }
    @Test(groups = {"ENROLLT", "EAS", "AutoPay"})
    public void CPP_33254_Validate_Newly_AddedCC_Proceed_To_Next_Step_No_Saved_CC_In_Account() throws AWTException {
//        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(11).get("username");
//        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(11).get("password");
        String extraMoney = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("topUp");
        String creditCard = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cardNumber");
        String cvv = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cvv");
        String expiryDate = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("expiryDate");
        String firstName = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("firstName");
        String lastName = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("lastName");
        String city = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("city");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("NOCCB");
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        //getAutoPay().clickOnAddCard();
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getAutoPay().setName(firstName, lastName);
        getAutoPay().setAddress(city);
        getAutoPay().clickOnSaveCardCheckbox();
        getAutoPay().clickOnContinue();
        getAutoPay().validateReviewAutoPayPage();
    }
    @Test(groups = {"ENROLLT", "EAS", "AutoPay"})
    public void CPP_33255_Validate_Newly_AddedCC_Proceed_To_Next_Step_Saved_CC_In_Account(){
//        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(11).get("username");
//        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(11).get("password");
        String extraMoney = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("topUp");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("UNENROLL");
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnContinue();
        getAutoPay().validateSavedCreditCard();
        getAutoPay().clickOnContinue();
        getAutoPay().validateReviewAutoPayPage();
    }
    @Test(groups = {"ENROLLT", "EAS", "AutoPay"})
    public void CPP_33259_Validate_Unsaved_Changes_Detail_When_Customer_Click_Stay_On_Page(){
//        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(11).get("username");
//        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(11).get("password");
        String extraMoney = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("topUp");
        String creditCard = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cardNumber");
        String cvv = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cvv");
        String expiryDate = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("expiryDate");
        String firstName = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("firstName");
        String lastName = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("lastName");
        String city = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("city");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("UNENROLL");
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().clickOnAddCard();
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getAutoPay().setName(firstName, lastName);
        getAutoPay().setAddress(city);
        getAutoPay().clickOnSaveCardCheckbox();
        getAutoPay().clickOnBack();
        getAutoPay().validateStayThisPageModal();
    }
    @Test(groups = {"ENROLLT", "EAS", "AutoPay"})
    public void CPP_33260_Validate_Unsaved_Changes_Detail_When_Customer_Click_Leave_Page(){
//        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(11).get("username");
//        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(11).get("password");
        String extraMoney = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("topUp");
        String creditCard = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cardNumber");
        String cvv = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cvv");
        String expiryDate = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("expiryDate");
        String firstName = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("firstName");
        String lastName = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("lastName");
        String city = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("city");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("UNENROLL");
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnContinue();
        //getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().clickOnAddCard();
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getAutoPay().setName(firstName, lastName);
        getAutoPay().setAddress(city);
        getAutoPay().clickOnSaveCardCheckbox();
        getAutoPay().clickOnBack();
        getAutoPay().validateLeaveThisPageModal();
    }
    @Test(groups = {"ENROLLT", "EAS", "AutoPay"})
    public void CPP_33249_Validate_System_Redirect_Customer_Reviewing_Autopay_Subscription_Selecting_Saved_CC_To_Enroll_For_Autopay(){
//        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(11).get("username");
//        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(11).get("password");
        String extraMoney = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("topUp");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("UNENROLL");
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnContinue();
        getAutoPay().validateSavedCreditCard();
        getAutoPay().clickOnContinue();
        getAutoPay().validateReviewAutoPayPage();
    }
    @Test(groups = {"ENROLLT", "EAS", "AutoPay"})
    public void CPP_33252_Validate_System_Displays_Error_Asking_User_Check_The_Checkbox_Proceed_Next_Step_No_Saved_CC_Account(){
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        String extraMoney = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("topUp");
        String creditCard = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cardNumber");
        String cvv = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cvv");
        String expiryDate = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("expiryDate");
        String firstName = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("firstName");
        String lastName = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("lastName");
        String city = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("city");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("UNENROLL");
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().clickOnAddCard();
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getAutoPay().setName("Auto", "Test");
        getAutoPay().setAddress(city);
        getAutoPay().clickOnContinue();
        getAutoPay().validateErrorMessageInPaymentPage();
    }
    @Test(groups = {"ENROLLT", "EAS", "AutoPay"})
    public void CPP_33299_Validate_UI_Anniversary_Date_More_Than_24_Hours_From_Initiation_Of_Autopay_Enrollment_By_The_User() throws AWTException {

        String extraMoney = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("topUp");
        String creditCard = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cardNumber");
        String cvv = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cvv");
        String expiryDate = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("expiryDate");
        String firstName = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("firstName");
        String lastName = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("lastName");
        String city = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("city");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("UNENROLL");
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnContinue();
        //getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().validateSavedCreditCard();
        //       getAutoPay().clickOnAddCard();
//        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
//        getAutoPay().setName(firstName, lastName);
//        getAutoPay().setAddress(city);
//        getAutoPay().clickOnSaveCardCheckbox();
        getAutoPay().clickOnContinue();
        getAutoPay().validateReviewAutoPayPage();
        getAutoPay().validateTermsAndConditions();
        getAutoPay().clickOnContinue();
        getAutoPay().validateAutopaySucessfulMessage();
        getAutoPay().validateAnniversaryDateGreaterThanAutoPayEnrollment();
        getAutoPay().clickOnMyChatr();
        getCarePortalHomePage().refreshPage();
        getCarePortalHomePage().refreshPage();
        getAutoPay().autoPayEnrollStatus();
        /*getAccountManagementPage().validateAnniversaryDetails();*/
       /* getAutoPay().unenrollAutopay();*/
    }

    /**
     * CPP-32994 Test Case Must Need 5 Saved Credit Card Account UserID
     */
    @Test(groups = {"ENROLLT", "EAS","SS","P1","AUTOPAY"})
    public void CPP_32994_Validate_User_Able_To_Enroll_Into_Autopay_Using_One_Of_Max_5_Saved_Credit_Cards() {
        String extraMoney = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("topUp");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("MAX");
        getAutoPay().enrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().clickOnContinue();
        //getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().validateSavedCreditCard();
        getAutoPay().validateAddCardTileNotPresent();
        getAutoPay().clickOnContinue();
        getAutoPay().validateReviewAutoPayPage();
    }

    }


