package com.rogers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class HeaderComponent extends BasePage {

    @FindBy(xpath = "//*[text()=' Plans ']")
    WebElement plans;
    @FindBy(xpath = "(//span[normalize-space()='Sign-in'])[1]")
    WebElement signIn;
    @FindBy(xpath = "//*[@title = 'Activate']")
    WebElement activate;
    @FindBy(xpath = "//a[@aria-label='Top-up']")//(//*[contains(@title,'Top-up')])[1]
    WebElement topUp;
    @FindBy(xpath = "(//a[contains(@title,'Recharge')])[1]")
    WebElement topUpFrench;
    @FindBy(xpath = "//*[@title='Store']")
    WebElement store;
    @FindBy(xpath = "//app-header-chatr/div[1]/div/div/div/button[1]")
    WebElement frenchCTA;
    @FindBy(xpath = "//app-header-chatr/div[1]/div/div/div/button[1]")
    WebElement englishCTA;
    @FindBy(xpath = "(//a[contains(text(),'Coverage')])[2]")
    WebElement coverageMap;
    @FindBy(xpath = "//a[normalize-space()='Legacy Sign in']")
    WebElement legacySignIn;
    @FindBy(xpath = "//div/div[2]/form/div[1]/div")
    WebElement phoneNumberText;
    @FindBy(xpath = "//input[@formcontrolname='phonenumber']")
    WebElement phoneNumberInput;
    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    WebElement submitButton;
    @FindBy(xpath = "//a[text()=' My chatr ']")
    WebElement myChatr;
    @FindBy(xpath = "(//a[@aria-labe='Sign into my chatr'])[3]") //a[contains(text(),'My chatr')]") //(//a[@title='Sign into my chatr'])[1]") //a[contains(@aria-label,'Sign in now')]")
    WebElement signInCTA;
    @FindBy(xpath = "//button[@aria-label='Plan details tab ']")
    WebElement currentPlan;
    @FindBy(xpath = "//span[contains(text(),'Manage add-ons')]")
    WebElement manageAddOn;
    @FindBy(xpath = "//h4[contains(text(),\"Currently active add-ons\")]")
    WebElement activeAddons;
    @FindBy(xpath = "//*[contains(text(),\"Include some add-ons to boost your experience:\")]")
    WebElement eligibleAddons;
    @FindBy(xpath = "//*[contains(text(),\"Top-up\")]")
    WebElement topUpCTA;
    @FindBy(xpath = "(//*[contains(text(),\"Top-up\")])[2]")
    WebElement topUpFooter;
    @FindBy(xpath = "//*[contains(text(),\"$\")]")
    WebElement balance$;
    @FindBy(xpath = "//div[contains(text(),'Mastercard')]") //*[@aria-label=\"Payment method\"]//div[@class=\"ds-radioButton__innerCircle\"]")
    WebElement creditCardRadioBtn;
    @FindBy(xpath = "//*[@formcontrolname=\"amount\"]")
    WebElement topUpAmtField;
    @FindBy(xpath = "(//ds-error/span)[1]")
    WebElement errorExceeds300$;
    @FindBy(xpath = "//span[contains(text(),' Get add-ons ')]")
    WebElement selectAddOnLink;
    @FindBy(xpath = "//label[@class=\"ds-checkboxLabel d-inline-flex align-items-start\"]/div")
    WebElement addOnCheckbox;
    @FindBy(xpath = "//*[contains(text(),\"Total due today\")]")
    WebElement totalDueToday;
    @FindAll({@FindBy(xpath = "//*[contains(text(),\"Order summary\")]"),@FindBy(xpath = "//*[contains(text(),\"Order Summary\")]"),@FindBy(xpath = "//*[contains(text(),\"Order\")]")})  //PPC - Order summary
    WebElement orderSummary;
    @FindBy(xpath = "//span[contains(text(),\"Continue\")]")
    WebElement continueBtnMAO;
    @FindBy(xpath = "//span[contain(text(),\"edit\")]")
    WebElement editBtn_NewAddon;
    @FindBy(xpath = "//*[@class=\"ds-checkbox__box my-12\"])[1]")
    WebElement MAOTnCcheckbox1;
    @FindBy(xpath = "//span[contains(text(),'Agree to the terms')]")//span[contains(text(),\"Please check the checkbox in order to proceed\")]")
    WebElement MAOcheckbox_error;
    @FindBy(xpath = "//span[contains(text(),\" Show top-up options \")]")
    List<WebElement> showTopUpOptions;
    @FindBy(xpath = "//span[contains(text(),\" Address \")]")
    List<WebElement> listAddressElements;
    @FindBy(xpath = "//p[contains(text(),\"Use other card\")]")
    WebElement useOtherCard;
    @FindBy(xpath = "(//div[@class=\"ds-radioButton__innerCircle\"])[4]")
    WebElement chatrTopUpRadioBtn;
    @FindBy(xpath = "//*[contains(text(),\"Please enter TopUp pin to continue\")]")
    WebElement topUpWithoutPinError;
    @FindBy(xpath = "(//div[@class=\"ds-price__amountDollars text-semi ng-star-inserted\"])[2]")//(//*[@class="dsa-orderTable__copy text-bold"])[1]  //(//*[@class="dsa-orderTable__copy position-relative text-bold"])[1]
    WebElement accountBalUsedInDollars;
    @FindBy(xpath = "(//div[@class='ds-price__amountDollars text-semi ng-star-inserted'])[1]")
    WebElement addOnAmountInDollars;
    @FindBy(xpath = "//*[contains(text(),\" Change plan\")]")
    WebElement changePlanBtn;
    @FindBy(xpath = "//*[contains(text(),\"Proceed\")]")
    WebElement planProceedBtn;
    @FindBy(xpath = "(//*[@class=\"ds-checkbox__box my-12\"])[2]")
    WebElement MAOTnCcheckbox2;
    @FindBy(xpath = "//span[contains(text(),\" Save order summary \")]")//button[@title="Save summary Description"]//span//span
    WebElement saveSummaryButton;
    @FindBy(xpath = "//span[contains(text(),\"Order num\")]")   //span[contains(text(),"Order #:")]
    WebElement orderNum;
    @FindBy(xpath = "//span[contains(text(),\"Order date\")]")   //span[contains(text(),"Order created:")]
    WebElement orderCreatedDate;
    @FindBy(xpath = "//span[contains(text(),\"Your location\")]")  //span[contains(text(),"Place of contract:")]
    WebElement placeOfContract;
    @FindBy(xpath = "//*[@class=\"ds-input w-100 text-body mb-0 pt-16 ds-bgcolor-transparent ds-mask ng-tns-c64-7 cdk-text-field-autofill-monitored ng-pristine ng-invalid ng-touched -hidden\"]")
    WebElement topUpCardField;

    @FindBy(xpath = "(//span[contains(text(),\"Data Autopay Bonus 2GB\")])[2]")
    List<WebElement> autopayBonusBlock;
    @FindBy(xpath = "//button[contains(@title,'Details')]")
    WebElement planDetailsBtn;
    @FindBy(xpath ="//input[contains(@aria-label,'Top-up')]")
    WebElement topUpCardFieldRetail;
    @FindBy(xpath ="//span[@class=\"ds-icon d-inline-flex cds-icon-exclamation-circle ds-color-error\"]")
    WebElement error_UsedTopUpCard;
    @FindBy(xpath = "//ds-radio-group[@aria-label=\"Payment method\"]/following-sibling::div")
    WebElement chatrTopUpContinueBtn;
    @FindBy(xpath ="//*[contains(text(),'This top up card is not recognized.')]")
    WebElement error_InvalidTopUpCard;
    @FindBy(xpath ="//p[contains(text(),' Your account is barred from using voucher until ')]")
    WebElement error_AccountBarred;
    @FindBy(xpath ="//*[contains(text(),'The format of Pin is invalid, please try again late')]")
    WebElement error_InvalidFormatTopUpCard;
    @FindBy(xpath ="(//*[contains(text(),'extra money')])[2]")
    List<WebElement> MSFWarning_greater;
    @FindBy(xpath="(//*[contains(text(),'Top-up card with a value that is less than the actual amount')])[2]")
    List<WebElement> MSFWarning_lesser;
    @FindBy(xpath="//h5[contains(text(),'Customize your plan with add-ons')]/parent::div//*[contains(@class,\"ds-price__amountDollars\")]")
    WebElement addOnValue;
    @FindBy(xpath="//div[contains(text(),'One-time fees')]/parent::div//*[@class=\"dsa-orderTable__copy text-bold\"]")
    WebElement addOnValueOrderSummary;
    @FindBy(xpath = "//span[contains(text(),'Sign out')]")
    WebElement signOutButton;
    @FindBy(xpath = "//app-header-chatr//span/a[2]/span")
    WebElement signInButton;
    @FindBy(xpath = "//div[@class='text-overline']")
    WebElement autoPaySection;

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public void clickPlans() {
        getReusableActions().waitForElementVisibility(plans);
        reporterSnapshot(plans,"PLANS","","GEN");
        plans.click();
    }

    public void clickSignIn() {
        getReusableActions().staticWait(3000);
        getReusableActions().waitForElementTobeClickable(signInCTA,10);
        if(System.getProperty("Browser").equals("sauceandroidchrome")){
            reporterSnapshot(signInCTA, "Chatr Home Page", "", "NULL");
            getReusableActions().staticWait(500);
            getReusableActions().clickWhenReady(signInCTA);
            getReusableActions().staticWait(2000);
        }
        else {
            String parent = getDriver().getWindowHandle();
            if (System.getProperty("Browser").contains("sauce")) {
                reporterSnapshot(signInCTA, "Chatr Home Page", "", "NULL");
                getReusableActions().staticWait(500);
                getActionsInstance().keyDown(Keys.COMMAND).click(signInCTA).keyUp(Keys.COMMAND).perform();
            } else {
                reporterSnapshot(signInCTA, "Chatr Home Page", "", "NULL");
                getReusableActions().staticWait(500);
                getActionsInstance().keyDown(Keys.CONTROL).click(signInCTA).keyUp(Keys.CONTROL).perform();
            }
            getReusableActions().staticWait(5000);
//            getDriver().close();
//            getReusableActions().switchToNewWindow();
//            getReusableActions().staticWait(4000);
            if (getDriver().findElements(By.xpath("//span[contains(text(),'Submit')]")).size() > 0 ) {
                getDriver().findElement(By.xpath("//input[@type='text']")).click();
               // getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("4163197179"); //QA-AUTO 2
                getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("4168172628"); //QA-AUTO
                getDriver().findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
                getReusableActions().staticWait(5000);
               /* getDriver().findElement(By.xpath("//span[@role='text']")).click();
                getReusableActions().staticWait(3000);
                getDriver().findElement(By.xpath("//span[contains(text(),'Sign in to My chatr ')]")).click();
                getReusableActions().staticWait(3000);*/
            }
        }
        /*getReusableActions().staticWait(4000);
>>>>>>> master_e2e_DC_V1.0
        String parent = getDriver().getWindowHandle();
        if (System.getProperty("Browser").equalsIgnoreCase("saucechrome")) {
            getActionsInstance().keyDown(Keys.COMMAND).click(signInCTA).keyUp(Keys.COMMAND).perform();
        } else {
            getActionsInstance().keyDown(Keys.CONTROL).click(signInCTA).keyUp(Keys.CONTROL).perform();
        }
        getDriver().close();
        getReusableActions().switchToNewWindow();
        System.out.println("child" + getDriver().getWindowHandle() + "Parent" + parent);

        getReusableActions().staticWait(4000);
        if (getDriver().findElements(By.xpath("//span[contains(text(),'Submit')]")).size() > 0 ) {
            getDriver().findElement(By.xpath("//input[@type='text']")).click();
            getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("1234567890");
            getDriver().findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
            getReusableActions().staticWait(2000);
        }
            getReusableActions().staticWait(3000);
        }
        getReusableActions().staticWait(6000);
        getReusableActions().switchToNewWindow();*/
    }
    public void clickActivate() {
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(activate, 10);
        getReusableActions().staticWait(2000);
        /*if (getDriver().findElements(By.xpath("//*[@title = 'Activate']")).size() > 0 )
            getDriver().findElement(By.xpath("//*[@title = 'Activate']")).click();*/
    }

    public void clickTopUp() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(topUp);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(topUp.isEnabled(),"top up button is enabled","top up button is not enabled");
        reporterSnapshot(topUp, "Top-up button", "", "Enable");
        //getReusableActions().clickWhenReady(topUp, 10);
        getReusableActions().executeJavaScriptClick(topUp);
    }

    public void clickStore() {
        getReusableActions().clickWhenReady(store, 10);
    }

    public void changeLanguage(String language) {
        getReusableActions().staticWait(2000);
        switch (language) {
            case "English":
                //getReusableActions().javascriptScrollByVisibleElement(englishCTA);
                getReusableActions().clickWhenReady(englishCTA, 10);
                break;
            case "French":
                //getReusableActions().javascriptScrollByVisibleElement(frenchCTA);
                getReusableActions().clickWhenReady(frenchCTA, 10);
                break;
        }
        getReusableActions().staticWait(2000);
    }

    public void clickTopUpFrench() {
        getReusableActions().clickWhenReady(topUpFrench, 10);
    }

    public void clickCoverageMap() {
        getReusableActions().clickWhenReady(coverageMap, 10);
    }

    public void validateHeaderComponentInEnglish() {
        reporter.softAssert(signIn.getText().equals("SIGN-IN"), signIn.getText(), "signIn is not display");
        reporter.softAssert(plans.getText().equals("PLANS"), plans.getText(), "plans is not display");
        System.out.println(plans.getText());
        System.out.println(activate.getText());
        System.out.println(topUp.getText());
        System.out.println(store.getText());
        System.out.println(coverageMap.getText());
        System.out.println(legacySignIn.getText());
    }

    public void clickOnMyChatr() {
        getReusableActions().staticWait(5000);
        myChatr.click();
    }

    public void clickMyChatr() {
        getReusableActions().clickWhenReady(myChatr, 10);
    }

    public void clickCurrentPlan() {
        getReusableActions().clickWhenReady(currentPlan, 10);
        reporterSnapshot(currentPlan, "current Plan", "", "NULL");
    }

    public void clickManageBtn() {
        getReusableActions().clickWhenReady(manageAddOn, 10);
    }

    public void validateCurrentAddOn() {
        getReusableActions().javascriptScrollByVisibleElement(activeAddons);
        //reporter.softAssert(activeAddons.isDisplayed(),"Currently active addons are displayed","Currently active addons are not displayed");
        reporterSnapshot(activeAddons, "Active Add-On", "", "display");
    }

    public void validateEligibleAddOn() {
        getReusableActions().javascriptScrollByVisibleElement(eligibleAddons);
        //reporter.softAssert(eligibleAddons.isDisplayed(),"Eligible  addons are displayed","Eligible  addons are not displayed");
        reporterSnapshot(eligibleAddons, "Eligible Add-On", "", "display");
    }

    public void clickTopUpCTA() {
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScriptClick(topUpCTA);
       // getReusableActions().clickWhenReady(topUpCTA, 10);
        getReusableActions().staticWait(1000);
    }

    public void clickTopUpFooterCTA() {
        /*getReusableActions().javascriptScrollByVisibleElement(topUpFooter);*/
        scrollToMiddleOfElement(topUpFooter);
        getReusableActions().clickWhenReady(topUpFooter, 10);
        getReusableActions().staticWait(1000);
    }

    public void validateOrderExceeds300Error() {
        String balanceText = balance$.getText().substring(1);
        System.out.println(balanceText);
        clickTopUpCTA();
        getReusableActions().staticWait(2000);
       // creditCardRadioBtn.click();
        getReusableActions().executeJavaScriptClick(creditCardRadioBtn);
        //topUpAmtField.sendKeys(balanceText);
        topUpAmtField.sendKeys("301");
        getReusableActions().staticWait(3000);
        topUpAmtField.sendKeys(Keys.TAB);
        getReusableActions().staticWait(1000);
        //getReusableActions().javascriptScrollByVisibleElement(errorExceeds300$);
        System.out.println(errorExceeds300$.getText());
        scrollToMiddleOfElement(errorExceeds300$);
        getReusableActions().staticWait(1000);
        reporterSnapshot(errorExceeds300$,"Exceed Amount 300","","display");
    }

    public void clickSelectAddOnLink() {
        getReusableActions().staticWait(4000);
        //getReusableActions().javascriptScrollToMiddleOfPage();
        //getReusableActions().javascriptScrollByVisibleElement(selectAddOnLink);
        scrollToMiddleOfElement(selectAddOnLink);
        getReusableActions().staticWait(4000);
        reporterSnapshot(selectAddOnLink,"ADD ON ","","display");
        selectAddOnLink.click();
    }

    public void validateWindow(String urlParam) {
        getReusableActions().staticWait(3000);
        reporter.softAssert(getDriver().getCurrentUrl().contains(urlParam), urlParam + " is displayed", urlParam + " is not displayed");
    }

    public void validateAddOnCheckbox() {
        if (!addOnCheckbox.isSelected()) {
            getReusableActions().staticWait(2000);
            getReusableActions().javascriptScrollByVisibleElement(addOnCheckbox);
            //reporter.reportLogWithScreenshot("addOn checkbox is not selected");
            reporterSnapshot(addOnCheckbox, "Add on", "", "select");
        } else {
            reporter.reportLogWithScreenshot("addOn checkbox is selected");

        }
    }

    public void clickAddOnCheckbox() {
        getReusableActions().clickWhenReady(addOnCheckbox, 3);
    }

    public void validateOrderSummary(String passCondition) {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        reporter.softAssert(orderSummary.isDisplayed(), "Order Summary is displayed", "Order Summary is not displayed");
        if (passCondition.equalsIgnoreCase("empty")) {
            reporter.softAssert(true, "Cart is empty", "Cart is not empty");
        } else {
            reporter.softAssert(totalDueToday.isDisplayed(), "Cart has pending orders", "Cart has no pending ordersr");
        }

    }

    public void validateMAOBtn_inflight_Order() {
        getReusableActions().javascriptScrollByVisibleElement(manageAddOn);
        //reporter.softAssert(!manageAddOn.isEnabled(),"MAO Btn is disabled","MAO Btn is not disabled");
        reporterSnapshot(manageAddOn, "Manage Add-On", "", "NOTENABLE");

    }

    public void validateMAOBtn_Expired_Account() {
        getReusableActions().javascriptScrollByVisibleElement(selectAddOnLink);
        reporter.softAssert(!selectAddOnLink.isEnabled(), "selectAddOn Btn is disabled", "selectAddOn Btn is not disabled");
    }

    public void validateMAOBtn_inprogress_Order() {
        getReusableActions().javascriptScrollByVisibleElement(manageAddOn);
        reporter.softAssert(!manageAddOn.isEnabled(), "MAO Btn is disabled", "MAO Btn is not disabled");
        getReusableActions().javascriptScrollByVisibleElement(selectAddOnLink);
        reporter.softAssert(!selectAddOnLink.isEnabled(), "selectAddOn Btn is disabled", "selectAddOn Btn is not disabled");
    }

    public void validate_TnC_not_Checked() {
        getReusableActions().javascriptScrollByVisibleElement(MAOcheckbox_error);
        //reporter.softAssert(MAOcheckbox_error.isDisplayed(),"checkbox unchecked error is displayed","checkbox unchecked error is not displayed");
        reporterSnapshot(MAOcheckbox_error, "Agree to the terms before continuing.", "", "common");
    }

    public void validate_quick_link_Edit() {
        getReusableActions().javascriptScrollByVisibleElement(editBtn_NewAddon);
        reporter.softAssert(editBtn_NewAddon.isEnabled(), "Edit New Addon Btn is enabled", "EditNew Addon Btn is not enabled");
        getReusableActions().clickWhenReady(editBtn_NewAddon);
        getReusableActions().staticWait(2000);
        validateWindow("manage-add-ons");
    }

    public void clickContinueBtn_MAO() {
        //getReusableActions().clickWhenReady(continueBtnMAO,3);
        getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().staticWait(2000);
        continueBtnMAO.click();
    }

    public void clickCreditCardRadioBtn() {
        //getReusableActions().clickWhenReady(creditCardRadioBtn,3);
        getReusableActions().staticWait(2000);
        if (showTopUpOptions.size() > 0) {
            showTopUpOptions.get(0).click();
        }
        getReusableActions().staticWait(2000);
        creditCardRadioBtn.click();
    }

    public void validateOrderReviewPage() {
        reporter.softAssert(listAddressElements.size() == 0, "Customer Address is not displayed in order review page", "Customer Address is displayed in order review page");
    }

    public void clickOnUseOtherCard() {
        //getReusableActions().clickWhenReady(continueBtnMAO,3);
        getReusableActions().staticWait(2000);
        useOtherCard.click();
    }

    public void clickOnChatrTOpUpRadioBtn() {
        //getReusableActions().clickWhenReady(continueBtnMAO,3);
        getReusableActions().staticWait(3000);
        chatrTopUpRadioBtn.click();
    }

    public void validateTopUpWithoutPin() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(topUpWithoutPinError);
        reporter.softAssert(topUpWithoutPinError.isDisplayed(), "top UpWIthout Pin error is displayed", "top UpWIthout Pin error is not displayed");

    }

    public void validateAddOnAmountWithCart() {
        getReusableActions().javascriptScrollByVisibleElement(addOnAmountInDollars);
        //reporter.reportLogWithScreenshot("addOnAmountInDollars");
        System.out.println(addOnAmountInDollars.getText() + ".00");
        getReusableActions().javascriptScrollByVisibleElement(accountBalUsedInDollars);
        //reporter.reportLogWithScreenshot("accountBalUsedInDollars");
        //System.out.println(accountBalUsedInDollars.getText().replace("$", "").substring(0, 1));
        //reporter.softAssert((addOnAmountInDollars.getText()).contentEquals(accountBalUsedInDollars.getText().replace("$", "").split(".")[0]), "Add On amount and Account balance amount matches", "Add On amount and Account balance amount doesnt match");
        String strExpVal1 = "$" + addOnAmountInDollars.getText() + ".00";
        String strVal2 = "$" + accountBalUsedInDollars.getText() + ".00";
        System.out.println(strExpVal1);
        reporterSnapshot(addOnAmountInDollars,strExpVal1,strVal2,"COMPARE");
    }

    public void clickOnChangePlanBtn() {
        //getReusableActions().clickWhenReady(continueBtnMAO,3);
        //getReusableActions().javascriptScrollToMiddleOfPage();
        getReusableActions().javascriptScrollByVisibleElement(changePlanBtn);
        getReusableActions().staticWait(5000);
        //changePlanBtn.click();
        getReusableActions().executeJavaScriptClick(changePlanBtn);
    }

    public void clickOnPlanProceedBtn() {
        //getReusableActions().clickWhenReady(continueBtnMAO,3);
        getReusableActions().staticWait(2000);
        planProceedBtn.click();
    }

    public void clickOnAutopayConsentCheckbox() {
        //getReusableActions().clickWhenReady(continueBtnMAO,3);
        getReusableActions().staticWait(2000);
        MAOTnCcheckbox1.click();
    }

    public void selectOrderReviewCheckboxes() {
        //getReusableActions().clickWhenReady(continueBtnMAO,3);
        getReusableActions().staticWait(2000);
        MAOTnCcheckbox1.click();
        getReusableActions().staticWait(2000);
        MAOTnCcheckbox2.click();
        getReusableActions().staticWait(2000);
    }

    public void clickOnSaveSummary() {
        getReusableActions().staticWait(2000);
        saveSummaryButton.click();
        getReusableActions().staticWait(2000);
        //getReporter().reportLogWithScreenshot("Summary Description Saved ");
        reporterSnapshot(saveSummaryButton, "save Summary", "", "null");
    }

    public void validatePPEOrderReview() {
        getReusableActions().staticWait(4000);
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        //getReporter().softAssert(orderNum.isDisplayed(),"Order Number is displayed","Order Number is not displayed");
        reporterSnapshot(orderNum, "order Num", "", "display");
        //getReusableActions().javascriptScrollByVisibleElement(orderCreatedDate);
        //getReporter().softAssert(orderCreatedDate.isDisplayed(),"Order Created is displayed","Order Created is not displayed");
        reporterSnapshot(orderCreatedDate, "order Created Date", "", "display");
        //getReusableActions().javascriptScrollByVisibleElement(placeOfContract);
        //getReporter().softAssert(placeOfContract.isDisplayed(),"Place Of Contract is displayed","Place Of Contract is not displayed");
        reporterSnapshot(placeOfContract, "place Of Contract", "", "display");
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(3000);
    }

    public void enterTopUpPin(String voucher) {
        topUpCardField.sendKeys(voucher);
    }

    public void validateAutopayBonus() {
        String expectedValue = "Auto Pay Bonus";
        reporter.softAssert(autopayBonusBlock.get(0).isDisplayed(), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY");
        //reporterSnapshot(autopayBonusBlock,"autopay Bonus Block","","display");
    }

    public void validateNoAutopayBonus() {
        getReusableActions().staticWait(2000);
        scrollToMiddleOfElement(autoPaySection);
        getReusableActions().staticWait(2000);
        String expectedValue = "Auto Pay Bonus";
        reporter.softAssert(autopayBonusBlock.isEmpty(), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE BLANK SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT BLANK SUCCESSFULLY");
    }

    public void validateOrderSummaryAccBal() {
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        //reporter.softAssert(accountBalUsedInDollars.isDisplayed(),"Account balance validated","account balance is not displayed");
        reporterSnapshot(accountBalUsedInDollars, "account Balance", "", "display");
    }

    public void validateSavedCC() {
        //reporter.softAssert(chatrTopUpRadioBtn.isDisplayed(),"voucher option is still displayed","voucher option not displayed");
        getReusableActions().staticWait(3000);
        chatrTopUpRadioBtn.click();
        reporter.softAssert(!creditCardRadioBtn.isSelected(), "Able to toggle to Voucher payment", "Voucher toggle is not valiadated");
    }

    public void clickOnPlanDetails() {
        getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().staticWait(6000);
        planDetailsBtn.click();
        getReusableActions().staticWait(6000);
    }

    public void enterTopUpPinRetail(String voucher) {
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollToMiddleOfPage();
        topUpCardFieldRetail.click();
        topUpCardFieldRetail.sendKeys(voucher);
    }
    public void validateUsedTopupCard(){
        getReusableActions().staticWait(6000);
        //reporter.softAssert(error_UsedTopUpCard.isDisplayed(),"Used Top up Card error is displayed","Used Top up Card error is not displayed");
        reporterSnapshot(error_UsedTopUpCard,"Used Top up Card error is displayed","","Common");
        //getReusableActions().staticWait(6000);
        //reporter.softAssert(chatrTopUpContinueBtn.isDisplayed(),"Chatr topup continue button is disabled","Chatr topup continue button is not disabled");
    }
    public void validateInvalidTopupCard(){
        getReusableActions().staticWait(6000);
        reporter.softAssert(error_InvalidTopUpCard.isDisplayed(),"Used Top up Card error is displayed","Used Top up Card error is not displayed");
        getReusableActions().staticWait(6000);
        reporter.softAssert(chatrTopUpContinueBtn.isDisplayed(),"Chatr topup continue button is disabled","Chatr topup continue button is not disabled");
    }
    public void validateInvalidTopupCardThrice(String voucher){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollToMiddleOfPage();
        topUpCardFieldRetail.click();
        topUpCardFieldRetail.sendKeys(voucher);
        reporter.reportLogWithScreenshot("Invalid voucher entered once "+voucher);
        getReusableActions().staticWait(6000);
        topUpCardFieldRetail.click();
        topUpCardFieldRetail.sendKeys(voucher.substring(0,voucher.length()-1));
        reporter.reportLogWithScreenshot("Invalid voucher entered twice "+voucher.substring(0,voucher.length()-1));
        getReusableActions().staticWait(6000);
        topUpCardFieldRetail.click();
        topUpCardFieldRetail.sendKeys(voucher.substring(0,voucher.length()-2));
        reporter.reportLogWithScreenshot("Invalid voucher entered thrice "+voucher.substring(0,voucher.length()-2));
        getReusableActions().staticWait(6000);
        reporter.softAssert(error_AccountBarred.isDisplayed(),"Account Barred error is displayed","Account Barred error is not displayed");
        getReusableActions().staticWait(6000);

    }
    public void validateCreditCardRadioBtnIsSelected(){
        getReusableActions().staticWait(2000);
        //reporter.softAssert(creditCardRadioBtn.isEnabled(),"Credit Card Radio Button is selected","Credit Card Radio Button is not selected");
        getReusableActions().javascriptScrollByVisibleElement(creditCardRadioBtn);
        getReusableActions().staticWait(1000);
        reporterSnapshot(creditCardRadioBtn,"credit Card","","enable");

    }
    public void validateInvalidFormatTopupCard(){
        getReusableActions().staticWait(6000);
        reporter.softAssert(error_InvalidFormatTopUpCard.isDisplayed(),"Used Top up Card error is displayed","Used Top up Card error is not displayed");
        getReusableActions().staticWait(6000);
        reporter.softAssert(chatrTopUpContinueBtn.isDisplayed(),"Chatr topup continue button is disabled","Chatr topup continue button is not disabled");
    }
    public void validateMSFequalsPlanValue(){
        getReusableActions().staticWait(3000);
        String expectedValue = "MSF Equals Warning";
        String expected ="";
        if (MSFWarning_greater.size()==0){
            expected="PASS";
        }else{
            expected="FAIL";
        }
        getReporter().softAssert("PASS",expected,"VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY","INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY");
        getReusableActions().staticWait(2000);
      /*  clickContinueBtn_MAO();
        getReusableActions().staticWait(4000);*/
    }
    public void validateMSFLessThanPlanValue(){
        getReusableActions().staticWait(3000);
        String expectedValue = "MSF Lesser Warning";
        getReporter().softAssert(MSFWarning_lesser.size()==0,"VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY","INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY");
        //getReporter().softAssert(continueBtnMAO.isEnabled(),"Continue button is enabled","Continue button is disabled");
        getReusableActions().staticWait(2000);
        clickContinueBtn_MAO();
        getReusableActions().staticWait(4000);
        //getReporter().softAssert(MSFWarning_lesser.get(0).isDisplayed(),"MSF lesser Warning is displayed","MSF lesser Warning is not displayed");
    }
    public void validateMSFGreaterThanPlanValue(){
        getReusableActions().staticWait(3000);
        String expectedValue = "MSF Greater Warning";
        getReporter().softAssert(MSFWarning_greater.size()>0,"VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY","INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY");
        for (WebElement i :MSFWarning_greater) {
            getReusableActions().javascriptScrollByVisibleElement(i);
        }
        //getReporter().softAssert(continueBtnMAO.isEnabled(),"Continue button is enabled","Continue button is disabled");
        reporterSnapshot(continueBtnMAO,"continue","","enable");
    }
    public void validateDataChangeOnRefresh() throws AWTException {
        getReusableActions().javascriptScrollByVisibleElement(addOnCheckbox);
        addOnCheckbox.click();
        getReusableActions().staticWait(6000);
        getReusableActions().javascriptScrollToTopOfPage();
        Robot robot = new Robot();
        robot.delay(4000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_R);
        robot.delay(2000);
        reporter.reportLogWithScreenshot(" Screen Refresh F5 ");
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(addOnCheckbox);
        getReusableActions().staticWait(1000);
       // getDriver().navigate().refresh();
        //getReporter().softAssert(!selectAddOnLink.isSelected(),"Data has changed after Refresh","Data has not changed after Refresh");
        reporterSnapshot(addOnCheckbox,"AddOn Link","","NOTSELECT");
    }
    public void validateAddOnOrderSummary() {
        getReusableActions().javascriptScrollByVisibleElement(addOnValue);
        reporter.reportLogWithScreenshot("addOnValue");
        System.out.println(addOnValue.getText() + ".00");
        getReusableActions().javascriptScrollByVisibleElement(addOnValueOrderSummary);
        reporter.reportLogWithScreenshot("addOnValueOrderSummary");
        System.out.println(addOnValueOrderSummary.getText().replace("$", "").substring(0, 2));                    //.split(".")[0]
        reporter.softAssert((addOnValue.getText()).contentEquals(addOnValueOrderSummary.getText().replace("$", "").substring(0, 2)), "Add On amount and Account balance amount matches", "Add On amount and Account balance amount doesnt match");
    }

    public void validateSignOut(){
        getReusableActions().staticWait(2000);
        reporterSnapshot(signOutButton,"Sign out","","COMMON");
        signOutButton.click();
        getReusableActions().staticWait(4000);
        signIn.isDisplayed();
        reporterSnapshot(signInButton,"Sign-in","","COMMON");
    }

    }
