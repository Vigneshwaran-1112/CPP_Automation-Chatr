package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class NAC_PortInFlow_Test extends BaseTest{

 /*   @Test(groups = {"PORTINONE","E2E","Regression" })
    public void CPP_21068_Validate_CheckBox_PortIn() {
            String city = TestDataHandler.cityData.getCityData().get(0).get("city");
            String plan = TestDataHandler.planData.getPlanData().get(5).get("planValue");
            String simSerialNumber = getDB().getSIMSerialNumber();
            String province = TestDataHandler.cityData.getCityData().get(0).get("province");
            String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
            String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
            String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
            String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
            String altPhoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("altPhoneNumber");
            String ExistingPhoneNumber = TestDataHandler.customerData.getCustomerData().get(4).get("phoneNumber");
            String serialNumber = TestDataHandler.customerData.getCustomerData().get(6).get("serialNumber");
            String phoneAccountNumber = TestDataHandler.customerData.getCustomerData().get(6).get("phoneAccountNumber");
            String pin = TestDataHandler.customerData.getCustomerData().get(6).get("pin");
            getHeaderComponent().clickActivate();
            getPlanPage().waitForPlanPageLoad();
            getPlanPage().selectCity(province, city);
            getPlanPage().selectPlanTab("3G Nation-Wide Talk, Text & Data");
            getPlanPage().selectPlan(plan);
            getPlanPage().clickOnContinue();
            getSimPage().waitForSimPageLoad();
            getSimPage().setSimDetails(simSerialNumber);
            getSimPage().populateExistingNumber(ExistingPhoneNumber);
            getSimPage().verifyThreePortInFields(serialNumber, phoneAccountNumber, pin);
            getSimPage().clickCheckBoxesForPortIn();
            getSimPage().setProfileDetailsPortIn(firstName, lastName, email, dateOfBirth, altPhoneNumber);
            getSimPage().setAddress(city);
            getSimPage().validateCheckBoxErrorMessage();
    }
    @Test(groups = {"PORTINONE", "E2E","Scrum" })
    public void CPP_21069_Validate_PortInFlow_Enters_ThreeVerifyFields()  {
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
        String plan = TestDataHandler.planData.getPlanData().get(0).get("planValue");
        String simSerialNumber = getDB().getSIMSerialNumber();
        String province = TestDataHandler.cityData.getCityData().get(0).get("province");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
        String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("altPhoneNumber");
        String ExistingPhoneNumber = TestDataHandler.customerData.getCustomerData().get(4).get("phoneNumber");
        String serialNumber = TestDataHandler.customerData.getCustomerData().get(6).get("serialNumber");
        String phoneAccountNumber= TestDataHandler.customerData.getCustomerData().get(6).get("phoneAccountNumber");
        String pin = TestDataHandler.customerData.getCustomerData().get(6).get("pin");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String topUp = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String provinceFullName = TestDataHandler.cityData.getCityData().get(0).get("provinceFullName");

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab("3G Nation-Wide Talk, Text & Data");
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().verifyThreePortInFields(serialNumber,phoneAccountNumber,pin);
        getSimPage().clickCheckBoxesForPortIn();
        getSimPage().setProfileDetailsPortIn(firstName,lastName,email,dateOfBirth,altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp,creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city,provinceFullName);
    }
    @Test(groups = {"PORTINONE", "E2E" })
    public void CPP_21069_Validate_PortInFlow_Enters_OneVerifyField(){
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
        String plan = TestDataHandler.planData.getPlanData().get(5).get("planValue");
        String simSerialNumber = getDB().getSIMSerialNumber();
        String province = TestDataHandler.cityData.getCityData().get(0).get("province");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
        String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("altPhoneNumber");
        String ExistingPhoneNumber = TestDataHandler.customerData.getCustomerData().get(4).get("phoneNumber");
        String serialNumber = TestDataHandler.customerData.getCustomerData().get(6).get("serialNumber");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String topUp = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String provinceFullName = TestDataHandler.cityData.getCityData().get(0).get("provinceFullName");

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab("3G Nation-Wide Talk, Text & Data");
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().enterOneVerificationField(serialNumber);
        getSimPage().clickCheckBoxesForPortIn();
        getSimPage().setProfileDetailsPortIn(firstName,lastName,email,dateOfBirth,altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp,creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city,provinceFullName);
        String ctn = getOrderConfirmationPage().getTempCtnNumber();
        System.out.println(ctn);
        String status = getDB().getCTNStatus(ctn);
        System.out.println(status);
        getOrderConfirmationPage().ValidateStatusOfCtn(status);
    }
    @Test(groups = {"PORTINONE", "E2E","Scrum"})
    public void CPP_21070_Validate_NAC_PortInFlow_LandLine_Personal(){
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
        String plan = TestDataHandler.planData.getPlanData().get(5).get("planValue");
        String simSerialNumber = getDB().getSIMSerialNumber();
        String province = TestDataHandler.cityData.getCityData().get(0).get("province");
        String ExistingPhoneNumber = TestDataHandler.customerData.getCustomerData().get(9).get("phoneNumber");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
        String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("altPhoneNumber");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String topUp = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String provinceFullName = TestDataHandler.cityData.getCityData().get(0).get("provinceFullName");
        String billingContactPersonal = TestDataHandler.customerData.getCustomerData().get(10).get("billingContactPersonal");
        String dslService = TestDataHandler.customerData.getCustomerData().get(10).get("dslService");
        String oldReseller = TestDataHandler.customerData.getCustomerData().get(10).get("oldReseller");

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab("3G Nation-Wide Talk, Text & Data");
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().selectOldServiceProvider(altPhoneNumber,oldReseller);
        getSimPage().selectBillingContact(billingContactPersonal);
        getSimPage().selectDslProvider(dslService);
        getSimPage().checkBoxDsl();
        getSimPage().enterFirstLastname(firstName,lastName);
        getSimPage().setAddress(city);
        getSimPage().clickCheckBoxesForLandLinePortIn();
        getSimPage().setProfileDetailsPortIn(firstName,lastName,email,dateOfBirth,altPhoneNumber);
        getSimPage().clickOnContinue();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp,creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city,provinceFullName);
    }
    @Test(groups = {"PORTINONE","E2E"})
    public void Cpp_21070_CPP_21070_Validate_NAC_PortInFlow_LandLine_Business(){
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
        String plan = TestDataHandler.planData.getPlanData().get(0).get("planValue");
        String simSerialNumber = getDB().getSIMSerialNumber();
        String province = TestDataHandler.cityData.getCityData().get(0).get("province");
        String ExistingPhoneNumber = TestDataHandler.customerData.getCustomerData().get(7).get("phoneNumber");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
        String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("altPhoneNumber");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String topUp = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String provinceFullName = TestDataHandler.cityData.getCityData().get(0).get("provinceFullName");
        String billingContactBusiness = TestDataHandler.customerData.getCustomerData().get(8).get("billingContactBusiness");
        String businessName = TestDataHandler.customerData.getCustomerData().get(8).get("businessName");
        String dslService = TestDataHandler.customerData.getCustomerData().get(8).get("dslService");
        String oldReseller = TestDataHandler.customerData.getCustomerData().get(8).get("oldReseller");

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().selectOldServiceProvider(altPhoneNumber,oldReseller);
        getSimPage().selectDslProvider(dslService);
        getSimPage().checkBoxDsl();
        getSimPage().selectBillingContact(billingContactBusiness);
        getSimPage().enterBusinessName(businessName);
        getSimPage().setAddress(city);
        getSimPage().clickCheckBoxesForLandLinePortIn();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getSimPage().setProfileDetailsPortIn(firstName,lastName,email,dateOfBirth,altPhoneNumber);
        getSimPage().clickOnContinue();
        getPaymentPage().setCreditCardDetails(topUp,creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city,provinceFullName);
    }
    @Test(groups = {"PORTINONE", "E2E"})
    public void CPP_21106_Validate_DslCheckBox_PortInFlow_LandLine(){
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
        String plan = TestDataHandler.planData.getPlanData().get(5).get("planValue");
        String simSerialNumber = getDB().getSIMSerialNumber();
        String province = TestDataHandler.cityData.getCityData().get(0).get("province");
        String ExistingPhoneNumber = TestDataHandler.customerData.getCustomerData().get(9).get("phoneNumber");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
        String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String topUp = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String provinceFullName = TestDataHandler.cityData.getCityData().get(0).get("provinceFullName");
        String billingContactPersonal = TestDataHandler.customerData.getCustomerData().get(10).get("billingContactPersonal");
        String dslService = TestDataHandler.customerData.getCustomerData().get(10).get("dslService");
        String oldReseller = TestDataHandler.customerData.getCustomerData().get(10).get("oldReseller");

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab("3G Nation-Wide Talk, Text & Data");
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().selectOldServiceProvider("",oldReseller);
        getSimPage().selectBillingContact(billingContactPersonal);
        getSimPage().selectDslProvider(dslService);
        getSimPage().checkBoxDsl();
        getSimPage().enterFirstLastname(firstName,lastName);
        getSimPage().setAddress(city);
        getSimPage().clickCheckBoxesForLandLinePortIn();
        getSimPage().setProfileDetailsPortIn(firstName,lastName,email,dateOfBirth,"");
        getSimPage().clickOnContinue();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp,creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city,provinceFullName);
        String ctn =getOrderConfirmationPage().getTempCtnNumber();
        System.out.println(ctn);
        String status =getDB().getCTNStatus(ctn);
        System.out.println(status);
        getOrderConfirmationPage().ValidateStatusOfCtn(status);
    }

    @Test(groups = {"PORTINONE", "E2E","qaAuto"})
    public void CPP_21067_Validate_PortIn_Flow_Wireless() {
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
        String province = TestDataHandler.cityData.getCityData().get(0).get("province");
        String plan = TestDataHandler.planData.getPlanData().get(5).get("planValue");
        String ExistingPhoneNumber = TestDataHandler.customerData.getCustomerData().get(4).get("phoneNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
        String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("altPhoneNumber");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String topUp = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String provinceFullName = TestDataHandler.cityData.getCityData().get(0).get("provinceFullName");
        String serialNumber = TestDataHandler.customerData.getCustomerData().get(6).get("serialNumber");
        String phoneAccountNumber = TestDataHandler.customerData.getCustomerData().get(6).get("phoneAccountNumber");
        String pin = TestDataHandler.customerData.getCustomerData().get(6).get("pin");

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab("3G Nation-Wide Talk, Text & Data");
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().validatePortInApplicationMessage();
        getSimPage().validateOldServiceProviders();
        getSimPage().verifyThreePortInFields(serialNumber, phoneAccountNumber, pin);
        getSimPage().clickCheckBoxesForPortIn();
        getSimPage().setProfileDetailsPortIn(firstName,lastName,email,dateOfBirth,altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOnContinue();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp,creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city,provinceFullName);
    }
    @Test(groups = {"PORTINONE", "E2E","qaAuto"})
    public void CPP_21085_Validate_AltPhoneNumber_PortInFlow_LandLine() {
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
        String plan = TestDataHandler.planData.getPlanData().get(5).get("planValue");
        String simSerialNumber = getDB().getSIMSerialNumber();
        String province = TestDataHandler.cityData.getCityData().get(0).get("province");
        String ExistingPhoneNumber = TestDataHandler.customerData.getCustomerData().get(9).get("phoneNumber");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
        String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("altPhoneNumber");
        String billingContactPersonal = TestDataHandler.customerData.getCustomerData().get(10).get("billingContactPersonal");
        String dslService = TestDataHandler.customerData.getCustomerData().get(10).get("dslService");
        String oldReseller = TestDataHandler.customerData.getCustomerData().get(10).get("oldReseller");
        String altPhoneNumber1 = TestDataHandler.customerData.getCustomerData().get(10).get("altPhoneNumber1");

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab("3G Nation-Wide Talk, Text & Data");
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().selectOldServiceProvider(altPhoneNumber,oldReseller);
        getSimPage().selectBillingContact(billingContactPersonal);
        getSimPage().selectDslProvider(dslService);
        getSimPage().checkBoxDsl();
        getSimPage().enterFirstLastname(firstName,lastName);
        getSimPage().setAddress(city);
        getSimPage().clickCheckBoxesForLandLinePortIn();
        getSimPage().setProfileDetailsPortIn(firstName,lastName,email,dateOfBirth,altPhoneNumber);
        getSimPage().VerifyAfterDeleteAltPhoneNumberFromAccountSection(altPhoneNumber1);
    }
    @Test(groups = {"PORTINONE", "E2E" })
    public void CPP_22027_ValidateOldResellersDropdown(){
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
        String plan = TestDataHandler.planData.getPlanData().get(0).get("planValue");
        String simSerialNumber = getDB().getSIMSerialNumber();
        String province = TestDataHandler.cityData.getCityData().get(0).get("province");
        String ExistingPhoneNumber = TestDataHandler.customerData.getCustomerData().get(9).get("phoneNumber");

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab("3G Nation-Wide Talk, Text & Data");
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().clickOnOldReseller();
        getSimPage().validateOldReseller();
    }
    @Test(groups = {"PORTINONE", "E2E" })
    public void CPP_22027_ValidateFlowWithoutSelectingOldReseller(){
        String plan = TestDataHandler.planData.getPlanData().get(0).get("planValue");
        String simSerialNumber = getDB().getSIMSerialNumber();
        String province = TestDataHandler.cityData.getCityData().get(0).get("province");
        String ExistingPhoneNumber = TestDataHandler.customerData.getCustomerData().get(7).get("phoneNumber");
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
        String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
        String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
        String firstName = TestDataHandler.customerData.getCustomerData().get(5).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(5).get("lastName");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String topUp = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String provinceFullName = TestDataHandler.cityData.getCityData().get(0).get("provinceFullName");
        String dslService = TestDataHandler.customerData.getCustomerData().get(8).get("dslService");

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().selectDslProvider(dslService);
        getSimPage().clickExistingServicesCheckbox();
        getSimPage().setNameBillingContact(firstName,lastName);
        getSimPage().setAddress(city);
        getSimPage().clickOnConfirmAccountHolderCheckbox();
        getSimPage().clickOnAuthorizeChatrCheckbox();
        getSimPage().clickOnContinuePortIn();
        getSimPage().setEmailDOB(email, dateOfBirth);
        getSimPage().clickOnContinuePortIn();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp,creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city,provinceFullName);
    }
    @Test(groups = {"PORTINONE", "E2E" })
    public void CPP_22027_ValidateFlowSelectingOldReseller(){
        String plan = TestDataHandler.planData.getPlanData().get(5).get("planValue");
        String simSerialNumber = getDB().getSIMSerialNumber();
        String province = TestDataHandler.cityData.getCityData().get(0).get("province");
        String ExistingPhoneNumber = TestDataHandler.customerData.getCustomerData().get(9).get("phoneNumber");
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
        String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
        String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
        String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
        String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
        String topUp = TestDataHandler.planData.getPlanData().get(0).get("topUp");
        String provinceFullName = TestDataHandler.cityData.getCityData().get(0).get("provinceFullName");
        String dslService = TestDataHandler.customerData.getCustomerData().get(10).get("dslService");
        String oldReseller = TestDataHandler.customerData.getCustomerData().get(10).get("oldReseller");
        String altPhoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("altPhoneNumber");

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab("3G Nation-Wide Talk, Text & Data");
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().selectOldServiceProvider(altPhoneNumber,oldReseller);
        getSimPage().selectDslProvider(dslService);
        getSimPage().clickExistingServicesCheckbox();
        getSimPage().setNameBillingContact(firstName,lastName);
        getSimPage().setAddress(city);
        getSimPage().clickOnConfirmAccountHolderCheckbox();
        getSimPage().clickOnAuthorizeChatrCheckbox();
        getSimPage().clickOnContinuePortIn();
        getSimPage().setEmailDOB(email, dateOfBirth);
        getSimPage().clickOnContinuePortIn();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp,creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getReviewOrderPage().clickOnContinue();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city,provinceFullName);
    }

    @Test(groups = {"PORTINONE","E2E"})
    public void Cpp_24879_Validate_NAC_PortInFlow_LandLine_Business_ErrorMessage() {
        String city = TestDataHandler.cityData.getCityData().get(0).get("city");
        String plan = TestDataHandler.planData.getPlanData().get(5).get("planValue");
        String simSerialNumber = getDB().getSIMSerialNumber();
        String province = TestDataHandler.cityData.getCityData().get(0).get("province");
        String ExistingPhoneNumber = TestDataHandler.customerData.getCustomerData().get(7).get("phoneNumber");
        String altPhoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("altPhoneNumber");
        String billingContactBusiness = TestDataHandler.customerData.getCustomerData().get(7).get("billingContactBusiness");
        String dslService = TestDataHandler.customerData.getCustomerData().get(7).get("dslService");
        String oldReseller = TestDataHandler.customerData.getCustomerData().get(7).get("oldReseller");

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab("3G Nation-Wide Talk, Text & Data");
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().selectOldServiceProvider(altPhoneNumber, oldReseller);
        getSimPage().selectDslProvider(dslService);
        getSimPage().checkBoxDsl();
        getSimPage().selectBillingContact(billingContactBusiness);
        getSimPage().setAddress(city);
        getSimPage().clickCheckBoxesForLandLinePortIn();
        getSimPage().errorMessageForBusinessNameFields();
    }
*/
    @Test(groups = {"PORTINONE", "Billing","DAYONE","qaAuto","pfour" })
    public void CPP_29641_validate_Error_Message_For_LastName_Field_In_Personal_Option(){
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String altPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("altPhoneNumber");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInNumber");
        String oldReseller = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("oldReseller");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        //getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" +RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().selectOldServiceProvider(altPhoneNumber, oldReseller);
        getSimPage().selectBillingContact("Personal");
        getSimPage().selectDslProvider("Yes");
        getSimPage().checkBoxDsl();
        getSimPage().setAddress(city);
        getSimPage().clickCheckBoxesForLandLinePortIn();
        getSimPage().errorMessageForPersonalNameFields();
    }
    @Test(groups = {"PORTINONE", "Billing","DAYONE","qaAuto","ptwo" })
    public void CPP_29638_Validate_NAC_PortInFlow_LandLine_Business_ErrorMessage(){
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String altPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("altPhoneNumber");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInNumber");
        String oldReseller = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("oldReseller");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        getSimPage().setSimDetails(simSerialNumber);
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" +RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().selectOldServiceProvider(altPhoneNumber, oldReseller);
        getSimPage().selectBillingContact("Business");
        getSimPage().selectDslProvider("Yes");
        getSimPage().checkBoxDsl();
        getSimPage().setAddress(city);
        getSimPage().clickCheckBoxesForLandLinePortIn();
        getSimPage().errorMessageForBusinessNameFields();
    }
    @Test(groups = {"PORTINONE", "qaAuto","DAYONE","portIn","ptwo"})
    public void CPP_24879_Validate_NAC_PortInFlow_LandLine_BusinessFlow_ErrorMessage() {
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String altPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("altPhoneNumber");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInNumber");
        String oldReseller = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("oldReseller");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
       /* getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        //getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" +RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().selectOldServiceProvider(altPhoneNumber, oldReseller);
        getSimPage().selectBillingContact("Business");
        getSimPage().selectDslProvider("Yes");
        getSimPage().checkBoxDsl();
        getSimPage().setAddress(city);
        getSimPage().clickCheckBoxesForLandLinePortIn();
        getSimPage().errorMessageForBusinessNameFields();
    }
    @Test(groups = {"PORTINONE", "qaAuto","DAYONE","portIn","pone"})
    public void CPP_24850_Validate_CheckBox_PortIn() {
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String altPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("altPhoneNumber");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInSerial");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
       /* getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
       // getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" +RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().setAlternatePhoneNumber(altPhoneNumber);
        getSimPage().verifyThreePortInFields("123456789012345678", "123456789", "1234");
        getSimPage().validateCheckBoxErrorMessage();
    }
    @Test(groups = {"PORTINONE", "qaAuto","DAYONE","portIn","ptwo","SS","NAC","P1"})
    public void Cpp_24881_Validate_NAC_PortInFlow_LandLine_Business(){
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("expiryDate");
        String topUp = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("topUp");
        String provinceFullName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("provinceFullName");
        String firstName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("firstName");
        String lastName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("lastName");
        String email = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("altPhoneNumber");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInNumber");
        String oldReseller = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("oldReseller");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        //getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" +RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().selectOldServiceProvider(altPhoneNumber, oldReseller);
        getSimPage().selectDslProvider("Yes");
        getSimPage().checkBoxDsl();
        getSimPage().selectBillingContact("Business");
        getSimPage().enterBusinessName("AUTO TEST");
        getSimPage().setAddress(city);
        getSimPage().clickCheckBoxesForLandLinePortIn();
        getSimPage().setProfileDetailsPortIn(firstName,lastName,email,dateOfBirth,altPhoneNumber);
        getSimPage().clickOnContinue();
        getTopUpFormPage().selectPaymentMethod("Credit Card");
        getPaymentPage().setCreditCardDetails(topUp,creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getPaymentPage().clickOnSubmit();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city,provinceFullName);
    }
    @Test(groups = {"PORTINONE", "qaAuto","DAYONE","portIn","ptwo"})
    public void CPP_24880_Validate_NAC_PortInFlow_LandLine_Personal(){
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String creditCard = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("cardNumber");
        String cvv = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("cvv");
        String expiryDate = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("expiryDate");
        String topUp = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("topUp");
        String provinceFullName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("provinceFullName");
        String firstName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("firstName");
        String lastName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("lastName");
        String email = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("altPhoneNumber");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInNumber");
        String oldReseller = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("oldReseller");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
       /* getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        //getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" +RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().selectOldServiceProvider(altPhoneNumber, oldReseller);
        getSimPage().selectDslProvider("Yes");
        getSimPage().checkBoxDsl();
        getSimPage().selectBillingContact("Personal");
        getSimPage().enterFirstLastname(firstName,lastName);
        getSimPage().setAddress(city);
        getSimPage().clickCheckBoxesForLandLinePortIn();
        getSimPage().setProfileDetailsPortIn1(firstName,lastName,email,dateOfBirth,altPhoneNumber);
        getSimPage().clickOnContinue();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getPaymentPage().setCreditCardDetails(topUp,creditCard, cvv, expiryDate);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getPaymentPage().clickOnContinue();
        getReviewOrderPage().waitForReviewOrderPageLoad();
        getReviewOrderPage().clickOnPaymentTermsAndConditions();
        getPaymentPage().clickOnSubmit();
        //getPaymentPage().clickOnContinue();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getOrderConfirmationPage().validateOrderSummaryDetails(city,provinceFullName);
    }
    @Test(groups = {"PORTINONE","PORTINONE", "DAYONE","qaAuto","ptwo"})
    public void CPP_29540_Validate_CheckBox_PortIn() {
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String firstName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("firstName");
        String lastName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("lastName");
        String email = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("email");
        String dateOfBirth = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("dateOfBirth");
        String altPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("altPhoneNumber");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInSerial");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        ///getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" +RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().setAlternatePhoneNumber(altPhoneNumber);
        getSimPage().verifyThreePortInFields("123456789012345678", "123456789", "1234");
        getSimPage().clickCheckBoxesForPortIn();
        getSimPage().setProfileDetailsPortIn(firstName, lastName, email, dateOfBirth, altPhoneNumber);
        getSimPage().setAddress(city);
        getSimPage().clickOneCheckBoxesForLandLinePortIn();
        getSimPage().validateCheckBoxErrorMessage();
    }
    @Test(groups = {"PORTINONE","Geolocation","DAYONE","qaAuto","pfour"})
    public void CPP_27681_Validate_Customer_Geolocation_In_Nac_Flow(){
        String province1 = TestDataHandler.nacPortInData.getNacPortInData().get(1).get("province");
        String city1 = TestDataHandler.nacPortInData.getNacPortInData().get(1).get("city");
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, "Toronto");
        getPlanPage().validationCustomerGeolocation();
        getPlanPage().selectCity(province1,city1);
    }

    @Test(groups = {"PORTINONE", "portIn","DAYONE","qaAuto","pone"})
    public void CPP_34839_validate_Error_Scenario_For_port_In_Number(){
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        //String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInNumber");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        //getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        String ExistingPhoneNumber = "417-412-" +RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().validateErrorScenarioForPort();
    }
    @Test(groups = {"PORTINONE", "portIn","DAYONE","qaAuto","pone"})
    public void CPP_34849_validate_Error_Scenario_For_port_In_Number(){
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String firstName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("firstName");
        String lastName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("lastName");
        String altPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("altPhoneNumber");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInNumber");
        String oldReseller = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("oldReseller");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
       /* getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
       // getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" +RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().selectOldServiceProvider(altPhoneNumber, oldReseller);
        getSimPage().selectDslProvider("Yes");
        getSimPage().checkBoxDsl();
        getSimPage().selectBillingContact("Personal");
        getSimPage().enterFirstLastname(firstName,lastName);
        getSimPage().setAddress(city);
        getSimPage().validateErrorForCheckBox();
    }
    @Test(groups = {"PORTINONE","pricePlan","DAYONE","qaAuto" })
    public void CPP_26082_Validate_plan_page_Location(){
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().validateSelectPlanTab();
    }
    @Test(groups = {"PORTINONE", "DAYONE"})
    public void CPP_24875_Validate_NAC_PortInFlow_LandLine_Personal_ErrorMessage_NameFields() {
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String firstName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("firstName");
        String altPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("altPhoneNumber");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInNumber");
        String oldReseller = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("oldReseller");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
       /* getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        //getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" +RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().selectOldServiceProvider(altPhoneNumber, oldReseller);
        getSimPage().selectDslProvider("Yes");
        getSimPage().checkBoxDsl();
        getSimPage().selectBillingContact("Personal");
        getSimPage().enterFirstLastname(firstName,"");
        getSimPage().setAddress(city);
        getSimPage().clickCheckBoxesForLandLinePortIn();
        getSimPage().clickOnContinue();
        getSimPage().errorMessageForPersonalLastNameFields();
    }
}
