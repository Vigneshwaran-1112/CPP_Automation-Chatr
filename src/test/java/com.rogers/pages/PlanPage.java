package com.rogers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class PlanPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),' Change your location ')]")//app-location-selector//div[2]
    WebElement notYourLocationButton;
    @FindBy(xpath = "//select[@formcontrolname='city']")
    WebElement cityDropdown;
    @FindBy(xpath = "(//div[contains(@class,'button-row')]//button)[1]")
    WebElement selectCity;
    @FindBy(xpath = "//div[contains(@role,'tabpanel')]")
    WebElement planTable;
    @FindBy(xpath = "//div[contains(@class,'dsa-orderTable')]/div[2]/span[2]/ds-price/div/div/div[2]")
    WebElement planValue;
    @FindBy(xpath = "(//div[contains(@class,'dsa-orderTable')]/div[2]/span)[1]")
    WebElement cart;
    @FindBy(xpath = "//div[text()='One-time services']/following-sibling::div/div[2]/span")
    WebElement addOnCart;
    @FindBy(xpath = "//button[contains(@title,'next step')]")
    WebElement continueButton;
    @FindBy(xpath = "(//ds-checkbox/label)[1]")
    WebElement addOns;
    @FindBy(xpath = "(//span[contains(text(),'30 mins to China')]/ancestor::div[2]//span[1])[2]")
    WebElement addonInCart;
    @FindBy(xpath = "(//ds-price[@variant='inline']/div/div/div[2])[1]")
    WebElement addOnsAmount;
    @FindBy(xpath = "(//*[contains(text(),'Toronto, Ontario')])[1]")
    WebElement defaultLocation;
    @FindBy(xpath = "//div[1]/app-info-block/div")
    WebElement locationNotification;
    @FindBy(xpath = "(//span[contains(text(),'Total before taxes')]/following-sibling::span)[1]")
    WebElement selectPlan;
    @FindBy(xpath = "//app-location-selector/div/div[1]/div")
    WebElement changeLocation;
    @FindBy(xpath = "//button[contains(@aria-label,'3G Nation-Wide Talk, Text & Data')]")
    WebElement threeGPlansSelection;
    @FindBy(xpath = "//*[@id=\"ds-tabs-0-tab-0\"]")
    WebElement planSelection4G;
    @FindAll({@FindBy(xpath = "//*[@id=\"ds-tabs-1-tab-1\"]"),@FindBy(xpath = "//*[@id=\"ds-tabs-0-tab-1\"]")})//@FindBy(xpath = "//*[@id=\"ds-tabs-0-tab-1\"]") ////*[@id="ds-tabs-0-tab-1"]//*[@id="ds-tabs-1-tab-1"] ////*[@id="ds-tabs-2-tab-1"]
    WebElement planSelection3G;
    @FindBy(xpath = "//*[@id=\"ds-tabs-0-tab-2\"]")
    WebElement planSelection3GN;
    @FindBy(xpath = "//*[@id=\"ds-tabs-0-tab-3\"]")
    WebElement planSelection3GD;
    @FindBy(xpath = "//*[@formcontrolname='firstName']")
    WebElement firstNameInput;
    @FindBy(xpath = "//*[@formcontrolname='lastName']")
    WebElement lastNameInput;
    @FindBy(xpath = "//div[contains(text(),'One-time fees')]/following-sibling::div")
    WebElement Add_onCart;
    @FindBy(xpath = "//div[contains(text(),'Monthly service')]/following-sibling::div")
    WebElement orderSummaryLable;
    @FindBy(xpath = "//button[contains(@title,'proceed')]")
    WebElement proceedButton;
    @FindBy(xpath = "//span[@class='text-bold ds-color-storm']")
    WebElement noPlanSelect;
    @FindBy(xpath = "(//span[contains(text(),'Details')])[5]")
    WebElement planDetail;
    @FindBy(xpath = "(//h4[@class='pl-16 ng-star-inserted'])[2]/following-sibling::div[1]")
    WebElement threeGSpeedData;
    @FindBy(xpath = "(//h4[@class='pl-16 ng-star-inserted'])[2]/following-sibling::div[2]")
    WebElement ppcEligibleTalk;
    @FindBy(xpath = "(//h4[@class='pl-16 ng-star-inserted'])[2]/following-sibling::div[3]")
    WebElement unlimitedText;
    @FindBy(xpath = "(//h4[@class='pl-16 ng-star-inserted'])[2]/following-sibling::div[4]")
    WebElement voicemail;
    @FindBy(xpath = "(//h4[contains(text(),'Promotions')]/following-sibling::div[1])[1]")
    WebElement firstPromotions;
    @FindBy(xpath = "(//h4[contains(text()='Promotions')]/following-sibling::div[2])[1]")
    WebElement secondPromotions;
    @FindBy(xpath = "(//p[contains(text(),'Unlimited Canada')])[2]")
    WebElement promotionText;
    @FindBy(xpath = "//div[text()='CALCULATION']")
    WebElement calculationSection;
    @FindBy(xpath = "//span[text()='Total Due Today']/following-sibling::span")
    WebElement totalDueToday;
    @FindBy(xpath = "//div[text()='Taxes']/following-sibling::div")
    WebElement taxes;
    @FindBy(xpath = "//div[text()='Monthly services']")
    WebElement monthlyServiceDetails;
    @FindBy(xpath = "//button[@title='Retirer']")
    WebElement planRemoveButtonFrench;
    @FindBy(xpath = "//span[contains(text(),'Continuer')]")
    WebElement continueButtonFrench;
    @FindBy(xpath = "//button[contains(@title,'Remove')]")
    WebElement planRemoveButton;
    @FindBy(xpath = "//*[@id=\"orderTable-refId-0\"]/div/div/div/div[2]/span[2]/ds-price/div/div/div[2]")
    WebElement oneTimeCart;
    @FindBy(xpath = "//span[contains(text(),'One Time Data')]")
    WebElement oddOnAmtCart;
    @FindBy(xpath = "//span[normalize-space()='Monthly plan fees']")
    WebElement cartMonthlyPlan;
    @FindAll({@FindBy(xpath = "//*[@id=\"ds-tabs-1-tab-0\"]"),@FindBy(xpath = "//*[@id=\"ds-tabs-0-tab-0\"]"),@FindBy(xpath = "//*[@id=\"ds-tabs-4-tab-0\"]")})
    WebElement ppcplanSelection4G;
    @FindAll({@FindBy(xpath = "//*[@id=\"ds-tabs-1-tab-1\"]"),@FindBy(xpath = "//*[@id=\"ds-tabs-0-tab-1\"]"),@FindBy(xpath = "//*[@id=\"ds-tabs-4-tab-1\"]")})//*[@id="ds-tabs-1-tab-1"]//*[@id="ds-tabs-0-tab-1"]
    WebElement ppcplanSelection3G;
    @FindBy(xpath = "//*[@id=\"ds-tabs-1-tab-2\"]")
    WebElement ppcplanSelection3GN;
    @FindBy(xpath = "//*[@id=\"ds-tabs-1-tab-3\"]")
    WebElement ppcplanSelection3GD;
    @FindBy(xpath = "(//h4[contains(text(),'Promotions')])[1][//following-sibling::div]")
    WebElement promotionsFirst;
    @FindBy(xpath = "(//span[contains(text(),'Details')])[1]")//(//span[@class='text-overline ng-star-inserted'])[7]")
    WebElement promotionsOnPlan;
    @FindBy(xpath = "(//span[contains(text(),'Details')])[2]")//(//button[@title=' Details $15 plan per month']//following-sibling::span[1])[3]")
    WebElement planHiddenDetails;
    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    WebElement continueButtonAddOn;
    @FindBy(xpath = "//*[contains(text(),'Proration adjustment')]")
    WebElement prorationAdjustment;
    @FindBy(xpath = "//*[contains(text(),'not compatible')]")
    WebElement mutuallyExcluxiveAddOnError;

    @FindBy(xpath = "//span[contains(text(),'Data Add')]")
    WebElement dataAddOn;
    @FindAll({@FindBy(xpath = "//*[contains(text(),\"Order summary\")]"),@FindBy(xpath = "//*[contains(text(),\"Order Summary\")]")})   //PPC -Order summary
    WebElement orderSummary;
    @FindBy(xpath = "//div/div[1]/div[1]/ds-checkbox/label/div[1]")
    WebElement addOn1;
    @FindBy(xpath = "//div/div[2]/div[1]/ds-checkbox/label/div[1]")
    WebElement addOn2;
    @FindBy(xpath = "//div/div[3]/div[1]/ds-checkbox/label/div[1]")
    WebElement addOn3;
    @FindBy(xpath = "//ds-error/span")
    List<WebElement> notCompatibleError;
    @FindBy(xpath ="//div[contains(@class,'selected')]")
    WebElement planDivSelected;
    @FindBy (xpath ="//div[contains(@class,'cartSummary')]//span[contains(text(),'Promotions')]/following::span[contains(@class,'dsa-orderTable__copy')]")
    List<WebElement> cartPromotionRows;
    @FindBy (xpath ="//span[contains(text(),'Promotions')]/following::span[contains(@class,'dsa-orderTable__copy')]")
    List<WebElement> orderConfirmationPromotionRows;
    @FindBy(xpath ="//span[contains(text(),'Anniversary date')]/preceding-sibling::span")
    WebElement anniversaryDateElement;
    @FindBy(xpath = "//*[contains(text(),'Proration adjustment')]")
    List <WebElement> prorationAdjustmentList;
    @FindBy(xpath = "(//*[contains(text(),' Brantford, Ontario ')])[1]")
    WebElement defaultLocation1;
    @FindBy(xpath = "//h5[normalize-space()='Promotions']")
    WebElement promotionInPlanPage;
    @FindBy(xpath = "//app-promotions-section[1]/div[1]/div[2]/span[1]")
    WebElement oneTimeCreditBackProm;  //2 for single Promotion 3 for double Promotion
    @FindBy(xpath = "//dsa-cart-summary[1]/div[1]/dsa-order-table[2]/div[1]/div[1]/span[1]")
    WebElement promotionInCart;
    @FindBy(xpath = "//app-location-selector[1]/div[1]/div[1]/div[1]")
    WebElement orderLocation;
    @FindBy(xpath = "//lib-targeted-offer[1]/div[1]/div[2]/div[2]/button[1]/span[1]/span[1]/p[1]/span[1]")
    WebElement toPlanButton;
    @FindBy(xpath = "//p[contains(text(),'Exclusive Offer')]")
    WebElement exclusiveTargetedOffer;



    public PlanPage(WebDriver driver) {
        super(driver);
    }

    public void waitForPlanPageLoad() {
        getReusableActions().isElementVisible(notYourLocationButton, 20);
    }

    public void selectCity(String province, String city) {
        // Clicks on not your location
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(notYourLocationButton, 10);
        //getReusableActions().staticWait(2000);
        // Select the province
        String locator = "//label[@for='%s']";
        locator = String.format(locator, province);
        getDriver().findElement(By.xpath(locator)).click();
        reporterSnapshot(selectCity, province, "", "NULL");
        //reporter.reportLogWithScreenshot("provience is select");
        // Select the city
        getReusableActions().isElementVisible(cityDropdown, 10);
        getReusableActions().clickWhenReady(cityDropdown);
        //getReusableActions().selectWhenReadyByVisibleText(cityDropdown, city);
        getReusableActions().clickWhenReady(cityDropdown);
        cityDropdown.sendKeys(Keys.TAB);
        getReusableActions().staticWait(1000);
        reporterSnapshot(selectCity, city, "", "NULL");
        //Click on Continue
        getReusableActions().isElementVisible(selectCity);
        getReusableActions().clickWhenReady(selectCity, 10);
        reporterSnapshot(selectCity, city, "", "NULL");
        //reporter.reportLogWithScreenshot("City: " + city + " has been selected");
    }
    public void selectCityForCare(String province,String city) {
        getReusableActions().staticWait(5000);
        try {
            getDriver().findElement(By.xpath("//span[contains(text(),'hange')]")).click();
        }catch (Exception e){}//getDriver().findElement(By.xpath("//span[contains(text(),'Change')]")).click();

        // Select the province
        String locator = "//label[@for='%s']";
        String fullNameProvince =null;
        try{
        locator = String.format(locator, province);
        getDriver().findElement(By.xpath(locator)).click();
        getReusableActions().staticWait(2000);
        fullNameProvince=getDriver().findElement(By.xpath(locator)).getText();
        System.out.println("Full Provience Name == "+fullNameProvince);
            getReusableActions().staticWait(2000);
            reporterSnapshot(selectCity, province, "", "NULL");
        }catch (Exception e){

        }
//        locator = String.format(locator, province);
//        getDriver().findElement(By.xpath(locator)).click();

        // Select the city
        getReusableActions().isElementVisible(cityDropdown, 15);
        getReusableActions().clickWhenReady(cityDropdown);
        getReusableActions().selectWhenReadyByVisibleText(cityDropdown, city);
        getReusableActions().staticWait(5000);
        cityDropdown.sendKeys(Keys.TAB);
        getReusableActions().staticWait(2000);
        reporterSnapshot(selectCity, city, "", "NULL");
        //reporter.reportLogWithScreenshot("City: " + city + " has been selected");
        //Click on Continue
        getReusableActions().isElementVisible(selectCity);
        getReusableActions().clickWhenReady(selectCity, 10);
        String location = city + ", " +fullNameProvince;
        reporterSnapshot(orderLocation,location,"","Gen");
        //reporterSnapshot(selectCity, city, "", "NULL");
        getReusableActions().staticWait(6000);
    }

    public void selectPlan(String Value) {
        String planValue ="";//
        String planXpath = "(//div[.//*[contains(.,'" + Value + "')]][contains(@class, 'plan-price')]/following-sibling::div[contains(@class, 'plan-select')]/button)[1]"; //2
        //String defaultplan = "(//div[.//*[contains(.,'15')]][contains(@class, 'plan-price')]/following-sibling::div[contains(@class, 'plan-select')]/button)[1]";
       if (getDriver().findElements(By.xpath(planXpath)).size()>0){
           WebElement selectPlan = getDriver().findElement(By.xpath(planXpath));
           getReusableActions().isElementVisible(planTable);
           getReusableActions().clickWhenReady(selectPlan, 10);
           selectPlan.click();
           planValue =Value;
       }
//       else {
//           WebElement selectPlan = getDriver().findElement(By.xpath(defaultplan));
//           getReusableActions().isElementVisible(planTable);
//           getReusableActions().clickWhenReady(selectPlan, 10);
//           selectPlan.click();
//           planValue ="15";
//       }
        //Wait for Cart Update
        getReusableActions().staticWait(5000);
        //getReusableActions().waitForTextToBePresentInElement(cart,planValue,10);
        System.out.println("Plan Selected : $" + planValue + ".00");
        getReusableActions().staticWait(12000);
        getReusableActions().javascriptScrollToMiddleOfPage();
        //getReusableActions().javascriptScrollByVisibleElement(planRemoveButton);
        scrollToMiddleOfElement(planRemoveButton);
        getReusableActions().staticWait(2000);
        reporterSnapshot(planRemoveButton, "$" + planValue, "", "DISPLAY");
    }

    public void selectAddOns() {
        String planAmount = planValue.getText();
        String addOnAmount = addOnsAmount.getText();
        System.out.println(planAmount + "  " + addOnAmount);
        int totalAmount = Integer.parseInt(planAmount) + Integer.parseInt(addOnAmount);
        getReusableActions().isElementVisible(addOns);
        getReusableActions().clickWhenReady(addOns, 10);
        getReusableActions().waitForTextToBePresentInElement(addOnCart, String.valueOf(totalAmount), 10);
        //reporter.reportLogWithScreenshot("AddOn is selected ");
        getReusableActions().staticWait(2000);
        reporterSnapshot(addOns,addOnAmount,"","NULL");
    }

    public void removeAddOns(String planAmount) {
        getReusableActions().isElementVisible(addOns);
        getReusableActions().clickWhenReady(addOns);
        getReusableActions().waitForTextToBePresentInElement(cart, planAmount, 10);
        getReusableActions().staticWait(2000);
        //reporter.reportLogWithScreenshot("AddOn is Removed");
        reporterSnapshot(addOns, planAmount, "", "NULL");
    }

    public void clickOnContinue() {
        //Click on Continue
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(continueButton);
        continueButton.click();
        //getReusableActions().clickWhenReady(continueButton,10);
    }

    public void validationCustomerGeolocation() {
        getReusableActions().javascriptScrollByVisibleElement(defaultLocation);
        getReusableActions().isElementVisible(defaultLocation);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(defaultLocation.getText().equals("Toronto, Ontario"),defaultLocation.getText(),"Default location not correct");
        reporterSnapshot(defaultLocation, "Toronto, Ontario","", "GEN"); //Toronto
        getReusableActions().isElementVisible(locationNotification);
        String NotificationMessage = locationNotification.getText();
        System.out.println(NotificationMessage);
        //reporter.softAssert(locationNotification.getText().equals("Please note, that rate plans are shown for the selected location. Make sure your geolocation is correct."),locationNotification.getText(),"Invalid Location Notification");
        reporterSnapshot(locationNotification, "The plans shown are for your selected region only, so make sure your location is correct before continuing.", "", "GEN");
    }

    public void findPlan(String planValue) {
        //Select Plan Value
        String planslistXpath = "//*[@id=\"ds-tabs-0-tabPanel-0\"]/div/div";
        String PlanOneSelect = "//*[@id=\"ds-tabs-0-tabPanel-0\"]/div/div[1]/lib-plan/div/div[1]/div[4]/button";
        String addonone = "//*[@id=\"ds-checkbox-id-11-label-container\"]/p";

        List<WebElement> Planlist = getDriver().findElements(By.xpath(planslistXpath));
        System.out.println("NO.of plans = " + Planlist.size());


        WebElement addon = getDriver().findElement(By.xpath(addonone));
        getDriver().findElement(By.xpath(PlanOneSelect)).click();


        System.out.println(addon.getText());

//        WebElement selectaddon = getDriver().findElement(By.xpath(addonXpath));
//        getReusableActions().isElementVisible(planTable);
//        getReusableActions().clickWhenReady(selectaddon,10);
//        selectPlan.click();
//        //Wait for Cart Update
//        getReusableActions().waitForTextToBePresentInElement(cart,planValue,10);
//        System.out.println("Plan Selected : $"+ planValue+".00");
//        getReusableActions().staticWait(2000);
//        reporter.reportLogWithScreenshot("Plan: " + planValue + " has been selected");
    }

    public void validateAddOnSelect() {
        getReusableActions().staticWait(5000);
//        String planAmount = cart.getText();
        String addOnAmount = addOnsAmount.getText();
//        System.out.println(planAmount + "  " + addOnAmount);
        //int totalAmount = planAmount + addOnAmount;
        getReusableActions().isElementVisible(addOns);
        scrollToMiddleOfElement(addOns);
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScriptClick(addOns);
        //addOns.click();
        getReusableActions().staticWait(7000);
        reporterSnapshot(addOns, "Add On","", "NULL");
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        getReusableActions().isElementVisible(oddOnAmtCart);
        //reporter.reportLogWithScreenshot("AddOn is selected ");
        reporterSnapshot(oddOnAmtCart, "ADDON " + addOnAmount, "", "NULL");
    }

    public void validateAddOnRemove(String planAmount) {
        getReusableActions().javascriptScrollByVisibleElement(addOns);
        getReusableActions().isElementVisible(addOns);
        getReusableActions().clickWhenReady(addOns);
        getReusableActions().waitForTextToBePresentInElement(cart, planAmount, 10);
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(cartMonthlyPlan);
        getReusableActions().staticWait(2000);
        //reporter.reportLogWithScreenshot("AddOn is Removed");
        reporterSnapshot(oddOnAmtCart, "AddOn", "", "NOTVISIBLE");
    }

    public void clickOnLocationLink() {
        getReusableActions().javascriptScrollByVisibleElement(notYourLocationButton);
        getReusableActions().staticWait(3000);
        notYourLocationButton.click();
        getReusableActions().staticWait(2000);
    }

    public void validateSelectedPlan(String plan) {
        getReusableActions().javascriptScrollByVisibleElement(selectPlan);
        if (selectPlan.getText().equals(plan)) {
            //reporter.softAssert(selectPlan.getText().equals(plan), "plan is not change", "plan is change");
            reporterSnapshot(selectPlan,plan,"","common");
        } else {
            //reporter.softAssert(!selectPlan.getText().equals(plan), "plan is change", "plan is not change");
            reporterSnapshot(selectPlan,plan,"","notcommon");

        }
    }

    public String getLocationSelected() {
        getReusableActions().javascriptScrollByVisibleElement(changeLocation);
        String Location = changeLocation.getText();
        return Location;
    }

    public void validateChangeLocation(String cityLocation) {
        getReusableActions().javascriptScrollByVisibleElement(changeLocation);
        getReusableActions().staticWait(3000);
        reporter.softAssert(!changeLocation.getText().equals(cityLocation), changeLocation.getText(), "city not change");
    }

    public void selectPlanTab(String options) {
        switch (options) {
            case "4G Nation-Wide Talk, Text & Data":
                getReusableActions().clickWhenReady(planSelection4G, 10);
                planSelection4G.click();
                reporterSnapshot(planSelection4G, "4G Nation-Wide Talk, Text & Data", "", "VISIBLE");
                break;
            case "3G Nation-Wide Talk, Text & Data":
                //reporter.softAssert(getReusableActions().isElementVisible(planSelection3G),"eligible plan display","eligible plan not display");
                getReusableActions().clickWhenReady(planSelection3G, 20);
                planSelection3G.click();
                reporterSnapshot(planSelection3G, "3G Nation-Wide Talk, Text & Data", "", "VISIBLE");
                break;
            case "3G Nation-Wide Talk & Text":
                getReusableActions().clickWhenReady(planSelection3GN, 10);
                planSelection3GN.click();
                reporterSnapshot(planSelection3GN, "3G Nation-Wide Talk & Text", "", "VISIBLE");
                break;
            case "3G Nation-Wide Data":
                getReusableActions().clickWhenReady(planSelection3GD, 10);
                planSelection3GD.click();
                reporterSnapshot(planSelection3GD, "3G Nation-Wide Data", "", "VISIBLE");
                break;
        }
    }

    public void ppcSelectPlanTab(String options) {
        getReusableActions().staticWait(4000);
        switch (options) {
            case "4G Nation-Wide Talk, Text & Data":
                getReusableActions().javascriptScrollByVisibleElement(ppcplanSelection4G);
                ppcplanSelection4G.click();
                reporterSnapshot(ppcplanSelection4G, "4G Nation-Wide Talk, Text & Data", "", "VISIBLE");
                break;
            case "3G Nation-Wide Talk, Text & Data":
                getReusableActions().javascriptScrollByVisibleElement(ppcplanSelection3G);
                ppcplanSelection3G.click();
                reporterSnapshot(ppcplanSelection3G, "3G Nation-Wide Talk, Text & Data", "", "VISIBLE");
                break;
            case "3G Nation-Wide Talk & Text":
                getReusableActions().javascriptScrollByVisibleElement(ppcplanSelection3GN);
                ppcplanSelection3GN.click();
                reporterSnapshot(ppcplanSelection3GN, "3G Nation-Wide Talk & Text", "", "VISIBLE");
                break;
            case "3G Nation-Wide Data":
                getReusableActions().javascriptScrollByVisibleElement(ppcplanSelection3GD);
                ppcplanSelection3GD.click();
                reporterSnapshot(ppcplanSelection3GD, "3G Nation-Wide Data", "", "VISIBLE");
                break;
        }
    }

    public String getFirstName() {
        String firstNameValue = firstNameInput.getAttribute("value");
        return firstNameValue;
    }

    public String getLastName() {
        String lastNameValue = lastNameInput.getAttribute("value");
        return lastNameValue;
    }

    public void addOnAddInCart() {
        getReusableActions().staticWait(3000);
        getReusableActions().isElementVisible(addOns);
        addOns.click();
        getReusableActions().staticWait(5000);
        //reporter.reportLogWithScreenshot("add0n is selected");
        getReusableActions().javascriptScrollByVisibleElement(orderSummaryLable);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(Add_onCart.isDisplayed(),Add_onCart.getText(),"add_on not add in cart");
        reporterSnapshot(Add_onCart, Add_onCart.getText(), "", "display");

    }

    public void addOnRemoveInCart() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(addOns);
        getReusableActions().staticWait(2000);
        addOns.click();
        getReusableActions().staticWait(3000);
        //reporter.reportLogWithScreenshot("addOn is remove");
        getReusableActions().javascriptScrollByVisibleElement(orderSummaryLable);
        //getReusableActions().javascriptScrollToTopOfPage();
        //reporter.softAssert(!getReusableActions().isElementVisible(Add_onCart),"AddOn is remove","Addon is not remove");
        //reporterSnapshot(Add_onCart,Add_onCart.getText(),"","NOTdisplay");
        int objSize = getDriver().findElements(By.xpath("//div[text()='One-time services']/following-sibling::div")).size();
        reporterSnapshot(Add_onCart, Integer.toString(objSize), "1", "Match1");
    }

    public void clickOnProceedButton() {
        getReusableActions().staticWait(7000);
        getReusableActions().javascriptScrollByVisibleElement(proceedButton);
        getReusableActions().staticWait(2000);
        proceedButton.click();
    }

    public void validatePlanNotSelected() {
        //getReusableActions().javascriptScrollByVisibleElement(noPlanSelect);
        //reporter.softAssert(noPlanSelect.isDisplayed(), "plan not selected:"+noPlanSelect.getText(),"plan is already select");
        int objSize = getDriver().findElements(By.xpath("//button[@title='Remove']")).size();
        reporterSnapshot(proceedButton, Integer.toString(objSize), "1", "Match1");
        //reporterSnapshot(noPlanSelect,noPlanSelect.getText(),"","display");
    }

    public void validatePlanDetailHiddenSection() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(planDetail);
//        reporterSnapshot(promotionText, promotionText.getText(), "", "display");
//        getReusableActions().javascriptScrollByVisibleElement(planDetail);
        planDetail.click();
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(threeGSpeedData);
        getReusableActions().staticWait(5000);
        reporterSnapshot(threeGSpeedData, "4G speed Data", "", "display");
        reporterSnapshot(ppcEligibleTalk, "ppc Eligible Talk", "", "display");
        getReusableActions().javascriptScrollByVisibleElement(unlimitedText);
        reporterSnapshot(unlimitedText, "unlimited Text", "", "display");
        reporterSnapshot(voicemail, "voice mail", "", "display");
//        getReusableActions().javascriptScrollByVisibleElement(firstPromotions);
//        getReusableActions().staticWait(3000);
        //reporterSnapshot(firstPromotions, "first Promotions", "", "display");
        //reporterSnapshot(secondPromotions,"Second Promotions","","display");
        //getReusableActions().staticWait(2000);
        planDetail.click();
    }

    public void validateProceedButton() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollToBottomOfPage();
        int objSize = getDriver().findElements(By.xpath("(//span[contains(text(),'Proceed')])[1]")).size();
        reporterSnapshot(proceedButton, Integer.toString(objSize), "1", "Match1");
    }

    public void validateShoppingCartAndSequence() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(orderSummaryLable);
        reporterSnapshot(orderSummaryLable, "order Summary", "", "display");
        reporterSnapshot(calculationSection, "calculation Section", "", "display");
        reporterSnapshot(totalDueToday, "total Due Today", "", "display");
    }

    public void selectAnyPlan() {
        //Select Plan Value
        String planXpath = "//button[@title=\"Select plan to add in the cart\"]";
        WebElement selectPlan = getDriver().findElement(By.xpath(planXpath));
        getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().isElementVisible(planTable);

        getReusableActions().javascriptScrollByVisibleElement(selectPlan);
        getReusableActions().clickWhenReady(selectPlan, 10);
        //selectPlan.click();
        //Wait for Cart Update
        //getReusableActions().waitForTextToBePresentInElement(cart,planValue,10);
        System.out.println("Plan Selected : $.00");
        getReusableActions().staticWait(5000);

        reporter.reportLogWithScreenshot("Plan:  has been selected");
    }

    public void selectPlanSS() {
        getReusableActions().staticWait(5000);
        String planSelect = "//div[@class=\"plan-select-button__container w-100 w-sm-auto ng-star-inserted\"]";
        getDriver().findElement(By.xpath(planSelect)).click();
        getReusableActions().staticWait(5000);
    }

    public void selectPlanFrench(String planValue) {
        //Select Plan Value
        String planXpath = "//div[.//*[contains(.,'" + planValue + "')]][contains(@class, 'plan-price')]/following-sibling::div[contains(@class, 'plan-select')]/button";
        List<WebElement> selectPlan = getDriver().findElements(By.xpath(planXpath));
        getReusableActions().isElementVisible(planTable);
        if (selectPlan.size() > 1) {
            selectPlan.get(0).click();
        } else {
            selectPlan.get(0).click();
        }
        //Wait for Cart Update
        getReusableActions().waitForTextToBePresentInElement(cart, planValue, 10);
        System.out.println("Plan Selected : $" + planValue + ".00");
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(planRemoveButtonFrench);
        getReusableActions().staticWait(2000);
        //reporter.reportLogWithScreenshot("Plan: " + planValue + " has been selected");
        reporterSnapshot(planRemoveButtonFrench, "$" + planValue, "", "Display");
    }

    public void clickOnContinueFrench() {
        //Click on Continue
        continueButtonFrench.click();
        //getReusableActions().clickWhenReady(continueButton,10);
    }

    public void validateSelectPlanTab() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(planSelection4G);
        getReusableActions().clickWhenReady(planSelection4G, 10);
        //planSelection4G.click();
        reporterSnapshot(planSelection4G, "4G Nation-Wide Talk, Text & Data", "", "VISIBLE");
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(planSelection4G);
        getReusableActions().clickWhenReady(planSelection3G, 10);
        //planSelection3G.click();
        reporterSnapshot(planSelection3G, "3G Nation-Wide Talk, Text & Data", "", "VISIBLE");
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(planSelection4G);
        getReusableActions().clickWhenReady(planSelection3GN, 10);
        //planSelection3GN.click();
        reporterSnapshot(planSelection3GN, "3G Nation-Wide Talk & Text", "", "VISIBLE");
        getReusableActions().staticWait(2000);
        //getReusableActions().javascriptScrollByVisibleElement(planSelection4G);
        //getReusableActions().clickWhenReady(planSelection3GD, 10);
        //planSelection3GD.click();
    }

    public void validatePromotionUsage() {
        getReusableActions().staticWait(2000);

        getReporter().softAssert(true, "Promotional Usage is displayed", "Promotional Usage is not displayed");
    }

    public void validatePromotionDisplay() {
        getReusableActions().staticWait(2000);
    }

    public void validateHiddenPlanDetails() {
        //getReusableActions().javascriptScrollByVisibleElement(promotionsOnPlan);
        //reporter.softAssert(getReusableActions().isElementVisible(promotionsOnPlan),promotionsOnPlan.getText() +" is display","promotion on plan not display");
        getReusableActions().javascriptScrollByVisibleElement(planHiddenDetails);
        planHiddenDetails.click();
        reporterSnapshot(planRemoveButton, "Plan Hidden Details", "", "display");
        //reporter.reportLogWithScreenshot("click on details");
        /*getReusableActions().javascriptScrollByVisibleElement(promotionsFirst);
        getReusableActions().staticWait(2000);*/
        //reporter.softAssert(getReusableActions().isElementVisible(promotionsFirst),promotionsFirst.getText()+" is display","promotion not display");
    }

    public void selectManageAddOns() {
        getReusableActions().isElementVisible(addOns);
        getReusableActions().clickWhenReady(addOns, 10);
        reporter.reportLogWithScreenshot("AddOn is selected ");
    }

    public void clickOnContinueAddon() {
        //Click on Continue
        getReusableActions().staticWait(5000);
        //getReusableActions().executeJavaScriptClick(continueButtonAddOn);
        continueButtonAddOn.click();
    }

    public void selectAnyPlan_Retail() {
        //Select Plan Value
        getReusableActions().javascriptScrollToMiddleOfPage();
        String planXpath = "//button[contains(@title,'Select')]";
        WebElement selectPlan = getDriver().findElement(By.xpath(planXpath));
        getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().isElementVisible(planTable);

        getReusableActions().javascriptScrollByVisibleElement(selectPlan);
        getReusableActions().clickWhenReady(selectPlan, 10);
        //selectPlan.click();
        //Wait for Cart Update
        //getReusableActions().waitForTextToBePresentInElement(cart,planValue,10);
        System.out.println("Plan Selected : $.00");
        getReusableActions().staticWait(5000);

        reporter.reportLogWithScreenshot("Plan:  has been selected");
    }

    public void validateProrationAdjustmentSummaryDisplay() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(prorationAdjustment);
        getReusableActions().staticWait(3000);
        reporterSnapshot(prorationAdjustment, "ProrationAdjustment Summary", "", "DISPLAY");
    }

    public void selectOrRemoveAddOn(String addOnName) {
        //Select Plan Value
        String addOnXpath = "//p[contains(text(),'" + addOnName + "')]";
        WebElement addOnChkbox = getDriver().findElement(By.xpath(addOnXpath));
        getReusableActions().isElementVisible(addOnChkbox);
        getReusableActions().clickWhenReady(addOnChkbox, 10);
        addOnChkbox.click();
        //Wait for Cart Update
        getReusableActions().staticWait(5000);
        //getReusableActions().waitForTextToBePresentInElement(cart,planValue,10);
        System.out.println("AddOn Selected : $" + addOnChkbox.getText());
    }

    public void validateMutuallyExclusiveAddOnErrorDisplay(String passCondition) {
        if (passCondition.equalsIgnoreCase("DISPLAY")) {
            reporterSnapshot(mutuallyExcluxiveAddOnError, "", "", "DISPLAY");
            getReusableActions().staticWait(4000);
        } else {
            reporterSnapshot(mutuallyExcluxiveAddOnError, "", "", "NOTDISPLAY");
            getReusableActions().staticWait(4000);
        }
    }

    public void validateProrationVsMSF(String type, String currentMSF, String newMSF) {
        getReusableActions().staticWait(2000);
        switch (type.toUpperCase()) {
            case "DOWNGRADE"://NO SHOW
                reporterSnapshot(null, "proration Adjustment", String.valueOf(
                        prorationAdjustmentList == null ? 0 : prorationAdjustmentList.size()), "hidden");
                //reporterSnapshot(prorationAdjustment, "", "", "NOTDISPLAY");
                break;
            case "SAMEMSF"://PRORATION=(remdays/totaldays)*planfee
                scrollToMiddleOfElement(prorationAdjustment);
                reporterSnapshot(prorationAdjustment, "", "", "DISPLAY");
                break;
            case "UPGRADEWITHIN3DAYS"://PRORATIONADJUSTMENT 0
                break;
            case "UPGRADENOTWITHIN3DAYS"://PRORATION=(remdays/totaldays)*planfee
                break;
            case "UPGRADE":
                scrollToMiddleOfElement(prorationAdjustment);
                reporterSnapshot(prorationAdjustment,prorationAdjustment.getText(), "", "display");
                break;

        }
    }
    public void validateUnSelectAddon() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(dataAddOn);
        getReusableActions().staticWait(1000);
        reporterSnapshot(dataAddOn, "Add Un Selceted ", "", "NULL");
    }
    public void selectCompatibleAddOns(){
        getReusableActions().waitForElementVisibility(addOn1);
    //getReusableActions().scrollToElement(addOn1);
        addOn1.click();
        getReusableActions().staticWait(5000);
        addOn2.click();
    //getReusableActions().scrollToElement(addOn3);
        getReusableActions().staticWait(5000);
        addOn3.click();
        getReusableActions().staticWait(5000);
        getReusableActions().executeJavaScript("document.body.style.zoom='70%'");
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(addOn1);
        getReusableActions().staticWait(1000);
        reporterSnapshot(addOn1,"Add-ons","","Display");
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(4000);
    }

    public void  validateAddonNotCompatibleErrorMessage(){

    getReusableActions().waitForElementVisibility(notCompatibleError.get(0));
    getReusableActions().scrollToElement(notCompatibleError.get(0));
    reporterSnapshot(notCompatibleError.get(0),"This addon is not compatible with","","COMMON");
    }
    public void  validateErrorMessageIsNotPresent(){;
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().staticWait(2000);
        reporterSnapshot(null,"not Compatible Error Message ", String.valueOf(
                notCompatibleError ==null ? 0 : notCompatibleError.size()), "HIDDEN");

    }
    public void unCheckCompatibleAddOns(){
        getReusableActions().waitForElementVisibility(addOn1);
        getReusableActions().staticWait(4000);
        addOn2.click();
    }
    public void validateAddonDetailsRemovedFromOrderSummary(String addOn1,String addOn2) {
        getReusableActions().staticWait(3000);
         getReusableActions().scrollToElement((getDriver().findElement(By.xpath("//span[contains(text(),'" + addOn1 + "')]"))));
        List<WebElement> addOns = getDriver().findElements(By.xpath("//span[contains(text(),'" + addOn2 + "')]"));
        reporterSnapshot(null,"Addon removed from Cart ", String.valueOf(
                addOns ==null ? 0 : addOns.size()), "HIDDEN");

    }
    public void validateAddonDetailsOrderSummary(String addOn1,String addOn2) {
        getReusableActions().staticWait(3000);
        //getReusableActions().scrollToElement(getDriver().findElement(By.xpath("//span[contains(text(),'" + addOn1 + "')]")));
        scrollToMiddleOfElement(getDriver().findElement(By.xpath("//span[contains(text(),'" + addOn1 + "')]")));
        getReusableActions().staticWait(2000);
        reporterSnapshot((getDriver().findElement(By.xpath("//span[contains(text(),'" + addOn1 + "')]"))), addOn1, "", "COMMON");
        getReusableActions().scrollToElement((getDriver().findElement(By.xpath("//span[contains(text(),'" + addOn2 + "')]"))));
        reporterSnapshot((getDriver().findElement(By.xpath("//span[contains(text(),'" + addOn2 + "')]"))), addOn2, "", "COMMON");
    }
    public void selectAvailableAddon() {
//        getReusableActions().scrollToElement(addOn1);
        scrollToMiddleOfElement(addOn1);
        addOn1.click();
        reporter.reportLogWithScreenshot("AddOn Selected");
        getReusableActions().staticWait(5000);

    }

    public void selectPlanWithIndex(String planValue, String index) {
        //Select Plan Value
        if (index.equals("")) {
            String planXpath = "//div[.//*[contains(.,'" + planValue + "')]][contains(@class, 'plan-price')]/following-sibling::div[contains(@class, 'plan-select')]/button";
            WebElement selectPlan = getDriver().findElement(By.xpath(planXpath));
            getReusableActions().isElementVisible(planTable);
            getReusableActions().clickWhenReady(selectPlan, 10);
            selectPlan.click();
            //Wait for Cart Update
            getReusableActions().staticWait(5000);
            //getReusableActions().waitForTextToBePresentInElement(cart,planValue,10);
            System.out.println("Plan Selected : $" + planValue + ".00");
            getReusableActions().staticWait(3000);
            getReusableActions().javascriptScrollToMiddleOfPage();
            getReusableActions().javascriptScrollByVisibleElement(planDivSelected);
            getReusableActions().staticWait(2000);
            reporterSnapshot(planDivSelected, "$" + planValue, "", "DISPLAY");
        }else{
            String planXpath = "(//div[.//*[contains(.,'" + planValue + "')]][contains(@class, 'plan-price')]/following-sibling::div[contains(@class, 'plan-select')]/button)["+index+"]";
            WebElement selectPlan = getDriver().findElement(By.xpath(planXpath));
            System.out.println("Before Selecting__"+selectPlan.getText());
            getReusableActions().isElementVisible(planTable);
            getReusableActions().clickWhenReady(selectPlan, 10);
            selectPlan.click();
            //Wait for Cart Update
            getReusableActions().staticWait(5000);
            //getReusableActions().waitForTextToBePresentInElement(cart,planValue,10);
            System.out.println("Plan Selected : $" + planValue + ".00");
            getReusableActions().staticWait(5000);

            String planXpathB = "(//div[.//*[contains(.,'" + planValue + "')]][contains(@class, 'plan-price')]/following-sibling::div[contains(@class, 'plan-select')]/button)["+index+"]";
            WebElement selectPlanB = getDriver().findElement(By.xpath(planXpathB));
            System.out.println("After Selecting__"+selectPlanB.getText());
            getReusableActions().staticWait(3000);
            getReusableActions().javascriptScrollToMiddleOfPage();
            getReusableActions().javascriptScrollByVisibleElement(planDivSelected);
            getReusableActions().staticWait(2000);
            reporterSnapshot(planDivSelected, "$" + planValue, "", "DISPLAY");
        }
    }
    public void validateStackedPromotionsInCart(){
        getReusableActions().javascriptScrollByVisibleElement(promotionInCart);
        getReusableActions().staticWait(2000);
        reporterSnapshot(cartPromotionRows.get(0), "Promotions Added  : " + cartPromotionRows.get(0).getText(), "", "DISPLAY");
//       for (WebElement w: cartPromotionRows){
//           reporterSnapshot(w, "Promotions Added  : " + w.getText(), "", "DISPLAY");
//       }
    }
    public void validateStackedPromotionsInOrderConfirmation(){
        getReusableActions().staticWait(3000);
        for (WebElement w: orderConfirmationPromotionRows){
            reporterSnapshot(w, "Promotions Added  : " + w.getText(), "", "DISPLAY");
        }
    }
    public void getProrationAmount(String CurrentMSF) throws ParseException {
       String anniversaryDtString = anniversaryDateElement.getText().trim();
                //        DateTimeFormatter formatTobe = DateTimeFormatter.ofPattern("YYYY-MMM-DD");
//        LocalDate date = LocalDate.parse("2023-Sep-26", formatTobe);
//        System.out.println("ann date anniversaryDateElement.getText() todays date "+todaysDate+"   "+date);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        String formattedString= anniversaryDtString.split(" ")[1]+"-"+anniversaryDtString.split(" ")[0]+"-"+LocalDate.now().getYear();//"7-Jun-2013";
        Date anniversaryDate = formatter.parse(formattedString);
        Date todaysDate = formatter.parse(LocalDate.now().toString());
        System.out.println("anniversarydate "+anniversaryDate);
        System.out.println("todays date  "+todaysDate);
//        long diffInMillies = Math.abs(anniversaryDate.getTime() - formatter.format(date).get);
//        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
//        System.out.println( "no of days " +diff);
    }
    public void validatePromotionDetailInPlanPage(){
        getReusableActions().javascriptScrollByVisibleElement(promotionInPlanPage);
        getReusableActions().staticWait(2000);
        reporterSnapshot(oneTimeCreditBackProm,oneTimeCreditBackProm.getText(),"","display");
    }
    public String selectRandom4GPlan() {
        getReusableActions().staticWait(6000);
        scrollToMiddleOfElement(ppcplanSelection4G);
        reporterSnapshot(ppcplanSelection4G, "4G Nation-Wide Talk, Text & Data", "", "VISIBLE");
        getReusableActions().staticWait(2000);
        String planValue ="";
        //String arrPlan[] = {"29", "34", "40", "50"};
        String arrPlan[] = {"34", "40", "50"};
        for (int i = 0; i < arrPlan.length; i++) {
            String planXpath = "(//div[.//*[contains(.,'" + arrPlan[i] + "')]][contains(@class, 'plan-price')]/following-sibling::div[contains(@class, 'plan-select')]/button)[1]";//2
            if (getDriver().findElements(By.xpath(planXpath)).size() > 0) {
                WebElement selectPlan = getDriver().findElement(By.xpath(planXpath));
                getReusableActions().isElementVisible(planTable);
                getReusableActions().clickWhenReady(selectPlan, 10);
                selectPlan.click();
                getReusableActions().staticWait(7000);
                planValue = arrPlan[i];
                System.out.println("Selected Plan == " + planValue);
                scrollToMiddleOfElement(planRemoveButton);
                getReusableActions().staticWait(4000);
                reporterSnapshot(planRemoveButton, "$" + planValue, "", "DISPLAY");
                getReusableActions().staticWait(2000);
                break;
            }
        }
        return planValue;
    }
    public String findHigherAvailable4GPlan(String currentPlan) {
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(ppcplanSelection4G);
        reporterSnapshot(ppcplanSelection4G, "4G Nation-Wide Talk, Text & Data", "", "VISIBLE");
        getReusableActions().staticWait(2000);
        System.out.println("CurrentPlan -- "+currentPlan);
        String planValue ="";
        String arrPlan[] = {"29", "34", "40", "50"};
        for (int i = 0; i < arrPlan.length; i++) {
           if (((int) Integer.parseInt(arrPlan[i]))>((int) Integer.parseInt(currentPlan))){
               planValue=arrPlan[i];
               break;
           }
        }
        System.out.println("Higher Available Plan -- "+planValue);
        return planValue;
    }
    public String findLowerAvailable4GPlan(String currentPlan) {
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(ppcplanSelection4G);
        reporterSnapshot(ppcplanSelection4G, "4G Nation-Wide Talk, Text & Data", "", "VISIBLE");
        getReusableActions().staticWait(2000);
        String planValue ="";
        String arrPlan[] = { "50", "40","34","29" };
        for (int i = 0; i < arrPlan.length; i++) {
            if (((int) Integer.parseInt(arrPlan[i]))<((int) Integer.parseInt(currentPlan))){
                planValue=arrPlan[i];
                break;
            }
        }
        System.out.println("Lower rAvailable Plan -- "+planValue);
        return planValue;
    }
    public void selectToPlan() {
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(toPlanButton);
        reporterSnapshot(toPlanButton, " TO plan  ", "", "DISPLAY");
        toPlanButton.click();
        getReusableActions().staticWait(6000);
        getReusableActions().javascriptScrollByVisibleElement(exclusiveTargetedOffer);
        getReusableActions().staticWait(1000);
        reporterSnapshot(toPlanButton, " TO plan Selected ", "", "DISPLAY");
        getReusableActions().staticWait(2000);
    }
}

