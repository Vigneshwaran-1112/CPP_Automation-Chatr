package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;

public class AccountManagement_Test extends BaseTest {

    /*
        @Test(groups = {"ACCTMGTCC","EAS","qaAuto", "Scrum"})
        public void CPP_30501_ValidateDeleteAndAddCreditCard() {
            String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
            String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
            String city = TestDataHandler.cityData.getCityData().get(0).get("city");
            String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
            String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
            String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
            String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
            String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");

            getHeaderComponent().clickSignIn();
            getSignInPage().signIn(username, password);
            getAccountManagementPage().goToProfile();
            getAccountManagementPage().goToManageSavedCards();
            getAccountManagementPage().clickOnDeleteSavedCard();
            getAccountManagementPage().validateConfirmDeleteModal();
            getAccountManagementPage().clickOnNoCancel();
            getAccountManagementPage().validateSavedCardsText();
            //starts flow to delete card
            getAccountManagementPage().clickOnDeleteSavedCard();
            getAccountManagementPage().validateConfirmDeleteModal();
            getAccountManagementPage().clickOnYesConfirm();
            getAccountManagementPage().validateCardIsNotPresent();
            //starts flow to add card
            getAccountManagementPage().clickAddCard();
            getAccountManagementPage().setCardDetails(creditCard,expiryDate,cvv);
            getAccountManagementPage().setName(firstName, lastName);
            getAccountManagementPage().setAddress(city);
            getAccountManagementPage().clickSave();
            getAccountManagementPage().validateCardSavedModal();
            getAccountManagementPage().validateCardIsPresent();
        }
        @Test(groups = {"ACCTMGTCC","EAS","qaAuto", "Scrum"})
        public void CPP_31084_ValidateCancelSavedCard() {
            String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(3).get("username");
            String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(3).get("password");
            String city = TestDataHandler.cityData.getCityData().get(0).get("city");
            String creditCard = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cardNumber");
            String cvv = TestDataHandler.creditCardData.getCreditCardData().get(0).get("cvv");
            String expiryDate = TestDataHandler.creditCardData.getCreditCardData().get(0).get("expiryDate");
            String firstName = TestDataHandler.customerData.getCustomerData().get(0).get("firstName");
            String lastName = TestDataHandler.customerData.getCustomerData().get(0).get("lastName");

            getHeaderComponent().clickSignIn();
            getSignInPage().signIn(username, password);
            getAccountManagementPage().goToProfile();
            getAccountManagementPage().goToManageSavedCards();
            //starts flow to add card
            getAccountManagementPage().clickAddCard();
            getAccountManagementPage().setCardDetails(creditCard, expiryDate, cvv);
            getAccountManagementPage().setName(firstName, lastName);
            getAccountManagementPage().setAddress(city);
            getAccountManagementPage().clickCancel();
            getAccountManagementPage().validateCancelAddModal();
            getAccountManagementPage().clickNoCancel();
            getAccountManagementPage().validateAddCardDetailsScreen();
            getAccountManagementPage().clickCancel();
            getAccountManagementPage().clickYesCancel();
            getAccountManagementPage().validateNoAddCardDetailsScreen();
        }
        @Test(groups = {"ACCTMGTCC","EAS","qaAuto", "Scrum"})
        public void CPP_30500_ValidateStoredCardLimit() {
            String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
            String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");

            getHeaderComponent().clickSignIn();
            getSignInPage().signIn(username, password);
            getAccountManagementPage().goToProfile();
            getAccountManagementPage().goToManageSavedCards();
            getAccountManagementPage().validateStoreUpLimit();
        }

        @Test(groups = {"ACCTMGTCC","EAS","SelfServe", "qaAuto"})
        public void CPP_27693_validate_Old_SimNumber_After_SimSwap() {
            String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(10).get("username");
            String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(10).get("password");

            getHeaderComponent().clickSignIn();
            getSignInPage().signInEas(username, password);
            getAccountManagementPage().goToProfile();
            getAccountManagementPage().clickOnSimSwap();
            String ctn = getAccountManagementPage().getCurrentCTN();
            System.out.println(ctn);
            String currentSimNumber = getDB().getSIMNumber(ctn);
            System.out.println("current sim Number "+currentSimNumber);
            getAccountManagementPage().enterCurrentSimNumber(currentSimNumber);
            String newSimNumber = getDB().getSIMSerialNumber();
            System.out.println("new sim number "+newSimNumber);
            getAccountManagementPage().enterNewSimNumber(newSimNumber);
            getAccountManagementPage().clickOnSaveButton();
            getAccountManagementPage().popUpFieldValidate();
        }

        @Test(groups = {"ACCTMGTCC","EAS","simSwap", "qaAuto","pfour"})
        public void CPP_27693_Validate_old_SIM_is_terminated_after_client_swap_SIM (){
            String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
            String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");

            getHeaderComponent().clickSignIn();
            getSignInPage().signInEas(username, password);
            getAccountManagementPage().goToProfile();
            getAccountManagementPage().clickOnSimSwap();
            String ctn = getAccountManagementPage().getCurrentCTN();
            System.out.println(ctn);
            String currentSimNumber = getDB().getSIMNumber(ctn);
            System.out.println("current sim Number "+currentSimNumber);
            getAccountManagementPage().enterCurrentSimNumber(currentSimNumber);
            String newSimNumber = getDB().getSIMSerialNumber();
            System.out.println("new sim number "+newSimNumber);
            getAccountManagementPage().enterNewSimNumber(newSimNumber);
            getAccountManagementPage().clickOnSaveButton();
            getAccountManagementPage().popUpFieldValidate();
        }
        @Test(groups = {"ACCTMGTCC","EAS","simSwap","qaAuto","pfour"})
        public void CPP_27694_Validate_new_SIM_is_active_after_client_swap_SIM(){
            String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
            String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");

            getHeaderComponent().clickSignIn();
            getSignInPage().signInEas(username, password);
            getAccountManagementPage().goToProfile();
            getAccountManagementPage().clickOnSimSwap();
            String ctn = getAccountManagementPage().getCurrentCTN();
            System.out.println(ctn);
            String currentSimNumber = getDB().getSIMNumber(ctn);
            System.out.println("current sim Number "+currentSimNumber);
            getAccountManagementPage().enterCurrentSimNumber(currentSimNumber);
            String newSimNumber = getDB().getSIMSerialNumber();
            System.out.println("new sim number "+newSimNumber);
            getAccountManagementPage().enterNewSimNumber(newSimNumber);
            getAccountManagementPage().clickOnSaveButton();
            getAccountManagementPage().popUpFieldValidate();
        }*/
    /*

    @Test(groups = {"ACCTMGTCC","EAS","simSwap", "DAYONE","qaAuto","pfour"})
    public void CPP_24595_Validation_of_successfull_E2E_SIM_swap_change(){
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().clickOnSimSwap();
        String ctn = getAccountManagementPage().getCurrentCTN();
        System.out.println(ctn);
        String currentSimNumber = getDB().getSIMNumber(ctn);
        System.out.println("current sim Number "+currentSimNumber);
        getAccountManagementPage().enterCurrentSimNumber(currentSimNumber);
        String newSimNumber = getDB().getSIMSerialNumber();
        System.out.println("new sim number "+newSimNumber);
        getAccountManagementPage().enterNewSimNumber(newSimNumber);
        getAccountManagementPage().clickOnSaveButton();
        getAccountManagementPage().popUpFieldValidate();
    }

    @Test(groups = {"ACCTMGTCC","EAS","simSwap", "DAYONE","qaAuto","pfour"})
    public void CPP_26339_Validation_of_successfull_E2E_SIM_swap_change(){
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().clickOnSimSwap();
        String ctn = getAccountManagementPage().getCurrentCTN();
        System.out.println(ctn);
        String currentSimNumber = getDB().getSIMNumber(ctn);
        System.out.println("current sim Number "+currentSimNumber);
        getAccountManagementPage().enterCurrentSimNumber(currentSimNumber);
        String newSimNumber = getDB().getSIMSerialNumber();
        System.out.println("new sim number "+newSimNumber);
        getAccountManagementPage().enterNewSimNumber(newSimNumber);
        getAccountManagementPage().clickOnSaveButton();
        getAccountManagementPage().popUpFieldValidate();
    }
*/
    @Test(groups = {"ACCTMGTCC", "EAS", "Merchandising_Pages", "DAYONE", "qaAuto", "ptwo"})
    public void CPP_30932_Validate_Disable_Email_option_In_Customer_Profile() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().goToProfile();
        getPaymentPage().waitForPaymentPageLoad();
        getCarePortalDashBoard().validateMarketingPreferencesForEmail();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "merchandisingPages", "DAYONE", "qaAuto", "pfour"})
    public void CPP_30934_Validate_Marketing_Preference_Window_In_DashBoard() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        //getSignInPage().signInEas(username, password);
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().goToProfile();
        getPaymentPage().waitForPaymentPageLoad();
        getCarePortalDashBoard().validateMarketingPreferenceDashBoard();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "Payment", "DAYONE", "qaAuto", "pthree","SS","P1","ATMT"})
    public void CPP_29128_validate_Five_credit_card_Limit_Display_in_profile() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        getHeaderComponent().clickSignIn();
        //getSignInPage().signInEas(username, password);
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().goToManageSavedCards();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().validateStoreUpLimit();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "qaAuto", "DAYONE", "payment"})
    public void CPP_29131_ValidateStoredCardLimit_ViaChangePlan() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
        String plan = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("planValue");
        String planTab = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickOnchangePlan();
//        getPlanPage().ppcSelectPlanTab(planTab);
//        getPlanPage().selectPlan(plan);
        getPlanPage().selectRandom4GPlan();
        //getPlanPage().clickOnContinueAddon();
        getPlanPage().clickOnProceedButton();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getAccountManagementPage().validateStoreUpLimitViaChangePlan();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "qaAuto", "DAYONE", "payment"})
    public void CPP_29132_ValidateStoredCardLimit_ViaTopUp() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        getHeaderComponent().clickSignIn();
        //getSignInPage().signInEas(username, password);
        getSignInPage().signInEasFromExcel("ACTIVE");
        getHeaderComponent().clickTopUpFooterCTA();
        getCarePortalDashBoard().switchToLatestTab();
        getTopUpFormPage().selectCreditCard();
        getAccountManagementPage().validateStoreUpLimitViaChangePlan();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "qaAuto", "DAYONE", "payment","SS","P1","DASH"})
    public void CPP_37280_ValidatePanelDashBoardEnglish() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getTopUpFormPage().validateAllDashboardTab();
        /*getAccountManagementPage().selectProfileTab("My chatr");
        getTopUpFormPage().validateHelloBanner();
        getAccountManagementPage().selectProfileTab("current plan");
        getTopUpFormPage().validateHelloBanner();
        getAccountManagementPage().selectProfileTab("profile cta");
        getTopUpFormPage().validateHelloBanner();*/
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "qaAuto", "DAYONE", "payment"})
    public void CPP_37276_ValidateAccountBalanceColumn() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getTopUpFormPage().validateAccountBalanceEnglish();
        getHeaderComponent().changeLanguage("French");
        getTopUpFormPage().validateAccountBalanceFrench();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "qaAuto", "DAYONE", "payment"})
    public void CPP_37281_Verify_welcome_panel_when_customer_browses_chatr_website_French_localization() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getHeaderComponent().changeLanguage("French");
        getTopUpFormPage().validateHelloBannerFrench();
        getAccountManagementPage().selectProfileTab("My chatr");
//        getTopUpFormPage().validateHelloBannerFrench();
        getAccountManagementPage().selectProfileTab("current plan");
//        getTopUpFormPage().validateHelloBannerFrench();
        getAccountManagementPage().selectProfileTab("profile cta");
//        getTopUpFormPage().validateHelloBannerFrench();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "qaAuto", "pfour", "filter"})
    public void CPP_37389_Validate_Display_Current_Addons_on_account() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTCC");
        getHeaderComponent().clickCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateCurrentAddOn();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "qaAuto", "pfour", "filter","SS","P1","MAO"})
    public void CPP_37393_Validate_Display_AddOns_section_with_a_list_of_eligible_addons() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getHeaderComponent().clickCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "qaAuto", "pfour", "filter","SS","MAO","P1"})
    public void CPP_37387_Validate_Cart_Order_exceeds_300$() {
        String topUp = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("topUp");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getAccountManagementPage().enterTopUpMAO("301");
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().validVoucherPinSelfServe300$Error();


//        getHeaderComponent().clickMyChatr();
//        getHeaderComponent().validateOrderExceeds300Error();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "qaAuto", "pfour", "filter"})
    public void CPP_37544_Validation_to_check_the_selection_of_add_ons_in_MAO_flow_when_there_are_no_other_addons_selected_to_the_cart_previously() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().validateOrderSummary("NotEmpty");
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().validateOrderSummary("Empty");
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "MAO", "DAYONE", "qaAuto", "pfour", "filter"})
    public void CPP_37400_Validate_Navigate_to_MAO_page_by_direct_URL_when_the_customer_is_NOT_logged_in() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        String MAOPageDirectUrl = TestDataHandler.landingPageData.getMAOPageDirectUrl();
        getDriver().get(MAOPageDirectUrl);
        getSignInPage().signInEas1(username, password);
        getSignInPage().validateDirectURL_MAO(MAOPageDirectUrl);
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "qaAuto", "pfour", "filter"})
    public void CPP_37402_Validate_Initiate_Manage_Addon_flow_from_direct_URL_Active_inflight_order() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(2).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(2).get("password");

        String MAOPageDirectUrl = TestDataHandler.landingPageData.getMAOPageDirectUrl();
        getDriver().get(MAOPageDirectUrl);
        getSignInPage().signInEasFromExcel("IFO");
        getAccountManagementPage().validateMAOBtn_inflight_Order();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "qaAuto", "pfour", "filter"})
    public void CPP_37403_Validate_Initiate_Manage_Addon_flow_from_direct_URL_Expired_Account() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(3).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(3).get("password");

        String MAOPageDirectUrl = TestDataHandler.landingPageData.getMAOPageDirectUrl();
        getDriver().get(MAOPageDirectUrl);
        getSignInPage().signInEas1(username, password);
        getSignInPage().validateDirectURL_MAO(MAOPageDirectUrl);
        getAccountManagementPage().validateMAOBtn_Expired_Account();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "qaAuto", "pfour", "filter"})
    public void CPP_37404_Validate_Navigate_to_MAO_page_by_direct_URLwhen_the_Order_is_still_inprogress() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
        String MAOPageDirectUrl = TestDataHandler.landingPageData.getMAOPageDirectUrl();

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        //getSignInPage().signInEasFromExcel("ACTCC");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().clickSignOut();
        getAccountManagementPage().openDirectURL(MAOPageDirectUrl);
        getSignInPage().signInEas1(username, password);
        getSignInPage().validateDirectURL_MAO(MAOPageDirectUrl);
        getAccountManagementPage().validateMAOBtn_inprogress_Order();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "qaAuto", "pfour", "filter"})
    public void CPP_37295_Submit_MAO_order_TnC_not_Checked_AC_3() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("NOCC");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().waitForPaymentPageLoad();
        getHeaderComponent().validate_TnC_not_Checked();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "qaAuto", "pfour", "filter"})
    public void CPP_37296_Navigate_to_previous_step_by_quick_link_Edit_AC_4() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        String topUp = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("topUp");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAccountManagementPage().enterTopUpMAO(topUp);
        getAccountManagementPage().clickContinueBtn_MAO();
        getAccountManagementPage().clickPaymentEditbtnMAO();
        //getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAccountManagementPage().validateTopUpExtraAmtMAO(topUp);
        /*int itopUp = Integer.parseInt(topUp) + 1;
        topUp = Integer.toString(itopUp);*/
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().enterTopUpMAO(topUp);
        getAccountManagementPage().clickContinueBtn_MAO();
        //getCarePortalHomePage().refreshPage();
        getAccountManagementPage().validateTopUpExtraAmtMAO(topUp);
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "qaAuto", "pfour", "filter","SS","P1","MAO"})
    public void CPP_37405_Validate_payment_details_on_order_page_Voucher_AC6() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
        String voucher70 = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("voucher70");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().clickCreditCardRadioBtn("Topup");
        getPaymentPage().enterVoucherPin("Voucher40", "Status40");
        getAccountManagementPage().clickContinueBtn_MAO();
        //getAccountManagementPage().clickContinueBtn();
        getAccountManagementPage().validateOrderReviewPageMAO();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "qaAuto", "pfour", "filter"})
    public void CPP_37524_Validate_in_MAO_Voucher_amount_is_equal_to_the_cart_amount() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
        String voucher10 = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("voucher10");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Topup");
        getPaymentPage().enterVoucherPin("Voucher10", "Status10");
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().waitForPaymentPageLoad();
        getHeaderComponent().validateAddOnAmountWithCart();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "qaAuto", "pfour", "filter"})
    public void CPP_37525_Validate_in_MAO_Error_Handling_on_click_of_Proceed_when_chatr_Top_Up_card_is_selected_and_PIN_not_entered() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("NOCCB");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Topup");
        getAccountManagementPage().clickContinueBtn_MAO();
        getAccountManagementPage().validateTopUpWithoutPin();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "qaAuto", "run","SS","P1","DASH"})
    public void CPP_37272_Validate_view_plan_usage_summary() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("MAX");
        getAccountManagementPage().validateMyChatrOnDashBoard();
        getAccountManagementPage().validatePlanUsageSummery();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "qaAuto", "run"})
    public void CPP_37279_verify_customer_is_able_to_view_anniversary_date_block_on_My_chatr_tab() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().validateMyChatrOnDashBoard();
        getAccountManagementPage().validateAccountBalanceDetails();
        getAccountManagementPage().validateAccountStatusDetails("Active");
        getAccountManagementPage().validateAnniversaryDetails();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "qaAuto", "pfour", "filter"})
    public void CPP_42472_Verify_chatr_customer_validates_the_displayed_Promotion_usage() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().validatePromotionUsage();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "qaAuto", "pfour", "filter"})
    public void CPP_42591_Verify_that_system_Display_Promotions_on_the_current_plan_tab() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
        String planTab = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("planTab");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getHeaderComponent().clickCurrentPlan();
        getHeaderComponent().clickOnChangePlanBtn();
        getPlanPage().selectPlanTab(planTab);
        getAccountManagementPage().validatePPCPromotionDetails();
    }
    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "payment"})
    public void CPP_37344_Validate_ManageAddOns() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(4).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(4).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("IFO");
        getAccountManagementPage().clickOnCurrentPlan();
        //getAccountManagementPage().validateErrorMessageForExpiredAccount();
        getAccountManagementPage().validateAddonIsDisabled();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "payment"})
    public void CPP_37345_Validate_ManageAddOnsDisabled() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(4).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(4).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("IFO");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().validateAddonIsDisabled();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "payment"})
    public void CPP_37346_Validate_ManageAddOnsDisabledForPendingOrders() {
        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("IFO");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().validateErrorMessageForPendingOrders();
    }

    /*@Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "payment","SS","P1","MAO"})
    public void CPP_37483_Validate_ManageAddOnsFlow_WithCreditCard()*/
    @Test(groups = {" MAO using CC "})
    public void TC_05_Validate_E2E_MAO_using_CC_and_ensure_the_tax_calculation_is_correct_and_provisioning_is_successful_in_all_the_systems_like_D1_PBM_RTRM_with_the_email_notification(){
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTCC");
        //getSignInPage().signInEas(username,password);
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAccountManagementPage().validateAccountInsufficientBalance();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getAutoPay().validateSavedCreditCard();
        getAccountManagementPage().clickContinueBtn_MAO();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getAccountManagementPage().validateOrderReviewPageCCMAO();
        getReviewOrderPage().clickOnTermAndConditions();
        getPaymentPage().clickOnContinue();
        getPaymentPage().waitForPaymentPageLoad();
        getCarePortalDashBoard().validateExtraMoneyAddInCC();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "payment","SS","MAO","P1"})
    public void CPP_37484_Validate_ManageAddOnsFlow_WithVoucher() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
        String voucher70 = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("voucher70");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("Bipin2");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAccountManagementPage().clickCreditCardRadioBtn("Topup");
        getPaymentPage().enterVoucherPin("Voucher10","Status10");
        getAccountManagementPage().clickContinueBtn_MAO();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getAccountManagementPage().validateOrderReviewPageMAO();
        getReviewOrderPage().clickOnTermAndConditions();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().waitForPaymentPageLoad();
        getOrderConfirmationPage().validateOrderPageforMAO_SS();
    }
    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "payment"})
    public void CPP_37515_Validate_ManageAddOnsFlow_WithVoucherInsufficientBalance() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
        String voucher10 = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("voucher10");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAccountManagementPage().clickCreditCardRadioBtn("Topup");
        getPaymentPage().enterVoucherPin("Voucher25", "Status25");
        getAccountManagementPage().clickContinueBtn_MAO();
        getOrderConfirmationPage().waitForOrderConfirmationPage();
        getAccountManagementPage().validateOrderReviewPageMAO();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "payment"})
    public void CPP_37516_Validate_ManageAddOnsFlow_InvalidVoucherPin() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
       /* getAccountManagementPage().clickCreditCardRadioBtn("Topup");*/
        getTopUpFormPage().selectPaymentMethod("Voucher");
        getPaymentPage().enterInvalidPin("123456789012");
        getAccountManagementPage().validateVoucherErrorInvalidPin();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "payment"})
    public void CPP_37520_Validate_ManageAddOnsFlow_AlreadyVoucherPin() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
        String usedVoucherPIN = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("usedVoucherPIN");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLLB");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAccountManagementPage().clickCreditCardRadioBtn("Topup");
        getPaymentPage().enterValidPin("209853150648");
        //getPaymentPage().enterVoucherPin("Voucher25", "Status25");
        getCarePortalHomePage().validateVoucherAlreadyUsedError();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "payment"})
    public void CPP_37522_Validate_ManageAddOnsFlow_InsufficientVoucherBalance() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAccountManagementPage().validateAccountInsufficientBalance();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "payment"})
    public void CPP_37535_Validate_ManageAddOnsFlow_InsufficientVoucherBalanceNoSavedCreditCard() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");
        String creditCard = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cardNumber");
        String cvv = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cvv");
        String expiryDate = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("expiryDate");
        String topUp = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("topUp");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("NOCCB");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        //getAccountManagementPage().clickAddCard();
        getAccountManagementPage().setCardDetails(creditCard, expiryDate, cvv);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getAccountManagementPage().enterTopUpMAO(topUp);
        getAccountManagementPage().clickContinueBtn_MAO();
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().validateOrderReviewPageCCMAO();
    }

//    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "payment"})
//    public void CPP_37538_Validate_ManageAddOnsFlow_CreditCardData_Erased() {
//        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
//        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
//        String creditCard = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cardNumber");
//        String cvv = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cvv");
//        String expiryDate = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("expiryDate");
//
//        getHeaderComponent().clickSignIn();
//        getSignInPage().signInEasFromExcel("ACTIVE");
//        getAccountManagementPage().clickOnCurrentPlan();
//        getAccountManagementPage().clickManageBtn();
//        getAccountManagementPage().validateEligibleAddOn();
//        getAccountManagementPage().clickAddOnCheckbox();
//        getAccountManagementPage().clickContinueBtn_MAO();
//        getTopUpFormPage().selectPaymentMethod("Credit");
//        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
//        getAccountManagementPage().clickAddCard();
//        getAccountManagementPage().setCardDetails(creditCard, expiryDate, cvv);
//        getTopUpFormPage().selectPaymentMethod("Topup");
//        //getAccountManagementPage().clickCreditCardRadioBtn("Topup");
//        //getPaymentPage().waitForPaymentPageLoad();
//        getTopUpFormPage().selectPaymentMethod("Credit");
//        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
//        getAccountManagementPage().validateCardDetailsEmpty();
//    }

    /*    @Test(groups = {"ACCTMGTCC","EAS","qaAuto", "DAYONE", "payment"})
        public void CPP_37289_Validate_autopay_bonus_usage_block_Expired_Account() {
            String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(4).get("username");
            String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(4).get("password");

            getHeaderComponent().clickSignIn();
            getSignInPage().signInEas(username, password);
            getCarePortalDashBoard().validateAccountStatusDetails("Inactive");
            getCarePortalDashBoard().validateAutopayBlock();
        }*/
    @Test(groups = {"ACCTMGTCC", "EAS", "qaAuto", "DAYONE", "payment"})
    public void CPP_37534_Validate_Display_of_CreditCard_as_Paymentmethod_Saved_CreditCards_Use_Another_Credit_Card() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
        String creditCard = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cardNumber");
        String cvv = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cvv");
        String expiryDate = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("expiryDate");
        String topUp = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("topUp");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
        getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAccountManagementPage().clickAddCard();
        getAccountManagementPage().setCardDetails(creditCard, expiryDate, cvv);
        getPaymentPage().selectBillingAddressAsPrimaryAddress();
        getAccountManagementPage().enterTopUpMAO(topUp);
        getTopUpFormPage().selectPaymentMethod("TopUp");
        getAccountManagementPage().clickContinueBtn_MAO();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "qaAuto", "DAYONE", "payment"})
    public void CPP_37585_Validate_Cancel_swap_of_Autopay_card() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLL");
        getAccountManagementPage().selectProfileTab("profile cta");
        getAccountManagementPage().goToManageSavedCards();
        getAccountManagementPage().validateNoDataChange();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "qaAuto", "DAYONE", "payment"})
    public void CPP_38939_Validate_Autopay_UnEnrollment_Flow() throws AWTException, InterruptedException {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("Bipin7");
        //getSignInPage().signInEas(username,password);
        /*String temp = getAutoPay().getAutoPayEnrollStatus();
        System.out.print(temp);
        if (temp.toUpperCase().contains("NOT")) {
            getAutoPay().clickOnEnrollAutopay();
            getPaymentPage().clickOnContinue();
            getAutoPay().selectTheSaveCreditCard();
            getPaymentPage().clickOnContinue();
            getReviewOrderPage().clickOnAutoPayCheckBox();
            //getPaymentPage().clickOnSaveCCCheckBox();
            getPaymentPage().clickOnContinue();
            getTopUpFormPage().clickOnMyChatr();
            getTopUpFormPage().clickOnRefreshPage();
            getPaymentPage().waitForPaymentPageLoad();
            getTopUpFormPage().clickOnRefreshPage();
            getPaymentPage().waitForPaymentPageLoad();
        }*/
        getAutoPay().clickOnUnEnrollment();
        getAutoPay().clickOnYesUnEnroll();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().clickOnRefreshPage();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().clickOnRefreshPage();
        getPaymentPage().waitForPaymentPageLoad();
        getAutoPay().validateAutoPayUnEnroll();
        /** EMAIL NOTIFICATION VALIDATION */
//        getAccountManagementPage().goToAccountHistory();
//        getHistoryReportsPage().navigateTo("OrderHistory");
//        String orderId = getHistoryReportsPage().getLatestOrderIdForSS();
//        getChampPage().accountLogOut("SS");
//        getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();getPaymentPage().waitForPaymentPageLoad();
//        getChampPage().openNewTabInSameWindowForOutlook(orderId,"APU");/**/

    }

    @Test(groups = {"ACCTMGTCC", "EAS", "DAYONE", "payment"})
    public void CPP_37532_Validate_AC_1_Customer_wants_to_add_Extra_Money_to_his_Account_Balance_using_Credit_Card() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
        String topUpAmt = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("topUp");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnCurrentPlan();
        getAccountManagementPage().clickManageBtn();
        getAccountManagementPage().validateEligibleAddOn();
        getAccountManagementPage().clickAddOnCheckbox();
        getAccountManagementPage().clickContinueBtn_MAO();
        getTopUpFormPage().selectPaymentMethod("Credit");
        //getAccountManagementPage().clickCreditCardRadioBtn("Credit");
        getAccountManagementPage().enterTopUpMAO(topUpAmt);
        getAccountManagementPage().validateExtraMoneyAmt(topUpAmt);
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "qaAuto", "DAYONE"})
    public void CPP_30920_Validate_Credit_Card_Save_Model_Flow() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
        String creditCard = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cardNumber");
        String cvv = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("cvv");
        String expiryDate = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("expiryDate");
        String city = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("city");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().goToManageSavedCards();
        getAccountManagementPage().clickAddCard();
        getAccountManagementPage().setCardDetails(creditCard, expiryDate, cvv);
        getAccountManagementPage().setName("Automation", "Testing");
        getAccountManagementPage().setAddress(city);
        getAccountManagementPage().clickSave();
        /*getAccountManagementPage().validateCardSavedModal();*/
        getAccountManagementPage().validateCardIsPresent();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "qaAuto", "Scrum","SS","AUTOPAY","P1"})
    public void CPP_37555_ValidateAutoPayEnroll_WithoutBonus() {

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTCC");
        getAutoPay().clickOnEnrollAutopay();
        getPaymentPage().clickOnContinue();
        getAutoPay().selectTheSaveCreditCard();
        getPaymentPage().clickOnContinue();
        //getPaymentPage().clickOnSaveCCCheckBox();
        getReviewOrderPage().clickOnAutoPayCheckBox();
        getPaymentPage().clickOnContinue();
        getAccountManagementPage().validateSuccessModel();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "qaAuto", "DAYONE", "payment"})
    public void CPP_37595_Validate_Autopay_UnEnrollment_FlowWithoutBonus() throws AWTException {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
        String topUp = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("topUp");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("UNENROLL");
        String temp = getAutoPay().getAutoPayEnrollStatus();
        System.out.print(temp);
        if (temp.toUpperCase().contains("NOT")) {
            getAutoPay().clickOnEnrollAutopay();
            getPaymentPage().clickOnContinue();
            getAutoPay().selectTheSaveCreditCard();
            getPaymentPage().clickOnContinue();
            //getPaymentPage().clickOnSaveCCCheckBox();
            getReviewOrderPage().clickOnAutoPayCheckBox();
            getPaymentPage().clickOnContinue();
            getPaymentPage().waitForPaymentPageLoad();
            getTopUpFormPage().clickOnMyChatr();
            getTopUpFormPage().clickOnRefreshPage();
        }
        getAutoPay().clickOnUnEnrollment();
        //getAutoPay().validate_modal_window();
        getAutoPay().clickOnYesUnEnroll();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().clickOnRefreshPage();
        getAutoPay().validateAutoPayUnEnroll();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "qaAuto", "pfour", "filter"})
    public void CPP_33193_Verify_User_Able_To_Edit_Expiration_Date_and_Error_Message() {

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnProfileTab();
        getAccountManagementPage().goToManageSavedCards();
        getAccountManagementPage().clickOnEditIcon();
        getAccountManagementPage().enterInvalidExpiryDetails();
        getAccountManagementPage().validateErrorMessageInvalidExpiryDate();
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "qaAuto", "pfour", "filter"})
    public void CPP_33189_Verify_The_Edited_CC_Details_Are_Saved_And_Shown_On_Profile_Page() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
        String expDate = "12/24";
        String expDate1 = "11/24";
        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnProfileTab();
        getAccountManagementPage().goToManageSavedCards();
        getAccountManagementPage().clickOnEditIcon();
        String oldExpDate = getAccountManagementPage().getExpiryDate();
        String newExpDate = getAccountManagementPage().enterNewCCExpiryDate(oldExpDate, expDate, expDate1);
        getAccountManagementPage().clickOnAutoPayCheckBox();
        getAccountManagementPage().clickOnSave();
        getCarePortalHomePage().refreshPage();
        getCarePortalHomePage().refreshPage();
        getAccountManagementPage().clickOnProfileTab();
        getAccountManagementPage().validateChangedExpiryDate(newExpDate);
    }

    @Test(groups = {"PpcFlow", "1to1", "qaAuto", "EAS"})
    public void CPP_33030_Validate_Error_Message_For_New_PIN_Confirm_New_PIN_Inputs() {
        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTCC");
        getAccountManagementPage().clickOnProfileTab();
        getAccountManagementPage().clickOnMPIN();
        getAccountManagementPage().validateErrorMessageNewPinAndConfirmPin("123");
        getAccountManagementPage().validateErrorMessageNewPinAndConfirmPin("abc");
        getAccountManagementPage().validateErrorMessageNewPinAndConfirmPin("@#$");
    }

    @Test(groups = {"PpcFlow", "1to1", "qaAuto", "EAS"})
    public void CPP_32985_Validate_PIN_Was_Not_Set_By_User_Hence_PIN_Shown_Is_NA() {

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnProfileTab();
        getAccountManagementPage().validatePinStatus("N/A ****");
    }

    @Test(groups = {"PpcFlow", "1to1", "qaAuto", "EAS"})
    public void CPP_32986_Validate_PIN_Has_Been_Set_Earlier_By_User(){

        getHeaderComponent().clickSignIn();
       // getSignInPage().signInEas(username, password);
        getSignInPage().signInEasFromExcel("ACTCC");
        getAccountManagementPage().clickOnProfileTab();
        getAccountManagementPage().validatePinStatus("N/A ****");
    }

    @Test(groups = {"PpcFlow", "1to1", "qaAuto", "EAS"})
    public void CPP_32949_Validate_Successful_Setting_Of_The_PIN() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLLB");
        getAccountManagementPage().clickOnProfileTab();
        getAccountManagementPage().clickOnMPIN();
        getAccountManagementPage().validatePinSuccessfullySetByUser("1234");
    }

    @Test(groups = {"PpcFlow", "1to1", "qaAuto", "EAS"})
    public void CPP_33016_Validate_Display_The_Success_Modal_After_Clicks_On_Submit() {

        getHeaderComponent().clickSignIn();
        //getSignInPage().signInEas(username, password);
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnProfileTab();
        getAccountManagementPage().validatePinStatus("N/A ****");
        getAccountManagementPage().clickOnMPIN();
        getAccountManagementPage().validatePinSuccessfullySetByUser("1234");
        getAccountManagementPage().clickOnBackToChatR();
        getAccountManagementPage().clickOnProfileTab();
        getAccountManagementPage().validatePinStatus("N/A ****");
    }

    @Test(groups = {"ACCTMGTCC", "EAS", "qaAuto", "pfour", "filter","SS","P1","MP"})
    public void CPP_30931_Validating_Disable_Text_Message_Option_In_Customer_Profile() {
        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().clickOnProfileTab();
        getCarePortalDashBoard().validateMarketingPreferencesForTextMessage();
    }
}

