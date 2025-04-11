package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

public class UnAuthenticated_TopUpVoucher_Test extends BaseTest {


    @Test(groups = {"GTPVCR", "DAYTWO", "qaAuto", "ptwo"})
    public void CPP_45288_Validate_UnAuth_TopUp_Voucher_InCorrect3Times_Select_CC() {
        String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");

        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().setToPhoneNumberExcel("");
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Voucher");
        getPaymentPage().enterInvalidVoucherPin3Times();
        getPaymentPage().validateInvalidVoucherPinError();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().validateCreditCardField();
    }

    @Test(groups = {"GTPVCR", "DAYTWO", "qaAuto", "ptwo"})
    public void CPP_37185_Validate_Trying_To_exceed_account_balance_$300() {
        String phoneNumberVoucher = TestDataHandler.gtpData.getGtpData().get(1).get("phoneNumberVoucher");
        String voucher300 = TestDataHandler.gtpData.getGtpData().get(1).get("voucher300");

        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        //getTopUpFormPage().validatePhoneNumber("437-388-0561");
        getTopUpFormPage().setToPhoneNumberExcel("SB");
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("voucher");
        getPaymentPage().enterVoucherPin("Voucher40","Status40");
        getPaymentPage().validVoucherPinSelfServe300$Error();
    }

    @Test(groups = {"GTPVCR", "DAYTWO", "qaAuto", "ptwo"})
    public void CPP_37181_TC02_Top_Up_PIN_Format_Validation() {
        String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().setToPhoneNumberExcel("");
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Voucher");
        getPaymentPage().enterInvalidPin("04988747191");
        getSimPage().validateVoucherPinLength();
    }


    @Test(groups = {"GTPVCR", "DAYTWO", "qaAuto", "ptwo"})
    public void CPP_37140_TC2_Validate_Successful_topup_Voucher(){
       // String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");

        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        String phoneNumber = getTopUpFormPage().setToPhoneNumberExcel("");
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("voucher");
        getPaymentPage().enterVoucherPin("Voucher40","Status40");
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getTopUpFormPage().verifyReceiptVoucher(phoneNumber);
    }

    @Test(groups = {"GTPVCR", "DAYTWO", "qaAuto", "ptwo"})
    public void CPP_37182_TC03_TOP_UP_Card_errors_testing_errors_already_used_PIN() {

        //String phoneNumber = TestDataHandler.gtpData.getGtpData().get(0).get("phoneNumber");
        //String usedVoucherPIN = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("usedVoucherPIN");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        String phoneNumber = getTopUpFormPage().setToPhoneNumberExcel("");
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("voucher");
        String usedVoucherPIN = getPaymentPage().enterVoucherPin("Voucher50","Status50");
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().clickOnContinueConfirmPayment();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().clickNewTopUpButtonLink();
        getTopUpFormPage().validatePhoneNumber(phoneNumber);
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Voucher");
        getPaymentPage().enterValidPin(usedVoucherPIN);
        getPaymentPage().waitForPaymentPageLoad();
        getCarePortalHomePage().validateVoucherAlreadyUsedError();
    }


    @Test(groups = {"GTPVCR", "DAYTWO", "qaAuto", "ptwo"})
    public void CPP_37183_TC04_Consecutive_3_attempts_of_incorrect_PIN_voucher () {
        String phoneNumber = TestDataHandler.gtpData.getGtpData().get(1).get("phoneNumber");
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().setToPhoneNumberExcel("");
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("Voucher");
        getPaymentPage().enterInvalidVoucherPin3Times();
        getPaymentPage().validateInvalidVoucherPinError();
    }

    @Test(groups = {"GTPVCR", "onetoone", "qaAuto", "ptwo"})
    public void CPP_37156_Validate_User_Able_To_Edit_Payment_Step_Data(){
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().setToPhoneNumberExcel("");
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("voucher");
        getPaymentPage().enterVoucherPin("Voucher45","Status45");
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().clickEditVoucherPin();
        getPaymentPage().enterVoucherPin("Voucher25","Status25");
    }

    @Test(groups = {"GTPVCR", "onetoone", "qaAuto", "ptwo"})
    public void CPP_37157_Validate_System_Disable_Edit_Option(){
        getHeaderComponent().clickTopUp();
        getTopUpPage().clickTopUpToday();
        getTopUpFormPage().setToPhoneNumberExcel("");
        getTopUpFormPage().clickContinueButtonPhoneNumber();
        getTopUpFormPage().selectPaymentMethod("voucher");
        getPaymentPage().enterVoucherPin("Voucher10","Status10");
        getTopUpFormPage().clickContinueButtonPaymentMethod();
        getTopUpFormPage().clickOnReviewContinueButton();
        getTopUpFormPage().validateSuccessTopUpMessage();
        getTopUpFormPage().validateEditOptionIsDisabled();
    }

}

