package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

public class RegisterPage_Test extends BaseTest {

    @Test(groups = {"REGT", "DAYONE", "qaAuto","pthree"})
    public void CPP_29185_ValidateInvalidNumber_RegisterPage() {
        getHeaderComponent().clickSignIn();
        getTopUpFormPage().clickRegisterHere();
        getRegisterPage().validateInValidNumber("0123456789");
    }
    @Test(groups = {"REGT", "DAYONE", "qaAuto","pthree"})
    public void CPP_29187_ValidateInCorrect_NumberLength_RegisterPage() {
        getHeaderComponent().clickSignIn();
        getTopUpFormPage().clickRegisterHere();
        getRegisterPage().validateIncorrectNumberLength("01234567");
    }
    @Test(groups = {"REGT","DAYONE", "qaAuto","pone"})
    public void CPP_29184_Validate_AlreadyRegisteredNumber_RegisterPage() {
        String phoneNumber = TestDataHandler.registerData.getRegisterData().get(0).get("usedPhoneNumber");

        getHeaderComponent().clickSignIn();
        getTopUpFormPage().clickRegisterHere();
        getRegisterPage().validateAlreadyRegisterPhoneNumber("4168172628");
    }
    @Test(groups = {"REGT","qaAuto", "DAYONE", "payment"})
    public void CPP_34800_Validate_IncorrectAccountDetails() {
        String postalCode = TestDataHandler.registerData.getRegisterData().get(0).get("postalCode");

        getHeaderComponent().clickSignIn();
        getTopUpFormPage().clickForgotUserName();
        getRegisterPage().clickAccountInformation();
        getRegisterPage().populateThreeRecoverFields(postalCode);
        getRegisterPage().clickOnContinue();
        getRegisterPage().validateIncorrectDetailsMessage();
    }
    @Test(groups = {"REGT", "DAYONE", "qaAuto","pthree"})
    public void CPP_34792_Validate_Account_Locked_Exceeded_resend_attempts() {
        String phoneNumber = TestDataHandler.registerData.getRegisterData().get(0).get("phoneNumber");
        String code = TestDataHandler.registerData.getRegisterData().get(0).get("code");

        getHeaderComponent().clickSignIn();
        getTopUpFormPage().clickRegisterHere();
        getRegisterPage().validateErrormsgForExceededAttempts("416-817-5083");
        getRegisterPage().enterCodeForExceeds(code);
    }
}

