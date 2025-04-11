package com.rogers.pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

import static java.time.LocalDate.parse;
import static java.time.format.DateTimeFormatter.ofPattern;

public class HistoryReportsPage extends BasePage {
    private String columnXpath;
    @FindBy(xpath = "//*[@id='ds-tabs-0-tab-0']")
    WebElement accountHistoryCTA;
    @FindBy(xpath = "//div[@aria-label]/button[3]")
    WebElement paymentHistoryCTA;
    @FindBy(xpath = "//*[@id='ds-tabs-0-tab-3']")
    WebElement usageHistoryCTA;
    @FindBy(xpath = "//button[@id='ds-tabs-0-tab-1']")
    WebElement orderHistoryCTA;
    @FindBy(xpath = "//*[@id='ds-tabs-0-tab-3']")
    WebElement AdjustmentHistoryCTA;
    @FindBy(xpath = "(//input[@placeholder='MM/DD/YYYY'])[1]")
    WebElement fromDatePicker;
    @FindBy(xpath = "(//input[@placeholder='MM/DD/YYYY'])[2]")
    WebElement toDatePicker;
    @FindBy(xpath = "//span[contains(text(),'Past 7 days')]")
    WebElement past7DaysCTA;
    @FindBy(xpath = "//*[contains(text(),'Past 30 days')]")
    WebElement past30DaysCTA;
    @FindBy(xpath = "//span[contains(text(),'7 derniers jours')]")
    WebElement past7DaysFrenchCTA;
    @FindBy(xpath = "//span[contains(text(),'30 derniers jours')]")
    WebElement past30FrenchDaysCTA;
    @FindBy(xpath = "//ds-table-container[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/div[1]/button[1]")
    WebElement orderTypeFilterCTA;
    @FindBy(xpath = "//button[contains(text(),'Submitted On')]")
    WebElement submittedOnFilterCTA;
    @FindBy(xpath = "//button[contains(text(),'Last Updated On')]")
    WebElement lastUpdatedOnFilterCTA;
    @FindBy(xpath = "//button[contains(text(),'Order Type')]")
    WebElement orderTypeOnFilterCTA;
    @FindBy(xpath = "//button[contains(text(),'Channel')]")
    WebElement channelFilterCTA;
    @FindBy(xpath = "//span[contains(text(),'Status')]")
    WebElement statusFilterCTA;
    @FindBy(xpath = "//button[contains(text(),'Order #')]")
    WebElement orderNumberFilterCTA;
    @FindBy(xpath = "(//*[@role='gridcell'])[2]")
    WebElement firstSubmittedOnDate;
    @FindBy(xpath = "(//*[@role='gridcell'][contains(text(),'2022')][last()-1])[last()]")
    WebElement lastSubmittedOnDate;
    @FindBy(xpath = "//button[contains(@aria-label,'last page')]")
    WebElement lastPageCTA;
    @FindBy(xpath = "(//*[@role='gridcell'][contains(text(),'2022')][last()-1])[last()-1]")
    WebElement secondLastSubmittedOn;
    @FindBy(xpath = "//*[@class='ds-icon d-inline-flex cds-icon-last']")
    WebElement goToLastPage;
    @FindBy(xpath = "//span[contains(text(),'Download')]")
    WebElement exportToPDFCTA;
    @FindBy(xpath = "//ds-modal/div[2]/div[1]/div/div[1]/div[1]/ds-tag-checkbox/label")
    WebElement selectFilter;
    @FindBy(xpath = "(//span[@role='img'])[4]")//(//span[@role='img'])[4]")
    WebElement crossButton;
    @FindBy(xpath = "//div/lib-column-filter/div[1]/ds-tag-checkbox[1]/label/div")
    WebElement orderTypeFilterButton;
    @FindBy(xpath = "//div/lib-column-filter/div[1]/ds-tag-checkbox[2]/label/div")
    WebElement channelTypeFilterButton;
    @FindBy(xpath = "//div/lib-column-filter/div[1]/ds-tag-checkbox[3]/label/div")
    WebElement statusTypeFilterButton;
    @FindBy(xpath = "//span[contains(text(),'Apply')]")
    WebElement applyFilterButton;
    @FindBy(xpath = "//ds-table-container/div[1]/table/tbody/tr[1]/td[4]")
    WebElement selfServiceRecords;
    @FindBy(xpath = "//ds-error/span[1]")
    WebElement errorMessageForFutureDate;
    @FindBy(xpath = "//ds-selection[1]/label/input")
    WebElement radioButtonSelected;
    @FindBy(xpath = "//*[contains(@aria-label,'Account')]")
    WebElement accountHistoryCARECTA;
    @FindBy(xpath = "//*[contains(@aria-label,'Payment')]")
    WebElement paymentHistoryCARECTA;
    @FindBy(xpath = "//*[contains(@aria-label,'Usage')]")
    WebElement usageHistoryCARECTA;
    @FindBy(xpath = "//*[contains(@aria-label,'Adjustment')]")
    WebElement adjustmentCARECTA;
    @FindBy(xpath = "//button[@id='Order']")
    WebElement orderHistoryCARECTA;
    @FindBy(xpath = "//h2[contains(text(),'History reports')]")
    WebElement historyReportsBanner;
    @FindBy(xpath = "//p[contains(text(),'Max 50 records')]")
    WebElement errorMessageRecordExceed;
    @FindBy(xpath = "//table[@role='table']/tbody/tr[1]/td[2]")
    WebElement higherDateInMonth;
    @FindBy(xpath = "//table[@role='table']/tbody/tr[1]/td[2]")
    WebElement lowerDateInMonth;
    @FindBy(xpath = "(//input[@type='checkbox'])[1]/following::div[1]")
    WebElement orderTypeFilter;
    @FindBy(xpath = "//span[contains(text(),'number change')]")
    WebElement thirdEntryTableCTA;
    @FindBy(xpath = "//p[contains(text(),'Telephone Number Change details')]")
    WebElement TNCBanner;
    @FindBy(xpath = "//button[@title='close modal']")
    WebElement TNCCloseCTA;
    @FindBy(xpath = "//td[contains(text(),'Old CTN:')]/following::td[1]")
    WebElement oldCTNNumber;
    @FindBy(xpath = "//td[contains(text(),'New CTN:')]/following::td[1]")
    WebElement newCTNNumber;
    @FindBy(xpath = "//span[contains(text(),'activation')]")
    WebElement secondEntryTableCTA;
    @FindBy(xpath = "//button[contains(@title,'close')]")
    WebElement closeNACDetailsModal;
    @FindBy(xpath = "//td[contains(text(),'Phone')]/following::td[1]")
    WebElement CTNNACDetails;
    @FindBy(xpath = "//p[contains(text(),'activation')]")
    WebElement NACDetailsBanner;
    @FindBy(xpath = "(//input[@type='checkbox'])[4]/following::div[1]/child::ds-icon")
    WebElement firstFilterXCTA;
    @FindBy(xpath = "//select")
    WebElement optionPerPageDropDown;
    @FindBy(xpath = "//option[@value='5']")
    WebElement option5perPage;
    @FindBy(xpath = "//option[@value='10']")
    WebElement option10perPage;
    @FindBy(xpath = "//option[@value='20']")
    WebElement option20perPage;
    @FindBy(xpath = "//option[@value='50']")
    WebElement option50perPage;
    @FindBy(xpath = "//button[contains(@aria-label,'1')]")
    WebElement page1CTA;
    @FindBy(xpath = "//button[contains(@aria-label,'2')]")
    WebElement page2CTA;
    @FindBy(xpath = "//button[contains(@aria-label,'previous')]")
    WebElement previousPageCTA;
    @FindBy(xpath = "//button[contains(@aria-label,'first page')]")
    WebElement firstPageCTA;
    @FindBy(xpath = "//span[@role='alert']")
    WebElement error91days;
    @FindBy(xpath = "//div[@id='ds-tag-checkbox-id-11-content']//ds-icon[@name='close']")
    WebElement selfServiceFilterCloseBtn;
    @FindBy(xpath = "//div[@id='ds-tag-checkbox-id-15-content']")
    WebElement draftFilter;
    @FindBy(xpath = "//table[@role='grid']/tbody/tr/td[4]")
    List<WebElement> balanceColList;
    @FindBy(xpath = "//table[@role='grid']/tbody/tr/td[5]")
    List<WebElement> subtotalColList;
    @FindBy(xpath = "//table[@role='grid']/tbody/tr/td[6]")
    List<WebElement> taxColList;
    @FindBy(xpath = "//table[@role='grid']/tbody/tr/td[7]")
    List<WebElement> totalColList;
    @FindBy(xpath = "(//th[@role='columnheader'])[4]")
    WebElement balanceColHeader;
    @FindBy(xpath = "(//th[@role='columnheader'])[5]")
    WebElement subtotalColHeader;
    @FindBy(xpath = "(//th[@role='columnheader'])[6]")
    WebElement taxColHeader;
    @FindBy(xpath = "(//th[@role='columnheader'])[8]")
    WebElement totalColHeader;

    @FindBy(xpath = "//table[@role='grid']/tbody/tr[1]/td[1]")
    WebElement higherDateRangeMonth;
    @FindBy(xpath = "(//span[@role='img'])[4]")
    WebElement filterButton;
    @FindBy(xpath = "//table[@role='grid']/tbody/tr[1]/td[1]")
    WebElement lowerDateRangeMonth;
    @FindBy(xpath = "//ds-table-container/div[1]/table/tbody/tr[1]/td[6]")
    WebElement selfServiceRecordsStatus;
    @FindBy(xpath = "//button[contains(text(),'Payment status')]")
    WebElement sortByPayment;
    @FindBy(xpath = "//button[contains(text(),'Transaction type')]")
    WebElement sortByTransactionType;
    @FindBy(xpath = "//button[contains(text(),'Date and time')]")
    WebElement sortByTransactionDate;
    @FindBy(xpath = "//span[contains(text(),'We couldn')]")
    WebElement NORecordFound;
    @FindBy(xpath = "//button[contains(text(),'Account balance')]")
    WebElement accountBalance;
    @FindBy(xpath = "//button[contains(text(),'Sub total')]")
    WebElement subtotal;
    @FindBy(xpath = "//button[contains(text(),'Tax')]")
    WebElement tax;
    @FindBy(xpath = "//button[contains(text(),'Total')]")
    WebElement total;
    @FindBy(xpath = "//button[contains(text(),'Payment method')]")
    WebElement paymentMethod;
    @FindBy(xpath = "//button[contains(text(),'Card details')]")
    WebElement cardDetails;
    @FindBy(xpath = "//button[contains(text(),'Transaction details')]")
    WebElement transactionDetails;
    @FindBy(xpath = "//button[contains(text(),'Reference #')]")
    WebElement referenceHash;
    @FindBy(xpath = "//button[contains(text(),'Status')]")
    WebElement statusOrderTableButton;
    @FindBy(xpath = "//*[contains(text(),'Unenrollment')]")
    WebElement autoPayUnenrollmentCTA;
    @FindBy(xpath = "//*[contains(text(),'Enrollment')]")
    WebElement autoPayEnrollmentCTA;
    @FindBy(xpath = "(//span[contains(text(),'Manage')])[1]")
    WebElement addOnManagementCTA;
    @FindBy(xpath = "//*[contains(text(),'summary')]")
    WebElement addOnManagement_Record;
    @FindBy(xpath = "//select[@title='Items']")
    WebElement numberOfRecordsToDisplay;
    @FindBy(xpath = "//span[text()=' Auto-Pay Enrollment ']")
    WebElement autoPayEnrollCrossBtn;
    @FindBy(xpath = "//span[text()=' All ']")
    WebElement allFilterButton;
    @FindBy(xpath = "//span[contains(text(),'Transaction type']")
    WebElement transactionTypeButton;
    @FindBy(xpath = "//p[text()='Transaction Type Filters']")
    WebElement transactionFilterBanner;
    @FindBy(xpath = "//input[@name='Credit']//following-sibling::div")
    WebElement creditFilterButton;
    @FindBy(xpath = "//input[@name='Debit']//following-sibling::div")
    WebElement debitFilterButton;
    @FindBy(xpath = "(//button[@aria-label='Sort '])[1]")
    WebElement sortByTime;
    @FindBy(xpath = "(//button[@aria-label='Sort '])[3]")
    WebElement sortByCode;
    @FindBy(xpath = "//tr[@role='row']/td[contains(@class,'ds-table-column-time')]/span")
    List<WebElement> dateAndTimeColElementList;
    @FindBy(xpath = "//div[contains(@class,'ds-pagination__navButtons')]/button")
    List<WebElement> navButtons;
    @FindBy(xpath = "//div[contains(text(),'Non-zero transactions only')]")
    WebElement nonZeroTransactionsCheckBox;
    @FindBy(xpath = "//span[contains(text(),'Clear')]")
    WebElement clearFilterBtn;
    @FindBy(xpath = "//div[contains(@class,'ds-pagination__navButtons')]/div/button")
    List<WebElement> navButtons_Pages;
    @FindBy(xpath = "//span[contains(text(),'Error! We couldn')]")
    List<WebElement> noRecordErrorMsg;
    @FindBy(xpath = "(//*[contains(text(),'efund')]/ancestor::button)[1]")
    WebElement refundBtn;
    @FindBy(xpath = "(//*[contains(text(),'ctivate')])[2]")
    WebElement activateBtn;
    @FindBy(xpath = "//div[contains(text(),' Plan details ')]")//button[@aria-label='Plan details tab ']
    WebElement currentPlanButton;
    @FindBy(xpath = "(//span[@class='text-truncate ng-star-inserted'])[1]")
    List<WebElement> latestDateTimeXpath;
    @FindBy(xpath = "//button[contains(text(),'Status')]")
    List<WebElement> targetedStatusHeader;
    @FindBy(xpath="//*[contains(text(),' Process a refund  ')]/parent::table/tbody/tr")
    WebElement refundDetailsRow;
    @FindBy(xpath ="//*[contains(@name,'refundAmount')]")
    WebElement refundAmtField;
    @FindBy(xpath ="//*[contains(@name,'refundAmount')]/following::p")
    WebElement refundAmtMsg;
    @FindBy(xpath ="//select[contains(@formcontrolname,'code')]/ancestor::div[1]/div") //select[contains(@formcontrolname,'code')]/ancestor::div[contains(@class,'ds-formField__input')]")
    WebElement refundCodeField;
    @FindBy(xpath ="//select[contains(@formcontrolname,'code')]")
    WebElement refundCodeDropdn;
    @FindBy(xpath ="//*[contains(@formcontrolname,'omment')]")
    WebElement commentBox;
    @FindBy(xpath ="//*[contains(text(),'efund summary')]")
    WebElement refundSummary;
    @FindBy(xpath = "//*[contains(text(),'Submit')]")
    WebElement submitRefundBtn;
    @FindBy(xpath = "//*[contains(text(),'ancel')]/ancestor::button")
    WebElement cancelRefundBtn;
    //    @FindBy(xpath = "(//*[contains(text(),'efund')]/ancestor::button)[1]")
    @FindBy(xpath="//table[@role='table']/tbody/tr/td[3]")
    List<WebElement> refundBtnList;
    @FindBy(xpath ="//table[@role='table']/tbody/tr/td[8]//div[contains(@class,'ds-price__amountDollars')]")
    List<WebElement> totalRefundAmtList;
    @FindBy(xpath = "//*[contains(text(),'successful')]")
    WebElement refundSuccessfull;

    @FindBy(xpath = "//span[contains(text(),'Error! Make an adjustment first because the refund')]")
    WebElement refundAmtHigherError;
    @FindBy(xpath = "//span[contains(text(),'Download')]")
    List<WebElement> exportToPDFCTAList;
    @FindBy(xpath = "//*[contains(@aria-label,'Adjustment')]")
    List<WebElement> adjustmentCARECTAList;
    @FindBy(xpath = "//ds-error/span[1]")
    List<WebElement> errorMessageForFutureDateList;
    @FindBy(xpath ="//*[contains(text(),' Download report')]")
    WebElement generatePdfCta;
    @FindBy(xpath = "//button[@aria-label='Adjustment history report']")
    List<WebElement> adjustmentTabList;
    @FindBy(xpath ="//span[contains(text(),'Plan change')]")
    WebElement planChangeLink;
    @FindBy(xpath = "//button[contains(text(),'Type de commande')]")
    WebElement orderTypeFR;
    @FindBy(xpath = "//tbody[1]/tr[1]/td[4]/app-status-format[1]/p[1]/span[1]")
    WebElement latestResultStatus;
    @FindBy(xpath = "//app-table-content[1]/ds-table-container[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]")
    WebElement latestOrderId;
    @FindBy(xpath = "//app-table-content[1]/ds-table-container[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]")
    WebElement latestOrderIdinSS;


    public HistoryReportsPage(WebDriver driver) {
        super(driver);
    }

    /**
     * @String options available "AccountHistory","PaymentHistory","UsageHistory","OrderHistory"
     */
    public void navigateToReportTab(String options) {

        switch (options) {
            case "AccountHistory":
                getReusableActions().clickWhenReady(accountHistoryCTA, 10);
                accountHistoryCTA.click();
                //reporter.softAssert(accountHistoryCTA.getAttribute("Class").contains("ds-color-misty"), "Account tab has been selected", "Account tab has not been selected");
                reporterSnapshot(accountHistoryCTA, "ds-color-misty", "Account History Tab", "class");
                break;
            case "PaymentHistory":
                getReusableActions().clickWhenReady(paymentHistoryCTA, 10);
                paymentHistoryCTA.click();
                getReusableActions().staticWait(4000);
                //reporter.softAssert(paymentHistoryCTA.getAttribute("Class").contains("ds-color-misty"), "Payment tab has been selected", "Payment tab has not been selected");
                reporterSnapshot(paymentHistoryCTA, "ds-color-misty", "payment History Tab", "class");
                break;
            case "UsageHistory":
                getReusableActions().clickWhenReady(usageHistoryCTA, 10);
                usageHistoryCTA.click();
                //reporter.softAssert(usageHistoryCTA.getAttribute("Class").contains("ds-color-misty"), "Usage tab has been selected", "Usage tab has not been selected");
                reporterSnapshot(usageHistoryCTA, "ds-color-misty", "usage History Tab", "class");
                break;

            case "AdjustmentHistory":
                getReusableActions().clickWhenReady(AdjustmentHistoryCTA, 10);
                AdjustmentHistoryCTA.click();
                break;
            case "OrderHistory":
                getReusableActions().staticWait(2000);
                getReusableActions().clickWhenReady(orderHistoryCTA, 10);
                orderHistoryCTA.click();
                //reporter.softAssert(orderHistoryCTA.getAttribute("Class").contains("ds-color-misty"), "Order tab has been selected", "Order tab has not been selected");
                reporterSnapshot(orderHistoryCTA, "ds-color-misty", "order History Tab", "class");
                break;
        }

    }

    /**
     * @days days to substract from today
     * @rangeFrom range of acceptance for the From datepicker
     * @rangeTo range of acceptance for the To datepicker
     */
    public void inputDateToDatePicker(int days) {
        // -60 days 07292022
        // -90 days 06292022
        LocalDate date = LocalDate.now().minusDays(days);
        DateTimeFormatter formatter = ofPattern("MM/dd/uuuu");
        String dateMinus = date.format(formatter);
        getReusableActions().isElementVisible(fromDatePicker, 10);
        fromDatePicker.clear();
        getReusableActions().isElementVisible(fromDatePicker, 10);
        fromDatePicker.sendKeys(dateMinus);
        getReusableActions().clickWhenReady(fromDatePicker, 10);
        fromDatePicker.sendKeys(Keys.ENTER);
        //this flow is for the To date picker
        LocalDate dateToday = LocalDate.now();
        String dateMonthDay = dateToday.format(formatter);
        toDatePicker.clear();
        getReusableActions().isElementVisible(toDatePicker, 10);
        toDatePicker.sendKeys(dateMonthDay);
        getReusableActions().staticWait(5000);
        //getReusableActions().clickWhenReady(toDatePicker,20);
        //toDatePicker.sendKeys(Keys.ENTER);
    }

    /**
     * This method validates, the buttons and the table headers of the HistoryReports table
     */
    public void validateTableObjects() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(past7DaysCTA);
        reporterSnapshot(past7DaysCTA, "past 7 Days", "", "Display");
        reporterSnapshot(past30DaysCTA, "past 30 Days", "", "Display");
        reporterSnapshot(fromDatePicker, "From date", "", "Display");
        reporterSnapshot(toDatePicker, "To date", "", "Display");
        reporterSnapshot(orderTypeFilterCTA, "order Type Filter", "", "Display");
        reporterSnapshot(submittedOnFilterCTA, "submittedOn Filter", "", "Display");
        reporterSnapshot(lastUpdatedOnFilterCTA, "lastUpdatedOn Filter", "", "Display");
        reporterSnapshot(channelFilterCTA, "channel Filter", "", "Display");
        reporterSnapshot(statusFilterCTA, "status Filter", "", "Display");
        reporterSnapshot(orderNumberFilterCTA, "orderNumber Filter", "", "Display");
    }

    public void validateFilterFieldOptions() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(past7DaysCTA);
        reporterSnapshot(past7DaysCTA, "past 7 Days", "", "Display");
        reporterSnapshot(past30DaysCTA, "past 30 Days", "", "Display");
        reporterSnapshot(fromDatePicker, "From date", "", "Display");
        reporterSnapshot(toDatePicker, "To date", "", "Display");
    }

    public void validateFilterFieldSubOptions(String filterOption) {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(past7DaysCTA);
        String[] strArray = filterOption.split(";");
        for (int i = 0; i <= strArray.length - 1; i++) {
            String filterSubOptionXpath = "(//span[contains(text(),'" + strArray[i] + "')])[2]";
            WebElement filterSubOption = getDriver().findElement(By.xpath(filterSubOptionXpath));
            reporterSnapshot(filterSubOption, strArray[i], "", "Display");
        }
    }

    public void validateSearchResultTableColumn(String tableColumn) {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(orderTypeFilterCTA);
        String[] strArray = tableColumn.split(";");
        for (int i = 0; i <= strArray.length - 1; i++) {
            String tableColumnOptionXpath = "//button[contains(text(),'" + strArray[i] + "')]";
            WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
            reporterSnapshot(tableColumnOption, strArray[i], "", "Display");
        }
    }

    public void goToLastRecordOnTable() {
        System.out.println(lastPageCTA.isEnabled());
        if (lastPageCTA.isEnabled()) {
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", secondLastSubmittedOn);
            getReusableActions().clickWhenReady(goToLastPage, 10);
            //goToLastPage.click();
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", secondLastSubmittedOn);
        } else {
            ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", secondLastSubmittedOn);
        }
    }

    public LocalDate convertStringToDate(String dateToConvert) {
        String dateChopped = dateToConvert.substring(0, 10);
        LocalDate newDate;
        DateTimeFormatter formatter = ofPattern("MM/dd/uuuu");
        String compare = String.valueOf(dateChopped.charAt(2));
        String monthDayYear;
        if (compare.equals("/")) {
            newDate = parse(dateChopped);
            newDate.format(formatter);
        } else {
            String[] split = dateChopped.split("/");
            monthDayYear = split[0];
            monthDayYear += "-";
            monthDayYear += split[1];
            monthDayYear += "-";
            monthDayYear += split[2];
            newDate = parse(monthDayYear);
            newDate.format(formatter);
        }
        return newDate;
    }

    public void validatePast7DaysSelected() {
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(radioButtonSelected);
        reporterSnapshot(radioButtonSelected, "PAST 7 DAYS", "", "default");
    }

    public void navigateToFilters(String options) {
        getReusableActions().staticWait(2000);
        switch (options.toUpperCase()) {
            case "ORDERTYPE":
                getReusableActions().clickWhenReady(orderTypeFilterButton, 10);
                reporterSnapshot(orderTypeFilterButton, "Order Type", "", "Null");
                break;
            case "PAID":
                getReusableActions().clickWhenReady(channelTypeFilterButton, 10);
                reporterSnapshot(channelTypeFilterButton, "How you paid", "", "Null");
                break;
            case "STATUS":
                getReusableActions().clickWhenReady(statusTypeFilterButton, 10);
                reporterSnapshot(statusTypeFilterButton, "Status Type", "", "Null");
                break;
            default:
                getDriver().findElement(By.xpath("(//span[contains(text(),'" + options + "')])[2]")).click();
                reporterSnapshot(statusTypeFilterButton, options, "", "Null");
                break;
        }
    }

    public void validateClickOnOrderTypeCrossButton() {
        getReusableActions().isElementVisible(selectFilter);
        getReusableActions().clickWhenReady(selectFilter);
        getReusableActions().staticWait(2000);
        applyFilterButton.click();
        getReusableActions().staticWait(3000);
        //reporter.softAssert(crossButton.isDisplayed(), "cross button is displayed", "cross button not displayed");
        reporterSnapshot(crossButton, "Cross Button", "", "display");
        crossButton.click();

    }

    public void validateApplyFilterButton(String option) {
        getReusableActions().staticWait(2000);
        if (option == null){
            selectFilter.click();}
        else {
            int cntSize = getDriver().findElements(By.xpath("//span[contains(text(),'"+option+"')]")).size();
            getDriver().findElement(By.xpath("(//span[contains(text(),'"+option+"')])["+cntSize+"]")).click();
        }
        //reporter.softAssert(applyFilterButton.isDisplayed(), "ApplyFilter button is displayed", "ApplyFilter button not displayed");
        reporterSnapshot(applyFilterButton, option+ "Apply Filter", "", "display");
        getReusableActions().clickWhenReady(applyFilterButton, 200);
    }

    public void validateFiltersOrderHistoryPage() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(past7DaysCTA);
        reporterSnapshot(past7DaysCTA, "past 7 Days", "", "Display");
        reporterSnapshot(past30DaysCTA, "past 30 Days", "", "Display");
        reporterSnapshot(fromDatePicker, "From date", "", "Display");
        reporterSnapshot(toDatePicker, "To date", "", "Display");
        reporterSnapshot(orderTypeFilterCTA, "order Type Filter", "", "Display");
        reporterSnapshot(submittedOnFilterCTA, "submittedOn Filter", "", "Display");
        reporterSnapshot(lastUpdatedOnFilterCTA, "lastUpdatedOn Filter", "", "Display");
        reporterSnapshot(channelFilterCTA, "channel Filter", "", "Display");
        reporterSnapshot(statusFilterCTA, "status Filter", "", "Display");
        reporterSnapshot(orderNumberFilterCTA, "orderNumber Filter", "", "Display");
        reporterSnapshot(exportToPDFCTA, "Download PDF", "", "Display");
    }

    public void validateRecordsListedBasedOnFilter() {
        getReusableActions().javascriptScrollByVisibleElement(selfServiceRecords);
        System.out.println(selfServiceRecords.getText());
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='70%'");
        getReusableActions().staticWait(3000);
        //reporter.softAssert(selfServiceRecords.getText().equals("SelfService"), "SelfService Records displayed", "SelfService Records not displayed");
        reporterSnapshot(selfServiceRecords, "Online", "", "Gen");
    }

    public void validateRecordsListedBasedOnStatusFilter() {
        getReusableActions().javascriptScrollByVisibleElement(selfServiceRecordsStatus);
        System.out.println(selfServiceRecordsStatus.getText());
        //reporter.softAssert(selfServiceRecordsStatus.getText().contains("Completed"),"statusFilter Records displayed","StatusFilter Records not displayed");
        reporterSnapshot(selfServiceRecords, "Successful", "", "Gen");
    }

    public void inputDatePickerFilter(int days) {
        LocalDate date = LocalDate.now().minusDays(days);
        DateTimeFormatter formatter = ofPattern("MM/dd/uuuu");
        String dateMinus = date.format(formatter);
        getReusableActions().staticWait(3000);
        fromDatePicker.clear();
        getReusableActions().isElementVisible(fromDatePicker, 10);
        fromDatePicker.sendKeys(dateMinus);
        getReusableActions().clickWhenReady(fromDatePicker, 10);
        fromDatePicker.sendKeys(Keys.ENTER);
        LocalDate dateToday = LocalDate.now();
        String dateMonthDay = dateToday.format(formatter);
        toDatePicker.clear();
        getReusableActions().isElementVisible(toDatePicker, 10);
        toDatePicker.sendKeys(dateMonthDay);
        toDatePicker.sendKeys(Keys.ENTER);
        getReusableActions().staticWait(9000);
        reporterSnapshot(toDatePicker,"SELECTED DATE RANGE","","DISPLAY");
    }

    public void validateAlertMessageForDisabledDates() {
        getReusableActions().staticWait(2000);
        toDatePicker.sendKeys(Keys.ENTER);
        getReusableActions().isElementVisible(errorMessageForFutureDate);
        getReusableActions().javascriptScrollByVisibleElement(toDatePicker);
        //reporter.softAssert(errorMessageForFutureDate.getText().equals("You selected a disabled date"), errorMessageForFutureDate.getText(), "Not valid message for future date selection");
        reporterSnapshot(errorMessageForFutureDate, "You selected a disabled date", "", "Gen");
    }

    public void navigateToCARE(String options) {
        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(tabs2.size()-1));
        reporterSnapshot(accountHistoryCARECTA, "Account History ", "", "visible");
        for (int i = 0; i <= 6; i++) {
            getReusableActions().staticWait(3000);
            String reportTabXpath = "//button[@id='ds-tabs-0-tab-" + i + "']";
            System.out.println("reportTabXpath - " + reportTabXpath);
            if (getDriver().findElements(By.xpath(reportTabXpath)).size() > 0) {
                String strExpVal = getDriver().findElement(By.xpath(reportTabXpath)).getAttribute("aria-label").replace(" ", "");
                System.out.println("strExpVal - " + strExpVal);
                if (strExpVal.toUpperCase().contains(options.toUpperCase().replace(" ", ""))) {
                    System.out.println("strExpVal.toUpperCase - " + strExpVal.toUpperCase());
                    getReusableActions().staticWait(3000);
                    getDriver().findElement(By.xpath(reportTabXpath)).click();
                    getReusableActions().staticWait(3000);
                    reporterSnapshot(getDriver().findElement(By.xpath(reportTabXpath)), "ds-color-misty", options, "class");
                    break;
                }
            } else {
                System.out.println("break - " + i);
                break;
            }

        }
        /*switch (options) {
            case "AccountHistory":
                getReusableActions().clickWhenReady(accountHistoryCARECTA, 10);
                accountHistoryCARECTA.click();
                getReusableActions().staticWait(2000);
                reporterSnapshot(accountHistoryCARECTA,"ds-color-misty",options,"class");
                break;
            case "PaymentHistory":
                getReusableActions().clickWhenReady(paymentHistoryCARECTA, 10);
                paymentHistoryCARECTA.click();
                getReusableActions().staticWait(2000);
                reporterSnapshot(paymentHistoryCARECTA,"ds-color-misty",options,"class");
                break;
            case "UsageHistory":
                getReusableActions().clickWhenReady(usageHistoryCARECTA, 10);
                usageHistoryCARECTA.click();
                getReusableActions().staticWait(2000);
                reporterSnapshot(usageHistoryCARECTA,"ds-color-misty",options,"class");
                break;
            case "Adjustment":
                getReusableActions().clickWhenReady(adjustmentCARECTA, 10);
                adjustmentCARECTA.click();
                getReusableActions().staticWait(2000);
                reporterSnapshot(adjustmentCARECTA,"ds-color-misty",options,"class");
                break;
            case "OrderHistory":
                System.out.println("to click");
                getReusableActions().staticWait(3000);
                getReusableActions().clickWhenReady(orderHistoryCARECTA, 10);
                orderHistoryCARECTA.click();
                System.out.println("clicked");
                getReusableActions().staticWait(2000);
                getReusableActions().staticWait(2000);
                reporterSnapshot(orderHistoryCARECTA,"ds-color-misty",options,"class");
                break;
        }
        getReusableActions().staticWait(3000);*/
    }

    public void validateHistoryReports() {
        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
        System.out.println(tabs2.get(0));

        if (System.getProperty("Environment").equals("qaAuto")) {
            getDriver().switchTo().window(tabs2.get(2));
        } else {
            getDriver().switchTo().window(tabs2.get(1));
        }
        historyReportsBanner.isDisplayed();
        //reporter.softAssert(getReusableActions().isElementVisible(historyReportsBanner), "History reports is appearing", "History reports is not appearing");
        reporterSnapshot(historyReportsBanner, "history Reports Banner", "", "visible");
    }

    public void validateErrorMessageForRecord() {
        getReusableActions().javascriptScrollByVisibleElement(errorMessageRecordExceed);
        getReusableActions().isElementVisible(errorMessageRecordExceed);
        //reporter.softAssert(errorMessageRecordExceed.getText().equals("The number of the results by a date range is limited. Please limit date range."), "error Message display", "error Message not display");
        reporterSnapshot(errorMessageRecordExceed, "Max 50 records", "", "common");
    }

    public void validateRangeOfDateFordays(int days) {
        getReusableActions().javascriptScrollByVisibleElement(higherDateInMonth);
        getReusableActions().staticWait(2000);
        String higherDateMonth = higherDateInMonth.getText().split(",")[0];
        System.out.println("HigherDate*** " + higherDateMonth);
        //reporter.reportLogWithScreenshot("Records displayed before sort");
        getReusableActions().staticWait(2000);
        //submittedOnFilterCTA.click();
        String lowerDateMonth = lowerDateInMonth.getText().split(",")[0];
        System.out.println("lowerDate**** " + lowerDateMonth);
        LocalDate lowerDate = parse(lowerDateMonth, ofPattern("yyyy/MM/dd"));
        LocalDate higherDate = parse(higherDateMonth, ofPattern("yyyy/MM/dd"));

        LocalDate TodaysDate = LocalDate.now();
        System.out.println("todays date is " + TodaysDate);
        LocalDate rangeStartDate = TodaysDate.minusDays(days);
        System.out.println("range start date**** " + rangeStartDate);
        getReusableActions().javascriptScrollToMiddleOfPage();
        //reporter.reportLogWithScreenshot("Records displayed");
        reporter.softAssert(lowerDate.isAfter(rangeStartDate.minusDays(1)), "VALID FIELD - \"" + rangeStartDate + "\" ARE EQUAL OR LESS VALUE WITH ACTUAL VALUE", "INVALID : FIELD - \"" + rangeStartDate + "\" ARE NOT EQUAL OR GREATER VALUE WITH ACTUAL VALUE");
        reporter.softAssert(higherDate.isBefore(TodaysDate.plusDays(1)), "VALID FIELD - \"" + rangeStartDate + "\" ARE EQUAL OR LESS VALUE WITH ACTUAL VALUE", "INVALID : FIELD - \"" + rangeStartDate + "\" ARE NOT EQUAL OR GREATER VALUE WITH ACTUAL VALUE");

    }

    public void clickOnPastThirtyDays() {
        getReusableActions().javascriptScrollByVisibleElement(past30DaysCTA);
        getReusableActions().isElementVisible(past30DaysCTA);
        getReusableActions().staticWait(2000);
        past30DaysCTA.click();
    }

    public void clickOnOrderTypeFilter() {
        getReusableActions().staticWait(3000);
        //getReusableActions().clickWhenReady(orderTypeFilter, 10);
        orderTypeFilter.click();
    }

    public void clickOnTNCOrder() {
        getReusableActions().staticWait(5000);
        thirdEntryTableCTA.click();
    }

    public void validateTNCDetails(String phoneNumber, String newPhoneNumber) {
        TNCBanner.isDisplayed();
        TNCCloseCTA.isDisplayed();
        //reporter.softAssert(oldCTNNumber.getText().equals(phoneNumber) && newCTNNumber.getText().equals(newPhoneNumber), "old CTN and new CTN are the same", "old CTN and new CTN are not the same");
        reporterSnapshot(oldCTNNumber, phoneNumber, "", "Gen");
        reporterSnapshot(newCTNNumber, newPhoneNumber, "", "Gen");
        TNCCloseCTA.click();
    }

    public void clickOnNACOrder() {
        //getReusableActions().javascriptScrollByVisibleElement(secondEntryTableCTA);
        getReusableActions().staticWait(5000);
        secondEntryTableCTA.click();
    }

    public void validateNACDetails(String phoneNumber) {
        NACDetailsBanner.isDisplayed();
        closeNACDetailsModal.isDisplayed();
        //reporter.softAssert(CTNNACDetails.getText().equals(phoneNumber), "CTN is the same", "CTN is not the same");
        reporterSnapshot(CTNNACDetails, phoneNumber, "", "Gen");
        closeNACDetailsModal.click();
    }

    public void validatePagination() {
        //getReusableActions().javascriptScrollByVisibleElement(page1CTA);
        scrollToMiddleOfElement(page1CTA);
        //reporterSnapshot(firstPageCTA,"First Page","","display");
        //reporterSnapshot(previousPageCTA,"Previous Page","","display");
        //reporterSnapshot(page1CTA,"Page 1","","display");
        if (page1CTA.isEnabled()) {
            page1CTA.click();
            reporterSnapshot(page1CTA, "Page 1", "", "display");
        }
        if (page2CTA.isEnabled()) {
            page2CTA.click();
            reporterSnapshot(page2CTA, "Page 2", "", "display");
        }
        if (lastPageCTA.isEnabled()) {
            lastPageCTA.click();
            reporterSnapshot(lastPageCTA, "Last Page", "", "display");
        }
        if (firstPageCTA.isEnabled()) {
            firstPageCTA.click();
            reporterSnapshot(firstPageCTA, "First Page", "", "display");
        }
    }

    public void validateQuantityDropDown(String colNamelist, String colName, String pageCnt) {
        String flag;
        String[] strArray = colNamelist.split(";");
        for (int i = 0; i < strArray.length - 1; i++) {
            if (strArray[i].toUpperCase().contains(colName.toUpperCase())) {
                colName = strArray[i];
                System.out.println(colName);
                break;
            }
        }
        //getReusableActions().javascriptScrollByVisibleElement(page1CTA);
        scrollToMiddleOfElement(page1CTA);
        WebElement optionPerPage = getDriver().findElement(By.xpath("//option[@value='" + pageCnt + "']"));
        optionPerPageDropDown.isDisplayed();
        optionPerPageDropDown.click();
        getReusableActions().staticWait(1000);
        optionPerPage.click();
        getReusableActions().staticWait(1000);
        //getReusableActions().javascriptScrollByVisibleElement(page1CTA);
        scrollToMiddleOfElement(page1CTA);

        String columnXpath = getColumnElementXpath(colName);
        getReusableActions().staticWait(5000);
        List<WebElement> columnstatus = getDriver().findElements(By.xpath(columnXpath));
        int tempActualCnt = columnstatus.size();
        int tempExpCnt = Integer.parseInt(pageCnt);
        if (tempExpCnt >= tempActualCnt)
            flag = "true";
        else
            flag = "false";
        reporterSnapshot(optionPerPage, "Record Count - " + tempExpCnt, flag, "INTMATCH");
    }

    public void validateCrossOfApplyFilterButton() {
        getReusableActions().staticWait(2000);
        //reporter.softAssert(applyFilterButton.isDisplayed(),"apply filter is displayed","apply filter is not displayed");
        reporterSnapshot(applyFilterButton, "apply Filter Button", "", "display");
        applyFilterButton.click();
        /*getReusableActions().staticWait(4000);
        //reporter.softAssert(applyFilterButton.isSelected(),"Draft filter is selected","Draft filter is not selected");
//        reporterSnapshot(applyFilterButton, "apply Filter Button", "", "select");
//        applyFilterButton.click();
        //getReusableActions().staticWait(4000);
        //reporter.softAssert(!draftFilter.isSelected(), "Selected filter is removed", "Selected filter is not removed");

        //      reporterSnapshot(draftFilter, "draft Filter", "", "notselect");
//        getReusableActions().clickWhenReady(applyFilterButton, 200);

        reporterSnapshot(draftFilter, "draft Filter", "", "notselect");
        getReusableActions().clickWhenReady(applyFilterButton, 200);*/

    }

    public List<WebElement> getColumnElementList(String columnName) {
        List<WebElement> colElementList = null;
        switch (columnName) {

            case "Balance":
                colElementList = balanceColList;
                break;
            case "PreTax":
                colElementList = subtotalColList;
                break;
            case "Tax":
                colElementList = taxColList;
                break;
            case "PostTax":
                colElementList = totalColList;
                break;
            case "TotalRefund":
                colElementList = totalRefundAmtList;
                break;
        }
        return colElementList;
    }

    public WebElement getColumnHeader(String columnName) {
        WebElement colElementHeader = null;
        switch (columnName) {
            case "Balance":
                colElementHeader = balanceColHeader;
                break;
            case "PreTax":
                colElementHeader = subtotalColHeader;
                break;
            case "Tax":
                colElementHeader = taxColHeader;
                break;
            case "PostTax":
                colElementHeader = totalColHeader;
                break;
        }
        return colElementHeader;
    }

    public String getColumnElementXpath(String columnName) {
        String colVal = "";
        String tempcolVal = columnName.replace(" ", "");
        if (tempcolVal.toUpperCase().contains("ORDERTYPE"))
            colVal = "1";
        else if (tempcolVal.toUpperCase().contains("DATEANDTIME"))
            colVal = "1";
        else if (tempcolVal.toUpperCase().contains("PRODUCTCODE"))
            colVal = "1";
        else if (tempcolVal.toUpperCase().contains("SUBMITTEDON"))
            colVal = "2";
        else if (tempcolVal.toUpperCase().contains("TRANSACTIONTYPE"))
            colVal = "2";
        else if (tempcolVal.toUpperCase().contains("ORDERDATE/TIME"))
            colVal = "2";
        else if (tempcolVal.toUpperCase().contains("DESCRIPTION"))
            colVal = "2";
        else if (tempcolVal.toUpperCase().contains("USAGETYPE"))
            colVal = "2";
        else if (tempcolVal.toUpperCase().contains("REASONCODE"))
            colVal = "3";
        else if (tempcolVal.toUpperCase().contains("ORDERUPDATEDON"))
            colVal = "3";
        else if (tempcolVal.toUpperCase().contains("YOUUSED"))
            colVal = "3";
        else if (tempcolVal.toUpperCase().contains("ACTIVATE"))
            colVal = "4";
        else if (tempcolVal.toUpperCase().contains("CHANNEL"))
            colVal = "4";
        else if (tempcolVal.toUpperCase().contains("ACCOUNTBALANCE"))
            colVal = "4";
        else if (tempcolVal.toUpperCase().contains("HOWYOUPAID"))
            colVal = "4";
        else if (tempcolVal.toUpperCase().contains("AMOUNT"))
            colVal = "3";//4
        else if (tempcolVal.toUpperCase().contains("STATUS"))
            colVal = "6";//6 (ORDERhistory) or 5 or Payment History (4)
        else if (tempcolVal.toUpperCase().contains("SUBTOTAL") && tempcolVal.length() > 6)
            colVal = "5";
        else if (tempcolVal.toUpperCase().contains("OFFERACCEPTEDDATE"))
            colVal = "5";
        else if (tempcolVal.toUpperCase().contains("ORDER"))
            colVal = "6";
        else if (tempcolVal.toUpperCase().contains("TAX"))
            colVal = "6";
        else if (tempcolVal.toUpperCase().contains("STARTDATE"))
            colVal = "6";
        else if (tempcolVal.toUpperCase().contains("ADJUSTMENTTYPE"))
            colVal = "6";
        else if (tempcolVal.toUpperCase().contains("COVERAGETYPE"))
            colVal = "6";
        else if (tempcolVal.toUpperCase().contains("TOTAL"))
            colVal = "7";
        else if (tempcolVal.toUpperCase().contains("AMOUNT"))
            colVal = "3";
        else if (tempcolVal.toUpperCase().contains("COVERAGETYPE"))
            colVal = "6";
        String columnXpath = "//table[@role='table']/tbody/tr/td[" + colVal + "]";     //   (//td[@role='gridcell'])[4] // (//td[@role='table'])[4]
        //String columnXpath = "(//td[@role='gridcell'])["+ colVal + "]";
        return columnXpath;
    }

    public void validateSortByTextButton(String columnNamelist, String columnName) {
        String[] strArray = columnNamelist.split(";");
        for (int i = 0; i <= strArray.length - 1; i++) {
            if (strArray[i].toUpperCase().contains(columnName.toUpperCase())) {
                columnName = strArray[i];
                System.out.println("columnName - " + columnName);
                break;
            }
        }

        String tableColumnOptionXpath = "//button[contains(text(),'" + columnName + "')]";
        System.out.println("tableColumnOptionXpath - " + tableColumnOptionXpath);
        WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
        getReusableActions().javascriptScrollByVisibleElement(tableColumnOption);
        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(3000);
        tableColumnOption.click();
        getReusableActions().staticWait(5000);

        String columnXpath = getColumnElementXpath(columnName);
        System.out.println(columnXpath);
        List<WebElement> columnstatus = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();
        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText());
            System.out.println("Application - " + we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        //System.out.println("sortedlist"+sortedList);
        reporter.softAssert(sortedList.equals(obtainedList), "VALID FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER MATCHED WITH EXPECTED AND ACTUAL VALUE ", "INVALID : FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER NOT MATCHED WITH EXPECTED AND ACTUAL VALUE");
        tableColumnOption.click();
        getReusableActions().staticWait(3000);

        List<WebElement> columnstatus1 = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus1.size());
        ArrayList<String> obtainedList1 = new ArrayList<>();
        for (WebElement we : columnstatus1) {
            obtainedList1.add(we.getText());
            System.out.println("Application - " + we.getText());
        }
        ArrayList<String> sortedList1 = new ArrayList<>();
        for (String s : obtainedList1) {
            sortedList1.add(s);
        }
        Collections.sort(sortedList1);
        Collections.reverse(sortedList1);
        System.out.println("sortedlist" + sortedList1);
        System.out.println("obtainedList1" + obtainedList1);
        reporter.softAssert(sortedList1.equals(obtainedList1), "VALID FIELD - \"" + columnName.toUpperCase() + "\" DESCENDING ORDER MATCHED WITH EXPECTED AND ACTUAL VALUE ", "INVALID : FIELD - \"" + columnName.toUpperCase() + "\" DESCENDING ORDER NOT MATCHED WITH EXPECTED AND ACTUAL VALUE");
    }

    /*public void validateSortByCurrencyButton(String columnNamelist, String columnName) {
        String[] strArray = columnNamelist.split(";");
        for (int i = 0; i < strArray.length - 1; i++) {
            if (strArray[i].toUpperCase().contains(columnName.toUpperCase())) {
                columnName = strArray[i];
                break;
            }
        }
        System.out.println(columnName);
        String tableColumnOptionXpath = "//button[contains(text(),'" + columnName + "')]";
        WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
        getReusableActions().javascriptScrollByVisibleElement(tableColumnOption);
        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(3000);
        tableColumnOption.click();
        getReusableActions().staticWait(5000);

        String columnXpath = getColumnElementXpath(columnName);
        System.out.println(columnXpath);
*//*
        List<Integer> unorderedColumnList = getDriver().findElements(By.xpath(columnXpath)).stream().map(i -> i.getText().replace("$", "").replaceFirst("[/.][0-9][0-9]", "").trim()).map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> ascendingColumnList = unorderedColumnList.stream().sorted().collect(Collectors.toList());
        List<Integer> descendingColumnList = ascendingColumnList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> firstChngAccountBalanceList = getDriver().findElements(By.xpath(columnXpath)).stream().map(i -> i.getText().replace("$", "").replaceFirst("[/.][0-9][0-9]", "").trim()).map(Integer::valueOf).collect(Collectors.toList());
*//*
        List<Integer> unorderedColumnList = getDriver().findElements(By.xpath(columnXpath)).stream().map(i -> i.getText().replace("$", "").replaceFirst("[/.][0-9][0-9]", "").trim()).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(getDriver().findElements(By.xpath(columnXpath)).stream().map(i -> i.getText().replace("$", "").replaceFirst("[/.][0-9][0-9]", "").trim()));
        System.out.println(getDriver().findElements(By.xpath(columnXpath)).stream().map(i -> i.getText().replaceFirst("[/.][0-9][0-9]", "").trim()));
        System.out.println(getDriver().findElements(By.xpath(columnXpath)).stream().map(i -> i.getText().replace("$", "").trim()));
        List<Integer> ascendingColumnList = unorderedColumnList.stream().sorted().collect(Collectors.toList());
        List<Integer> descendingColumnList = ascendingColumnList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> firstChngAccountBalanceList = getDriver().findElements(By.xpath(columnXpath)).stream().map(i -> i.getText().replace("$", "").replaceFirst("[/.][0-9][0-9]", "").trim()).map(Integer::valueOf).collect(Collectors.toList());
        reporter.softAssert(firstChngAccountBalanceList.equals(ascendingColumnList), "VALID FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER MATCHED WITH EXPECTED AND ACTUAL VALUE ", "INVALID : FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER NOT MATCHED WITH EXPECTED AND ACTUAL VALUE");
        System.out.println("firstChngAccountBalanceList"+ firstChngAccountBalanceList);
        System.out.println("ascendingColumnList"+ ascendingColumnList);
        System.out.println("descendingColumnList"+ descendingColumnList);

        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(3000);
        tableColumnOption.click();
        getReusableActions().staticWait(5000);
        List<Integer> unorderedColumnList1 = getDriver().findElements(By.xpath(columnXpath)).stream().map(i -> i.getText().replace("$", "").replaceFirst("[/.][0-9][0-9]", "").trim()).map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> ascendingColumnList1 = unorderedColumnList1.stream().sorted().collect(Collectors.toList());
        List<Integer> descendingColumnList1 = ascendingColumnList1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> firstChngAccountBalanceList1 = getDriver().findElements(By.xpath(columnXpath)).stream().map(i -> i.getText().replace("$", "").replaceFirst("[/.][0-9][0-9]", "").trim()).map(Integer::valueOf).collect(Collectors.toList());
        reporter.softAssert(firstChngAccountBalanceList1.equals(descendingColumnList1), "VALID FIELD - \"" + columnName.toUpperCase() + "\" DESCENDING ORDER MATCHED WITH EXPECTED AND ACTUAL VALUE ", "INVALID : FIELD - \"" + columnName.toUpperCase() + "\" DESCENDING ORDER NOT MATCHED WITH EXPECTED AND ACTUAL VALUE");
        System.out.println("firstChngAccountBalanceList1"+ firstChngAccountBalanceList1);
        System.out.println("ascendingColumnList1"+ ascendingColumnList1);
        System.out.println("descendingColumnList1"+ descendingColumnList1);
    }*/

    public void validateSortByDateButton(String columnNamelist, String columnName) {
        String[] strArray = columnNamelist.split(";");
        for (int i = 0; i <= strArray.length - 1; i++) {
            if (strArray[i].contains(columnName)) {
                columnName = strArray[i];
                break;
            }
        }

        String tableColumnOptionXpath = "//button[contains(text(),'" + columnName + "')]";
        WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
        getReusableActions().javascriptScrollByVisibleElement(tableColumnOption);
        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(3000);
        tableColumnOption.click();
        getReusableActions().staticWait(5000);

        String columnXpath = getColumnElementXpath(columnName);
        List<WebElement> columnstatus = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus.size());
        List<Date> obtainedList = new ArrayList<Date>();
        String date;
        for (WebElement we : columnstatus) {
            date = we.getText();
            System.out.println("date - " + date);
            //int Date = Integer.parseInt(date.replaceAll("\\D.*", ""));
            //int Date = Integer.parseInt(date.replaceAll("\\D.*", ""));
            //System.out.println("intdate - "+ Date);
            SimpleDateFormat dateFormatter
                    = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
            Date Date1 = null;
            try {
                Date1 = dateFormatter.parse(date);
                System.out.println("date1 - " + Date1);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            obtainedList.add(Date1);
        }
        ArrayList<Date> sortedList = new ArrayList<>();
        for (Date s : obtainedList) {
            sortedList.add(s);
        }

        Collections.sort(sortedList, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
        Collections.sort(sortedList);

        reporter.softAssert(sortedList.equals(obtainedList), "VALID FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER MATCHED WITH EXPECTED AND ACTUAL VALUE ", "INVALID : FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER NOT MATCHED WITH EXPECTED AND ACTUAL VALUE");
        tableColumnOption.click();
        getReusableActions().staticWait(3000);

        List<WebElement> columnstatus1 = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus1.size());
        List<Date> obtainedList1 = new ArrayList<Date>();

        String date1;
        for (WebElement we : columnstatus1) {
            date1 = we.getText();

            //int Date = Integer.parseInt(date1.replaceAll("\\D.*", ""));
            SimpleDateFormat dateFormatter
                    = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
            Date Date1 = null;
            try {
                Date1 = dateFormatter.parse(date1);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            obtainedList.add(Date1);
        }
        ArrayList<Date> sortedList1 = new ArrayList<>();

        for (Date s : obtainedList1) {
            sortedList1.add(s);
        }

        Collections.sort(sortedList1, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
        Collections.sort(sortedList1);
        Collections.reverse(sortedList1);
        //System.out.println("sortedlist"+sortedList1);
        //System.out.println("obtainedList1"+obtainedList1);
        reporter.softAssert(sortedList1.equals(obtainedList1), "VALID FIELD - \"" + columnName.toUpperCase() + "\" DESCENDING ORDER MATCHED WITH EXPECTED AND ACTUAL VALUE ", "INVALID : FIELD - \"" + columnName.toUpperCase() + "\" DESCENDING ORDER NOT MATCHED WITH EXPECTED AND ACTUAL VALUE");
    }

    public void validateAutoPayUnenrollmentOrder() {
        //orderHistoryCTA.click();
        //orderHistoryCARECTA.click();
        //getReusableActions().javascriptScrollByVisibleElement(orderHistoryCARECTA);
        //reporter.reportLogWithScreenshot("Order History Tab");
        getReusableActions().staticWait(2000);
        //clickOnOrderTypeFilter();
        getReusableActions().staticWait(2000);
        //reporter.softAssert(autoPayUnenrollmentCTA.isDisplayed(), "Auto-Pay Unenrollment CTA is displayed", "Auto-Pay Unenrollment CTA is not displayed");
        reporterSnapshot(autoPayUnenrollmentCTA, "autoPay Unenrollment", "", "display");
        autoPayUnenrollmentCTA.click();
        getReusableActions().staticWait(2000);
        applyFilterButton.click();
    }

    public void validateAutoPayEnrollmentOrder() {
        //orderHistoryCTA.click();
        orderHistoryCARECTA.click();
        getReusableActions().javascriptScrollByVisibleElement(orderHistoryCARECTA);
        //reporter.reportLogWithScreenshot("Order History Tab");
        getReusableActions().staticWait(2000);
        clickOnOrderTypeFilter();
        getReusableActions().staticWait(2000);
        //reporter.softAssert(autoPayEnrollmentCTA.isDisplayed(), "Auto-Pay Enrollment CTA is displayed", "Auto-Pay Enrollment CTA is not displayed");
        reporterSnapshot(autoPayEnrollmentCTA, "autoPay enrollment", "", "display");
        autoPayEnrollmentCTA.click();
        getReusableActions().staticWait(2000);
        applyFilterButton.click();
    }


    public void validateAddOnManagementOrder() {
        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(tabs2.size() - 1));
        /*getReusableActions().staticWait(2000);
        orderHistoryCARECTA.click();
        getReusableActions().staticWait(2000);
        //getReusableActions().javascriptScrollByVisibleElement(orderHistoryCARECTA);
        //reporter.reportLogWithScreenshot("Order History Tab");
        getReusableActions().staticWait(2000);
        clickOnPastThirtyDays();
        getReusableActions().staticWait(2000);
        clickOnOrderTypeFilter();
        getReusableActions().staticWait(2000);
        *///reporter.softAssert(addOnManagementCTA.isDisplayed(), "Add-On Management CTA is displayed", "Add-On Management CTA is not displayed");
        reporterSnapshot(addOnManagementCTA, "addOn Management", "", "display");
        addOnManagementCTA.click();
/*        getReusableActions().staticWait(2000);
        applyFilterButton.click();*/
        //reporter.softAssert(addOnManagement_Record.isDisplayed(),"Add OnManagement Order Record is displayed","Add OnManagement Order Record is not displayed");
        reporterSnapshot(addOnManagement_Record, "addOn Management", "", "display");
    }

    public void validatePPCOrder() {
        orderHistoryCARECTA.click();
        getReusableActions().javascriptScrollByVisibleElement(orderHistoryCARECTA);
        //reporter.reportLogWithScreenshot("Order History Tab");
        getReusableActions().staticWait(2000);
        clickOnOrderTypeFilter();
        getReusableActions().staticWait(2000);
        //reporter.softAssert(addOnManagementCTA.isDisplayed(), "Add-On Management CTA is displayed", "Add-On Management CTA is not displayed");
        reporterSnapshot(addOnManagementCTA, "addOn Management", "", "display");
        addOnManagementCTA.click();
        getReusableActions().staticWait(2000);
        applyFilterButton.click();
    }

    public void validateNACPortInOrder() {
        orderHistoryCARECTA.click();
        getReusableActions().javascriptScrollByVisibleElement(orderHistoryCARECTA);
        reporter.reportLogWithScreenshot("Order History Tab");
        getReusableActions().staticWait(2000);
        clickOnOrderTypeFilter();
        getReusableActions().staticWait(2000);
        //reporter.softAssert(addOnManagementCTA.isDisplayed(), "Add-On Management CTA is displayed", "Add-On Management CTA is not displayed");
        reporterSnapshot(addOnManagementCTA, "addOn Management", "", "display");
        addOnManagementCTA.click();
        getReusableActions().staticWait(2000);
        applyFilterButton.click();
    }

    public void validNoRecordFoundDate() {
        LocalDate date = LocalDate.now().minusDays(300);
        DateTimeFormatter formatter = ofPattern("MM/dd/uuuu");
        String dateMinus = date.format(formatter);
        fromDatePicker.clear();
        getReusableActions().isElementVisible(fromDatePicker, 10);
        fromDatePicker.sendKeys(dateMinus);
        fromDatePicker.sendKeys(Keys.ENTER);
        toDatePicker.clear();
        getReusableActions().isElementVisible(toDatePicker, 10);
        toDatePicker.sendKeys(dateMinus);
        //getReusableActions().clickWhenReady(toDatePicker, 10);
        toDatePicker.sendKeys(Keys.ENTER);
        getReusableActions().staticWait(3000);
    }

    public void validateNoRecordMessage() {
        getReusableActions().staticWait(3000);
        getReusableActions().isElementVisible(NORecordFound);
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(past7DaysCTA);
        //reporter.softAssert(NORecordFound.getText().equals("No records found for the specified search criteria"),"error Message display","error Message not display");
        reporterSnapshot(NORecordFound, "Error! We couldn", "", "common");
    }

    public void validateRecordsListedBasedOnColumnFilter(String columnNamelist, String columnName, String strExpColValue) {
        String[] strArray = columnNamelist.split(";");
        for (int i = 0; i < strArray.length - 1; i++) {
            if (strArray[i].toUpperCase().contains(columnName.toUpperCase())) {
                columnName = strArray[i];
                System.out.println(columnName);
                break;
            }
        }
        String tableColumnOptionXpath = "//button[contains(text(),'" + columnName + "')]";
        System.out.println(tableColumnOptionXpath);
        WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
        getReusableActions().javascriptScrollByVisibleElement(tableColumnOption);
        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(1000);
        System.out.println("columnName - " + columnName);
        String columnXpath = getColumnElementXpath(columnName);
        System.out.println("columnXpath - " + columnXpath);
        List<WebElement> columnstatus = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements in Column Status size:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();
        //getReusableActions().javascriptScrollByVisibleElement(exportToPDFCTA);
        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText().toUpperCase());
            System.out.println("ACTUAL TEXT : " +we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            if (s.equals(strExpColValue.toUpperCase()))
                sortedList.add(s);
        }
        System.out.println("Number of elements in Sorted List Size:" + sortedList.size());
        if (sortedList.size() == columnstatus.size())
            reporterSnapshot(tableColumnOption, Integer.toString(columnstatus.size())+" HISTORY DATA", Integer.toString(sortedList.size())+" HISTORY DATA", "Compare");
        else
            reporterSnapshot(tableColumnOption, Integer.toString(columnstatus.size())+" HISTORY DATA", Integer.toString(sortedList.size())+" HISTORY DATA", "Compare");
    }

    public void validateRangeOfDateRecordValue(String columnNamelist, String columnName, int days) {
        String[] strArray = columnNamelist.split(";");
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].toUpperCase().contains(columnName.toUpperCase())) {
                columnName = strArray[i];
                System.out.println("columnName - " + columnName);
                break;
            }
        }
        String tableColumnOptionXpath = "//button[contains(text(),'" + columnName + "')]";
        System.out.println(tableColumnOptionXpath);
        getReusableActions().staticWait(3000);
        WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
        getReusableActions().javascriptScrollByVisibleElement(tableColumnOption);
        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(3000);
        String columnXpath = getColumnElementXpath(columnName);
        System.out.println("columnXpath:" + columnXpath);
        List<WebElement> columnstatus = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();
        getReusableActions().javascriptScrollByVisibleElement(exportToPDFCTA);
        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText().toUpperCase());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        String higherDateMonth = sortedList.get(0).split(",")[0];
        System.out.println("HigherDate*** " + higherDateMonth);
        Collections.reverse(sortedList);
        String lowerDateMonth = sortedList.get(0).split(",")[0];
        System.out.println("lowerDate**** " + lowerDateMonth);
        LocalDate lowerDate = parse(lowerDateMonth.replace(",",""), ofPattern("yyyy/MM/dd"));
        LocalDate higherDate = parse(higherDateMonth.replace(",",""), ofPattern("yyyy/MM/dd"));
        LocalDate TodaysDate = LocalDate.now();
        System.out.println("todays date is " + TodaysDate);
        LocalDate rangeStartDate = TodaysDate.minusDays(days);
        System.out.println("range start date**** " + rangeStartDate);
        reporter.softAssert(lowerDate.isAfter(rangeStartDate.minusDays(1)), "VALID FIELD - \"" + rangeStartDate.minusDays(1) + "\" ARE EQUAL OR LESS VALUE WITH ACTUAL VALUE", "INVALID : FIELD - \"" + rangeStartDate + "\" ARE NOT EQUAL OR GREATER VALUE WITH ACTUAL VALUE");
        reporter.softAssert(higherDate.isBefore(TodaysDate.plusDays(1)), "VALID FIELD - \"" + TodaysDate.plusDays(1) + "\" ARE EQUAL OR LESS VALUE WITH ACTUAL VALUE", "INVALID : FIELD - \"" + rangeStartDate + "\" ARE NOT EQUAL OR GREATER VALUE WITH ACTUAL VALUE");
    }
    public void validateRangesInTable(int days) {
        LocalDate dateToday = LocalDate.now();
        LocalDate dateConverted = convertStringToDate(firstSubmittedOnDate.getText().substring(0, 10));
        boolean toDateIsInRange = dateToday.isAfter(dateConverted) && dateToday.minusDays(days).isBefore(dateConverted);
        //reporter.softAssert(toDateIsInRange, dateConverted + " its between from date and the week before for " + days + " days", dateConverted + " its not between todays date and the week before for " + days + " days");
        reporterSnapshot(firstSubmittedOnDate, String.valueOf(dateConverted), String.valueOf(toDateIsInRange), "INTMATCH");
        goToLastRecordOnTable();
        dateConverted = convertStringToDate(lastSubmittedOnDate.getText().substring(0, 10));
        boolean fromDateIsInRange = dateToday.minusDays(days).isBefore(dateConverted) && dateToday.minusDays(days).plusDays(days).isAfter(dateConverted);
        //reporter.softAssert(fromDateIsInRange, "its between to date and " + rangeFrom + " days for " + days + " days", "its not beetween to date picker date and " + rangeFrom + " days for " + days + " days");
        reporterSnapshot(lastSubmittedOnDate, String.valueOf(dateConverted), String.valueOf(toDateIsInRange), "INTMATCH");
    }

    public void validateExportToPDF() {
        //reporter.softAssert(exportToPDFCTA.isDisplayed(), "Export to PDF CTA is appearing", "Export to PDF is not appearing");
        reporterSnapshot(exportToPDFCTA, "export To PDF", "", "display");
    }

    public void validateFrenchObjects() {
        reporterSnapshot(past7DaysFrenchCTA, "past 7 Days", "", "display");
        reporterSnapshot(past30FrenchDaysCTA, "past 30 Days", "", "display");
        reporterSnapshot(fromDatePicker, "from Date Picker", "", "display");
        reporterSnapshot(toDatePicker, "toDate Picker", "", "display");
        /*reporterSnapshot(orderTypeFilterCTA, "order Type", "", "display");
        reporterSnapshot(submittedOnFilterCTA, "submitted On", "", "display");
        reporterSnapshot(lastUpdatedOnFilterCTA, "last Updated On", "", "display");
        reporterSnapshot(statusFilterCTA, "status", "", "display");
        reporterSnapshot(orderNumberFilterCTA, "orderNumber", "", "display");
        *///reporterSnapshot(exportToPDFCTA,"exportToPDF","","display");
    }

    public void selectFilterButton() {
        getReusableActions().isElementVisible(selectFilter);
        getReusableActions().clickWhenReady(selectFilter);
    }

    public void validateEASRangeOfDateFordays(int days) {

        String higherDateMonth = higherDateRangeMonth.getText().split(",")[0];
        System.out.println("HigherDate*** " + higherDateMonth);
        reporter.reportLogWithScreenshot("Records displayed before sort");
        getReusableActions().staticWait(2000);
        filterButton.click();
        getReusableActions().staticWait(2000);
        String lowerDateMonth = lowerDateRangeMonth.getText().split(",")[0];
        System.out.println("lowerDate**** " + lowerDateMonth);
        LocalDate lowerDate = parse(lowerDateMonth, ofPattern("yyyy/MM/dd"));
        LocalDate higherDate = parse(higherDateMonth, ofPattern("yyyy/MM/dd"));

        LocalDate TodaysDate = LocalDate.now();
        System.out.println("todays date is " + TodaysDate);
        LocalDate rangeStartDate = TodaysDate.minusDays(days);
        System.out.println("range start date**** " + rangeStartDate);
        getReusableActions().javascriptScrollToMiddleOfPage();
        reporter.reportLogWithScreenshot("Records displayed");
        reporter.softAssert(lowerDate.isAfter(rangeStartDate.minusDays(1)), "VALID FIELD - \"" + rangeStartDate + "\" ARE EQUAL OR LESS VALUE WITH ACTUAL VALUE", "INVALID : FIELD - \"" + rangeStartDate + "\" ARE NOT EQUAL OR GREATER VALUE WITH ACTUAL VALUE");
        reporter.softAssert(higherDate.isBefore(TodaysDate.plusDays(1)), "VALID FIELD - \"" + rangeStartDate + "\" ARE EQUAL OR LESS VALUE WITH ACTUAL VALUE", "INVALID : FIELD - \"" + rangeStartDate + "\" ARE NOT EQUAL OR GREATER VALUE WITH ACTUAL VALUE");
    }

    public void validateCurrencyColumnSorting(String columnName) {

        List<Integer> unorderedColumnList = getColumnElementList(columnName).stream().map(i -> i.getText().replace("$", "").replaceFirst("[/.][0-9][0-9]", "").trim()).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println("unorderedColumnList  :" + unorderedColumnList);
        List<Integer> ascendingColumnList = unorderedColumnList.stream().sorted().collect(Collectors.toList());
        System.out.println("ascendingColumnList  :" + ascendingColumnList);
        List<Integer> descendingColumnList = ascendingColumnList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("descendingColumnList  :" + descendingColumnList);
        getReusableActions().javascriptScrollByVisibleElement(getColumnHeader(columnName));
        //getColumnHeader(columnName).click();
        getReusableActions().staticWait(1000);
        getColumnHeader(columnName).click();
        getReusableActions().staticWait(1000);
        List<Integer> firstChngAccountBalanceList = getColumnElementList(columnName).stream().map(i -> i.getText().replace("$", "").replaceFirst("[/.][0-9][0-9]", "").trim()).map(Integer::valueOf).collect(Collectors.toList());
        //reporter.softAssert(firstChngAccountBalanceList.equals(ascendingColumnList), "Column " + columnName + " is in ascending order after click", " Column " + columnName + " is not in ascending order after click");
        reporter.softAssert(firstChngAccountBalanceList.equals(ascendingColumnList), "VALID FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER MATCHED WITH EXPECTED AND ACTUAL VALUE ", "INVALID : FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER NOT MATCHED WITH EXPECTED AND ACTUAL VALUE");
    }
    public void validateSevendaysFilterPaymentTab() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(past7DaysCTA);
        reporterSnapshot(past7DaysCTA, "past 7 Days", "", "Display");
        reporterSnapshot(past30DaysCTA, "past 30 Days", "", "Display");
        reporterSnapshot(fromDatePicker, "From date", "", "Display");
        reporterSnapshot(toDatePicker, "To date", "", "Display");

        getReusableActions().javascriptScrollByVisibleElement(sortByPayment);
        getReusableActions().isElementVisible(sortByPayment);
        getReusableActions().staticWait(3000);
        //reporter.softAssert(sortByPayment.isDisplayed(),"Payment status is displayed","Payment status is not displayed");
        reporterSnapshot(sortByPayment, "sortBy Payment", "", "display");
        getReusableActions().javascriptScrollByVisibleElement(sortByTransactionType);
        getReusableActions().isElementVisible(sortByTransactionType);
        getReusableActions().staticWait(3000);
        sortByTransactionType.click();
        getReusableActions().staticWait(3000);
        //reporter.reportLogWithScreenshot("Payment Transaction Type is Sorted in Alphabetical order");
        List<WebElement> columnstatus2 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[2]"));
        System.out.println("Number of elements:" + columnstatus2.size());
        reporter.softAssert(sortByTransactionType.isDisplayed(), "Transaction type is displayed", "Transaction type is not displayed");
        getReusableActions().javascriptScrollByVisibleElement(sortByTransactionDate);
        getReusableActions().isElementVisible(sortByTransactionDate);
        getReusableActions().staticWait(3000);
        sortByTransactionDate.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Payment Transaction Date and Time is Sorted in DESC order");
        List<WebElement> columnstatus3 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[1]"));
        System.out.println("Number of elements:" + columnstatus3.size());
        reporter.softAssert(sortByTransactionDate.isDisplayed(), "Transaction Date and time is displayed", "Transaction date and time is not displayed");
        getReusableActions().javascriptScrollByVisibleElement(accountBalance);
        getReusableActions().isElementVisible(accountBalance);
        getReusableActions().staticWait(3000);
        accountBalance.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Account balance is displayed");
        List<WebElement> columnstatus4 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[4]"));
        System.out.println("Number of elements:" + columnstatus4.size());
        reporter.softAssert(accountBalance.isDisplayed(), "Account balance is displayed", "account balance is not displayed");
        getReusableActions().javascriptScrollByVisibleElement(subtotal);
        getReusableActions().isElementVisible(subtotal);
        getReusableActions().staticWait(3000);
        subtotal.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Account balance is displayed");
        List<WebElement> columnstatus5 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[5]"));
        System.out.println("Number of elements:" + columnstatus5.size());
        reporter.softAssert(subtotal.isDisplayed(), "subtotal is displayed", "subtotal is not displayed");
        getReusableActions().javascriptScrollByVisibleElement(tax);
        getReusableActions().isElementVisible(tax);
        getReusableActions().staticWait(3000);
        tax.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("tax is displayed");
        List<WebElement> columnstatus6 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[6]"));
        System.out.println("Number of elements:" + columnstatus6.size());
        reporter.softAssert(tax.isDisplayed(), "Tax is displayed", "tax is not displayed");
        getReusableActions().javascriptScrollByVisibleElement(total);
        getReusableActions().isElementVisible(total);
        getReusableActions().staticWait(3000);
        total.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("total is displayed");
        List<WebElement> columnstatus7 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[7]"));
        System.out.println("Number of elements:" + columnstatus7.size());
        reporter.softAssert(total.isDisplayed(), "total is displayed", "total is not displayed");
        getReusableActions().javascriptScrollByVisibleElement(paymentMethod);
        getReusableActions().isElementVisible(paymentMethod);
        getReusableActions().staticWait(3000);
        paymentMethod.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("payment method is displayed");
        List<WebElement> columnstatus8 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[8]"));
        System.out.println("Number of elements:" + columnstatus8.size());
        reporter.softAssert(paymentMethod.isDisplayed(), "payment method is displayed", "payment method is not displayed");
        getReusableActions().javascriptScrollByVisibleElement(cardDetails);
        getReusableActions().isElementVisible(cardDetails);
        getReusableActions().staticWait(3000);
        cardDetails.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("payment method is displayed");
        List<WebElement> columnstatus9 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[9]"));
        System.out.println("Number of elements:" + columnstatus9.size());
        reporter.softAssert(cardDetails.isDisplayed(), "card details is displayed", "card details is not displayed");
        getReusableActions().javascriptScrollByVisibleElement(transactionDetails);
        getReusableActions().isElementVisible(transactionDetails);
        getReusableActions().staticWait(3000);
        transactionDetails.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("transaction details is displayed");
        List<WebElement> columnstatus10 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[10]"));
        System.out.println("Number of elements:" + columnstatus10.size());
        reporter.softAssert(transactionDetails.isDisplayed(), "transactional details is displayed", "transactional details is not displayed");
        getReusableActions().javascriptScrollByVisibleElement(referenceHash);
        getReusableActions().isElementVisible(referenceHash);
        getReusableActions().staticWait(3000);
        referenceHash.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Reference is displayed");
        List<WebElement> columnstatus11 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[11]"));
        System.out.println("Number of elements:" + columnstatus11.size());
        reporter.softAssert(referenceHash.isDisplayed(), "Reference hash is displayed", "Reference hash is not displayed");
    }

    public void validate_thirtydays_filter_tab() {
        getReusableActions().staticWait(2000);
        reporter.softAssert(past30DaysCTA.isDisplayed(), "Past 30 days button is displayed", "Past 30 days button is not displayed");
        reporter.softAssert(past7DaysCTA.isDisplayed(), "Past 7 days button is displayed", "Past 7 days button is not displayed");
        // reporter.softAssert(past30DaysCTA.isDisplayed(),"Past 30 days button is displayed","Past 30 days button is not displayed");
        reporter.softAssert(fromDatePicker.isDisplayed(), "to date picker is displayed", "to date picker is not displayed");
        reporter.softAssert(toDatePicker.isDisplayed(), "from date picker is displayed", "from date picker is not displayed");

        getReusableActions().javascriptScrollByVisibleElement(sortByPayment);
        getReusableActions().isElementVisible(sortByPayment);
        getReusableActions().staticWait(3000);
        sortByPayment.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Status Sorted by Alphabetical order");
        List<WebElement> columnstatus1 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[3]"));
        System.out.println("Number of elements:" + columnstatus1.size());
        reporter.softAssert(sortByPayment.isDisplayed(), "Payment status is displayed", "Payment status is not displayed");

        getReusableActions().javascriptScrollByVisibleElement(sortByTransactionType);
        getReusableActions().isElementVisible(sortByTransactionType);
        getReusableActions().staticWait(3000);
        sortByTransactionType.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Payment Transaction Type is Sorted in Alphabetical order");
        List<WebElement> columnstatus2 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[2]"));
        System.out.println("Number of elements:" + columnstatus2.size());
        reporter.softAssert(sortByTransactionType.isDisplayed(), "Transaction type is displayed", "Transaction type is not displayed");

        getReusableActions().javascriptScrollByVisibleElement(sortByTransactionDate);
        getReusableActions().isElementVisible(sortByTransactionDate);
        getReusableActions().staticWait(3000);
        sortByTransactionDate.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Payment Transaction Date and Time is Sorted in DESC order");
        List<WebElement> columnstatus3 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[1]"));
        System.out.println("Number of elements:" + columnstatus3.size());
        reporter.softAssert(sortByTransactionDate.isDisplayed(), "Transaction Date and time is displayed", "Transaction date and time is not displayed");

        getReusableActions().javascriptScrollByVisibleElement(accountBalance);
        getReusableActions().isElementVisible(accountBalance);
        getReusableActions().staticWait(3000);
        accountBalance.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Account balance is displayed");
        List<WebElement> columnstatus4 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[4]"));
        System.out.println("Number of elements:" + columnstatus4.size());
        reporter.softAssert(accountBalance.isDisplayed(), "Account balance is displayed", "account balance is not displayed");

        getReusableActions().javascriptScrollByVisibleElement(subtotal);
        getReusableActions().isElementVisible(subtotal);
        getReusableActions().staticWait(3000);
        subtotal.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Account balance is displayed");
        List<WebElement> columnstatus5 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[5]"));
        System.out.println("Number of elements:" + columnstatus5.size());
        reporter.softAssert(subtotal.isDisplayed(), "subtotal is displayed", "subtotal is not displayed");

        getReusableActions().javascriptScrollByVisibleElement(tax);
        getReusableActions().isElementVisible(tax);
        getReusableActions().staticWait(3000);
        tax.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("tax is displayed");
        List<WebElement> columnstatus6 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[6]"));
        System.out.println("Number of elements:" + columnstatus6.size());
        reporter.softAssert(tax.isDisplayed(), "Tax is displayed", "tax is not displayed");

        getReusableActions().javascriptScrollByVisibleElement(total);
        getReusableActions().isElementVisible(total);
        getReusableActions().staticWait(3000);
        total.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("total is displayed");
        List<WebElement> columnstatus7 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[7]"));
        System.out.println("Number of elements:" + columnstatus7.size());
        reporter.softAssert(total.isDisplayed(), "total is displayed", "total is not displayed");

        getReusableActions().javascriptScrollByVisibleElement(paymentMethod);
        getReusableActions().isElementVisible(paymentMethod);
        getReusableActions().staticWait(3000);
        paymentMethod.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("payment method is displayed");
        List<WebElement> columnstatus8 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[8]"));
        System.out.println("Number of elements:" + columnstatus8.size());
        reporter.softAssert(paymentMethod.isDisplayed(), "payment method is displayed", "payment method is not displayed");

        getReusableActions().javascriptScrollByVisibleElement(cardDetails);
        getReusableActions().isElementVisible(cardDetails);
        getReusableActions().staticWait(3000);
        cardDetails.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("payment method is displayed");
        List<WebElement> columnstatus9 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[9]"));
        System.out.println("Number of elements:" + columnstatus9.size());
        reporter.softAssert(cardDetails.isDisplayed(), "card details is displayed", "card details is not displayed");

        getReusableActions().javascriptScrollByVisibleElement(transactionDetails);
        getReusableActions().isElementVisible(transactionDetails);
        getReusableActions().staticWait(3000);
        transactionDetails.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("transaction details is displayed");
        List<WebElement> columnstatus10 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[10]"));
        System.out.println("Number of elements:" + columnstatus10.size());
        reporter.softAssert(transactionDetails.isDisplayed(), "transactional details is displayed", "transactional details is not displayed");

        getReusableActions().javascriptScrollByVisibleElement(referenceHash);
        getReusableActions().isElementVisible(referenceHash);
        getReusableActions().staticWait(3000);
        referenceHash.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Reference is displayed");
        List<WebElement> columnstatus11 = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[11]"));
        System.out.println("Number of elements:" + columnstatus11.size());
        reporter.softAssert(referenceHash.isDisplayed(), "Reference hash is displayed", "Reference hash is not displayed");


    }

    public void clickOnSortByPaymentStatusButton() {
        getReusableActions().javascriptScrollByVisibleElement(sortByPayment);
        getReusableActions().isElementVisible(sortByPayment);
        getReusableActions().staticWait(3000);
        sortByPayment.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Status Sorted by Alphabetical order");
        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[3]"));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();

        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        String columnName = "Payment";
        reporter.softAssert(sortedList.equals(obtainedList), "VALID FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER MATCHED WITH EXPECTED AND ACTUAL VALUE ", "INVALID : FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER NOT MATCHED WITH EXPECTED AND ACTUAL VALUE");

        sortByPayment.click();
        getReusableActions().staticWait(3000);
        //reporter.reportLogWithScreenshot("Status Sorted by Reverse Alphabetical order");
    }

    public void validatePaymentHistoryTableScreen() {

        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[3]"));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();

        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        reporter.softAssert(sortedList.equals(obtainedList), "Status is sorted in Reverse alphabetical order", "Status is not sorted in  Alphabetical order");

    }

    public void inputDateFromGreaterThenToDate() {
        DateTimeFormatter formatter = ofPattern("MM/dd/uuuu");
        LocalDate dateToday = LocalDate.now();
        String dateMonthDay = dateToday.format(formatter);
        fromDatePicker.clear();
        getReusableActions().isElementVisible(fromDatePicker, 10);
        fromDatePicker.sendKeys(dateMonthDay);
        fromDatePicker.sendKeys(Keys.ENTER);
        getReusableActions().staticWait(2000);
        LocalDate date = LocalDate.now().minusDays(2);
        String dateMinus = date.format(formatter);
        getReusableActions().staticWait(2000);
        toDatePicker.clear();
        getReusableActions().isElementVisible(toDatePicker, 10);
        toDatePicker.sendKeys(dateMinus);
        getReusableActions().clickWhenReady(toDatePicker, 10);
        toDatePicker.sendKeys(Keys.ENTER);
        getReusableActions().staticWait(5000);
    }

    public void clickOnSortTransactionTypeButton() {
        reporter.softAssert(past7DaysCTA.isDisplayed(), "Past 7 days button is displayed", "Past 7 days button is not displayed");
        reporter.softAssert(past30DaysCTA.isDisplayed(), "Past 30 days button is displayed", "Past 30 days button is not displayed");
        reporter.softAssert(fromDatePicker.isDisplayed(), "to date picker is displayed", "to date picker is not displayed");
        reporter.softAssert(toDatePicker.isDisplayed(), "from date picker is displayed", "from date picker is not displayed");
        getReusableActions().javascriptScrollByVisibleElement(sortByTransactionType);
        getReusableActions().isElementVisible(sortByTransactionType);
        getReusableActions().staticWait(3000);
        sortByTransactionType.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Payment Transaction Type is Sorted in Alphabetical order");
        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[2]"));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();

        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        reporter.softAssert(sortedList.equals(obtainedList), "Transaction type is sorted in alphabetical order", "Transaction type is not sorted in  Alphabetical order");

        sortByTransactionType.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Transaction Type is sorted by Reverse Alphabetical order");
    }

    public void validateTransactionTypeTableScreen() {

        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[2]"));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();

        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        reporter.softAssert(sortedList.equals(obtainedList), "Transaction type is sorted in Reverse alphabetical order", "Transaction type is not sorted in  Alphabetical order");

    }

    public void validatePaymentDateAndTime() {

        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[1]"));
        System.out.println("Number of elements:" + columnstatus.size());

        List<Date> obtainedList = new ArrayList<Date>();

        String date;
        for (WebElement we : columnstatus) {
            date = we.getText();

            int Date = Integer.parseInt(date.replaceAll("\\D.*", ""));
            SimpleDateFormat dateFormatter
                    = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
            Date Date1 = null;
            try {
                Date1 = dateFormatter.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            obtainedList.add(Date1);
        }
        ArrayList<Date> sortedList = new ArrayList<>();

        for (Date s : obtainedList) {
            sortedList.add(s);
        }

        Collections.sort(sortedList, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        reporter.softAssert(sortedList.equals(sortedList), "Date is sorted in asc order", "Date is not sorted in asc order");

    }

    public void clickOnSortTransactionDateAndTimeButton() {
        reporter.softAssert(past7DaysCTA.isDisplayed(), "Past 7 days button is displayed", "Past 7 days button is not displayed");
        // reporter.softAssert(past30DaysCTA.isDisplayed(),"Past 30 days button is displayed","Past 30 days button is not displayed");
        reporter.softAssert(fromDatePicker.isDisplayed(), "to date picker is displayed", "to date picker is not displayed");
        reporter.softAssert(toDatePicker.isDisplayed(), "from date picker is displayed", "from date picker is not displayed");
        getReusableActions().javascriptScrollByVisibleElement(sortByTransactionDate);
        getReusableActions().isElementVisible(sortByTransactionDate);
        getReusableActions().staticWait(3000);
        sortByTransactionDate.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Payment Transaction Date and Time is Sorted in DESC order");
        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[1]"));
        System.out.println("Number of elements:" + columnstatus.size());

        List<Date> obtainedList = new ArrayList<Date>();

        String date;
        for (WebElement we : columnstatus) {
            date = we.getText();

            int Date = Integer.parseInt(date.replaceAll("\\D.*", ""));
            SimpleDateFormat dateFormatter
                    = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
            Date Date1 = null;
            try {
                Date1 = dateFormatter.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            obtainedList.add(Date1);
        }
        ArrayList<Date> sortedList = new ArrayList<>();

        for (Date s : obtainedList) {
            sortedList.add(s);
        }

        Collections.sort(sortedList, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
        Collections.sort(sortedList);

        reporter.softAssert(sortedList.equals(sortedList), "Date is sorted in Desc order", "Date is not sorted in desc order");

        sortByTransactionDate.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Transaction Date is sorted by Desc order");
    }

    public void validDateFromAndTo() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = ofPattern("MM/dd/uuuu");
        String dateMinus = date.format(formatter);
        toDatePicker.clear();
        getReusableActions().isElementVisible(toDatePicker, 10);
        toDatePicker.sendKeys(dateMinus);
        getReusableActions().clickWhenReady(toDatePicker, 10);
        toDatePicker.sendKeys(Keys.ENTER);
        LocalDate dateToday = LocalDate.now().minusDays(5);
        String dateMonthDay = dateToday.format(formatter);
        fromDatePicker.clear();
        getReusableActions().isElementVisible(fromDatePicker, 10);
        toDatePicker.sendKeys(dateMonthDay);
        fromDatePicker.sendKeys(Keys.ENTER);

    }

    public void clickOnLastUpdatedOnDateAndTimeButton() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(past30DaysCTA);
        past30DaysCTA.click();
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(lastUpdatedOnFilterCTA);
        getReusableActions().isElementVisible(lastUpdatedOnFilterCTA);
        getReusableActions().staticWait(3000);
        lastUpdatedOnFilterCTA.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Last updated on Date and Time is Sorted in DESC order");
        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[3]"));
        System.out.println("Number of elements:" + columnstatus.size());

        List<Date> obtainedList = new ArrayList<Date>();

        String date;
        for (WebElement we : columnstatus) {
            date = we.getText();

            int Date = Integer.parseInt(date.replaceAll("\\D.*", ""));
            SimpleDateFormat dateFormatter
                    = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
            Date Date1 = null;
            try {
                Date1 = dateFormatter.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            obtainedList.add(Date1);
        }
        ArrayList<Date> sortedList = new ArrayList<>();

        for (Date s : obtainedList) {
            sortedList.add(s);
        }

        Collections.sort(sortedList, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
        Collections.sort(sortedList);

        reporter.softAssert(sortedList.equals(sortedList), "last-updated-on Date is sorted in Desc order", "Date is not sorted in desc order");

        lastUpdatedOnFilterCTA.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Last updated on Date is sorted by Desc order");
    }

    public void validateLastUpdatedOnDateAndTime() {

        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[3]"));
        System.out.println("Number of elements:" + columnstatus.size());

        List<Date> obtainedList = new ArrayList<Date>();

        String date;
        for (WebElement we : columnstatus) {
            date = we.getText();

            int Date = Integer.parseInt(date.replaceAll("\\D.*", ""));
            SimpleDateFormat dateFormatter
                    = new SimpleDateFormat("yyyy/MM/dd','HH:mm:ss");
            Date Date1 = null;
            try {
                Date1 = dateFormatter.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            obtainedList.add(Date1);
        }
        ArrayList<Date> sortedList = new ArrayList<>();

        for (Date s : obtainedList) {
            sortedList.add(s);
        }

        Collections.sort(sortedList, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        reporter.softAssert(sortedList.equals(sortedList), "Date is sorted in asc order", "Date is not sorted in asc order");

    }

    public void clickOnSortOrderTypeButton() {
        reporter.softAssert(past7DaysCTA.isDisplayed(), "Past 7 days button is displayed", "Past 7 days button is not displayed");
        reporter.softAssert(past30DaysCTA.isDisplayed(), "Past 30 days button is displayed", "Past 30 days button is not displayed");
        reporter.softAssert(fromDatePicker.isDisplayed(), "to date picker is displayed", "to date picker is not displayed");
        reporter.softAssert(toDatePicker.isDisplayed(), "from date picker is displayed", "from date picker is not displayed");
        getReusableActions().javascriptScrollByVisibleElement(past30DaysCTA);
        getReusableActions().isElementVisible(past30DaysCTA);
        getReusableActions().staticWait(3000);
        past30DaysCTA.click();
        getReusableActions().staticWait(3000);

        getReusableActions().javascriptScrollByVisibleElement(orderTypeOnFilterCTA);
        getReusableActions().isElementVisible(orderTypeOnFilterCTA);
        getReusableActions().staticWait(3000);
        orderTypeOnFilterCTA.click();
        getReusableActions().staticWait(3000);

        reporter.reportLogWithScreenshot("Order Type is Sorted in Alphabetical order");
        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[1]"));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();

        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        reporter.softAssert(sortedList.equals(obtainedList), "Order type is sorted in alphabetical order", "Order type is not sorted in  Alphabetical order");

        orderTypeOnFilterCTA.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Order Type is sorted in Reverse Alphabetical order");
    }

    public void validateOrderTypeTableScreen() {

        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[1]"));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();

        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        reporter.softAssert(sortedList.equals(obtainedList), "Transaction type is sorted in Reverse alphabetical order", "Transaction type is not sorted in  Alphabetical order");

    }

    public void clickOnStatusOrderTypeButton() {
        reporter.softAssert(past7DaysCTA.isDisplayed(), "Past 7 days button is displayed", "Past 7 days button is not displayed");
        reporter.softAssert(past30DaysCTA.isDisplayed(), "Past 30 days button is displayed", "Past 30 days button is not displayed");
        reporter.softAssert(fromDatePicker.isDisplayed(), "to date picker is displayed", "to date picker is not displayed");
        reporter.softAssert(toDatePicker.isDisplayed(), "from date picker is displayed", "from date picker is not displayed");
        //  getReusableActions().javascriptScrollByVisibleElement(past30DaysCTA);
        //getReusableActions().isElementVisible(past30DaysCTA);
        //getReusableActions().staticWait(3000);
        //past30DaysCTA.click();
        getReusableActions().staticWait(3000);
        //selectFilter.click();
        channelTypeFilterButton.click();
        reporter.softAssert(channelTypeFilterButton.isDisplayed(), "channelFilter is displayed", "channelFilter is not displayed");
        reporter.softAssert(applyFilterButton.isDisplayed(), "ApplyFilter button is displayed", "ApplyFilter button not displayed");
        getReusableActions().clickWhenReady(applyFilterButton, 200);
        applyFilterButton.click();

        getReusableActions().javascriptScrollByVisibleElement(statusOrderTableButton);
        getReusableActions().isElementVisible(statusOrderTableButton);
        getReusableActions().staticWait(3000);
        statusOrderTableButton.click();
        getReusableActions().staticWait(3000);

        reporter.reportLogWithScreenshot("Status Type is Sorted in Alphabetical order");
        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[5]"));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();

        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        reporter.softAssert(sortedList.equals(obtainedList), "Order type is sorted in alphabetical order", "Order type is not sorted in  Alphabetical order");

        statusOrderTableButton.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Order Type is sorted in Reverse Alphabetical order");
    }

    public void validateOrderStatusTableScreen() {

        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[5]"));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();

        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        // Collections.reverse(sortedList);
        reporter.softAssert(sortedList.equals(obtainedList), "Status is sorted in Reverse alphabetical order", "Status is not sorted in  Alphabetical order");

    }

    public String validateSearchRecordCount(String columnNamelist, String columnName) {
        String[] strArray = columnNamelist.split(";");
        for (int i = strArray.length - 1; i > 0; i--) {
            if (strArray[i].toUpperCase().contains(columnName.toUpperCase())) {
                columnName = strArray[i];
                System.out.println(columnName);
                break;
            }
        }
        String tableColumnOptionXpath = "//button[contains(text(),'" + columnName + "')]";
        System.out.println(tableColumnOptionXpath);
        WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
        getReusableActions().javascriptScrollByVisibleElement(tableColumnOption);
        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(1000);
        //tableColumnOption.click();
        String columnXpath = getColumnElementXpath(columnName);
        List<WebElement> columnstatus = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus.size());
        return Integer.toString(columnstatus.size());
    }

    public void validateRecordsListedBasedOnOrderType() {
        getReusableActions().javascriptScrollByVisibleElement(autoPayEnrollCrossBtn);
        System.out.println(autoPayEnrollCrossBtn.getText());
        reporter.softAssert(autoPayEnrollCrossBtn.getText().equals("Auto-Pay Enrollment"), "Auto-Pay Enrollment Records displayed", "Auto-Pay Enrollment Records not displayed");
        getReusableActions().staticWait(2000);
        autoPayEnrollCrossBtn.click();
    }

    public void validatesubmitedOnColumn() {
        getReusableActions().javascriptScrollByVisibleElement(submittedOnFilterCTA);
        submittedOnFilterCTA.click();
        getReusableActions().staticWait(3000);

        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[2]"));
        System.out.println("Number of elements:" + columnstatus.size());

        SimpleDateFormat dateFormatter
                = new SimpleDateFormat("yyyy/MM/dd','HH:mm:ss");


        List<Date> rawList = columnstatus.stream().map(i -> i.getText().trim()).map(i -> {
            try {
                return dateFormatter.parse(i);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());

        System.out.println("rawlist  " + rawList);

        List<Date> sortedlist = rawList.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedlist " + sortedlist);
        reporter.softAssert(rawList.equals(sortedlist), "", "");
    }

    public void validateOrderTypeColumn() {

        List<WebElement> orderTypeColumn = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[1]"));
        String beforeSort[] = new String[orderTypeColumn.size()];

        for (int i = 0; i < orderTypeColumn.size(); i++) {

            beforeSort[i] = orderTypeColumn.get(i).getText().trim();
            System.out.println(beforeSort[i]);

        }
        System.out.println("=======BeforeSort=========");

        for (int i = 0; i < orderTypeColumn.size(); i++) {
            Arrays.sort(beforeSort);
            String sort = beforeSort[i];
            System.out.println(sort);
        }
        System.out.println("---------------------");

        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(orderTypeOnFilterCTA);
        orderTypeOnFilterCTA.click();
        getReusableActions().staticWait(2000);

        orderTypeColumn = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[1]"));
        String afterSort[] = new String[orderTypeColumn.size()];

        for (int i = 0; i < orderTypeColumn.size(); i++) {

            afterSort[i] = orderTypeColumn.get(i).getText().trim();

            System.out.println(afterSort[i]);
        }
        System.out.println("=========after sort=======");

        reporter.softAssert(!beforeSort.equals(afterSort), "sorting done successfully", "sorting not done successfully");
    }

    public void clickOnTransactionTypeButton() {
        getReusableActions().isElementVisible(transactionTypeButton);
        reporter.softAssert(transactionTypeButton.isDisplayed(), "Transaction type Button Display " + transactionTypeButton.getText(), "Transaction Type Button not display");
        transactionTypeButton.click();
    }

    public void clickOnApplyFilterButton() {
        reporter.softAssert(applyFilterButton.isDisplayed(), "apply filter button display", "apply filter button not display");
        applyFilterButton.click();
    }

    public void clickOnCreditButton() {
        reporter.softAssert(getReusableActions().isElementVisible(creditFilterButton), "credit filter Button dispaly " + creditFilterButton.getText(), "credit filter Button not display");
        getReusableActions().isElementVisible(creditFilterButton);
        creditFilterButton.click();
    }

    public void clickOnDebitButton() {
        reporter.softAssert(getReusableActions().isElementVisible(debitFilterButton), "debit filter Button dispaly " + debitFilterButton.getText(), "debit filter Button not display");
        getReusableActions().isElementVisible(debitFilterButton);
        debitFilterButton.click();
        getReusableActions().staticWait(3000);
    }

    public void validateListOfDebitTransaction() {
        getReusableActions().javascriptScrollToMiddleOfPage();
        List<WebElement> debitTransaction = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[6]"));
        System.out.println(debitTransaction.size());
        boolean flag = true;
        for (WebElement webelement : debitTransaction) {
            if (!webelement.getText().equalsIgnoreCase("Debit")) {
                flag = false;
            }
        }
        // reporter.softAssert( flag,"All transaction are debit","Not all transaction are debit");
        reporter.softAssert(flag, "VALID FIELD - \" All transaction are debit  \" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"  \"", "INVALID : FIELD - \"  \" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \" Not all transaction are debit \"");
    }

    public void validateListOfCreditTransaction() {
        getReusableActions().javascriptScrollToMiddleOfPage();
        List<WebElement> creditTransactionColumn = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[6]"));
        System.out.println(creditTransactionColumn.size());
        boolean flag = true;
        for (WebElement webelement : creditTransactionColumn) {
            if (!webelement.getText().equalsIgnoreCase("Credit")) {
                flag = false;
            }
        }
        reporter.softAssert(flag, "VALID FIELD - \" All transaction are credit  \" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"  \"", "INVALID : FIELD - \"  \" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \" Not all transaction are credit \"");

    }

    public void clickOnAllFilterButton() {
        getReusableActions().staticWait(2000);
        allFilterButton.click();
    }

    public void validateListOfAllTransaction() {
        getReusableActions().javascriptScrollToMiddleOfPage();
        List<WebElement> creditTransactionColumn = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[6]"));
        System.out.println(creditTransactionColumn.size());
        boolean creditflag = false;
        boolean debitflag = false;
        for (WebElement webelement : creditTransactionColumn) {
            if (webelement.getText().equalsIgnoreCase("Credit") && !creditflag) {
                creditflag = true;
            }
            if (webelement.getText().equalsIgnoreCase("debit") && !debitflag) {
                debitflag = true;
            }
        }
        reporter.softAssert(creditflag && debitflag, "VALID FIELD - \" All transaction are credit & debit  \" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"  \"", "INVALID : FIELD - \"  \" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \" Not all transaction are credit & debit \"");
    }

    public void validateChangeSortByTime() {
        getReusableActions().javascriptScrollByVisibleElement(sortByTime);
        reporter.softAssert(getReusableActions().isElementVisible(sortByTime), "element is visible : " + sortByTime.getText(), "time column not visible");
        List<WebElement> timeFormate = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[1]"));
        String beforeSort[] = new String[timeFormate.size()];
        for (int i = 0; i < timeFormate.size(); i++) {
            beforeSort[i] = timeFormate.get(i).getText().split(",")[1];
            System.out.println(beforeSort[i]);
        }
        for (int i = 0; i < timeFormate.size(); i++) {
            Arrays.sort(beforeSort);
            String sort = beforeSort[i];
            System.out.println(sort);
        }
        getReusableActions().staticWait(3000);
        sortByTime.click();
        getReusableActions().staticWait(3000);

        System.out.println("========After Sort===========");

        String afterSort[] = new String[timeFormate.size()];
        for (int i = 0; i < timeFormate.size(); i++) {
            afterSort[i] = timeFormate.get(i).getText().split(",")[1];
            System.out.println(afterSort[i]);
        }
        reporter.softAssert(!beforeSort.equals(afterSort), "sorting done successfully", "sorting not done successfully");
    }

    public void validateChangeSortByCode() {
        getReusableActions().javascriptScrollByVisibleElement(sortByCode);
        reporter.softAssert(getReusableActions().isElementVisible(sortByCode), "element is visible : " + sortByCode.getText(), "code column not visible");
        List<WebElement> sortCode = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[3]"));
        String beforeSort[] = new String[sortCode.size()];
        for (int i = 0; i < sortCode.size(); i++) {
            beforeSort[i] = sortCode.get(i).getText();
            System.out.println(beforeSort[i]);
        }
        for (int i = 0; i < sortCode.size(); i++) {
            Arrays.sort(beforeSort);
            String sort = beforeSort[i];
            System.out.println(sort);
        }
        getReusableActions().staticWait(3000);
        sortByCode.click();
        getReusableActions().staticWait(3000);

        System.out.println("========After Sort===========");

        String afterSort[] = new String[sortCode.size()];
        for (int i = 0; i < sortCode.size(); i++) {
            afterSort[i] = sortCode.get(i).getText();
            System.out.println(afterSort[i]);
        }
        reporter.softAssert(!beforeSort.equals(afterSort), "sorting done successfully", "sorting not done successfully");
    }

    public void validateDateAndTimeColSorting() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollToMiddleOfPage();
        getReusableActions().staticWait(2000);
        SimpleDateFormat dateFormatter
                = new SimpleDateFormat("yyyy/MM/dd','HH:mm:ss");
        List<Date> listOfDates = dateAndTimeColElementList.stream().map(i -> i.getText().trim()).map(i -> {
            try {
                return dateFormatter.parse(i);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());

        List<Date> sortedDescListOfDates = listOfDates.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        for (Date i : listOfDates) {
            System.out.println("date raw==-> " + i);
        }
        for (Date i : sortedDescListOfDates) {
            System.out.println("date Sorted in descending ==-> " + i);
        }
        getReporter().softAssert(listOfDates.equals(sortedDescListOfDates), "VALID FIELD - \"" + sortedDescListOfDates.stream().map(i -> {
            System.out.println(i);
            return null;
        }) + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + listOfDates.stream().map(i -> {
            System.out.println(i);
            return null;
        }) + "\"", "INVALID : FIELD - \"" + sortedDescListOfDates.stream().map(i -> {
            System.out.println(i);
            return null;
        }) + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + listOfDates.stream().map(i -> {
            System.out.println(i);
            return null;
        }) + "\"");
        //reporterSnapshot();
    }

    public void validateNoOfReportLine() {
        //dateAndTimeColElementList
        getReusableActions().staticWait(2000);
        getReporter().softAssert(dateAndTimeColElementList.size() >= 20, "Service reply is more than 20 report line", "Service reply is not more than 20 report line");
    }

    public void validatePaginationButtons() {
        getReusableActions().javascriptScrollToBottomOfPage();
        WebElement optionPerPage = getDriver().findElement(By.xpath("//option[@value='5']"));
        optionPerPageDropDown.isDisplayed();
        optionPerPageDropDown.click();
        getReusableActions().staticWait(1000);
        optionPerPage.click();
        getReusableActions().staticWait(1000);
        Integer noOfPages = navButtons_Pages.size();
        if (noOfPages > 1) {
            //Validate first page and previous page button
            for (int i = 0; i < 2; i++) {

                //Click the last page
                navButtons_Pages.get(noOfPages - 1).click();

                if (navButtons.get(i).isEnabled() == true) {
                    getReusableActions().staticWait(3000);
                    navButtons.get(i).click();
                    getReusableActions().staticWait(3000);
                    reporterSnapshot(navButtons.get(i), navButtons.get(i).getText(), navButtons.get(i).getText(), "DISPLAY");
                    reporterSnapshot(navButtons.get(i), "Navigation Button" + navButtons.get(i).getText(), "", "Null");
                }
            }
            //Validate last page  and next page button
            for (int i = 2; i < 4; i++) {
                //Click the first page
                navButtons_Pages.get(0).click();

                // reporter.softAssert(i.isDisplayed(),"Navigation Button "+i.getAttribute("class").substring(0,5)+" has been validated successfully","Navigation Button "+i.getAttribute("class").substring(0,5)+" has not been validated successfully");
                if (navButtons.get(i).isEnabled() == true) {
                    getReusableActions().staticWait(3000);
                    navButtons.get(i).click();
                    getReusableActions().staticWait(3000);
                    reporterSnapshot(navButtons.get(i), navButtons.get(i).getText(), navButtons.get(i).getText(), "DISPLAY");
                    reporterSnapshot(navButtons.get(i), "Navigation Button" + navButtons.get(i).getText(), "", "Null");
                }
            }
            // Validate record pages
            for (WebElement j : navButtons_Pages) {
                if (j.isEnabled() == true) {
                    getReusableActions().staticWait(3000);
                    j.click();
                    getReusableActions().staticWait(3000);
                    reporterSnapshot(j, j.getText(), j.getText(), "DISPLAY");
                    reporterSnapshot(j, "Navigation Button" + j.getText(), "", "Null");
                }
            }

        } else {
            reporterSnapshot(navButtons_Pages.get(0), "no Of Pages" + navButtons_Pages.size(), "", "Null");
            //Validate button with page nos
            for (WebElement i : navButtons) {
                // reporter.softAssert(i.isDisplayed(),"Navigation Button "+i.getAttribute("class").substring(0,5)+" has been validated successfully","Navigation Button "+i.getAttribute("class").substring(0,5)+" has not been validated successfully");
                if (i.isEnabled() == true) {
                    getReusableActions().staticWait(3000);
                    i.click();
                    getReusableActions().staticWait(3000);
                    reporterSnapshot(i, i.getText(), i.getText(), "DISPLAY");
                    reporterSnapshot(i, "Navigation Button" + i.getText(), "", "Null");
                }

            }

        }
    }


    public void validateNonZeroTransactionsOnly() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(nonZeroTransactionsCheckBox);
        nonZeroTransactionsCheckBox.click();
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollToMiddleOfPage();

    }

    public void validateApplyFilterButtonRetail(String StrExpFilterValue) {
        int columnSize = getDriver().findElements(By.xpath("//ds-modal/div[2]/div[1]/div/div[1]/div/ds-tag-checkbox/label")).size();
        for (int i = 1; i < columnSize + 1; i++) {
            String strExpValue = getDriver().findElement(By.xpath("//ds-modal/div[2]/div[1]/div/div[1]/div[" + i + "]/ds-tag-checkbox/label/input")).getAttribute("name");
            System.out.println("strExpValue - " + strExpValue);
            System.out.println("columnSize - " + columnSize);
            if (strExpValue.equalsIgnoreCase(StrExpFilterValue)) {
                getDriver().findElement(By.xpath("//ds-modal/div[2]/div[1]/div/div[1]/div[" + i + "]/ds-tag-checkbox/label")).click();
                break;
            }
        }
        reporterSnapshot(applyFilterButton, StrExpFilterValue, "", "display");
        getReusableActions().clickWhenReady(applyFilterButton, 200);
        getReusableActions().staticWait(3000);
    }

    public void clickOnClearFilterBtn() {
        if (clearFilterBtn.isDisplayed())
            getReusableActions().clickWhenReady(clearFilterBtn, 200);
    }

    public void navigateTo(String options) {
        getReusableActions().staticWait(3000);
        int setSize = getDriver().getWindowHandles().size();
        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(setSize - 1));
        for (int i = 0; i <= 5; i++) {
            getReusableActions().staticWait(3000);
            String reportTabXpath = "//button[@id='ds-tabs-0-tab-" + i + "']";
            System.out.println(reportTabXpath);
            if (getDriver().findElements(By.xpath(reportTabXpath)).size() > 0) {
                String strExpVal = getDriver().findElement(By.xpath(reportTabXpath)).getAttribute("aria-label").replace(" ", "");
                System.out.println(strExpVal);
                if (strExpVal.toUpperCase().contains(options.toUpperCase().replace(" ", ""))) {
                    getDriver().findElement(By.xpath(reportTabXpath)).click();
                    getReusableActions().staticWait(3000);
                    reporterSnapshot(getDriver().findElement(By.xpath(reportTabXpath)), "ds-color-misty", options, "class");
                    break;
                }
            } else
                break;
        }
    }

    public void validate30DaysSelected() {
        getReusableActions().staticWait(4000);
        getReusableActions().isElementVisible(past30DaysCTA);
        getReusableActions().executeJavaScriptClick(past30DaysCTA);
        //past30DaysCTA.click();
        reporterSnapshot(past30DaysCTA, "PAST 30 DAYS", "", "DISPLAY");
    }


    public void validateCrossButton() {
        //reporter.softAssert(crossButton.isDisplayed(), "cross button is displayed", "cross button not displayed");
        reporterSnapshot(crossButton, "Cross Button", "", "display");
        crossButton.click();
    }

    public void validateRangeOfDateRecordValueTarget(String columnNamelist, String columnName, int days) {
        getReusableActions().staticWait(5000);
        String[] strArray = columnNamelist.split(";");
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].toUpperCase().contains(columnName.toUpperCase())) {
                columnName = strArray[i];
                System.out.println("columnName - " + columnName);
                break;
            }
        }
        String tableColumnOptionXpath = "//button[contains(text(),'" + columnName + "')]";
        System.out.println(tableColumnOptionXpath);
        getReusableActions().staticWait(3000);
        WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
        getReusableActions().javascriptScrollByVisibleElement(tableColumnOption);
        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(3000);
        String columnXpath = getColumnElementXpath(columnName);
        System.out.println("columnXpath:" + columnXpath);
        List<WebElement> columnstatus = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();
        //getReusableActions().javascriptScrollByVisibleElement(exportToPDFCTA);
        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText().toUpperCase());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        String higherDateMonth = sortedList.get(0).split(" ")[0];
        System.out.println("HigherDate*** " + higherDateMonth);
        Collections.reverse(sortedList);
        String lowerDateMonth = sortedList.get(0).split(" ")[0];
        System.out.println("lowerDate**** " + lowerDateMonth);
        LocalDate lowerDate = parse(lowerDateMonth.replace(",",""), ofPattern("yyyy/MM/dd"));
        LocalDate higherDate = parse(higherDateMonth.replace(",",""), ofPattern("yyyy/MM/dd"));
        LocalDate TodaysDate = LocalDate.now();
        System.out.println("todays date is " + TodaysDate);
        LocalDate rangeStartDate = TodaysDate.minusDays(days);
        System.out.println("range start date**** " + rangeStartDate);
        reporter.softAssert(lowerDate.isAfter(rangeStartDate.minusDays(1)), "VALID FIELD - \"" + rangeStartDate.minusDays(1) + "\" ARE EQUAL OR LESS VALUE WITH ACTUAL VALUE", "INVALID : FIELD - \"" + rangeStartDate + "\" ARE NOT EQUAL OR GREATER VALUE WITH ACTUAL VALUE");
        reporter.softAssert(higherDate.isBefore(TodaysDate.plusDays(1)), "VALID FIELD - \"" + TodaysDate.plusDays(1) + "\" ARE EQUAL OR LESS VALUE WITH ACTUAL VALUE", "INVALID : FIELD - \"" + rangeStartDate + "\" ARE NOT EQUAL OR GREATER VALUE WITH ACTUAL VALUE");
    }

    public void validateSortByTextButtonTarget(String columnNamelist, String columnName) {
        getReusableActions().staticWait(5000);
        String[] strArray = columnNamelist.split(";");
        for (int i = 0; i <= strArray.length - 1; i++) {
            if (strArray[i].toUpperCase().contains(columnName.toUpperCase())) {
                columnName = strArray[i];
                System.out.println("columnName - " + columnName);
                break;
            }
        }

        String tableColumnOptionXpath = "//button[contains(text(),'" + columnName + "')]";
        System.out.println("tableColumnOptionXpath - " + tableColumnOptionXpath);
        WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
        getReusableActions().javascriptScrollByVisibleElement(tableColumnOption);
        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(3000);
        tableColumnOption.click();
        getReusableActions().staticWait(5000);

        String columnXpath = getColumnElementXpath1(columnName);
        System.out.println(columnXpath);
        List<WebElement> columnstatus = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();
        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText());
            System.out.println("Application - " + we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        //System.out.println("sortedlist"+sortedList);
        reporter.softAssert(sortedList.equals(obtainedList), "VALID FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER MATCHED WITH EXPECTED AND ACTUAL VALUE ", "INVALID : FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER NOT MATCHED WITH EXPECTED AND ACTUAL VALUE");
        tableColumnOption.click();
        getReusableActions().staticWait(3000);

        List<WebElement> columnstatus1 = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus1.size());
        ArrayList<String> obtainedList1 = new ArrayList<>();
        for (WebElement we : columnstatus1) {
            obtainedList1.add(we.getText());
            //System.out.println("Application - " + we.getText());
        }
        ArrayList<String> sortedList1 = new ArrayList<>();
        for (String s : obtainedList1) {
            sortedList1.add(s);
        }
        Collections.sort(sortedList1);
        Collections.reverse(sortedList1);
        //System.out.println("sortedlist"+sortedList1);
        //System.out.println("obtainedList1"+obtainedList1);
        reporter.softAssert(sortedList1.equals(obtainedList1), "VALID FIELD - \"" + columnName.toUpperCase() + "\" DESCENDING ORDER MATCHED WITH EXPECTED AND ACTUAL VALUE ", "INVALID : FIELD - \"" + columnName.toUpperCase() + "\" DESCENDING ORDER NOT MATCHED WITH EXPECTED AND ACTUAL VALUE");
    }

    public String getColumnElementXpath1(String columnName) {
        String colVal = "";
        String tempcolVal = columnName.replace(" ", "");
        if (tempcolVal.toUpperCase().contains("OFFERCODE"))
            colVal = "1";
        else if (tempcolVal.toUpperCase().contains("DESCRIPTION"))
            colVal = "2";
        else if (tempcolVal.toUpperCase().contains("STATUS"))
            colVal = "3";
        else if (tempcolVal.toUpperCase().contains("ACTIVATEOFFER"))
            colVal = "4";
        else if (tempcolVal.toUpperCase().contains("ADJUSTMENTTYPE"))//TRANSACTIONTYPE
            colVal = "6"; //4 or 6
        else if (tempcolVal.toUpperCase().contains("ACCEPTEDDATE"))
            colVal = "5";
        else if (tempcolVal.toUpperCase().contains("STARTDATE"))
            colVal = "6";
        String columnXpath = "//table[@role='table']/tbody/tr/td[" + colVal + "]";    //grid
        return columnXpath;
    }

    public void validateRefundButton(){
        clickOnRefundBtn();
        getReusableActions().staticWait(6000);
        reporterSnapshot(refundDetailsRow,"Refund Details ","","DISPLAY");
        reporterSnapshot(refundAmtField,"Refund Amount Field","","ENABLENOT");
        reporterSnapshot(refundAmtMsg,"Refund Amount Message ","","DISPLAY");
        getReusableActions().javascriptScrollByVisibleElement(refundCodeDropdn);
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScriptClick(refundCodeField);
        reporterSnapshot(refundCodeDropdn,"Reason Code Drop Down","","DISPLAY");
        getReusableActions().selectWhenReady(refundCodeDropdn,0,5);
        reporterSnapshot(commentBox,"Comment box","","DISPLAY");
        getReusableActions().javascriptScrollByVisibleElement(refundSummary);
        getReusableActions().staticWait(2000);
        reporterSnapshot(refundSummary,"Refund Summary","","DISPLAY");
        getReusableActions().javascriptScrollByVisibleElement(submitRefundBtn);
        getReusableActions().staticWait(2000);
        reporterSnapshot(submitRefundBtn,"Submit Button","","DISPLAY");
        reporterSnapshot(cancelRefundBtn,"Cancel Button","","DISPLAY");
    }

    public void clickOnActivateCTA() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(activateBtn);
        activateBtn.click();
        getReusableActions().staticWait(3000);
    }

    public void validateActivateCTA() {
        getReusableActions().staticWait(4000);
        reporterSnapshot(currentPlanButton, "PPC Page Display", "", "DISPLAY");
    }

    public void enterFromDateAndToDateValues(String fromDate, String toDate) {
        getReusableActions().isElementVisible(fromDatePicker, 10);
        fromDatePicker.clear();
        getReusableActions().isElementVisible(fromDatePicker, 10);
        fromDatePicker.sendKeys(fromDate);
        getReusableActions().clickWhenReady(fromDatePicker, 10);
        fromDatePicker.sendKeys(Keys.ENTER);
        getReusableActions().staticWait(3000);
        getReusableActions().isElementVisible(toDatePicker, 10);
        toDatePicker.clear();
        getReusableActions().isElementVisible(toDatePicker, 10);
        toDatePicker.sendKeys(toDate);
        getReusableActions().clickWhenReady(toDatePicker, 10);
        toDatePicker.sendKeys(Keys.ENTER);

    }

    public void inputDateToDatePickerFromStartDate(String startDate, String endDate) {
        getReusableActions().isElementVisible(fromDatePicker, 10);
        fromDatePicker.clear();
        getReusableActions().isElementVisible(fromDatePicker, 10);
        fromDatePicker.sendKeys(startDate);
        getReusableActions().clickWhenReady(fromDatePicker, 10);
        fromDatePicker.sendKeys(Keys.ENTER);
        toDatePicker.clear();
        getReusableActions().isElementVisible(toDatePicker, 10);
        toDatePicker.sendKeys(endDate);
        toDatePicker.sendKeys(Keys.ENTER);
        getReusableActions().staticWait(5000);
    }

    public void validateRecordsValueBasedOnColumnFilter(String columnNamelist, String columnName, String strExpColValue) {
        String[] strArray = columnNamelist.split(";");
        for (int i = 0; i < strArray.length - 1; i++) {
            if (strArray[i].toUpperCase().contains(columnName.toUpperCase())) {
                columnName = strArray[i];
                System.out.println(columnName);
                break;
            }
        }
        String tableColumnOptionXpath = "//button[contains(text(),'" + columnName + "')]";
        System.out.println(tableColumnOptionXpath);
        WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
        getReusableActions().javascriptScrollByVisibleElement(tableColumnOption);
        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(1000);
        System.out.println("columnName - " + columnName);
        String columnXpath = getColumnElementXpath(columnName);
        System.out.println("columnXpath - " + columnXpath);
        List<WebElement> columnstatus = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();
        getReusableActions().staticWait(2000);
        //getReusableActions().javascriptScrollByVisibleElement(exportToPDFCTA);
        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText().toUpperCase());
            System.out.println(we.getText().toUpperCase());
        }
        for (String s : obtainedList) {
            if (s.equals(strExpColValue.toUpperCase())) {
                System.out.println("strExpColValue" + strExpColValue.toUpperCase());
                System.out.println("s" + s);
                scrollToMiddleOfElement(getDriver().findElement(By.xpath("(//span[contains(text(),'"+strExpColValue+"')])[1]")));
                getReusableActions().staticWait(1000);
                reporterSnapshot(tableColumnOption, strExpColValue, s, "Compare");
                break;
            }
        }
    }

    public void validateSortByDateButtonTarget(String columnNamelist, String columnName) {
        getReusableActions().staticWait(5000);
        String[] strArray = columnNamelist.split(";");
        for (int i = 0; i <= strArray.length - 1; i++) {
            if (strArray[i].contains(columnName)) {
                columnName = strArray[i];
                break;
            }
        }

        String tableColumnOptionXpath = "//button[contains(text(),'" + columnName + "')]";
        WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
        getReusableActions().javascriptScrollByVisibleElement(tableColumnOption);
        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(3000);
        tableColumnOption.click();
        getReusableActions().staticWait(5000);

        String columnXpath = getColumnElementXpath1(columnName);
        List<WebElement> columnstatus = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus.size());
        List<Date> obtainedList = new ArrayList<Date>();
        String date;
        for (WebElement we : columnstatus) {
            date = we.getText();
            int Date = Integer.parseInt(date.replaceAll("\\D.*", ""));
            SimpleDateFormat dateFormatter
                    = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
            Date Date1 = null;
            try {
                Date1 = dateFormatter.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            obtainedList.add(Date1);
        }
        ArrayList<Date> sortedList = new ArrayList<>();
        for (Date s : obtainedList) {
            sortedList.add(s);
        }

        Collections.sort(sortedList, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
        Collections.sort(sortedList);
        System.out.print("sortedList-" + sortedList);
        System.out.print("obtainedList-" + obtainedList);
        reporter.softAssert(sortedList.equals(obtainedList), "VALID FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER MATCHED WITH EXPECTED AND ACTUAL VALUE ", "INVALID : FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER NOT MATCHED WITH EXPECTED AND ACTUAL VALUE");
        tableColumnOption.click();
        getReusableActions().staticWait(3000);

        List<WebElement> columnstatus1 = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus1.size());
        List<Date> obtainedList1 = new ArrayList<Date>();

        String date1;
        for (WebElement we : columnstatus) {
            date1 = we.getText();

            int Date = Integer.parseInt(date1.replaceAll("\\D.*", ""));
            SimpleDateFormat dateFormatter
                    = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
            Date Date1 = null;
            try {
                Date1 = dateFormatter.parse(date1);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            obtainedList.add(Date1);
        }
        ArrayList<Date> sortedList1 = new ArrayList<>();

        for (Date s : obtainedList1) {
            sortedList1.add(s);
        }

        Collections.sort(sortedList1, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
        Collections.sort(sortedList1);
        Collections.reverse(sortedList1);
        //System.out.println("sortedlist"+sortedList1);
        //System.out.println("obtainedList1"+obtainedList1);
        reporter.softAssert(sortedList1.equals(obtainedList1), "VALID FIELD - \"" + columnName.toUpperCase() + "\" DESCENDING ORDER MATCHED WITH EXPECTED AND ACTUAL VALUE ", "INVALID : FIELD - \"" + columnName.toUpperCase() + "\" DESCENDING ORDER NOT MATCHED WITH EXPECTED AND ACTUAL VALUE");
    }

    public void validateSortByCurrencyButton(String columnNamelist, String columnName) {
        String[] strArray = columnNamelist.split(";");
        for (int i = 0; i <= strArray.length - 1; i++) {
            if (strArray[i].toUpperCase().contains(columnName.toUpperCase())) {
                columnName = strArray[i];
                System.out.println("columnName - " + columnName);
                break;
            }
        }

        String tableColumnOptionXpath = "//button[contains(text(),'" + columnName + "')]";
        System.out.println("tableColumnOptionXpath - " + tableColumnOptionXpath);
        WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
        getReusableActions().javascriptScrollByVisibleElement(tableColumnOption);
        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(3000);
        tableColumnOption.click();
        getReusableActions().staticWait(5000);

        String columnXpath = getColumnElementXpath(columnName);
        System.out.println(columnXpath);
        List<WebElement> columnstatus = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus.size());
        /*ArrayList<String> obtainedList = new ArrayList<>();
        for (WebElement we : columnstatus) {
            String trimmedText = we.getText().replace("$", "").replaceAll("[\n\r]", "").replaceFirst("[/.]", "").trim();
            obtainedList.add(we.getText().replace("$", "").replaceAll("[\n\r]", "").replaceFirst("[/.]", "").trim());
            System.out.println("Application - " + we.getText());
            System.out.println("Application1 - " + we.getText().replace("$", "").replaceFirst("[/.]", "").trim());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }*/
        ArrayList<Integer> obtainedList = new ArrayList<>();
        for (WebElement we : columnstatus) {
            String text = we.getText();
            System.out.println("Application - " + text);
            String trimmedText = we.getText().replace("$", "").replaceAll("[\n\r]", "").replaceFirst("[/.]", "").trim();
            System.out.println("Application1 - " + trimmedText);
            obtainedList.add(Integer.valueOf(trimmedText));
        }
        ArrayList<Integer> sortedList = new ArrayList<>();
        for (Integer s : obtainedList) {
            sortedList.add(s);
        }

        Collections.sort(sortedList);
        //System.out.println("sortedlist"+sortedList);
        System.out.println("sortedlist" + sortedList);
        System.out.println("obtainedList1" + obtainedList);
        reporter.softAssert(sortedList.equals(obtainedList), "VALID FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER MATCHED WITH EXPECTED AND ACTUAL VALUE ", "INVALID : FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER NOT MATCHED WITH EXPECTED AND ACTUAL VALUE");
        tableColumnOption.click();
        getReusableActions().staticWait(3000);

        List<WebElement> columnstatus1 = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus1.size());
        ArrayList<Integer> obtainedList1 = new ArrayList<>();
        for (WebElement we : columnstatus1) {
            String text = we.getText();
            System.out.println("Application - " + text);
            String trimmedText = we.getText().replace("$", "").replaceAll("[\n\r]", "").replaceFirst("[/.]", "").trim();
            System.out.println("Application1 - " + trimmedText);
            obtainedList1.add(Integer.valueOf(trimmedText));
        }
        ArrayList<Integer> sortedList1 = new ArrayList<>();
        for (Integer s : obtainedList1) {
            sortedList1.add(s);
        }
        Collections.sort(sortedList1);
        Collections.reverse(sortedList1);
        System.out.println("sortedlist" + sortedList1);
        System.out.println("obtainedList1" + obtainedList1);
        reporter.softAssert(sortedList1.equals(obtainedList1), "VALID FIELD - \"" + columnName.toUpperCase() + "\" DESCENDING ORDER MATCHED WITH EXPECTED AND ACTUAL VALUE ", "INVALID : FIELD - \"" + columnName.toUpperCase() + "\" DESCENDING ORDER NOT MATCHED WITH EXPECTED AND ACTUAL VALUE");
    }

    public void validateFiltersAccountHistoryPage() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(past7DaysCTA);
        reporterSnapshot(past7DaysCTA, "past 7 Days", "", "Display");
        reporterSnapshot(past30DaysCTA, "past 30 Days", "", "Display");
        reporterSnapshot(fromDatePicker, "From date", "", "Display");
        reporterSnapshot(toDatePicker, "To date", "", "Display");
        //reporterSnapshot(transactionTypeButton, "Transaction Type", "", "Display");
        reporterSnapshot(accountBalance, "Account balance", "", "Display");
        reporterSnapshot(exportToPDFCTA, "Download PDF", "", "Display");

    }

    public long getAccountHistotyLatestDateAndTime(String columnNameList, String columnName) {
        String[] strArray = columnNameList.split(";");
        for (int i = 0; i < strArray.length - 1; i++) {
            if (strArray[i].toUpperCase().contains(columnName.toUpperCase())) {
                columnName = strArray[i];
                System.out.println(columnName);
                break;
            }
        }
        getReusableActions().staticWait(2000);
        String tableColumnOptionXpath = "//button[contains(text(),'" + columnName + "')]";
        WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
        getReusableActions().javascriptScrollByVisibleElement(tableColumnOption);
        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(5000);

        String columnXpath = getColumnElementXpath(columnName);
        System.out.println(columnXpath);
        List<WebElement> columnstatus = getDriver().findElements(By.xpath(columnXpath));// "//table[@role='table']/tbody/tr/td[1]"
        System.out.println("Number of elements:" + columnstatus.size());
        System.out.println(columnstatus);
        String latest = columnstatus.get(1).getText();
        System.out.println(latest);
        String plainDate = latest.replaceAll("[^a-zA-Z0-9]", "");
        long dateAndTime = Long.parseLong(plainDate);
        System.out.println(dateAndTime);
        return dateAndTime;

    }

    public void validateTimezoneTransformation(long reciptTime, long accountHryTime) {
        getReusableActions().staticWait(2000);
        long difference = accountHryTime - reciptTime;
        if (difference <= 100) {
            System.out.println(difference);
            reporterSnapshot(dateAndTimeColElementList.get(0), "Timezone Transformation", "", "DISPLAY");
        }
    }

    public void validateTargetedOfferStatus (String columnNameList,String columnName,String text) {
        getReusableActions().staticWait(5000);
        String[] strArray = columnNameList.split(";");
        for (int i = 0; i < strArray.length - 1; i++) {
            if (strArray[i].toUpperCase().contains(columnName.toUpperCase())) {
                columnName = strArray[i];
                System.out.println(columnName);
                break;
            }
        }
        getReusableActions().staticWait(2000);
        String tableColumnOptionXpath = "//button[contains(text(),'" + columnName + "')]";
        WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
        getReusableActions().javascriptScrollByVisibleElement(tableColumnOption);
        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(5000);

        String columnXpath = getColumnElementXpath1(columnName);
        System.out.println(columnXpath);
        List<WebElement> columnstatus = getDriver().findElements(By.xpath(columnXpath));// "//table[@role='table']/tbody/tr/td[1]"
        System.out.println("Number of elements:" + columnstatus.size());
        //System.out.println(columnstatus);
        String statusClmText = columnstatus.get(0).getText();
        System.out.println(statusClmText);
        System.out.println(text);
        reporterSnapshot(columnstatus.get(0),text,statusClmText,"COMPARE1");
//        if (text.contains(statusClmText)) {
//            reporterSnapshot(columnstatus.get(0), statusClmText, "", "Display");
//        }
    }
    public void validateDownloadPdfHidden () {
        getReusableActions().javascriptScrollToBottomOfPage();
        List<WebElement> elementsList= getDriver().findElements(By.xpath("//span[contains(text(),'Download')]"));
        int noOfElement=elementsList.size();
        System.out.println(noOfElement);
        boolean result =false;
        if (noOfElement==0){
            result=true;
        }
        //reporterSnapshot(elementsList.get(0),"Download PDF CTA ","","NotDisplay");
        reporter.softAssert(result,"DOWNLOAD PDF CTA NOT DISPLAY SUCCESSFULLY","DOWNLOAD PDF CTA DISPLAY");
        getReusableActions().javascriptScrollToMiddleOfPage();
        getReusableActions().staticWait(2000);
        reporterSnapshot(null,"Download PDF", String.valueOf(
                exportToPDFCTAList ==null ? 0 : exportToPDFCTAList.size()), "HIDDEN");
    }
    public void validateAdjustmentTabHidden(){
        getReusableActions().staticWait(2000);
        reporterSnapshot(null, "Adjustment Tab ", String.valueOf(
                adjustmentTabList == null ? 0 : adjustmentTabList.size()), "HIDDEN");
    }

    public void validateCareAgentTargetedOfferColumnData(String columnNamelist,String columnName,String expText ){
        getReusableActions().staticWait(5000);
        List<String> clmNameList = new ArrayList<>();
        String[] strArray1 = columnName.split(";");
        String[] strArray = columnNamelist.split(";");
        for (int j=0;j<strArray1.length;j++){
            for (int i = 0; i < strArray.length - 1; i++) {
                if (strArray[i].toUpperCase().contains(strArray1[j].toUpperCase())) {
                    clmNameList.add(strArray[i]);
                    System.out.println(strArray[i]);
                    break;
                }
            }
        }
        String tableColumnOptionXpath = "//button[contains(text(),'" + clmNameList.get(0) + "')]";
        System.out.println(tableColumnOptionXpath);
        WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
        getReusableActions().javascriptScrollByVisibleElement(tableColumnOption);
        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(1000);
        System.out.println("columnName - " + clmNameList.get(0));
        List<String> allcolumnXpath = new ArrayList<>();
        for (int i=0;i<clmNameList.size();i++){
            allcolumnXpath.add(getColumnElementXpath(clmNameList.get(i)));// getColumnElementXpath for ORDER //getColumnElementXpath1 FOR targetted
            System.out.println("AllcolumnXpath - " + allcolumnXpath.get(i));
        }
        List<WebElement> columnstatus1 = getDriver().findElements(By.xpath(allcolumnXpath.get(0)));
        System.out.println("Number of elements:" + columnstatus1.size());
        List<WebElement> columnstatus2 = getDriver().findElements(By.xpath(allcolumnXpath.get(1)));
        System.out.println("Number of elements:" + columnstatus2.size());
        List<String> expTextList = new ArrayList<>();
        String[] expTextArray = expText.split(";");
        for (int i = 0; i < expTextArray.length ; i++) {
            expTextList.add(expTextArray[i]);
            System.out.println(expTextArray[i]);
        }
        int otherStsCount=0; int expectedstsCount=0;
        for (int i=0;i<columnstatus1.size();i++) {
            System.out.println("columnstatus1 - " + columnstatus1.get(i).getText());
            if ((columnstatus1.get(i).getText()).contains(expTextList.get(0))) {
                expectedstsCount=expectedstsCount+1;
                System.out.println("columnstatus2 - " + columnstatus2.get(i).getText());
                if(expTextList.get(1).equals("Null")) {//
                    if (columnstatus2.get(i).getText().length() == 0) {
                        reporterSnapshot(columnstatus2.get(i), clmNameList.get(1) + " Column Blank For " + expTextList.get(0), "", "NULL");
                    }
                }
                if((columnstatus2.get(i).getText()).contains(expTextList.get(1))){
                    reporterSnapshot(columnstatus2.get(i), clmNameList.get(1) + "Column Not Blank For " + expTextList.get(0), "", "NULL");
                }
            }else{
                otherStsCount=otherStsCount+1;
            }
        }
        System.out.println("Expected Status Count - "+expectedstsCount);
        System.out.println("Other Status Count - "+otherStsCount);
        if(otherStsCount!=0 && expectedstsCount==0){
            System.out.println("Expected Text List - "+expTextList.get(0));
            System.out.println("column1 status Text  - "+columnstatus1.get(0).getText());
            reporterSnapshot(columnstatus1.get(0),expTextList.get(0),columnstatus1.get(0).getText(),"COMPARE1");
            System.out.println("Expected Text List - "+expTextList.get(1));
            System.out.println("column2 status Text  - "+columnstatus2.get(0).getText());
            reporterSnapshot(columnstatus2.get(0),expTextList.get(1),columnstatus2.get(0).getText(),"COMPARE1");
        }
    }

    public void validateFromToDate(int days, String expCondtion) {
        if (expCondtion.equals("Greater")) {
            inputDateToDatePicker(days);
            getReusableActions().staticWait(2000);
            toDatePicker.sendKeys(Keys.ENTER);
            getReusableActions().isElementVisible(errorMessageForFutureDate);
            getReusableActions().javascriptScrollByVisibleElement(toDatePicker);
            reporterSnapshot(errorMessageForFutureDate, "You selected a disabled date", "", "Gen");
        }else if((expCondtion.equals("Equal"))||(expCondtion.equals("Less"))){
            inputDateToDatePicker(days);
            reporterSnapshot(null, "Disabled Date Error Message ", String.valueOf(
                    errorMessageForFutureDateList == null ? 0 : errorMessageForFutureDateList.size()), "HIDDEN");
        }
    }
    public void validateClickExportToPDF() {
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(exportToPDFCTA);
        reporterSnapshot(exportToPDFCTA, "export To PDF", "", "display");
        getReusableActions().executeJavaScriptClick(exportToPDFCTA);
        getReusableActions().staticWait(4000);
    }

    public void inputDateToDatePicker1(int days) {
        // -60 days 07292022
        // -90 days 06292022
        LocalDate date = LocalDate.now().minusDays(days);
        DateTimeFormatter formatter = ofPattern("MM/dd/uuuu");
        String dateMinus = date.format(formatter);
        getReusableActions().isElementVisible(fromDatePicker, 10);
        fromDatePicker.clear();
        getReusableActions().isElementVisible(fromDatePicker, 10);
        fromDatePicker.sendKeys(dateMinus);
        getReusableActions().clickWhenReady(fromDatePicker, 10);
        fromDatePicker.sendKeys(Keys.ENTER);
        //this flow is for the To date picker
        LocalDate dateToday = date.plusDays(89);
        String dateMonthDay = dateToday.format(formatter);
        toDatePicker.clear();
        getReusableActions().isElementVisible(toDatePicker, 10);
        toDatePicker.sendKeys(dateMonthDay);
        getReusableActions().staticWait(5000);
        //getReusableActions().clickWhenReady(toDatePicker,20);
        //toDatePicker.sendKeys(Keys.ENTER);
    }
    public void clickOnRefundBtn(){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(refundBtn);
        getReusableActions().staticWait(3000);
        reporterSnapshot(refundBtn, "Refund Button", "", "display");
        refundBtn.click();
        getReusableActions().staticWait(3000);
    }
    public void validateRefundDropdn(String firstoption){
        //clickOnRefundBtn();
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollToTopOfPage();
        //getReusableActions().javascriptScrollByVisibleElement(refundCodeDropdn);
        getReusableActions().staticWait(3000);
        //refundCodeField.click();
        getReusableActions().executeJavaScriptClick(refundCodeField);
        getReusableActions().selectWhenReady(refundCodeDropdn,0,3);
        //   getReusableActions().selectWhenReady(refundCodeDropdn,option,3);
        reporterSnapshot(refundCodeDropdn, firstoption, "", "DROPDOWN");

    }
    public void completeRefundForOrder(String firstoption){
        // clickOnRefundBtn();
        getReusableActions().staticWait(3000);
        //getReusableActions().javascriptScrollToTopOfPage();
        //getReusableActions().javascriptScrollByVisibleElement(refundCodeDropdn);
        //getReusableActions().staticWait(3000);
        //refundCodeField.click();
        getReusableActions().executeJavaScriptClick(refundCodeField);
        getReusableActions().selectWhenReady(refundCodeDropdn,0,3);
        //   getReusableActions().selectWhenReady(refundCodeDropdn,option,3);
        reporterSnapshot(refundCodeDropdn, firstoption, "", "DROPDOWN");
        commentBox.sendKeys("refunding");
           getReusableActions().staticWait(3000);
        submitRefundBtn.click();

    }
    public void clickRefundLessThanAccountBalance(int accountBal){
        int elementIndex=0;//to fetch the refund column button for the same index
        for(WebElement w : getColumnElementList("TotalRefund")){//iterating thorugh the total tax amount column values
            if(Integer.parseInt(w.getText()) <= accountBal){//value should be less than account balance
                System.out.println("total refund balance"+w.getText());
                if(refundBtnList.get(elementIndex).getText().contains("efund")){//break the loop if refund option is available in column 3
                    break;
                }
            }
            elementIndex=elementIndex+1;
            System.out.println(elementIndex);
        }
        scrollToMiddleOfElement(refundBtnList.get(elementIndex));
        getReusableActions().staticWait(1000);
        reporterSnapshot(refundBtnList.get(elementIndex),refundBtnList.get(elementIndex).getText(),"","NULL");
        refundBtnList.get(elementIndex).click();//click the refund button
        System.out.println("button text"+refundBtnList.get(elementIndex).getText());
        getReusableActions().staticWait(3000);
    }
    public void validateRefundSuccessful(){
        getReusableActions().staticWait(9000);
        //reporterSnapshot(submitRefundBtn,"","","NOTDISPLAY");
        //getReusableActions().staticWait(3000);
        reporterSnapshot(refundSuccessfull,"Refund Successfull","","DISPLAY");
    }
    public void clickRefundHigherThanAccountBalance(int accountBal){
        getReusableActions().staticWait(5000);
        System.out.println("ACCOUNT BALANCE == "+accountBal);
        int elementIndex=0;//to fetch the refund column button for the same index
        for(WebElement w : getColumnElementList("TotalRefund")){//iterating through the total tax amount column values

            if(Integer.parseInt(w.getText()) > accountBal){//value should be more than account balance
                System.out.println("total refund balance"+w.getText());
                if(refundBtnList.get(elementIndex).getText().contains("efund")){//break the loop if refund option is available in column 3
                    break;
                }

            }
            elementIndex=elementIndex+1;
            System.out.println(elementIndex);
        }
        System.out.println(elementIndex);
        refundBtnList.get(elementIndex).click();//click the refund button
        System.out.println("button text"+refundBtnList.get(elementIndex).getText());
        getReusableActions().staticWait(3000);
    }
    public void validateRefundUnsuccessful(){
//        getReusableActions().staticWait(3000);
//        getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().staticWait(4000);
        getReusableActions().scrollToElement(refundAmtHigherError);
        getReusableActions().staticWait(4000);
/*        getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollToBottomOfPage();*/
//        getReusableActions().javascriptScrollByVisibleElement(refundAmtHigherError);

        reporterSnapshot(refundAmtHigherError,"","","DISPLAY");
    }
    public void validateGeneratePDF(){
        getReusableActions().staticWait(2000);
        scrollToMiddleOfElement(generatePdfCta);
        getReusableActions().staticWait(1000);
        reporterSnapshot(generatePdfCta,"PDF DOWNLOAD LINK","","DISPLAY");
    }
    public void validateToClickAndCheckDetailsOfCloumnData(String columnNamelist, String columnName, String strExpColValue) {
        String[] strArray = columnNamelist.split(";");
        for (int i = 0; i < strArray.length - 1; i++) {
            if (strArray[i].toUpperCase().contains(columnName.toUpperCase())) {
                columnName = strArray[i];
                System.out.println(columnName);
                break;
            }
        }
        String tableColumnOptionXpath = "//button[contains(text(),'" + columnName + "')]";
        System.out.println(tableColumnOptionXpath);
        WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
        getReusableActions().javascriptScrollByVisibleElement(tableColumnOption);
        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(1000);
        System.out.println("columnName - " + columnName);
        String columnXpath = getColumnElementXpath(columnName);
        System.out.println("columnXpath - " + columnXpath);
        List<WebElement> columnstatus = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus.size());
        getReusableActions().staticWait(2000);
        boolean clmStatus = true;
        for (WebElement s : columnstatus) {
            if ((s.getText().toUpperCase()).equals(strExpColValue.toUpperCase())) {
                clmStatus=false;
                System.out.println("strExpColValue == " + strExpColValue.toUpperCase());
                System.out.println("Actual Value == " + s.getText().toUpperCase());
                List<WebElement> orderTypeElement= getDriver().findElements(By.xpath("//span[contains(text(),'"+ s.getText() +"')]"));
                System.out.println("xpath to click == " + orderTypeElement.get(0));
                scrollToMiddleOfElement(s);
                getReusableActions().staticWait(1000);
                reporterSnapshot(s,strExpColValue,"","COMMON");
                orderTypeElement.get(0).click();
                getReusableActions().staticWait(25000);
                //System.out.println(" Substring For Xpath == " + s.getText().substring(0,3));
                WebElement orderTypeDetails= getDriver().findElement(By.xpath(getDataDeatailsXpath(strExpColValue)));
                System.out.println("xpath For Check Detail == " + orderTypeDetails);
                reporterSnapshot(orderTypeDetails,strExpColValue+" ORDER SUMMARY","","Display");
                break;
            }
        }
        if(clmStatus){
            for (WebElement s : columnstatus)
                reporterSnapshot(s,strExpColValue,"","COMMON");
        }
    }
    public void clickOnPlanChangeLink(){
        getReusableActions().staticWait(3000);
        reporterSnapshot(planChangeLink,"Plan change","","GEN");
        planChangeLink.click();
    }

    public void validateSortByTextButtonUsage(String columnNamelist, String columnName) {
        String[] strArray = columnNamelist.split(";");
        for (int i = 0; i <= strArray.length - 1; i++) {
            if (strArray[i].toUpperCase().contains(columnName.toUpperCase())) {
                columnName = strArray[i];
                System.out.println("columnName - " + columnName);
                break;
            }
        }

        String tableColumnOptionXpath = "//button[contains(text(),'" + columnName + "')]";
        System.out.println("tableColumnOptionXpath - " + tableColumnOptionXpath);
        WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
        getReusableActions().javascriptScrollByVisibleElement(tableColumnOption);
        getReusableActions().isElementVisible(tableColumnOption);
        getReusableActions().staticWait(3000);
        tableColumnOption.click();
        getReusableActions().staticWait(5000);

        String columnXpath = getColumnElementXpath2(columnName);
        System.out.println(columnXpath);
        List<WebElement> columnstatus = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();
        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText());
            System.out.println("Application - " + we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        //System.out.println("sortedlist"+sortedList);
        reporter.softAssert(sortedList.equals(obtainedList), "VALID FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER MATCHED WITH EXPECTED AND ACTUAL VALUE ", "INVALID : FIELD - \"" + columnName.toUpperCase() + "\" ASCENDING ORDER NOT MATCHED WITH EXPECTED AND ACTUAL VALUE");
        tableColumnOption.click();
        getReusableActions().staticWait(3000);

        List<WebElement> columnstatus1 = getDriver().findElements(By.xpath(columnXpath));
        System.out.println("Number of elements:" + columnstatus1.size());
        ArrayList<String> obtainedList1 = new ArrayList<>();
        for (WebElement we : columnstatus1) {
            obtainedList1.add(we.getText());
            System.out.println("Application - " + we.getText());
        }
        ArrayList<String> sortedList1 = new ArrayList<>();
        for (String s : obtainedList1) {
            sortedList1.add(s);
        }
        Collections.sort(sortedList1);
        Collections.reverse(sortedList1);
        System.out.println("sortedlist" + sortedList1);
        System.out.println("obtainedList1" + obtainedList1);
        reporter.softAssert(sortedList1.equals(obtainedList1), "VALID FIELD - \"" + columnName.toUpperCase() + "\" DESCENDING ORDER MATCHED WITH EXPECTED AND ACTUAL VALUE ", "INVALID : FIELD - \"" + columnName.toUpperCase() + "\" DESCENDING ORDER NOT MATCHED WITH EXPECTED AND ACTUAL VALUE");
    }
    public String getColumnElementXpath2(String columnName) {
        String colVal = "";
        String tempcolVal = columnName.replace(" ", "");
        if (tempcolVal.toUpperCase().contains("DATEANDTIME"))
            colVal = "1";
        else if (tempcolVal.toUpperCase().contains("USAGETYPE"))
            colVal = "2";
        else if (tempcolVal.toUpperCase().contains("YOUUSED"))
            colVal = "3";
        else if (tempcolVal.toUpperCase().contains("AMOUNT"))
            colVal = "4";
        else if (tempcolVal.toUpperCase().contains("ACCOUNTBALANCE"))
            colVal = "5";
        else if (tempcolVal.toUpperCase().contains("COVERAGETYPE"))
            colVal = "6";
        String columnXpath = "//table[@role='table']/tbody/tr/td[" + colVal + "]";    //grid
        return columnXpath;
    }
    public String getDataDeatailsXpath(String dataName) {
        String colVal = "";
        String tempcolVal = dataName;
        if (tempcolVal.contains("SIM swap"))
            colVal = "//p[contains(text(),'SIM Swap')]";
        else if (tempcolVal.contains("Manage add-on"))
            colVal = "//p[contains(text(),'Add-ons')]";
        else if (tempcolVal.contains("New activation"))
            colVal = "//p[contains(text(),'New activation')]";
        else if (tempcolVal.contains("Phone number change"))
            colVal = "//p[contains(text(),'Phone number change')]";
        else if (tempcolVal.contains("Auto-pay (enroll)"))
            colVal = "//span[contains(text(),'Auto-pay (enroll)')]";
        else if (tempcolVal.contains("Auto-pay (unenroll)"))
            colVal = "//span[contains(text(),'Auto-pay (unenroll)')]";
        String dataNameXpath =colVal;
        return dataNameXpath;
    }
    public void validateSearchResultTableColumninFrench(String tableColumn) {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(orderTypeFR);
        String[] strArray = tableColumn.split(";");
        for (int i = 0; i <= strArray.length - 1; i++) {
            String tableColumnOptionXpath = "//button[contains(text(),'" + strArray[i] + "')]";
            WebElement tableColumnOption = getDriver().findElement(By.xpath(tableColumnOptionXpath));
            reporterSnapshot(tableColumnOption, strArray[i], "", "Display");
        }
    }
    public void validatePaginationFR() {
        scrollToMiddleOfElement(page1CTA);
        getReusableActions().staticWait(2000);
            page1CTA.click();
            reporterSnapshot(page1CTA, "Page 1", "", "display");
        }
    public void validateLatestStatus() {
        getReusableActions().staticWait(1000);
        scrollToMiddleOfElement(latestResultStatus);
        reporterSnapshot(latestResultStatus, " Status Successful", "", "visible");

    }
    public String getLatestOrderId() {
        getReusableActions().staticWait(1000);
        scrollToMiddleOfElement(latestOrderId);
        reporterSnapshot(latestOrderId, " ORDER ID : "+latestOrderId.getText(), "", "NULL");
        System.out.println(" Order Id = "+latestOrderId.getText());
        return latestOrderId.getText();
    }
    public String getLatestOrderIdForSS() {
        getReusableActions().staticWait(1000);
        scrollToMiddleOfElement(latestOrderIdinSS);
        reporterSnapshot(latestOrderId, " ORDER ID : "+latestOrderIdinSS.getText(), "", "NULL");
        System.out.println(" Order Id = "+latestOrderIdinSS.getText());
        return latestOrderIdinSS.getText();
    }
}

