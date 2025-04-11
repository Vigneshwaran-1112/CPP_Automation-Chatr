package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.pages.ENSQuery;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class PPCTest extends BaseTest {

    /*@Test(groups = {"SSPPCT","DAYTHREE","qaAuto","EAS"})
    public void CPP_34866_Validate_PPC_Flow_including_add_on_in_Current_Plan(){
        String username = TestDataHandler.accountData.getAccountData().get(12).get("username");
        String password = TestDataHandler.accountData.getAccountData().get(12).get("password");
        String plan = TestDataHandler.planData.getPlanData().get(3).get("planValue");

        getHeaderComponent().clickSignIn();
        getSignInPage().signIn(username, password);
        getCarePortalDashBoard().validateAnniversaryDetails();
        getCarePortalDashBoard().validateAccountStatusDetails();
        getCarePortalDashBoard().validateAccountBalanceDetails();
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().ppcSelectPlanTab("3G Nation-Wide Talk, Text & Data");
        getPlanPage().selectPlan(plan);//select plan of 60
        getPlanPage().validateAddOnSelect();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getPPCPage().clickOnRadioButtonInPPC();
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnenrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForInsufficientBalance();
        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().validateOrderConfirmationPage();
        getHeaderComponent().clickOnMyChatr();
        getCarePortalDashBoard().validateAnniversaryDetails();
        getCarePortalDashBoard().validateAccountStatusDetails();
        getCarePortalDashBoard().validateAccountBalanceDetails();
    }
    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","EAS"})
    public void CPP_34867_Validate_PPC_Flow_not_add_on_added_in_Current_Plan(){
        String username = TestDataHandler.accountData.getAccountData().get(12).get("username");
        String password = TestDataHandler.accountData.getAccountData().get(12).get("password");
        String plan = TestDataHandler.planData.getPlanData().get(3).get("planValue");

        getHeaderComponent().clickSignIn();
        getSignInPage().signIn(username, password);
        getCarePortalDashBoard().validateAnniversaryDetails();
        getCarePortalDashBoard().validateAccountStatusDetails();
        getCarePortalDashBoard().validateAccountBalanceDetails();
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().ppcSelectPlanTab("3G Nation-Wide Talk, Text & Data");
        getPlanPage().selectPlan(plan); //select plan of 60
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getPPCPage().clickOnRadioButtonInPPC();
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnenrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForInsufficientBalance();
        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().validateOrderConfirmationPage();
        getHeaderComponent().clickOnMyChatr();
        getCarePortalDashBoard().validateAnniversaryDetails();
        getCarePortalDashBoard().validateAccountStatusDetails();
        getCarePortalDashBoard().validateAccountBalanceDetails();
    }*/
    /*

        @Test(groups = {"SSPPCT","DAYTHREE","qaAuto"})
    public void CPP_29008_Validate_E2E_PPC_Flow_with_Sufficient_Balance(){
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signIn(username, password);
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnenrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditions();
        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().validateOrderConfirmationPage();
    }
    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto"})
    public void CPP_29009_Validate_E2E_PPC_Flow_Higher_Value_insufficient_Account_Balance(){
        String username = TestDataHandler.accountData.getAccountData().get(3).get("username");
        String password = TestDataHandler.accountData.getAccountData().get(3).get("password");
        String plan = TestDataHandler.planData.getPlanData().get(3).get("planValue");

        getHeaderComponent().clickSignIn();
        getSignInPage().signIn(username, password);
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().ppcSelectPlanTab("3G Nation-Wide Talk, Text & Data");
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getPPCPage().clickOnRadioButtonInPPC();
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnenrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForInsufficientBalance();
        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().validateOrderConfirmationPage();
        getHeaderComponent().clickOnMyChatr();
        getCarePortalDashBoard().validateAnniversaryDetails();
        getCarePortalDashBoard().validateAccountStatusDetails();
        getCarePortalDashBoard().validateAccountBalanceDetails();
    }
    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto"})
    public void CPP_29010_Validate_E2E_PPC_Flow_DownGrade_Lower_Value(){
        String username = TestDataHandler.accountData.getAccountData().get(0).get("username");
        String password = TestDataHandler.accountData.getAccountData().get(0).get("password");
        String plan = TestDataHandler.planData.getPlanData().get(4).get("planValue");

        getHeaderComponent().clickSignIn();
        getSignInPage().signIn(username, password);
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().ppcSelectPlanTab("3G Nation-Wide Talk, Text & Data");
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        //getPPCPage().clickOnTheTopUpOption();
        //getPPCPage().clickOnRadioButtonInPPC();
        //getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        //getAutoPay().clickOnEnrollAutopay();
        //getPPCPage().clickSaveCCOnAutoPay();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditions();
        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().validateOrderConfirmationPage();
        getHeaderComponent().clickOnMyChatr();
        getCarePortalDashBoard().validateAnniversaryDetails();
        getCarePortalDashBoard().validateAccountStatusDetails();
        getCarePortalDashBoard().validateAccountBalanceDetails();
    }

    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","EAS"})
    public void CPP_38936_Validate_E2E_PPC_from_CPP_digital_for_upgraded_plan_using_credit_card_SS(){
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("upGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(1).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForInsufficientBalance();
        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().validateOrderConfirmationPage();
        getHeaderComponent().clickOnMyChatr();
        getCarePortalDashBoard().validateAnniversaryDetails();
        getCarePortalDashBoard().validateAccountStatusDetailsPPC("Active");
        getCarePortalDashBoard().validateAccountBalanceDetails();
    }
    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","EAS"})
    public void CPP_34865_Validate_E2E_PPC_from_CPP_digital_for_downgraded_plan_using_credit_card_SS(){
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForInsufficientBalance();
        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().validateOrderConfirmationPage();
        getHeaderComponent().clickOnMyChatr();
        getCarePortalDashBoard().validateAnniversaryDetails();
        getCarePortalDashBoard().validateAccountStatusDetailsPPC("Active");
        getCarePortalDashBoard().validateAccountBalanceDetails();
    }

    @Test(groups = {"SSPPCT","EAS", "DAYTHREE","qaAuto","run"})
    public void CPP_27684_Validate_Mutually_Exclusive_add_on_removing_it_from_the_Plan_Change_selection() {
        String username = TestDataHandler.ppcData.getPpcData().get(2).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(2).get("password");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().addOnAddInCart();
        getPlanPage().addOnRemoveInCart();
    }*/

    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","EAS"})
    public void CPP_34823_Validate_agent_removes_the_selected_plan_and_adds_a_new_plan_again() {
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLLB");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
//        getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan("50");
        getPPCPage().RemoveSelectedPlan();
        getPlanPage().selectPlan("34");
        getPlanPage().validateProceedButton();
    }

    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","EAS"})
    public void CPP_39737_Validate_the_Taxes_in_the_Shopping_Cart_EN(){
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTCC");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
//        getPlanPage().ppcSelectPlanTab(planTab);
//        getPlanPage().selectPlan(plan);
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnEnrollAutoPay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().waitForPaymentPageLoad();
        getReviewOrderPage().validateTotalDueForPlan();
        getReviewOrderPage().validateTaxinShoppingCartReviewPage();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getReviewOrderPage().validateTaxinShoppingCartOrderCofirmationPage();
    }

    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","EAS"})
    public void CPP_39420_Validate_Extra_Money_in_the_Shopping_cart_Monthly_Service_Details_Payment_Details(){
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnEnrollAutoPay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().validateExtraMoneyAddInCart(extraMoney);
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","qaAuto","EAS","SS","P1","PPC"})
    public void CPP_39387_Validate_AutoPay_Section_in_OCP_where_Customer_Not_Enrolled(){
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("upGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("UNENROLL");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
//        getPlanPage().ppcSelectPlanTab(planTab);
//        getPlanPage().selectPlan(plan);
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getHeaderComponent().validateNoAutopayBonus();

    }


    @Test(groups = {"SSPPCT", "DAYTHREE","EAS"})

    public void CPP_34815_Verify_customer_is_shown_a_list_of_eligible_In_Market_plans_for_a_pre_selected_plan_type(){
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().validatePlanNotSelected();
        getPlanPage().validateProceedButton();
    }


    @Test(groups = {"SSPPCT", "DAYTHREE","EAS"})
    public void CPP_34818_Verify_customer_is_shown_a_list_of_eligible_In_Market_plans_for_a_pre_selected_plan_type(){
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().validatePlanDetailHiddenSection();
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","EAS"})
    public void CPP_34821_Verify_the_sections_when_a_PPC_plan_is_selected() {
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        /*getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().addOnAddInCart();
        getPlanPage().addOnRemoveInCart();
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","EAS"})
    public void CPP_34728_Validate_the_Shopping_Cart_And_the_sequence_of_its_sections() {
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("upGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        /*getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getOrderConfirmationPage().validateOrderConfirmationPage();
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","EAS"})
    public void CPP_34825_Validate_add_Extra_Money_with_New_CC(){
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("upGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");
        String creditCard = TestDataHandler.ppcData.getPpcData().get(0).get("cardNumber");
        String cvv = TestDataHandler.ppcData.getPpcData().get(0).get("cvv");
        String expiryDate = TestDataHandler.ppcData.getPpcData().get(0).get("expiryDate");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        /*getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        //getAutoPay().clickOnAddNewCC();
        getAutoPay().clickOnAddCard();
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().postalCodeResend();
        //getAutoPay().setExtraMoneyInPayment(extraMoney);
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnEnrollAutoPay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().validateExtraMoneyAddInCart(extraMoney);
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","EAS","SS","P1","PPC"})
    public void CPP_34824_Validate_add_Extra_Money_with_Saved_CC(){
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("upGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");
        String extraMoney2 = "20";

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("UNENROLL");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
//        getPlanPage().ppcSelectPlanTab(planTab);
//        getPlanPage().selectPlan(plan);
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getAutoPay().addExtraMoney(extraMoney);
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnEnrollAutoPay();
        getAutoPay().addExtraMoney(extraMoney2);
        getAutoPay().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().validateExtraMoneyAddInCart(extraMoney);
        getPaymentPage().validateAutopayExtraMoneyinReviewPage(extraMoney2);
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","EAS"})
    public void CPP_29135_Validate_the_Prepopulate_the_last_Extra_Money_amount_when_customer_is_already_enrolled_in_autopay() {
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("upGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTCC");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        /*getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnEnrollAutoPay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().validateExtraMoneyAddInCart(extraMoney);
        getAutoPay().validateExtraMoneyReflect(extraMoney);
        getAutoPay().validateAutoPayEnroll();
//        getPaymentPage().waitForPaymentPageLoad();
//        getReviewOrderPage().clickOnAutoPayCheckBox();
//        getAccountManagementPage().clickContinueBtn_MAO();
//        getAutoPay().validateExtraMoneyReflect(extraMoney);
//        getAutoPay().validateAutoPayEnroll();
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","EAS"})
    public void CPP_29136_Validate_Update_Extra_Money_amount_showing_user_previously_autopay_enrolled() {
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("upGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLLB");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        /*getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnEnrollAutoPay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().validateExtraMoneyAddInCart(extraMoney);
        getAutoPay().validateExtraMoneyReflect(extraMoney);
        /*getAutoPay().validateAutoPayEnroll();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().validateExtraMoneyReflect(extraMoney);
        int iextraMoney = Integer.parseInt(extraMoney) + 1;
        extraMoney = Integer.toString(iextraMoney);
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().validateAutoPayEnroll();*/
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","EAS","SS","PPC","P1"})
    public void CPP_30906_Validate_enroll_in_Autopay_while_doing_PPC_flow_If_the_customer_has_no_saved_Credit_cards_on_file() throws InterruptedException {
        String username = TestDataHandler.ppcData.getPpcData().get(1).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(1).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("planValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");
        String creditCard = TestDataHandler.ppcData.getPpcData().get(0).get("cardNumber");
        String cvv = TestDataHandler.ppcData.getPpcData().get(0).get("cvv");
        String expiryDate = TestDataHandler.ppcData.getPpcData().get(0).get("expiryDate");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("NOCC");
        getAccountManagementPage().clickOnCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        getAccountManagementPage().clickOnchangePlan();
        String lowerAvailablePlan = getPlanPage().findLowerAvailable4GPlan(CurrentMSF);
        getPlanPage().selectPlan(lowerAvailablePlan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnEnrollAutoPay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getAutoPay().clickOnSaveCardCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().validateAutoPayEnroll();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getOrderConfirmationPage().validateOrderConfirmationPage();
        getHeaderComponent().clickOnMyChatr();
        getCarePortalHomePage().refreshPage();
        /** EMAIL NOTIFICATION VALIDATION */
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        String orderId = getHistoryReportsPage().getLatestOrderIdForSS();
        getChampPage().accountLogOut("SS");
        getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();
        getChampPage().openNewTabInSameWindowForOutlook(orderId,"PPC");
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","EAS","SS","PPC","P1"})
  public void CPP_30907_Validate_Error_Message_For_Uncheck_Box_For_CC() {
        String username = TestDataHandler.ppcData.getPpcData().get(1).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(1).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("upGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");
        String creditCard = TestDataHandler.ppcData.getPpcData().get(0).get("cardNumber");
        String cvv = TestDataHandler.ppcData.getPpcData().get(0).get("cvv");
        String expiryDate = TestDataHandler.ppcData.getPpcData().get(0).get("expiryDate");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLL");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnEnrollAutoPay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().validateCheckboxError();

/*        getAutoPay().clickOnAddCard();
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        //getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getAutoPay().setExtraMoneyInPayment(extraMoney);
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnEnrollAutoPay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().validateCheckboxError();*/
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","EAS","SS","P1","AUTOPAY"})
    public void CPP_37584_Validate_Assign_CC_for_autopay() throws AWTException {
        String username = TestDataHandler.ppcData.getPpcData().get(1).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(1).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLL");
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().goToManageSavedCards();
        String BeforeCCSwap = getAccountManagementPage().getFirstSaveCC();
        getAccountManagementPage().clickOnAssignAutopayLink();
        getAccountManagementPage().clickOnCheckBoxForAutopay();
        getAccountManagementPage().clickOnYesOptionOnAutopay();
        getTopUpFormPage().clickOnRefreshPage();
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().goToManageSavedCards();
        getAccountManagementPage().validateSaveCCSwap(BeforeCCSwap);
    }


    @Test(groups = {"SSPPCT", "DAYTHREE","EAS"})
    public void CPP_29142_Validate_downgrade_PPC_flow_with_existing_balance(){
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("mutuallyExclusivePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTCC");
        getAccountManagementPage().clickOnCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().waitForPlanPageLoad();
        String lowerAvailablePlan = getPlanPage().findLowerAvailable4GPlan(CurrentMSF);
        getPlanPage().selectPlan(lowerAvailablePlan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        //getReviewOrderPage().clickOnAutoPayCheckBox();
        getReviewOrderPage().clickOnTermAndConditions();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().waitForPaymentPageLoad();
        getOrderConfirmationPage().validateOrderConfirmationPage();
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","EAS","SS","PPC","P1"})
    public void CPP_29259_Validate_Accept_US_Canada_and_Intl_Credit_card_and_billing_address_during_PPC(){

        String username = TestDataHandler.ppcData.getPpcData().get(1).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(1).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("planValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String creditCard = TestDataHandler.ppcData.getPpcData().get(1).get("cardNumber");
        String cvv = TestDataHandler.ppcData.getPpcData().get(1).get("cvv");
        String expiryDate = TestDataHandler.ppcData.getPpcData().get(1).get("expiryDate");
        String country = TestDataHandler.ppcData.getPpcData().get(1).get("country");
        String address = TestDataHandler.ppcData.getPpcData().get(0).get("cityAddress");
        String postalCode = TestDataHandler.ppcData.getPpcData().get(0).get("postalCode");
        String province = TestDataHandler.ppcData.getPpcData().get(0).get("provinceFullName");
        String firstName = TestDataHandler.ppcData.getPpcData().get(0).get("firstName");
        String lastName = TestDataHandler.ppcData.getPpcData().get(0).get("lastName");
        String city = TestDataHandler.ppcData.getPpcData().get(1).get("city");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAccountManagementPage().clickAddCard();
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getPPCPage().clickOnInternationalCardOption();
        getAutoPay().setName("Auto", "Test");
        getTopUpFormPage().selectCountry("India");
        getTopUpFormPage().setInternationalAddress("Maharashtra", "Auto Test", "Pune", "411005");
        getAccountManagementPage().clickContinueBtn_MAO();
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","EAS"})
    public void CPP_29258_Validate_Accept_US_Canada_billing_address_during_PPC(){
        String username = TestDataHandler.ppcData.getPpcData().get(1).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(1).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");
        String creditCard = TestDataHandler.ppcData.getPpcData().get(1).get("cardNumber");
        String cvv = TestDataHandler.ppcData.getPpcData().get(1).get("cvv");
        String expiryDate = TestDataHandler.ppcData.getPpcData().get(1).get("expiryDate");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
       /* getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAccountManagementPage().clickAddCard();
        getAutoPay().setExtraMoneyInPayment(extraMoney);
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getAccountManagementPage().clickContinueBtn_MAO();
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","qaAuto","EAS"})
    public void CPP_30942_Validate_Proceed_autopay_enrollment_with_exceeded_MAX_amount_of_extra_money(){
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAutoPay().enrollAutopay();
        getAutoPay().validateAddExtraMoneyError();
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","qaAuto","EAS"})
    public void CPP_39744_Validate_extra_money_Display_in_Step_4_and_step_5(){
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("mutuallyExclusivePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTCC");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        /*getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnEnrollAutoPay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().validateExtraMoneyReflect(extraMoney);
        getAutoPay().validateAutoPayEnroll();
        getReviewOrderPage().clickOnTermAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        //getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().validateExtraMoneyReflect(extraMoney);
    }

    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","EAS"})

    public void CPP_34806_Validate_Restrict_PPC_initiation_through_direct_URL_inflight_order() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(2).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(2).get("password");

        String MAOPageDirectUrl = TestDataHandler.landingPageData.getMAOPageDirectUrl();
        getDriver().get(MAOPageDirectUrl);
        getSignInPage().signInEasFromExcel("IFO");
        getAccountManagementPage().validateMAOBtn_inflight_Order();
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","qaAuto","EAS"})
    public void CPP_39739_Validate_extra_money_In_payment_Page_Display_in_Step_4_and_step_5_in_Shopping_Cart(){
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLLB");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        //getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan("50");
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnEnrollAutoPay();
        getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().validateExtraMoneyReflect(extraMoney);
        getAutoPay().validateAutoPayEnroll();
//        getReviewOrderPage().clickOnTermAndConditions();
//        getReviewOrderPage().clickOnContinue();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
        getAutoPay().validateExtraMoneyReflect(extraMoney);
    }

    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","pfour","EAS"})
    public void CPP_39418_Validate_PPC_Receipt_when_PPC_Fee_was_paid_using_Voucher() {
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("upGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String voucher = TestDataHandler.ppcData.getPpcData().get(0).get("voucherPIN");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("Bipin1");
        getHeaderComponent().clickCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        getAccountManagementPage().clickOnchangePlan();
        String higherAvailablePlan = getPlanPage().findHigherAvailable4GPlan(CurrentMSF);
        getPlanPage().selectPlan(higherAvailablePlan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Topup");
        getPaymentPage().enterVoucherPin("Voucher50","Status50");
        getPaymentPage().clickOnContinue();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getHeaderComponent().validatePPEOrderReview();
        //getHeaderComponent().clickOnSaveSummary();
    }

    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","pfour","EAS"})
    public void CPP_39416_Validate_PPC_Receipt_when_PPC_Fee_was_paid_using_Credit_card() {
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("upGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("Bipin2");
        getHeaderComponent().clickCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        getAccountManagementPage().clickOnchangePlan();
        String higherAvailablePlan = getPlanPage().findHigherAvailable4GPlan(CurrentMSF);
        getPlanPage().selectPlan(higherAvailablePlan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
//        getReviewOrderPage().clickOnTermAndConditions();
//        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().validateOrderConfirmationPage();
    }

    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","pfour","EAS"})
    public void CPP_39410_Validate_Navigate_to_PPC_summary_page_Autopay_section_Autopay_bonus_block_is_added() {
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("upGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getHeaderComponent().clickCurrentPlan();
        getHeaderComponent().clickOnChangePlanBtn();
        getPlanPage().waitForPlanPageLoad();
       /* getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnEnrollAutoPay();
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getHeaderComponent().validateAutopayBonus();
    }

    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","pfour","EAS"})
    public void CPP_39413_Validate_Navigate_to_PPC_summary_page_Autopay_section_Autopay_Enabled_NO_Autopay_bonus_block() {
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLLB");
        getHeaderComponent().clickCurrentPlan();
        getHeaderComponent().clickOnChangePlanBtn();
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getHeaderComponent().validateNoAutopayBonus();
    }
    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","pfour","EAS"})
    public void CPP_39727_Verify_that_system_Include_Account_Balance_in_Shopping_Cart_during_PPC_in_SS() {
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getHeaderComponent().clickCurrentPlan();
        getHeaderComponent().clickOnChangePlanBtn();
        /*getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getHeaderComponent().validateOrderSummaryAccBal();
    }

    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","pfour","EAS"})  // This Test case available in  care
    public void CPP_39385_Validate_View_the_Autopay_Section_on_Order_Confirmation_Page_for_PPC_when_Plan_has_Autopay_Bonus() {
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getHeaderComponent().clickCurrentPlan();
        getHeaderComponent().clickOnChangePlanBtn();
        /*getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnEnrollAutoPay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        //getReviewOrderPage().clickOnTermAndConditions();
        //getReviewOrderPage().clickOnContinue();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getHeaderComponent().validateAutopayBonus();
    }

    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","pfour","EAS"})
    public void CPP_37533_Display_of_Credit_Card_as_payment_method_Saved_Credit_Cards() {
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getHeaderComponent().clickCurrentPlan();
        getHeaderComponent().clickSelectAddOnLink();
        //getCarePortalDashBoard().clickOnManageLink();
        getCarePortalDashBoard().selectAddOnCheckBox();
        getPaymentPage().clickOnContinue();
        getAccountManagementPage().validateAccountInsufficientBalance();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAutoPay().addExtraMoney(extraMoney);
        getTopUpFormPage().selectPaymentMethod("Voucher");
        getPPCPage().ValidateVoucherFiledSelcted();
    }

    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","pfour","EAS"})
    public void CPP_39417_Validate_PPC_Receipt_when_PPC_Fee_was_paid_using_Account_Balance() {
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTCC");
        getHeaderComponent().clickCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        getHeaderComponent().clickOnChangePlanBtn();
        String higherAvailablePlan = getPlanPage().findHigherAvailable4GPlan(CurrentMSF);
        getPlanPage().selectPlan(higherAvailablePlan);
        //getPlanPage().ppcSelectPlanTab(planTab);
        //getPlanPage().selectPlan("40");
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        //getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        //getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        //getReviewOrderPage().clickOnTermAndConditions();
        //getReviewOrderPage().clickOnContinue();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getHeaderComponent().validatePPEOrderReview();
        getHeaderComponent().clickOnSaveSummary();
    }

    @Test(groups = {"SSPPCT","EAS", "DAYTHREE","qaAuto"})
    public void CPP_34809_Validate_enroll_in_Autopay_while_doing_PPC_flow_If_the_customer_has_no_saved_Credit_cards_on_file() {
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("planValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String creditCard = TestDataHandler.ppcData.getPpcData().get(1).get("cardNumber");
        String cvv = TestDataHandler.ppcData.getPpcData().get(1).get("cvv");
        String expiryDate = TestDataHandler.ppcData.getPpcData().get(1).get("expiryDate");
        String city = TestDataHandler.ppcData.getPpcData().get(1).get("city");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTCC");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        /*getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getAutoPay().clickOnAddCard();
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getAutoPay().setName("joh'n", "smit'");
        getTopUpFormPage().selectCountry("Canada");
        getAutoPay().setAddressAddCard(city);
        getPaymentPage().clickOnContinue();
        //getPaymentPage().waitForPaymentPageLoad();
        //getSimPage().errorMessageForPersonalNameFields();
    }


    @Test(groups = {"SSPPCT","EAS", "DAYTHREE","qaAuto"})
    public void CPP_29263_Validate_customer_clicking_on_the_check_box_Same_as_profile_address() {
        String username = TestDataHandler.ppcData.getPpcData().get(1).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(1).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String creditCard = TestDataHandler.ppcData.getPpcData().get(0).get("cardNumber");
        String cvv = TestDataHandler.ppcData.getPpcData().get(0).get("cvv");
        String expiryDate = TestDataHandler.ppcData.getPpcData().get(0).get("expiryDate");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
       /* getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAccountManagementPage().clickAddCard();
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getTopUpFormPage().validateBillingAddressField();
    }


    @Test(groups = {"SSPPCT","EAS", "DAYTHREE","qaAuto","SS","P1","PPC"})
    public void CPP_29029_Validate_Display_CC_screen_details_step_3_when_user_does_not_have_sufficient_account_balance() {
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String creditCard = TestDataHandler.ppcData.getPpcData().get(0).get("cardNumber");
        String cvv = TestDataHandler.ppcData.getPpcData().get(0).get("cvv");
        String expiryDate = TestDataHandler.ppcData.getPpcData().get(0).get("expiryDate");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAccountManagementPage().clickAddCard();
        getAutoPay().setPaymentInfo(creditCard,expiryDate,cvv);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnContinue();
        getAutoPay().clickOnEnrollAutopay();
        getAutoPay().addExtraMoney(extraMoney);
        getAccountManagementPage().clickAddCard();
        getAutoPay().setPaymentInfoAddCard(creditCard, expiryDate, cvv);
        getAutoPay().validatePaymentInfoCC();
    }
    @Test(groups = {"SSPPCT","EAS", "DAYTHREE","qaAuto","run"})
    public void CPP_29031_Validate_the_fields_when_user_checks_the_Same_as_profile_address() {
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().goToProfile();
        String address = getAccountManagementPage().getDetailsfromProfile("address");
        String city = getAccountManagementPage().getDetailsfromProfile("city");
        String postalCode = getAccountManagementPage().getDetailsfromProfile("postalcode");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
       /* getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getTopUpFormPage().selectAnotherCard();
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().validateBillingAddressWithProfile(address, city, postalCode);
    }
    @Test(groups = {"SSPPCT", "DAYTHREE","EAS"})
    public void CPP_29140_Validate_E2E_PPC_Flow_UpGrade_Lower_Value() throws InterruptedException {
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getCarePortalDashBoard().validateAccountBalanceDetails();
        getAccountManagementPage().clickOnCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        getAccountManagementPage().clickOnchangePlan();
        String higherAvailablePlan = getPlanPage().findHigherAvailable4GPlan(CurrentMSF);
        getPlanPage().selectPlan(higherAvailablePlan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getOrderConfirmationPage().validateOrderConfirmationPage();
        getHeaderComponent().clickOnMyChatr();
        getCarePortalHomePage().refreshPage();
//        getCarePortalDashBoard().validateAnniversaryDetails();
//        getCarePortalDashBoard().validateAccountStatusDetails("Active");
//        getCarePortalDashBoard().validateAccountBalanceDetails();
        /** EMAIL NOTIFICATION VALIDATION */
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        String orderId = getHistoryReportsPage().getLatestOrderIdForSS();
        getChampPage().accountLogOut("SS");
        getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();
        getChampPage().openNewTabInSameWindowForOutlook(orderId,"PPC");
    }
    @Test(groups = {"SSPPCT", "DAYTHREE","qaAuto","EAS"})
    public void CPP_37217_Validate_autoPay_Bonus_Display_Cart_On_Order_Submission_In_PPC_Flow(){
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("upGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getHeaderComponent().clickCurrentPlan();
        getHeaderComponent().clickOnChangePlanBtn();
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnEnrollAutoPay();
        getAutoPay().addExtraMoney(extraMoney);
        //getTopUpFormPage().selectPaymentMethod("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        //getReviewOrderPage().clickOnTermAndConditionsForInsufficientBalance();
        //getAutoPay().clickOnProceed();
        getReviewOrderPage().validateReviewOrderInPPC();
        getAutoPay().validateAutoPayEnroll();
    }
    @Test(groups = {"SSPPCT", "DAYTHREE","qaAuto","EAS"})

    public void CPP_39729_Validate_View_Targeted_OfferWithout_feewaiver() {
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("TARGET");
        getAccountManagementPage().clickOnCurrentPlan();
        getPPCPage().validateExclusiveOfferBanner();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().selectToPlan();
        getHeaderComponent().validateOrderSummaryAccBal();
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","qaAuto","EAS"})
    public void CPP_39731_Validate_Add_add_on_associated_with_the_TO_with_fee() {
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("TARGET");
        getAccountManagementPage().clickOnCurrentPlan();
        getPPCPage().validateExclusiveOfferBanner();
    }
    @Test(groups = {"SSPPCT","EAS", "DAYTHREE","qaAuto"})
    public void CPP_29260_Validate_Display_CC_screen_details_step_3_when_user_does_not_have_sufficient_account_balance() {
        String username = TestDataHandler.ppcData.getPpcData().get(1).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(1).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("planValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");
        String creditCard = TestDataHandler.ppcData.getPpcData().get(1).get("cardNumber");
        String cvv = TestDataHandler.ppcData.getPpcData().get(1).get("cvv");
        String expiryDate = TestDataHandler.ppcData.getPpcData().get(1).get("expiryDate");
        String country = TestDataHandler.ppcData.getPpcData().get(1).get("country");
        String address = TestDataHandler.ppcData.getPpcData().get(0).get("cityAddress");
        String postalCode = TestDataHandler.ppcData.getPpcData().get(0).get("postalCode");
        String province = TestDataHandler.ppcData.getPpcData().get(0).get("provinceFullName");
        String firstName = TestDataHandler.ppcData.getPpcData().get(0).get("firstName");
        String lastName = TestDataHandler.ppcData.getPpcData().get(0).get("lastName");
        String city = TestDataHandler.ppcData.getPpcData().get(1).get("city");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("NOCC");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getPPCPage().clickOnInternationalCardOption();
        getAutoPay().setName("Auto", "Test");
        getTopUpFormPage().selectCountry("India");
        getTopUpFormPage().setInternationalAddress("Maharashtra", "Auto Test", "Pune", "411005");
//        getAutoPay().setName(firstName, lastName);
//        getTopUpFormPage().selectCountry(country);
//        getTopUpFormPage().setInternationalAddress(province, address, city, postalCode);
        getAccountManagementPage().clickContinueBtn_MAO();
//        getAutoPay().clickOnEnrollAutopay();
        getAutoPay().clickOnEnrollAutoPay();
        getAutoPay().addExtraMoney(extraMoney);
       //getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getAutoPay().setName(firstName, lastName);
        getTopUpFormPage().selectCountry(country);
        getSimPage().setAddress(city);
        String addressLine = getTopUpFormPage().getAddressLine1();
        System.out.println(addressLine);
        String cityField = getTopUpFormPage().getCity();
        System.out.println(cityField);
        String postalcodeField = getTopUpFormPage().getPostalCode();
        System.out.println(postalcodeField);
        //getTopUpFormPage().validateBillingAddressChange(addressLine, cityField, postalcodeField);
        getTopUpFormPage().validateBillingAddressChange("Auto Test", "Pune", "411005");
    }
    @Test(groups = {"SSPPCT", "DAYTHREE","EAS"})
        public void CPP_27685_Execute_a_PPC_flow(){
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("mutuallyExclusivePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLLB");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        /*getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getAutoPay().selectTheSaveCreditCard();
        getPaymentPage().clickOnContinue();
        getAutoPay().clickOnUnEnrollAutoPay();
        getPaymentPage().clickOnContinue();
        //getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
//        getReviewOrderPage().clickOnTermAndConditions();
//        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().validateOrderSummaryDetailsForPPCinSS("Toronto","Ontario");
        //getOrderConfirmationPage().validateOrderConfirmationPage();
    }
    @Test(groups = {"SSPPCT","DAYTHREE","EAs"})
    public void CPP_45292_Validate_SS_PPC_Flow_Voucher_InCorrect3Times_Select_CC(){
        String username = TestDataHandler.ppcData.getPpcData().get(1).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(1).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        /*getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Voucher");
        getPaymentPage().enterInvalidVoucherPin3Times();
        getPaymentPage().validateInvalidVoucherPinError();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().validateCreditCardField();
    }
    @Test(groups = {"SSPPCT", "1to1","qaAuto","EAS","SS","P1","PPC"})
    public void CPP_39386_Validate_View_the_Autopay_section_on_Order_Confirmation_Page_for_PPC_when_Plan_does_NOT_have_Autopay_Bonus() {
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
//        getPlanPage().ppcSelectPlanTab(planTab);
//        getPlanPage().selectPlan(plan);
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getAutoPay().addExtraMoney(extraMoney);
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnEnrollAutoPay();
//        getAutoPay().selectTheSaveCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        //getAutoPay().validateAutoPayEnroll();
        //getReviewOrderPage().clickOnTermAndConditions();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
        //getReviewOrderPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getHeaderComponent().validateNoAutopayBonus();
    }
    @Test(groups = {"SSPPCT","DAYTHREE","EAS"})
    public void CPP_39335_Validate_Display_Creditcard_Detail_Step_With_Saved_Cards() {
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String cardNumber = TestDataHandler.ppcData.getPpcData().get(0).get("cardNumber");
        String expiryDate = TestDataHandler.ppcData.getPpcData().get(0).get("expiryDate");
        String cvv = TestDataHandler.ppcData.getPpcData().get(0).get("cvv");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
        /*getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAccountManagementPage().validateCreditCardDetailsAndSelectAnotherCard(cardNumber, expiryDate, cvv);
    }
//    @Test(groups = {"SSPPCT", "1to1","qaAuto","EAS"})
//    public void CPP_37397_User_UnChecks_the_Mutually_Exclusive_add_removing_it_from_the_Plan_Change_selection() {
//        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("mutuallyExclusivePlanValue");
//        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
//        String addOn1 = TestDataHandler.ppcData.getPpcData().get(0).get("addOn1");
//        String addOn2 = TestDataHandler.ppcData.getPpcData().get(0).get("addOn2");
//        String addOn3 = TestDataHandler.ppcData.getPpcData().get(0).get("addOn3");
//
//        getHeaderComponent().clickSignIn();
//        getSignInPage().signInEasFromExcel("ACTIVE");
//        getAccountManagementPage().clickOnCurrentPlan();
//        getAccountManagementPage().clickOnchangePlanPPC();
//        getPlanPage().ppcSelectPlanTab(planTab);
//        getPlanPage().selectPlan(plan);
//        getPlanPage().selectCompatibleAddOns();
//        getPlanPage().validateAddonNotCompatibleErrorMessage();
//        getPlanPage().unCheckCompatibleAddOns();
//        getPlanPage().validateErrorMessageIsNotPresent();
//        getPlanPage().selectOrRemoveAddOn(addOn1);
//        getPaymentPage().waitForPaymentPageLoad();
//        getPlanPage().selectOrRemoveAddOn(addOn2);
//        getPaymentPage().waitForPaymentPageLoad();
//        getPlanPage().selectOrRemoveAddOn(addOn3);
//        getPlanPage().validateMutuallyExclusiveAddOnErrorDisplay("DISPLAY");
//        getPaymentPage().waitForPaymentPageLoad();
//        getPlanPage().selectOrRemoveAddOn(addOn2);
//        getPlanPage().validateMutuallyExclusiveAddOnErrorDisplay("NOTDISPLAY");
//    }
   /* @Test(groups = {"SSPPCT", "DAYTHREE","EAS"})
    public void CPP_37260_Validate_View_Shopping_Cart_when_Proration_is_added_Downgrade_AC04*/
@Test(groups = {"PPC downgrade"})
public void TC_04_Validate_E2E_PPC_downgrade_using_CC_and_ensure_the_tax_calculation_and_Proration_is_correct_and_provisioning_is_successful_in_all_the_systems_like_D1_PBM_RTRM_with_the_email_notification(){

        String username = TestDataHandler.ppcData.getPpcData().get(1).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(1).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTCC");
        //getSignInPage().signInEas(username,password);
        getAccountManagementPage().clickOnCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        getAccountManagementPage().clickOnchangePlan();
        //getPlanPage().ppcSelectPlanTab(planTab);
        //String lowerAvailablePlan = getAccountManagementPage().findLowerMSFPlan(CurrentMSF);
        String lowerAvailablePlan = getPlanPage().findLowerAvailable4GPlan(CurrentMSF);
        getPlanPage().selectPlan(lowerAvailablePlan);
        getPlanPage().validateProrationVsMSF("DOWNGRADE", CurrentMSF, lowerAvailablePlan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
//        getReviewOrderPage().clickOnTermAndConditions();
//        getReviewOrderPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getOrderConfirmationPage().validateOrderConfirmationPage();
    }

    @Test(groups = {"SSPPCT", "DAYTHREE","EAS","SS","PPC","P1"})
    public void CPP_37261_Validate_View_Shopping_Cart_when_Proration_is_added_Same_MSF_confirm_legacy_results_AC04(){
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        getAccountManagementPage().clickOnchangePlan();
       // getPlanPage().ppcSelectPlanTab(planTab);
        //String lowerAvailablePlan=getAccountManagementPage().findLowerMSFPlan(CurrentMSF);
        //System.out.println(lowerAvailablePlan);
        getPlanPage().selectPlan("40");
        getPlanPage().validateProrationVsMSF("SAMEMSF", CurrentMSF, "40");
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        //getReviewOrderPage().clickOnTermAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        //getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().validateOrderConfirmationPage();
    }
    @Test(groups = {"SSPPCT", "DAYTHREE","EAS"})
    public void CPP_37262_Validate_View_Shopping_Cart_when_Proration_is_added_3_days_before_the_next_anniversary_date_AC04(){
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getAccountManagementPage().clickOnCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        getAccountManagementPage().clickOnchangePlan();
        //getPlanPage().ppcSelectPlanTab(planTab);
       // String higherAvailablePlan = getAccountManagementPage().findHigherMSFPlan(CurrentMSF);
        //System.out.println(higherAvailablePlan);
        String higherAvailablePlan = getPlanPage().findHigherAvailable4GPlan(CurrentMSF);
        getPlanPage().selectPlan(higherAvailablePlan);
        getPlanPage().validateProrationVsMSF("UPGRADE", CurrentMSF, higherAvailablePlan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAccountManagementPage().clickContinueBtn_MAO();
        //getReviewOrderPage().clickOnContinue();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        //getReviewOrderPage().clickOnContinue();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        //getReviewOrderPage().clickOnTermAndConditions();
        //getReviewOrderPage().clickOnContinue();
        getPlanPage().validateProrationVsMSF("UPGRADE", CurrentMSF, higherAvailablePlan);
        getOrderConfirmationPage().validateOrderConfirmationPage();
    }

    /*@Test(groups = {"SSPPCT", "DAYTHREE","EAS"})
    public void CPP_37263_Validate_View_Shopping_Cart_when_Proration_is_added_Upgrade_AC04()*/
    @Test(groups = {" PPC upgrade"})
    public void TC_03_Validate_E2E_PPC_upgrade_using_CC_and_ensure_the_tax_calculation_and_Proration_is_correct_and_provisioning_is_successful_in_all_the_systems_like_D1_PBM_RTRM_with_the_email_notification(){
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        //getSignInPage().signInEas(username,password);
        getAccountManagementPage().clickOnCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        getAccountManagementPage().clickOnchangePlan();
        //getPlanPage().ppcSelectPlanTab(planTab);
        //String higherAvailablePlan = getAccountManagementPage().findHigherMSFPlan(CurrentMSF);
        String higherAvailablePlan = getPlanPage().findHigherAvailable4GPlan(CurrentMSF);
        getPlanPage().selectPlan(higherAvailablePlan);
        getPlanPage().validateProrationVsMSF("UPGRADE", CurrentMSF, higherAvailablePlan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
        //getReviewOrderPage().clickOnTermAndConditions();
        //getReviewOrderPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getPlanPage().validateProrationVsMSF("UPGRADE", CurrentMSF, higherAvailablePlan);
        getOrderConfirmationPage().validateOrderConfirmationPage();
    }
    @Test(groups = {"SSPPCT", "DAYTHREE","EAS","SS","PPC","P1"})
    public void CPP_37492_Validate_user_Proceed_with_selected_addons(){
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTCC");
        getAccountManagementPage().clickOnCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        getAccountManagementPage().clickOnchangePlan();
        //getPlanPage().ppcSelectPlanTab(planTab);
        String lowerAvailablePlan = getAccountManagementPage().findLowerMSFPlan(CurrentMSF);
        System.out.println(lowerAvailablePlan);
        getPlanPage().selectPlan(lowerAvailablePlan);
        getPlanPage().validateProrationVsMSF("DOWNGRADE", CurrentMSF, lowerAvailablePlan);
        getPlanPage().validateAddOnSelect();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        //getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getOrderConfirmationPage().validateOrderConfirmationPage();
    }
    @Test(groups = {"SSPPCT", "DAYTHREE","EAS"})
    public void CPP_37197_User_is_able_to_upgrade_the_plan_target_plan_of_MSF_higher_than_current_plan() throws IOException, InterruptedException, SQLException {
        String username = TestDataHandler.ppcData.getPpcData().get(3).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(3).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String cardNumber = TestDataHandler.ppcData.getPpcData().get(0).get("cardNumber");
        String expiryDate = TestDataHandler.ppcData.getPpcData().get(0).get("expiryDate");
        String cvv = TestDataHandler.ppcData.getPpcData().get(0).get("cvv");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("NOCC");
        String mail = getOrderConfirmationPage().getMailId();
        String ctnNumber = getOrderConfirmationPage().getMobileNumber();
        getAccountManagementPage().clickOnCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        getAccountManagementPage().clickOnchangePlan();
        //getPlanPage().ppcSelectPlanTab(planTab);
        //String higherAvailablePlan = getAccountManagementPage().findHigherMSFPlan(CurrentMSF);
        String higherAvailablePlan = getPlanPage().findHigherAvailable4GPlan(CurrentMSF);
        getPlanPage().selectPlan(higherAvailablePlan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetailswithOutTopUp( cardNumber, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnContinue();
        getAutoPay().clickOnUnEnrollAutoPay();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        getPaymentPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getOrderConfirmationPage().validateOrderConfirmationPage();
        String orderNumber = getOrderConfirmationPage().getNacOrderNumber();
        ENSQuery ensQuery = new ENSQuery();
        Thread.sleep(30000);
        System.out.println("ENS connection established successfully");
        String result = ensQuery.getProductorderID(mail,"CPP_PPC_CONFIRMATION");
        getSignInPage().validateActivationOrderIdForNacFlow(mail,result,orderNumber,higherAvailablePlan+".00",ctnNumber);
        getPaymentPage().waitForPaymentPageLoad();
        getChampPage().openNewTabInSameWindowForENSPortal(mail,ctnNumber,"1");

//        getSignInPage().validateActivationOrderIdForNacFlow("ramanujam.arunachala@rci.rogers.com",result,"624315949392185287","25","416-278-4897 ");
//        getPaymentPage().waitForPaymentPageLoad();
//        getChampPage().openNewTabInSameWindowForENSPortal("ramanujam.arunachala@rci.rogers.com","4162784897 ","1");
    }
    @Test(groups = {"SSPPCT", "DAYTHREE","EAS","SS","P1","PPC"})
    public void CPP_37313_Validate_the_Shopping_Cart_when_Add_on_is_added_AC_003(){
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("NOCC");
        getAccountManagementPage().clickOnCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        getAccountManagementPage().clickOnchangePlan();
        //getPlanPage().ppcSelectPlanTab(planTab);
        //String lowerAvailablePlan = getAccountManagementPage().findLowerMSFPlan(CurrentMSF);
        String lowerAvailablePlan = getPlanPage().findLowerAvailable4GPlan(CurrentMSF);
        getPlanPage().selectPlan(lowerAvailablePlan);
        //getPlanPage().selectAddOns();
        getCarePortalDashBoard().selectAddOnCheckBox();
        getHeaderComponent().validateAddOnOrderSummary();
    }
    @Test(groups = {"SSPPCT", "DAYTHREE","EAS"})
    public void CPP_37233_Validate_Error_message_when_PIN_entered_is_already_used() {
       String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTCC");
        getAccountManagementPage().clickOnCurrentPlan();
        /*String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();*/
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().selectRandom4GPlan();
        /*String higherAvailablePlan = getPlanPage().findHigherAvailable4GPlan(CurrentMSF);
        getPlanPage().selectPlan(higherAvailablePlan);*/
       /* getPlanPage().ppcSelectPlanTab(planTab);*/
       /* String higherAvailablePlan = getAccountManagementPage().findHigherMSFPlan(CurrentMSF);
        System.out.println(higherAvailablePlan);
        getPlanPage().selectPlan(higherAvailablePlan);*/
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
//       getAccountManagementPage().clickCreditCardRadioBtn("Voucher");
        getTopUpFormPage().selectPaymentMethod("Voucher");
        getPaymentPage().enterInvalidPin("209853150648");
        //getPaymentPage().enterVoucherPin("Voucher50","Status50");
        getCarePortalHomePage().validateVoucherError();
        //getAccountManagementPage().clickContinueBtn_MAO();
    }
    @Test(groups = {"SSPPCT","EAS", "onetoone","qaAuto"})
    public void CPP_37493_Validate_UserSkip_Addons_Selection_And_proceed_With_PPC() {
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("mutuallyExclusivePlanValue");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlanPPC();
        /*getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().validateUnSelectAddon();
        getAccountManagementPage().validateOrderSummaryAccBal();
        getPlanPage().clickOnContinueAddon();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().validateOrderSummaryAccBal();
    }
    @Test(groups = {"SSPPCT","EAS", "onetoone","qaAuto"})
    public void CPP_37489_Validate_User_Selects_Addon_PPC() {
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("mutuallyExclusivePlanValue");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlanPPC();
       /* getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().validateUnSelectAddon();
        getAccountManagementPage().validateOrderSummaryAccBal();
        getPlanPage().validateAddOnSelect();
        getAccountManagementPage().validateOrderSummaryAccBal();
    }
    @Test(groups = {"SSPPCT","EAS", "onetoone", "qaAuto"})
    public void CPP_37514_Validate_Remaining_Voucher_Amount_Added_In_Account_Balance_PPC() {
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        String previousAccountBalance = getCarePortalDashBoard().getAccountBalanceAmount();
        getHeaderComponent().clickCurrentPlan();
        getHeaderComponent().clickOnChangePlanBtn();
        getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan("25");
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().clickCreditCardRadioBtn("topup");
        getPaymentPage().enterVoucherPin("Voucher50","Status50");
        getPaymentPage().validateValidTopUpMessage();
        getPaymentPage().clickOnContinue();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().clickOnTermAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getHeaderComponent().clickOnMyChatr();
        getCarePortalHomePage().refreshPage();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getCarePortalHomePage().refreshPage();
        getPaymentPage().waitForPaymentPageLoad();
        String accBalanceWithRemainingVoucherAmount = getCarePortalDashBoard().getAccountBalanceAmount();
       getCarePortalDashBoard().validateRemainingAmountAddedToAccountBalance(previousAccountBalance,accBalanceWithRemainingVoucherAmount,plan,"50");
    }
    @Test(groups = {"SSPPCT","EAS", "onetoone", "qaAuto"})
    public void CPP_37309_Validate_User_Able_To_Select_And_Add_to_Plan_Change_Bill_Normal_Addon_As_Well_As_Mutually_Exclusive_Addon(){
        String plan = TestDataHandler.planData.getPlanData().get(6).get("planValue");
        String addOn1= TestDataHandler.ppcData.getPpcData().get(0).get("addOn1");
        String addOn2= TestDataHandler.ppcData.getPpcData().get(0).get("addOn2");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTCC");
        getHeaderComponent().clickCurrentPlan();
        getHeaderComponent().clickOnChangePlanBtn();
        getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().selectCompatibleAddOns();
        getPlanPage().clickOnProceedButton();
        getPlanPage().validateAddonDetailsOrderSummary(addOn1,addOn2);
    }

//    @Test(groups = {"SSPPCT","EAS", "onetoone", "qaAuto"})
//    public void CPP_37309_Validate_Error_Message_while_Selecting_More_Mutually_Exclusive_Addon(){
//        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
//        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
//        String plan = TestDataHandler.planData.getPlanData().get(6).get("planValue");
//        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
//
//        getHeaderComponent().clickSignIn();
//        getSignInPage().signInEasFromExcel("ACTIVE");
//        getHeaderComponent().clickCurrentPlan();
//        getHeaderComponent().clickOnChangePlanBtn();
//        getPlanPage().ppcSelectPlanTab(planTab);
//        getPlanPage().selectPlan(plan);
//        getPlanPage().selectCompatibleAddOns();
//        getPlanPage().validateAddonNotCompatibleErrorMessage();
//
//    }

//    @Test(groups = {"SSPPCT","EAS", "onetoone", "qaAuto"})(CPP-37396)
//    public void CPP_37310_Validate_User_UnChecks_The_Mutually_Exclusive_Add_Removing_From_Plan_Change_Selection(){
//        String plan = TestDataHandler.planData.getPlanData().get(6).get("planValue");
//        String addOn1= TestDataHandler.ppcData.getPpcData().get(0).get("addOn1");
//        String addOn2= TestDataHandler.ppcData.getPpcData().get(0).get("addOn2");
//        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
//
//        getHeaderComponent().clickSignIn();
//        getSignInPage().signInEasFromExcel("ACTIVE");
//        getHeaderComponent().clickCurrentPlan();
//        getHeaderComponent().clickOnChangePlanBtn();
//        getPlanPage().ppcSelectPlanTab(planTab);
//        getPlanPage().selectPlan(plan);
//        getPlanPage().selectCompatibleAddOns();
//        getPlanPage().validateAddonNotCompatibleErrorMessage();
//        getPlanPage().validateAddonDetailsOrderSummary(addOn1,addOn2);
//        getPlanPage().unCheckCompatibleAddOns();
//        getPlanPage().validateErrorMessageIsNotPresent();
//        getPlanPage().validateAddonDetailsRemovedFromOrderSummary(addOn1,addOn2);
//    }

    @Test(groups = {"SSPPCT","onetoone","EAS"})
    public void CPP_37234_Validate_Error_Message_When_PIN_Entered_Is_Invalid_Or_Wrong(){
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
//        getPlanPage().ppcSelectPlanTab(planTab);
//        getPlanPage().selectPlan(plan);
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Voucher");
        getPaymentPage().enterInvalidPin("123456767890");
        getAccountManagementPage().validateVoucherErrorInvalidPin();
    }
    @Test(groups = {"SSPPCT", "onetoone","EAS"})
    public void CPP_37131_Validate_End_To_End_PPC_Flow_Without_Saving_Credit_Card(){
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String cardNumber = TestDataHandler.ppcData.getPpcData().get(0).get("cardNumber");
        String expiryDate = TestDataHandler.ppcData.getPpcData().get(0).get("expiryDate");
        String cvv = TestDataHandler.ppcData.getPpcData().get(0).get("cvv");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("NOCC");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
//        getPlanPage().ppcSelectPlanTab(planTab);
//        getPlanPage().selectPlan(plan);
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetailswithOutTopUp( cardNumber, cvv, expiryDate);
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
       // getAutoPay().setPaymentInfo(cardNumber, expiryDate, cvv);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
         getPaymentPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        //getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getPaymentPage().clickOnSubmit();
        //getPaymentPage().clickOnContinue();
        getOrderConfirmationPage().validateOrderConfirmationPage();
        getHeaderComponent().clickOnMyChatr();
        getAccountManagementPage().clickOnProfileTab();
        getAccountManagementPage().validateCCNotSaved();
    }
/*
  This  Test Case plan Value = Voucher Value / Account balance = 0
 */
    @Test(groups = {"SSPPCT","EAS", "onetoone", "qaAuto"})
    public void CPP_37274_Validate_Top_up_amount_equals_to_plan_MSF() {
            String username = TestDataHandler.ppcData.getPpcData().get(2).get("username");
            String password = TestDataHandler.ppcData.getPpcData().get(2).get("password");
            String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

            getHeaderComponent().clickSignIn();
            getSignInPage().signInEasFromExcel("NOCC");
            String previousAccountBalance = getCarePortalDashBoard().getAccountBalanceAmount();
            getAccountManagementPage().clickOnCurrentPlan();
            getAccountManagementPage().clickOnchangePlan();
            getPlanPage().ppcSelectPlanTab(planTab);
            getPlanPage().selectPlan("25");
            getPlanPage().clickOnProceedButton();
            getPaymentPage().waitForPaymentPageLoad();
            getAccountManagementPage().validateAccountInsufficientBalance();
            getTopUpFormPage().selectPaymentMethod("Voucher");
            getPaymentPage().enterVoucherPin("Voucher25","Status25");
            getAccountManagementPage().clickContinueBtn_MAO();
            getAutoPay().clickOnUnEnrollAutoPay();
            getAccountManagementPage().clickContinueBtn_MAO();
            getReviewOrderPage().validateReviewOrderInPPC();
            getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
            getReviewOrderPage().clickOnSubmit();
            getPaymentPage().waitForPaymentPageLoad();
            getOrderConfirmationPage().validateOrderConfirmationPage();
            getHeaderComponent().clickOnMyChatr();
            getReviewOrderPage().waitForReviewOrderPageLoad();
            getCarePortalHomePage().refreshPage();
            getReviewOrderPage().waitForReviewOrderPageLoad();
            getCarePortalHomePage().refreshPage();
            getPaymentPage().waitForPaymentPageLoad();
            getCarePortalDashBoard().validateAccountBalanceSame(previousAccountBalance);
        }
    @Test(groups = {"SSPPCT","EAS", "onetoone","EAS","SS","P1","PPC"})
    public void CPP_37495_Validate_System_Behavior_For_One_Time_Addon_Against_Existing_Plan_Same_Eligible_Against_Target_Plan_PPC(){
       String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLLB");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().validateExistingAddOnAmount();
        getAccountManagementPage().clickOnchangePlanPPC();
        getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().validateAddOnSelect();
        getAccountManagementPage().validateOrderSummaryAccBal();
        //getPlanPage().clickOnContinueAddon();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getPaymentPage().clickOnContinue();
        getAutoPay().clickOnUnEnrollAutoPay();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().validateReviewOrderInPPC();
    }
    /*
    THIS TEST CASE PLAN VALUE (40) > VOUCHER VALUE (25)
     */
    @Test(groups = {"SSPPCT","EAS", "onetoone", "qaAuto"})
    public void CPP_37275_Validate_message_when_Top_up_card_amount_is_less_than_the_MSF_of_the_plan() {
       String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("NOCC");
        getAccountManagementPage().clickOnCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        getAccountManagementPage().clickOnchangePlan();
        //getPlanPage().ppcSelectPlanTab(planTab);
        //String higherAvailablePlan = getPlanPage().findHigherAvailable4GPlan(CurrentMSF);
        getPlanPage().selectPlan("50");
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Voucher");
        //getAccountManagementPage().clickCreditCardRadioBtn("Voucher");
        getPaymentPage().enterVoucherPin("Voucher10","Status10");
        getAccountManagementPage().clickContinueBtn_MAO();
        getPPCPage().validateVoucherLessThanMSF();
//        getAccountManagementPage().clickContinueBtn_MAO();
//        // getAutoPay().clickOnUnEnrollAutoPay();
//        getTopUpFormPage().clickOnReviewCheckbox();
//        getAccountManagementPage().clickContinueBtn_MAO();
//        getReviewOrderPage().validateReviewOrderInPPC();
//        getReviewOrderPage().clickOnTermAndConditions();
//        getReviewOrderPage().clickOnContinue();
//        //  getOrderConfirmationPage().validateOrderConfirmationPage();
    }

    @Test(groups = {"SSPPCT","EAS", "onetoone", "qaAuto"})
    public void CPP_37505_Validating_MAO_payment_page_when_Account_Balance_not_Sufficient_User_is_prompted_to_select_top_up_your_account_option() {
        String username = TestDataHandler.ppcData.getPpcData().get(2).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(2).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getHeaderComponent().clickSelectAddOnLink();
        //String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        //getCarePortalDashBoard().clickOnManageLink();
        getCarePortalDashBoard().selectAddOnCheckBox();
        getPaymentPage().clickOnContinue();
        //getCarePortalDashBoard().clickOnContinueButton();
        getAccountManagementPage().validateAccountInsufficientBalance();

    }
    @Test(groups = {"SSPPCT","EAS", "onetoone", "qaAuto"})
    public void CPP_37506_Validating_MAO_payment_page_when_Account_Balance_is_not_Sufficient_User_doesnt_select_a_top_up_your_account_options_and_clicks_Proceed() {
        String username = TestDataHandler.ppcData.getPpcData().get(2).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(2).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        // String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        //getHeaderComponent().clickSelectAddOnLink();
        getCarePortalDashBoard().clickOnManageLink();
        getCarePortalDashBoard().selectAddOnCheckBox();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().clickOnContinue();
        getAccountManagementPage().validateAccountInsufficientBalance();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().clickOnTermAndConditions();
        getReviewOrderPage().clickOnSubmit();
//        getPaymentPage().waitForPaymentPageLoad();
//        ArrayList<String>orderDetails=getOrderConfirmationPage().getOrderDetailsForManageAddOn();
//        getSignInPage().validateActivationOrderIdForManageAddon(orderDetails,"CPP_ADDON_ENROLLMENT");
    }
          @Test(groups = {"SSPPCT", "onetoone","EAS"})
    public void CPP_37504_Validating_MAO_Payment_Page_When_Account_Balance_Is_Sufficient(){
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnGetAddons();
        //getCarePortalDashBoard().clickOnManageLink();
        getPlanPage().selectAvailableAddon();
        getPlanPage().clickOnContinueAddon();
        getPaymentPage().validateSufficientAmountText();

    }
    @Test(groups = {"SSPPCT","EAS", "onetoone", "qaAuto"})
    public void CPP_37190_Validate_PPC_Flow_Payment_Details_Voucher() {
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(0).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("mutuallyExclusivePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getHeaderComponent().clickCurrentPlan();
        getHeaderComponent().clickOnChangePlanBtn();
       /* getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("voucher");
        //getAccountManagementPage().clickCreditCardRadioBtn("voucher");
        getPaymentPage().enterVoucherPin("Voucher30","Status30");
        getPaymentPage().validateValidTopUpMessage();
        getPaymentPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().clickOnUnEnrollAutoPay();
        getPaymentPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        //getPPCPage().clickOnContinueButtonEnrollUnenroll();
        getAccountManagementPage().validatingPaymentDetailsVoucher();
        //getHeaderComponent().clickSelectAddOnLink();
       // String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        // getCarePortalDashBoard().clickOnManageLink();
        //getCarePortalDashBoard().selectAddOnCheckBox();
        //getCarePortalDashBoard().clickOnContinueButton();
      //  getCarePortalDashBoard().clickOnContinueButton();
       // getAccountManagementPage().validateAccountInsufficientBalance();

    }
    @Test(groups = {"SSPPCT","EAS", "onetoone", "qaAuto"})
    public void CPP_37318_Validate_Extra_Money_on_step_2_Payment_Method_of_PPC_should_not_be_mandated_for_proceeding_to_the_next_Step() {
        String username = TestDataHandler.ppcData.getPpcData().get(2).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(2).get("password");
        String voucher25 = TestDataHandler.ppcData.getPpcData().get(4).get("voucher25");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String cardNumber = TestDataHandler.ppcData.getPpcData().get(0).get("cardNumber");
        String cvv = TestDataHandler.ppcData.getPpcData().get(0).get("cvv");
        String expiryDate = TestDataHandler.ppcData.getPpcData().get(0).get("expiryDate");


        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getAccountManagementPage().clickOnCurrentPlan();
        /*String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();*/
        getAccountManagementPage().clickOnchangePlan();
        /*getPlanPage().ppcSelectPlanTab(planTab);
        String higherAvailablePlan = getPlanPage().findHigherAvailable4GPlan(CurrentMSF);
        getPlanPage().selectPlan(higherAvailablePlan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        //getAccountManagementPage().clickCreditCardRadioBtn("Voucher");
        getTopUpFormPage().selectPaymentMethod("Credit");
        getAutoPay().clickOnAddCard();
        getAutoPay().setPaymentInfo(cardNumber, expiryDate, cvv);
        //getPaymentPage().setCreditCardDetails("", creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().validateExtraMoneyNotMandate();
        getPaymentPage().clickOnContinue();
//        getAccountManagementPage().clickContinueBtn_MAO();
//        // getAutoPay().clickOnUnEnrollAutoPay();
//        getTopUpFormPage().clickOnReviewCheckbox();
//        getAccountManagementPage().clickContinueBtn_MAO();
//        getReviewOrderPage().validateReviewOrderInPPC();
//        getReviewOrderPage().clickOnTermAndConditions();
//        getReviewOrderPage().clickOnContinue();
//        //  getOrderConfirmationPage().validateOrderConfirmationPage();
    }
    @Test(groups = {"SSPPCT","EAS", "onetoone", "qaAuto"})
    public void CPP_54362_Validate_View_Shopping_Cart_when_Proration_is_added_Upgrade_and_Account_Balance_equalsTo_New_Plan_MSF_minus_Proration_amount_AC04() throws ParseException {
        String username = TestDataHandler.ppcData.getPpcData().get(4).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(4).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("NOCCB");
        getAccountManagementPage().clickOnCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        //getPlanPage().getProrationAmount(CurrentMSF);
        getAccountManagementPage().clickOnchangePlan();
        getPlanPage().ppcSelectPlanTab(planTab);
        String lowerAvailablePlan = getAccountManagementPage().findLowerMSFPlan("50");
        System.out.println(lowerAvailablePlan);
        getPlanPage().selectPlan(lowerAvailablePlan);
        getPlanPage().validateProrationVsMSF("DOWNGRADE", CurrentMSF, lowerAvailablePlan);
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAccountManagementPage().clickContinueBtn_MAO();
        getAutoPay().clickOnUnEnrollAutoPay();
        getAccountManagementPage().clickContinueBtn_MAO();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getOrderConfirmationPage().validateOrderConfirmationPage();
    }
    @Test(groups = {"PpcFlow","EAS", "onetoone", "qaAuto"})
    public void CPP_33033_Validate_User_Is_Able_To_See_The_CC_Added_In_Step2_Of_PPC(){
        String username = TestDataHandler.ppcData.getPpcData().get(4).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(4).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("PlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String creditCard = TestDataHandler.ppcData.getPpcData().get(0).get("cardNumber");
        String cvv = TestDataHandler.ppcData.getPpcData().get(0).get("cvv");
        String expiryDate = TestDataHandler.ppcData.getPpcData().get(0).get("expiryDate");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getHeaderComponent().clickCurrentPlan();
        getHeaderComponent().clickOnChangePlanBtn();
        //getPlanPage().ppcSelectPlanTab(planTab);
        //getPlanPage().selectPlan("40");
        getPlanPage().selectRandom4GPlan();
        getPaymentPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getAutoPay().clickOnAddCard();
        getAutoPay().setPaymentInfo(creditCard,expiryDate,cvv);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getAutoPay().clickOnSaveCardCheckbox();
        getPaymentPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().clickOnEnrollAutoPay();
        getAutoPay().validateSavedCreditCard();
    }
    @Test(groups = {"SSPPCT","EAS", "DAYTHREE","qaAuto","SS","P1","PPC"})
    public void CPP_32810_Validate_Preloaded_Balance_Replaced_By_Extra_Money_On_Confirmation_Page_PPC(){
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("downGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLLB");
        getAccountManagementPage().clickOnCurrentPlan();
        String CurrentMSF = getAccountManagementPage().getCurrentPlanValue();
        getAccountManagementPage().clickOnchangePlan();
        String lowerAvailablePlan = getPlanPage().findLowerAvailable4GPlan(CurrentMSF);
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getPPCPage().selectTheSaveCreditCard();
        getAutoPay().addExtraMoney(extraMoney);
        getPaymentPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().clickOnEnrollAutoPay();
        getPPCPage().selectTheSaveCreditCard();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditionsForReviewPage();
        //getReviewOrderPage().clickOnTermAndConditions();
        //getPaymentPage().clickOnContinue();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getOrderConfirmationPage().validateExtraMoneyInOrderConfirmationPage(extraMoney);
    }
    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","SS","P1","MPI"})
    public void CPP_30918_Validate_Add_New_CreditCard_In_Profile_And_Can_Able_To_Add_Only_5cards() throws AWTException {
        String creditCard = TestDataHandler.ppcData.getPpcData().get(0).get("cardNumber");
        String expiryDate = TestDataHandler.ppcData.getPpcData().get(0).get("expiryDate");
        String cvv = TestDataHandler.ppcData.getPpcData().get(0).get("cvv");
        String city = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("city");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("MAX");
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().goToManageSavedCards();
        int NoofCards = getAccountManagementPage().getAddedCardCountForSS();
        for (int i=0;i<(5-NoofCards);i++){
            getAccountManagementPage().validateCardIsPresent();
            getAccountManagementPage().clickAddCard();
            getAccountManagementPage().setCardDetails(creditCard, expiryDate, cvv);
            getAccountManagementPage().setName("Auto", "Test");
            getAccountManagementPage().setAddress(city);
            getAccountManagementPage().clickSave();
            getAccountManagementPage().validateCardSavedModal();
            getCarePortalHomePage().refreshPage();
            getAccountManagementPage().goToProfile();
            getAccountManagementPage().goToManageSavedCards();
            getAccountManagementPage().validateCardIsPresent();
        }


//        getAccountManagementPage().clickOnCurrentPlan();
//        getAccountManagementPage().clickOnchangePlan();
// //       getPlanPage().ppcSelectPlanTab(planTab);
////        getPlanPage().selectPlan(plan);
//        getPlanPage().selectRandom4GPlan();
//        getPlanPage().clickOnProceedButton();
//        getPaymentPage().waitForPaymentPageLoad();
//        getAccountManagementPage().clickCreditCardRadioBtn("Credit");
//        getAccountManagementPage().validateMaximum5SavedCards(cardNumber, expiryDate, cvv);
//        getAccountManagementPage().clickContinueBtn_MAO();
//        getPaymentPage().waitForPaymentPageLoad();
//        getAutoPay().clickOnUnEnrollAutoPay();
//        getAccountManagementPage().clickContinueBtn_MAO();
//        getPaymentPage().waitForPaymentPageLoad();
//        getReviewOrderPage().clickOnTermAndConditions();
//        getReviewOrderPage().clickOnSubmit();
//        getPaymentPage().waitForPaymentPageLoad();
//        getOrderConfirmationPage().validateOrderConfirmationPage();
    }
    @Test(groups = {"PpcFlow","EAS", "onetoone", "qaAuto"})
    public void CPP_32822_Validate_Customer_Ability_To_Update_Extra_Money_On_Step3_Of_AutoPay_Enrollment_And_Proceed_To_Step4_PPC(){
        String username = TestDataHandler.ppcData.getPpcData().get(4).get("username");
        String password = TestDataHandler.ppcData.getPpcData().get(4).get("password");
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("PlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");
        String creditCard = TestDataHandler.ppcData.getPpcData().get(0).get("cardNumber");
        String cvv = TestDataHandler.ppcData.getPpcData().get(0).get("cvv");
        String expiryDate = TestDataHandler.ppcData.getPpcData().get(0).get("expiryDate");
        String extraMoney = TestDataHandler.ppcData.getPpcData().get(0).get("extraMoney");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getHeaderComponent().clickCurrentPlan();
        getHeaderComponent().clickOnChangePlanBtn();
        //getPlanPage().ppcSelectPlanTab(planTab);
       // getPlanPage().selectPlan("40");
        //getPaymentPage().clickOnContinue();
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getAutoPay().clickOnAddCard();
        getAutoPay().setPaymentInfo(creditCard,expiryDate,cvv);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().postalCodeResend();
        //getAutoPay().clickOnSaveCardCheckbox();
        getPaymentPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().clickOnEnrollAutoPay();
        getAutoPay().addExtraMoney(extraMoney);
        getAutoPay().validateSavedCreditCard();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().validateReviewOrderInPPC();
        getReviewOrderPage().clickOnTermAndConditions();
    }
}