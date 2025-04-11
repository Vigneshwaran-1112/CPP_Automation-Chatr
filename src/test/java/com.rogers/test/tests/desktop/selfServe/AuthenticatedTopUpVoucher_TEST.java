package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

public class AuthenticatedTopUpVoucher_TEST extends BaseTest {

    @Test(groups = {"ATPVCR","EAS", "qa1", "DAYTWO"})
    public void CPP_45290_Validate_Auth_TopUp_Voucher_InCorrect3Times_Select_CC(){ //  Need to check CPP number for this test case
        String usernameNoCard = TestDataHandler.atpData.getAtpData().get(2).get("username");
        String passwordNoCard = TestDataHandler.atpData.getAtpData().get(2).get("password");

        getHeaderComponent().clickSignIn();
        //getSignInPage().signInEas(usernameNoCard, passwordNoCard);
        getSignInPage().signInEasFromExcel("ACTCC");
        getHeaderComponent().clickTopUp();
        getTopUpFormPage().selectPaymentMethod("Voucher");
        getPaymentPage().enterInvalidVoucherPin3Times();
        getPaymentPage().validateInvalidVoucherPinError();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().validateCreditCardField();
    }
}
