package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

public class NAC_Voucher_Flow_Test extends BaseTest {


    @Test(groups = {"NACVCR", "voucher","DAYTWO","qaAuto","pfour" })
    public void CPP_34899_Validate_No_voucher_entered() {
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();
        int index = 2;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().clickOnVoucherButton();
        getPPCPage().validateDoNotEnterVoucher();
    }
    @Test(groups = {"NACVCR", "voucher","DAYTWO","qaAuto","pfour" })
    public void CPP_34901_Validate_voucher_submitted_but_value_less_than_plan_MSF(){
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(1).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String voucherPIN = TestDataHandler.nacData.getNacData().get(0).get("msfVoucherPIN");
        String simSerialNumber = getDB().getSIMSerialNumber();
        int index = 2;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
       /* getPlanPage().selectPlanTab(planTab);*/
        getPlanPage().selectPlan("50");
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().clickOnVoucherButton();
        getPaymentPage().enterVoucherPin("Voucher10","Status10");
        getPPCPage().validateMSFLessMessageForVoucher();
    }
    @Test(groups = {"NACVCR", "voucher","DAYTWO","qaAuto","pfour" })
    public void CPP_34902_Validate_voucher_submitted_but_value_Greater_than_plan_MSF(){
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String voucherPIN = TestDataHandler.nacData.getNacData().get(0).get("voucherPIN");
        String simSerialNumber = getDB().getSIMSerialNumber();
        int index = 2;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().clickOnVoucherButton();
        getPaymentPage().enterVoucherPin("Voucher50","Status50");
        getPPCPage().validateMSFMessageForVoucher();
    }
    @Test(groups = {"NACVCR","Nac", "DAYTWO", "qaA56uto"})
    public void CPP_34894_Validate_Voucher_pin_already_used() {
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String usedVoucherPIN = TestDataHandler.nacData.getNacData().get(0).get("usedVoucherPIN");
        String simSerialNumber = getDB().getSIMSerialNumber();
        int index = 2;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().clickOnVoucherButton();
        getPaymentPage().enterValidPin("209853150648"); //QA-AUTO2 - 544374996039 //QA-AUTO- 663417507417
        getPaymentPage().validatevouchererror();
    }
    @Test(groups = {"NACVCR","Nac", "DAYTWO", "qaAuto"})
    public void CPP_34895_Validate_Voucher_pin_invalid() {
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();
        int index = 2;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().clickOnVoucherButton();
        getPaymentPage().enterInvalidPin("12345678901");
        getPaymentPage().validateinvalidvouchererror();
    }

    @Test(groups = {"NACVCR","Nac", "DAYTWO", "qaAuto"})
    public void CPP_34887_Validate_UserAbleTo_AddOnlyOne_voucher() {
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String voucherPIN = TestDataHandler.nacData.getNacData().get(0).get("voucherPIN");
        String simSerialNumber = getDB().getSIMSerialNumber();
        int index = 2;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().clickOnVoucherButton();
        getPaymentPage().enterValidPin(voucherPIN);
        getSimPage().validateVoucherAbleToAddOnlyOne(voucherPIN);
    }
    @Test(groups = {"NACVCR","Nac", "DAYTWO", "qaAuto"})
    public void CPP_34889_Validate_voucherCorrectAndIncorrectLength() {
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String voucherPIN = TestDataHandler.nacData.getNacData().get(0).get("voucherPIN");
        String simSerialNumber = getDB().getSIMSerialNumber();
        int index = 2;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().clickOnVoucherButton();
        String voucherPIN2 = voucherPIN.substring(2);
        getPaymentPage().enterInvalidPin(voucherPIN2);
        getPaymentPage().validateinvalidvouchererror();
    }

    @Test(groups = {"NACVCR","Nac", "DAYTWO", "qaAuto"})
    public void CPP_34890_Validate_SuccessfulNacWithVoucher() throws InterruptedException {
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        //String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String provinceFullName = TestDataHandler.nacData.getNacData().get(0).get("provinceFullName");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String voucherPIN = TestDataHandler.nacData.getNacData().get(0).get("nacVoucherPIN");
        String simSerialNumber = getDB().getSIMSerialNumber();
        int index = 2;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        String plan = getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        String phoneNumber = getSimPage().getPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().clickOnVoucherButton();
        voucherPIN = getPaymentPage().enterVoucherPin("Voucher50","Status50");
       // getPaymentPage().clickOnContinue();
        getSimPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().validateSummaryDetailsPIN(plan, phoneNumber, firstName + " " + lastName, dateOfBirth, email, voucherPIN);
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateVoucherOrderSummaryDetails(city, provinceFullName);
        /** EMAIL NOTIFICATION VALIDATION */
        getChampPage().openNewTabInSameWindowForCare();
        getCarePortalHomePage().customerSearch(phoneNumber);
        getCarePortalHomePage().clickOnCheck();
        getCarePortalHomePage().clickOnClickHere();
        getCarePortalDashBoard().clickOnHistoryReports();
        getCarePortalDashBoard().switchToLatestTab();
        getHistoryReportsPage().navigateToCARE("Order");
        String orderId = getHistoryReportsPage().getLatestOrderId();
        getChampPage().accountLogOut("CARE");
        getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();
        getChampPage().openNewTabInSameWindowForOutlook(orderId,"NAC");
    }
    @Test(groups = {"NACVCR", "voucher","DAYTWO","qaAuto","pfour","SS","NAC","P1"})
    public void CPP_45728_Validate_Voucher_Submitted_Value_Less_Than_Plan_MSF_NAC_low(){
   /* @Test(groups = {"NAC partial payment with Voucher"})
    public void TC_02_Validate_E2E_NAC_partial_payment_with_Voucher_and_ensure_the_provisioning_is_successful_in_all_the_systems_like_D1_PBM_RTRM_with_the_email_notification(){*/
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
       // String plan = TestDataHandler.nacData.getNacData().get(1).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String provinceFullName = TestDataHandler.nacData.getNacData().get(0).get("provinceFullName");
        String simSerialNumber = getDB().getSIMSerialNumber();
        int index = 1;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
//       getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan("34");
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        String phoneNumber = getSimPage().getPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().clickOnVoucherButton();
        getPaymentPage().enterVoucherPin("Voucher10","Status10");
        getPPCPage().validateMSFLessMessageForVoucher();
        getSimPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getPPCPage().validateMSFLessMessageForVoucher();
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getOrderConfirmationPage().validateVoucherOrderSummaryDetails(city, provinceFullName);
        getPaymentPage().waitForPaymentPageLoad();
        getChampPage().openNewTabInSameWindowForCare();
        getCarePortalHomePage().customerSearch(phoneNumber);
        getCarePortalHomePage().clickOnCheck();
        getCarePortalHomePage().clickOnClickHere();
        getCarePortalDashBoard().validateDashBoardPage();
        getCarePortalDashBoard().validateAccountStatusDetails("Inactive");
        getEASPage().setNacInDataSheet(phoneNumber,"INACTIVE");
    }
}