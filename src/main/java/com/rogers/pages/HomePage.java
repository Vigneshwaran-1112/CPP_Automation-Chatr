package com.rogers.pages;

import com.rogers.pages.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;



public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='row topHeader']//a[@href='/business']")
    WebElement lnkBusiness;


    /**
     * Verify that loaded page should return response code less 400
     *
     * @return false if response code greater than or equal to 400 else true
     * @throws IOException
     * @author Vedachalam.Vasudevan
     */
    public boolean verifyLinks() throws IOException {
        HttpURLConnection httpURLConnect = null;
        int response;
        String responseMessage;
        getReusableActionsInstance().staticWait(1500);
        getReusableActionsInstance().waitForPageLoad();
        // waitforOverlayLoadingSpinnerToDisapper();
        System.out.println("URL: " + getDriver().getCurrentUrl());
        try {
            httpURLConnect = (HttpURLConnection) new URL(getDriver().getCurrentUrl()).openConnection();
            httpURLConnect.setConnectTimeout(10000);
            httpURLConnect.setReadTimeout(10000);
            httpURLConnect.connect();
            response = httpURLConnect.getResponseCode();
            responseMessage = httpURLConnect.getResponseMessage();
            httpURLConnect.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        System.out.println("Response Code: " + response);
        if (response >= 400) {
            System.out.println("ResponseMessage: " + responseMessage + " is a broken link");
            return false;
        }
        System.out.println("ResponseMessage: " + responseMessage + " is a link");
        return true;
    }
}
