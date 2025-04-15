package com.rogers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderConfirmationPage extends BasePage {

    //@FindBy(xpath = "//div[@class='dsa-orderTable']")
    @FindAll({@FindBy(xpath = "//*[contains(text(),\"Order summary\")]"),@FindBy(xpath = "//*[contains(text(),\"Order Summary\")]")})
    WebElement orderSummary;
    @FindBy(xpath = "//div[@class='dsa-orderTable']/div/div[2]/div[2]/span")
    WebElement orderNumber;//app-add-ons-change-bill[1]/ds-tile[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/span[1]
    @FindBy(xpath = "//div[@class='dsa-orderTable']/div/div[3]/div[2]/span")
    WebElement orderDate;
    @FindBy(xpath = "(//*[contains(text(),'Payment method')]//ancestor::div[2]//div[2]/span)")
    WebElement paymentMethod;
    @FindBy(xpath = "//div[@class='dsa-orderTable']/div/div[4]/div[2]/span")
    WebElement orderLocation;
    @FindBy(xpath= "//app-order-confirmation/div[1]/div[2]/div[1]/div[1]/div[1]/span/span")
    WebElement getTempNumber;
    @FindBy(xpath= "//div[text()=' Your new plan is almost ready ']/following-sibling::div[3]")
    WebElement planActivationSection;
    @FindBy(xpath = "(//div[text()='Monthly service fees '])[1]")
    WebElement monthlyServiceDetails;
    @FindBy(xpath = "(//div[@class='text-overline'])[1]")
    WebElement autoPaySection;
    @FindBy(xpath = "//span[contains(text(),'HST')]")
    WebElement hstText;
    @FindBy(xpath = "//app-order-summary-widget[1]/ds-tile[1]/div[1]/app-order-table[1]/div[1]/div[1]/div[6]/div[2]/span[1]") ////app-order-table/div/div/div[8]/div[2]/span[1]
    WebElement hstAmount;
    @FindBy(xpath = "//app-order-table[1]/div[1]/div[1]/div[9]/span[2]/ds-price[1]/div[1]/div[1]") // 9(Alberta)
    WebElement totalDueAmount;
    @FindBy(xpath = "//span[contains(text(),'PST')]")
    WebElement pstText;
    @FindBy(xpath = "//app-order-table[1]/div[1]/div[1]/div[6]/div[2]/span[1]")
    WebElement pstAmount;
    @FindBy(xpath = "//span[contains(text(),'GST')]")
    WebElement gstText;
    @FindBy(xpath = "//app-order-table[1]/div[1]/div[1]/div[6]/div[2]/span[1]")  // 7 or 6(Alberta)
    WebElement gstAmount;
    @FindBy(xpath = "//app-order-table[1]/div[1]/div[1]/div[11]/span[2]/ds-price[1]/div[1]/div[1]/div[2]")
    WebElement total;
    @FindBy(xpath = "//span[contains(text(),'QST')]")
    WebElement qstText;
    @FindBy(xpath = "//app-order-table[1]/div[1]/div[1]/div[6]/div[2]/span[1]")
    WebElement qstAmount;
    @FindBy(xpath = "//*[contains(text(),'Extra money')]")
    WebElement extraMoneyInCartText;
    @FindBy(xpath = "//app-monthly-services-details[1]/div[1]/div[2]/div[3]/ds-price[1]/div[1]/div[1]/div[2]")//span[contains(text(),'Extra money')]
    WebElement extraMoneyInCart;
    @FindBy(css = ".ds-link__copy")
    List<WebElement> editLocation;
    @FindBy(xpath = "//span[contains(text(),'Change your location')]")
    WebElement changeLocation;
    @FindBy(xpath = "//app-order-confirmation/div[1]/div[2]/div/div[1]/div[1]/span/span")
    WebElement newNumber;
    @FindBy(xpath = "//div[contains(text(),'Your new phone number')]")
    WebElement yourNewNumber;
    @FindBy(xpath = "//app-order-table[1]/div[1]/div[1]/div[11]/span[2]/ds-price[1]/div[1]/div[1]/div[3]")
    WebElement totalBcDec;
    @FindBy(xpath = "//app-order-table[1]/div[1]/div[1]/div[12]/span[2]/ds-price[1]/div[1]/div[1]/div[3]/span")
    WebElement totalBcDecMontreal;
    @FindBy(xpath = "//a[text()=' My chatr ']")
    WebElement myChatr;
    @FindBy(xpath = "//lib-account-information[1]/div[1]/div[1]/div[2]/div[2]/div[3]/span[2]")
    WebElement emailId;
    @FindBy(xpath = "//lib-account-information[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
    WebElement ctn;
    @FindBy(xpath = "//button[contains(@aria-label,'Profile')]")
    WebElement profileTabBtn;
    @FindBy(xpath = "//lib-add-ons[1]/div[1]/lib-addon-am[1]/div[1]/ds-price[1]/div[1]/div[1]/div[2]")
    WebElement MSF;
    @FindBy(xpath = "//button[contains(@aria-label,'Plan details')]")
    WebElement planDetailsBtn;
    @FindBy(xpath = "//app-add-ons-change-bill[1]/ds-tile[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/span[1]")
    WebElement orderNumberNew;
    @FindBy(xpath = "//app-auto-pay-services-list[1]/div[2]/ds-price[1]/div[1]/div[1]/div[2]")
    WebElement autopayAmount;
    @FindBy(xpath = "//ds-table-container[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]")
    WebElement latestOrderNumber;
    @FindBy(xpath = "//app-order-table[1]/div[1]/div[1]/div[1]/div[2]/span[1]")
    WebElement simNumber;
    @FindBy(xpath = "//app-order-table[1]/div[1]/div[1]/div[5]/div[2]/span[1]")
    WebElement planInOrder;
    @FindBy(xpath = "//ds-expander[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]")
    WebElement confirmationPage;
    @FindBy(xpath = "//app-order-table[1]/div[1]/div[1]/div[11]/div[2]/span[1]")
    WebElement onetimeAddonOrderPage;
    @FindBy(xpath = "//app-order-table[1]/div[1]/div[1]/div[11]/span[2]/ds-price[1]/div[1]/div[1]")
    WebElement totalDueAmountForOntario;
    @FindBy(xpath = "//app-order-table[1]/div[1]/div[1]/div[7]/div[2]/span[1]")
    WebElement gstAmountQUBEC;
    @FindBy(xpath = "//app-order-summary-widget[1]/ds-tile[1]/div[1]/app-order-table[1]/div[1]/div[1]/div[7]/div[2]/span[1]")//span[contains(text(),'Extra money')]
    WebElement extraMoneyInCartOrder;
    @FindBy(xpath = "//*[contains(text(),'New add-ons')]")
    WebElement newAddonInOrdercofirm;
    @FindBy(xpath = "//app-order-table[1]/div[1]/div[1]/div[7]/div[2]/span[1]")  //
    WebElement gstAmountAlberta;
    @FindBy(xpath = "//app-order-table[1]/div[1]/div[1]/div[10]/span[2]/ds-price[1]/div[1]/div[1]")
    WebElement totalAlberta;
    public OrderConfirmationPage(WebDriver driver){
        super(driver);
    }
    public void waitForOrderConfirmationPage(){
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(orderSummary,20);
    }
    public void validateOrderSummaryDetails(String city, String provinceFullName){
        getReusableActions().staticWait(4000);
       // getReusableActions().javascriptScrollByVisibleElement(confirmationPage);
        //reporterSnapshot(confirmationPage,"Confirmation","","DISPLAY");
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate = formatter.format(date);
        String location = city + ", " + provinceFullName;
    //    getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(simNumber);
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(orderDate);
        getReusableActions().scrollToElement(orderDate);
        reporterSnapshot(orderDate,formattedDate,"","Gen");
 //       getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(paymentMethod);
        reporterSnapshot(paymentMethod,"CREDIT CARD, VISA DEBIT, OR DEBIT MASTERCARD,CHATR TOP-UP CARD","","COMPARE1");
     //   getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(orderLocation);
        reporterSnapshot(orderLocation,location,"","Gen");
      //  getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        reporterSnapshot(orderNumber,"Order Number","","Gettext");
    }

    public void validateVoucherOrderSummaryDetails(String city, String provinceFullName){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate = formatter.format(date);
        String location = city + ", " + provinceFullName;
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(orderDate);
        getReusableActions().javascriptScrollByVisibleElement(orderDate);
        reporterSnapshot(orderDate,formattedDate,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(paymentMethod);
        reporterSnapshot(paymentMethod,"CHATR TOP-UP CARD","","Common");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(orderLocation);
        reporterSnapshot(orderLocation,location,"","Gen");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(orderNumber);
        reporterSnapshot(orderNumber,"Order Number","","Gettext");
    }
    public String getTempCtnNumber(){
        String temporaryCTN =getTempNumber.getText().replace("-","");
        return temporaryCTN;
    }
    public void ValidateStatusOfCtn(String status){
        //reporter.softAssert(status.equals("AR"),"Status is active","Status is not active");
        reporterSnapshot(planActivationSection,status,"AR","Compare");
    }
    public void validateOrderConfirmationPage(){
        getReusableActions().staticWait(7000);
        //reporter.softAssert(planActivationSection.isDisplayed(), "plan section display","plan section not display");
        //reporterSnapshot(planActivationSection,"plan Activation Section","","display");
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        getReusableActions().staticWait(500);
        //reporter.softAssert(monthlyServiceDetails.isDisplayed(),monthlyServiceDetails.getText(),"monthly services not display");
        reporterSnapshot(monthlyServiceDetails,monthlyServiceDetails.getText(),"","display");
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(2000);
        //getReusableActions().javascriptScrollByVisibleElement(autoPaySection);
        scrollToMiddleOfElement(autoPaySection);
        //reporter.softAssert(autoPaySection.isDisplayed(),autoPaySection.getText(),"autoPay section not display");
        reporterSnapshot(autoPaySection,autoPaySection.getText(),"","display");
    }
    public void validateOrderSummaryDetailsFrench(String city, String provinceFullName){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate = formatter.format(date);
        String location = city + ", " + provinceFullName;
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(orderDate);
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(orderDate);

        reporterSnapshot(orderDate,formattedDate,"","Gen");
        //reporter.softAssert(orderDate.getText().equals(formattedDate),"Order Date" + orderDate.getText()+ " is Today","Order Date is Invalid");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(orderLocation);
        reporterSnapshot(orderLocation,location,"","Gen");
        //reporter.softAssert(orderLocation.getText().equals(location),"Valid Location : " + location,"Invalid Location");
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(orderNumber);
        reporterSnapshot(orderNumber,"Order Number","","Gettext");
        //reporter.softAssert(NumberUtils.isDigits(orderNumber.getText()),"Order Number: " + orderNumber.getText() + " is Numeric","Order Number is not Numeric");
    }

    /** This method is used for ON provinces **/
    public void validatingTaxAmount(float percentageHST,String plan,float extraMoney){
        getReusableActions().staticWait(4000);
        //getReusableActions().javascriptScrollToMiddleOfPage();
        scrollToMiddleOfElement(hstText);
        double hst = (double) (Float.parseFloat(plan)*(percentageHST/100.0));
        String hstAmt = "$"+String.format("%.2f",hst);
        System.out.println("HST Amount Tax Calculation == "+hstAmt);
        double hstforExtra = (double) ((extraMoney)*(percentageHST/100.0));
        String hstAmtforExtra = "$"+String.format("%.2f",hstforExtra);
        System.out.println("HST Amount For Extra Tax Calculation == "+hstAmtforExtra);
        double hstTotalAmount =  hst+ hstforExtra;
        String hsttotal = "$"+String.format("%.2f",hstTotalAmount);
        System.out.println("HST Total Amount  == "+hsttotal);
        reporterSnapshot(hstText,"HST","","GEN");
        reporterSnapshot(hstAmount,hstAmt,"","GEN");
        double totalAmount =  Float.parseFloat(plan) + hst +extraMoney+ hstforExtra;
        String totAmt = "$"+String.format("%.2f",totalAmount);
        System.out.println("Total Amount Tax Calculation == "+ totAmt);
        String totaldueAmountUI =totalDueAmountForOntario.getText().replaceAll("[^\\x20-\\x7E]+","");
        System.out.println("Total Amount Taken from UI == "+ totaldueAmountUI );
        reporterSnapshot(null,totAmt,totaldueAmountUI,"MATCH");
    }

    /** This method is used  AB provinces **/
    public void validatingGSTTaxAmount(float percentageGST,String plan){
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollToMiddleOfPage();
        double gst = (double) (Float.parseFloat(plan)*(percentageGST/100.0));
        String gstAmt = "$"+String.format("%.2f",gst);
        scrollToMiddleOfElement(gstText);
        reporterSnapshot(gstText,"GST","","GEN");
        reporterSnapshot(gstAmount,gstAmt,"","GEN");
        double totalAmount =  Float.parseFloat(plan) + gst ;
        String totAmt = "$"+String.format("%.2f",totalAmount);
        String totaldueAmountUI =totalDueAmount.getText().replaceAll("[^\\x20-\\x7E]+","");
//        System.out.println("Total BC INT -- "+totaldueAmountUIint);
//        String totaldueAmountUIDec =totalBcDec.getText();
//        System.out.println("Total BC DEC -- "+totaldueAmountUIDec);
//        String totaldueAmountUI = "$"+totaldueAmountUIint+totaldueAmountUIDec;
        System.out.println("Total BC -- "+totaldueAmountUI);
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        reporterSnapshot(null,totAmt,totaldueAmountUI,"MATCH");
    }
    /** This method is used for BC province **/
    public void validatingPSTTaxAmount(float percentageGST,float percentagePST,String plan){
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollToMiddleOfPage();
        double gst = (double) (Float.parseFloat(plan)*(percentageGST/100.0));
        String gstAmt = "$"+String.format("%.2f",gst);
        getReusableActions().javascriptScrollToMiddleOfPage();
        double pst = (double) (Float.parseFloat(plan)*(percentagePST/100.0));
        String pstAmt = "$"+String.format("%.2f",pst);
        getReusableActions().javascriptScrollByVisibleElement(pstText);
        reporterSnapshot(pstText,"PST","","GEN");
        reporterSnapshot(pstAmount,pstAmt,"","GEN");
        reporterSnapshot(gstText,"GST","","GEN");
        reporterSnapshot(gstAmountAlberta,gstAmt,"","GEN");
        double totalAmount =  Float.parseFloat(plan) + gst +pst;
        String totAmt = "$"+String.format("%.2f",totalAmount);
        getReusableActions().javascriptScrollByVisibleElement(totalAlberta);
        String totaldueAmountUI =totalAlberta.getText().replaceAll("[^\\x20-\\x7E]+","");
        //String actualTotaldueAmountUI = "$"+totaldueAmountUI+".00";
        reporterSnapshot(null,totAmt,totaldueAmountUI,"MATCH");
    }

    /** This method is used for QC province **/

    public void validatingQSTTaxAmount(float percentageGST,double percentageQST,String plan){
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollToMiddleOfPage();
        double gst = (double) (Float.parseFloat(plan)*(percentageGST/100.0));
        String gstAmt = "$"+String.format("%.2f",gst);
        getReusableActions().javascriptScrollToMiddleOfPage();
        double qst = (double) (Float.parseFloat(plan)*(percentageQST/100.0));
        String qstAmt = "$"+String.format("%.2f",qst);
        getReusableActions().javascriptScrollByVisibleElement(qstText);
        reporterSnapshot(qstText,"QST","","GEN");
        reporterSnapshot(qstAmount,qstAmt,"","GEN");
        reporterSnapshot(gstText,"GST","","GEN");
        reporterSnapshot(gstAmountQUBEC,gstAmt,"","GEN");
        double totalAmount =  Float.parseFloat(plan) + gst + qst;
        String totAmt = "$"+String.format("%.2f",totalAmount);
        getReusableActions().javascriptScrollByVisibleElement(total);
        String totaldueAmountUI =total.getText().replaceAll("[^\\x20-\\x7E]+","");
        String actualTotaldueAmountUI = "$"+totaldueAmountUI+totalBcDecMontreal.getText();
        reporterSnapshot(null,totAmt,actualTotaldueAmountUI,"MATCH");
    }
    public void validateExtraMoneyInOrderConfirmationPage(String extra) {
        getReusableActions().staticWait(3000);
        //getReusableActions().javascriptScrollByVisibleElement(extraMoneyInCart);
        scrollToMiddleOfElement(extraMoneyInCartText);
        getReusableActions().staticWait(2000);
        reporterSnapshot(extraMoneyInCartText, "Extra Money", "", "common");
    }
    public void clickEditLinkForChangeLocation(){
        //getReusableActions().scrollToElement(editLocation.get(1));
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        getReusableActions().staticWait(5000);
        reporterSnapshot(editLocation.get(1),"Edit","","COMMON");
        editLocation.get(1).click();
        getReusableActions().staticWait(7000);
        changeLocation.click();
    }
    public void validateChangedLocation(String city){
        //WebElement CurrenCity = getDriver().findElement(By.xpath("//div[contains(text(),"+city+")]"));
        WebElement CurrenCity = getDriver().findElement(By.xpath("//app-location-selector[1]/div[1]/div[1]/div[1]"));
        reporterSnapshot(CurrenCity, city, "", "COMMON");
    }

    public void validateOrderSummaryDetailsNewNumber(String phoneNumber) {

        getReusableActions().staticWait(3000);
        reporterSnapshot(newNumber,phoneNumber,"","CONTAINS");
        reporterSnapshot(yourNewNumber,"","","GEN");
    }
    public ArrayList<String> getOrderDetailsForManageAddOn(){
        ArrayList<String> order = new ArrayList<String>();
        order.add (orderNumberNew.getText()); //("2570595");//
        myChatr.click();
        getReusableActions().staticWait(2000);
        profileTabBtn.click();
        getReusableActions().javascriptScrollByVisibleElement(emailId);
        order.add(emailId.getText());
        String number =ctn.getText().replaceAll("-", "");
        order.add(number);
        getReusableActions().staticWait(3000);
        getDriver().navigate().refresh();
        getReusableActions().staticWait(8000);
        planDetailsBtn.click();
        getReusableActions().javascriptScrollByVisibleElement(MSF);
        order.add(MSF.getText());
        System.out.println("Order Number from Application -- "+order.get(0));
        System.out.println("E MAIL ID from Application -- "+order.get(1));
        System.out.println("CTN Number from Application -- "+order.get(2));
        System.out.println("MSF Number from Application -- "+order.get(3));
        return (order);
    }
    public String getNacOrderNumber() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(orderNumber);
        String nacOrderNumber =orderNumber.getText();
        return nacOrderNumber;
    }
    public String getMailId() {
        getReusableActions().staticWait(3000);
        myChatr.click();
        getReusableActions().staticWait(2000);
        profileTabBtn.click();
        getReusableActions().javascriptScrollByVisibleElement(emailId);
        String mail =emailId.getText();
        return mail;
    }
    public String getMobileNumber() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(ctn);
        String ctnNumber =ctn.getText();
        return ctnNumber;
        ////app-auto-pay-services-list[1]/div[2]/ds-price[1]/div[1]/div[1]/div[2]
    }
    public String getAutopayAmount() {
        getReusableActions().staticWait(6000);
        getReusableActions().javascriptScrollByVisibleElement(autopayAmount);
        String payAmount =autopayAmount.getText();
        return payAmount;
    }
    public String getLatestOrderNumber() {
        getReusableActions().staticWait(6000);
        getReusableActions().javascriptScrollByVisibleElement(latestOrderNumber);
        String lateOrderNumber =latestOrderNumber.getText();
        return lateOrderNumber;
    }
    public void validateOrderSummaryDetailsWithSimNumber(String city, String provinceFullName,String sim,String plan){
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(confirmationPage);
        //reporterSnapshot(confirmationPage,"Confirmation","","DISPLAY");
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate = formatter.format(date);
        String location = city + ", " + provinceFullName;
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(simNumber);
        getReusableActions().isElementVisible(simNumber);
        reporterSnapshot(simNumber,sim.substring(16),"","Common");
        getReusableActions().staticWait(2000);
        reporterSnapshot(planInOrder,"$"+plan+".00","","Common");
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(orderDate);
        //getReusableActions().scrollToElement(orderDate);
        reporterSnapshot(orderDate,formattedDate,"","Gen");
        getReusableActions().staticWait(1000);
        // getReusableActions().javascriptScrollByVisibleElement(paymentMethod);
        reporterSnapshot(paymentMethod,"CREDIT CARD, VISA DEBIT, OR DEBIT MASTERCARD,CHATR TOP-UP CARD","","COMPARE1");
        getReusableActions().staticWait(1000);
        // getReusableActions().javascriptScrollByVisibleElement(orderLocation);
        reporterSnapshot(orderLocation,location,"","Gen");
        getReusableActions().staticWait(1000);
        // getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        reporterSnapshot(orderNumber,"Order Number","","Gettext");
    }
    public void validateDataAddonOrderSummaryPage() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(onetimeAddonOrderPage);
        onetimeAddonOrderPage.isDisplayed();
        getReusableActions().staticWait(2000);
        reporterSnapshot(onetimeAddonOrderPage, "$10.00", "", "common");
    }
    public void validateOrderSummaryDetailsForPPCinSS(String city, String provinceFullName){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate = formatter.format(date);
        String location = city + ", " + provinceFullName;
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        getReusableActions().staticWait(1000);
        reporterSnapshot(orderDate,formattedDate,"","Gen");
        getReusableActions().staticWait(1000);
        reporterSnapshot(orderLocation,location,"","Gen");
        getReusableActions().staticWait(1000);
        reporterSnapshot(orderNumber,"Order Number","","Gettext");
        scrollToMiddleOfElement(autoPaySection);
        reporterSnapshot(autoPaySection,autoPaySection.getText(),"","display");
    }
    public void validateExtraMoneyInOrderConfirmationPageInCart(String extra) {
        getReusableActions().staticWait(3000);
        //getReusableActions().javascriptScrollByVisibleElement(extraMoneyInCart);
        scrollToMiddleOfElement(extraMoneyInCartOrder);
        getReusableActions().staticWait(2000);
        reporterSnapshot(extraMoneyInCartOrder, extra, "", "common");
    }
    public void validateAddOnOrderSummaryinRetail() {
        getReusableActions().staticWait(4000);
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        getReusableActions().staticWait(500);
        reporterSnapshot(newAddonInOrdercofirm,"New Addon","","Display");
    }
    public void validateOrderPageforMAO_SS(){
        getReusableActions().staticWait(7000);
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        getReusableActions().staticWait(500);
        reporterSnapshot(newAddonInOrdercofirm,"New Addon","","Display");
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(2000);
    }
}
