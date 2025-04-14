package com.rogers.test.tests.desktop.E2E;

import com.rogers.data.handlers.ExcelUtility;
import com.rogers.data.handlers.JavaUtility;
import com.rogers.data.handlers.TestDataHandler;
import com.rogers.pages.BasePage;
import com.rogers.test.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CPP_E2E_TestCases extends BaseTest {


    @Test(groups = {"E2E"})
    public void guest_Topup_Flow() {
        String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");
        String firstName = TestDataHandler.gtpData.getGtpData().get(0).get("firstName");
        String lastName = TestDataHandler.gtpData.getGtpData().get(0).get("lastName");
        String city = TestDataHandler.gtpData.getGtpData().get(0).get("city");
        String creditCard = TestDataHandler.gtpData.getGtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.gtpData.getGtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.gtpData.getGtpData().get(0).get("expiryDate");
        String topUp = TestDataHandler.gtpData.getGtpData().get(0).get("topUp");

        // getHeaderComponent().changeLanguage("French");
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

    @Test(groups = {"E2E"})
    public void nac_With_CreditCard_pSim_SS() {

        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String provinceFullName = TestDataHandler.nacData.getNacData().get(0).get("provinceFullName");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();

        // Change index value for selection of phone numbers
        int index = 3;
       // getHeaderComponent().changeLanguage("French");
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().chooseSim("psim");
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        String phoneNumber = getSimPage().getPhoneNumber(index);
        getSimPage().waitForSimPageLoad();
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnSaveCCCheckBox();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().validateSummaryDetails(plan, phoneNumber, firstName + " " + lastName, dateOfBirth, email);
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city, provinceFullName);
        System.out.println(phoneNumber+" is Activated");
       // String phoneNumber="416-904-1183";
        String status = getDB().getCTNStatus(phoneNumber.replaceAll("[^0-9]", ""));
      //  String status = getDB().getCTNStatus("416-904-1183".replaceAll("[^0-9]", ""));
        Assert.assertEquals(status, "AI");
        getChampPage().navigateToRetailerPage();
        getCarePortalHomePage().searchCTN(phoneNumber);
        getCarePortalDashBoard().validatePage(phoneNumber);
        getCarePortalDashBoard().validateDashBoardPage();
        getCarePortalDashBoard().validateAccountStatusDetails();

    }
@Test(groups="E2E")
    public void nacWithAutoPay_SS() {

    String province = TestDataHandler.nacData.getNacData().get(0).get("province");
    String city = TestDataHandler.nacData.getNacData().get(0).get("city");
    String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
    String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
    String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
    String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
    String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
    String provinceFullName = TestDataHandler.nacData.getNacData().get(0).get("provinceFullName");
    String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
    String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
    String email = TestDataHandler.nacData.getNacData().get(0).get("email");
    String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
//   String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
    String simSerialNumber = getDB().getSIMSerialNumber();
    int index = 2;
    // getHeaderComponent().changeLanguage("French");
    getHeaderComponent().clickActivate();
    getPlanPage().waitForPlanPageLoad();
    getPlanPage().selectCity(province, city);
    getPlanPage().selectPlanTab(planTab);
    getPlanPage().selectPlan(plan);
    getPlanPage().clickOnContinue();
    getSimPage().waitForSimPageLoad();
    getSimPage().chooseSim("psim");
    getSimPage().setSimDetails(simSerialNumber);
    getSimPage().selectPhoneNumber(index);
    String phoneNumber = getSimPage().getPhoneNumber(index);
    getSimPage().waitForSimPageLoad();
    getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth);
    getSimPage().setAddress(city);
    getSimPage().clickOnContinue();
    getPaymentPage().waitForPaymentPageLoad();
    getPaymentPage().selectAutoPay();
    getPaymentPage().waitForPaymentPageLoad();
    getTopUpFormPage().selectPaymentMethod("Credit");
    getPaymentPage().setCreditCardDetails(creditCard, cvv, expiryDate);
    getPaymentPage().selectBillingAddressAsPrimaryAddress();
    getPaymentPage().clickOnSaveCCCheckBox();
    getPaymentPage().clickOnContinue();
    getReviewOrderPage().waitForReviewOrderPageLoad();
    getReviewOrderPage().validateSummaryDetailsAutoPay(plan, phoneNumber, firstName + " " + lastName, dateOfBirth, email);
    getReviewOrderPage().clickOnPaymentTermsAndConditions();
    getReviewOrderPage().clickOnSubmit();
    getOrderConfirmationPage().waitForOrderConfirmationPage();
    getOrderConfirmationPage().validateOrderSummaryDetails(city, provinceFullName);
    System.out.println(phoneNumber + " is Activated");
    String status=getDB().getCTNStatus(phoneNumber.replaceAll("[^0-9]", ""));
    System.out.println(status);
    Assert.assertEquals(status, "AI");
    getChampPage().navigateToRetailerPage();
    getCarePortalHomePage().searchCTN(phoneNumber);
    getCarePortalDashBoard().validatePage(phoneNumber);
    getCarePortalDashBoard().validateDashBoardPage();
    getCarePortalDashBoard().validateAccountStatusDetails();

    }

    @Test(groups={"E2E"})
    public void nacWithCreditCard_Retail(){


        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String provinceFullName = TestDataHandler.nacData.getNacData().get(0).get("provinceFullName");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String simSerialNumber = getDB().getSIMSerialNumber();

        int index=3;

        getChampPage().navigateToRetailerPage();
        /*getHeaderComponent().changeLanguage("French");*/
        getCarePortalHomePage().activateNac();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().chooseSim("psim");
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        String phoneNumber = getSimPage().getPhoneNumber(index);
        getSimPage().waitForSimPageLoad();
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnSaveCCCheckBox();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().validateSummaryDetails(plan, phoneNumber, firstName + " " + lastName, dateOfBirth, email);
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city, provinceFullName);
        System.out.println(phoneNumber+" is Activated");
        String status=getDB().getCTNStatus(phoneNumber.replaceAll("[^0-9]", ""));
        System.out.println(status);
        Assert.assertEquals(status, "AI");
    }

    @Test(groups = {"E2E"})
    public void nacWithAutoPay_Retail(){

        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String provinceFullName = TestDataHandler.nacData.getNacData().get(0).get("provinceFullName");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String simSerialNumber = getDB().getSIMSerialNumber();

        int index=3;

        getChampPage().navigateToRetailerPage();
        /*getHeaderComponent().changeLanguage("French");*/
        getCarePortalHomePage().activateNac();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().chooseSim("psim");
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        String phoneNumber = getSimPage().getPhoneNumber(index);
        getSimPage().waitForSimPageLoad();
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().selectAutoPay();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnSaveCCCheckBox();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().validateSummaryDetails(plan, phoneNumber, firstName + " " + lastName, dateOfBirth, email);
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city, provinceFullName);
        System.out.println(phoneNumber+" is Activated");
        String status=getDB().getCTNStatus(phoneNumber.replaceAll("[^0-9]", ""));
        System.out.println(status);
        Assert.assertEquals(status, "AI");


    }

    @Test
    public void enableAutopay(){




        getChampPage().navigateToRetailerPage();
        getCarePortalHomePage().waitForCareHomePageLoad();
        getCarePortalHomePage().searchCTN("4169041183");
        getCarePortalDashBoard().validatePage("4169041183");
        getCarePortalDashBoard().validateAutoPayStatus();
        getCarePortalDashBoard().enableAutoPay();
       // getPaymentPage().setCreditCardDetails();
        getautoPayEnrollPage().enrollAutopayWithoutTopup();
        getautoPayEnrollPage().enrollAutoPayAction();
    }

    @Test
    public void getData(){


        String CTN =getBasePage().getDataFromExcel();

        System.out.println(CTN);
    }

//    public void getDatas(){
//        String CTN=getChampPage().getDataFromExcel();
//        System.out.println(CTN);
//    }






}






