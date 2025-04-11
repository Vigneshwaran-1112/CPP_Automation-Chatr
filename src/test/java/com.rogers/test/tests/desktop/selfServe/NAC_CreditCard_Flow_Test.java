package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class NAC_CreditCard_Flow_Test extends BaseTest {

    @Test(groups = {"NACCC","Regression", "DAYONE", "Sanity","E2E"}) //invocationCount = 10
    public void CPP_24079_Validate_NAC_Flow_Using_CreditCard() throws InterruptedException {
        //Get Nac Flow Data
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = "25"; //TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String topUp = "10";//TestDataHandler.nacData.getNacData().get(0).get("topUp");
        String provinceFullName = TestDataHandler.nacData.getNacData().get(0).get("provinceFullName");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();
        // Change index value for selection of phone numbers
        int index = 1;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getDriver().findElement(By.xpath("(//div[@class='ds-radioButton__innerCircle'])[2]")).click();
        getSimPage().setSimDetails(simSerialNumber);
    //    getSimPage().setSimDetails("89302720401940050068");
        getSimPage().selectPhoneNumber(index);
        String phoneNumber = getSimPage().getPhoneNumber(index);
        getSimPage().waitForSimPageLoad();
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnSaveCCCheckBox();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().validateSummaryDetails(plan, phoneNumber, firstName + " " + lastName, dateOfBirth, email, topUp);
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city, provinceFullName);
        System.out.println(phoneNumber+" is Activated");
        getEASPage().setNacInDataSheet(phoneNumber,"Active");
    }
    /*
        @Test(groups = {"NACCC","qaAuto", "E2E"})
        public void CPP_12241_Validate_OrderSummaryDetails_In_NACFlow() {
            //Get Nac Flow Data
            String province = TestDataHandler.cityData.getCityData().get(0).get("province");
            String city = TestDataHandler.cityData.getCityData().get(0).get("city");
            String plan = TestDataHandler.planData.getPlanData().get(0).get("planValue");
            String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
            String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
            String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
            String topUp = TestDataHandler.planData.getPlanData().get(0).get("topUp");
            String provinceFullName = TestDataHandler.cityData.getCityData().get(0).get("provinceFullName");
            String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
            String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
            String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
            String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
            String altPhoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("altPhoneNumber");
            String simSerialNumber = getDB().getSIMSerialNumber();

            int index = 2;
            getHeaderComponent().clickActivate();
            getPlanPage().waitForPlanPageLoad();
            getPlanPage().selectCity(province, city);
            getPlanPage().selectPlan(plan);
            getPlanPage().selectAddOns();
            getPlanPage().removeAddOns(plan);
            getPlanPage().selectAddOns();
            getPlanPage().clickOnContinue();
            getSimPage().waitForSimPageLoad();
            getSimPage().setSimDetails(simSerialNumber);
            getSimPage().selectPhoneNumber(index);
            getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
            getSimPage().setAddress(city);
            getSimPage().clickOnContinue();
            getPaymentPage().waitForPaymentPageLoad();
            getPaymentPage().selectAutoPay();
            getTopUpFormPage().selectPaymentMethod("Credit");
            getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
            getPaymentPage().selectBillingAddressAsPrimaryAddress();
            getPaymentPage().clickOnContinue();
            getReviewOrderPage().waitForReviewOrderPageLoad();
            getReviewOrderPage().clickOnPaymentTermsAndConditions();
            getReviewOrderPage().clickOnContinue();
            getOrderConfirmationPage().waitForOrderConfirmationPage();
            getOrderConfirmationPage().validateOrderSummaryDetails(city, provinceFullName);
        }
        @Test(groups = {"NACCC","NAC", "E2E", "Regression"})
        public void CPP_12178_Validate_Error_Message_for_Cart_Value_Greater_Than_300_NAC_Flow() {
            //Get Nac Flow Data
            String province = TestDataHandler.cityData.getCityData().get(1).get("province");
            String city = TestDataHandler.cityData.getCityData().get(1).get("city");
            String plan = TestDataHandler.planData.getPlanData().get(0).get("planValue");
            String topUp = TestDataHandler.planData.getPlanData().get(1).get("topUp");
            String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
            String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
            String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
            String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
            String altPhoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("altPhoneNumber");
            String simSerialNumber = getDB().getSIMSerialNumber();

            int index = 2;
            getHeaderComponent().clickActivate();
            getPlanPage().waitForPlanPageLoad();
            getPlanPage().selectCity(province, city);
            getPlanPage().selectPlan(plan);
            getPlanPage().clickOnContinue();
            getSimPage().waitForSimPageLoad();
            getSimPage().setSimDetails(simSerialNumber);
            getSimPage().selectPhoneNumber(index);
            getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
            getSimPage().setAddress(city);
            getSimPage().clickOnContinue();
            getPaymentPage().waitForPaymentPageLoad();
            getPaymentPage().validateErrorMessageForInvalidTopUpValues(topUp);
        }
        @Test(groups = {"NACCC","qaAuto", "E2E"})
        public void CPP_29251_Validate_OverWrite_Billing_Address() {
            String province = TestDataHandler.cityData.getCityData().get(0).get("province");
            String city = TestDataHandler.cityData.getCityData().get(0).get("city");
            String city2 = TestDataHandler.cityData.getCityData().get(6).get("city");
            String city3 = TestDataHandler.cityData.getCityData().get(4).get("city");
            String plan = TestDataHandler.planData.getPlanData().get(5).get("planValue");
            String topUp = TestDataHandler.planData.getPlanData().get(2).get("topUp");
            String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
            String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
            String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
            String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
            String altPhoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("altPhoneNumber");
            String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
            String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
            String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
            String address = TestDataHandler.cityData.getCityData().get(7).get("cityAddress");
            String country = TestDataHandler.cityData.getCityData().get(4).get("country");
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
            getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
            getSimPage().setAddress(city);
            getSimPage().clickOnContinue();
            getPaymentPage().waitForPaymentPageLoad();
            getPaymentPage().selectAutoPay();
            getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
            getSimPage().setAddress(city3);
            getSimPage().changeCityName(city2, address);
        }

        @Test(groups = {"NACCC","qaAuto", "E2E"})
        public void CPP_29245_selectOtherCountries_At_Billing_Details() {
            String province = TestDataHandler.cityData.getCityData().get(0).get("province");
            String city = TestDataHandler.cityData.getCityData().get(0).get("city");
            String city2 = TestDataHandler.cityData.getCityData().get(5).get("city");
            String plan = TestDataHandler.planData.getPlanData().get(0).get("planValue");
            String topUp = TestDataHandler.planData.getPlanData().get(2).get("topUp");
            String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
            String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
            String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
            String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
            String altPhoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("altPhoneNumber");
            String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
            String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
            String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
            String billingDetails = TestDataHandler.cityData.getCityData().get(5).get("billingDetails");
            String country = TestDataHandler.cityData.getCityData().get(5).get("country");
            String provinceFullName = TestDataHandler.cityData.getCityData().get(0).get("provinceFullName");
            String simSerialNumber = getDB().getSIMSerialNumber();
            int index = 2;
            getHeaderComponent().clickActivate();
            getPlanPage().waitForPlanPageLoad();
            getPlanPage().selectCity(province, city);
            getPlanPage().selectPlan(plan);
            getPlanPage().clickOnContinue();
            getSimPage().waitForSimPageLoad();
            getSimPage().setSimDetails(simSerialNumber);
            getSimPage().selectPhoneNumber(index);
            getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
            getSimPage().setAddress(city);
            getSimPage().clickOnContinue();
            getPaymentPage().waitForPaymentPageLoad();
            getPaymentPage().selectAutoPay();
            getTopUpFormPage().selectPaymentMethod("Credit");
            getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
            getSimPage().selectOtherBillingAddress(billingDetails);
            getTopUpFormPage().setNames(firstName, lastName);
            getTopUpFormPage().selectCountry(country);
            getSimPage().setAddress(city2);
            getPaymentPage().clickOnContinue();
            getReviewOrderPage().waitForReviewOrderPageLoad();
            getReviewOrderPage().clickOnPaymentTermsAndConditions();
            getReviewOrderPage().clickOnContinue();
            getOrderConfirmationPage().waitForOrderConfirmationPage();
            getOrderConfirmationPage().validateOrderSummaryDetails(city, provinceFullName);
        }
    */
    @Test(groups = {"NACCC","NAC", "DAYONE", "qaAuto", "pfour"})
    public void CPP_29254_Validate_Alert_Message_for_LocationChange_NotConfirmed() {
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getSimPage().locationNotificationMessage();
    }

    @Test(groups = {"NACCC","NAC", "DAYONE", "qaAuto", "pfour"})
    public void CPP_29253_Validate_Alert_Message_for_LocationChange_Confirmed() {
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        //getPlanPage().selectCity(province, city);
        getSimPage().locationNotificationMessage();
    }

    @Test(groups = {"NACCC","Billing", "DAYONE", "qaAuto", "pfour"})
    public void CPP_27678_validate_User_Select_Suggested_Address() {
        //Get Nac Flow Data
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
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();
        String city2 = TestDataHandler.nacData.getNacData().get(0).get("city");
        // Change index value for selection of phone numbers
        int index = 1;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getSimPage().setAddress(city2);
    }

    @Test(groups = {"NACCC","Billing", "DAYONE", "qaAuto", "pfour","SS","NAC","P1"})
    public void CPP_27675_validate_User_Select_Canada_USA_Billing_Address() {
        //Get Nac Flow Data
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
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String country = TestDataHandler.nacData.getNacData().get(0).get("country");
        String simSerialNumber = getDB().getSIMSerialNumber();
        // Change index value for selection of phone numbers
        int index = 1;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().validationForTheCountryChange(country);
    }
    @Test(groups = {"NACCC","Billing", "DAYONE", "qaAuto", "pfour","SS","NAC","P1"})
    public void CPP_27676_validate_User_Change_Country_To_USA() {
        //Get Nac Flow Data
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
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String country = TestDataHandler.nacData.getNacData().get(1).get("country");
        String simSerialNumber = getDB().getSIMSerialNumber();
        // Change index value for selection of phone numbers
        int index = 1;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().selectAutoPay();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetailswithOutTopUp(creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().validationForTheCountryChange(country);
        getPaymentPage().postalCodeSend("AK99580");
    }

    @Test(groups = {"NACCC","Billing", "DAYONE", "qaAuto", "pfour"})
    public void CPP_29251_validate_User_Able_To_Change_Selected_Address() {
        //Get Nac Flow Data
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String city2 = TestDataHandler.nacData.getNacData().get(1).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String topUp = TestDataHandler.nacData.getNacData().get(0).get("topUp");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String address = TestDataHandler.nacData.getNacData().get(0).get("cityAddress");
        String simSerialNumber = getDB().getSIMSerialNumber();
        // Change index value for selection of phone numbers
        int index = 1;
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
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().setNames(firstName, lastName);
        getSimPage().setAddress(city2);
        getTopUpFormPage().setManuallyBillingAddress(address, city, "");
    }

    @Test(groups = {"NACCC","Billing", "DAYONE", "qaAuto", "pfour"})
    public void CPP_29246_validate_State_billing_Address_Option_Select_Country_Canada() {
        //Get Nac Flow Data
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
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String country = TestDataHandler.nacData.getNacData().get(0).get("country");
        String city2 = TestDataHandler.nacData.getNacData().get(0).get("city");
        String simSerialNumber = getDB().getSIMSerialNumber();
        // Change index value for selection of phone numbers
        int index = 1;
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
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getTopUpFormPage().selectCountry(country);
        getSimPage().setAddress(city2);
    }
    @Test(groups = {"NACCC","Billing", "DAYONE", "qaAuto", "pfour","SS","NAC","P1"})
    public void CPP_27674_Validate_International_Other_Countries_billing_address_option() {
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String city2 = TestDataHandler.nacData.getNacData().get(2).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String topUp = TestDataHandler.nacData.getNacData().get(0).get("topUp");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String country = TestDataHandler.nacData.getNacData().get(2).get("country");
        String postalCode = TestDataHandler.nacData.getNacData().get(2).get("postalCode");
        String province2 = TestDataHandler.nacData.getNacData().get(2).get("provinceFullName");
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
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().selectAutoPay();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getSimPage().selectOtherBillingAddress("Other Countries");
        getTopUpFormPage().validateAllMandatoryFiledInBillingAddress();
        getTopUpFormPage().setNames(firstName, lastName);
        getTopUpFormPage().selectCountry(country);
        getTopUpFormPage().setManuallyBillingAddressOtherCountry("Auto Test",city2,postalCode,province2);
    }

    @Test(groups = {"NACCC","AccountBalance", "DAYONE", "qaAuto", "pone","SS","NAC","P1"})
    public void CPP_26144_Validate_Error_Message_for_Cart_Value_Greater_Than_300_NAC_Flow() {
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
        getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        int itopUp = 301 - Integer.parseInt(plan);
        String topUp = Integer.toString(itopUp);
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().validateErrorMessageForInvalidTopUpValues(topUp);
    }

    @Test(groups = {"NACCC","AccountBalance", "DAYONE", "qaAuto", "pone"})
    public void CPP_26098_Validate_Account_Balance_And_TopUp_Amount_Equal_To_300_NAC_Flow() {
        //Get Nac Flow Data
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
//        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();
        // Change index value for selection of phone numbers
        int index = 1;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        String plan =getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        //getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        int itopUp = 300 - Integer.parseInt(plan);
        String topUp = Integer.toString(itopUp);
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getTopUpFormPage().validateTopUpFieldWithEqualAmount(topUp);
    }

    @Test(groups = {"NACCC","AccountBalance", "DAYONE", "qaAuto", "ptwo"})
    public void CPP_26145_Validate_Account_Balance_And_TopUp_Amount_less_Than_To_300_NAC_Flow() {
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String simSerialNumber = getDB().getSIMSerialNumber();
        // Change index value for selection of phone numbers
        int index = 1;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);*/
        /*getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        int itopUp = 299 - Integer.parseInt(plan);
        String topUp = Integer.toString(itopUp);
        getTopUpFormPage().selectPaymentMethod("Credit");
        getAutoPay().setPaymentInfo(creditCard, expiryDate, cvv);
        getTopUpFormPage().validateTopUpFieldWithEqualAmount(topUp);
    }

    @Test(groups = {"NACCC","addOn", "DAYONE", "qaAuto", "ptwo"})
    public void CPP_26936_Validate_Add_And_Remove_AddOn_From_Customer_Cart() {
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().validateAddOnSelect();
        getPlanPage().validateAddOnRemove(plan);
    }

    @Test(groups = {"NACCC","Billing", "DAYONE", "qaAuto", "pfour"})
    public void CPP_29121_Validate_extra_money_reflect_in_shopping_cart() {
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
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnSaveCCCheckBox();
        getPaymentPage().clickOnContinue();
        getPaymentPage().validateExtraMoneyAddInCart(topUp);
    }
    @Test(groups = {"NACCC", "Billing","DAYONE","qaAuto","pfour","SS","NAC","P1"})
    public void CPP_29122_Validate_extra_money_reflect_in_shopping_cart_AutoPay_Enrollment() {
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
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
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
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().selectAutoPay();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnSaveCCCheckBox();
        getPaymentPage().clickOnContinue();
        getPaymentPage().validateExtraMoneyAddInCartAutoPay(topUp);
    }

    @Test(groups = {"NACCC","Nac", "DAYONE", "qaAuto","SS","NAC","P1"})
    public void CPP_34898_Validate_Validate_Using_Voucher_Is_Barred() {
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String creditCard = TestDataHandler.carecustomerdata.getCareCustomerData().get(0).get("cardNumber");
        String cvv = TestDataHandler.carecustomerdata.getCareCustomerData().get(0).get("cvv");
        String expiryDate = TestDataHandler.carecustomerdata.getCareCustomerData().get(0).get("expiryDate");
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
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Voucher");
        getPaymentPage().enterInvalidVoucherPin3Times();
        getPaymentPage().validateInvalidVoucherPinError();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetailswithOutTopUp( creditCard, cvv, expiryDate);
        getTopUpFormPage().validateCreditCardField();
    }
    @Test(groups = {"NACCC","NAC", "DAYONE", "qaAuto","SS","P1"})
    public void CPP_31145_Validate_NAC_Flow_Using_AutoPay() {
        // Get Nac Flow Data
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String topUp = TestDataHandler.nacData.getNacData().get(0).get("topUp");
        String provinceFullName = TestDataHandler.nacData.getNacData().get(0).get("provinceFullName");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();
        // Change index value for selection of phone numbers
        int index = 3;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().validateAddOnSelect();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getDriver().findElement(By.xpath("(//div[@class='ds-radioButton__innerCircle'])[2]")).click();
        //getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        String phoneNumber = getSimPage().getPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getSimPage().selectPaymentMethod("Auto-Pay");
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnSaveCCCheckBox();
        //getReviewOrderPage().clickOnAutoPayCheckBox();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().validateSummaryDetailsAutoPay(plan, phoneNumber, firstName + " " + lastName, dateOfBirth, email, topUp);
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city, provinceFullName);
        getOrderConfirmationPage().validateDataAddonOrderSummaryPage();
    }
    @Test(groups = {"NACCC", "Billing","DAYONE","qaAuto","pfour","SS","NAC","P1" })
    public void CPP_35022_Validate_that_the_autoPay_bonus_attached_to_the_plan_should_be_visible_in_the_Step_5() {
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String provinceFullName = TestDataHandler.careNacData.getCareNacData().get(0).get("provinceFullName");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String topUp = TestDataHandler.nacData.getNacData().get(0).get("topUp");
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
        getPaymentPage().selectAutoPay();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnSaveCCCheckBox();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city, provinceFullName);
        getPPCPage().validateAutoPayBonusAttachedTiPlan();
        getPaymentPage().waitForPaymentPageLoad();
        getChampPage().openNewTabInSameWindowForCare();
        getCarePortalHomePage().customerSearch(phoneNumber);
        getCarePortalHomePage().clickOnCheck();
        getCarePortalHomePage().clickOnClickHere();
        getCarePortalDashBoard().validateDashBoardPage();
        getCarePortalDashBoard().validateAccountStatusDetails("Active");
        getCarePortalDashBoard().validateAutoPayEnrolledIsExpired();
    }
    @Test(groups = {"NACCC", "Billing","DAYONE","qaAuto","pfour","run" })
    public void CPP_37270_Validate_that_the_autopay_bonus_attached_to_the_plan_should_be_visible_in_the_Step_5() {
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
        getPaymentPage().selectAutoPay();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnSaveCCCheckBox();
        getPaymentPage().clickOnContinue();
        getPaymentPage().validateExtraMoneyAddInCartAutoPay(topUp);
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getPPCPage().validateAutoPayBonusAttachedTiPlan();
    }
    @Test(groups = {"NACCC", "Autopay","DAYONE","qaAuto","pfour","run" })
    public void CPP_29123_User_switching_from_autoPay_to_pay_Once() {
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
        getPaymentPage().selectAutoPay();
        getPPCPage().selectPayOnce();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnSaveCCCheckBox();
        getPaymentPage().clickOnContinue();
        getPaymentPage().validateExtraMoneyAddInCart(topUp);
    }
    @Test(groups = {"NACCC","qaAuto","DAYONE"})
    public void CPP_38933_User_is_able_to_submit_NAC_order_with_a_plan_that_is_configured_with_AutoPay_Bonus() {
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
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();
        int index = 2;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        //getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan("50");
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().selectAutoPay();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnSaveCCCheckBox();
        getPaymentPage().clickOnContinue();
        getPaymentPage().validateExtraMoneyAddInCartAutoPay(topUp);
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getPPCPage().validateAutoPayBonusAttachedTiPlan();
    }
/*
    @Test(groups = {"NACCC","NAC", "Regression", "Scrum", "Sanity","E2E"})
    public void CPP_24079_Validate_NAC_Flow_Using_CreditCard_FR() {
        //Get Nac Flow Data
        String province = TestDataHandler.nacData.getNacData().get(0).get("province");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String topUp = TestDataHandler.nacData.getNacData().get(0).get("topUp");
        String provinceFullName = TestDataHandler.nacData.getNacData().get(0).get("provinceFullName");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String country = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();
        // Change index value for selection of phone numbers
        int index = 2;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getHeaderComponent().changeLanguage("French");
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlanFrench(plan);F
        getPlanPage().clickOnContinueFrench();
        getSimPage().waitForSimPageLoad();
        getSimPage().validateOrderSimLinkFrench();
        getSimPage().setSimDetailsFrench(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        String phoneNumber = getSimPage().getPhoneNumber(index);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().validateSummaryDetailsFrench(plan, phoneNumber,firstName + " " + lastName,dateOfBirth,email,topUp);
        getReviewOrderPage().clickOnPaymentTermsAndConditionsFrench();
        getReviewOrderPage().clickOnContinueFrench();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetailsFrench(city, provinceFullName);
    }*/


    @Test(groups = {"NacFlow","qaAuto","onetoone","SS","NAC","P1"})
    public void CPP_54706_Validate_NAC_Flow_Ontario_Tax_validation() throws InterruptedException {
         String province = TestDataHandler.nacData.getNacData().get(0).get("province");
         String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        // String plan = "15";//TestDataHandler.planData.getPlanData().get(4).get("planValue");
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
        String extraMoney = "50";
          float percentage = 13;
        // Change index value for selection of phone numbers
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
        //getPaymentPage().selectAutoPay();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(extraMoney, creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnSaveCCCheckBox();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getPaymentPage().waitForPaymentPageLoad();
        getOrderConfirmationPage().validateExtraMoneyInOrderConfirmationPageInCart(extraMoney);
        getOrderConfirmationPage().validateOrderSummaryDetails(city, provinceFullName);
        getEASPage().setNacInDataSheet(phoneNumber,"AUTOPAY");
       /* getOrderConfirmationPage().validatingTaxAmount(percentage,plan,50);
*//** EMAIL NOTIFICATION VALIDATION *//*
        getChampPage().openNewTabInSameWindowForCare();
        getCarePortalHomePage().customerSearch(phoneNumber);
        getCarePortalHomePage().clickOnCheck();
        getCarePortalHomePage().clickOnClickHere();
        getCarePortalDashBoard().clickOnHistoryReports();
        getCarePortalDashBoard().switchToLatestTab();
        getHistoryReportsPage().navigateToCARE("Order");
        String orderId = getHistoryReportsPage().getLatestOrderId();
        getChampPage().accountLogOut("CARE");
        getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();
        getChampPage().openNewTabInSameWindowForOutlook(orderId,"NAC");*/
    }
    @Test(groups = {"NacFlow","qaAuto","onetoone"})
    public void CPP_54699_Validate_NAC_Flow_Alberta_Tax_validation() {
        String province = "AB";
        String city = "Edmonton";
//        String plan = TestDataHandler.planData.getPlanData().get(4).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();
        float percentage = 5;
        // Change index value for selection of phone numbers
        int index = 1;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
       /* getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
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
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getPaymentPage().setCreditCardDetails("", creditCard, cvv, expiryDate);
        getPaymentPage().setCreditCardDetailswithOutTopUp( creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validatingGSTTaxAmount(percentage,plan);
    }
    @Test(groups = {"NacFlow","qaAuto","onetoone"})
    public void CPP_54700_Validate_NAC_Flow_British_Columbia_Tax_validation() {
        String province = "BC";
        String city = "Vancouver";
//      String plan = TestDataHandler.planData.getPlanData().get(4).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();
        float percentageGST = 5;
        float percentagePST = 7;
        // Change index value for selection of phone numbers
        int index = 1;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
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
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails("", creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validatingPSTTaxAmount(percentageGST,percentagePST,plan);
    }
    @Test(groups = {"NacFlow","qaAuto","onetoone","SS","NAC","P1"})
    public void CPP_54708_Validate_NAC_Flow_Quebec_Tax_validation() {
        String province = "QC";
        String city = "Montreal";
        String plan = TestDataHandler.planData.getPlanData().get(4).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();
        float percentageGST = 5;
        double percentageQST = 9.975;
        // Change index value for selection of phone numbers
        int index = 1;
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
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails("", creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validatingQSTTaxAmount(percentageGST,percentageQST,plan);
    }
    @Test(groups = {"NACCC","Regression", "DAYONE", "Sanity","E2E"})
    public void CPP_37186_Validate_Additional_Amount_Balance_Displayed_Order_Summary_NAC_Welcome_Email() throws IOException, InterruptedException, SQLException {
//      String email = getSignInPage().generateRandomEmail();
        String simSerialNumber = getDB().getSIMSerialNumber();
        String province =TestDataHandler.nacData.getNacData().get(0).get("province");
        String provinceFullName = TestDataHandler.nacData.getNacData().get(0).get("provinceFullName");
        String city = TestDataHandler.nacData.getNacData().get(0).get("city");
        String plan = "50";//TestDataHandler.nacData.getNacData().get(0).get("planValue");
        String planTab = TestDataHandler.nacData.getNacData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacData.getNacData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacData.getNacData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacData.getNacData().get(0).get("expiryDate");
        String topUp = TestDataHandler.nacData.getNacData().get(0).get("topUp");
        String firstName = TestDataHandler.nacData.getNacData().get(0).get("firstName");
        String lastName = TestDataHandler.nacData.getNacData().get(0).get("lastName");
        String email = TestDataHandler.nacData.getNacData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacData.getNacData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacData.getNacData().get(0).get("altPhoneNumber");
        int index = 2;
        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().selectPhoneNumber(index);
        String phoneNumber = getSimPage().getPhoneNumber(index);
        System.out.println(phoneNumber);
        getSimPage().setProfileDetails(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getPaymentPage().selectAutoPay();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp, creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnSaveCCCheckBox();
        getPaymentPage().clickOnContinue();
        getPaymentPage().validateExtraMoneyAddInCartAutoPay(topUp);
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnSubmit();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city, provinceFullName);
        String orderNumber = getOrderConfirmationPage().getNacOrderNumber();

        /** ENS QUERY PART
        ENSQuery ensQuery = new ENSQuery();
        Thread.sleep(30000);
        System.out.println("ENS connection established successfully");
        String result = ensQuery.getProductorderID(email,"CPP_ORDER_ACTIVATION");
        getSignInPage().validateActivationOrderIdForNacFlow(email,result,orderNumber,plan+".00",phoneNumber); **/

        getChampPage().openNewTabInSameWindowForCare();
        getCarePortalHomePage().customerSearch(phoneNumber);
        getCarePortalHomePage().clickOnCheck();
        getCarePortalHomePage().clickOnClickHere();
        getCarePortalDashBoard().clickOnHistoryReports();
        getCarePortalDashBoard().switchToLatestTab();
        getHistoryReportsPage().navigateToCARE("Order");
        String orderId = getHistoryReportsPage().getLatestOrderId();
        getChampPage().accountLogOut("CARE");
        getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();
        getChampPage().openNewTabInSameWindowForOutlook(orderId,"NAC");
        getChampPage().validateAutopayStatusInEmail("Enroll");

        /** ENS PORTAL CHECKING
         getChampPage().openNewTabInSameWindowForENSPortal(email,phoneNumber,"1");
         getChampPage().openNewTabInSameWindowForENSPortal("","416-843-3247","3");
         String result = ensQuery.getProductorderID("emailvalidationuitest441@gmail.com");
         getSignInPage().validateActivationOrderIdForNacFlow("emailvalidationuitest441@gmail.com",result,"581851625155975532","70"+".00","416-278-2182");
         getOrderConfirmationPage().waitForOrderConfirmationPage();
         getSignInPage().validateActivationOrderIdForNacFlow(email,"CPP_ORDER_ACTIVATION",orderNumber,plan,phoneNumber); **/
    }
}