package com.rogers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class PPCPage extends BasePage{

    @FindBy(xpath = "(//div[contains(@class,'plan-price')]/ds-price/div/div/div[2])[2]")
    WebElement planValue;
    @FindBy(xpath = "(//div[contains(@class,'dsa-orderTable')]/div[2]/span)[1]")
    WebElement cart;
    @FindBy(xpath = "//div[contains(@role,'tabpanel')]")
    WebElement planTable;
    @FindBy(xpath = "(//span[contains(text(),'Enter a top-up card PIN before continuing')])")
    WebElement errorForNoVoucher;
    @FindBy(xpath = "//span[text()='chatr top-up card found.']")
    WebElement voucherValidMessage;
    @FindBy(xpath = "(//span[contains(text(),'Please, check the checkbox ')])[2]")
    WebElement saveCCErrorMessage;
    @FindBy(xpath = "//p[text()=' Use other card ']")
    WebElement useOtherCardOption;
    @FindBy(xpath = "//p[contains(text(),'Data Autopay Bonus')]")
    WebElement autoPayBonus;
    @FindBy(xpath = "//span[contains(text(),'Auto-pay')]")
    WebElement autoPayLabel;
    @FindBy(xpath = "//span[contains(text(),'Error! Select a payment')]")
    WebElement noPaymentSelectError;
    @FindBy(xpath = "//input[@value='[object Object]']/following-sibling::span")
    WebElement saveCreditCard;
    @FindBy(xpath = "(//span[contains(text(),'Continue')])[2]")
    WebElement paymentContinueButton;
    @FindBy(xpath = "(//input[@type='tel'])[2]")
    WebElement secondVoucherInput;
    @FindBy(xpath = "(//button[@role='button'])[4]")
    WebElement binIcon;
    @FindBy(xpath = "(//span[@role='img'])[11]")
    WebElement topUpOption;
    @FindBy(xpath = "//label[@aria-labelledby='ds-radio-input-id-7-label']")
    WebElement saveCCAutoPay;
    @FindBy(xpath = "(//input[@type='radio']/following-sibling::span[1])[2]")
    WebElement consentcheckBox;
    @FindBy(xpath = "//form/div/div/ds-checkbox/label/div[1]")
    WebElement checkboxCreditCard;
    @FindBy(xpath = "(//div[@class='ds-radioButton__outerCircle my-12'])[3]")
    WebElement internationCardOption;
    @FindBy(xpath = "//*[contains(text(),'Extra')]//ancestor::div[2]//div[2]/span")
    WebElement extraMoneyInCart;
    @FindBy(xpath = "//*[contains(text(),'Extra')]//ancestor::div[2]//div[2]/span")
    WebElement extraMoneyInCartAutoPay;
    @FindBy(xpath = "//span[normalize-space()='Monthly plan fees']")
    WebElement planFeesDetails;
    @FindBy(xpath = "//div/ds-radio-group/div[3]/ds-radio-button/label/div[1]/div")
    WebElement voucherRadioButton;
    @FindBy(xpath = "//input[@type='tel']")
    WebElement voucherInput;
    @FindAll({@FindBy(xpath = "//span[contains(text(),'Pay once')]"),@FindBy(xpath = "//span[@id='ds-radio-input-id-6-label']")})
    WebElement payOnce;
    @FindBy(xpath = "(//div[@class='ds-radioButton__innerCircle'])[1]")
    WebElement radioButtonCC;
    @FindBy(xpath = "//button[@title='Remove']")
    WebElement removePlan;
    @FindBy(xpath = "//span[contains(text(),'Total')]/following-sibling::span/ds-price")
    WebElement totalDue;
    @FindBy(xpath = "//div[contains(text(),'Your monthly services')]")
    WebElement monthlyService;
    @FindBy(xpath = "(//input[@type='tel'])[3]")
    WebElement thirdVoucherInput;
    @FindBy(xpath = "//*[contains(text(),'added more money')]")
    WebElement moreMSFValue;

    @FindBy(xpath = "//*[contains(text(),'have enough money to cover the cost')]")
    WebElement lessMSFValue;
    @FindBy(xpath ="//span[contains(text(),'Override')]/ancestor::button")
    WebElement prorationOverrideMessage;
    @FindBy(xpath ="(//span[contains(text(),'Continue')]/ancestor::button)[2]")
    WebElement confirmProrationOverride;
    @FindBy(xpath ="(//h5[contains(text(),'Promotions')])[1]")
    WebElement promotionDetails;
    @FindBy(xpath = "//p[text()='Exclusive Offer']")
    WebElement exclusiveOfferBanner;
    @FindBy(xpath = "(//span[text()=' Select'])[1]")
    WebElement exclusiveSelectPlan;

    @FindBy(xpath = "//span[contains(text(),'Show top-up options')]")
    WebElement selectTopUpOption;

    @FindBy(xpath = "//div[@id='ds-radio-input-id-1-label-container']")
    List<WebElement> ccTopUpOption;

    @FindBy(xpath = "//*[contains(text(),'more money than your monthly service fees cost')]")//*[contains(text(),'less than MSF')]
    WebElement cardLessThanMSF;

    @FindBy(xpath ="//span[contains(text(),'Proration override')]/ancestor::button")
    List<WebElement> prorationOverrideList;

    @FindBy(xpath ="//span[contains(text(),'Continue')]")
    WebElement continueButtonUnenroll;
    @FindBy(xpath = "//div[contains(text(),'Payment details')]")
    WebElement paymentDetailSection;
    @FindBy(xpath = "//span[contains(text(),'Not enough money')]")
    WebElement lowAccBalance;
    @FindBy(xpath = "//span[contains(text(),'Continue')]") //span[contains(text(),'Continue')]" //css = "button.-primary")
    WebElement continueButton;
    @FindBy(xpath = "(//*[contains(text(),'Chatr top-up card')])[1]")
    WebElement careTopCardPaymentPage;
    @FindBy(xpath ="//ds-radio-button[1]/label[1]/div[2]")
    List<WebElement> careTopCardPaymentPageList;
    @FindBy(xpath = "//button[contains(@title,'Remove')]")
    WebElement planRemoveButton;
    @FindBy(xpath = "//input[@id='ds-form-input-id-1']")
    WebElement voucherInput1;
    @FindBy(xpath = "//*[contains(text(),'have enough money to cover your new plan')]")//*[contains(text(),'less than MSF')]
    WebElement topUpCardError;


    public PPCPage(WebDriver driver){
        super(driver);
    }

    public void selectPlan(String value)  {
        //getReusableActions().staticWait(2000);
        //Select Plan Value
        String planValue ="";
        getReusableActions().staticWait(2000); //
        String planXpath = "//div[.//*[contains(.,'" + value +"')]][contains(@class, 'plan-price')]/following-sibling::div[contains(@class, 'plan-select')]/button";
        String defaultplan = "(//div[.//*[contains(.,'15')]][contains(@class, 'plan-price')]/following-sibling::div[contains(@class, 'plan-select')]/button)[1]";
        List<WebElement> selectPlan = getDriver().findElements(By.xpath(planXpath));
        getReusableActions().isElementVisible(planTable);
        if (selectPlan.size()>0) {
            for(WebElement element:selectPlan){
                if(element.getText().contains("Select")){
                    element.click();
                    planValue=value;
                    break;
                }
            }
        }else{
            WebElement plan = getDriver().findElement(By.xpath(defaultplan));
            getReusableActions().isElementVisible(planTable);
            getReusableActions().clickWhenReady(plan, 10);
            plan.click();
            planValue ="15";
        }
        getReusableActions().staticWait(7000);
        //Wait for Cart Update
        getReusableActions().waitForTextToBePresentInElement(cart,planValue,20);
        System.out.println("Plan Selected : $"+ planValue+".00");
        getReusableActions().staticWait(12000);
        getReusableActions().javascriptScrollToMiddleOfPage();
        //getReusableActions().javascriptScrollByVisibleElement(planRemoveButton);
        scrollToMiddleOfElement(planRemoveButton);
        getReusableActions().staticWait(2000);
        reporterSnapshot(planRemoveButton, "$" + planValue, "", "DISPLAY");
        //getReusableActions().staticWait(2000);
        //getReusableActions().javascriptScrollByVisibleElement(cart);
//        //reporter.reportLogWithScreenshot("Plan: " + planValue + " has been selected");
    }
    public void validateDoNotEnterVoucher(){
        getReusableActions().staticWait(2000);
        //getReusableActions().javascriptScrollByVisibleElement(voucherInput);
        voucherInput.click();
        voucherInput.sendKeys(Keys.TAB);
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollByVisibleElement(errorForNoVoucher);
        //reporter.softAssert(errorForNoVoucher.getText().equals("Please enter top-up PIN to continue."),errorForNoVoucher.getText(),"error message not display");
        reporterSnapshot(errorForNoVoucher,"Enter a top-up card PIN before continuing","","common");
    }
    public void validateValidMessageForVoucher(){
        //reporter.softAssert(voucherValidMessage.getText().equals("Top-Up card is valid"),voucherValidMessage.getText(),"valid voucher message not display");
        reporterSnapshot(voucherValidMessage,"chatr top-up card found.","","GEN");
    }
    public void validateErrorForSaveCCAutoPay(){
        reporter.softAssert(saveCCErrorMessage.getText().equals("Please, check the checkbox in order to proceed"),saveCCErrorMessage.getText(),"save CC error message not display");
    }
    public void clickOnRadioButtonInPPC(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(radioButtonCC);
        radioButtonCC.click();
        getReusableActions().staticWait(5000);
    }
    public void clickOnOtherCardOption(){
        getReusableActions().isElementVisible(useOtherCardOption);
        useOtherCardOption.click();
        getReusableActions().staticWait(3000);
    }
    public void validateAutoPayBonusAttachedTiPlan(){
        getReusableActions().javascriptScrollByVisibleElement(autoPayBonus);
        getReusableActions().staticWait(2000);
        //autoPayBonus.isDisplayed();
        //reporter.softAssert(autoPayLabel.isDisplayed(),"Autopay label "+autoPayLabel.getText(),"Autopay label is not display");
        //reporter.softAssert(autoPayBonus.isDisplayed(),"Autopay Bonus "+autoPayBonus.getText(),"Autopay bonus is not display");
        reporterSnapshot(autoPayLabel,"Auto Pay " + autoPayLabel.getText(),"","display");
        reporterSnapshot(autoPayBonus,"Auto Pay bonus " + autoPayBonus.getText(),"","display");
    }
    public void validateErrorMessageForNotPaymentSelect(){
        getReusableActions().staticWait(2000);
        getReusableActions().scrollToElement(noPaymentSelectError);
        //reporter.softAssert(noPaymentSelectError.getText().equals("payment method"),noPaymentSelectError.getText(),"error message not display");
        reporterSnapshot(noPaymentSelectError,"Error! Select a payment method.","","common");
    }
    public void selectPayOnce(){
        getReusableActions().staticWait(2000);
        payOnce.click();
        reporter.reportLogWithScreenshot("payOnce is selected");
    }
    public void selectTheSaveCreditCard(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(saveCreditCard);
        //reporter.softAssert(saveCreditCard.isDisplayed(),"save credit card display","save credit card not display");
        getReusableActions().isElementVisible(saveCreditCard);
        saveCreditCard.click();
        reporterSnapshot(saveCreditCard,"saved Credit Card","","NULL");
    }
    public void validateSavedCreditCard(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(saveCreditCard);
        reporterSnapshot(saveCreditCard,"saved Credit Card","","display");
    }

    public void clickOnContinueButtonInPayment(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(paymentContinueButton);
        getReusableActions().staticWait(1000);
        paymentContinueButton.click();
        getReusableActions().staticWait(3000);
    }
    public void enterSecondVoucherPin(String voucherPin){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(secondVoucherInput);
        //voucherInput.click();
        getReusableActions().staticWait(2000);
        secondVoucherInput.click();
        secondVoucherInput.sendKeys(voucherPin);
        secondVoucherInput.sendKeys(Keys.ENTER);
        getReusableActions().staticWait(2000);
        reporter.reportLogWithScreenshot("enter second voucher pin");
    }
    public void validateBinForTopUpCard(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(secondVoucherInput);
        //voucherInput.click();
        getReusableActions().staticWait(2000);
        secondVoucherInput.click();
        secondVoucherInput.sendKeys(Keys.ENTER);
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(binIcon);
        getReusableActions().staticWait(2000);
        binIcon.click();
        //reporter.softAssert(!getReusableActions().isElementVisible(binIcon),"second voucher delete","second voucher not delete");
        reporterSnapshot(binIcon,"second voucher delete","","NOTVISIBLE");

    }
    public void clickOnTheTopUpOption(){
        getReusableActions().javascriptScrollByVisibleElement(topUpOption);
        getReusableActions().staticWait(2000);
        topUpOption.click();
    }
    public void clickSaveCCOnAutoPay(){
        getReusableActions().javascriptScrollByVisibleElement(saveCCAutoPay);
        getReusableActions().isElementVisible(saveCCAutoPay);
        saveCCAutoPay.click();
    }
    public void clickOnAutoPayConsent(){
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollByVisibleElement(consentcheckBox);
        consentcheckBox.click();
    }
    public void validateExtraMoneyAddInCartAuto(String topUp){
        getReusableActions().javascriptScrollByVisibleElement(extraMoneyInCartAutoPay);
        extraMoneyInCartAutoPay.isDisplayed();
        System.out.println(extraMoneyInCartAutoPay.getText());
        System.out.println(extraMoneyInCartAutoPay);
        String extraAmount ="$"+topUp+".00";
        System.out.println("add money added to cart "+extraAmount);
        //reporter.softAssert(extraMoneyInCartAutoPay.getText().equals(extraAmount),extraMoneyInCartAutoPay.getText(),"extra money not added");
        reporterSnapshot(extraMoneyInCartAutoPay,"extraMoney","","Common");
    }
    public void clickOnCheckBoxCreditCardSave(){
        getReusableActions().javascriptScrollByVisibleElement(checkboxCreditCard);
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(checkboxCreditCard,10);
    }
    public void clickOnInternationalCardOption(){
        getReusableActions().javascriptScrollByVisibleElement(internationCardOption);
        //reporter.softAssert(getReusableActions().isElementVisible(internationCardOption),"international card option display","international card option not display");
        getReusableActions().staticWait(2000);
        internationCardOption.click();
        getReusableActions().staticWait(3000);
    }
    public void RemoveSelectedPlan(){
        getReusableActions().staticWait(6000);
        getReusableActions().javascriptScrollByVisibleElement(removePlan);
        removePlan.click();
        getReusableActions().staticWait(2000);
        reporterSnapshot(removePlan,"Plan Removed","","NULL");
    }
    public void validateTaxesInPricePlan(){
        getReusableActions().javascriptScrollByVisibleElement(monthlyService);
        //reporter.softAssert(totalDue.isDisplayed(),"total due is display ","total due not display");
        reporterSnapshot(totalDue,"totalDue","","display");
    }
    public void enterThirdVoucherPin(String voucherPin){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(thirdVoucherInput);
        //voucherInput.click();
        getReusableActions().staticWait(2000);
        thirdVoucherInput.click();
        thirdVoucherInput.sendKeys(voucherPin);
        thirdVoucherInput.sendKeys(Keys.ENTER);
        getReusableActions().staticWait(2000);
        //reporter.reportLogWithScreenshot("enter second voucher pin");
    }
    public void validateMSFMessageForVoucher(){
        getReusableActions().javascriptScrollByVisibleElement(careTopCardPaymentPage);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(voucherValidMessage.getText().equals("Top-Up card is valid"),voucherValidMessage.getText(),"valid voucher message not display");
        reporterSnapshot(moreMSFValue,"added more money than what you owe for this order","","COMMON");
    }
    public void validateMSFLessMessageForVoucher(){
        if ((careTopCardPaymentPageList.size())>=1) {
            getReusableActions().javascriptScrollByVisibleElement(careTopCardPaymentPage);
            System.out.println("Payment Page");
            getReusableActions().staticWait(2000);
            reporterSnapshot(lessMSFValue, "have enough money to cover the cost", "", "COMMON");
        }else{
            System.out.println("Review  Page");
            getReusableActions().javascriptScrollByVisibleElement(lessMSFValue);
            getReusableActions().staticWait(2000);
            reporterSnapshot(lessMSFValue, "have enough money to cover the cost", "", "COMMON");
        }
    }
    public void validateContinueButtonEnabled(){
        //reporter.softAssert(paymentContinueButton.isEnabled(),"continue button is enabled","continue button not enabled");
        getReusableActions().scrollToElement(continueButton);
        getReusableActions().staticWait(1000);
        reporterSnapshot(continueButton,"payment Continue Button","","enable");
    }
    public void validateProrationOverride(){
        getReusableActions().staticWait(3000);
        //getReusableActions().javascriptScrollByVisibleElement(prorationOverrideMessage);
        scrollToMiddleOfElement(prorationOverrideMessage);
        getReusableActions().staticWait(3000);
        prorationOverrideMessage.click();
        getReusableActions().staticWait(3000);
        confirmProrationOverride.click();
        getReusableActions().staticWait(3000);
        //getReusableActions().javascriptScrollByVisibleElement(prorationOverrideMessage);
        scrollToMiddleOfElement(prorationOverrideMessage);
        getReusableActions().staticWait(3000);
        //getReporter().softAssert(prorationOverrideMessage.isDisplayed(),"Proration Override Message is displayed","Proration Override Message is not displayed");
        reporterSnapshot(prorationOverrideMessage,"Proration override",prorationOverrideMessage.getText(),"DISPLAY");

    }
    public void validatePromotionDetailsReview(){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(promotionDetails);
        //getReusableActions().javascriptScrollByVisibleElement(promotionDetails);
        getReusableActions().staticWait(3000);
        //getReporter().softAssert(promotionDetails.isDisplayed(),"Promotion Details Review is displayed","Promotion Details Review is not displayed");
        reporterSnapshot(promotionDetails,"Promotion Details",promotionDetails.getText(),"DISPLAY");
    }
    public void validateExclusiveOfferBanner(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(exclusiveOfferBanner);
        //reporter.softAssert(exclusiveOfferBanner.isDisplayed(), "Exclusive Offer Banner is Displayed", "Exclusive Offer Banner is not displayed");
        //reporter.softAssert(exclusiveSelectPlan.isEnabled(), "Select plan button is Enabled", "Select Plan button is disabled");
        reporterSnapshot(exclusiveOfferBanner,"exclusive Offer Banner","","display");
        reporterSnapshot(exclusiveSelectPlan,"exclusive Select Plan","","display");
    }
    public void validateAgentSeesCCPayment(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(paymentContinueButton);
        getReusableActions().staticWait(1000);
        paymentContinueButton.click();
        getReusableActions().staticWait(3000);
        Boolean flag =getReusableActions().isElementVisible(paymentContinueButton);
        reporterSnapshot(paymentContinueButton,"FALSE",flag.toString().toUpperCase().trim(),"COMPARE");
        //reporterSnapshot(paymentContinueButton,"Continue","","NULL");
    }
    public void validateProrationOverrideHidden(){
        getReusableActions().staticWait(2000);
        getReusableActions().scrollToElement(totalDue);
        getReusableActions().staticWait(1000);
        reporterSnapshot(null,"Proration Override", String.valueOf(
                prorationOverrideList ==null ? 0 : prorationOverrideList.size()), "HIDDEN");
    }
    public void validateProrationOverrideHiddenForPaymentDetailSection(){
        getReusableActions().staticWait(2000);
        getReusableActions().scrollToElement(monthlyService);
        getReusableActions().staticWait(1000);
        reporterSnapshot(null,"Proration Override", String.valueOf(
                prorationOverrideList ==null ? 0 : prorationOverrideList.size()), "HIDDEN");
        getReusableActions().staticWait(2000);
        getReusableActions().scrollToElement(paymentDetailSection);
        getReusableActions().staticWait(1000);
        reporterSnapshot(null,"Proration Override", String.valueOf(
                prorationOverrideList ==null ? 0 : prorationOverrideList.size()), "HIDDEN");

    }
    /** For CPP_45236 */
    public void validateCCTransactionRestrictedPPC(){
        getReusableActions().staticWait(4000);
        reporterSnapshot(null,"CCRestrictedCarePPC", String.valueOf(
                ccTopUpOption == null ? 0 : ccTopUpOption.size()), "HIDDEN");

    }

    public void selectTopUpOption(){
//        getReusableActions().javascriptScrollByVisibleElement(selectTopUpOption);
//        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(lowAccBalance);
        getReusableActions().staticWait(1000);
        reporterSnapshot(lowAccBalance,"Not Enough Money message","","DISPLAY");
        //selectTopUpOption.click();

    }
    public void clickOnContinueButtonEnrollUnenroll() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(continueButtonUnenroll);
        getReusableActions().staticWait(1000);
        continueButtonUnenroll.click();
        getReusableActions().staticWait(3000);}

        public void validateVoucherLessThanMSF() {
            getReusableActions().staticWait(2000);
            //getReusableActions().javascriptScrollByVisibleElement(topUpCardError);
            scrollToMiddleOfElement(topUpCardError);
            getReusableActions().staticWait(1000);
            reporterSnapshot(topUpCardError, "less than message", "", "DISPLAY");
        }
    public void validateProrationOverrideInAllPage() {
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(prorationOverrideMessage);
        getReusableActions().staticWait(1000);
        reporterSnapshot(prorationOverrideMessage, "Proration Override", "", "DISPLAY");
    }
    public void ValidateVoucherFiledSelcted(){
        getReusableActions().staticWait(2000);
        scrollToMiddleOfElement(voucherInput1);
        getReusableActions().staticWait(1000);
        reporterSnapshot(voucherInput1,"Voucher Input ","","NULL");
        }
    }