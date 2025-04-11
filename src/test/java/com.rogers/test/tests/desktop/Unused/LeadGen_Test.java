package com.rogers.test.tests.desktop.Unused;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

public class LeadGen_Test extends BaseTest {

/*
    @Test(groups = { "LeadGenForm","E2E","Regression" })
    public void CPP_26084_LeadGen_Form_Success_Flow(){
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(4).get("phoneNumber");
        String postalCode = TestDataHandler.cityData.getCityData().get(0).get("postalCode");
        String provider = TestDataHandler.customerData.getCustomerData().get(8).get("provider");

        getLandingPage().clickOnSignUp();
        getLeadGenPage().setUserDetails(firstName, lastName,email,phoneNumber,postalCode);
        getLeadGenPage().selectCurrentCarrier(provider);
        getLeadGenPage().clickOnTermAndConditions();
        getLeadGenPage().submitButton();
        getLeadGenPage().validateSuccessMessage();
    }

    @Test(groups = { "LeadGenForm","E2E","Regression" })
    public void CPP_26084_validate_LeadGen_Form_Error_Messages(){
        getLandingPage().clickOnSignUp();
        getLeadGenPage().submitButton();
        getLeadGenPage().validateErrorMessages();
    }


    @Test(groups = { "LeadGen","onetoone", "qaAuto","pfour" })
    public void CPP_27788_validate_the_subscription_flow_for_latest_offer(){
        String firstName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("firstName");
        String lastName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("lastName");
        String email = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("email");
        String phoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInPhoneNo");
        String postalCode = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("postalCode");

        getLandingPage().clickOnSignUp();
        getLeadGenPage().setUserDetails(firstName, lastName,email,phoneNumber.replace("-",""),postalCode);
        getLeadGenPage().clickOnTermAndConditions();
        getLeadGenPage().submitButton();
        getLeadGenPage().validateSuccessMessage();
    }
    @Test(groups = { "LeadGen","onetoone", "qaAuto","pthree" })
    public void CPP_27785_select_current_carrier_information_sign_in_offers(){
        String firstName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("firstName");
        String lastName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("lastName");
        String email = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("email");
        String phoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInBellPhoneNo");
        String postalCode = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("postalCode");

        getLandingPage().clickOnSignUp();
        getLeadGenPage().setUserDetails(firstName, lastName,email,phoneNumber.replace("-",""),postalCode);
        getLeadGenPage().clickOnTermAndConditions();
        getLeadGenPage().submitButton();
        getLeadGenPage().validateSuccessMessage();
    }

 */
    @Test(groups = { "LeadGen","onetoone", "qaAuto","pone" })
    public void CPP_26084_user_able_to_confirm_subscription(){
        String firstName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("firstName");
        String lastName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("lastName");
        String email = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("email");
        String phoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInBellPhoneNo");
        String postalCode = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("postalCode");

        getLandingPage().clickOnSignUp();
        getLeadGenPage().setUserDetails(firstName, lastName,email,phoneNumber,postalCode);
        getLeadGenPage().clickOnTermAndConditions();
        getLeadGenPage().submitButton();
        getLeadGenPage().validateSuccessMessage();
    }
    @Test(groups = { "LeadGen","onetoone", "qaAuto","pfour" })
    public void CPP_26086_validation_for_invalid_postal_code(){
        String firstName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("firstName");
        String lastName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("lastName");
        String email = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("email");
        String phoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInBellPhoneNo");

        getLandingPage().clickOnSignUp();
        getLeadGenPage().setUserDetails(firstName, lastName,email,phoneNumber,"");
        getLeadGenPage().clickOnTermAndConditions();
        getLeadGenPage().submitButton();
        getLeadGenPage().validatePostalCodeErrorMessage();
    }
    @Test(groups = { "LeadGen","onetoone", "qaAuto","pone" })
    public void CPP_26087_validation_for_consent_error_message(){
        String firstName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("firstName");
        String lastName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("lastName");
        String email = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("email");
        String phoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInBellPhoneNo");
        String postalCode = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("postalCode");

        getLandingPage().clickOnSignUp();
        getLeadGenPage().setUserDetails(firstName, lastName,email,phoneNumber,postalCode);
        getLeadGenPage().submitButton();
        getLeadGenPage().validateConsentErrorMessage();
    }
}
