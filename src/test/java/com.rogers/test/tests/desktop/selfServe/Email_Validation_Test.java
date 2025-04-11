package com.rogers.test.tests.desktop.selfServe;
import com.rogers.data.handlers.TestDataHandler;
import com.rogers.pages.ENSQuery;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Email_Validation_Test extends BaseTest {

    @Test(groups = {"NACCC", "Regression", "DAYONE", "Sanity", "E2E"})
    public void CPP_NAC_Welcome_Email_SS() throws FileNotFoundException, InterruptedException, SQLException {
        String email = getSignInPage().generateRandomEmail();
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String topUp = TestDataHandler.nacData.getNacData().get(0).get("topUp");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        //String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();
        int index = 2;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        String phoneNumber = getSimPage().getPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        //getPaymentPage().selectAutoPay();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnSaveCCCheckBox();
        getPaymentPage().clickOnContinue();
        getPaymentPage().validateExtraMoneyAddInCartAutoPay(topUp);
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        String orderNumber = getOrderConfirmationPage().getNacOrderNumber();
        ENSQuery ensQuery = new ENSQuery();
        Thread.sleep(30000);
        System.out.println("ENS connection established successfully");
        String result = ensQuery.getProductorderID(email,"CPP_ORDER_ACTIVATION");
        getSignInPage().validateActivationOrderIdForNacFlow(email, result, orderNumber, plan + ".00", phoneNumber);
    }
    @Test(groups = {"SSPPCT","EAS", "onetoone", "qaAuto"})
    public void CPP_Manage_Add_On_Email_Validation_SS() throws FileNotFoundException, InterruptedException, SQLException {

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("EAS");
        String email = getOrderConfirmationPage().getMailId();
        String ctnNumber = getOrderConfirmationPage().getMobileNumber();
        getAccountManagementPage().clickOnCurrentPlan();
        getHeaderComponent().clickSelectAddOnLink();
        // getCarePortalDashBoard().clickOnManageLink();
        getCarePortalDashBoard().selectAddOnCheckBox();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().clickOnContinue();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().clickOnTermAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().clickOnMyChatr();
        getAccountManagementPage().goToAccountHistory();
        getCarePortalDashBoard().switchToLatestTab();
        getHistoryReportsPage().navigateTo("Order");
        String orderNumber = getOrderConfirmationPage().getLatestOrderNumber();
        getPaymentPage().waitForPaymentPageLoad();
        ENSQuery ensQuery = new ENSQuery();
        Thread.sleep(30000);
        System.out.println("ENS connection established successfully");
        String result = ensQuery.getProductorderID(email,"CPP_ADDON_ENROLLMENT");
        getSignInPage().validateActivationOrderIdForNacFlow(email, result, orderNumber,   "10.00",ctnNumber );

//        ArrayList<String> orderDetails=getOrderConfirmationPage().getOrderDetailsForManageAddOn();
//        getSignInPage().validateActivationOrderIdForManageAddon(orderDetails,"CPP_ADDON_ENROLLMENT");
//        april2024251546@rci.rogers.com  // 804602440313330836 // $10.00 // 416-843-0261
    }
    @Test(groups = {"SSPPCT","DAYTHREE","qaAuto","pfour","EAS"})
    public void CPP_Validate_PPC_using_Credit_card_With_Email_Notification_SS() throws FileNotFoundException, InterruptedException, SQLException {
        String plan = TestDataHandler.ppcData.getPpcData().get(0).get("upGradePlanValue");
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTCC");
        String email = getOrderConfirmationPage().getMailId();
        String ctnNumber = getOrderConfirmationPage().getMobileNumber();
        getHeaderComponent().clickCurrentPlan();
        getHeaderComponent().clickOnChangePlanBtn();
        getPlanPage().ppcSelectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
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
        String orderNumber = getOrderConfirmationPage().getNacOrderNumber();
        getPaymentPage().waitForPaymentPageLoad();
        ENSQuery ensQuery = new ENSQuery();
        Thread.sleep(30000);
        System.out.println("ENS connection established successfully");
        String result = ensQuery.getProductorderID(email,"CPP_PPC_CONFIRMATION");
        getSignInPage().validateActivationOrderIdForNacFlow(email, result, orderNumber,plan+".00",ctnNumber );

    }
    @Test(groups = {"ENROLLT", "EAS", "AutoPay"})
    public void CPP_Validate_Autopay_Enrollment_With_Email_Notification_SS() throws FileNotFoundException, InterruptedException, SQLException {

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        String email = getOrderConfirmationPage().getMailId();
        String ctnNumber = getOrderConfirmationPage().getMobileNumber();
        getAutoPay().enrollAutopay();
        //getAutoPay().addExtraMoney(extraMoney);
        String autoPayAmontValue = getOrderConfirmationPage().getAutopayAmount();
        getAutoPay().clickOnContinue();
        getAutoPay().validateSavedCreditCard();
        getAutoPay().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().validateReviewAutoPayPage();
        getAutoPay().validateTermsAndConditions();
        getAutoPay().clickOnContinue();
        getAutoPay().validateAutopaySucessfulMessage();
        getAutoPay().clickOnMyChatr();
        getAccountManagementPage().goToAccountHistory();
        getCarePortalDashBoard().switchToLatestTab();
        getHistoryReportsPage().navigateTo("Order");
        String orderNumber = getOrderConfirmationPage().getLatestOrderNumber();
        getPaymentPage().waitForPaymentPageLoad();
        ENSQuery ensQuery = new ENSQuery();
        Thread.sleep(30000);
        System.out.println("ENS connection established successfully");
        String result = ensQuery.getProductorderID(email,"CPP_AUTOPAY_ENROLLMENT");
        getSignInPage().validateActivationOrderIdForNacFlow(email, result, orderNumber,  autoPayAmontValue+".00", ctnNumber);
        //april2024251546@rci.rogers.com  416-843-0261
    }
}
