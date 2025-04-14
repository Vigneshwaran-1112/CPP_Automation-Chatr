package com.rogers.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReviewOrderPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'plan-price')]/ds-price/div/div/div[2]")
    WebElement planValue;
    @FindBy(xpath = "(//app-order-review-tile/div/div[2]/div[1]/p[2])[1]")
    WebElement phoneValue;
    @FindBy(xpath = "(//app-order-review-tile/div/div[2]/div[2]/p[2])[1]")
    WebElement accountName;
    @FindBy(xpath = "(//app-order-review-tile/div/div[2]/div[3]/p[2])[1]")
    WebElement dateOfBirth;
    @FindBy(xpath = "(//app-order-review-tile/div/div[2]/div[4]/p[2])[1]")
    WebElement emailValue;
    @FindBy(xpath = "(//app-order-review-tile/div/div[2]/div[1]/p[2])[2]")
    WebElement paymentType;
    @FindBy(xpath = "//app-order-review-tile/div/div[2]/div[4]/ds-price/div/div/div[2]")
    WebElement topUpAmount;
    @FindBy(xpath = "//p[contains(text(),'I have read, understood')]")       ////app-order-review//div//ds-checkbox    //ds-checkbox/label/div[1] //(//div[@aria-hidden='true'])[5]
    WebElement termsAndConditionCheckBox;
    @FindBy(xpath = "(//span[contains(text(),'Continue')])[3]")
    WebElement continueButton;
    @FindBy(css = "button.-secondary")
    WebElement backButton;
    @FindBy(xpath = "(//span[contains(text(),'Edit')])[2]")
    WebElement backStepSecond;
    @FindBy(xpath = "(//span[contains(text(),'Edit')])[3]")
    WebElement backStepThird;
    @FindBy(xpath = "(//span[contains(text(),'Edit')])[1]")
    WebElement backStepOne;
    @FindBy(xpath = "//div/p[text()='Phone number being transferred']/following-sibling::p")
    WebElement portInPhoneNumber;
    @FindBy(xpath = "//div/p[text()='Old service provider']/following-sibling::p")
    WebElement serviceProvider;
    @FindBy(xpath = "//div/p[text()='Phone serial number']/following-sibling::p")
    WebElement phoneSerialNumber2;
    @FindBy(xpath = "//input[contains(@type,'checkbox')]/following-sibling::div[2]")
    WebElement autoPayCheckBox;
    @FindBy(xpath = "//p[contains(text(),'Review')]")
    WebElement reviewSection;
    @FindBy(xpath = "//div[contains(text(),'Monthly service')]")
    WebElement monthlyServiceDetails;
    @FindBy(xpath = "//div[@class='text-overline']")
    WebElement autoPaySection;
    @FindBy(xpath = "//div[contains(text(),'Payment details')]")
    WebElement paymentDetailSection;
    @FindBy(xpath = "//p[text()='Top up details']")
    WebElement topUpDetailsSection;
    //@FindBy(xpath = "(//div[@aria-hidden='true'])[14]")//10
    @FindBy(xpath="//*[contains(text(),'esta service')]")
    WebElement vestaServiceAgreement;
    //@FindBy(xpath = "(//div[@aria-hidden='true'])[15]")//11
    @FindBy(xpath = "//*[contains(text(),'I authorize')]")//11////*[contains(text(),'I authorise')]/parent::p
            WebElement cCTermAndCondition;
    @FindBy(xpath = "(//input[@type='checkbox']/following-sibling::div[1])[1]")
    WebElement vestaServiceAgreementInBalance;
    @FindBy(xpath = "(//input[@type='checkbox']/following-sibling::div[1])[2]")
    WebElement cCTermAndConditionInBalance;
    @FindBy(xpath = "//span[contains(text(),'Total')]/following-sibling::span/ds-price")
    WebElement totalDueToday;
    @FindBy(xpath = "(//div[contains(text(),'Monthly service')])[1]")
    WebElement monthlyService;
    @FindBy(xpath = "//app-order-review//ds-checkbox[1]")
    WebElement termsAndConditionCheckBoxFrench;
    @FindBy(xpath = "//span[contains(text(),'Continuer')]")
    WebElement continueFrench;
    @FindBy(xpath = "//div[contains(@class,'plan-price')]/ds-price/div/div/div[1]")
    WebElement planValueFrench;
    @FindBy(xpath = "//app-order-review-tile/div/div[2]/div[1]/p[2]/span")
    WebElement phoneValueFrench;
    @FindBy(xpath = "//app-order-review-tile/div/div[2]/div[2]/p[2]")
    WebElement accountNameFrench;
    @FindBy(xpath = "//app-order-review-tile/div/div[2]/div[3]/p[2]")
    WebElement dateOfBirthFrench;
    @FindBy(xpath = "//app-order-review-tile/div/div[2]/div[4]/p[2]")
    WebElement emailValueFrench;
    @FindBy(xpath = "//div[2]/app-order-review-tile/div/div[2]/div[1]/p[2]")    //*[@id=\"content\"]/app-activation-wrapper/app-activation/div/div[2]/div/div[1]/app-order-review/div[1]/div[4]/div[2]/app-order-review-tile/div/div[2]/div[1]/p[2]
    WebElement paymentTypeFrench;
    @FindBy(xpath = "//app-order-review-tile/div/div[2]/div[4]/ds-price/div/div/div[2]")
    WebElement topUpAmountFrench;
    @FindBy(xpath = "(//app-order-review-tile/div/div[2]/div[3]/p[2])[2]")
    WebElement topUpCardPIN;
    @FindBy(xpath = "//button[contains(@title,'Continue')]")
    WebElement submitOrderReview;
    @FindBy(xpath = "//span[contains(text(),'charge')]")
    List<WebElement> chargeableTransactionLinkList;
    @FindBy(xpath = "//button[@title=\"Save summary Description\"]//span/span")
    List<WebElement> saveSummary;
    @FindBy(xpath = "//*[contains(text(),'I authorize')]")//11////*[contains(text(),'I authorise')]/parent::p
    WebElement iAuthorizedCheckBox;
    @FindBy(xpath = "//div[@class='dsa-orderTable']")
    WebElement orderSummary;
    @FindBy(xpath = "//*[contains(text(),'Tax')]")
    WebElement taxOnCart;
    @FindBy(xpath = "//*[contains(text(),'Top-up details')]")
    WebElement topUpDetailSection;
    @FindBy(xpath = "//p[contains(text(),'HST')]")
    WebElement hstInCart;


    public ReviewOrderPage(WebDriver driver){
        super(driver);
    }


    public void waitForReviewOrderPageLoad(){
        getReusableActions().isElementVisible(termsAndConditionCheckBox,30);
    }

    public void validateSummaryDetails(String plan, String phoneNumber, String name,String dob ,String email, String topUp ){
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(backStepOne);
        reporterSnapshot(planValue,plan,"","Gen");
        //reporterSnapshot(planValue,plan);
        //reporter.softAssert(planValue.getText().equals(plan),"Plan Value: " + plan + " is valid","Invalid Plan value");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(phoneValue);
        reporterSnapshot(phoneValue,phoneNumber,"","Gen");
        System.out.println("Created ctn -- "+phoneNumber.replaceAll("-",""));
        //reporter.softAssert(phoneValue.getText().equals(phoneNumber),"Phone Number: " + phoneNumber + " is valid","phone Number is Invalid");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(accountName);
        reporterSnapshot(accountName,name,"","Gen");
        //reporter.softAssert(accountName.getText().equals(name),"Account Name: " + name + " is valid", "Account Name is Invalid");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(dateOfBirth);
        reporterSnapshot(dateOfBirth,dob,"","Gen");
        //reporter.softAssert(dateOfBirth.getText().equals(dob),"DateOfBirth: " + dob + " is valid", "DateOfBirth is Invalid");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(emailValue);
        reporterSnapshot(emailValue,email,"","Gen");
        //reporter.softAssert(emailValue.getText().equals(email),"Email: " + email + " is valid", "Email is Invalid");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(paymentType);
        reporterSnapshot(paymentType,"One-time Payment","","Common");
        //reporter.softAssert(paymentType.getText().equals("Pay once"),"paymentType: " + paymentType.getText() + " is valid", "paymentType is Invalid");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(topUpAmount);
        reporterSnapshot(topUpAmount,topUp,"","Gen");
        //reporter.softAssert(topUpAmount.getText().equals(topUp),"TopUp Amount:  " + topUp + " is valid", "TopUp Amountis Invalid");
    }

    public void validateSummaryDetails(String plan, String phoneNumber, String name,String dob ,String email){
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(backStepOne);
        reporterSnapshot(planValue,plan,"","Gen");
        //reporterSnapshot(planValue,plan);
        //reporter.softAssert(planValue.getText().equals(plan),"Plan Value: " + plan + " is valid","Invalid Plan value");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(phoneValue);
        reporterSnapshot(phoneValue,phoneNumber,"","Gen");
        System.out.println("Created ctn -- "+phoneNumber.replaceAll("-",""));
        //reporter.softAssert(phoneValue.getText().equals(phoneNumber),"Phone Number: " + phoneNumber + " is valid","phone Number is Invalid");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(accountName);
        reporterSnapshot(accountName,name,"","Gen");
        //reporter.softAssert(accountName.getText().equals(name),"Account Name: " + name + " is valid", "Account Name is Invalid");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(dateOfBirth);
        reporterSnapshot(dateOfBirth,dob,"","Gen");
        //reporter.softAssert(dateOfBirth.getText().equals(dob),"DateOfBirth: " + dob + " is valid", "DateOfBirth is Invalid");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(emailValue);
        reporterSnapshot(emailValue,email,"","Gen");
        //reporter.softAssert(emailValue.getText().equals(email),"Email: " + email + " is valid", "Email is Invalid");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(paymentType);
        if(paymentType.getText().equalsIgnoreCase("One-time Payment")) {
            reporterSnapshot(paymentType, "One-time Payment", "", "Common");
        }else {
            reporterSnapshot(paymentType, "AUTO-PAY", "", "Common");
        }

        //reporter.softAssert(paymentType.getText().equals("Pay once"),"paymentType: " + paymentType.getText() + " is valid", "paymentType is Invalid");

        //reporter.softAssert(topUpAmount.getText().equals(topUp),"TopUp Amount:  " + topUp + " is valid", "TopUp Amountis Invalid");
    }
    public void clickOnPaymentTermsAndConditions(){
//        getReusableActions().staticWait(7000);
//        getReusableActions().isElementVisible(termsAndConditionCheckBox,20);
        //getReusableActions().javascriptScrollByVisibleElement(termsAndConditionCheckBox);
        //getReusableActions().clickWhenReady(termsAndConditionCheckBox,10);
        getReusableActions().staticWait(4000);;
        getReusableActions().scrollToElement(termsAndConditionCheckBox);
        getReusableActions().staticWait(1000);
         //getReusableActions().clickWhenReady(termsAndConditionCheckBox);
        termsAndConditionCheckBox.click();
        //reporter.reportLogWithScreenshot("Clicked on Payment Terms And Conditions");
        reporterSnapshot(termsAndConditionCheckBox,"Payment Terms And Conditions","","null");
        getReusableActions().staticWait(3000);
    }
    public void clickOnContinue(){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(continueButton);
        getReusableActions().staticWait(3000);
        getReusableActions().clickWhenReady(continueButton,10);
        getReusableActions().staticWait(2000);
    }
    public void clickOnSubmit(){
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().javascriptScrollByVisibleElement(submitOrderReview);
        getReusableActions().staticWait(3000);
        getReusableActions().clickWhenReady(submitOrderReview,10);
        getReusableActions().staticWait(2000);
    }
    public void clickOnBack(){
        getReusableActions().javascriptScrollByVisibleElement(backButton);
        getReusableActions().clickWhenReady(backButton,10);
    }
    public void clickOnBackStepTwo(){
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(backStepSecond);
        getReusableActions().staticWait(5000);
        getReusableActions().isElementVisible(backStepSecond);
        reporter.reportLogWithScreenshot("Edit Button Visible for Back to step 2");
        getReusableActions().staticWait(2000);
        //reporter.reportLogWithScreenshot("order review page");
        backStepSecond.click();
    }
    public void clickOnBackStepThird(){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(backStepThird);
        getReusableActions().staticWait(5000);
        getReusableActions().isElementVisible(backStepThird);
        reporter.reportLogWithScreenshot("Edit Button Visible for Back to step 3");
        getReusableActions().staticWait(2000);
        backStepThird.click();
    }
    public void validatePortInDetailsForCustomer(String providerNumber, String serviceProviderName, String serialNumberPort){
        getReusableActions().javascriptScrollByVisibleElement(portInPhoneNumber);
        reporter.softAssert(!portInPhoneNumber.getText().equals(providerNumber),portInPhoneNumber.getText(),"provider number is same");
        reporter.softAssert(serviceProvider.getText().equals(serviceProviderName),serviceProvider.getText(),"service provider is same");
        reporter.softAssert(!phoneSerialNumber2.getText().equals(serialNumberPort),phoneSerialNumber2.getText(),"phoneSerialNumber is same");
    }
    public void clickOnBackStepOne(){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        getReusableActions().staticWait(5000);
        getReusableActions().isElementVisible(backStepOne);
        reporter.reportLogWithScreenshot("back step link visible");
        backStepOne.click();
    }
    public void clickOnAutoPayCheckBox() {
        getReusableActions().staticWait(2000);
        //getReusableActions().javascriptScrollByVisibleElement(autoPayCheckBox);
        scrollToMiddleOfElement(autoPayCheckBox);
        getReusableActions().staticWait(1000);
        getReusableActions().isElementVisible(autoPayCheckBox, 10);
        autoPayCheckBox.click();
        reporterSnapshot(autoPayCheckBox," Auto pay Check Box","","Display");
    }
    public void validateSummaryDetailsAutoPay(String plan, String phoneNumber, String name,String dob ,String email, String topUp ){
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(planValue);
        reporterSnapshot(planValue,plan,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(phoneValue);
        reporterSnapshot(phoneValue,phoneNumber,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(accountName);
        reporterSnapshot(accountName,name,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(dateOfBirth);
        reporterSnapshot(dateOfBirth,dob,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(emailValue);
        reporterSnapshot(emailValue,email,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(paymentType);
        reporterSnapshot(paymentType,"Auto-pay","","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(topUpAmount);
        reporterSnapshot(topUpAmount,topUp,"","Gen");
    }

    public void validateSummaryDetailsAutoPay(String plan, String phoneNumber, String name,String dob ,String email){
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(planValue);
        reporterSnapshot(planValue,plan,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(phoneValue);
        reporterSnapshot(phoneValue,phoneNumber,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(accountName);
        reporterSnapshot(accountName,name,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(dateOfBirth);
        reporterSnapshot(dateOfBirth,dob,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(emailValue);
        reporterSnapshot(emailValue,email,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(paymentType);
        reporterSnapshot(paymentType,"Auto-pay","","Gen");
        getReusableActions().staticWait(1000);
    }
    public void validateReviewOrderInPPC(){
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(3000);
        getReusableActions().isElementVisible(reviewSection);
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        getReusableActions().staticWait(500);
        //reporter.softAssert(reviewSection.isDisplayed(),reviewSection.getText(),"review section not display");
        reporterSnapshot(reviewSection,reviewSection.getText(),"","display");
       // getReusableActions().javascriptScrollByVisibleElement(monthlyServiceDetails);
        //reporter.softAssert(monthlyServiceDetails.isDisplayed(),monthlyServiceDetails.getText(),"monthly services not display");
        reporterSnapshot(monthlyServiceDetails,monthlyServiceDetails.getText(),"","display");
        //reporter.softAssert(autoPaySection.isDisplayed(),autoPaySection.getText(),"autoPay section not display");
        getReusableActions().javascriptScrollByVisibleElement(monthlyServiceDetails);
        getReusableActions().staticWait(500);
        reporterSnapshot(autoPaySection," AutoPay Status ","","display");
       // getReusableActions().javascriptScrollByVisibleElement(paymentDetailSection);
        //reporter.softAssert(paymentDetailSection.isDisplayed(),paymentDetailSection.getText(),"payment detail section not display");
        getReusableActions().javascriptScrollByVisibleElement(paymentDetailSection);
        getReusableActions().staticWait(500);
        reporterSnapshot(paymentDetailSection,paymentDetailSection.getText(),"","display");
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(3000);
    }
    public void clickOnTermAndConditions(){
        getReusableActions().staticWait(2000);
        //getReusableActions().javascriptScrollByVisibleElement(cCTermAndCondition);
        scrollToMiddleOfElement(cCTermAndCondition);
        getReusableActions().staticWait(1000);
        //vestaServiceAgreement.click();
        cCTermAndCondition.click();
        reporterSnapshot(cCTermAndCondition,"Terms and Condition","","NULL");
    }
    public void clickOnTermAndConditionsForInsufficientBalance(){
        //getReusableActions().staticWait(2000);
        //getReusableActions().javascriptScrollByVisibleElement(vestaServiceAgreementInBalance);
        //vestaServiceAgreementInBalance.click();
        getReusableActions().staticWait(2000);
        cCTermAndCondition.click();
        getReusableActions().staticWait(2000);
        //reporter.reportLogWithScreenshot("checkbox is checked");
        reporterSnapshot(cCTermAndCondition,"Service Agreement","","NULL");
    }
    public void validateTotalDueForPlan(){
        getReusableActions().staticWait(1000);
        scrollToMiddleOfElement(totalDueToday);
        getReusableActions().staticWait(500);
        //getReusableActions().javascriptScrollByVisibleElement(totalDueToday);
        //reporter.softAssert(totalDueToday.isDisplayed(),"total due is display ","total due not display");
        reporterSnapshot(totalDueToday,"Total Due","","display");
    }
    public void validateSummaryDetailsFrench(String plan, String phoneNumber, String name,String dob ,String email, String topup){
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(planValueFrench);
        reporterSnapshot(planValueFrench,plan,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(phoneValueFrench);
        reporterSnapshot(phoneValueFrench,phoneNumber,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(accountNameFrench);
        reporterSnapshot(accountNameFrench,name,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(dateOfBirthFrench);
        reporterSnapshot(dateOfBirthFrench,dob,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(emailValueFrench);
        reporterSnapshot(emailValueFrench,email,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(paymentTypeFrench);
        reporterSnapshot(paymentTypeFrench,"Payez une fois","","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(topUpAmountFrench);
        reporterSnapshot(topUpAmountFrench,topup,"","Gen");
    }
    public void clickOnPaymentTermsAndConditionsFrench(){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(termsAndConditionCheckBoxFrench);
        getReusableActions().isElementVisible(termsAndConditionCheckBoxFrench,10);
        getReusableActions().clickWhenReady(termsAndConditionCheckBoxFrench,10);
        getReusableActions().staticWait(1000);
        //reporter.reportLogWithScreenshot("Clicked on Payment Terms And Conditions");
        reporterSnapshot(termsAndConditionCheckBoxFrench,"Payment Terms And Conditions","","null");
        getReusableActions().staticWait(3000);
    }

    public void clickOnContinueFrench(){
        getReusableActions().javascriptScrollByVisibleElement(continueFrench);
        getReusableActions().clickWhenReady(continueFrench,10);
    }
    public void validateSummaryDetailsPIN(String plan, String phoneNumber1, String name,String dob ,String email, String topUp ){
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(planValue);
        reporterSnapshot(planValue,plan,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(phoneValue);
        System.out.println("phoneNumber"+phoneNumber1);
        System.out.println("phoneNumber getText"+phoneValue.getText());
        reporterSnapshot(phoneValue,phoneNumber1,"","Common");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(accountName);
        reporterSnapshot(accountName,name,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(dateOfBirth);
        reporterSnapshot(dateOfBirth,dob,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(emailValue);
        reporterSnapshot(emailValue,email,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(paymentType);
        reporterSnapshot(paymentType,"One-time Payment","","Common");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(topUpCardPIN);
        reporterSnapshot(topUpCardPIN,topUp.substring(8,12),"","Common");
    }
    public void validateChargeableTransactionLinkDoesNotShow() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(reviewSection);
        getReusableActions().staticWait(2000);
        reporterSnapshot(null, "Chargeable Link", String.valueOf(
                chargeableTransactionLinkList == null ? 0 : chargeableTransactionLinkList.size()), "HIDDEN");
    }
    public void validateSaveSummaryHidden(){
        getReusableActions().staticWait(4000);
        reporterSnapshot(null,"saveSummaryHiddenCareNAc", String.valueOf(
                saveSummary == null ? 0 :  saveSummary.size()), "HIDDEN");
    }
    public void validateVoucherSummaryDetails(String plan, String phoneNumber, String name,String dob ,String email, String topUp ){
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(planValue);
        reporterSnapshot(planValue,plan,"","Gen");
        //reporterSnapshot(planValue,plan);
        //reporter.softAssert(planValue.getText().equals(plan),"Plan Value: " + plan + " is valid","Invalid Plan value");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(phoneValue);
        reporterSnapshot(phoneValue,phoneNumber,"","Gen");
        //reporter.softAssert(phoneValue.getText().equals(phoneNumber),"Phone Number: " + phoneNumber + " is valid","phone Number is Invalid");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(accountName);
        reporterSnapshot(accountName,name,"","Gen");
        //reporter.softAssert(accountName.getText().equals(name),"Account Name: " + name + " is valid", "Account Name is Invalid");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(dateOfBirth);
        reporterSnapshot(dateOfBirth,dob,"","Gen");
        //reporter.softAssert(dateOfBirth.getText().equals(dob),"DateOfBirth: " + dob + " is valid", "DateOfBirth is Invalid");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(emailValue);
        reporterSnapshot(emailValue,email,"","Gen");
        //reporter.softAssert(emailValue.getText().equals(email),"Email: " + email + " is valid", "Email is Invalid");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(paymentType);
        reporterSnapshot(paymentType,"One-time Payment","","Common");
        //reporter.softAssert(paymentType.getText().equals("Pay once"),"paymentType: " + paymentType.getText() + " is valid", "paymentType is Invalid");
    }
    public void clickOnTermAndConditionsForReviewPage(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(iAuthorizedCheckBox);
        iAuthorizedCheckBox.click();
    }
    public void validatePhoneNumberInReviewPage( String phoneNumber ) {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(phoneValue);
        reporterSnapshot(phoneValue, phoneNumber, "", "Gen");
    }
    public void validateTaxinShoppingCartReviewPage(){
        getReusableActions().staticWait(1000);
        scrollToMiddleOfElement(taxOnCart);
        getReusableActions().staticWait(500);
        reporterSnapshot(taxOnCart,"TAX","","Display");
        getReusableActions().staticWait(500);
        getReusableActions().javascriptScrollByVisibleElement(topUpDetailSection);
        getReusableActions().staticWait(500);
        reporterSnapshot(hstInCart,"HST","","Display");
    }
    public void validateTaxinShoppingCartOrderCofirmationPage() {
        getReusableActions().staticWait(1000);
        scrollToMiddleOfElement(taxOnCart);
        getReusableActions().staticWait(500);
        reporterSnapshot(taxOnCart, "TAX", "", "Display");
    }

}
