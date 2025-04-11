package com.rogers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PaymentPage  extends BasePage {


    // @FindBy(xpath = "//input[@formcontrolname='extraMoney']")
    @FindBy(xpath="//input[@formcontrolname='topUpAmount' or @formcontrolname='extraMoney' ]")
    WebElement topUpInput;
    @FindBy(xpath = "//div/ds-error/span[1]")
    WebElement topUpErrorMessage;
    @FindBy(xpath = "//iframe[@class]")
    WebElement ccDetailsFrame;

    @FindBy(xpath = "//input[@id='credit-card-input' or @name='cardNumber']")
    WebElement creditCardNumberInput;
    @FindBy(xpath = "//input[@id='security-code-input']")
    WebElement cvvInput;
    @FindBy(xpath = "//input[@id='month-year-input']")
    WebElement expiryDateInput;
    @FindBy(xpath = "//span[contains(text(),' Auto-pay ')]")////ds-radio-group/div/ds-selection[2]
    WebElement selectAutoPay;
    @FindBy(xpath = "//ds-checkbox[1]/label")
    WebElement selectBillingAddressAsPrimary;
    //@FindBy(xpath = "//span[contains(text(),'Continue')]") //span[contains(text(),'Continue')]" //css = "button.-primary")
    @FindAll({@FindBy(xpath = "//app-stepper-navigation[1]/div[1]/div[2]/div[1]/button[1]/span[1]"),@FindBy(xpath = "//span[contains(text(),'Continue')]")})
    WebElement continueButton;
    @FindBy(xpath = "(//span[contains(text(),' Back ')])[2]")//css = "button.-secondary"
    WebElement backButton;

    @FindAll({@FindBy(xpath = "//p[contains(text(),'Extra money')]"),@FindBy(xpath = "//*[contains(text(),'Extra money')]"),@FindBy(xpath = "//span[contains(text(),'Extra money')]")})
    WebElement extraMoneyInCart;
    @FindBy(xpath = "//p[contains(text(),'Extra money')]")
    WebElement extraMoneyInCartAutoPay;
    @FindBy(xpath = "//span[normalize-space()='Monthly plan fees']")
    WebElement planFeesDetails;
    @FindBy(xpath = "//div[contains(text(),'top-up')]")
    WebElement voucherRadioButton;
    @FindBy(xpath = "(//input[contains(@type,'tel')])")
    WebElement voucherInput;
    @FindBy(xpath = "//span[contains(text(),' One-time payment ')]")
    WebElement payOnce;
    @FindBy(xpath = "//span[text()=' Auto-pay ']")
    WebElement AutoPay;
    @FindBy(xpath = "//span[contains(text(),'Top-up card value:')]") ////span[contains(text(),'Voucher amount: 40$')] //(//span[@aria-relevant='additions'])[1] ////span[@role='alert']
    WebElement voucherAmountMessage;
    @FindBy(xpath = "(//div[@class='ds-radioButton__innerCircle'])[1]")
    WebElement radioButtonCC;
    @FindBy(xpath = "//p[contains(text(),'By providing your payment')]")//div/div[2]/ds-checkbox/label/div[1]") ////span[contains(text(),'acknowledge')]
    WebElement checkboxSaveCC;
    @FindBy(xpath = "//span[normalize-space()='Monthly plan fees']")
    WebElement monthlyServiceCart;
    @FindBy(xpath = "//span[contains(text(),'already')]")
    WebElement voucherError;
    @FindBy(xpath = "//span[contains(text(),'PIN exactly')]")
    WebElement voucherErrorinvalid;
    @FindBy(xpath = "//span[contains(text(),'card not found')]")
    WebElement voucherErrorinvalid1;
    @FindBy(xpath = "//ds-error//span[@role='img']")
    WebElement errorMsgIcon;
    @FindBy(xpath = "//span[contains(text(),'card found')]")
    WebElement validTopUpMessage;
    @FindBy(xpath = "//div[contains(text(),'top-up')]") //(//*[@class='ds-radioButton__outerCircle my-12'])[2]")
    WebElement topUpRadioButton;
    @FindBy(xpath = "(//input[@type='tel'])[2]")
    WebElement topUpCardPin;
    @FindBy(xpath = "//*[contains(text(),' Your account is barred from using voucher ')]")
    WebElement voucherInputError;
    @FindBy(xpath = "//*[contains(text(),'Delete Voucher')]//ancestor::div[2]//div[2]/span")
    WebElement XButton;
    @FindBy(xpath = "//div/ds-radio-group/div[3]/ds-radio-button/label/div[1]/div")
    List<WebElement> voucherRadioButtonList;
    @FindAll({@FindBy(xpath = "(//input[@type='tel'])[3]"),@FindBy(xpath = "(//input[@type='tel'])[2]")})   // 2 or 3 //input[@id='ds-form-input-id-9']
    WebElement voucherInputRetail;
    @FindBy(xpath = "//p[contains(text(),'Too many unsuccessful')]")
    WebElement voucherInput3TimesError;
    @FindBy(xpath = "//div[contains(text(),'Chatr top-up')]")//(//input[@type='radio']/following-sibling::div/div)[2]
    WebElement careChatrTopUp;

    @FindBy(xpath = "(//input[@type='tel'])[2]")
    WebElement CareVoucherPin;
    @FindBy(xpath = "//*[contains(text(),'Monthly service fee')]")
    WebElement moreMSFValue;
    @FindBy(xpath = "(//input[@type='tel'])[3]")
    WebElement retailVoucherPin;
    @FindBy(xpath = "//span[contains(text(),'Top-up card not found')]")
    WebElement voucherErrorinvalid2;
    @FindBy(xpath = "//button/span/ds-icon/span")
    WebElement voucherCloseXMark;
    @FindBy(xpath = "//span[contains(text(),\" Show top-up options \")]")
    List<WebElement> showTopUpOptions;
    @FindBy(xpath = "//span[contains(text(),'300')]")
    WebElement selfServeVoucherExceeded300;
    @FindBy(xpath = "//span[contains(text(),'This top up card is all talked out. try another one')]")
    WebElement selfServeVoucherAlreadyUsedError;
    @FindBy(xpath = "//div[contains(text(),'Credit card')]")
    List<WebElement> ccRadioButton;
    @FindBy(xpath = "//input[@id='credit-card-input']")
    List<WebElement> creditCardInputBox;
    @FindBy(xpath = "//*[contains(@title,'Continue')]") //css = "button.-primary")////span[contains(text(),'Submit')]
    WebElement submitButton;
    @FindBy(xpath = "//input[contains(@formcontrolname,'extra')]")
    WebElement topUpInput1;
    @FindBy(xpath = "//span[contains(text(),'Enough')]")
    WebElement sufficientAmountText;
    @FindBy(css = ".cds-icon-check-circle")
    WebElement sufficientAmountGreenTick;
    @FindBy(xpath = "//*[contains(text(),'Leave')]")
    WebElement leaveButton;
    @FindBy(xpath = "//input[@formcontrolname='postalCode']")
    WebElement postalCodeInput;
    @FindBy(xpath = "//div[contains(text(),'Mastercard')]")//(//*[@class='ds-radioButton__innerCircle'])[1]")
    WebElement radioButtonCreditCard;
    @FindBy(xpath = "//app-monthly-services-details[1]/div[1]/div[2]/div[3]/ds-price[1]/div[1]/div[1]/div[2]")
    WebElement autoPayextraMoneyInReviewPage;

    public PaymentPage(WebDriver driver){
        super(driver);
    }
    public void waitForPaymentPageLoad(){
        getReusableActions().isElementVisible(payOnce,10);
        getReusableActions().staticWait(7000);
    }
    public void setCreditCardDetails(String topUp, String creditCard,String cvv,String expiryDate){
        //Click on radio button CC
/*        getReusableActions().staticWait(2000);
        radioButtonCC.click();*/
        //set TopUp
        if (getDriver().findElements(By.xpath("//p[contains(text(),'Add a card')]")).size() > 0 ) {
            getDriver().findElement(By.xpath("//p[contains(text(),'Add a card')]")).click();
        }
        if (getDriver().findElements(By.xpath("//input[contains(@formcontrolname,'amount')]")).size() > 0 ) {
            topUpInput.click();
            topUpInput.sendKeys(topUp);
            scrollToMiddleOfElement(topUpInput);
            reporterSnapshot(topUpInput,"Extra Money","","NULL");
        }
        if (getDriver().findElements(By.xpath("//input[contains(@formcontrolname,'extra')]")).size() > 0 ) {
            topUpInput1.click();
            topUpInput1.sendKeys(topUp);
            scrollToMiddleOfElement(topUpInput1);
            reporterSnapshot(topUpInput1,"Extra Money","","NULL");
        }
        //app vesta iframe
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame,30);
        getReusableActions().staticWait(5000);
        //set Credit Card Details
        getReusableActions().javascriptScrollByVisibleElement(creditCardNumberInput);
        getReusableActions().clickWhenReady(creditCardNumberInput,20);
        creditCardNumberInput.sendKeys(creditCard);
        getReusableActions().clickWhenReady(cvvInput,10);
        cvvInput.sendKeys(cvv);
        getReusableActions().clickWhenReady(expiryDateInput,10);
        expiryDateInput.sendKeys(expiryDate);
        //reporter.reportLogWithScreenshot("Credit card details are populated");
        reporterSnapshot(creditCardNumberInput,"Credit Card Details","","NULL");
        getDriver().switchTo().defaultContent();
    }
    public void setCreditCardDetails(String creditCard,String cvv,String expiryDate){
        //Click on radio button CC
/*        getReusableActions().staticWait(2000);
        radioButtonCC.click();*/
        //set TopUp
        if (getDriver().findElements(By.xpath("//p[contains(text(),'Add a card')]")).size() > 0 ) {
            getDriver().findElement(By.xpath("//p[contains(text(),'Add a card')]")).click();
        }
        //app vesta iframe
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame,30);
        getReusableActions().staticWait(5000);
        //set Credit Card Details
        getReusableActions().javascriptScrollByVisibleElement(creditCardNumberInput);
        getReusableActions().clickWhenReady(creditCardNumberInput,20);
        creditCardNumberInput.sendKeys(creditCard);
        getReusableActions().clickWhenReady(cvvInput,10);
        cvvInput.sendKeys(cvv);
        getReusableActions().clickWhenReady(expiryDateInput,10);
        expiryDateInput.sendKeys(expiryDate);
        //reporter.reportLogWithScreenshot("Credit card details are populated");
        reporterSnapshot(creditCardNumberInput,"Credit Card Details","","NULL");
        getDriver().switchTo().defaultContent();
    }
    public void validateErrorMessageForInvalidTopUpValues(String topUp){
        getReusableActions().staticWait(4000);
        topUpInput.click();
        topUpInput.sendKeys(topUp);
        topUpInput.sendKeys(Keys.TAB);
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(AutoPay);
        getReusableActions().isElementVisible(topUpErrorMessage);
        //reporter.softAssert(topUpErrorMessage.getText().equals("A user account can have a maximum of 300$. Please enter a lower amount."),"VaLid error message for amount greater than 300$","Invalid error message");
        reporterSnapshot(topUpErrorMessage,"$300","","common");
    }
    public void selectAutoPay(){
        //getReusableActions().javascriptScrollByVisibleElement(selectAutoPay);
        getReusableActions().clickWhenReady(selectAutoPay,10);
        //reporter.reportLogWithScreenshot("AutoPay is selected");
        reporterSnapshot(selectAutoPay,"AutoPay","","NULL");
    }
    public void selectBillingAddressAsPrimaryAddress(){
        getReusableActions().javascriptScrollByVisibleElement(selectBillingAddressAsPrimary);
        getReusableActions().clickWhenReady(selectBillingAddressAsPrimary,10);
        getReusableActions().staticWait(3000);
        //reporter.reportLogWithScreenshot("Billing Address as Primary Address checkbox is clicked");
        reporterSnapshot(selectBillingAddressAsPrimary,"Billing Address","","Checkbox");
    }
    public void clickOnContinue(){
        getReusableActions().staticWait(1000);
        //getReusableActions().javascriptScrollByVisibleElement(continueButton);
        scrollToMiddleOfElement(continueButton);
        //continueButton.click();
        reporterSnapshot(continueButton,"Continue Button","","NULL");
        getReusableActions().staticWait(1000);
        getReusableActions().executeJavaScriptClick(continueButton);
        getReusableActions().staticWait(4000);
    }
    public void clickOnBack(){
       getReusableActions().javascriptScrollByVisibleElement(backButton);
       getReusableActions().clickWhenReady(backButton,10);
    }
    public void validateExtraMoneyAddInCart(String topUp){
        getReusableActions().staticWait(3000);
       // getReusableActions().javascriptScrollByVisibleElement(extraMoneyInCart);
        scrollToMiddleOfElement(extraMoneyInCart);
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(extraMoneyInCart);
        extraMoneyInCart.isDisplayed();
        //System.out.println(extraMoneyInCart.getText());
        //String extraAmount ="$"+topUp+".00";
        //System.out.println("add money added to cart "+extraAmount);
        //reporter.softAssert(extraMoneyInCart.getText().equals(extraAmount),"extra money :"+extraMoneyInCart.getText(),"extra money not added");
        reporterSnapshot(extraMoneyInCart,"Extra money","","common");
    }
    public void clickOnVoucherButton(){
        //getReusableActions().javascriptScrollByVisibleElement(voucherRadioButton);
        getReusableActions().staticWait(2000);
        voucherRadioButton.click();
    }
    public String enterVoucherPin(String voucherColumnName, String statusColumnName) {
        String voucherPin = getUnusedVoucherPin(voucherColumnName,statusColumnName);
        System.out.println("voucherPin"+voucherPin);
        getReusableActions().staticWait(2000);
        int cnt = getDriver().findElements(By.xpath("//input[contains(@type,'tel')]")).size();
        String locator = "(//input[contains(@type,'tel')])[%s]";
        locator = String.format(locator,cnt);
        System.out.println("locator - "+ cnt + locator);
        getReusableActions().staticWait(3000);
        getDriver().findElement(By.xpath(locator)).clear();
        getReusableActions().staticWait(2000);
        getDriver().findElement(By.xpath(locator)).click();
        getDriver().findElement(By.xpath(locator)).sendKeys(Keys.ENTER);
        getDriver().findElement(By.xpath(locator)).sendKeys(voucherPin);
        getReusableActions().staticWait(9000);
        if (getDriver().findElements(By.xpath("//ds-error//span[@role='img']")).size() > 0 )
            setUsedVoucherStatus(voucherPin,voucherColumnName,statusColumnName);
        else
            setUsedVoucherStatus(voucherPin,voucherColumnName,statusColumnName);
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(3000);
        reporterSnapshot(null,voucherPin,"","NULL");
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(3000);
        return voucherPin;
    }
    public void enterValidVoucherPin(String voucherPin){
        String[] strArray=voucherPin.split(";");
        for (int i=0;i<=strArray.length-1;i++){
            voucherPin = strArray[i];
            if (i == 0){
                voucherInput.clear();
                voucherInput.sendKeys(voucherPin);
                getReusableActions().staticWait(2000);
            }
            if (getDriver().findElements(By.xpath("//ds-error//span[@role='img']")).size() > 0 ) {
                voucherInput.clear();
                voucherInput.sendKeys(voucherPin);
                getReusableActions().staticWait(2000);
            }
            else
                break;
        }
        reporterSnapshot(voucherInput,voucherPin,"","NULL");
    }

    public void validateVoucherOnPaymentMethodPage() {
        getReusableActions().javascriptScrollByVisibleElement(payOnce);
        getReusableActions().staticWait(2000);
        reporter.softAssert(voucherAmountMessage.isDisplayed(), voucherAmountMessage.getText(), "invalid voucher message");
    }
    public void validatePaymentPageField(String topUp){
        getReusableActions().javascriptScrollByVisibleElement(payOnce);
        getReusableActions().staticWait(2000);
        reporter.softAssert(payOnce.getText().equals("Pay once"),payOnce.getText(),"payOnce not visible");
        reporter.softAssert(AutoPay.getText().equals("Auto-pay"),AutoPay.getText()," Auto-pay  not visible");
        String topUpAmount = "$"+topUp+".00";
        reporter.softAssert(topUpInput.getAttribute("value").equals(topUpAmount),topUpInput.getText(),"topUp not visible");
    }

    public void clickOnSaveCCCheckBox(){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(checkboxSaveCC);
        getReusableActions().clickWhenReady(checkboxSaveCC,10);
        getReusableActions().staticWait(3000);
    }
    public void validateExtraMoneyAddInCartAutoPay(String topUp){
        getReusableActions().javascriptScrollByVisibleElement(planFeesDetails);
        extraMoneyInCartAutoPay.isDisplayed();
        //System.out.println(extraMoneyInCartAutoPay.getText());
        //String extraAmount ="$"+topUp+".00";
        //System.out.println("add money added to cart "+extraAmount);
        //reporter.softAssert(extraMoneyInCartAutoPay.getText().equals(extraAmount),extraMoneyInCartAutoPay.getText(),"extra money not added");
        reporterSnapshot(extraMoneyInCartAutoPay,"Extra money","","common");
    }
    public void validatevouchererror(){
        /*getReusableActions().javascriptScrollByVisibleElement(voucherError);
        getReusableActions().staticWait(2000);*/
        scrollToMiddleOfElement(voucherError);
        //reporter.softAssert(voucherError.getText().equals("This top-up card is all talked out. Try another one."),"Voucher already used before","invalid voucher message");
        reporterSnapshot(voucherError,"already","","COMMON");
    }
    public void validateinvalidvouchererror(){
        getReusableActions().staticWait(4000);
        scrollToMiddleOfElement(voucherErrorinvalid);
        getReusableActions().staticWait(1000);
        //reporter.softAssert(voucherErrorinvalid.getText().equals("This top up card is not recognized. Try another one"),"Voucher invalid","Invalid voucher message not displayed");
        reporterSnapshot(voucherErrorinvalid,"PIN exactly","","COMMON");
    }
    public void validateinvalidvouchererror1(){
        scrollToMiddleOfElement(voucherErrorinvalid1);
        /*getReusableActions().javascriptScrollByVisibleElement(voucherErrorinvalid1);
        getReusableActions().staticWait(2000);*/
        //reporter.softAssert(voucherErrorinvalid.getText().equals("This top up card is not recognized. Try another one"),"Voucher invalid","Invalid voucher message not displayed");
        reporterSnapshot(voucherErrorinvalid1,"card not found","","COMMON");
    }
    public void validateinvalidvouchererror2(){
        getReusableActions().javascriptScrollByVisibleElement(voucherErrorinvalid2);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(voucherErrorinvalid.getText().equals("This top up card is not recognized. Try another one"),"Voucher invalid","Invalid voucher message not displayed");
        reporterSnapshot(voucherErrorinvalid2,"Top-up card not found","","COMMON");
    }
    public void setCreditCardDetails_MAO(String topUp, String creditCard,String cvv,String expiryDate){
        //set TopUp
//        topUpInput.click();
//        topUpInput.sendKeys(topUp);
        //app vesta iframe
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame,30);
        //set Credit Card Details
        getReusableActions().clickWhenReady(creditCardNumberInput,20);
        creditCardNumberInput.sendKeys(creditCard);
        getReusableActions().clickWhenReady(cvvInput,10);
        cvvInput.sendKeys(cvv);
        getReusableActions().clickWhenReady(expiryDateInput,10);
        expiryDateInput.sendKeys(expiryDate);
        reporter.reportLogWithScreenshot("Credit card details are populated");
        getDriver().switchTo().defaultContent();
    }
    public void validateValidTopUpMessage(){
        getReusableActions().staticWait(2000);
        scrollToMiddleOfElement(validTopUpMessage);
        reporterSnapshot(validTopUpMessage,"chatr top-up card found.","","COMMON");
        //reporter.softAssert(validTopUpMessage.getText().equals("chatr top-up card found."),validTopUpMessage.getText(),"valid topUp not found");
    }
    public void enterTopUpCardPin(String topUpPin){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(topUpRadioButton);
        reporter.softAssert(topUpRadioButton.isDisplayed(),"topUp Radio button display","topUp radio button not display");
        topUpRadioButton.click();
        getReusableActions().staticWait(2000);
        topUpCardPin.click();
        topUpCardPin.sendKeys(topUpPin);
        getReusableActions().staticWait(4000);
        //reporter.reportLogWithScreenshot("topUp pin entered");
    }
    public void validateInvalidVoucherPin(){
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(topUpRadioButton);
        reporterSnapshot(topUpRadioButton,"topUp Radio Button","","display");
        topUpRadioButton.click();
        for (int i=1;i<4;i++) {
            String voucherPIN = i + "12345678901";
            System.out.println(voucherPIN);
            getReusableActions().staticWait(2000);
            getReusableActions().javascriptScrollByVisibleElement(voucherInputRetail);
            voucherInputRetail.click();
            voucherInputRetail.clear();
            getReusableActions().staticWait(1000);
            voucherInputRetail.sendKeys(voucherPIN);
            getReusableActions().staticWait(500);
            reporterSnapshot(voucherInputRetail,voucherPIN,"","NULL");
            getReusableActions().staticWait(4000);
        }
        //getReusableActions().javascriptScrollByVisibleElement();
        scrollToMiddleOfElement(voucherInput3TimesError);
        getReusableActions().staticWait(1000);
        reporterSnapshot(voucherInput3TimesError,"Too many unsuccessful attempts","","common");
    }
    public void setCreditCardDetailsManageAddon(String creditCard,String cvv,String expiryDate){
        //Click on radio button CC
        getReusableActions().staticWait(2000);
        radioButtonCC.click();
        //app vesta iframe
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame,30);
        //set Credit Card Details
        getReusableActions().clickWhenReady(creditCardNumberInput,20);
        creditCardNumberInput.sendKeys(creditCard);
        getReusableActions().clickWhenReady(cvvInput,10);
        cvvInput.sendKeys(cvv);
        getReusableActions().clickWhenReady(expiryDateInput,10);
        expiryDateInput.sendKeys(expiryDate);
        //reporter.reportLogWithScreenshot("Credit card details are populated");
        getDriver().switchTo().defaultContent();
    }
    /*public void enterValidTopUpVoucher(String voucher){
        String[] strArray=voucher.split(";");
        for (int i=0;i<=strArray.length-1;i++){
            voucher = strArray[i];
            if (i == 0){
                enterVoucherPin(voucher);
            }
            if (errorMsgIcon.isDisplayed()) {
                enterVoucherPin(voucher);
            }
            else
                break;
        }
        reporterSnapshot(voucherInput,voucher,"","NULL");
    }*/
    public void clickOnX(){
        getReusableActions().javascriptScrollByVisibleElement(XButton);
        getReusableActions().clickWhenReady(backButton,10);
    }
    public void validateClickOnX(){
        getReusableActions().staticWait(3000);
        reporterSnapshot(voucherCloseXMark,"voucher Close XMark","","display");
        voucherCloseXMark.click();
        getReusableActions().staticWait(3000);
        //reporter.softAssert(voucherCloseXMark,"Navigate Back Button clicked successfully","Navigate Back Button didnot click successfully");
        reporterSnapshot(retailVoucherPin,"retail Voucher Pin","","EMPTY");
    }
    public void validateClickOnBack(){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(backButton);
        getReusableActions().clickWhenReady(backButton,10);
        getReusableActions().staticWait(3000);
        reporterSnapshot(leaveButton,"Leave","","COMMON");
        leaveButton.click();
        getReusableActions().staticWait(4000);
        reporter.reportLogWithScreenshot("back button clicked");
        String expectedValue = "Back button";
        getReusableActions().javascriptScrollByVisibleElement(continueButton);
        getReusableActions().staticWait(2000);
        reporter.softAssert(!(voucherRadioButtonList.size()>0),"VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY","INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE  DISPLAYED SUCCESSFULLY");
    }
    public void selectTopupCardVoucher(){
        getReusableActions().javascriptScrollByVisibleElement(careChatrTopUp);
        //reporter.softAssert(careChatrTopUp.isEnabled(), "Chatr TopUp card is Enabled", "Chatr Topup Card is disabled");
        careChatrTopUp.click();
        getReusableActions().staticWait(2000);
        CareVoucherPin.click();
        getReusableActions().staticWait(2000);
        //CareVoucherPin.sendKeys("993683300497");
        CareVoucherPin.sendKeys("186730574008");
        getReusableActions().staticWait(2000);
        //reporter.softAssert(getReusableActions().isElementVisible(moreMSFValue), moreMSFValue.getText(), "No Message displayed");
        reporterSnapshot(moreMSFValue,moreMSFValue.getText(),"","visible");
    }
    public void selectTopupCardVoucherRetail(String vouChar){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(careChatrTopUp);
        //reporter.softAssert(careChatrTopUp.isEnabled(), "Chatr TopUp card is Enabled", "Chatr Topup Card is disabled");
        careChatrTopUp.click();
        getReusableActions().staticWait(2000);
        retailVoucherPin.click();
        getReusableActions().staticWait(2000);
        //CareVoucherPin.sendKeys("993683300497");
        retailVoucherPin.sendKeys(vouChar);
        getReusableActions().staticWait(2000);
    }
    public void enterInvalidVoucherPin3Times(){
        getReusableActions().staticWait(2000);
        //getReusableActions().staticWait(2000);
        if (showTopUpOptions.size() > 0) {
            showTopUpOptions.get(0).click();
        }
        getReusableActions().javascriptScrollByVisibleElement(topUpRadioButton);
        for (int i=1;i<4;i++) {
            String voucherPIN = i + "12345678901";
            System.out.println(voucherPIN);
            getReusableActions().staticWait(2000);
            int cnt = getDriver().findElements(By.xpath("//input[contains(@type,'tel')]")).size();
            String locator = "(//input[contains(@type,'tel')])[%s]";
            locator = String.format(locator,cnt);
            System.out.println("locator - "+ cnt + locator);
            getReusableActions().staticWait(2000);
            getDriver().findElement(By.xpath(locator)).clear();
            getReusableActions().staticWait(2000);
            getDriver().findElement(By.xpath(locator)).click();
            getDriver().findElement(By.xpath(locator)).sendKeys(voucherPIN);
            getDriver().findElement(By.xpath(locator)).sendKeys(Keys.ENTER);
            getReusableActions().staticWait(7000);

/*            getReusableActions().javascriptScrollByVisibleElement(voucherInputRetail);
            voucherInputRetail.click();
            voucherInputRetail.clear();
            getReusableActions().staticWait(1000);
            voucherInputRetail.sendKeys(voucherPIN);
            getReusableActions().staticWait(3000);*/
        }
    }
    public void validateInvalidVoucherPinError(){
        getReusableActions().staticWait(7000);
        //getReusableActions().javascriptScrollByVisibleElement(radioButtonCreditCard);
        scrollToMiddleOfElement(voucherInput3TimesError);
        reporterSnapshot(voucherInput3TimesError,"Too many unsuccessful attempts","","common");
    }

    public void validVoucherPinSelfServe300$Error(){
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(selfServeVoucherExceeded300);
        getReusableActions().staticWait(1000);
        reporterSnapshot(selfServeVoucherExceeded300,"300","","common");
    }
    public String enterAndReturnValidVoucherPin(String voucherPin){
        String[] strArray=voucherPin.split(";");
        int cnt = getDriver().findElements(By.xpath("//input[contains(@type,'tel')]")).size();
        String locator = "(//input[contains(@type,'tel')])[%s]";
        locator = String.format(locator,cnt);
        for (int i=0;i<=strArray.length-1;i++){
            voucherPin = strArray[i];
            if (i == 0){
                getDriver().findElement(By.xpath(locator)).clear();
                getDriver().findElement(By.xpath(locator)).sendKeys(voucherPin);
                getReusableActions().staticWait(5000);
            }
            if (getDriver().findElements(By.xpath("//ds-error//span[@role='img']")).size() > 0 ) {
                getDriver().findElement(By.xpath(locator)).clear();
                getDriver().findElement(By.xpath(locator)).sendKeys(voucherPin);
                getReusableActions().staticWait(2000);
            }
            else
                break;
        }
        reporterSnapshot(voucherInput,voucherPin,"","NULL");
        return voucherPin;

    }
    public void validateCCTransactionRestricted() {
        reporterSnapshot(null, "CCRestrictedCareNac", String.valueOf(
                ccRadioButton == null ? 0 : ccRadioButton.size()), "hidden");
        reporterSnapshot(null, "CCRestrictedCareNac", String.valueOf(
                creditCardInputBox == null ? 0 : creditCardInputBox.size()), "hidden");
    }

    public void validateExtraMoneyNotMandate(){
        getReusableActions().isElementVisible(selectBillingAddressAsPrimary,20);
        getReusableActions().javascriptScrollToBottomOfPage();
        reporterSnapshot(selectBillingAddressAsPrimary,"","","DISPLAY");
    }
    public void clickOnSubmit(){
        getReusableActions().staticWait(3000);
        //getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().javascriptScrollByVisibleElement(submitButton);
        getReusableActions().staticWait(1000);
        submitButton.click();
        getReusableActions().staticWait(4000);

    }

    public void enterInvalidPin(String voucherPin) {
        getReusableActions().staticWait(2000);
        int cnt = getDriver().findElements(By.xpath("//input[contains(@type,'tel')]")).size();
        String locator = "(//input[contains(@type,'tel')])[%s]";
        locator = String.format(locator,cnt);
        scrollToMiddleOfElement(getDriver().findElement(By.xpath(locator)));
        System.out.println("locator - "+ cnt + locator);
        getReusableActions().staticWait(3000);
        getDriver().findElement(By.xpath(locator)).clear();
        getReusableActions().staticWait(2000);
        getDriver().findElement(By.xpath(locator)).click();
        getDriver().findElement(By.xpath(locator)).sendKeys(Keys.ENTER);
        getDriver().findElement(By.xpath(locator)).sendKeys(voucherPin);
        getReusableActions().staticWait(7000);
    }

    public void enterValidPin(String voucherPin) {
        getReusableActions().staticWait(2000);
        int cnt = getDriver().findElements(By.xpath("//input[contains(@type,'tel')]")).size();
        String locator = "(//input[contains(@type,'tel')])[%s]";
        locator = String.format(locator,cnt);
        System.out.println("locator - "+ cnt + locator);
        getReusableActions().staticWait(3000);
        getDriver().findElement(By.xpath(locator)).clear();
        getReusableActions().staticWait(2000);
        getDriver().findElement(By.xpath(locator)).click();
        getDriver().findElement(By.xpath(locator)).sendKeys(Keys.ENTER);
        getDriver().findElement(By.xpath(locator)).sendKeys(voucherPin);
        getReusableActions().staticWait(7000);
    }

    public void validateSufficientAmountText(){
        getReusableActions().staticWait(4000);
        scrollToMiddleOfElement(sufficientAmountText);
        getReusableActions().staticWait(1000);
        getReusableActions().waitForElementVisibility(sufficientAmountText);
        reporterSnapshot(sufficientAmountText,"Enough money in your account","","GEN");
        reporterSnapshot(sufficientAmountGreenTick,"Green Tick","","display");

    }
    public void validateMsfErrorMsg(){
        getReusableActions().staticWait(2000);
        //getReusableActions().scrollToElement(moreMSFValue);
        getReusableActions().javascriptScrollByVisibleElement(moreMSFValue);
        reporterSnapshot(moreMSFValue,moreMSFValue.getText(),"","display");
    }
    public void postalCodeSend(String postalCode){
        scrollToMiddleOfElement(postalCodeInput);
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(postalCodeInput, 10);
        postalCodeInput.click();
        getReusableActions().staticWait(500);
        postalCodeInput.sendKeys(postalCode);
        getReusableActions().staticWait(2000);
        reporterSnapshot(postalCodeInput,"Address Details","","NULL");
    }
    public void setCreditCardDetailswithOutTopUp( String creditCard,String cvv,String expiryDate){
        //Click on radio button CC
/*        getReusableActions().staticWait(2000);
        radioButtonCC.click();*/
        //set TopUp
        if (getDriver().findElements(By.xpath("//p[contains(text(),'Add a card')]")).size() > 0 ) {
            getDriver().findElement(By.xpath("//p[contains(text(),'Add a card')]")).click();
        }
        //app vesta iframe
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame,30);
        getReusableActions().staticWait(5000);
        //set Credit Card Details
        getReusableActions().javascriptScrollByVisibleElement(creditCardNumberInput);
        getReusableActions().clickWhenReady(creditCardNumberInput,20);
        creditCardNumberInput.sendKeys(creditCard);
        getReusableActions().clickWhenReady(cvvInput,10);
        cvvInput.sendKeys(cvv);
        getReusableActions().clickWhenReady(expiryDateInput,10);
        expiryDateInput.sendKeys(expiryDate);
        //reporter.reportLogWithScreenshot("Credit card details are populated");
        reporterSnapshot(creditCardNumberInput,"Credit Card Details","","NULL");
        getDriver().switchTo().defaultContent();
    }
    public void validateAutopayExtraMoneyinReviewPage(String topUp){
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(autoPayextraMoneyInReviewPage);
        getReusableActions().staticWait(1000);
        reporterSnapshot(autoPayextraMoneyInReviewPage,topUp,"","common");
    }
    public void postalCodeResend(){
        scrollToMiddleOfElement(postalCodeInput);
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(postalCodeInput, 10);
        String postalCode = postalCodeInput.getAttribute("value");
        System.out.println("Postal code value : "+postalCode);
        getReusableActions().executeJavaScriptClick(postalCodeInput);
        postalCodeInput.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        getReusableActions().staticWait(500);
        postalCodeInput.sendKeys(postalCode);
        getReusableActions().staticWait(2000);
        reporterSnapshot(postalCodeInput,"Address Details","","NULL");
    }
}
