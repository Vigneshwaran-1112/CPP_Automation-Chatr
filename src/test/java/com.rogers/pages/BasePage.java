package com.rogers.pages;

import com.rogers.data.handlers.ExcelUtility;
import com.rogers.data.handlers.JavaUtility;
import com.rogers.test.listeners.report.ScreenCapture;
import com.rogers.test.listeners.report.TestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.DigiAutoCustomException;
import utils.Reporter;
import utils.ReusableActions;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

import static com.rogers.data.handlers.TestDataHandler.filePath;

public class BasePage {

    protected static Reporter reporter;
    protected static WebDriverWait wait;
    private static final ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();
    private static final ThreadLocal<ReusableActions> reusableActionsThreadLocal = new ThreadLocal<>();
    private static final ThreadLocal<Actions> actionsThreadLocal = new ThreadLocal<>();
    ExcelUtility excelUtility;

    public BasePage(WebDriver driver) {
        webDriverThreadLocal.set(driver);
        PageFactory.initElements(getDriver(), this);
        actionsThreadLocal.set(new Actions(getDriver()));
        reusableActionsThreadLocal.set(new ReusableActions(getDriver()));
        reporter = new TestManager(getDriver());
    }

    protected WebDriver getDriver() {
        return webDriverThreadLocal.get();
    }

    protected ReusableActions getReusableActions() {
        return reusableActionsThreadLocal.get();
    }

    protected Actions getActionsInstance() {
        return actionsThreadLocal.get();
    }

    public static Reporter getReporter() {
        return reporter;
    }

    public void waitForAttributeToBeNotEmpty(WebElement webElement, String attribute, long timeOutSeconds) {
        try {
//            wait = new WebDriverWait(getDriver(), timeOutSeconds );
            wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeOutSeconds));
            wait.until(ExpectedConditions.attributeToBeNotEmpty(webElement, attribute));
        } catch (Exception e) {
            throw new DigiAutoCustomException(e);
        }
    }

    public String removeSpecialCharacters(String inputString, String characterToRemove) {
        inputString = inputString.replace(characterToRemove, "");
        return inputString;
    }

    public void reporterSnapshot(WebElement objValue, String expectedValue, String actualValue, String options) {
        String actualValueTemp = "";
        Boolean actualValueBoolan;
        getReusableActions().staticWait(2000);
        switch (options.toUpperCase()) {
            // Validate Dropdown Value and Print
            // Dropdown WebElement, Expected Value, Actual Value Get it from App, Option - Dropdown
            case "DROPDOWN":
                Select select = new Select(objValue);
                WebElement objSelValue = select.getFirstSelectedOption();
                actualValueTemp = objSelValue.getText();
                reporter.softAssert(actualValueTemp.contains(expectedValue), "VALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"");
//                reporter.reportLogFailWithFullPageScreenshot("Test");
//                reporter.reportLogWithFullPageScreenshot("Test");
                break;
            case "DROPDOWN1":
                actualValueTemp = getReusableActions().getSelectedValue(objValue);
                reporter.softAssert(actualValueTemp.contains(expectedValue), "VALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"");
                break;
            // Just Print a Expected Value in Test Results
            // No Object, Expected Text, No Actual, Option - Null
            case "NULL":
                if (actualValue == "") {
                    reporter.reportLogWithScreenshot("VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED PROPERLY");
                } else {
                    reporter.reportLogWithScreenshot("VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED PROPERLY - \"" + actualValue.toUpperCase() + "\"");
                }
                break;
            // Valid a Url and Print
            // No object, Expected URL, Actual URL get it from App, Option - Link
            case "LINK":
                actualValueTemp = getDriver().getCurrentUrl();
                reporter.softAssert(actualValueTemp.contains(expectedValue), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"");
                break;
            case "NOTLINK":
                actualValueTemp = getDriver().getCurrentUrl();
                reporter.softAssert(!actualValueTemp.contains(expectedValue), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"");
                break;
            // Object, Expected Value, Actual Value, option - GEN
            case "GEN":
                actualValueTemp = objValue.getText();
                reporter.softAssert(actualValueTemp.equals(expectedValue), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"");
                break;
            case "NOTGEN":
                actualValueTemp = objValue.getText();
                reporter.softAssert(!actualValueTemp.equals(expectedValue), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"");
                break;
            case "MESSAGE":
                actualValueTemp = objValue.getText();
                reporter.softAssert(actualValueTemp.contains("This field is required"), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" MANDATORY FIELD ERROR MESSAGE IS DISPLAYED", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" MANDATORY FIELD ERROR MESSAGE IS NOT DISPLAYED - \"" + actualValueTemp.toUpperCase() + "\"");
                break;
            case "COMPARE":
                actualValue = actualValue.toUpperCase();
                reporter.softAssert(actualValue.equals(expectedValue.toUpperCase()), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + actualValue.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + actualValue.toUpperCase() + "\"");
                break;
            case "NOTMATCH":
                actualValue = actualValue.toUpperCase();
                reporter.softAssert(!actualValue.equals(expectedValue.toUpperCase()), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE NOT MATCH WITH ACTUAL VALUE \"" + actualValue.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS  MATCHED WITH ACTUAL VALUE \"" + actualValue.toUpperCase() + "\"");
                break;
            case "COMMON":
                actualValueTemp = objValue.getText().toUpperCase().trim();
                System.out.println("actualval  -" + actualValueTemp + "  expected--  " + expectedValue.toUpperCase());
                reporter.softAssert(actualValueTemp.contains(expectedValue.toUpperCase().trim()), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS MATCH WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"");
                break;
            case "NOTCOMMON":
                actualValueTemp = objValue.getText().toUpperCase();
                System.out.println("actualval  -" + actualValueTemp + "  expected--  " + expectedValue.toUpperCase());
                reporter.softAssert(!actualValueTemp.contains(expectedValue.toUpperCase()), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCH WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS MATCHED WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"");
                break;
            case "GETTEXT":
                actualValueTemp = objValue.getText();
                reporter.reportLogWithScreenshot("VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED PROPERLY - \"" + actualValueTemp.toUpperCase() + "\"");
                break;
            case "SELECT":
                actualValueBoolan = objValue.isSelected();
                reporter.softAssert(actualValueBoolan.equals(true), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE SELECTED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT SELECTED SUCCESSFULLY");
                break;
            case "NOTSELECT":
                actualValueBoolan = objValue.isSelected();
                reporter.softAssert(!actualValueBoolan.equals(true), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT SELECTED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE SELECTED SUCCESSFULLY");
                break;
            case "DISPLAY":
                actualValueBoolan = objValue.isDisplayed();
                reporter.softAssert(actualValueBoolan.equals(true), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY");
                break;
            case "NOTDISPLAY":
                actualValueBoolan = objValue.isDisplayed();
                reporter.softAssert(!actualValueBoolan.equals(true), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY");
                break;
            case "VISIBLE":
                reporter.softAssert(getReusableActions().isElementVisible(objValue), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY");
                break;
            case "NOTVISIBLE":
                reporter.softAssert(!getReusableActions().isElementVisible(objValue), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY");
                break;
            case "ENABLE":
                actualValueBoolan = objValue.isEnabled();
                reporter.softAssert(actualValueBoolan.equals(true), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE ENABLED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT ENABLED SUCCESSFULLY");
                break;
            case "ENABLENOT":
                actualValueBoolan = objValue.isEnabled();
                reporter.softAssert(!actualValueBoolan.equals(true), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT ENABLED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE ENABLED SUCCESSFULLY");
                break;
            case "NOTENABLE":
                actualValueTemp = objValue.getAttribute("aria-disabled");
                reporter.softAssert(actualValueTemp.equals("true"), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT ENABLED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE ENABLED SUCCESSFULLY");
                break;
            case "NOTENABLE1":
                actualValueTemp = objValue.getAttribute("aria-invalid");
                reporter.softAssert(actualValueTemp.equals("false"), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT ENABLED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE ENABLED SUCCESSFULLY");
                break;
            case "EMPTY":
                actualValueTemp = objValue.getAttribute("value");
                reporter.softAssert(actualValueTemp.isEmpty(), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE BLANK SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT BLANK SUCCESSFULLY");
                break;
            case "NOTEMPTY":
                actualValueTemp = objValue.getAttribute("value");
                reporter.softAssert(!actualValueTemp.isEmpty(), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT BLANK SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE BLANK SUCCESSFULLY");
                break;
            case "VALUE":
                actualValueTemp = objValue.getAttribute("value");
                reporter.softAssert(actualValueTemp.equals(expectedValue), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + actualValue.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + actualValue.toUpperCase() + "\"");
                break;
            case "VALUE1":
                actualValueTemp = objValue.getAttribute("value");
                reporter.softAssert(!actualValueTemp.equals(expectedValue), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + actualValue.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + actualValue.toUpperCase() + "\"");
                break;
            case "VALUE2":
                actualValueTemp = objValue.getAttribute("name");
                reporter.softAssert(actualValueTemp.equals(actualValue), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE");
                break;
            case "CHECKBOX":
                reporter.reportLogWithScreenshot("VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE CHECKED PROPERLY");
                break;
            case "MATCH":
                reporter.softAssert(actualValue.equals(expectedValue), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + actualValue.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + actualValue.toUpperCase() + "\"");
                break;
            case "MATCH1":
                reporter.softAssert(actualValue.equals("1"), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY");
                break;
            case "MATCH2":
                String actValue = isObjPresent(objValue);
                reporter.softAssert(actValue.equals("false"), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY");
                break;
            case "NOTBLANK":
                reporter.softAssert(!actualValue.equals(expectedValue), "VALID FIELD - \"" + actualValue.toUpperCase() + "\" ACTUAL VALUE ARE NOT BLANK ", "INVALID : FIELD - \"" + actualValue.toUpperCase() + "\" ACTUAL VALUE ARE BLANK");
                break;
            case "INTMATCH":
                reporter.softAssert(actualValue.equals("true"), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE EQUAL OR LESS VALUE WITH ACTUAL VALUE", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT EQUAL OR GREATER VALUE WITH ACTUAL VALUE");
                break;
            case "MATCHES":
                actualValueTemp = objValue.getText();
                System.out.println(actualValueTemp + "  actualValue " + actualValue);
                reporter.softAssert(objValue.getText().matches(actualValue), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"");
                break;
            case "CLASS":
                actualValueTemp = objValue.getAttribute("class");
                reporter.softAssert(actualValueTemp.contains(expectedValue), "VALID FIELD - \"" + actualValue.toUpperCase() + "\" ARE DISPLAYED PROPERLY", "INVALID : FIELD - \"" + actualValue.toUpperCase() + "\" ARE NOT DISPLAYED PROPERLY");
                break;
            case "DEFAULT":
                actualValueTemp = objValue.getAttribute("aria-checked");
                reporter.softAssert(actualValueTemp.contains("true"), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE SELECTED AS DEFAULT", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT SELECTED AS DEFAULT");
                break;
            case "INNERTEXT":
                actualValueTemp = objValue.getAttribute("innerText").toUpperCase();
                reporter.softAssert(actualValueTemp.contains(expectedValue.toUpperCase()), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + actualValueTemp.toUpperCase() + "\"");
                break;
            case "FORMAT":
                reporter.softAssert(objValue.getText().matches(expectedValue), "VALID FIELD - \"" + objValue.getText() + "\" ARE DISPLAYED EXPECTED FORMAT SUCCESSFULLY", "INVALID : FIELD - \"" + objValue.getText() + "\" ARE NOT DISPLAYED EXPECTED FORMAT SUCCESSFULLY");
                break;
            case "HIDDEN":
                reporter.softAssert(actualValue.equals("0"), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY");
                break;
            case "COMPARE1":
                actualValueTemp = actualValue.toUpperCase().trim();
                String expectedValueTemp = expectedValue.toUpperCase();
                System.out.println("actualval  - " + actualValueTemp + "  expected--  " + expectedValueTemp);
                reporter.softAssert(expectedValueTemp.contains(actualValueTemp), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + actualValue.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + actualValue.toUpperCase() + "\"");
                break;
            case "NOTHIDDEN":
                reporter.softAssert(actualValue.equals("0"), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY");
                break;
            case "ENS":
                String expected = expectedValue;
                reporter.softAssert(expected.equals(actualValue), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + actualValue.toUpperCase() + "\"", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + actualValue.toUpperCase() + "\"");
                break;
        }
        getReusableActions().staticWait(1000);
    }

    public String isObjPresent(WebElement objElement) {
        if (getReusableActions().isElementVisible(objElement, 10)) {
            return "true";
        }
        return "false";
    }

    /**
     * This method is used to fetch Unused Voucher from excel Sheet
     */
    public String getUnusedVoucherPin(String voucherValueColumnName, String voucherStatusColumnName) {
        String sheetName = "Voucher";
        String excelPath = System.getProperty("user.dir") + filePath.replace("env", System.getProperty("Environment") + "/testData.xlsx");
        System.out.println(excelPath);
        String unusedVoucher = "";
        excelUtility = new ExcelUtility(excelPath);
        for (int i = 2; i <= excelUtility.getRowCount(sheetName); i++) {
            System.out.println(excelUtility.getRowCount(sheetName));
            System.out.println(excelUtility.getCellData(sheetName, voucherStatusColumnName, i));
            if (!"INVALID".equalsIgnoreCase(excelUtility.getCellData(sheetName, voucherStatusColumnName, i))) {
                unusedVoucher = excelUtility.getCellData(sheetName, voucherValueColumnName, i);
                System.out.print("unusedVoucher" + unusedVoucher);
                if (unusedVoucher.contains(".")) {
                    unusedVoucher = unusedVoucher.substring(0, unusedVoucher.indexOf("."));
                    System.out.print("unusedVoucher" + unusedVoucher);
                }
                System.out.println("===== unused voucher is ==>>" + unusedVoucher);
                break;
            }
            System.out.println("No unused vouchers found");
        }
        System.out.println(unusedVoucher);
        return unusedVoucher;
    }

    /**
     * This method is used to Set value as USED for used VoucherPIN in excel Sheet
     */
    public Boolean setUsedVoucherStatus(String usedVoucher, String voucherValueColumnName, String voucherStatusColumnName) {
        String sheetName = "Voucher";
        String excelPath = System.getProperty("user.dir") + filePath.replace("env", System.getProperty("Environment") + "/testData.xlsx");
        excelUtility = new ExcelUtility(excelPath);
        for (int i = 2; i <= excelUtility.getRowCount(sheetName); i++) {
            String exclValue = excelUtility.getCellData(sheetName, voucherValueColumnName, i);
            if (exclValue != null && exclValue.contains("."))
                exclValue = exclValue.substring(0, exclValue.indexOf("."));
            if (usedVoucher.equalsIgnoreCase(exclValue)) {
                excelUtility.setCellData(sheetName, voucherStatusColumnName, i, "INVALID");
                System.out.println("PIN Updated");
                break;
            }
        }
        return false;

    }

    public String getUnusedNAC(String status) {
        String sheetName = "NAC";
        String excelPath = System.getProperty("user.dir") + filePath.replace("env", System.getProperty("Environment") + "/testData.xlsx");
        System.out.println(excelPath);
        String unusedNAC = "";
        excelUtility = new ExcelUtility(excelPath);
        for (int i = 2; i <= excelUtility.getRowCount(sheetName); i++) {
            System.out.println(excelUtility.getRowCount(sheetName));
            System.out.println(excelUtility.getCellData(sheetName, "Status", i));
            if (status.equalsIgnoreCase(excelUtility.getCellData(sheetName, "Status", i))) {
                unusedNAC = excelUtility.getCellData(sheetName, "CTN", i);
                //System.out.print("unusedVoucher"+unusedVoucher);
                if (unusedNAC.contains(".")) {
                    unusedNAC = unusedNAC.substring(0, unusedNAC.indexOf("."));
                    System.out.print("unusedNAC" + unusedNAC);
                }
                System.out.println("===== unused NAC is ==>>" + unusedNAC);
                break;
            }
            System.out.println("No unused NAC found");
        }
        System.out.println(unusedNAC);
        return unusedNAC;
    }

    /**
     * This method is used to Set value as USED for used VoucherPIN in excel Sheet
     */
    public Boolean setUsedNACStatus(String usedNAC) {
        String sheetName = "NAC";
        String excelPath = System.getProperty("user.dir") + filePath.replace("env", System.getProperty("Environment") + "/testData.xlsx");
        excelUtility = new ExcelUtility(excelPath);
        for (int i = 2; i <= excelUtility.getRowCount(sheetName); i++) {
            String exclValue = excelUtility.getCellData(sheetName, "CTN", i);
            if (exclValue != null && exclValue.contains("."))
                exclValue = exclValue.substring(0, exclValue.indexOf("."));
            if (usedNAC.equalsIgnoreCase(exclValue)) {
                excelUtility.setCellData(sheetName, "Status", i, "USED");
                System.out.println("PIN Updated");
                break;
            }
        }
        return false;
    }

    public String getEasid(String status) {
        String sheetName = "EAS";
        String excelPath = System.getProperty("user.dir") + filePath.replace("env", System.getProperty("Environment") + "/testData.xlsx");
        System.out.println(excelPath);
        String unusedUserName = "";
        excelUtility = new ExcelUtility(excelPath);
        for (int i = 2; i <= excelUtility.getRowCount(sheetName); i++) {
            System.out.println(excelUtility.getRowCount(sheetName));
            System.out.println(excelUtility.getCellData(sheetName, "Status", i));
            if (status.equalsIgnoreCase(excelUtility.getCellData(sheetName, "Status", i))) {
                unusedUserName = excelUtility.getCellData(sheetName, "UserName", i) + ";" + excelUtility.getCellData(sheetName, "Password", i);
                System.out.print("unusedUserName" + unusedUserName);
                /*if (unusedUserName.contains(".")) {
                    unusedUserName = unusedUserName.substring(0, unusedUserName.indexOf("."));
                    System.out.print("unusedUserName"+unusedUserName);
                }
                System.out.println("===== unusedUserName NAC is ==>>" + unusedUserName);*/
                break;
            }
            System.out.println("No unused EAS found");
        }
        System.out.println(unusedUserName);
        return unusedUserName;
    }

    public Boolean setEasid(String usedEasid, String usedEasidStaus) {
        String sheetName = "EAS";
        String excelPath = System.getProperty("user.dir") + filePath.replace("env", System.getProperty("Environment") + "/testData.xlsx");
        excelUtility = new ExcelUtility(excelPath);
        for (int i = 2; i <= excelUtility.getRowCount(sheetName); i++) {
            String exclValue = excelUtility.getCellData(sheetName, "UserName", i);
            if (exclValue != null && exclValue.contains("."))
                exclValue = exclValue.substring(0, exclValue.indexOf("."));
            if (usedEasid.equalsIgnoreCase(exclValue)) {
                excelUtility.setCellData(sheetName, usedEasidStaus, i, "USED");
                System.out.println("EAS User ID Updated");
                break;
            }
        }
        return false;
    }

    public void setEasidPwd(String phoneNumber, String usedEasid, String passWord) {
        String sheetName = "EAS";
        String excelPath = System.getProperty("user.dir") + filePath.replace("env", System.getProperty("Environment") + "/testData.xlsx");
        excelUtility = new ExcelUtility(excelPath);
        int i = excelUtility.getRowCount(sheetName) + 1;
        excelUtility.setCellData(sheetName, "CTN", i, phoneNumber);
        excelUtility.setCellData(sheetName, "UserName", i, usedEasid);
        excelUtility.setCellData(sheetName, "Password", i, passWord);
        excelUtility.setCellData(sheetName, "Status", i, "EAS");
    }

    public Boolean setUsedNACStatus1(String usedNAC, String status) {
        if (status == "") {
            status = "USED";
        }
        String sheetName = "NAC";
        String excelPath = System.getProperty("user.dir") + filePath.replace("env", System.getProperty("Environment") + "/testData.xlsx");
        excelUtility = new ExcelUtility(excelPath);
        for (int i = 2; i <= excelUtility.getRowCount(sheetName); i++) {
            String exclValue = excelUtility.getCellData(sheetName, "CTN", i);
            if (exclValue != null && exclValue.contains("."))
                exclValue = exclValue.substring(0, exclValue.indexOf("."));
            if (usedNAC.equalsIgnoreCase(exclValue)) {
                excelUtility.setCellData(sheetName, "Status", i, status);
                System.out.println("PIN Updated");
                break;
            }
        }
        return false;
    }

    public void setUsedNACStatus2(String usedNAC, String status) {
        String sheetName = "NAC";
        String excelPath = System.getProperty("user.dir") + filePath.replace("env", System.getProperty("Environment") + "/testData.xlsx");
        excelUtility = new ExcelUtility(excelPath);
        int i = excelUtility.getRowCount(sheetName) + 1;
        excelUtility.setCellData(sheetName, "CTN", i, usedNAC);
        excelUtility.setCellData(sheetName, "Status", i, status);
        System.out.println("PIN Updated");
    }

    public void scrollToMiddleOfElement(WebElement element) {
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

        ((JavascriptExecutor) getDriver()).executeScript(scrollElementIntoMiddle, element);
        getReusableActions().staticWait(1000);
    }

    public void setNacInDataSheet(String phoneNumber, String status) {
        String sheetName = "NAC_DataCreation";
        String excelPath = System.getProperty("user.dir") + filePath.replace("env", System.getProperty("Environment") + "/testData.xlsx");
        // String excelPath = "./src/test/resources/test-data/qa7/testData.xlsx";
        excelUtility = new ExcelUtility(excelPath);
        int i = excelUtility.getRowCount(sheetName) + 1;
        excelUtility.setCellData(sheetName, "CTN", i, phoneNumber.replaceAll("-", ""));
        excelUtility.setCellData(sheetName, "STATUS", i, status);
    }

    public String getDataFromExcel() {
        String sheetName = "NAC_Data";
        String excelPath = System.getProperty("user.dir") + filePath.replace("env", System.getProperty("Environment") + "/testData.xlsx");
        //String excelPath = "./src/test/resources/test-data/qa7/testData.xlsx";
        excelUtility = new ExcelUtility(excelPath);
        String data = excelUtility.getDataFromExcel(sheetName, 0, 0);
        return data;

    }

    public void reporterSnapshotWithFullPage(WebElement objValue, String expectedValue, String actualValue, String options) {
        String actualValueTemp = "";
        Boolean actualValueBoolan;
        String expected = "";
        getReusableActions().staticWait(2000);
        switch (options.toUpperCase()) {
            case "NOTAVAILABLE":
                if (objValue.getSize().equals(0)) {
                    expected = "PASS";
                } else {
                    expected = "FAIL";
                }
                reporter.softAssert("PASS", expected, "VALID FIELD - " + expectedValue.toUpperCase() + " ARE NOT DISPLAYED SUCCESSFULLY", "INVALID : FIELD - " + expectedValue.toUpperCase() + " ARE DISPLAYED SUCCESSFULLY");
                break;
        }
        getReusableActions().staticWait(1000);
    }

    public void pageZoomin(WebElement element, int zoomValue, WebElement element2, String expected, String options) {
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScript("document.body.style.zoom='" + zoomValue + "%'");
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(element);
        reporterSnapshot(element2, expected, "", options);
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(2000);
    }

    public String getNACData(String columnname ) {
        boolean dataFound = false;
        String excelPath = System.getProperty("user.dir") + filePath.replace("env", System.getProperty("Environment")+"/testData.xlsx");
        excelUtility = new ExcelUtility(excelPath);
        String nacData = "";
        try {
            int rowCount = excelUtility.getRowCount("NACdatainput");
            for (int i = 1; i <= rowCount; i++) {
                String cellEmailData = excelUtility.getCellData("NACdatainput", columnname, i);
                Thread.sleep(2000);
                if (cellEmailData != null) {
                    nacData = excelUtility.getCellData("NACdatainput", columnname, i);
                    System.out.println("the plan selected is :" +nacData);
                    Thread.sleep(2000);
                    dataFound = true;
                  break;
                }

            }  return nacData;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }

    public String getNACData(int row, int cell) {
        boolean dataFound = false;
        String excelPath = System.getProperty("user.dir") + filePath.replace("env", System.getProperty("Environment")+"/testData.xlsx");
        excelUtility = new ExcelUtility(excelPath);
        String nacData = "";
        try {
            int rowCount = excelUtility.getRowCount("NACdatainput");
            for (int i = 1; i <= rowCount; i++) {
                String cellEmailData = excelUtility.getDataFromExcel("NACdatainput",1,1);
                Thread.sleep(2000);
                if (cellEmailData != null) {
                    nacData=cellEmailData;
                    break;
                }

            }  return nacData;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }

    public void updateNACDataIntoExcel(String phonenumber) {
        boolean dataAdded = false;
        String excelPath = System.getProperty("user.dir") + filePath.replace("env", System.getProperty("Environment")+"/testData.xlsx");
        excelUtility = new ExcelUtility(excelPath);
        try {
            int rowCount = excelUtility.getRowCount("NACActivation");
            for (int i = 2; i <= rowCount + 1; i++) {
                String cellData = excelUtility.getCellData("NACActivation", "CTN", i);
                Thread.sleep(2000);
                if (cellData.length() == 0) {
                    excelUtility.setCellData("NACActivation", "CTN", i, phonenumber);
                    Thread.sleep(2000);
                    excelUtility.setCellData("NACActivation", "EASRegistration", i, "FALSE");
                    Thread.sleep(2000);
                    dataAdded = true;
                    break;
                }
                if(!dataAdded) {
                    reporter.reportLogFail("Error in filling customer data");
                }
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}