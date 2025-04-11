package com.rogers.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoverageMapPage extends BasePage{

    @FindBy(xpath = "//*[@id='dsa-alert-0']")
    WebElement alertMessage;
    @FindBy(xpath = "//*[text()='CTA Link']")
    WebElement ctaLink;
    @FindBy(xpath = "//*[@class='ds-icon d-inline-flex cds-icon-close']")
    WebElement alertClose;
    @FindBy(xpath = "//h1[normalize-space()='Coverage']")
    WebElement coverageEnglish;
    @FindBy(xpath = "//h1[normalize-space()='Couverture']")
    WebElement coverageFrench;
    @FindBy(xpath = "//p[contains(text(),'Check out our coverage map to make sure')]")
    WebElement coverageMessageEnglish;
    @FindBy(xpath = "//p[contains(text(),'Consultez notre carte de couverture pour savoir si')]")
    WebElement coverageMessageFrench;
    @FindBy(xpath = "//p[normalize-space()='Nation-wide coverage']")
    WebElement nationWideCoverageEnglish;
    @FindBy(xpath = "//p[normalize-space()='Extended coverage']")
    WebElement extendedCoverageEnglish;
    @FindBy(xpath = "//p[normalize-space()='Our plans']")
    WebElement ourPlanEnglish;
    @FindBy(xpath = "//p[normalize-space()='Couverture partout au pays']")
    WebElement nationWideCoverageFrench;
    @FindBy(xpath = "//div/div/div[2]/dsa-value-prop/p[1]")
    WebElement extendedCoverageFrench;
    @FindBy(xpath = "//p[normalize-space()='Nos forfaits']")
    WebElement ourPlanFrench;
    @FindBy(xpath = "//input[@id='sbuzz_search_input']")
    WebElement searchInput;
    @FindBy(xpath = "//iframe[@id]")
    WebElement searchInputFrame;



    public CoverageMapPage(WebDriver driver){
        super(driver);
    }

    public void  validateAlertMessage(){
        getReusableActions().isElementVisible(alertMessage);
        getReusableActions().javascriptScrollByVisibleElement(alertMessage);
        //reporter.softAssert(ctaLink.getText().equals("CTA Link"),"default error","invalid message");
        reporterSnapshot(ctaLink,"CTA Link","","GEN");
        getReusableActions().clickWhenReady(alertClose);
        //reporter.reportLogWithScreenshot("close alert");
        reporterSnapshot(alertClose,"Close Alert","","NULL");
    }
    public void validateCoveragePageInEnglish(){
        getReusableActions().isElementVisible(coverageEnglish);
        getReusableActions().javascriptScrollByVisibleElement(coverageEnglish);
        //reporter.softAssert(coverageEnglish.getText().equals("Coverage"),coverageEnglish.getText(),"Coverage not display");
        reporterSnapshot(coverageEnglish,"Coverage","","GEN");
        String coverageMessageInfo =  coverageMessageEnglish.getText();
        //reporter.softAssert(coverageMessageEnglish.getText().equals(coverageMessageInfo),coverageMessageEnglish.getText(),"Invalid message");
        reporterSnapshot(coverageMessageEnglish,coverageMessageInfo,"","GEN");
        getReusableActions().javascriptScrollByVisibleElement(nationWideCoverageEnglish);
        //reporter.softAssert(nationWideCoverageEnglish.getText().equals("Nation-wide coverage"),nationWideCoverageEnglish.getText(),"message not display");
        //reporter.softAssert(extendedCoverageEnglish.getText().equals("Extended coverage"),extendedCoverageEnglish.getText(),"message not display");
        //reporter.softAssert(ourPlanEnglish.getText().equals("Our plans"),ourPlanEnglish.getText(),"plan not display in english");
        //reporter.reportLogWithScreenshot("coverage network information in English");
        reporterSnapshot(nationWideCoverageEnglish,"Nation-wide coverage","","GEN");
        reporterSnapshot(extendedCoverageEnglish,"Extended coverage","","GEN");
        reporterSnapshot(ourPlanEnglish,"Our plans","","GEN");
        reporterSnapshot(nationWideCoverageEnglish,"coverage network information in English","","null");
    }
    public void validateCoveragePageInFrench(){
        getReusableActions().isElementVisible(coverageFrench);
        getReusableActions().javascriptScrollByVisibleElement(coverageFrench);
        //reporter.softAssert(coverageFrench.getText().equals("Couverture"),coverageFrench.getText(),"Coverage not display");
        reporterSnapshot(coverageFrench,"Couverture","","GEN");
        String coverageMessageInfo =  coverageMessageFrench.getText();
        //reporter.softAssert(coverageMessageFrench.getText().equals(coverageMessageInfo),coverageMessageFrench.getText(),"Invalid message");
        reporterSnapshot(coverageMessageFrench,coverageMessageInfo,"","GEN");
        getReusableActions().javascriptScrollByVisibleElement(nationWideCoverageFrench);
        //reporter.softAssert(nationWideCoverageFrench.getText().equals("Couverture partout au pays"),nationWideCoverageFrench.getText(),"message not display");
        reporterSnapshot(nationWideCoverageFrench,"Couverture partout au pays","","GEN");
        String extendedCoverageFrenchField =extendedCoverageFrench.getText();
        //reporter.softAssert(extendedCoverageFrench.getText().equals(extendedCoverageFrenchField), extendedCoverageFrench.getText(),"message not display");
        //reporter.softAssert(ourPlanFrench.getText().equals("Nos forfaits"),ourPlanFrench.getText(),"plan not display in french");
        //reporter.reportLogWithScreenshot("coverage network information in French");
        reporterSnapshot(extendedCoverageFrench,extendedCoverageFrenchField,"","GEN");
        reporterSnapshot(ourPlanFrench,"Nos forfaits","","GEN");
        reporterSnapshot(nationWideCoverageFrench,"coverage network information in French","","null");
    }
    public void validateSearchStoreByPostalCode(String value){
        getReusableActions().staticWait(2000);
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(searchInputFrame, 30);
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollByVisibleElement(searchInput);
        getReusableActions().isElementVisible(searchInput,10);
       // searchInput.sendKeys(value);
        getReusableActions().enterText(searchInput,value,10);
        getReusableActions().staticWait(2000);
        searchInput.sendKeys(Keys.DOWN);
        searchInput.sendKeys(Keys.ENTER);
        getReusableActions().staticWait(2000);
        reporterSnapshot(searchInput,value,"","NULL");
    }
}
