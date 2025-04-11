package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

public class EASPage_Test extends BaseTest{
/*
    @Test(groups = {"EASREG","EAS"})
    public void CPP_34988_Validate_Finish_Registration_Process_CPP_EAS_Association(){
        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(26).get("easUnRegisteredNumber");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();
        String password = TestDataHandler.customerData.getCustomerData().get(24).get("password");

        getHeaderComponent().clickTopUp();
        getTopUpPage().clickSignInNow();
        getEASPage().clickRegister();
        getEASPage().enterPhoneNumber(phoneNumber);
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        getEASPage().clickContinue();
        String email =  getEASPage().emailGenerator();
        getEASPage().enterEmail(email);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickVerifyEmail();
            getVerifyInEns().getEmailVerifyPage(email);
            String emailCode = getVerifyInEns().getEmailVerifyCode();
            getEASPage().enterEmailVerificationCode(emailCode);
        }
        getEASPage().setPassword(password);
        getEASPage().validateSuccessRegisterMessage();
    }*/
        /*@Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_32857_register_successfully_and_an_welcome_email_goes_to_Customer_email_address(){
        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(26).get("easUnRegisteredNumber");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();
        String password = TestDataHandler.customerData.getCustomerData().get(24).get("password");

        getHeaderComponent().clickTopUp();
        getTopUpPage().clickSignInNow();
        getEASPage().clickRegister();
        getEASPage().enterPhoneNumber(phoneNumber);
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        getEASPage().clickContinue();
        String email =  getEASPage().emailGenerator();
        getEASPage().enterEmail(email);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickVerifyEmail();
            getVerifyInEns().getEmailVerifyPage(email);
            String emailCode = getVerifyInEns().getEmailVerifyCode();
            getEASPage().enterEmailVerificationCode(emailCode);
        }
        getEASPage().setPassword(password);

    }
    @Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_38942_Validate_EAS_registration_completionEAS_Registration_Flow(){
        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(26).get("easUnRegisteredNumber");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();
        String password = TestDataHandler.customerData.getCustomerData().get(24).get("password");

        getHeaderComponent().clickTopUp();
        getTopUpPage().clickSignInNow();
        getEASPage().clickRegister();
        getEASPage().enterPhoneNumber(phoneNumber);
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        getEASPage().clickContinue();
        String email =  getEASPage().emailGenerator();
        getEASPage().enterEmail(email);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickVerifyEmail();
            getVerifyInEns().getEmailVerifyPage(email);
            String emailCode = getVerifyInEns().getEmailVerifyCode();
            getEASPage().enterEmailVerificationCode(emailCode);
        }
        getEASPage().setPassword(password);
        getEASPage().validateSuccessRegisterMessage(email);
    }
    @Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_32856_Verified_email_with_GUI_CPP(){
        String phoneNumber = TestDataHandler.customerData.getCustomerData().get(26).get("easUnRegisteredNumber");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();
        String password = TestDataHandler.customerData.getCustomerData().get(24).get("password");

        getHeaderComponent().clickTopUp();
        getTopUpPage().clickSignInNow();
        getEASPage().clickRegister();
        getEASPage().enterPhoneNumber("778-386-0087);
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        getEASPage().clickContinue();
        String email =  getEASPage().emailGenerator();
        getEASPage().enterEmail(email);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickVerifyEmail();
            getVerifyInEns().getEmailVerifyPage(email);
            String emailCode = getVerifyInEns().getEmailVerifyCode();
            getEASPage().enterEmailVerificationCode(emailCode);
        }
        getEASPage().setPassword(password);
        getEASPage().validateSuccessRegisterMessage(email);
    }*/
    @Test(groups = {"EASREG","DAYONE", "EAS","pone"})
    public void CPP_34783_Validate_Incorrect_pin_entered_1to4_attempts_Desktop() {
        String phoneNumber = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("phoneNumber");

        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        getEASPage().enterValidPhoneNumber("");
        getEASPage().validateInvalidCode("123456",1);
    }

    @Test(groups = {"EASREG","DAYONE", "EAS","pone"})
    public void CPP_34784_Validate_PIN_incorrect_5th_attempt_Desktop() {
        String phoneNumber = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("phoneNumber");
        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        getEASPage().enterValidPhoneNumber("");
        getEASPage().validateInvalidCode5Times("123456",6);
    }
    @Test(groups = {"EASREG","DAYONE", "EAS","pone"})
    public void CPP_34795_Validate_account_related_details_in_Desktop_view_AC2() {
        String recoverCTN = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("phoneNumber");
        String recoverPostal = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("postalCode");
        String recoverDOB = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("dateOfBirth");
        getHeaderComponent().clickSignIn();
        getEASPage().clickForgotUsername();
        getEASPage().clickAccountInformation();
        //String phoneNumber = getEASPage().getValidPhoneNumberFromNac("");
        //getEASPage().enterRecoverDetails("4163190155","L6T0C1","11/17/1994");
        getEASPage().enterRecoverDetails("6474027414","M5R3N8","01/01/2000");
        getEASPage().validateSelectOTP_Page();
    }
    @Test(groups = {"EASREG","DAYONE", "EAS","pone"})
    public void CPP_34797_Validate_incomplete_or_invalid_account_related_details_in_Desktop_view_EC1() {
        getHeaderComponent().clickSignIn();
        getEASPage().clickForgotUsername();
        getEASPage().clickAccountInformation();
        getEASPage().validateRecoveryFieldsErrors();
    }
    @Test(groups = {"Registration"})
    public void TC_11_Registration_flow(){
       // String phoneNumber = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("phoneNumber");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();

        //getHeaderComponent().clickTopUp();
        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        String phoneNumber = getEASPage().enterValidPhoneNumber("eas5");
        //getEASPage().enterPhoneNumber(phoneNumber);
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        getEASPage().clickContinue();
        String email =  getEASPage().emailGenerator();
        System.out.println(email);
        getEASPage().enterEmail(email);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickOnEmail();
            getPaymentPage().waitForPaymentPageLoad();
            String emailCode = getSignInPage().GetOTPFromENStest(email);
            System.out.println("emailCode"+emailCode);
            getEASPage().enterEmailVerificationCode(emailCode);
        }
        getEASPage().setPassword(password);
        getEASPage().validateSuccessRegisterMessage(email);
        System.out.println(email);
        getEASPage().setEasidPwd(phoneNumber,email,password);
        getEASPage().validategotoToChatr();
    }
    @Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_34990_Validate_Remember_Username_checkbox_Yes_selected(){
        //String phoneNumber = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("phoneNumber");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();

        //getHeaderComponent().clickTopUp();
        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        String phoneNumber = getEASPage().enterValidPhoneNumber("");
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        getEASPage().clickContinue();
        String email =  getEASPage().emailGenerator();
        getEASPage().enterEmail(email);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickOnEmail();
            getPaymentPage().waitForPaymentPageLoad();
            String emailCode = getSignInPage().GetOTPFromENStest(email);
            System.out.println("emailCode"+emailCode);
            getEASPage().enterEmailVerificationCode(emailCode);
        }
        getEASPage().setPassword(password);
        getEASPage().validateSuccessRegisterMessage(email);
        getEASPage().setEasidPwd(phoneNumber,email,password);
        getEASPage().validategotoToChatr();
        getHeaderComponent().validateSignOut();
        getHeaderComponent().clickSignIn();
        getEASPage().validateRememberUsernameinSigninPage(email);
    }
    @Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_33044_Validate_customer_redirected_to_EAS_for_Email_registration_completion_Desktop_view(){
        //String phoneNumber = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("phoneNumber");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();

        //getHeaderComponent().clickTopUp();
        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        String phoneNumber = getEASPage().enterValidPhoneNumber("EAS2");
        System.out.println(phoneNumber);
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        System.out.println(code);
        getEASPage().clickContinue();
        String email =  getEASPage().emailGenerator();
        getEASPage().enterEmail(email);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickOnEmail();
            getPaymentPage().waitForPaymentPageLoad();
            String emailCode = getSignInPage().GetOTPFromENStest(email);
            System.out.println("emailCode"+emailCode);
            getEASPage().enterEmailVerificationCode(emailCode);
        }
        getEASPage().setPassword(password);
        getEASPage().validateSuccessRegisterMessage(email);
        getEASPage().setEasidPwd(phoneNumber,email,password);
    }
    @Test(groups = {"EASREG","DAYONE", "EAS","pone"})
    public void CPP_34791_Validate_PIN_incorrect_5th_accountLocked() {
        String phoneNumber = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("phoneNumber");
        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcelForError("USED");
        getEASPage().enterInvalidPassword("ram@123");
       /* getEASPage().clickRegister();
        getEASPage().enterValidPhoneNumber("");*/
//        getEASPage().validateInvalidCodelock("123456",19);
    }

    @Test(groups = {"EASREG","DAYONE", "EAS","pthree"})
    public void CPP_32901_Validate_User_Is_ableTo_Initiate_SignOut_From_Dashboard() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getHeaderComponent().validateSignOut();
    }
    @Test(groups = {"EASREG","onetoone", "EAS","pone","SS","P1","REG"})
    public void CPP_47520_User_unable_register_CTN_Already_Registerd() {
        String phoneNumber = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("phoneNumber");
        getHeaderComponent().clickSignIn();
        getEASPage().clickRegisterNew();
        getEASPage().validateAlreadyUsedCTN("4168176077");
    }


    @Test(groups = {"EASREG","DAYONE", "qaAuto","pone"})
    public void CPP_32915_Validate_On_11th_Consecutive_Attempt_With_Incorrect_Password_Account_Is_TemporarilyLocked_Out(){
        String username = TestDataHandler.ppcData.getPpcData().get(0).get("username");
        String password = "IncorrectPW";
        getHeaderComponent().clickSignIn();
        getSignInPage().validatingAccountLocked(username,password);

    }
    @Test(groups = {"EASREG","DAYONE", "qaAuto","pone"})
    public void CPP_33068_Validate_Most_Comonly_Search_Countries_Will_Be_Listed_On_PPU_Page_Long_Distance_Rates(){
      getHeaderComponent().clickPlans();
      //getEASPage().clickInternationalTalkSaver();
      //getLandingPage().goToLongDistancePage();
      getEASPage().validateLongDistanceRates();

    }

    @Test(groups = {"EASREG","DAYONE", "qaAuto","pone"})
    public void CPP_33062_Validate_Most_Comonly_Search_Countries_Will_Be_Listed_On_PPU_Page_Roaming_rates(){
        String planTab = TestDataHandler.ppcData.getPpcData().get(0).get("planTab");

        getHeaderComponent().clickPlans();
        getEASPage().validateRoamingRates();
    }


/*    @Test(groups = {"Test"})
    public void getMailOTP() {
        String a = getSignInPage().getmailOTP("easregistrationapitest522@gmail.com");
        System.out.println(a);
    }*/

/*    @Test(groups = {"DAYONE"})
    public void Validate_Recaptcha_EAS_Functionality(){
        //String phoneNumber = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("phoneNumber");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();

        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        String phoneNumber = getEASPage().enterValidPhoneNumber("EAS");
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        getEASPage().clickContinue();
        String email =  getEASPage().emailGenerator();
        System.out.println(email);
        getEASPage().enterEmail(email);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickOnEmail();
            getPaymentPage().waitForPaymentPageLoad();
            String emailCode = getSignInPage().GetOTPFromENStest(email);
            System.out.println("emailCode"+emailCode);
            getEASPage().enterEmailVerificationCode(emailCode);
        }
        getEASPage().setPassword(password);
        getEASPage().validateSuccessRegisterMessage(email);
        System.out.println(email);
        getEASPage().setEasidPwd(phoneNumber,email,password);
    }
    @Test(groups = {"DAYONE"})
    public void Validate_Recaptcha_Login_Functionality() {
        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("EAS");
    }*/
@Test(groups = {"EASREG","EAS","DAYONE"})
public void CPP_28984_Validation_Of_OTP_When_Enters_Correct_CTN_Desktop_View() {

    String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();

    getHeaderComponent().clickSignIn();
    getEASPage().clickRegister();
    String phoneNumber = getEASPage().enterValidPhoneNumber("");
    getENSHomePage().openNewTabForEns(otpPage);
    String code = getEASPage().getPhoneNumberOtp(phoneNumber);
    getEASPage().validateNumberFormet(phoneNumber);
    getEASPage().enterCode(code);
    getEASPage().clickContinue();
    getEASPage().validateEnterEmailPage();
    }
    @Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_28986_Validation_Of_Request_To_Resend_OTP_Desktop_View() {

        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();

        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        String phoneNumber = getEASPage().enterValidPhoneNumber("");
        getEASPage().validateResendOTP();
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().validateNumberFormet(phoneNumber);
        getEASPage().enterCode(code);
        getEASPage().clickContinue();
        getEASPage().validateEnterEmailPage();
    }
    @Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_28988_Validation_Of_Error_Condition_When_User_Enters_Wrong_Verification_Code() {

        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        String phoneNumber = getEASPage().enterValidPhoneNumber("");
        getEASPage().enterCode("123456");
        getEASPage().clickContinue();
        getEASPage().validateWrongOTPCodeError();
    }
    @Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_28992_Validation_0f_Pin_Expired_Desktop_View() {

        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();

        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        String phoneNumber = getEASPage().enterValidPhoneNumber("");
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        getPaymentPage().waitForPaymentPageLoad();
        getEASPage().validateWrongOTPCodeExpired();
    }
    @Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_29156_Validating_Log_Into_Account_From_CPP_Registration_page_Desktop_View(){
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();

        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        String phoneNumber = getEASPage().enterValidPhoneNumber("EAS1");
        System.out.println(phoneNumber);
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        System.out.println(code);
        getEASPage().clickContinue();
        String email =  getEASPage().emailGenerator();
        getEASPage().enterEmail(email);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickOnEmail();
            getPaymentPage().waitForPaymentPageLoad();
            String emailCode = getSignInPage().GetOTPFromENStest(email);
            System.out.println("emailCode"+emailCode);
            getEASPage().enterEmailVerificationCode(emailCode);
        }
        getEASPage().setPassword(password);
        getEASPage().validateSuccessRegisterMessage(email);
        getEASPage().setEasidPwd(phoneNumber,email,password);
        getEASPage().validategotoToChatr();
    }
    @Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_29157_Validating_Log_Into_Account_From_CPP_Registration_Page_Selecting_User_Name(){
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();

        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        String phoneNumber = getEASPage().enterValidPhoneNumber("EAS3");
        System.out.println(phoneNumber);
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        System.out.println(code);
        getEASPage().clickContinue();
        String email =  getEASPage().emailGenerator();
        getEASPage().enterEmail(email);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickOnEmail();
            getPaymentPage().waitForPaymentPageLoad();
            String emailCode = getSignInPage().GetOTPFromENStest(email);
            System.out.println("emailCode"+emailCode);
            getEASPage().enterEmailVerificationCode(emailCode);
        }
        getEASPage().setPassword(password);
        getEASPage().validateSuccessRegisterMessage(email);
        getEASPage().setEasidPwd(phoneNumber,email,password);
        getEASPage().validategotoToChatr();
        getEASPage().validateCppRemeberUserName("Auto");
    }
    @Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_29174_Validation_0f_Error_Message_When_User_Enters_Email_Address_Incorrectly_Desktop_View() {
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();

        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        String phoneNumber = getEASPage().enterValidPhoneNumber("");
        System.out.println(phoneNumber);
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        System.out.println(code);
        getEASPage().clickContinue();
        getEASPage().validateEmailError();
    }
    @Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_29175_Validating_Email_Address_Already_Exists_Which_Has_Login_Credentials_Desktop_View() {
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();

        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        String phoneNumber = getEASPage().enterValidPhoneNumber("");
        System.out.println(phoneNumber);
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        System.out.println(code);
        getEASPage().clickContinue();
        getEASPage().validateAlreadyRegisteredEmailAlert();
    }
    @Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_29168_Validation_0f_Welcome_Email_When_Registration_Successful_Desktop_View(){
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        //String phoneNumber = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("eas");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();

        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        String phoneNumber = getEASPage().enterValidPhoneNumber("INACTIVE3");
        //getEASPage().enterPhoneNumber(phoneNumber);
        System.out.println(phoneNumber);
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        System.out.println(code);
        getEASPage().clickContinue();
        String email =  getEASPage().emailGenerator();
        getEASPage().enterEmail(email);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickOnEmail();
            getPaymentPage().waitForPaymentPageLoad();
            String emailCode = getSignInPage().GetOTPFromENStest(email);
            System.out.println("emailCode"+emailCode);
            getEASPage().enterEmailVerificationCode(emailCode);
        }
        getEASPage().setPassword(password);
        getEASPage().validateSuccessRegisterMessage(email);
        getEASPage().setEasidPwd(phoneNumber,email,password);
    }
    @Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_29176_Validation_Of_Registration_Entered_E_mail(){
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();

        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        String phoneNumber = getEASPage().enterValidPhoneNumber("");
        System.out.println(phoneNumber);
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        System.out.println(code);
        getEASPage().clickContinue();
        String email =  getEASPage().emailGenerator();
        getEASPage().enterEmail(email);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickOnEmail();
        }
        getEASPage().validateEmailOTPPage();
    }
    @Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_31127_Validating_Customer_Redirected_EAS_For_Email_Registration_Completion_Desktop_View(){
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();

        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        String phoneNumber = getEASPage().enterValidPhoneNumber("");
        System.out.println(phoneNumber);
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        System.out.println(code);
        getEASPage().clickContinue();
        String email =  getEASPage().emailGenerator();
        getEASPage().enterEmail(email);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickOnEmail();
            getPaymentPage().waitForPaymentPageLoad();
            String emailCode = getSignInPage().GetOTPFromENStest(email);
            System.out.println("emailCode"+emailCode);
            getEASPage().enterEmailVerificationCode(emailCode);
        }
    }
    @Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_32857_Validate_Customer_Register_Successfully_And_Welcome_Email_Goes_Customer_Email_Address(){
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();

        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        String phoneNumber = getEASPage().enterValidPhoneNumber("");
        System.out.println(phoneNumber);
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        System.out.println(code);
        getEASPage().clickContinue();
        String email =  getEASPage().emailGenerator();
        getEASPage().enterEmail(email);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickOnEmail();
            getPaymentPage().waitForPaymentPageLoad();
            String emailCode = getSignInPage().GetOTPFromENStest(email);
            System.out.println("emailCode"+emailCode);
            getEASPage().enterEmailVerificationCode(emailCode);
        }
        getEASPage().setPassword(password);
        getEASPage().validateSuccessRegisterMessage(email);
        getEASPage().setEasidPwd(phoneNumber,email,password);
    }
    @Test(groups = {"EASREG","EAS","DAYONE"})
    public void CPP_37166_Validate_Success_Message_CPP_Digital_Password_Set_Via_Email(){
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        String otpPage = TestDataHandler.landingPageData.getOtpLandingPage();

        getHeaderComponent().clickSignIn();
        getEASPage().clickRegister();
        String phoneNumber = getEASPage().enterValidPhoneNumber("");
        getENSHomePage().openNewTabForEns(otpPage);
        String code = getEASPage().getPhoneNumberOtp(phoneNumber);
        getEASPage().enterCode(code);
        getEASPage().clickContinue();
        String email =  getEASPage().emailGenerator();
        getEASPage().enterEmail(email);
        if(getEASPage().isMFAPresent()) {
            getEASPage().clickOnEmail();
            getPaymentPage().waitForPaymentPageLoad();
            String emailCode = getSignInPage().GetOTPFromENStest(email);
            System.out.println("emailCode"+emailCode);
            getEASPage().enterEmailVerificationCode(emailCode);
        }
        getEASPage().setPassword(password);
        getEASPage().validateSuccessRegisterMessage(email);
        getEASPage().setEasidPwd(phoneNumber,email,password);
    }
}
