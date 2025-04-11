package com.rogers.pages;

import com.rogers.pages.base.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;


public class ENSHomePage extends BasePage {

    public ENSHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//input[@type='email']")
    WebElement inputEmail;

    @FindBy (xpath = "//input[@type='submit']")
    WebElement btnNext;

    @FindBy (xpath = "//input[@type='password']")
    WebElement inputPassword;

    @FindBy (xpath = "//span[@class='submit']")
    WebElement btnSignIn;

    /**
     * Open a new tab and launch ENS url.
     * @param strEnsUrl, string of ENS url.
     */
    public void openNewTabForEns(String strEnsUrl) {
        JavascriptExecutor executor = (JavascriptExecutor)getDriver();
        String openNewWindow = "window.open('"+ strEnsUrl +"', '_blank')";
        executor.executeScript(openNewWindow);
        getReusableActionsInstance().waitForNumberOfWindowsToBe(2, 10);
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
//		getDriver().get(strEnsUrl);
    }

    /**
     * Set the email on login page
     * @param strEmail email to login
     */
    public void setEmail(String strEmail) {
        //getReusableActionsInstance().getWhenReady(inputEmail, 20).clear();
        //getReusableActionsInstance().getWhenReady(inputEmail).click();
        getReusableActionsInstance().getWhenReady(inputEmail).sendKeys(strEmail);
    }

    /**
     * Click on the next button
     */
    public void clkBtnNext() {
        getReusableActionsInstance().getWhenVisible(btnNext,10).click();
    }

    /**
     * Set the password on login page
     * @param strPassword password to login
     */
    public void setPassword(String strPassword) {

        if(getReusableActionsInstance().isElementVisible(inputPassword)) {
            getReusableActionsInstance().getWhenReady(inputPassword, 20).clear();
            getReusableActionsInstance().getWhenReady(inputPassword).click();
            getReusableActionsInstance().getWhenReady(inputPassword).sendKeys(strPassword);
        }

    }

    /**
     * Click on the Sign In button
     */
    public void clkBtnSignIn() {
        if(getReusableActionsInstance().isElementVisible(btnSignIn)) {
            getReusableActionsInstance().getWhenVisible(btnSignIn,10).click();
        }
    }


}
