package com.rogers.pages;

import com.rogers.test.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopUpPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Top up')]")//span[contains(text(),'Top up today')]
    WebElement topUpTodayCTA;
    @FindBy(xpath = "//a[contains(@aria-label,'Sign in now')]")
    WebElement signInCTA;
    @FindBy(xpath = "//a[contains(@aria-label,'Ouvrir une session')]")
    WebElement signInCTAFrench;
    @FindBy(xpath="//a[@aria-label='Recharger']")
    WebElement signInTPTodayFrench;

    public TopUpPage(WebDriver driver) {super(driver);}

    public void clickTopUpToday(){
        scrollToMiddleOfElement(topUpTodayCTA);
        getReusableActions().waitForElementTobeClickable(topUpTodayCTA,10);
        topUpTodayCTA.click();
        getReusableActions().staticWait(5000);
    }
    public void clickSignInNow(){
        getReusableActions().waitForElementTobeClickable(signInCTA,10);
        String parent= getDriver().getWindowHandle();
        if(System.getProperty("Browser").equalsIgnoreCase("saucechrome")){
            getActionsInstance().keyDown(Keys.COMMAND).click(signInCTA).keyUp(Keys.COMMAND).perform();
        }
        else{
            getActionsInstance().keyDown(Keys.CONTROL).click(signInCTA).keyUp(Keys.CONTROL).perform();
        }
        getDriver().close();
        getReusableActions().switchToNewWindow();
        System.out.println("child"+ getDriver().getWindowHandle() + "Parent" + parent);
    }
    public void clickOuvrirUneSession(){
        getReusableActions().waitForElementTobeClickable(signInCTAFrench,10);
        signInCTAFrench.click();
    }

    public void clickTopUpTodayFrench(){
        getReusableActions().waitForElementTobeClickable(signInTPTodayFrench,10);
        signInTPTodayFrench.click();
    }

}