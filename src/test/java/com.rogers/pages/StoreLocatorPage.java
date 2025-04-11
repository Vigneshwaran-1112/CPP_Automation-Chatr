package com.rogers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class StoreLocatorPage extends BasePage {

    @FindBy(xpath = "//*[@id='pac-input']")
    WebElement searchInput;
    @FindBy(xpath = "//ds-form-field/div/div[1]/select")
    WebElement dropdown;
    @FindBy(xpath = "//div/select/option[1]")
    WebElement defaultDropdownValue;
    @FindBy(xpath = "//*[@id='dsa-alert-0']")
    WebElement alertMessage;
    @FindBy(xpath = "//*[text()='CTA Link']")
    WebElement ctaLink;
    @FindBy(xpath = "//*[@class='ds-icon d-inline-flex cds-icon-close']")
    WebElement alertClose;
    @FindBy(xpath = "//app-store-item/div[1]/span/div")
    WebElement storeSerialNumber;
    @FindBy(xpath = "//app-store-item/div[1]/span/strong/small")
    WebElement storeName;
    @FindBy(xpath = "//div/div[3]/div/em")
    WebElement locationButton;
    @FindBy(xpath = "(//span[@class='pointer'])[5]")
    WebElement storeDetailsClickButton;
    @FindBy(xpath = "(//app-store-detail/div/div[1]/span[2])[2]")
    WebElement storeDetailsCloseButton;
    @FindBy(xpath = "(//app-store-detail/div/div[2]/a)[2]")
    WebElement getDirectionButton;
    @FindBy(xpath = "//*[text()='Grocery Stores']")
    WebElement groceryStores;
    @FindBy(xpath = "//*[text()='Drug Stores']")
    WebElement drugStores;
    @FindBy(xpath = "//*[text()='Gas Stations']")
    WebElement gasStations;
    @FindBy(xpath = "//*[text()=' Convenience Stores']")
    WebElement convenienceStores;
    @FindBy(xpath = "//button[@title='Zoom out']")
    WebElement mapZoomOut;
    @FindBy(xpath = "//button[@title='Zoom in']")
    WebElement mapZoomIn;
    @FindBy(xpath = "//*[@id='content']/app-store-locator/div/div[1]/div/div/h1")
    WebElement findStoreText;
    @FindBy(xpath = "(//span[contains(text(),'Lun')]/following::span[contains(text(),' - ')])[8]")
    WebElement storeTimingsLun;
    @FindBy(xpath = "(//span[contains(text(),'Mar')]/following::span[contains(text(),' - ')])[8]")
    WebElement storeTimingsMar;
    @FindBy(xpath = "(//span[contains(text(),'Mer')]/following::span[contains(text(),' - ')])[8]")
    WebElement storeTimingsMer;
    @FindBy(xpath = "(//span[contains(text(),'Jeu')]/following::span[contains(text(),' - ')])[8]")
    WebElement storeTimingsJeu;
    @FindBy(xpath = "(//span[contains(text(),'Ven')]/following::span[contains(text(),' - ')])[8]")
    WebElement storeTimingsVen;
    @FindBy(xpath = "(//span[contains(text(),'Sam')]/following::span[contains(text(),' - ')])[8]")
    WebElement storeTimingsSar;
    @FindBy(xpath = "(//span[contains(text(),'Dim')]/following::span[contains(text(),' - ')])[8]")
    WebElement storeTimingsDim;
    @FindBy(xpath = "((//span[contains(text(),'Mon')])[2]/following::span[contains(text(),' - ')])[1]")
    WebElement storeTimingsMon;
    @FindBy(xpath = "((//span[contains(text(),'Tue')])[2]/following::span[contains(text(),' - ')])[1]")
    WebElement storeTimingsTue;
    @FindBy(xpath = "((//span[contains(text(),'Wed')])[2]/following::span[contains(text(),' - ')])[1]")
    WebElement storeTimingsWed;
    @FindBy(xpath = "((//span[contains(text(),'Thu')])[2]/following::span[contains(text(),' - ')])[1]")
    WebElement storeTimingsThu;
    @FindBy(xpath = "((//span[contains(text(),'Fri')])[2]/following::span[contains(text(),' - ')])[1]")
    WebElement storeTimingsFri;
    @FindBy(xpath = "((//span[contains(text(),'Sat')])[2]/following::span[contains(text(),' - ')])[1]")
    WebElement storeTimingsSat;
    @FindBy(xpath = "((//span[contains(text(),'Sun')])[2]/following::span[contains(text(),' - ')])[1]")
    WebElement storeTimingsSun;
    @FindBy(xpath = "(//div[@aria-label=\" \"])[1]")
    WebElement locationMark;
    @FindBy(xpath = "//button[@aria-label='Close']")
    WebElement mapCloseButton;
    @FindBy(xpath = "//div[@aria-label=\"1\"]")
    WebElement storeLocation1;
    @FindBy(xpath = "//div[@aria-label=\"2\"]")
    WebElement storeLocation2;
    @FindBy(xpath = "//div[@aria-label=\"3\"]")
    WebElement storeLocation3;
    @FindBy(xpath = "(//span[text()='Details'])[4]")
    WebElement detailsLinkOnMap;

    @FindBy(xpath = "//*[contains(text(), 'gmail')]")
    List<WebElement> emailID;
    @FindBy(xpath = "//*[contains(text(), 'gmail')]")
    List<WebElement> storeDetailsLength;

    public StoreLocatorPage(WebDriver driver){
        super(driver);
    }
    public void searchStore(String value){
        getReusableActions().isElementVisible(searchInput,10);
        searchInput.sendKeys(value);
        getReusableActions().staticWait(2000);
        searchInput.sendKeys(Keys.DOWN);
        searchInput.sendKeys(Keys.ENTER);
        getReusableActions().staticWait(2000);
        //reporter.reportLogWithScreenshot("Validating Search Input using PinCode or City :" + value);
        reporterSnapshot(searchInput,value,"","NULL");
        getReusableActions().isElementVisible(storeSerialNumber);
    }
    public void validateDefaultFilterValue(){
        getReusableActions().isElementVisible(dropdown);
        //reporter.softAssert(getReusableActions().getSelectedValue(dropdown).equals("All store types"),"Default Option All store types is Correct","Invalid Default Option");
        reporterSnapshot(dropdown,"All store types","","dropdown1");
    }
    public void selectStore(String value){
        if(value.equals("Chatr")){
            getReusableActions().selectWhenReady(dropdown,"MAIN_STORE");
            //reporter.reportLogWithScreenshot("Chatr stores is selected");
            reporterSnapshot(dropdown,"Chatr Store","","NULL");
        }
        else{
            getReusableActions().selectWhenReady(dropdown,"PARTNER_STORE");
            //reporter.reportLogWithScreenshot("Retail stores is selected");
            reporterSnapshot(dropdown,"Retail Store","","NULL");
        }

    }
    public void validateChatrStore(){
        getReusableActions().isElementVisible(storeSerialNumber,10);
        //reporter.softAssert(storeSerialNumber.getAttribute("innerText").equals(" 1 "),"Valid Serial Number 1","Serial Number Missing");
        //reporter.softAssert(storeName.getAttribute("innerText").equals("CHATR STORE"),"Valid Store Name Chatr","Invalid Store Name");
        reporterSnapshot(storeSerialNumber," 1 ","","Innertext");
        reporterSnapshot(storeName,"CHATR STORE","","Innertext");
    }
    public void validateRetailerStore(){
        getReusableActions().isElementVisible(storeSerialNumber,10);
        //reporter.softAssert(storeSerialNumber.getAttribute("innerText").equals(" 1 "),"Valid Serial Number 1","Serial Number Missing");
        //reporter.softAssert(storeName.getAttribute("innerText").equals("RETAILER STORE"),"Valid Store Name Retail Partner","Invalid Store Name");
        reporterSnapshot(storeSerialNumber," 1 ","","Innertext");
        reporterSnapshot(storeName,"Retailer STORE","","Innertext");
    }
    public void validateStore(){
        String flag1 = "";
        getReusableActions().isElementVisible(storeSerialNumber,10);
        //reporter.softAssert(storeSerialNumber.getAttribute("innerText").equals(" 1 "),"Valid Serial Number 1","Serial Number Missing");
        //reporter.softAssert(storeName.getAttribute("innerText").equals("RETAILER STORE"),"Valid Store Name Retail Partner","Invalid Store Name");
        reporterSnapshot(storeSerialNumber," 1 ","","Innertext");
        if (storeName.getAttribute("innerText").equals("RETAILER STORE") || storeName.getAttribute("innerText").equals("CHATR STORE")) {
            flag1 = "All Store";
        }
        reporterSnapshot(storeName,"All Store",flag1,"match");
    }
    public void searchStoreUsingLocation() throws AWTException {
        Robot robot = new Robot();
        getReusableActions().clickWhenReady(locationButton,10);
        robot.delay(4000);
        robot.keyPress(KeyEvent.VK_F6);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        reporter.reportLogWithScreenshot("Validating Search using Location Button");
    }
    public void validateGetDirectionLink(){
        String parentWindow = getDriver().getWindowHandle();
        //Click Store Details
        getReusableActions().isElementVisible(storeDetailsClickButton,10);
        getReusableActions().staticWait(1000);
        getReusableActions().executeJavaScriptClick(storeDetailsClickButton);
        //getReusableActions().clickWhenReady(storeDetailsClickButton,10);
        //reporter.reportLogWithScreenshot("Store Details button is clicked");
        reporterSnapshot(storeDetailsClickButton,"Store Detail","","NULL");
        //Click GetDirectionLink
        getReusableActions().clickWhenReady(getDirectionButton,10);
        getReusableActions().switchToNewWindow(parentWindow);
        //reporter.softAssert(getDriver().getCurrentUrl().contains("https://www.google.com/maps/dir/"),"GetDirection link is working","GetDirection link is failing.");
        reporterSnapshot(getDirectionButton,"https://www.google.com/maps/dir/","","link");
        getReusableActions().closeCurrentWindow();
        getReusableActions().switchToMainWindow(parentWindow);
        getReusableActions().staticWait(1000);
        getReusableActions().executeJavaScriptClick(storeDetailsCloseButton);
        //getReusableActions().clickWhenReady(storeDetailsCloseButton,10);
        //reporter.reportLogWithScreenshot("Store Details Close button is clicked");
        reporterSnapshot(storeDetailsCloseButton,"Store Detail Close","","NULL");
    }
    public void  validateAlertMessage(){
        getReusableActions().javascriptScrollByVisibleElement(alertMessage);
        reporter.softAssert(ctaLink.getText().equals("CTA Link"),"default error","invalid message");
        getReusableActions().clickWhenReady(alertClose);
        reporter.reportLogWithScreenshot("close alert");
    }
    public void validateRetailerStores() {
        getReusableActions().javascriptScrollByVisibleElement(groceryStores);
        getReusableActions().clickWhenReady(groceryStores,10);
        reporter.reportLogWithScreenshot("Grocery store Retailer");
        getReusableActions().clickWhenReady(groceryStores,10);

        getReusableActions().clickWhenReady(drugStores,10);
        reporter.reportLogWithScreenshot("Drugs store Retailer");
        getReusableActions().clickWhenReady(drugStores,10);

        getReusableActions().javascriptScrollByVisibleElement(gasStations);
        getReusableActions().clickWhenReady(gasStations,10);
        reporter.reportLogWithScreenshot("Gas Stations Retailer");
        getReusableActions().clickWhenReady(gasStations,10);

        getReusableActions().clickWhenReady(convenienceStores,10);
        reporter.reportLogWithScreenshot("Convenience Stores Retailer");
        getReusableActions().clickWhenReady(convenienceStores,10);
    }
    public void validateStoreLocatorMap() {
        getReusableActions().javascriptScrollByVisibleElement(mapZoomOut);
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(mapZoomOut);
        getReusableActions().javascriptScrollByVisibleElement(storeDetailsClickButton);
        getReusableActions().staticWait(2000);
        int storeNumber = 5;
        //for (int storeNumber = 4; storeNumber < 7; storeNumber++) {
            String storeName = getDriver().findElement(By.xpath("(//app-store-item/div/span/strong/small)[" + storeNumber + "]")).getText();
            String storeLocation = getDriver().findElement(By.xpath("(//app-store-item/div[2]/p[1])[" + storeNumber + "]")).getText();
            String storeValues[] = storeLocation.split("\n");
            String storeDistance = storeValues[0];
            String storeAddress = storeValues[1];
            String storeTiming = getDriver().findElement(By.xpath("(//app-store-item/div[2]/p[2]/small)[" + storeNumber + "]")).getText();
            String storePhoneNumber = getDriver().findElement(By.xpath("(//app-store-item/div[2]/p[3]/span/a)[" + storeNumber + "]")).getText();
            getDriver().findElement(By.xpath("//div[@aria-label='"+(storeNumber-3) +"']")).click();
            String storeNameInMap = getDriver().findElement(By.xpath("//div[@role='dialog']/div/map-info-window/div/strong")).getText();
            String storeLocationInMap = getDriver().findElement(By.xpath("//div[@role='dialog']/div/map-info-window/div/p[1]")).getText();
            System.out.println(storeLocationInMap);
            String storeValuesInMap[] = storeLocationInMap.split("\n");
            String storeDistanceInMap = storeValuesInMap[0];
            String storeAddressInMap = storeValuesInMap[1];
            String storeTimingInMap = getDriver().findElement(By.xpath("//div[@role='dialog']/div/map-info-window/div/p[2]")).getText();
            String storePhoneNumberInMap = getDriver().findElement(By.xpath("//div[@role='dialog']/div/map-info-window/div/p[3]")).getText();
            /*reporter.softAssert(storeName.equals(storeNameInMap)
                    && storeDistance.equals(storeDistanceInMap)
                    && storeAddress.equals(storeAddressInMap)
                    && storeTiming.equals(storeTimingInMap)
                    && storePhoneNumber.equals(storePhoneNumberInMap), "Valid Store " + (storeNumber - 3) + " Details in Map", "Invalid Details In Map");
                    */
            //reporterSnapshot(storeDetailsClickButton,storeName,storeNameInMap,"compare");
            reporterSnapshot(storeDetailsClickButton,storeDistance,storeDistanceInMap,"compare");
            reporterSnapshot(storeDetailsClickButton,storeAddress,storeAddressInMap,"compare");
            reporterSnapshot(storeDetailsClickButton,storePhoneNumber,storePhoneNumberInMap,"compare");
            getReusableActions().staticWait(2000);
        //}
    }
    public void validateStoreLocatorMap1() {
        getReusableActions().javascriptScrollByVisibleElement(mapZoomOut);
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(mapZoomOut);
        getReusableActions().javascriptScrollByVisibleElement(storeDetailsClickButton);
        getReusableActions().staticWait(2000);
        int storeNumber = 5;
        //for (int storeNumber = 4; storeNumber < 7; storeNumber++) {
        String storeName = getDriver().findElement(By.xpath("(//app-store-item/div/span/strong/small)[" + storeNumber + "]")).getText();
        String storeLocation = getDriver().findElement(By.xpath("(//app-store-item/div[2]/p[1])[" + storeNumber + "]")).getText();
        String storeValues[] = storeLocation.split("\n");
        String storeDistance = storeValues[0];
        String storeAddress = storeValues[1];
        String storeTiming = getDriver().findElement(By.xpath("(//app-store-item/div[2]/p[2]/small)[" + storeNumber + "]")).getText();
        String storePhoneNumber = getDriver().findElement(By.xpath("(//app-store-item/div[2]/p[3]/span/a)[" + storeNumber + "]")).getText();
        getDriver().findElement(By.xpath("//div[@aria-label='"+(storeNumber-3) +"']")).click();
        String storeNameInMap = getDriver().findElement(By.xpath("//div[@role='dialog']/div/map-info-window/div/strong")).getText();
        String storeLocationInMap = getDriver().findElement(By.xpath("//div[@role='dialog']/div/map-info-window/div/p[1]")).getText();
        String storeValuesInMap[] = storeLocationInMap.split("\n");
        String storeDistanceInMap = storeValuesInMap[0];
        String storeAddressInMap = storeValuesInMap[1];
        String storeTimingInMap = getDriver().findElement(By.xpath("//div[@role='dialog']/div/map-info-window/div/p[2]")).getText();
        String storePhoneNumberInMap = getDriver().findElement(By.xpath("//div[@role='dialog']/div/map-info-window/div/p[3]")).getText();
        reporterSnapshot(storeDetailsClickButton,storeName,storeNameInMap,"compare");
        reporterSnapshot(storeDetailsClickButton,storeDistance,storeDistanceInMap,"compare");
        reporterSnapshot(storeDetailsClickButton,storeAddress,storeAddressInMap,"compare");
        reporterSnapshot(storeDetailsClickButton,storePhoneNumber,storePhoneNumberInMap,"compare");
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(mapZoomIn);
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(mapZoomIn);
        getReusableActions().staticWait(2000);
        reporterSnapshot(mapZoomIn,"Zoom In","","NULL");
        //}
    }
    public void validatePredictiveTextGenerator() {
        //reporter.softAssert(dropdown.isDisplayed(), "city is displayed", "city is not displayed");
        reporterSnapshot(dropdown,"City","","display");
    }
    public void validatePageLanguageChangeToFrench() {
        getReusableActions().isElementVisible(findStoreText);
        //reporter.softAssert(findStoreText.getText().equals("Trouver un magasin"), "page changed to french", "page not changed to french");
        reporterSnapshot(findStoreText,"Trouver un magasin","","Gen");
    }
    public void validatePageLanguageChangeToEnglish() {
        getReusableActions().isElementVisible(findStoreText);
        //reporter.softAssert(findStoreText.getText().equals("Find a store"), "page changed to English", "page not changed to English");
        reporterSnapshot(findStoreText,"Find a store","","Gen");
    }
    public void validate24hoursStoreTimingsFrench() {
        getReusableActions().isElementVisible(storeDetailsClickButton, 10);
        getReusableActions().clickWhenReady(storeDetailsClickButton, 10);
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(storeTimingsLun);
        System.out.println(storeTimingsMar.getText());
        reporterSnapshot(storeTimingsMar,"[0-9]*[0-9]\\:[0-9][0-9] \\- [0-9]*[0-9]\\:[0-9][0-9]","","format");
        reporterSnapshot(storeTimingsLun,"[0-9]*[0-9]\\:[0-9][0-9] \\- [0-9]*[0-9]\\:[0-9][0-9]","","format");
        reporterSnapshot(storeTimingsDim,"[0-9]*[0-9]\\:[0-9][0-9] \\- [0-9]*[0-9]\\:[0-9][0-9]","","format");
        reporterSnapshot(storeTimingsJeu,"[0-9]*[0-9]\\:[0-9][0-9] \\- [0-9]*[0-9]\\:[0-9][0-9]","","format");
        reporterSnapshot(storeTimingsMer,"[0-9]*[0-9]\\:[0-9][0-9] \\- [0-9]*[0-9]\\:[0-9][0-9]","","format");
        reporterSnapshot(storeTimingsVen,"[0-9]*[0-9]\\:[0-9][0-9] \\- [0-9]*[0-9]\\:[0-9][0-9]","","format");
        reporterSnapshot(storeTimingsSar,"[0-9]*[0-9]\\:[0-9][0-9] \\- [0-9]*[0-9]\\:[0-9][0-9]","","format");

//        reporter.softAssert(storeTimingsMar.getText().matches("[0-9]*[0-9]\\:[0-9][0-9] \\- [0-9]*[0-9]\\:[0-9][0-9]")
//                && storeTimingsLun.getText().matches("[0-9]*[0-9]\\:[0-9][0-9] \\- [0-9]*[0-9]\\:[0-9][0-9]")
//                && storeTimingsDim.getText().matches("[0-9]*[0-9]\\:[0-9][0-9] \\- [0-9]*[0-9]\\:[0-9][0-9]")
//                && storeTimingsJeu.getText().matches("[0-9]*[0-9]\\:[0-9][0-9] \\- [0-9]*[0-9]\\:[0-9][0-9]")
//                && storeTimingsMer.getText().matches("[0-9]*[0-9]\\:[0-9][0-9] \\- [0-9]*[0-9]\\:[0-9][0-9]")
//                && storeTimingsVen.getText().matches("[0-9]*[0-9]\\:[0-9][0-9] \\- [0-9]*[0-9]\\:[0-9][0-9]"), "VALID FIELD - \"" + storeTimingsMar.getText() + "\" ARE DISPLAYED 24HOURS FORMAT SUCCESSFULLY","INVALID : FIELD - \"" + storeTimingsMar.getText() + "\" ARE NOT DISPLAYED 24HOURS FORMAT SUCCESSFULLY");
    }
    public void validate12hoursStoreTimingsEnglish() {
        getReusableActions().isElementVisible(storeDetailsClickButton, 10);
        getReusableActions().staticWait(1000);
        getReusableActions().executeJavaScriptClick(storeDetailsClickButton);
       // getReusableActions().clickWhenReady(storeDetailsClickButton, 10);
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(storeTimingsMon);
        System.out.println(storeTimingsMon.getText());
        reporterSnapshot(storeTimingsMon,"[0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z] \\- [0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z]","","format");
        reporterSnapshot(storeTimingsTue,"[0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z] \\- [0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z]","","format");
        reporterSnapshot(storeTimingsWed,"[0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z] \\- [0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z]","","format");
        reporterSnapshot(storeTimingsThu,"[0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z] \\- [0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z]","","format");
        reporterSnapshot(storeTimingsFri,"[0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z] \\- [0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z]","","format");
        reporterSnapshot(storeTimingsSat,"[0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z] \\- [0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z]","","format");
        reporterSnapshot(storeTimingsSun,"[0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z] \\- [0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z]","","format");
        //        reporter.softAssert(storeTimingsMon.getText().matches("[0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z] \\- [0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z]")
//                && storeTimingsTue.getText().matches("[0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z] \\- [0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z]")
//                && storeTimingsWed.getText().matches("[0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z] \\- [0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z]")
//                && storeTimingsThu.getText().matches("[0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z] \\- [0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z]")
//                && storeTimingsFri.getText().matches("[0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z] \\- [0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z]")
//                && storeTimingsSat.getText().matches("[0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z] \\- [0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z]")
//                && storeTimingsSun.getText().matches("[0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z] \\- [0-9]*[0-9]\\:[0-9][0-9] [A-Z][A-Z]"), "VALID FIELD - \"" + storeTimingsMon.getText() + "\" ARE DISPLAYED 12HOURS AM/PM FORMAT SUCCESSFULLY","INVALID : FIELD - \"" + storeTimingsMon.getText() + "\" ARE NOT DISPLAYED 12HOURS AM/PM FORMAT SUCCESSFULLY");
    }
    public void validateLocationMarkOnMap(){
        getReusableActions().javascriptScrollByVisibleElement(locationMark);
        //reporter.softAssert(locationMark.isDisplayed(),"location mark is display","location mark is not Display");
        reporterSnapshot(locationMark,"Location Mark","","display");
    }
    public void validateDetectLocation(){
        getReusableActions().javascriptScrollByVisibleElement(storeLocation1);
        //getReusableActions().javascriptScrollToTopOfPage();
        storeLocation1.click();
        getReusableActions().staticWait(2000);
        //reporter.softAssert(storeLocation1.isDisplayed(),"Location1 is display","Location1 is not Display");
        reporterSnapshot(storeLocation1,"Location 1","","display");
        /*storeLocation2.click();
        //reporter.softAssert(storeLocation2.isDisplayed(),"Location2 is display","Location2 is not Display");
        reporterSnapshot(storeLocation2,"Location 2","","display");
        mapZoomOut.click();
        getReusableActions().staticWait(2000);
        storeLocation3.click();
        //reporter.softAssert(storeLocation3.isDisplayed(),"Location3 is display","Location3 is not Display");
        reporterSnapshot(storeLocation3,"Location 3","","display");*/
    }

    public void validateNoEmailIDShown(){

        getReusableActions().staticWait(4000);
        getReusableActions().clickWhenReady(detailsLinkOnMap,5);
        getReusableActions().staticWait(4000);
        reporterSnapshot(null,"Email ID Not Shown", String.valueOf(
                emailID ==null ? 0 : emailID.size()), "HIDDEN");
        reporterSnapshot(null,"Email ID Not Shown", String.valueOf(
                storeDetailsLength ==null ? 2 : storeDetailsLength.size()), "HIDDEN");


    }

}

