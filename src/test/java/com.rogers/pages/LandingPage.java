package com.rogers.pages;

import com.rogers.data.handlers.TestDataHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {
    @FindBy(xpath = "//*[text()='Sign up']")
    WebElement signUp;

    public LandingPage(WebDriver driver) {
        super(driver);
    }
    public void goToLandingPage() {
        getDriver().get(TestDataHandler.landingPageData.getSelfServeLandingPage());
        System.out.println("Going to Landing Page");
        reporter.reportLogWithScreenshot("NAC Home Page");
    }
    public void clickOnSignUp(){
        //getReusableActions().javascriptScrollByVisibleElement(signUp);
        scrollToMiddleOfElement(signUp);
        getReusableActions().isElementVisible(signUp,10);
        //getReporter().reportLogWithScreenshot("SignUp button is clicked");
        reporterSnapshot(signUp,"Sign UP","","NULL");
        getReusableActions().staticWait(1000);
        signUp.click();
        getReusableActions().staticWait(2000);
    }
    public void goToRetailLandingPage(){
        getDriver().get(TestDataHandler.landingPageData.getRetailerLandingPage());
    }

    public void goToLongDistancePage(){
        getDriver().get(TestDataHandler.landingPageData.getLongDistanceLandingPage());

    }
}
