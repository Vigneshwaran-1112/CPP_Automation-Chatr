package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

public class Misc_Test extends BaseTest {

    /*    @Test(groups = { "CoverageMap","qaAuto","Scrum"})
        public void CPP_26849_Validate_AlertMessage_In_CoverageMap(){
            getHeaderComponent().clickCoverageMap();
            getCoverageMapPage().validateAlertMessage();
        }*/
    /*
    @Test(groups = {"GeneralEnquiry", "Regression","Scrum"})
    public void CPP_27950_validate_ContactUs_General_Inquiry_Flow() {
        String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("phoneNumber");
        String altPhoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("altPhoneNumber");
        String postalCode = TestDataHandler.cityData.getCityData().get(0).get("postalCode");
        String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
        String askAway = TestDataHandler.customerData.getCustomerData().get(0).get("askAway");
        String email1 = TestDataHandler.customerData.getCustomerData().get(2).get("email");

        getGeneralEnquiryPage().clickOnContactUs();
        getGeneralEnquiryPage().clickOnGeneralEnquiry();
        getGeneralEnquiryPage().clickOnYesButton();
        getGeneralEnquiryPage().selectGeneralEnquiry();
        getGeneralEnquiryPage().setTheProfileDetails(firstName, lastName, email, phoneNumber, altPhoneNumber);
        getGeneralEnquiryPage().setDetailPostalCode(postalCode);
        getGeneralEnquiryPage().setDateOfBirth(dateOfBirth);
        getGeneralEnquiryPage().setDetailAskAwayField(askAway);
        getGeneralEnquiryPage().validateErrorMessageForEmail(email1,email);
        getGeneralEnquiryPage().validationForOptionalField();
        getGeneralEnquiryPage().clickOnSubmitButton();
    }

    @Test(groups = {"GeneralEnquiry", "Regression","Scrum"})
    public void CPP_26160_validate_ContactUs_Account_Maintenance_Flow(){
        String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("phoneNumber");
        String altPhoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("altPhoneNumber");
        String postalCode = TestDataHandler.cityData.getCityData().get(0).get("postalCode");
        String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
        String askAway = TestDataHandler.customerData.getCustomerData().get(0).get("askAway");
        String email1 = TestDataHandler.customerData.getCustomerData().get(2).get("email");

        getGeneralEnquiryPage().clickOnContactUs();
        getGeneralEnquiryPage().clickOnGeneralEnquiry();
        getGeneralEnquiryPage().clickOnYesButton();
        getGeneralEnquiryPage().selectAccountMaintenance();
        getGeneralEnquiryPage().selectSpecificAreaField();
        getGeneralEnquiryPage().setTheProfileDetails(firstName, lastName, email, phoneNumber, altPhoneNumber);
        getGeneralEnquiryPage().setDetailPostalCode(postalCode);
        getGeneralEnquiryPage().setDateOfBirth(dateOfBirth);
        getGeneralEnquiryPage().setDetailAskAwayField(askAway);
        getGeneralEnquiryPage().validateErrorMessageForEmail(email1,email);
        getGeneralEnquiryPage().validationForOptionalField();
        getGeneralEnquiryPage().clickOnSubmitButton();
    }

    @Test(groups = {"GeneralEnquiry", "Regression","Scrum"})
    public void CPP_26160_validate_ContactUs_General_FeedBack_Flow(){
        String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("phoneNumber");
        String altPhoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("altPhoneNumber");
        String postalCode = TestDataHandler.cityData.getCityData().get(0).get("postalCode");
        String dateOfBirth = TestDataHandler.customerData.getCustomerData().get(0).get("dateOfBirth");
        String askAway = TestDataHandler.customerData.getCustomerData().get(0).get("askAway");
        String email1 = TestDataHandler.customerData.getCustomerData().get(2).get("email");

        getGeneralEnquiryPage().clickOnContactUs();
        getGeneralEnquiryPage().clickOnGeneralEnquiry();
        getGeneralEnquiryPage().clickOnYesButton();
        getGeneralEnquiryPage().selectGeneralFeedBack();
        getGeneralEnquiryPage().setTheProfileDetails(firstName, lastName, email, phoneNumber, altPhoneNumber);
        getGeneralEnquiryPage().setDetailPostalCode(postalCode);
        getGeneralEnquiryPage().setDateOfBirth(dateOfBirth);
        getGeneralEnquiryPage().setDetailAskAwayField(askAway);
        getGeneralEnquiryPage().validateErrorMessageForEmail(email1,email);
        getGeneralEnquiryPage().validationForOptionalField();
        getGeneralEnquiryPage().clickOnSubmitButton();
    }

    @Test(groups = {"GeneralEnquiry", "Regression","Scrum"})
    public void CPP_26160_validate_ContactUs_NoOptionButton_Flow(){
        String email = TestDataHandler.customerData.getCustomerData().get(0).get("email");
        String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
        String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");
        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(0).get("phoneNumber");
        String askAway = TestDataHandler.customerData.getCustomerData().get(0).get("askAway");

        getGeneralEnquiryPage().clickOnContactUs();
        getGeneralEnquiryPage().clickOnGeneralEnquiry();
        getGeneralEnquiryPage().clickOnNoButton();
        getGeneralEnquiryPage().setTheProfileDetails(firstName, lastName, email, phoneNumber);
        getGeneralEnquiryPage().setDetailAskAwayField(askAway);
        getGeneralEnquiryPage().clickOnSubmitButton();
    }
*/
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
    @Test(groups = { "MISCT","onetoone", "qaAuto","pone" })
    public void CPP_26084_user_able_to_confirm_subscription(){
        String firstName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("firstName");
        String lastName = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("lastName");
        String email = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("email");
        String phoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInBellPhoneNo");
        String postalCode = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("postalCode");

        getLandingPage().clickOnSignUp();
        getLeadGenPage().setUserDetails("Auto", "Test","Auto.Test@automation.com","1234567890",postalCode);
        getLeadGenPage().clickOnTermAndConditions();
        getLeadGenPage().submitButton();
        getLeadGenPage().validateSuccessMessage();
    }
    @Test(groups = { "MISCT","DAYONE", "qaAuto","pfour" })
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
    @Test(groups = { "MISCT","DAYONE", "qaAuto","pone" })
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
    @Test(groups = {"MISCT", "DAYONE", "qaAuto","pfour"})
    public void CPP_24611_General_Enquiry_form_with_AskAway_Filed(){ // Two test case available
        String firstName = TestDataHandler.atpData.getAtpData().get(0).get("firstName");
        String lastName = TestDataHandler.atpData.getAtpData().get(0).get("lastName");
        String phoneNumber = TestDataHandler.atpData.getAtpData().get(0).get("phoneNumber");
        String postalCode = TestDataHandler.atpData.getAtpData().get(0).get("postalCode");

        getGeneralEnquiryPage().clickOnContactUs();
        getGeneralEnquiryPage().clickOnGeneralEnquiry();
        getGeneralEnquiryPage().clickOnYesButton();
        getGeneralEnquiryPage().selectGeneralEnquiry();
        getGeneralEnquiryPage().setTheProfileDetails(firstName, lastName, "Auto.Test@rci.rogers.ca", phoneNumber, "0123456789");
        getGeneralEnquiryPage().setDetailPostalCode(postalCode);
        getGeneralEnquiryPage().setDateOfBirth("01/01/2000");
        getGeneralEnquiryPage().setDetailAskAwayField("Auto Testing");
        getGeneralEnquiryPage().clickOnSubmitButton();
    }
    @Test(groups = { "MISCT","DAYONE","qaAuto","pfour"})
    public void CPP_24699_Validate_CoverageMap_change_The_Language(){
        getHeaderComponent().clickCoverageMap();
        getHeaderComponent().changeLanguage("French");
        getCoverageMapPage().validateCoveragePageInFrench();
        getHeaderComponent().changeLanguage("English");
        getCoverageMapPage().validateCoveragePageInEnglish();
    }
    @Test(groups = { "MISCT","DAYONE","qaAuto","pfour"})
    public void CPP_24702_Validate_Chatr_Customer_Browse_Location_On_Coverage_Map_Through_Search_By_Postal_Code() {
        String postalCode = TestDataHandler.miscData.getMiscData().get(0).get("postalCode");

        getHeaderComponent().clickCoverageMap();
        getCoverageMapPage().validateSearchStoreByPostalCode(postalCode);
    }
}
