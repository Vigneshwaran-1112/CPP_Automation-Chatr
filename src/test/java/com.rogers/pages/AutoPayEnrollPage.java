package com.rogers.pages;


import com.rogers.data.handlers.TestDataHandler;
import org.json.XML;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;


public class AutoPayEnrollPage extends BasePage{

    public AutoPayEnrollPage(WebDriver driver) {
        super(driver);
    }



    @FindBy(xpath = "//p[contains(text(),'Auto-pay services')]")
    WebElement autoPayPageServices;
    @FindAll({@FindBy(xpath = "//input[@id='ds-form-input-id-10']"),@FindBy(id = "ds-form-input-id-10")})
    WebElement topupMoney;
    @FindBy(xpath = "//span[text()='Auto-pay bonus!']/ancestor::div/h3")
    WebElement autoPayBonusText;
    @FindBy(xpath = "//p[text()=' Add a card ']")
    WebElement addCCard;
    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    WebElement continueButton;
    @FindBy(xpath = "//span[text()=' Back ']")
    WebElement backButton;
    @FindBy(xpath = "//h3[contains(text(),'Review')]")
    WebElement autopayenrollReviewText;
    @FindBy(xpath = "//h3[contains(text(),'Auto-pay')]")
    WebElement autoPayCardText;
    @FindAll({@FindBy(xpath = "//ds-checkbox/label/div[1]"),@FindBy(xpath = "//div[@class='ds-checkbox__box my-12 cds-icon-checkmark']")})
    WebElement autoPayTermsAndConditionsCheckbox;
    @FindBy(xpath = "//span[contains(text(),'dashboard')]")
    WebElement backToDashboardButton;
    @FindBy(xpath = "//ds-selection[1]")//(xpath = "//*[@class='ds-radioButton']")
    WebElement existingCreditCard;
    @FindBy(xpath = "//ds-selection[2]")
    WebElement addNewCreditCard;
    @FindBy(xpath = "//div[@class='d-flex col-12 mt-12 mb-8 px-12 py-8 ds-bgcolor-light-info ds-border-left bl-4 ds-brcolor-info']/span[2]")
    WebElement autoPayRenewalDate;
    @FindBy(xpath = "//h3[contains(text(),'Successfully')]")
    WebElement autoPaySuccessText;
    @FindBy(xpath = "//span[contains(text(),'Your')]")
    WebElement anniversaryText;
    @FindBy(xpath = "//span[contains(text(),'Your')]/following-sibling::span")
    WebElement nextAnniversaryDate;



    public void waitForPageToLoad() {
        getReusableActions().isElementVisible(autoPayPageServices,10);
        getReusableActions().staticWait(7000);
    }
    public void enrollAutopayWithTopup(String topUp){
        reporterSnapshot(autoPayPageServices,autoPayPageServices.getText(),"","common");
        getReusableActions().isElementVisible(topupMoney,10);
        topupMoney.sendKeys(topUp);
        getReusableActions().isElementVisible(continueButton,10);
        continueButton.click();
        getReusableActions().isElementVisible(existingCreditCard,10);
        existingCreditCard.click();
        getReusableActions().isElementVisible(continueButton,10);
    }
    public void enrollAutopayWithoutTopup(){
        reporterSnapshot(autoPayPageServices,autoPayPageServices.getText(),"","common");
        getReusableActions().isElementVisible(continueButton,10);
        continueButton.click();
        getReusableActions().isElementVisible(existingCreditCard,10);
//        getReusableActions().javascriptScrollByVisibleElement(existingCreditCard);
        existingCreditCard.click();
        getReusableActions().isElementVisible(continueButton,10);
        continueButton.click();
    }
    public void reviewEnroll(){
        reporterSnapshot(autopayenrollReviewText,autopayenrollReviewText.getText(),"","common");
        getReusableActions().isElementVisible(autoPayTermsAndConditionsCheckbox,5);
        autoPayTermsAndConditionsCheckbox.click();
        getReusableActions().isElementVisible(continueButton,10);
        continueButton.click();
    }
    public void confirmEnroll(){
        reporterSnapshot(autoPaySuccessText,autoPaySuccessText.getText(),"","common");
        reporterSnapshot(anniversaryText,anniversaryText.getText(),"","common");
        reporterSnapshot(autoPayBonusText,autoPayBonusText.getText(),"","common");
        reporterSnapshot(nextAnniversaryDate,nextAnniversaryDate.getText(),"","common");
        System.out.println(nextAnniversaryDate.getText());
        System.out.println(anniversaryText.getText());
    }

    public void enrollAutoPayAction(){
        reviewEnroll();
        confirmEnroll();
    }














}
