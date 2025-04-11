package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class NAC_PortInFlow_Test1 extends BaseTest{

    @Test(groups = {"PORTINTWO", "AccountValidation","DAYTWO","qaAuto","pone"})
    public void CPP_29300_Validate_Account_Number_TelusMobility_Provider() {
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInTelusPhoneNo");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan("15");
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        //getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" + RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().validationForTelusMobility();
    }
    @Test(groups = {"PORTINTWO", "AccountValidation","DAYTWO","qaAuto","pone"})
    public void CPP_29305_Validate_Account_Number_SaskTell_Provider() {
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInSaskPhoneNo");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
       // getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" + RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().validationForSaskTellMobility();
    }
    @Test(groups = {"PORTINTWO", "AccountValidation","DAYTWO","qaAuto","pone"})
    public void CPP_29298_Validate_Account_Number_Fido_Provider(){
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInFidoPhoneNo");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
       // getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" + RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().validationForFidoMobility();
    }
    @Test(groups = {"PORTINTWO", "AccountValidation","DAYTWO","qaAuto","pone"})
    public void CPP_29297_Validate_Account_Number_Rogers_Provider(){
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInRogersPhoneNo");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
       // getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" + RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().validationForRogersMobility();
    }
    @Test(groups = {"PORTINTWO", "AccountValidation","DAYTWO","qaAuto","pone"})
    public void CPP_29310_Validate_Account_Number_Freedom_Provider(){
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInFreedomPhoneNo");
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
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" + RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().validationForFreedomMobility();
    }
    @Test(groups = {"PORTINTWO", "AccountValidation","DAYTWO","qaAuto","pone"})
    public void CPP_29299_Validate_Account_Number_Bell_Provider(){
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInBellPhoneNo");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().selectRandom4GPlan();
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
       // getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" + RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().validationForBellMobility();
    }
    @Test(groups = {"PORTINTWO", "AccountValidation","DAYTWO","qaAuto","pone"})
    public void CPP_24802_Validate_Fido_Solution_except_only_Numbers(){
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInFidoPhoneNo");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        /*getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);*/
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
        //getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" + RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().validationForFidoMobility();
    }
    @Test(groups = {"PORTINTWO", "AccountValidation","DAYTWO","qaAuto","pone"})
    public void CPP_24806_Validate_Rogers_wireless_except_for_only_Numbers(){
        String province = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("province");
        String city = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("city");
        String plan = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planValue");
        String planTab = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("planTab");
        String ExistingPhoneNumber = TestDataHandler.nacPortInData.getNacPortInData().get(0).get("nacPortInRogersPhoneNo");
        String simSerialNumber = getDB().getSIMSerialNumber();

        getHeaderComponent().clickActivate();
        getPlanPage().waitForPlanPageLoad();
        getPlanPage().selectCity(province, city);
        getPlanPage().selectPlanTab(planTab);
        getPlanPage().selectPlan(plan);
        getPlanPage().clickOnContinue();
        getSimPage().waitForSimPageLoad();
       // getSimPage().validateOrderSimLink();
        getSimPage().setSimDetails(simSerialNumber);
        ExistingPhoneNumber = ExistingPhoneNumber+ "-" + RandomStringUtils.randomNumeric(4);
        getSimPage().populateExistingNumber(ExistingPhoneNumber);
        getSimPage().validationForRogersMobility();
    }

}
