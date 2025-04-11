package com.rogers.test.tests.desktop.Unused;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

public class GeneralEnquiry_Test extends BaseTest {
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
    @Test(groups = {"GeneralEnquiry", "onetoone", "qaAuto","pfour"})
    public void CPP_24611_General_Enquiry_form_with_AskAway_Filed(){
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
}
