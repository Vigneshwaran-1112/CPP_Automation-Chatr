package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

public class AccountManagementVoucher_Test extends BaseTest {
    @Test(groups = {"ACCTMGTVCR","EAS", "qaAuto", "DAYTWO"})
    public void CPP_29091_ValidateDeleteCreditCard_NotAssociatedWithAutoPay() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
        String creditCard = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cardNumber");
        String cvv = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cvv");
        String expiryDate = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("expiryDate");
        String firstName = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("firstName");
        String lastName = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("lastName");
        String city = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("city");

        getHeaderComponent().clickSignIn();
        //getSignInPage().signInEas(username, password);
        getSignInPage().signInEasFromExcel("ACTCC");
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().goToManageSavedCards();
        getAccountManagementPage().clickAddCard();
        getAccountManagementPage().setCardDetails(creditCard, expiryDate, cvv);
        getAccountManagementPage().setName(firstName, lastName);
        getAccountManagementPage().setAddress(city);
        getAccountManagementPage().clickSave();
        getAccountManagementPage().validateCardIsPresent();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().goToManageSavedCards();
        getAccountManagementPage().clickOnDeleteSavedCard();
        getAccountManagementPage().validateConfirmDeleteModal();
        getAccountManagementPage().clickOnNoCancel();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().validateSavedCardsText();
        int countCC = getAccountManagementPage().getCardCountPresent();
        getAccountManagementPage().clickOnDeleteSavedCard();
        getAccountManagementPage().validateConfirmDeleteModal();
        getAccountManagementPage().clickOnYesConfirm();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().validateCardIsNotPresent(countCC);
    }
    @Test(groups = {"ACCTMGTVCR","EAS", "qaAuto", "DAYTWO"})
    public void CPP_29092_ValidateDeleteCreditCard_NoChanges() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        getHeaderComponent().clickSignIn();
       // getSignInPage().signInEas(username, password);
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().goToManageSavedCards();
        getPaymentPage().waitForPaymentPageLoad();
        int countCC = getAccountManagementPage().getCardCountPresent();
        getAccountManagementPage().clickOnDeleteSavedCard();
        getAccountManagementPage().validateConfirmDeleteModal();
        getAccountManagementPage().clickOnNoCancel();
        getAccountManagementPage().validateSavedCardsText();
        getAccountManagementPage().validateCardIsPresentCnt(countCC);
    }
    @Test(groups = {"ACCTMGTVCR","EAS","DAYTWO","qaAuto","pfour","filter"})
    public void CPP_37259_Validate_View_Shopping_Cart_when_Proration_is_added_3_days_from_last_MSF_charge_100_of_the_MSF_is_to_be_prorated_AC04() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
        String planTab = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getAccountManagementPage().clickOnCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        getAccountManagementPage().clickOnchangePlan();
        // getPlanPage().ppcSelectPlanTab(planTab);
       // getPlanPage().selectPlan("25");
        String higherAvailablePlan = getPlanPage().findHigherAvailable4GPlan(CurrentMSF);
        getPlanPage().selectPlan(higherAvailablePlan);
        getPlanPage().validateProrationAdjustmentSummaryDisplay();
        getPlanPage().clickOnContinueAddon();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPlanPage().clickOnContinueAddon();
        //getPlanPage().clickOnContinueAddon();
//        getAccountManagementPage().clickOnAutoPayCheckBox();
//        getPlanPage().clickOnContinueAddon();
//        getTopUpFormPage().checkServiceAgreementCheckboxSS();
//        getTopUpFormPage().checkAuthorizeCheckboxSS();
//        getPlanPage().clickOnContinueAddon();
//        getReviewOrderPage().waitForReviewOrderPageLoad();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getHeaderComponent().validatePPEOrderReview();
    }
    @Test(groups = {"ACCTMGTVCR","EAS","DAYTWO","qaAuto","pfour","filter"})
    public void CPP_37266_Validate_Retrieve_records_by_Status() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(7).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(7).get("password");

        getHeaderComponent().clickSignIn();
        //getSignInPage().signInEas(username, password);
        getSignInPage().signInEasFromExcel("ORDER");
  //      getAccountManagementPage().clickOnProfileTab();
//        getAccountManagementPage().clickOnHistoryReports();
//        getCarePortalDashBoard().switchToLatestTab();
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Payment");
        getHistoryReportsPage().navigateToFilters("type");
        getHistoryReportsPage().navigateToFilters("ll");
    }
    @Test(groups = {"ACCTMGTVCR","EAS","DAYTWO","qaAuto","run"})
    public void CPP_37277_verify_customer_is_able_to_view_account_status_block_on_My_chatr_tab() {

        getHeaderComponent().clickSignIn();
        //getSignInPage().signInEas(username, password);
        getSignInPage().signInEasFromExcel("INACTIVE");
        getAccountManagementPage().validateMyChatrOnDashBoard();
        getAccountManagementPage().validateAccountBalanceDetails();
        getAccountManagementPage().validateAccountStatusDetails("Inactive");
    }
    @Test(groups = {"ACCTMGTVCR","EAS","DAYTWO","qaAuto","run","SS","P1","DASH"})
    public void CPP_37286_View_addons_usage_block() {


        getHeaderComponent().clickSignIn();
        //getSignInPage().signInEas(username, password);
        getSignInPage().signInEasFromExcel("MAX");
       // getAccountManagementPage().validateMyChatrOnDashBoard();
        getAccountManagementPage().validateAddOnsBlock();
    }
    @Test(groups = {"ACCTMGTVCR","EAS", "DAYTWO","qaAuto","EAS"})
    public void CPP_37521_SS_Validate_in_MAO_Top_up_card_PIN_format_is_incorrect() {
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");

        getHeaderComponent().clickSignIn();
        //getSignInPage().signInEas(username, password);
        getSignInPage().signInEasFromExcel("UNENROLL");
       /* getHeaderComponent().clickTopUpFooterCTA();
        getCarePortalDashBoard().switchToLatestTab();*/
        getHeaderComponent().clickTopUp();
        getAccountManagementPage().clickCreditCardRadioBtn("Topup");
        //getAccountManagementPage().enterValidTopUpVoucher("12345678901");
        getAccountManagementPage().enterValidTopUpVoucherSS("12345678901");
        getPaymentPage().validateinvalidvouchererror();

    }
    @Test(groups = {"ACCTMGTVCR","EAS","qaAuto", "DAYTWO", "payment"})
    public void CPP_37289_Validate_autopay_bonus_usage_block_Expired_Account() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(4).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(4).get("password");

        getHeaderComponent().clickSignIn();
        //getSignInPage().signInEas(username, password);
        getSignInPage().signInEasFromExcel("INACTIVE");
        getCarePortalDashBoard().validateAccountStatusDetails("Inactive");
        getCarePortalDashBoard().validateAutopayBlock();
    }
    @Test(groups = {"ACCTMGTVCR","ONETONE","qaAuto","EAS"})
    public void CPP_37236_SS_Validate_Error_Message_When_Tryingto_Use_Top_Up_Card_Payment_Method_Within_24_Hours_When_Customer_Is_Barred() {

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLL");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().validateAccountInsufficientBalance();
        getAccountManagementPage().clickCreditCardRadioBtn("Topup");
        getPaymentPage().validateInvalidVoucherPin();
        getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getHeaderComponent().validateCreditCardRadioBtnIsSelected();

        //getSignInPage().signInEas(username, password);
//        getSignInPage().signInEasFromExcel("PRORAT");
//        getHeaderComponent().clickTopUpFooterCTA();
//        getCarePortalDashBoard().switchToLatestTab();
//        getAccountManagementPage().clickCreditCardRadioBtn("Topup");
//        getAccountManagementPage().enterValidTopUpVoucherSS("12345698765");
//        getPaymentPage().validateinvalidvouchererror();

    }
    @Test(groups = {"ACCTMGTVCR", "ONETOONE","qaAuto","EAS"})
    public void CPP_37238_SS_Validate_in_MAO_Top_up_card_PIN_format_is_incorrect() {
       /* getHeaderComponent().clickSignIn();*/
//        getHeaderComponent().clickTopUpFooterCTA();
//        getCarePortalDashBoard().switchToLatestTab();
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().validatePhoneNumber("4168176616");
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Voucher");
       // getAccountManagementPage().clickCreditCardRadioBtn("Topup");
        getAccountManagementPage().enterValidTopUpVoucherSS("12345698765");
        getPaymentPage().validateinvalidvouchererror();
    }
    @Test(groups = {"ACCTMGTVCR", "ONETOONE","qaAuto","EAS"})
    public void CPP_37235_Validate_Error_message_when_Invalid_Top_up_card_PIN_is_entered_3_times_consecutively() {

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PRORAT");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
       //getPlanPage().ppcSelectPlanTab(planTab);
        // getPlanPage().selectPlan(higherAvailablePlan);
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().validateAccountInsufficientBalance();
        getAccountManagementPage().clickCreditCardRadioBtn("Topup");
        getPaymentPage().validateInvalidVoucherPin();
    }

}
