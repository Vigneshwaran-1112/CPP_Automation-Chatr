package com.rogers.test.tests.desktop.selfServe;

import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;


public class HistoryReports_Test extends BaseTest {

    //    @Test(groups = { "HISRPT","EAS","Scrum" })
//    public void CPP_23971_ValidateOrderHistoryDateRanges90Days() {
//        String username = TestDataHandler.accountData.getAccountData().get(0).get("username");
//        String password = TestDataHandler.accountData.getAccountData().get(0).get("password");
//
//        getHeaderComponent().clickSignIn();
//        getSignInPage().signIn(username,password);
//        getAccountManagementPage().goToAccountHistory();
//        getHistoryReportsPage().navigateTo("OrderHistory");
//        int days = 90; int rangeFrom = 15; int rangeTo = 13;
//        getHistoryReportsPage().inputDateToDatePicker(days);
//        getHistoryReportsPage().validateRangesInTable(days,rangeFrom,rangeTo);
//    }
//    @Test(groups = { "HISRPT","EAS" ,"Scrum"})
//    public void CPP_23971_ValidateOrderHistoryDateRanges60Days() {
//        String username = TestDataHandler.accountData.getAccountData().get(0).get("username");
//        String password = TestDataHandler.accountData.getAccountData().get(0).get("password");
//
//        getHeaderComponent().clickSignIn();
//        getSignInPage().signIn(username,password);
//        getAccountManagementPage().goToAccountHistory();
//        getHistoryReportsPage().navigateTo("OrderHistory");
//        int days = 60; int rangeFrom = 15; int rangeTo = 13;
//        getHistoryReportsPage().inputDateToDatePicker(days);
//        getHistoryReportsPage().validateRangesInTable(days,rangeFrom,rangeTo);
//    }
//    @Test(groups = { "HISRPT","EAS","Scrum" })
//    public void CPP_23971_ValidateTableObjectsOrderHistoryDateRanges() {
//        String username = TestDataHandler.accountData.getAccountData().get(0).get("username");
//        String password = TestDataHandler.accountData.getAccountData().get(0).get("password");
//
//        getHeaderComponent().clickSignIn();
//        getSignInPage().signIn(username,password);
//        getAccountManagementPage().goToAccountHistory();
//        getHistoryReportsPage().navigateTo("OrderHistory");
//        int days = 90;
//        getHistoryReportsPage().inputDateToDatePicker(days);
//        getHistoryReportsPage().validateTableObjects();
//        getHistoryReportsPage().validateExportToPDF();
//        days = 30;
//        getHistoryReportsPage().inputDateToDatePicker(days);
//        getHistoryReportsPage().validateTableObjects();
//    }
//    @Test(groups = { "HISRPT","EAS", "French","Scrum" })
//    public void CPP_25820_ValidateOrderHistoryDateRanges30DaysFrench() {
//        String username = TestDataHandler.accountData.getAccountData().get(0).get("username");
//        String password = TestDataHandler.accountData.getAccountData().get(0).get("password");
//
//        getHeaderComponent().clickSignIn();
//        getSignInPage().signIn(username,password);
//        getAccountManagementPage().goToAccountHistory();
//        getHistoryReportsPage().navigateTo("OrderHistory");
//        getHeaderComponent().changeLanguage("French");
//        int days = 30; int rangeFrom = 15; int rangeTo = 13;
//        getHistoryReportsPage().inputDateToDatePicker(days);
//        getHistoryReportsPage().validateRangesInTable(days,rangeFrom,rangeTo);
//    }
//    @Test(groups = { "HISRPT","EAS","Scrum" })
//    public void CPP_25821_ValidateTableObjectsOrderHistoryExportFrench() {
//        String username = TestDataHandler.accountData.getAccountData().get(0).get("username");
//        String password = TestDataHandler.accountData.getAccountData().get(0).get("password");
//
//        getHeaderComponent().clickSignIn();
//        getSignInPage().signIn(username, password);
//        getAccountManagementPage().goToAccountHistory();
//        getHistoryReportsPage().navigateTo("OrderHistory");
//        getHeaderComponent().changeLanguage("French");
//        getHistoryReportsPage().validateTableObjects();
//        getHistoryReportsPage().validateExportToPDF();
//    }
    @Test(groups = {"HISRPT","EAS","qaAuto"})
    public void CPP_24862_ValidateTableObjectsOrderHistoryPage() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String orderHtySubFilter = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtySubFilter");
        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Order");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateFilterFieldSubOptions(orderHtySubFilter);
        getHistoryReportsPage().validateSearchResultTableColumn(orderHtyColumnName);
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour"})
    public void CPP_24787_ValidateTableHeadersOrderHistoryPage() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String orderHtySubFilter = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtySubFilter");
        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateFilterFieldSubOptions(orderHtySubFilter);
        getHistoryReportsPage().validateSearchResultTableColumn(orderHtyColumnName);
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour","SS","P1","HR"})
    public void CPP_24790_Validate_past7Days_preSelectedOrderHistoryPage() {
        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        getHistoryReportsPage().validatePast7DaysSelected();
        getHistoryReportsPage().validateSearchResultTableColumn(orderHtyColumnName);
    }
//    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour"})
//    public void CPP_24787_ValidateTableObjectsFilters() {
//        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
//        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
//        String orderHtySubFilter = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtySubFilter");
//        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");
//
//        getHeaderComponent().clickSignIn();
//        getSignInPage().signInEas(username, password);
//        getAccountManagementPage().goToAccountHistory();
//        getHistoryReportsPage().navigateTo("OrderHistory");
//        int days = 90;
//        getHistoryReportsPage().inputDatePickerFilter(days);
//        getHistoryReportsPage().validateFilterFieldOptions();
//        getHistoryReportsPage().validateFilterFieldSubOptions(orderHtySubFilter);
//        getHistoryReportsPage().validateSearchResultTableColumn(orderHtyColumnName);
//
//    }
    /*@Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour"})
    public void CPP_24867_Validate_past7DaysPreSelected_ValidateTableObjects() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String orderHtySubFilter = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtySubFilter");
        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        getHistoryReportsPage().validatePast7DaysSelected();
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateFilterFieldSubOptions(orderHtySubFilter);
        getHistoryReportsPage().validateSearchResultTableColumn(orderHtyColumnName);
    }*/
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour"})
    public void CPP_26218_Validate_userClicksOn_crossButton_orderFilter() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        //getHistoryReportsPage().validateTableObjects();
        getHistoryReportsPage().navigateToFilters("OrderType");
        getHistoryReportsPage().validateClickOnOrderTypeCrossButton();
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour"})
    public void CPP_26228_Validate_userClicksOn_crossButton_statusFilter() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        //getHistoryReportsPage().validateTableObjects();
        getHistoryReportsPage().navigateToFilters("Status");
        getHistoryReportsPage().validateClickOnOrderTypeCrossButton();
    }

    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour"})
    public void CPP_24871_ValidateFiltersOrderHistoryPage() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String orderHtySubFilter = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtySubFilter");
        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateFilterFieldSubOptions(orderHtySubFilter);
        getHistoryReportsPage().validateSearchResultTableColumn(orderHtyColumnName);
    }

    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour"})
    public void CPP_26214_Validate_recordsListedBasedOn_ColumnChannelFilters() {
        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Order");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        //getHistoryReportsPage().validateTableObjects();
        getHistoryReportsPage().navigateToFilters("paid");
        getHistoryReportsPage().validateApplyFilterButton("Online");
        getHistoryReportsPage().validateRecordsListedBasedOnColumnFilter(orderHtyColumnName,"paid","Online");
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour","SS","P1","HR"})
    public void CPP_26226_Validate_recordsListedBasedOn_ColumnStatusFilters() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        //getHistoryReportsPage().validateTableObjects();
        getHistoryReportsPage().navigateToFilters("Status");
        getHistoryReportsPage().validateApplyFilterButton("Successful");
        getHistoryReportsPage().validateRecordsListedBasedOnColumnFilter(orderHtyColumnName,"Status","Successful");
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour"})
    public void CPP_24841_ValidateCustomer_selected_DisabledDate() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        int days = 95;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateAlertMessageForDisabledDates();
    }
   @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour"})
    public void CPP_24987_ValidateCustomer_selects90DaysRange_amongAvailableFilters() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String orderHtySubFilter = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtySubFilter");
        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Order");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateFilterFieldSubOptions(orderHtySubFilter);
        getHistoryReportsPage().validateSearchResultTableColumn(orderHtyColumnName);
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour"})
    public void CPP_24793_ValidateCustomer_selects50DaysRange_amongAvailableFilters() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String orderHtySubFilter = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtySubFilter");
        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Order");
        int days = 75;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateFilterFieldSubOptions(orderHtySubFilter);
        getHistoryReportsPage().validateSearchResultTableColumn(orderHtyColumnName);
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour"})
    public void CPP_34972_Validate_SevenDay_FilterPaymentHistoryPage() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String paymtHtySubFilter = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtySubFilter");
        String paymtHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtyColumnName");

        getHeaderComponent().clickSignIn();
        //getSignInPage().signInEas(username,password);
        getSignInPage().signInEasFromExcel("order");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("PaymentHistory");
        int days = 7;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateFilterFieldSubOptions(paymtHtySubFilter);
        getHistoryReportsPage().validateSearchResultTableColumn(paymtHtyColumnName);
        getHistoryReportsPage().validateRangeOfDateRecordValue(paymtHtyColumnName,"Date",days);
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour"})
    public void CPP_34973_Validate_ThirtyDay_FilterPaymentHistoryPage() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String paymtHtySubFilter = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtySubFilter");
        String paymtHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACCOUNT");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("PaymentHistory");
        int days = 30;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateFilterFieldSubOptions(paymtHtySubFilter);
        getHistoryReportsPage().validateSearchResultTableColumn(paymtHtyColumnName);
        getHistoryReportsPage().validateRangeOfDateRecordValue(paymtHtyColumnName,"Date",days);
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour"})
    public void CPP_34907_Validate_SortingByPaymentStatus_PaymentHistoryPage() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String paymtHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().validatePast7DaysSelected();
        getHistoryReportsPage().clickOnPastThirtyDays();
        getHistoryReportsPage().validate30DaysSelected();
        getHistoryReportsPage().navigateTo("PaymentHistory");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateSortByTextButtonTarget(paymtHtyColumnName,"Status");
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour"})
    public void CPP_35090_Validate_ToDateIsLessThanFromDate_PaymentHistoryPage() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PAYMENT");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("PaymentHistory");
        getHistoryReportsPage().inputDateFromGreaterThenToDate();
        getHistoryReportsPage().validateAlertMessageForDisabledDates();
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour"})
    public void CPP_34906_Validate_SortingTransactionType_PaymentHistoryPage() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String paymtHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("PaymentHistory");
        getHistoryReportsPage().validatePast7DaysSelected();
        getHistoryReportsPage().clickOnPastThirtyDays();
        getHistoryReportsPage().validate30DaysSelected();
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateSortByTextButton(paymtHtyColumnName,"Transaction");
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour","SS","P1","HR"})
    public void CPP_34905_Validate_SortingTransactionDateTime_PaymentHistoryPage() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String paymtHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACCOUNT");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("PaymentHistory");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateSortByDateButton(paymtHtyColumnName,"Date");
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour"})
    public void CPP_34974_Validate_FilterDateRange_PaymentHistoryPage() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String paymtHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("PaymentHistory");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateRangeOfDateRecordValueTarget(paymtHtyColumnName,"Date",days);
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour"})
    public void CPP_34975_Validate_FilterDateRange_PaymentHistoryPage_NoRecord() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("PaymentHistory");
        getHistoryReportsPage().validNoRecordFoundDate();
        getHistoryReportsPage().validateNoRecordMessage();
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour"})
    public void CPP_24774_Validate_Sorting_LastUpdatedOn_DateTime_HistoryPage() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getCarePortalDashBoard().switchToLatestTab();
        getHistoryReportsPage().navigateTo("Order");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateSortByDateButton(orderHtyColumnName,"updated");
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour"})
    public void CPP_24777_Validate_Sorting_Ordertype_HistoryPage() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getCarePortalDashBoard().switchToLatestTab();
        getHistoryReportsPage().navigateTo("Order");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateSortByTextButton(orderHtyColumnName,"type");
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour"})
    public void CPP_24785_Validate_Sorting_OrderStatusPagination_HistoryPage() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateSortByTextButton(orderHtyColumnName,"Status");
    }

    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour","filter"})
    public void CPP_34908_Validate_the_Change_sorting_by_Balance() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String paymtHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Payment");
        getHistoryReportsPage().validatePast7DaysSelected();
        getHistoryReportsPage().clickOnPastThirtyDays();
        getHistoryReportsPage().validate30DaysSelected();
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateSortByCurrencyButton(paymtHtyColumnName,"balance");
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour","filter"})
    public void CPP_34909_Validate_the_Change_sorting_by_Total_PreTax() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String paymtHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("PaymentHistory");
        getHistoryReportsPage().validatePast7DaysSelected();
        getHistoryReportsPage().clickOnPastThirtyDays();
        getHistoryReportsPage().validate30DaysSelected();
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateSortByCurrencyButton(paymtHtyColumnName,"Sub");
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour","filter"})
    public void CPP_34910_Validate_the_Change_sorting_by_Tax() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String paymtHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("PaymentHistory");
        getHistoryReportsPage().validatePast7DaysSelected();
        getHistoryReportsPage().clickOnPastThirtyDays();
        getHistoryReportsPage().validate30DaysSelected();
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateSortByCurrencyButton(paymtHtyColumnName,"Tax");

    }
    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour","filter"})
    public void CPP_34911_Validate_the_Change_sorting_by_Total_PostTax() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String paymtHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("PaymentHistory");
        getHistoryReportsPage().validatePast7DaysSelected();
        getHistoryReportsPage().clickOnPastThirtyDays();
        getHistoryReportsPage().validate30DaysSelected();
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateSortByCurrencyButton(paymtHtyColumnName,"Total");

    }
    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour","filter"})
    public void CPP_34829_Navigate_to_the_Payment_history_report_page_by_direct_URL_the_user_is_not_logged_in() {
        String historyReportDirectUrl = TestDataHandler.landingPageData.getHistoryReportDirectUrl();
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getSignInPage().validateURLLogin(historyReportDirectUrl, username, password);
        getHistoryReportsPage().navigateTo("PaymentHistory");
        getHistoryReportsPage().validatePast7DaysSelected();
    }

    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","SS","P1","HR"})
    public void CPP_35088_Validate_user_able_to_validate_Date_Range_less_than_equal_to_90days() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String paymtHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACCOUNT");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("PaymentHistory");
        int days = 89;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateRangeOfDateRecordValue(paymtHtyColumnName,"Date",days);

    }
    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto"})
    public void CPP_35089_Validate_error_message_for_Date_Range_greater_than_90days() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PAYMENT");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Payment");
        int days = 91;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateAlertMessageForDisabledDates();
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto"})
    public void CPP_36122_Validate_Change_report_rows_number_by_Dropdown_from_pagination_control(){
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String paymtHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PAYMENT");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("PaymentHistory");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateQuantityDropDown(paymtHtyColumnName,"Date","5");
        getHistoryReportsPage().validateQuantityDropDown(paymtHtyColumnName,"Date","10");
        getHistoryReportsPage().validateQuantityDropDown(paymtHtyColumnName,"Date","20");
        getHistoryReportsPage().validateQuantityDropDown(paymtHtyColumnName,"Date","50");
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto"})
    public void CPP_36118_Validate_Navigate_through_pagination(){
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String paymtHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACCOUNT");
        getPaymentPage().waitForPaymentPageLoad();
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Payment");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateQuantityDropDown(paymtHtyColumnName,"Date","5");
        //getHistoryReportsPage().validatePagination();
    }
    @Test(groups = {"HISRPT","EAS","ManagePIN", "DAYONE","qaAuto"})
    public void CPP_35073_Validate_Display_the_Success_modal_after_clicks_on_Submit(){
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().clickOnMPIN();
        getAccountManagementPage().setNewPin("1234");
        getAccountManagementPage().clickOnSubmitButton();
        getAccountManagementPage().validateSuccessModel();
    }

    @Test(groups = {"HISRPT","EAS","ManagePIN", "DAYONE","qaAuto"})
    public void CPP_35074_Validate_error_message_when_input_fields_are_empty_on_Manage_PIN_page(){
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().clickOnMPIN();
        getAccountManagementPage().clickOnSubmitButton();
        getAccountManagementPage().validateErrorMessageInputFields();
    }
    @Test(groups = {"HISRPT","EAS","ManagePIN", "DAYONE","qaAuto"})
    public void CPP_35075_Validate_error_message_when_inputs_do_not_match_on_the_Manage_PIN_page(){
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().clickOnMPIN();
        getAccountManagementPage().validateErrorMessageForInputNotMatch("1234","4321");
    }
    @Test(groups = {"HISRPT","EAS","ManagePIN", "DAYONE","qaAuto"})
    public void CPP_35076_Validate_View_entered_digits_in_the_Pin_inputs_after_clicks_on_Hide_Unhide_CTA_in_the_input() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().clickOnMPIN();
        getAccountManagementPage().validateEyeIconWithOutCrossMarks("1234");
    }
    @Test(groups = {"HISRPT","EAS","ManagePIN", "DAYONE","qaAuto"})
    public void CPP_35051_Validate_Proceed_with_PIN_management_from_the_editing_account_info_page() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().goToProfile();
        //getAccountManagementPage().clickOnEditButton();
        getAccountManagementPage().clickOnMPIN();
        getAccountManagementPage().setNewPin("1234");
        getAccountManagementPage().clickOnSubmitButton();
        getAccountManagementPage().validateSuccessModel();
    }
    @Test(groups = {"HISRPT","EAS","ManagePIN", "DAYONE","qaAuto"})
    public void CPP_35085_Validate_error_message_for_New_PIN_Confirm_new_PIN_inputs() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("PPC");
        getAccountManagementPage().goToProfile();
        getAccountManagementPage().clickOnMPIN();
        getAccountManagementPage().validateErrorForLessThanFourDigit("123","321");
    }

    /*@Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour"})
    public void CPP_24868_ValidateFiltersOrderHistoryPage() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(1).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(1).get("password");
        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateQuantityDropDown(orderHtyColumnName,"Status","5");
        getHistoryReportsPage().validatePagination();
    }*/
    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour"})
    public void CPP_24794_ValidateCustomer_selects90DaysRange_amongAvailableFilters() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        int days = 91;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateAlertMessageForDisabledDates();
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour","SS","P1","HR"})
    public void CPP_24865_ValidateObjectsOrderHistory_French() {
        String orderHtyColumnNameFR = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnNameFR");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        getHeaderComponent().changeLanguage("French");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateFrenchObjects();
        getHistoryReportsPage().validateSearchResultTableColumninFrench(orderHtyColumnNameFR);
        getHistoryReportsPage().validatePaginationFR();
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto","pfour"})
    public void CPP_31245_Validate_ToDateIsLessThanFromDate_OrderHistoryPage() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        int days = 91;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateAlertMessageForDisabledDates();
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour"})
    public void CPP_20893_ValidateTableObjectsPaymentHistoryPage() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String paymtHtySubFilter = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtySubFilter");
        String paymtHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("paymtHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("PaymentHistory");
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateFilterFieldSubOptions(paymtHtySubFilter);
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateSearchResultTableColumn(paymtHtyColumnName);
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto", "pfour"})
    public void CPP_24837_ValidateCustomer_navigateToProfileTo_OrderHistoryTab() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        getHistoryReportsPage().validatePast7DaysSelected();
        //getHistoryReportsPage().validateTableObjects();
        getHistoryReportsPage().validateFilterFieldOptions();
    }

    @Test(groups = {"HISRPT","EAS", "DAYONE", "qaAuto", "pfour"})
    public void CPP_24896_ValidateCustomer_Selects30daysFilter() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEas(username, password);
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        getHistoryReportsPage().clickOnPastThirtyDays();
        getHistoryReportsPage().validate30DaysSelected();
    }

    @Test(groups = {"HISRPT","EAS","DAYONE"})
    public void CPP_26227_Validate_applyCancelCrossMark_StatusChannelFilters() {
        String orderHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("orderHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("OrderHistory");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        //getHistoryReportsPage().validateTableObjects();
        getHistoryReportsPage().navigateToFilters("Status");
        getHistoryReportsPage().validateApplyFilterButton("Successful");
        getHistoryReportsPage().validateCrossButton();
        getHistoryReportsPage().validateRecordsListedBasedOnColumnFilter(orderHtyColumnName,"Status","Successful");
    }
    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour"})
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

    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour"})
    public void CPP_37326_validate_Account_history_report_filtered_Past30days_Filter() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String acctHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("acctHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLLB");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Account");
        getPaymentPage().waitForPaymentPageLoad();
        getHistoryReportsPage().validate30DaysSelected();
        getHistoryReportsPage().validateRangeOfDateRecordValue(acctHtyColumnName,"Date",30);
    }

    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour"})
    public void CPP_37327_validate_Account_history_report_CustomDate_From_To_Filter() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String acctHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("acctHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACCOUNT");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Account");
       /* int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);*/
        getHistoryReportsPage().validatePast7DaysSelected();
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateRangeOfDateRecordValue(acctHtyColumnName,"Date",7);
    }

    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour"})
    public void CPP_37656_validate_Change_Sort_By_Time_Account_history_page() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String acctHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("acctHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACCOUNT");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Account");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateSortByDateButton(acctHtyColumnName,"Date");

    }

    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour"})
    public void CPP_37333_Validate_Timezone_Transformation_on_Account_history_report() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String acctHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("acctHtyColumnName");
        String topUp = TestDataHandler.atpData.getAtpData().get(0).get("topUp");
        String city = TestDataHandler.atpData.getAtpData().get(0).get("city");
        String creditCard = TestDataHandler.atpData.getAtpData().get(0).get("cardNumber");
        String cvv = TestDataHandler.atpData.getAtpData().get(0).get("cvv");
        String expiryDate = TestDataHandler.atpData.getAtpData().get(0).get("expiryDate");
        String firstName = TestDataHandler.atpData.getAtpData().get(0).get("firstName");
        String lastName = TestDataHandler.atpData.getAtpData().get(0).get("lastName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getHeaderComponent().clickTopUp();
        getPaymentPage().waitForPaymentPageLoad();
        getTopUpFormPage().selectPaymentMethod("Credit");
        getTopUpFormPage().populateTopUpAmount(topUp);
        //getTopUpFormPage().fillCreditCardInfo(topUp, creditCard, cvv, expiryDate);
        //getTopUpFormPage().setNames(firstName, lastName);
        //getTopUpFormPage().setAddress(city);
        getTopUpFormPage().clickOnContinuePaymentMethod();
        getTopUpFormPage().checkServiceAgreementCheckbox();
        getTopUpFormPage().clickOnContinueConfirmPayment();
        long receiptDateAndTime=getTopUpFormPage().getDateAndTime();
        getHeaderComponent().clickOnMyChatr();
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Payment");
        getHistoryReportsPage().validatePast7DaysSelected();
        long accountHistoryDateAndTime= getHistoryReportsPage().getAccountHistotyLatestDateAndTime(acctHtyColumnName,"Date");
        getHistoryReportsPage().validateTimezoneTransformation(receiptDateAndTime,accountHistoryDateAndTime);
    }

    @Test(groups = {"HISRPT","EAS", "DAYONE","qaAuto","pfour"})
    public void CPP_37145_validate_Usage_History_Custom_Field_Filter_And_Report_Display() {

        String usageHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("usageHtyColumnName");

        getHeaderComponent().clickSignIn();
        //getSignInPage().signInEas(username, password);
        getSignInPage().signInEasFromExcel("USAGE");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().navigateTo("Usage");
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateFilterFieldOptions();
        getHistoryReportsPage().validateRangeOfDateRecordValue(usageHtyColumnName,"Date",days);
    }
    @Test(groups = {"HISRPT","EAS","onetoone","qaAuto","pfour","filter"})
    public void CPP_37659_Validate_The_Change_Sorting_By_Account_Balance_On_Account_History_Report_Page() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String acctHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("acctHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ORDER");
        getAccountManagementPage().goToAccountHistory();
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateSortByCurrencyButton(acctHtyColumnName,"balance");
    }
    @Test(groups = {"HISRPT","EAS", "onetoone","qaAuto","pfour","filter"})
    public void CPP_37658_Validate_The_Change_Sorting_By_The_Amount_On_Account_History_Report_Page() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String acctHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("acctHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().goToAccountHistory();
        int days = 90;
        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validateSortByCurrencyButton(acctHtyColumnName,"Amount");
    }
    @Test(groups = {"HISRPT","EAS","onetoone","qaAuto","pfour","filter"})
    public void CPP_37547_Validate_From_To_Filter_Logic() {
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ACTIVE");
        getAccountManagementPage().goToAccountHistory();
        getHistoryReportsPage().validateFromToDate(90,"Less");
        getHistoryReportsPage().validateFromToDate(0,"Equal");
        getHistoryReportsPage().validateFromToDate(91,"Greater");
    }
    @Test(groups = {"HISRPT","EAS","onetoone","qaAuto","pfour","filter"})
    public void CPP_37548_Validate_View_Account_history_report(){
        String username = TestDataHandler.hisrptData.getHisRptData().get(0).get("username");
        String password = TestDataHandler.hisrptData.getHisRptData().get(0).get("password");
        String acctHtyColumnName = TestDataHandler.hisrptData.getHisRptData().get(0).get("acctHtyColumnName");

        getHeaderComponent().clickSignIn();
        getSignInPage().signInEasFromExcel("ENROLLB");
        getAccountManagementPage().goToAccountHistory();
//        int days = 90;
//        getHistoryReportsPage().inputDatePickerFilter(days);
        getHistoryReportsPage().validatePast7DaysSelected();
        getHistoryReportsPage().validateSearchResultTableColumn(acctHtyColumnName);
    }
}
