package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

public class SimSwap_Test extends BaseTest {

/*
    @Test(groups = {"SSSST", "qaAuto","pfour"})
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
    @Test(groups = {"SSSST","qaAuto","pfour"})
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
    }

    @Test(groups = {"SSSST", "DAYONE","qaAuto","pfour"})
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
    @Test(groups = {"SSSST", "DAYONE","qaAuto","pfour"})
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

//    @Test(groups = {"SSSST","DAYONE", "EAS","ptwo"})
//    public void CPP_24594_validate_SimSwap_for_current_simNumber_Green_Checkmark_As_Successful()
    @Test(groups = {"Sim Swap"})
    public void TC_08_Validate_E2E_SIM_SWAP_flow_and_ensure_the_provisioning_is_successful_in_all_CPP_systems__SS(){
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLLB");
       // getSignInPage().signInEas(username,password);
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().clickOnSimSwap();
        getPaymentPage().waitForPaymentPageLoad();
        String ctn = getAccountManagementPage().getCurrentCTN();
        System.out.println(ctn);
        String currentSimNumber = getDB().getSIMNumber(ctn);
        System.out.println("current sim Number " + currentSimNumber);
        getAccountManagementPage().enterCurrentSimNumber(currentSimNumber);
        String newSimNumber = getDB().getSIMSerialNumber();
        System.out.println("new sim number " + newSimNumber);
        getAccountManagementPage().enterNewSimNumber(newSimNumber);
        getAccountManagementPage().validateSuccessfulGreenCheckMarkInNewSimField();
    }

    @Test(groups = {"SSSST", "DAYONE","EAS","pfour"})
    public void CPP_33824_User_able_to_update_the_SIM_thru_SIM_SWAP_order(){
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().clickOnSimSwap();
        getPaymentPage().waitForPaymentPageLoad();
        String ctn = getAccountManagementPage().getCurrentCTN();
        String currentSimNumber = getDB().getSIMNumber(ctn);
        System.out.println("current sim Number " + currentSimNumber);
        getAccountManagementPage().enterCurrentSimNumber(currentSimNumber);
        String newSimNumber = getDB().getSIMSerialNumber();
        getAccountManagementPage().enterNewSimNumber(newSimNumber);
        getAccountManagementPage().clickOnSaveButton();
        getAccountManagementPage().popUpFieldValidate();
    }
    @Test(groups = {"CARE","CARE", "qa1", "Scrum","pfour"})
    public void CPP_31167_Validate_Confirmation_Page_In_TNC_Flow_For_Successfully_Requested_For_New_Number() {
        String username = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("username");
        String password = TestDataHandler.acctMgmtData.getAcctMgmtData().get(1).get("password");
        String orderHtyColumnName = TestDataHandler.careNacData.getCareNacData().get(0).get("orderHtyColumnName");

        if (System.getProperty("Environment").equals("qa4")) {
            getCarePortalHomePage().goToLandingPage();
        } else {
            getChampPage().navigateToCarePortal();
        }
        getCarePortalHomePage().customerSearch("2365566073");
       // getCarePortalHomePage().customerSearch("");
        getCarePortalHomePage().clickOnCheck();
        getCarePortalHomePage().clickOnClickHere();
        getCarePortalHomePage().clickTelephoneNumberChageButton();
        //getCarePortalHomePage().validateTelephoneNumberChageCancel();
        getCarePortalHomePage().validateTelephoneNumberChageSuccess();
        getCarePortalHomePage().clickOnBackToDashboard();
        getCarePortalHomePage().refreshPage();
        getCarePortalDashBoard().clickOnHistoryReports();
        getHistoryReportsPage().navigateToCARE("Order");
        getHistoryReportsPage().validateCareAgentTargetedOfferColumnData(orderHtyColumnName,"Order type;Status","Phone number Change;Successful");
    }
}
