package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

public class HistoryReports_Test1 extends BaseTest {
    @Test(groups = {"HISRPTONE","EAS", "DAYTWO","qaAuto","pfour"})
    public void CPP_24867_Validate_past7DaysPreSelected_ValidateTableObjects() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String orderHtySubFilter = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtySubFilter");
        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Order");
        getHistoryReportsPage().validatePast7DaysSelected();
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateFilterFieldSubOptions(orderHtySubFilter);
        getHistoryReportsPage().validateSearchResultTableColumn(orderHtyColumnName);
    }
    @Test(groups = {"HISRPTONE","EAS", "DAYTWO", "qaAuto","pfour"})
    public void CPP_24868_ValidateFiltersOrderHistoryPage() {
        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Order");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateQuantityDropDown(orderHtyColumnName,"Status","5");
        //getHistoryReportsPage().validatePagination();
    }
    @Test(groups = {"HISRPTONE","EAS", "DAYTWO","qaAuto","pfour"})
    public void CPP_37325_validate_Account_history_report_filtered_Past7days_Filter_Get_Selectedby_Default() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String acctHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("acctHtyColumnName");
        String acctHtySubFilter = TestDataHandler.hisrptData.getHisRptData().get(0).get("acctHtySubFilter");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Account");
        getHistoryReportsPage().validatePast7DaysSelected();
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateFilterFieldSubOptions(acctHtySubFilter);
        getHistoryReportsPage().validateSearchResultTableColumn(acctHtyColumnName);

    }
    @Test(groups = {"HISRPTONE", "onetoone","EAS","pfour"})
    public void CPP_37143_validate_Usage_history_report_filtered_7days_Filter() {
        String usageHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("usageHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("USAGE");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Usage");
        getHistoryReportsPage().validatePast7DaysSelected();
        getHistoryReportsPage().validateSearchResultTableColumn(usageHtyColumnName);
    }
    @Test(groups = {"HISRPTONE", "onetoone","EAS","pfour"})
    public void CPP_37144_validate_Account_history_report_filtered_Past30days_Filter() {
        String usageHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("usageHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("USAGE");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Usage");
        getHistoryReportsPage().validate30DaysSelected();
        getHistoryReportsPage().validateRangeOfDateRecordValue(usageHtyColumnName,"Date",30);
    }
    @Test(groups = {"HISRPTONE", "onetoone","EAS","pfour"})
    public void CPP_37337_validate_Account_history_report_CustomDate_From_To_Filter() {
        String usageHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("usageHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("USAGE");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Usage");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateRangeOfDateRecordValue(usageHtyColumnName,"Date",days);
    }
    @Test(groups = {"HISRPTONE","EAS", "DAYONE","qaAuto","pfour"})
    public void CPP_37335_validate_Usage_History_7days_Filter_And_Report_Display() {
        String usageHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("usageHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("USAGE");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Usage");
        getHistoryReportsPage().validatePast7DaysSelected();
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateRangeOfDateRecordValue(usageHtyColumnName,"Date",7);
    }
    @Test(groups = {"HISRPTONE","EAS", "DAYONE","qaAuto","pfour"})
    public void CPP_37336_validate_Usage_History_30days_Filter_And_Report_Display() {
        String usageHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("usageHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("USAGE");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Usage");
        getHistoryReportsPage().validate30DaysSelected();
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateRangeOfDateRecordValue(usageHtyColumnName,"Date",30);
    }
    @Test(groups = {"HISRPTONE","EAS","onetoone","qaAuto","pfour"})
    public void CPP_37675_validate_Usage_history_report_filtered_Past7days_Filter_Get_Selectedby_Default() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(1).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(1).get("password");
        String usageHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("usageHtyColumnName");
        String usageHtySubFilter = TestDataHandler.hisrptData.getHisRptData().get(0).get("usageHtySubFilter");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("USAGE");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Usage");
        getHistoryReportsPage().validatePast7DaysSelected();
        //getHistoryReportsPage().validateFilterFieldSubOptions(usageHtySubFilter);
        // getHistoryReportsPage().validateSearchResultTableColumn(usageHtyColumnName);
    }
    @Test(groups = {"HISRPTONE","EAS","onetoone","qaAuto","pfour","filter"})
    public void CPP_37685_Validate_The_Change_Sorting_By_Account_Balance_On_Usage_History_Report_Page() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(1).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(1).get("password");
        String usageHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("usageHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("USAGE");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Usage");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateSortByTextButtonUsage(usageHtyColumnName,"balance");
    }
    @Test(groups = {"HISRPTONE","EAS","onetoone","qaAuto","pfour","filter"})
    public void CPP_37686_Validate_The_Change_Sorting_By_Call_Type_On_Usage_History_Report_Page() {
        String usageHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("usageHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("USAGE");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Usage");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateSortByTextButtonUsage(usageHtyColumnName,"Coverage");
    }
    @Test(groups = {"HISRPTONE","EAS", "onetoone","qaAuto"})
    public void CPP_37692_Validate_Usage_History_Navigate_through_pagination(){
        /*String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");*/
        String usageHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("usageHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("USAGE");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Usage");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateQuantityDropDown(usageHtyColumnName,"Date","5");
        getHistoryReportsPage().validatePagination();
    }
    @Test(groups = {"HISRPTONE","EAS", "onetoone","qaAuto"})
    public void CPP_37693_Validate_Change_Report_Rows_Number_By_Dropdown_From_Pagination_Control(){
        /*String username = TestDataHandler.hisrptData.getHisRptData().get(1).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(1).get("password");*/
        String usageHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("usageHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("USAGE");
        getAccountManagementPage().goToAccountHistory();
        getPaymentPage().waitForPaymentPageLoad();
        getHistoryReportsPage().navigateTo("Usage");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateQuantityDropDown(usageHtyColumnName,"Date","5");
        getHistoryReportsPage().validateQuantityDropDown(usageHtyColumnName,"Date","10");
        getHistoryReportsPage().validateQuantityDropDown(usageHtyColumnName,"Date","20");
        getHistoryReportsPage().validateQuantityDropDown(usageHtyColumnName,"Date","50");
    }

    @Test(groups = {"HISRPTONE","EAS","onetoone","qaAuto","pfour","filter"})
    public void CPP_37292_Validate_Save_Usage_History_Report() {

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("USAGE");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Usage");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateClickExportToPDF();
    }
    @Test(groups = {"HISRPTONE","EAS","DAYONE","qaAuto","pfour","filter"})
    public void CPP_37687_Validate_Retrieve_records_by_call_type() {
       /* String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");*/
        String usageHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("usageHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("USAGE");
//        getAccountManagementPage().clickOnProfileTab();
//        getAccountManagementPage().clickOnHistoryReports();
//        getCarePortalDashBoard().switchToLatestTab();
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Usage");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().navigateToFilters("Usage");
        getHistoryReportsPage().validateApplyFilterButton("Data");
        getHistoryReportsPage().validateCrossButton();
        getHistoryReportsPage().validateRecordsListedBasedOnColumnFilter(usageHtyColumnName,"Usage","Data");
    }

    @Test(groups = {"HISRPTONE","EAS","DAYONE","qaAuto","pfour","filter"})
    public void CPP_37676_Validate_From_to_date_filter_logic_in_the_Usage_history_report_tab_AC2() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(1).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(1).get("password");
        String usageHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("usageHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("USAGE");
        getAccountManagementPage().goToAccountHistory();
//        getAccountManagementPage().clickOnProfileTab();
//        getAccountManagementPage().clickOnHistoryReports();
//        getCarePortalDashBoard().switchToLatestTab();
        getHistoryReportsPage().navigateTo("Usage");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getPaymentPage().waitForPaymentPageLoad();
        getHistoryReportsPage().validateRangeOfDateRecordValue(usageHtyColumnName,"Date",90);
    }
}
