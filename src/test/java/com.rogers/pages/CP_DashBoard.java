package com.rogers.pages;

import com.rogers.data.handlers.TestDataHandler;
import oracle.security.crypto.cert.X509;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CP_DashBoard extends BasePage {

    @FindBy(xpath = "//app-care-account-page/div/h2")
    WebElement dashboardText;
    @FindBy(xpath = "//app-top-banner/ul/li[1]/span[2]/span[2]")
    WebElement phoneNumberText;
    @FindBy(xpath = "//div/lib-auto-pay")
    WebElement autoPay;
    @FindBy(xpath = "//div/lib-auto-pay/div/div[1]")
    WebElement enrollStatus;
    @FindBy(xpath = "//div/lib-auto-pay/div/div[3]/a/span/span/span")
    WebElement enrollButton;
    @FindBy(xpath = "//div/lib-auto-pay/div/div[2]/p[2]")
    WebElement enrollDate;
    @FindBy(xpath = "//div/lib-auto-pay/div/div[3]/a")
    WebElement enrollButton2;//
    @FindBy(xpath = "//div/lib-auto-pay/div/div[4]")
    WebElement autoPayText;
    @FindBy(xpath = "//div/lib-plan-details/div/div/div[2]/ds-picture")
    WebElement mobilicityBanner;
    @FindBy(xpath = "//ds-icon[@name='info']//span[@role='img']")
    WebElement emailFlagVerified;
    @FindBy(xpath = "//*[@title='Email address is not verified.']")
    WebElement emailFlagNotVerified;
    @FindBy(xpath = "//a[@href='/care']")
    WebElement customerSearchLink;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    WebElement paymentButton;
    @FindBy(xpath = "//app-payment-tab/div/ds-tile/div/lib-saved-cards/lib-saved-card")
    WebElement savedCardDetails;
    @FindBy(xpath = "//div/lib-plan-details/div/lib-plan/div")
    WebElement planDetails;
    @FindBy(xpath = "//a[contains(@title,'history')]")
    WebElement accountHistoryLink;
    @FindBy(xpath = "//span[contains(text(),'Your account balance')]")
    WebElement accountBalanceText;
    @FindBy(xpath = "//span[contains(text(),'Your account balance')]//ancestor::lib-balance-details//span[3]")
    WebElement accountBalanceValue;
    @FindBy(xpath = "//span[contains(text(),'status')]")
    WebElement accountStatusText;
    @FindBy(xpath = "//span[contains(text(),'status')]//ancestor::lib-status-details//span[3]")
    WebElement accountStatusValue;
    @FindBy(xpath = "//a[contains(text(),'Account history')]")
    WebElement accountDetailsLink;
    @FindBy(xpath = "//span[contains(text(),'anniversary date')]")
    WebElement anniversaryDateText;
    @FindBy(xpath = "//span[contains(text(),'anniversary')]/following-sibling::span[3]")
    WebElement anniversaryText;
    @FindBy(xpath = "//span[contains(text(),'anniversary')]/following-sibling::span[1]")
    WebElement anniversaryDateValue;
    @FindBy(xpath = "//span[contains(text(),'No Saved')]")
    WebElement noCardSave;
    @FindBy(xpath = "//span[contains(text(),'Email ')]/following-sibling::span[1]")
    WebElement emailElement;
    @FindBy(xpath = "(//button[@role='tab'])[1]")
    WebElement dashBoardButton;
    // @FindBy(xpath = "//span[contains(text(),'History reports')]/parent::span")
    //
    @FindBy(xpath = "//*[@title='History reports description']")
    WebElement historyReports;
    @FindBy(xpath = "//h3[contains(text(),'prefer')]")
    WebElement marketingPreferences;
    @FindBy(xpath = "//*[contains(text(),'essage')]//following-sibling::ds-switch")
    WebElement textMessagesSlider;
    @FindBy(xpath = "//*[contains(text(),'mail')]//following-sibling::ds-switch")
    WebElement textEmailSlider;
    @FindBy(xpath = "//p[contains(text(),'marketing')]")
    WebElement marketingMessage;
    @FindBy(xpath = "//label[contains(text(),'essages')]")
    WebElement textMessages;
    @FindBy(xpath = "//label[contains(text(),'mail')]")
    WebElement emailsText;
    @FindBy(xpath = "//span[contains(text(),'language do you prefer')]")
    WebElement languagePreferMessage;
    @FindBy(xpath = "//span[contains(text(),'English')]")
    WebElement englishLanguageButton;
    @FindBy(xpath = "//span[contains(text(),'Français')]")
    WebElement frenchLanguageButton;
    @FindBy(xpath = "//span[contains(text(),'Port-in')]")
    WebElement standalonePortInButton;
    @FindBy(xpath = "//span[contains(text(),'adjustment')]")
    List<WebElement> adjustmentLink;
    @FindBy(xpath = "//p[contains(text(),'adjustment')]")
    WebElement adjustmentModel;
    @FindBy(xpath = "//p[contains(text(),'current balance:')]")
    WebElement currentBalance;
    @FindBy(xpath = "//select[@formcontrolname='balanceCode']")
    WebElement balanceCode;
    @FindBy(xpath = "//ds-radio-button[2]/label/div[1]/div")
    WebElement debitOption;
    @FindBy(xpath = "//ds-radio-button[1]/label/div[1]/div")
    WebElement creditOption;
    @FindBy(xpath = "//input[@formcontrolname='enterAdjustmentAmount']")
    WebElement adjustmentAmountField;
    @FindBy(xpath = "//span[text()='Debit amount is greater than current balance']")
    WebElement errorMessage;
    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    WebElement windowSubmitButton;
    @FindBy(xpath = "//span[contains(text(),'Cancel')]")
    WebElement windowCancelButton;
    @FindBy(xpath = "//span[contains(text(),'charge')]")
    WebElement chargeableTransactionLink;
    @FindBy(xpath = "//p[contains(text(),'Administrative')]")
    WebElement chargeableTransactionModel;
    @FindBy(xpath = "//select[@formcontrolname='code']")
    WebElement codeOptions;
    @FindBy(xpath = "//select[@formcontrolname='charge']")
    WebElement chargeOptions;
    @FindBy(xpath = "//select[@formcontrolname='exception']")
    WebElement exceptionOptions;
    @FindBy(xpath = "//span[contains(text(),'is $50')]")
    WebElement errorMessage_credit;
    @FindBy(xpath = "//span[contains(text(),'is $50')]")
    WebElement errorMessage_debit;
    @FindBy(xpath = "//p[contains(text(),'adjustment?')]")
    WebElement confirmAdjustmentmodal;
    @FindBy(xpath = "//p[contains(text(),'Adjusted amount')]")
    WebElement adjustedAmount;
    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    WebElement windowConfirmButton;
    @FindBy(xpath = "//p[contains(text(),'Success')]")
    WebElement confirmSuccessModal;
    @FindBy(xpath = "//p[contains(text(),'balance:')]")
    WebElement custNewBal;
    @FindBy(xpath = "//span[contains(text(),'dashboard')]")
    WebElement winDashboardButton;
    @FindBy(xpath = "//h4[contains(text(),'No results found')]")
    WebElement noResultsError;
    @FindBy(xpath = "//span[contains(text(),'Change plan')]")
    WebElement msfPlan;
    @FindBy(xpath = "//p[contains(text(),'plan')]/following-sibling::div")
    WebElement locationOnDashboard;
    @FindBy(xpath = "//lib-port-in/div/div[3]/div[3]/div/div/div[2]/p")
    WebElement getTempNumberStandAlonePortIn;
    @FindBy(xpath = "//span[contains(text(),'Proceed')]")
    WebElement proceedCTA;
    @FindBy(xpath = "//button[contains(@title,'Yes')]")
    WebElement yesCTA;
    @FindBy(xpath = "//*[@formcontrolname=\"phoneNumber\"]")
    WebElement wirelessCTNField;
    @FindBy(xpath = "//*[contains(text(),\"eligible for transfer\")]")
    WebElement successWirelessCTNMsg;
    @FindBy(xpath = "//*[contains(text(),'current chatr')]/parent::div/following-sibling::div/p")
    WebElement currentChatrNoPanel;
    @FindBy(xpath = "//*[@formcontrolname='altPhoneNumber']")
    WebElement altPhoneNoField;
    @FindBy(xpath = "//span[contains(text(),'10-digit')]")
    List<WebElement> improperPhoneFormatError;
    @FindBy(xpath = "//input[@type='tel']")//*[@aria-label='1st Serial Number']")
    WebElement voucherInput;
    @FindBy(xpath = "//span[contains(text(),'Check another')]")
    WebElement addOneMoreLink;
    @FindBy(xpath = "(//button[@title='undefined'])[1]")
    WebElement binIcon;
    @FindBy(xpath = "//span[contains(text(),\"There isn't enough money in the customer\")]")
    WebElement error_InsufficientBal;
    @FindBy(xpath = "//span[contains(text(),'Plan')]")
    WebElement ppcLink;
    @FindBy(xpath = "(//button[contains(@title,'Top-up')])")
    WebElement topUpLink;
    @FindBy(xpath = "//span[contains(text(),'Get add-ons')]")
    WebElement selectAddOn;
    @FindBy(xpath = "//input[contains(@type,'checkbox')]/following-sibling::div[1]")
    WebElement addOnCheckbox;
    @FindBy(xpath = "//button[contains(@title,'Continue')]")
    WebElement continueButton;
    @FindBy(xpath = "//span[contains(text(),'Manage')]")
    WebElement manageLink;
    @FindBy(xpath = "(//div[contains(text(),'are ready')])[1]")
    WebElement orderConfirmBanner;
    @FindBy(xpath = "//*[contains(text(),'New add-ons')]")
    WebElement newAddOns;
    @FindBy(xpath = "//span[text()='One Time Data Plus 2GB']/following-sibling::ds-price")
    WebElement addOnAmount;
    @FindBy(xpath = "//*[contains(@title,'your location')]")
    WebElement notYourLocation;
    @FindBy(xpath = "//select[@id='ds-form-input-id-0']")
    WebElement citySelectDropdown;
    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    WebElement citySelectContinuebtn;
    @FindBy(xpath = "//ds-icon[@name='location']/following-sibling::div")
    WebElement displayedLocation;
    @FindBy(xpath = "//p[contains(text(),'port-in request')]")
    WebElement modalWindow;
    @FindBy(xpath = "//span[contains(text(),'Yes')]")
    WebElement modalWindowYes;
    @FindBy(xpath = "//span[contains(text(),'No')]")
    WebElement modalWindowNo;
    @FindBy(xpath = "//h4[contains(text(),'Auto')]")
    WebElement autoPayBlock;
    @FindBy(xpath = "//a[contains(@title,'Enroll')]")
    WebElement enRollLink;
    @FindBy(xpath = "//span[text()=' Override proration  ']")   //span[text()=' Proration override ']
    WebElement prorationOverride;
    @FindBy(xpath = "//input[@inputmode='numeric']")
    WebElement prorationAmount;
    @FindBy(xpath = "//span[contains(text(),'Proration override amount')]")//span[@aria-live='polite']
    WebElement prorationOverridemsg;
    @FindBy(xpath = "//span[contains(text(),'Plan')]")
    WebElement carePPC;
    @FindBy(xpath = "//span[contains(text(),'ending')]")
    List<WebElement> inflightOrderError;
    @FindBy(xpath = "//span[contains(text(),' expired. ')]")
    List<WebElement> expiredAccountError;
    @FindBy(xpath = "//span[contains(text(),'success')]")
    WebElement voucherAdded;
    @FindBy(xpath = "//span[contains(text(),'Active')]")
    WebElement activeStatus;
    @FindBy(xpath = "//span[contains(text(),'Inactive')]")
    WebElement expiredStatus;
    @FindBy(xpath = "//*[contains(text(),'Keep')]")
    List<WebElement> lookingGood;
    @FindBy(xpath = "//*[contains(text(),'track')]")
    List<WebElement> planAvailable;
    @FindBy(xpath = "//div[contains(@class,'circular-progress')]")
    List<WebElement> circularProgress;
    @FindBy(xpath = "//*[contains(@title,'Delete')]")
    List<WebElement> SavedCCDeleteIcons;
    @FindBy(xpath = "//button[contains(@title,'elete card')]/preceding-sibling::button")
    WebElement ConfirmSavedCCDeleteBtn;
    @FindBy(xpath = "//*[contains(@title,'Delete')]/preceding-sibling::button")
    List<WebElement> UpdateSavedCCIcons;
    @FindBy(xpath = "//*[contains(@formcontrolname,'expiration')]")  //input[@id='test']
    WebElement SavedCCUpdationExpiryField;//lib-saved-card[2]/form[1]/div[1]/ds-form-field[1]/div[1]/div[1]/input[1]
    @FindBy(xpath = "//*[contains(text(),'Update')]")
    WebElement SavedCCUpdationUpdateBtn;
    @FindBy(xpath = "//*[contains(text(),'Add')]")
    WebElement SavedCCAddCardBtn;
    @FindBy(xpath = "(//div[@class='ds-radioButton__innerCircle'])[1]")
    WebElement radioButtonCC;
    @FindBy(xpath = "//input[@formcontrolname='amount']")
    WebElement topUpInput;
    @FindBy(xpath = "//iframe[@class]")
    WebElement ccDetailsFrame;
    @FindBy(xpath = "//input[@id='credit-card-input']")
    WebElement creditCardNumberInput;
    @FindBy(xpath = "//input[@id='security-code-input']")
    WebElement cvvInput;
    @FindBy(xpath = "//input[@id='month-year-input']")
    WebElement expiryDateInput;
    @FindBy(xpath = "//span[text()='GO TO TOP-UP']")
    List<WebElement> topUpLinkList;
    @FindBy(xpath = "//span[text()='PPC']")
    List<WebElement> ppcLinkList;
    @FindBy(xpath = "//*[contains(@formcontrolname,'mount')]")
    WebElement topUpAmtFieldMAO;
    @FindBy(xpath = "//span[contains(text(),'our account balance')]/following-sibling::span")
    WebElement accountBalanceVal;
    @FindBy(xpath = "//*[contains(text(),'Promotions')]/following-sibling::div[1]//p")
    WebElement promotionEndDate;
    @FindBy(xpath = "//button[@title='Edit']")
    List<WebElement> editAccountInfoList;
    @FindBy(xpath = "//span[contains(text(),'Download')]")
    List<WebElement> exportToPDFCTAList;
    @FindBy(css = "button.-primary")
    WebElement saveButtonCC;
    @FindBy(xpath = "//*[contains(text(),'your payment')]")
    WebElement saveCCcheckbox;
    @FindBy(xpath = "//span[contains(text(),'Go to')]")
    WebElement goToAccount;
    @FindBy(xpath = "//*[contains(text(),'8881')]")
    WebElement card8881;
    @FindBy(xpath = "//*[contains(@title,'Delete')]")
    WebElement deleteBtnCC;
    @FindBy(xpath = "//*[contains(@title,'Delete card')]")
    WebElement deleteCardBtnCC;

    @FindBy(xpath = "//span[contains(text(),'Date ')]/following-sibling::span[1]")
    WebElement dateOfBirthElement;
    @FindBy(xpath = "//span[contains(text(),'Postal ')]/following-sibling::span[1]")
    WebElement postalCodeElement;
    @FindBy(xpath = "//*[contains(text(),'Welcome')]")
    WebElement champWelcome;
    @FindBy(xpath = "//*[contains(text(),'Logout')]")
    WebElement champLogOut;
    @FindBy(xpath = "//*[contains(text(),'Login')]")
    WebElement champLogInAgain;
    @FindBy(xpath = "//div[contains(text(),'Saved cards')]")
    WebElement savedCardText;
    @FindBy(xpath = "//div[contains(text(),'Securely store up to 5 cards.')]")
    WebElement securelyStoreText;
    @FindBy(xpath = "//app-top-up-credit-card-form-tp[1]")
    WebElement savedCCDetails;
    @FindBy(xpath = "//span[contains(text(),'Manage account P')]")
    List<WebElement> managePINList;
    @FindBy(xpath = "//span[contains(text(),'Save')]")
    WebElement savedCCUpdateAndSave;
    @FindBy(xpath = "//form/div/div/ds-checkbox/label/div[1]")
    WebElement checkboxCreditCard;
    @FindBy(css = ".mt-16.mb-16")
    WebElement currentCarrier;
    @FindBy(xpath = "//span[contains(text(),'10-digits')]")
    WebElement altNumberErrorMessage;
    @FindBy(xpath = "//p[contains(text(),'Enrolled on ')]")
    WebElement enrolledOn;
    @FindBy(xpath = "(//button[@title='undefined'])[1]")
    List<WebElement> binIconList;
    @FindBy(xpath = "//*[@formcontrolname='esnImeiMeid']")
    WebElement phoneSerialNumber;
    @FindBy(xpath = "//*[@formcontrolname='accountNumber']")
    WebElement accountNumber;
    @FindBy(xpath = "//*[@formcontrolname='accountPin']")
    WebElement accountPin;
    @FindBy(xpath = "//span[contains(text(),'serial number')]")
    WebElement imeiErrorMessage;
    @FindBy(xpath = "//span[contains(text(),'unable to recognize your account')]")
    WebElement accountNoErrorMessage;
    @FindBy(xpath = "//span[contains(text(),'unable to recognize your PIN')]")
    WebElement pinNoErrorMessage;
    @FindBy(xpath = "//app-proration-override-modal[1]/ds-modal[1]/div[2]/div[1]/div[1]/p[1]/span[1]")
    WebElement prorationOverirdeAmount;
    @FindBy(xpath ="(//span[contains(text(),'Continue')]/ancestor::button)[2]")
    WebElement confirmProrationOverride;
    @FindBy(xpath ="//p[contains(text(),' Proration adjustment ')]")
    WebElement ProrationOverride;
    @FindBy(xpath = "//p[contains(text(),'Port-in')]")
    WebElement PortInReqSucessWindow;
    @FindBy(xpath = "//span[contains(text(),' Back to customer dashboard ')]")
    WebElement backToDashBoard;
    @FindBy(xpath = "//span[contains(text(),'Back to customer search')]")
    WebElement cussearchLink;
    @FindBy(xpath = "(//span[contains(normalize-space(),'CHATR-Auto')])[1]")
    WebElement envButton;
    @FindBy(xpath = "//a[normalize-space()='Use this card for auto-pay']")
    List<WebElement>  assignAutopayLink;
    @FindBy(xpath = "//span[@class='autopay-alert mb-4 ng-star-inserted']")
    WebElement selectAnothercardMessage;
    @FindBy(xpath = "//*[contains(text(),'Sign out')]")
    WebElement channelLogOut;
    @FindBy(xpath = "//body//app-root//div[@class='row']//div[@class='row']//div[1]//span[2]//span[1]")
    WebElement dataUsage;
    @FindAll({@FindBy(xpath = "//*[contains(text(),\"Order summary\")]"),@FindBy(xpath = "//*[contains(text(),\"Order Summary\")]")})  //PPC - Order summary
    WebElement orderSummary;
    @FindBy(xpath = "//*[contains(text(),'Customer search')]")
    WebElement newCustomersearch;
    @FindBy(xpath = "//div/lib-auto-pay/div/div[2]/div/span[2]")
    WebElement autopayNextAnniversarydate;
    @FindAll({@FindBy(xpath = "//ds-modal-container"),@FindBy(id = "ds-modal-container-9")})
    WebElement unenrollpopup;
    @FindBy(xpath = "//ds-modal/div/p")
    WebElement unenrollValidation;
    @FindBy(xpath = "//span[text()='Unenroll']")
    WebElement unenrollButton;
    @FindBy(xpath = "//span[contains(text(),'enrolled')]")
    WebElement stayEnrolledButton;




    public CP_DashBoard(WebDriver driver) {
        super(driver);
    }

    public void validatePage(String phoneNumber) {
        getReusableActions().waitForElementVisibility(phoneNumberText, 20);
        scrollToMiddleOfElement(phoneNumberText);
        reporterSnapshot(dashboardText, "Customer dashboard", "", "Common");
        reporterSnapshot(phoneNumberText, phoneNumber.replace("-",""), phoneNumberText.getText().replace("-",""), "Compare");
    }
    public void waitForPageLoad(){
        getReusableActions().waitForElementVisibility(dashboardText,10);
        getReusableActions().staticWait(2000);
    }

    public void validatePage() {
        getReusableActions().waitForElementVisibility(autoPay, 20);
        reporterSnapshot(autoPay, "https://auto-cpp.chatrwireless.com/care/dashboard", "", "LINK");
        reporter.softAssert(getDriver().getCurrentUrl().equals("https://chatr-qa-auto.qa01.eks.rogers.com/care/dashboard"), "Care DashBoard Page Loaded", "Care DashBoard Not Loaded");
    }
    public void enableAutoPay(String phoneNumber){
        getReusableActions().javascriptScrollByVisibleElement(autoPay);
        String enrollText = enrollStatus.getText();
        reporterSnapshot(enrollStatus, "NOT ENROLLED", "", "common");
        reporterSnapshot(enrollButton, "IS ENABLED", "", "ENABLE");
        if(enrollButton.getText().equalsIgnoreCase("ENROLL")){
            enrollButton.click();
        }
    }
    public void enableAutoPay(){
        getReusableActions().javascriptScrollByVisibleElement(autoPay);
        String enrollText = enrollStatus.getText();
        reporterSnapshot(enrollStatus, "NOT ENROLLED", "", "common");
        reporterSnapshot(enrollButton, "IS ENABLED", "", "ENABLE");//2
        if(enrollButton.getText().equalsIgnoreCase("ENROLL")){
            enrollButton.click();
        }
    }
    public void unEnrollAutoPay(){
        getReusableActions().javascriptScrollByVisibleElement(autoPay);
        String enrollText = enrollStatus.getText();
        reporterSnapshot(enrollStatus, "ENROLLED", "", "common");
        reporterSnapshot(enrollButton, "IS ENABLED", "", "ENABLE");//2
        if(enrollButton.getText().equalsIgnoreCase("UNENROLL")){
            enrollButton.click();
        }
    }

    public void validateAutoPayEnrolledIsExpired() {
        getReusableActions().javascriptScrollByVisibleElement(autoPay);
        String enrollText = enrollStatus.getText();
        reporterSnapshot(enrollStatus, "ENROLLED", "", "common");
        //reporter.softAssert(enrollText.equals("NOT ENROLLED"), "Status message is as expected", "Status message is not as expected");
        //reporter.softAssert(enrollButton.getAttribute("disabled").equals("true"), "Enroll button is disabled", "Enroll button is enabled");
        //reporterSnapshot(enrollButton, "enroll Button", "", "notdisplay");
        String dateText = enrollDate.getText();
        String date = dateText.substring(dateText.indexOf("on") + 3);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        try {
            dateFormat.parse(date);
            //reporter.softAssert(dateFormat.parse(date),"VALID FIELD - \"" + enrollDate.getText() + "\" ARE DISPLAYED EXPECTED FORMAT SUCCESSFULLY","INVALID : FIELD - \"" + enrollDate.getText() + "\" ARE NOT DISPLAYED EXPECTED FORMAT SUCCESSFULLY");
            reporter.reportLogWithScreenshot("VALID FIELD - \"" + enrollDate.getText() + "\" ARE DISPLAYED EXPECTED FORMAT SUCCESSFULLY");
        } catch (Exception e) {
            reporter.reportLogWithScreenshot("INVALID : FIELD - \"" + enrollDate.getText() + "\" ARE NOT DISPLAYED EXPECTED FORMAT SUCCESSFULLY");
        }
    }

    public void validateAutoPayNeverEnrolled() {
        getReusableActions().javascriptScrollByVisibleElement(autoPay);
        String enrollText = enrollStatus.getText();
        reporterSnapshot(enrollStatus, "NOT ENROLLED", "", "common");
        //reporter.softAssert(enrollText.equals("NOT ENROLLED"), "Status message is as expected", "Status message is not as expected");
        reporterSnapshot(enrollButton2, "IS ENABLED", "", "ENABLE");
        //reporter.softAssert(enrollButton2.isEnabled(), "Enroll button is Enabled", "Enroll button is disabled");
        //reporterSnapshot(autoPayText, "Note: Changes to auto-pay may take up to 24 hrs.", "", "GEN");
        //reporter.softAssert(autoPayText.getText().equals("Note: Changes to auto-pay may take up to 24 hrs."), "AutoPay text is as Expected", "AutoPay text is not as Expected");
    }
    public void validateAutoPayStatus(){
        getReusableActions().javascriptScrollByVisibleElement(autoPay);
        String enrollText = enrollStatus.getText();
        if (enrollStatus.getText().equalsIgnoreCase("NOT ENROLLED")) {
            reporterSnapshot(enrollStatus, "NOT ENROLLED", "", "common");
        }else if (enrollStatus.getText().equalsIgnoreCase("ENROLLED")) {
            reporterSnapshot(enrollStatus, "ENROLLED", "", "common");
            reporterSnapshot(autopayNextAnniversarydate, autopayNextAnniversarydate.getText(), "", "common");
            System.out.println(autopayNextAnniversarydate.getText());
        }

    }



    public void validateBannerContainsMobilicityName() {
        getReusableActions().javascriptScrollByVisibleElement(mobilicityBanner);
        //reporter.softAssert(mobilicityBanner.getAttribute("src").contains("icon_Mobi.png"), "Mobilicity Banner is Visible", " Mobilicity Banner is not Visible");
        reporterSnapshot(mobilicityBanner, mobilicityBanner.getAttribute("src"), "icon_Mobi.png", "compare");
        //getReusableActions().staticWait(2000);
    }

    public void validateEmailFlagInDashBoard(String emailFlag) {
        if (emailFlag.equals("verified")) {
            getReusableActions().javascriptScrollByVisibleElement(emailFlagVerified);
            //reporter.softAssert(emailFlagVerified.getAttribute("name").equals("check-circle"), "VALID FIELD GREEN CHECK MARK VERIFIED", "INVALID FIELD GREEN CHECK MARK VERIFIED");
            reporterSnapshot(emailFlagVerified, "Email Flag Verified", "", "display");

        } else {
            //getReusableActions().javascriptScrollByVisibleElement(emailFlagNotVerified);
            //reporter.softAssert(emailFlagNotVerified.getAttribute("name").equals("minus-circle"), "VALID FIELD GREEN CHECK MARK NOT VERIFIED", "INVALID FIELD GREEN CHECK MARK NOT VERIFIED");
            reporterSnapshot(emailFlagVerified, "Email Flag Verified", "", "display");
        }
    }

    public void validateCustomerSearchLink() {
        String parentWindow = getDriver().getWindowHandle();
        getReusableActions().javascriptScrollByVisibleElement(customerSearchLink);
        getReusableActions().clickWhenReady(customerSearchLink, 10);
        getReusableActions().waitForPageLoad();
        getReusableActions().switchToNewWindow(parentWindow);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(getDriver().getCurrentUrl().contains(TestDataHandler.landingPageData.getCarePortalLandingPage()), "Customer Search window is opened", "Invalid window");
        reporterSnapshot(customerSearchLink, TestDataHandler.landingPageData.getCarePortalLandingPage(), "", "Link");
        getReusableActions().closeCurrentWindow();
        getReusableActions().switchToMainWindow(parentWindow);
    }

    public void validateDashBoardPage() {
        getReusableActions().staticWait(3000);
        getReusableActions().waitForElementVisibility(dashBoardButton, 20);
        getReusableActions().javascriptScrollByVisibleElement(dashBoardButton);
        getReusableActions().staticWait(2000);
        //reporterSnapshot(dashBoardButton, "https://chatr-qa-auto.qa01.eks.rogers.com/care/dashboard", "", "LINK");
        reporterSnapshot(dashBoardButton, dashBoardButton.getText(), "", "Common");
    }

    public void flagemailScoll() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(emailFlagVerified);
        getReusableActions().staticWait(3000);
    }

    public void validatePaymentDetails() {
        getReusableActions().javascriptScrollByVisibleElement(paymentButton);
        getReusableActions().clickWhenReady(paymentButton);
        //reporter.softAssert(getReusableActions().isElementVisible(savedCardDetails), "Card Details Present", "No Saved Cards");
        reporterSnapshot(paymentButton, "payment Button", "", "VISIBLE");
    }

    public void validatePlanDetails() {
        getReusableActions().javascriptScrollByVisibleElement(planDetails);
        //reporter.softAssert(getReusableActions().isElementVisible(planDetails), "Plan Details Present", "Plan Details Not Present");
        reporterSnapshot(planDetails, "plan Details", "", "VISIBLE");
    }

    public void validateAccountBalanceDetails() {
        getReusableActions().javascriptScrollByVisibleElement(accountBalanceText);
        /*reporter.softAssert(accountBalanceText.isDisplayed()
                        && accountHistoryLink.isDisplayed()
                        && accountBalanceValue.getText().matches("^\\$[0-9]+\\.[0-9][0-9]"),
                "Balance Details are valid", "Balance Details are invalid");*/
        reporterSnapshot(accountBalanceText, "account balance", "", "display");
        reporterSnapshot(accountHistoryLink, "account History", "", "display");
        reporterSnapshot(accountBalanceValue, "account balance", "^\\$[0-9]+\\.[0-9][0-9]", "MATCHES");

    }

    public void validateAccountStatusDetails(String Status) {
        /*reporter.softAssert(accountStatusText.isDisplayed()
                && accountDetailsLink.isDisplayed()
                && (accountStatusValue.getText().equals("Active") || accountStatusValue.getText().equals("Expired"
        )), "Account Status details are valid", "Account Status details are invalid");*/
        //getReusableActions().javascriptScrollByVisibleElement(accountStatusText);
        scrollToMiddleOfElement(accountStatusText);
        reporterSnapshot(accountStatusText, "account Status", "", "display");
        reporterSnapshot(accountDetailsLink, "account Details", "", "display");
        reporterSnapshot(accountStatusValue, Status, "", "Gen");

    }
    public void validateAccountStatusDetails() {
        /*reporter.softAssert(accountStatusText.isDisplayed()
                && accountDetailsLink.isDisplayed()
                && (accountStatusValue.getText().equals("Active") || accountStatusValue.getText().equals("Expired"
        )), "Account Status details are valid", "Account Status details are invalid");*/
        //getReusableActions().javascriptScrollByVisibleElement(accountStatusText);
        scrollToMiddleOfElement(accountStatusValue);
        String status= accountStatusValue.getText();
        System.out.println(status);
         Assert.assertEquals(status,"Active");

    }

    public void validateAnniversaryDetails() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(anniversaryDateText);
        /*reporter.softAssert(anniversaryDateText.isDisplayed()
                && anniversaryText.getText().equals("Make sure you have enough balance on your account prior to this date.")
                && anniversaryDateValue.getText().matches("(January|February|March|April|May|June|July|August|September" +
                "|October|November|December) [0-9]*[0-9]"), "Anniversary Details are valid", "Anniversary Details are Invalid");*/
        reporterSnapshot(anniversaryDateText, "anniversary Date", "", "display");
        reporterSnapshot(anniversaryText, "enough money", "", "common");
        //reporterSnapshot(anniversaryDateValue,"(January|February|March|April|May|June|July|August|September|October|November|December)( [0-9]+)","","MATCHES");
        getReusableActions().staticWait(3000);
    }

    public void clickOnPaymentButton() {
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScriptClick(paymentButton);
        getReusableActions().staticWait(3000);
        //getReusableActions().clickWhenReady(paymentButton);
    }

    public void validateCreditCardNotSave() {
        getReusableActions().javascriptScrollByVisibleElement(noCardSave);
        reporterSnapshot(noCardSave, "No Saved", "", "common");
        //reporter.softAssert(noCardSave.getText().equals("No Saved Cards yet"), noCardSave.getText(), "credit card save");
    }

    public void validateEmailPortInSection() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(emailElement);
        getReusableActions().staticWait(2000);
        String email = emailElement.getText();
        reporter.softAssert(!(email.substring(0, 1).equals("*")) &&
                !(email.substring(1, 1).equals("*")) &&
                !(email.substring(email.indexOf("@") + 1).contains("*")), "VALID FIELD - \"" + email.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + email.toUpperCase() + "\"", "INVALID : FIELD - \"" + email.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + email.toUpperCase() + "\"");
    }

    public void clickOnHistoryReports() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(historyReports);
        //scrollToMiddleOfElement(historyReports);
       // reporterSnapshot(historyReports,"History Report Link","","Display");
        getReusableActions().isElementVisible(historyReports);
        historyReports.click();

    }

    public void validateMarketingPreferencesForTextMessage() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(marketingPreferences);
        textMessagesSlider.isDisplayed();
        if (textMessagesSlider.getText().equals("Yes")) {
            reporterSnapshot(textMessagesSlider, "YES", "", "NULL");
            textMessagesSlider.click();
            getReusableActions().staticWait(1000);
        }
        System.out.println("textMessagesSlider" + textMessagesSlider.getText());
        reporterSnapshot(textMessagesSlider, "No", "", "Gen");
    }

    public void validateMarketingPreferencesForEmail() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(marketingPreferences);
        textEmailSlider.isDisplayed();
        if (textEmailSlider.getText().equals("Yes")) {
            textEmailSlider.click();
            getReusableActions().staticWait(1000);
        }
        System.out.println("textEmailSlider" + textEmailSlider.getText());
        //reporter.softAssert(textEmailSlider.getText().equals("No"), "email are not enabled", "email are enabled");
        reporterSnapshot(textEmailSlider, "No", "", "Gen");
    }

    public void validateMarketingPreferenceDashBoard() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(marketingPreferences);
        //reporterSnapshot(marketingPreferences,"marketing Preferences","","display");
        reporterSnapshot(marketingMessage, "marketing message", "", "VISIBLE");
        reporterSnapshot(textMessages, "text Messages", "", "VISIBLE");
        reporterSnapshot(emailsText, "emails Text", "", "VISIBLE");
        getReusableActions().javascriptScrollByVisibleElement(englishLanguageButton);
        reporterSnapshot(languagePreferMessage, "language Prefer Message", "", "VISIBLE");
        reporterSnapshot(englishLanguageButton, "english Language Button", "", "VISIBLE");
    }

    public void clickOnPortInRequest() {
        getReusableActions().staticWait(2000);
        scrollToMiddleOfElement(accountStatusText);
        reporterSnapshot(accountStatusValue, "Active", "", "Gen");
        //getReusableActions().javascriptScrollByVisibleElement(standalonePortInButton);
        getReusableActions().staticWait(2000);
        reporterSnapshot(standalonePortInButton, "Port-in Request ", "", "DISPLAY");
        standalonePortInButton.click();
    }

    public void planWindowDashboard() {
        getReusableActions().javascriptScrollByVisibleElement(locationOnDashboard);
        reporterSnapshot(locationOnDashboard, "location On Dashboard", "", "DISPLAY");
        // reporter.softAssert(locationOnDashboard.isDisplayed(),"Location is display","location is not display");
        reporterSnapshot(msfPlan, "msf Plan", "", "DISPLAY");
        //reporter.softAssert(msfPlan.isDisplayed(),"plan is display","plan is not display");
    }

    public void validateDashBoardPageRetailer() {
        getReusableActions().waitForElementVisibility(dashBoardButton, 20);
        getReusableActions().staticWait(2000);
        reporterSnapshot(dashBoardButton, TestDataHandler.landingPageData.getRetailerLandingPage(), "", "Link");
    }

    public void clickOnAdjustmentLink() {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(adjustmentLink.get(0));
        getReusableActions().clickWhenReady(adjustmentLink.get(0), 10);
        String adjustmentWinHeader = getReusableActions().getWhenReady(adjustmentModel).getText();
        System.out.println(adjustmentWinHeader);
        //reporter.reportLogWithScreenshot("Adjustment window successfully opened -> " + adjustmentWinHeader);
    }

    public void validateAdjustmentWindowModel_Credit_OR_Debit(int value, String amount, String tType) {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(adjustmentModel);
        reporterSnapshot(currentBalance, "DISPLAYED", "", "DISPLAY");
        //reporter.softAssert(currentBalance.isDisplayed(), "current balance display  " + currentBalance.getText(), "current balance not display");
        getReusableActions().clickWhenReady(balanceCode);
        getReusableActions().selectWhenReady(balanceCode, value);
        getReusableActions().clickWhenReady(balanceCode);
        reporterSnapshot(balanceCode, "VALUE", "", "VALUE1");
        //reporter.softAssert(balanceCode.getAttribute("value").length() >= 1, "option is selected " + balanceCode.getAttribute("value"), "option not selected");
        //reporter.softAssert(!adjustmentAmountField.isDisplayed(), "adjustmentAmount field is disable ", "adjustmentAmount field enabled");
        reporterSnapshot(adjustmentAmountField, "adjustment Amount", "", "NOTDISPLAY");
        getReusableActions().staticWait(2000);
        if (tType.equalsIgnoreCase("Debit")) {
            debitOption.click();
            adjustmentAmountField.click();
            adjustmentAmountField.sendKeys(amount + " ");
            getReusableActions().staticWait(2000);
            getReusableActions().javascriptScrollByVisibleElement(errorMessage_debit);
            getReusableActions().staticWait(1000);
            reporterSnapshot(errorMessage_debit, "is $50", "", "common");
            //reporter.softAssert(errorMessage_debit.getText().equals("Maximum charge limit is $50.00"), errorMessage_debit.getText(), "Error message not display");
            adjustmentAmountField.sendKeys(Keys.TAB);

        } else {
            adjustmentAmountField.click();
            adjustmentAmountField.sendKeys(amount + " ");
            getReusableActions().staticWait(2000);
            getReusableActions().javascriptScrollByVisibleElement(errorMessage_credit);
            getReusableActions().staticWait(1000);
            reporterSnapshot(errorMessage_credit, "is $50", "", "common");
            //reporter.softAssert(errorMessage_credit.getText().equals("Maximum balance limit is $300"), errorMessage_credit.getText(), "Error message not display");
            reporterSnapshot(windowCancelButton, "ENABLED", "", "ENABLE");
            //reporter.softAssert(windowCancelButton.isEnabled(), "Cancel Button is enabled", "Cancel button is disabled");
            reporterSnapshot(windowCancelButton, "Cancel Button", "", "ENABLE");
            adjustmentAmountField.sendKeys(Keys.TAB);
        }
        //reporter.softAssert(!windowSubmitButton.isEnabled(),"Submit Button is disabled","Submit button is enabled");
        //reporter.reportLogWithScreenshot("Submit button is disabled");
        windowCancelButton.click();
    }

    public void validateAdjustmentSubmit_Credit_OR_Debit(int value, String amount, String tType) {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(adjustmentModel);
        reporterSnapshot(currentBalance, "current Balance", "", "DISPLAY");
        //reporter.softAssert(currentBalance.isDisplayed(), "current balance display  " + currentBalance.getText(), "current balance not display");
        getReusableActions().clickWhenReady(balanceCode);
        getReusableActions().selectWhenReady(balanceCode, value);
        getReusableActions().clickWhenReady(balanceCode);
        String expectedValue = balanceCode.getAttribute("value");
        reporter.softAssert(balanceCode.getAttribute("value").length() >= 1, "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE");
        //reporter.softAssert(!adjustmentAmountField.isDisplayed(), "adjustmentAmount field is disable ", "adjustmentAmount field enabled");
        reporterSnapshot(adjustmentAmountField, "adjustment Amount", "", "Notdisplay");
        getReusableActions().staticWait(2000);
        if (tType.equalsIgnoreCase("Debit")) {
            debitOption.click();
            adjustmentAmountField.click();
            adjustmentAmountField.sendKeys(amount);
            getReusableActions().staticWait(2000);
            adjustmentAmountField.sendKeys(Keys.TAB);
        } else {
            adjustmentAmountField.click();
            adjustmentAmountField.sendKeys(amount);
            getReusableActions().staticWait(2000);
            reporterSnapshot(windowCancelButton, "window Cancel Button", "", "ENABLE");
            //reporter.softAssert(windowCancelButton.isEnabled(), "Cancel Button is enabled", "Cancel button is disabled");
            adjustmentAmountField.sendKeys(Keys.TAB);
        }
        reporterSnapshot(windowSubmitButton, "window Submit Button", "", "ENABLE");
        //reporter.softAssert(windowSubmitButton.isEnabled(), "Submit Button is enabled", "Submit button is disabled");
        getReusableActions().clickWhenReady(windowSubmitButton);
        getReusableActions().staticWait(1000);
        reporterSnapshot(confirmAdjustmentmodal, "confirm Adjustment modal", "", "DISPLAY");
        //reporter.softAssert(confirmAdjustmentmodal.isDisplayed(), "confirm Adjustment modal display  " + confirmAdjustmentmodal.getText(), "confirm Adjustment modal not display");
        reporterSnapshot(adjustedAmount, "adjusted Amount", "", "DISPLAY");
        //reporter.softAssert(adjustedAmount.isDisplayed(), "Adjusted Amount display  " + adjustedAmount.getText(), "Adjusted Amount not display");
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(windowConfirmButton);
        getReusableActions().staticWait(2000);
        reporterSnapshot(custNewBal, "New Balance", "", "DISPLAY");
        // reporter.softAssert(custNewBal.isDisplayed(), "Customer New Balance display  " + custNewBal.getText(), "Customer New Balance not display");
        getReusableActions().clickWhenReady(winDashboardButton);
        getReusableActions().staticWait(2000);
        reporterSnapshot(dashBoardButton, "dashBoard Button", "", "DISPLAY");
        //reporter.softAssert(dashboardText.isDisplayed(), "Dashboard window display  " + dashboardText.getText(), "Dashboard window not display");
        getReusableActions().staticWait(2000);
    }

    public void clickOnChargeableTransaction() {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(chargeableTransactionLink);
        scrollToMiddleOfElement(chargeableTransactionLink);
        reporterSnapshot(chargeableTransactionLink, " Balance Adjustment link", "", "display");
        chargeableTransactionLink.click();
        //getReusableActions().clickWhenReady(chargeableTransactionLink, 10);
        String chargeableTransactionHeader = getReusableActions().getWhenReady(chargeableTransactionModel).getText();
        System.out.println(chargeableTransactionHeader);
        
        //reporter.reportLogWithScreenshot("Chargeable Transaction Window successfully opened -> " + chargeableTransactionHeader);
    }

    public void validatechargeableTransaction(int value, String cAmount, int eReason) {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(chargeableTransactionModel);
        //reporter.softAssert(currentBalance.isDisplayed(), "current balance display  " + currentBalance.getText(), "current balance not display");
        reporterSnapshot(currentBalance, "current Balance", "", "display");
        getReusableActions().clickWhenReady(codeOptions);
        getReusableActions().selectWhenReady(codeOptions, value);
        getReusableActions().clickWhenReady(codeOptions);
        String expectedValue = codeOptions.getAttribute("value");
        reporter.softAssert(codeOptions.getAttribute("value").length() >= 1, "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE");
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(chargeOptions);
        if (cAmount.equalsIgnoreCase("$5.00")) {
            getReusableActions().clickWhenReady(chargeOptions);
            getReusableActions().selectWhenReady(chargeOptions, 1);
            getReusableActions().clickWhenReady(chargeOptions);
            //reporter.softAssert(!exceptionOptions.isEnabled(), "Exception dropdown field is disabled", "Exception dropdown field is enabled");
            //reporter.softAssert(windowSubmitButton.isEnabled(), "Submit button is enabled", "Submit button is disabled");
            reporterSnapshot(exceptionOptions, "exception Options", "", "NOTENABLE1");
            reporterSnapshot(windowSubmitButton, "Submit Button", "", "enable");

        } else {
            getReusableActions().selectWhenReady(chargeOptions, 0);
            getReusableActions().clickWhenReady(chargeOptions);
            //reporter.softAssert(exceptionOptions.isEnabled(), "Exception dropdown field is enabled", "Exception dropdown field is disabled");
            reporterSnapshot(exceptionOptions, "exception Options", "", "enable");
            exceptionOptions.click();
            getReusableActions().staticWait(1000);
            reporterSnapshot(exceptionOptions, "Exception Options", "", "display");
            getReusableActions().selectWhenReady(exceptionOptions, eReason);
            getReusableActions().clickWhenReady(exceptionOptions);
            expectedValue = exceptionOptions.getAttribute("value");
            reporter.softAssert(exceptionOptions.getAttribute("value").length() >= 1, "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE");
            //reporter.softAssert(windowSubmitButton.isEnabled(), "Submit button is enabled", "Submit button is disabled");
            reporterSnapshot(windowSubmitButton, "Submit Button", "", "enable");
        }
    }

    public void validateNoResultsFoundError() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(noResultsError);
        //reporter.softAssert(noResultsError.getText().equals("No results found"), noResultsError.getText(), "No Result Found Message Not Display");
        reporterSnapshot(noResultsError, "No results found", "", "common");
    }

    public String getTempCtnNumberStandAlonPortIn() {
        String temporaryCTN = getTempNumberStandAlonePortIn.getText().replace("-", "");
        return temporaryCTN;
    }

    public void clickOnProceed() {
        getReusableActions().isElementVisible(proceedCTA);
        getReusableActions().clickWhenReady(proceedCTA);
    }

    public void clickOnYesModalWindow() {
        getReusableActions().staticWait(3000);
        reporterSnapshot(yesCTA,"ACCEPT PORT-IN REQUEST WINDOW","","Display");
        getReusableActions().isElementVisible(yesCTA);
        yesCTA.click();
    }


    public void validateWirelessCTNPage(String phoneNumber, String wirelessCTN) {
        wirelessCTNField.click();
        wirelessCTNField.sendKeys(wirelessCTN);
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(successWirelessCTNMsg);
        reporterSnapshot(successWirelessCTNMsg, "WirelessCTN", "", "DISPLAY");
        // reporter.softAssert(successWirelessCTNMsg.isDisplayed(),"Entered CTN shows success message","Entered CTN shows success message");
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(currentChatrNoPanel);
        reporterSnapshot(currentChatrNoPanel, phoneNumber, "", "common");
        //reporter.softAssert(currentChatrNoPanel.getText().equalsIgnoreCase(phoneNumber),"Showing the Current Chatr no."+phoneNumber+"as temporary no.","Not showing the Current Chatr no."+phoneNumber+"as temporary no.");

    }

    public void validateAltPhoneNo(String altPhoneNumber) {
        getReusableActions().javascriptScrollByVisibleElement(altPhoneNoField);
        altPhoneNoField.click();
        altPhoneNoField.sendKeys(altPhoneNumber);
        getReusableActions().staticWait(3000);
        reporterSnapshot(null, "Alt Phone Number", String.valueOf(
                improperPhoneFormatError == null ? 0 : improperPhoneFormatError.size()), "hidden");
        altPhoneNoField.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        altPhoneNoField.sendKeys(Keys.DELETE);
        altPhoneNoField.sendKeys(altPhoneNumber.substring(0, 7));
        getReusableActions().staticWait(3000);
        reporterSnapshot(null, "Alt Phone Number", String.valueOf(
                improperPhoneFormatError != null ? 0 : improperPhoneFormatError.size()), "nothidden");
        //reporter.softAssert(improperPhoneFormatError.get(1).isDisplayed(), "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY");
    }

    public void enterVoucherPin(String voucherPin) {
        int cnt = getDriver().findElements(By.xpath("//input[contains(@type,'tel')]")).size();
        String locator = "(//input[contains(@type,'tel')])[%s]";
        locator = String.format(locator, cnt);
        System.out.println("locator - " + cnt + locator);
        String[] strArray = voucherPin.split(";");
        for (int i = 0; i <= strArray.length - 1; i++) {
            voucherPin = strArray[i];
            if (i == 0) {
                getDriver().findElement(By.xpath(locator)).clear();
                getDriver().findElement(By.xpath(locator)).click();
                getDriver().findElement(By.xpath(locator)).sendKeys(voucherPin);
                getReusableActions().staticWait(3000);
            }
            if (getDriver().findElements(By.xpath("//ds-error//span[@role='img']")).size() > 0) {
                getDriver().findElement(By.xpath(locator)).clear();
                getDriver().findElement(By.xpath(locator)).click();
                getDriver().findElement(By.xpath(locator)).sendKeys(voucherPin);
                getReusableActions().staticWait(3000);
            } else
                break;
        }
        reporterSnapshot(voucherInput, voucherPin, "", "NULL");
    }

    public void validateAddOneMoreLink() {
        //reporter.softAssert(addOneMoreLink.isEnabled(),"Add one more Voucher link is enabled","Add one more Voucher link is disabled");
        reporterSnapshot(addOneMoreLink, "add One More Link", "", "enable");
    }

    public void validateVoucherDeletion() {
        //reporter.softAssert(binIcon.isDisplayed(),"Delete Voucher Option is displayed","Delete Voucher Option is not displayed");
        //reporter.softAssert(binIcon.isEnabled(),"Delete Voucher Option is enabled","Delete Voucher Option is not enabled");
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScriptClick(addOneMoreLink);
        getReusableActions().staticWait(2000);
        reporterSnapshot(binIcon, "Delete Voucher", "", "display");
        reporterSnapshot(binIcon, "Delete Voucher", "", "enable");
        getReusableActions().clickWhenReady(binIcon, 2000);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(binIcon.isDisplayed(),"Voucher is successfully deleted","Voucher is not successfully deleted");
        //reporterSnapshot(binIcon, "Delete Voucher", "", "display");
        reporterSnapshot(null, "Delete Voucher", String.valueOf(
                binIconList == null ? 0 : binIconList.size()), "hidden");
    }

    public void validateCT_InsufficientBalance(int value, String cAmount) throws AWTException {
        getReusableActions().staticWait(2000);
        Robot robot = new Robot();
        for(int i = 0;i<4;i++){
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.delay(2000);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);
        }
        getReusableActions().isElementVisible(chargeableTransactionModel);
        getReusableActions().staticWait(7000);
        reporterSnapshot(currentBalance, "Current Balance", "", "DISPLAY");
        //reporter.softAssert(currentBalance.isDisplayed(), "current balance display  " + currentBalance.getText(), "current balance not display");
        getReusableActions().clickWhenReady(codeOptions);
        getReusableActions().selectWhenReady(codeOptions, value);
        getReusableActions().clickWhenReady(codeOptions);
        String expectedValue = codeOptions.getAttribute("value");
        reporter.softAssert(codeOptions.getAttribute("value").length() >= 1, "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE");
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(chargeOptions);
        if (cAmount.equalsIgnoreCase("$8.00")) {
            System.out.println("In loop");
            getReusableActions().selectWhenReady(chargeOptions, 1);
           // getReusableActions().selectWhenReadyByVisibleText(chargeOptions,"$8.00");
            getReusableActions().clickWhenReady(chargeOptions);
            //reporter.softAssert(!exceptionOptions.isEnabled(), "Exception dropdown field is disabled", "Exception dropdown field is enabled");
            //reporter.softAssert(!windowSubmitButton.isEnabled(), "Submit button is disabled", "Submit button is enabled");
           /* reporterSnapshot(exceptionOptions, "exception Options", "", "notenable");
            reporterSnapshot(windowSubmitButton, "Submit Button", "", "notenable");*/
            reporterSnapshot(error_InsufficientBal, "Insufficient Balance Alert", "", "DISPLAY");
            //reporter.softAssert(error_InsufficientBal.isDisplayed(), "Insufficient Balance error is displayed", "Insufficient Balance error is not displayed");
        }
//        System.out.println("Not loop");
//        reporterSnapshot(error_InsufficientBal, "DISPLAYED", "", "DISPLAY");
    }
    public void clickOnPPCLinkOnDashBoard() {
        String parentWindow = getDriver().getWindowHandle();
        getReusableActions().staticWait(7000);
        //reporter.softAssert(getReusableActions().isElementVisible(ppcLink),ppcLink.getText()+" Link is visible","ppc link is not present");
        ppcLink.click();
        getReusableActions().switchToNewWindow(parentWindow);
        getReusableActions().staticWait(2000);
    }
    public void clickOnTopUpLink() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(topUpLink);
        //reporter.softAssert(getReusableActions().isElementVisible(topUpLink),"topUp Link is visible","topUp Link not visible");
        reporterSnapshot(topUpLink, "topUp Link", "", "visible");
        getReusableActions().staticWait(2000);
        topUpLink.click();
    }
    public void clickOnSelectAddOn() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(selectAddOn);
        //reporter.softAssert(selectAddOn.isEnabled(),"addon link is enabled","addon link is not enabled");
        reporterSnapshot(selectAddOn, "select AddOn", "", "enable");
        selectAddOn.click();
    }
    public void selectAddOnCheckBox() {
        getReusableActions().javascriptScrollByVisibleElement(addOnCheckbox);
        getReusableActions().staticWait(1000);
        getReusableActions().isElementVisible(addOnCheckbox);
        //reporter.softAssert(addOnCheckbox.isDisplayed(),"addon checkbox display","addon checkbox not display");
        addOnCheckbox.click();
        reporterSnapshot(addOnCheckbox, "addOn Checkbox", "", "display");
        getReusableActions().staticWait(7000);
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        getReusableActions().staticWait(500);
        reporterSnapshot(orderSummary, "Shoping cart", "", "display");
    }
    public void clickOnContinueButton() {
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().staticWait(6000);
        //reporter.softAssert(continueButton.isEnabled(),"continue button is enabled","continue button not display");
        reporterSnapshot(continueButton, "continue", "", "enable");
        continueButton.click();
    }
    public void clickOnManageLink() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(manageLink);
        //reporter.softAssert(getReusableActions().isElementVisible(manageLink),"topUp Link is visible","topUp Link not visible");
        reporterSnapshot(manageLink, "manage Link", "", "visible");
        getReusableActions().staticWait(2000);
        manageLink.click();
    }

    public void validateExtraMoneyAddInCC() {
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(orderConfirmBanner);
        getReusableActions().isElementVisible(orderConfirmBanner);
        getReusableActions().staticWait(1000);
        reporterSnapshot(orderConfirmBanner, "order Confirm Banner", "", "display");
        scrollToMiddleOfElement(newAddOns);
        reporterSnapshot(newAddOns, "new AddOn", "", "display");
        getReusableActions().staticWait(3000);
        reporterSnapshot(addOnAmount, "addOn Amount", "", "display");
    }

    public void switchToLatestTab() {
        int setSize = getDriver().getWindowHandles().size();
        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(setSize - 1));
        getReusableActions().staticWait(2000);
    }

    public void clickOnNotYOurLocation() {
        getReusableActions().staticWait(2000);
        notYourLocation.click();
        getReusableActions().staticWait(2000);
    }

    public void validatePPCChangeLocation() {
        getReusableActions().staticWait(5000);
        getReusableActions().selectWhenReady(citySelectDropdown, 2, 20);
        citySelectDropdown.sendKeys(Keys.TAB);
        getReusableActions().staticWait(2000);
        reporterSnapshot(citySelectDropdown,"Beeton" , "", "NULL");
        getReusableActions().clickWhenReady(citySelectContinuebtn, 10);
        getReusableActions().staticWait(5000);
        //getReporter().softAssert(!displayedLocation.getText().contains("Toronto"),"location has been changed to "+displayedLocation.getText(),"location has not changed successfully");
        reporterSnapshot(displayedLocation, "City", "", "display");
    }

    public void validateModalWindow() {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(modalWindow);
        //reporter.softAssert(modalWindow.getText().equals("Confirm port-in request"),"modal window Highlighted","modal window not Highlighted");
        //reporter.softAssert(modalWindowYes.isEnabled(),"Yes Button Enabled","Yes Button Not Enabled");
        //reporter.softAssert(modalWindowNo.isEnabled(),"No Button Enabled","No Button Not Enabled");
        reporterSnapshot(modalWindow, "port-in request", "", "Common");
        reporterSnapshot(modalWindowYes, "modalWindow Yes", "", "enable");
        reporterSnapshot(modalWindowNo, "modalWindow No", "", "enable");
    }

    public void validateAutopayBlock() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(autoPayBlock);
        //reporter.softAssert(autoPayBlock.isDisplayed(), autoPayBlock.getText(),"AutoPay Block is not displayed");
        //reporter.softAssert(enRollLink.isEnabled(), "Enroll Link is enable", "Enroll link is disabled");
        reporterSnapshot(autoPayBlock, "autoPay Block", "", "display");
        reporterSnapshot(enRollLink, "enRoll Link", "", "NOTENABLE");
    }

    public void clickOnProrationOverride() {
        getReusableActions().staticWait(2000);
        reporterSnapshot(prorationOverride, "proration Override", "", "Enable");
        prorationOverride.click();
        getReusableActions().staticWait(2000);
        prorationAmount.sendKeys("73");
        getReusableActions().staticWait(2000);
        reporterSnapshot(prorationOverridemsg, "override amount can", "", "common");

    }

    public void clickOncarePPC() {
        getReusableActions().staticWait(2000);
        scrollToMiddleOfElement(accountStatusText);
        reporterSnapshot(accountStatusValue, "Active", "", "Gen");
        getReusableActions().javascriptScrollByVisibleElement(carePPC);
        //reporter.softAssert(carePPC.isEnabled(), "PPC Link is Enabled", "PPC Link is Disabled");
        getReusableActions().staticWait(2000);
        String parentWindow = getDriver().getWindowHandle();
        getReusableActions().staticWait(2000);
        carePPC.click();
        getReusableActions().staticWait(2000);
        getReusableActions().switchToNewWindow(parentWindow);
    }

    public void validateActiveInflightOrderError() {
        getReusableActions().staticWait(4000);
        System.out.println("In flight Order Error Size == " + inflightOrderError.size());
        //reporter.softAssert(inflightOrderError.size() > 0, "VALID FIELD - \"" + inflightOrderError.get(1).getText().toUpperCase() + "\" IS DISPLAYED", "INVALID : FIELD - \" INFLIGHT ORDER ERROR IS NOT DISPLAYED");
        reporterSnapshot(null, "Inflight Order", String.valueOf(
                inflightOrderError != null ? 0 : inflightOrderError.size()), "nothidden");
    }

    public void validateExpiredAccountError() {
        getReusableActions().staticWait(4000);
        reporterSnapshot(expiredAccountError.get(0), "Your account is expired", "", "common");
    }

    public void validatePPCChangeLocationRetail() {
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollByVisibleElement(displayedLocation);
        reporterSnapshot(displayedLocation, "Toronto", "", "common");
    }

    public void validateExpiredStatus() {
        getReusableActions().staticWait(4000);
        reporter.softAssert(expiredAccountError.size() > 0, "VALID FIELD - \"" + expiredAccountError.get(0).getText().toUpperCase() + "\" S DISPLAYED", "INVALID : FIELD - \" EXPIRED ACCOUNT ERROR IS NOT DISPLAYED");
    }

    public void validateAdjustmentLinkNotPresent() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(dashBoardButton);
        getReusableActions().staticWait(500);
        reporterSnapshot(null, "Adjustment Link", String.valueOf(
                adjustmentLink == null ? 0 : adjustmentLink.size()), "hidden");
    }

    public void validateDashboardActiveStatus() {
        getReusableActions().staticWait(4000);
        scrollToMiddleOfElement(activeStatus);
        getReusableActions().staticWait(1000);
        reporterSnapshot(activeStatus, "Active", activeStatus.getText(), "COMMON");
    }

    public void validateDashboardExpiredStatus() {
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(expiredStatus);
        getReusableActions().staticWait(1000);
        reporterSnapshot(expiredStatus, "Inactive", expiredStatus.getText(), "COMMON");
    }

    public void validatePLanUsage() {
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(lookingGood.get(0));
        String expectedValue = lookingGood.get(0).getText();
        getReporter().softAssert(lookingGood.size() > 0, "VALID FIELD - \"" + expectedValue.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY");
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(planAvailable.get(0));
        String expectedValue1 = planAvailable.get(0).getText();
        getReporter().softAssert(planAvailable.size() > 0, "VALID FIELD - \"" + expectedValue1.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue1.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY");
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(circularProgress.get(0));
        String expectedValue2 = circularProgress.get(0).getText();
        getReporter().softAssert(circularProgress.size() == 3, "VALID FIELD - \"" + expectedValue2.toUpperCase() + "\" ARE DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"" + expectedValue2.toUpperCase() + "\" ARE NOT DISPLAYED SUCCESSFULLY");
    }

    public void clickOnDeleteSavedCC() {
        getReusableActions().staticWait(2000);
        scrollToMiddleOfElement(SavedCCDeleteIcons.get(0));
        reporterSnapshot(SavedCCDeleteIcons.get(0), "Delete Icon", "", "DISPLAY");
        getReusableActions().clickWhenReady(SavedCCDeleteIcons.get(0));
    }

    public void validateSavedCCDeletion() {
        getReusableActions().staticWait(2000);
        int noOfSavedCardsBefore = SavedCCDeleteIcons.size();
        System.out.println(noOfSavedCardsBefore);
        clickOnDeleteSavedCC();
        clickOnConfirmCCDeletion();
        getReusableActions().staticWait(2000);
        int noOfSavedCardsAfter = SavedCCDeleteIcons.size();
        System.out.println(noOfSavedCardsAfter);
        getReusableActions().javascriptScrollByVisibleElement(paymentButton);
        reporter.softAssert(noOfSavedCardsAfter < noOfSavedCardsBefore, "VALID FIELD - \"  Saved CC Deletion  \" ARE DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"  Saved CC Deletion  \" ARE NOT DISPLAYED SUCCESSFULLY");
    }

    public void clickOnConfirmCCDeletion() {
        getReusableActions().staticWait(2000);
        scrollToMiddleOfElement(ConfirmSavedCCDeleteBtn);
        reporterSnapshot(ConfirmSavedCCDeleteBtn, "Confirm Button", "", "DISPLAY");
        getReusableActions().clickWhenReady(ConfirmSavedCCDeleteBtn);
    }

    public void clickOnUpdateSavedCC() {
        getReusableActions().staticWait(2000);
        scrollToMiddleOfElement(UpdateSavedCCIcons.get(0));
        getReusableActions().staticWait(1000);
        getReusableActions().clickWhenReady(UpdateSavedCCIcons.get(0));
    }
    public void validateSavedCCUpdation() throws AWTException {
        Robot robot = new Robot();
        getReusableActions().staticWait(2000);
        clickOnUpdateSavedCC();
        scrollToMiddleOfElement(SavedCCUpdationExpiryField);
        getReusableActions().staticWait(3000);
        getReusableActions().clickWhenReady(SavedCCUpdationExpiryField);
        reporterSnapshot(SavedCCUpdationExpiryField, "OLD Credit Card Value ", "", "DISPLAY");
        getReusableActions().staticWait(2000);
        for (int i=0;i<5;i++){
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        }//SavedCCUpdationExpiryField.clear();
        getReusableActions().staticWait(2000);
        SavedCCUpdationExpiryField.sendKeys("11/40");
        reporterSnapshot(SavedCCUpdationExpiryField, "New Credit Card Value ", "", "DISPLAY");
        scrollToMiddleOfElement(checkboxCreditCard);
        getReusableActions().staticWait(2000);
        checkboxCreditCard.click();
        reporterSnapshot(savedCCUpdateAndSave, " Save ", savedCCUpdateAndSave.getText(), "ENABLE");
    }

    public void clickOnAddCardSavedCC() {
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(SavedCCAddCardBtn);
    }

    public void setCreditCardDetails_PaymentTabRetail(String topUp, String creditCard, String cvv, String expiryDate) {
        //Click on radio button CC
        getReusableActions().staticWait(2000);
        radioButtonCC.click();
        //set TopUp
        topUpAmtFieldMAO.click();
        topUpAmtFieldMAO.sendKeys(topUp);
        //app vesta iframe
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame, 30);
        //set Credit Card Details
        getReusableActions().clickWhenReady(creditCardNumberInput, 20);
        creditCardNumberInput.sendKeys(creditCard);
        getReusableActions().clickWhenReady(cvvInput, 10);
        cvvInput.sendKeys(cvv);
        getReusableActions().clickWhenReady(expiryDateInput, 10);
        expiryDateInput.sendKeys(expiryDate);
        //reporter.reportLogWithScreenshot("Credit card details are populated");
        reporterSnapshot(creditCardNumberInput, "Credit Card Details", "", "NULL");
        getDriver().switchTo().defaultContent();
    }

    public void validateSavedCCAddition() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(card8881);
        reporterSnapshot(card8881, "CC Added", "", "Display");
    }


    public void validateQuicklinkHiddenForKioskAgent() {
        getReusableActions().staticWait(2000);
        reporterSnapshot(null, "Topup", String.valueOf(
                topUpLinkList == null ? 0 : topUpLinkList.size()), "HIDDEN");
        reporterSnapshot(null, "ppc", String.valueOf(
                ppcLinkList == null ? 0 : ppcLinkList.size()), "HIDDEN");
    }

    public void validateToggleandLanguageDisableForKioskAgent() {
        getReusableActions().javascriptScrollToMiddleOfPage();
        getReusableActions().staticWait(2000);

        if (textMessages.isDisplayed()) {
            reporterSnapshot(textMessages, "Text message Toggle ", "", "ENABLENOT");
        }
        if (emailsText.isDisplayed()) {
            reporterSnapshot(emailsText, "E mail Toggle ", "", "ENABLENOT");
        }
        if (englishLanguageButton.isDisplayed()) {
            reporterSnapshot(englishLanguageButton, "english Language Button ", "", "NOTSELECT");
        }
        getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().staticWait(2000);
        reporterSnapshot(null, "editAccountInfo", String.valueOf(
                editAccountInfoList == null ? 0 : editAccountInfoList.size()), "HIDDEN");

    }

    public void validateDeleteCtaHidden() {
        getReusableActions().staticWait(2000);
        reporterSnapshot(null, "editAccountInfo", String.valueOf(
                SavedCCDeleteIcons == null ? 0 : SavedCCDeleteIcons.size()), "HIDDEN");
    }

    public void validateExportDownloadCTACtaHidden() {
        getReusableActions().staticWait(2000);
        reporterSnapshot(null, "editAccountInfo", String.valueOf(
                SavedCCDeleteIcons == null ? 0 : SavedCCDeleteIcons.size()), "HIDDEN");

    }

    public int getAccountBalance() {
        getReusableActions().staticWait(3000);
        System.out.println(accountBalanceVal.getText() + "-" + accountBalanceVal.getText().replace("$", "") + "-" + accountBalanceVal.getText().replace("$", "").trim());
        String accountBalValString = accountBalanceVal.getText().replace("$", "").trim();//.split(".")[0];//.split("(^[0-9])")[0];
        String accountBalVal = accountBalValString.substring(0, accountBalValString.length() - 3);
        System.out.println(accountBalVal);
        int accountBalValInt = (int) Float.parseFloat(accountBalValString);
        return accountBalValInt;
    }

    public void validatePromotionEndDate() {
       /* getReusableActions().staticWait(3000);
        if (getDriver().findElements(By.xpath("//span[contains(text(),'Details')]")).size() > 0) {
            getDriver().findElement(By.xpath("//span[contains(text(),'Details')]")).click();
        }*/
        //getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().javascriptScrollByVisibleElement(promotionEndDate);
        reporterSnapshot(promotionEndDate, "Promotion End Date ", promotionEndDate.getText(), "DISPLAY");
        reporterSnapshot(promotionEndDate, "AFTER", promotionEndDate.getText(), "COMMON");

    }

    public void setCreditCardDetails_Retail(String creditCard, String cvv, String expiryDate) {
        //Click on radio button CC
        getReusableActions().staticWait(2000);
        //app vesta iframe
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame, 30);
        //set Credit Card Details
        getReusableActions().clickWhenReady(creditCardNumberInput, 20);
        creditCardNumberInput.sendKeys(creditCard);
        getReusableActions().clickWhenReady(cvvInput, 10);
        cvvInput.sendKeys(cvv);
        getReusableActions().clickWhenReady(expiryDateInput, 10);
        expiryDateInput.sendKeys(expiryDate);
        //reporter.reportLogWithScreenshot("Credit card details are populated");
        reporterSnapshot(creditCardNumberInput, "Credit Card Details", "", "NULL");
        getDriver().switchTo().defaultContent();
    }

    public void clickonSavebuttonManageCard() {
        getReusableActions().javascriptScrollByVisibleElement(saveButtonCC);
        saveCCcheckbox.click();
        getReusableActions().staticWait(1000);
        saveButtonCC.click();
        getReusableActions().staticWait(3000);
        if (goToAccount.isDisplayed()) {
            goToAccount.click();
        }
    }

    public void SavedCCDeletion() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(deleteBtnCC);
        deleteBtnCC.click();
        getReusableActions().staticWait(2000);
        deleteCardBtnCC.click();

    }

    public void validateDateOfBirthSectionMasked() {
        getReusableActions().staticWait(3000);
        //getReusableActions().javascriptScrollByVisibleElement(dateOfBirthElement);
        scrollToMiddleOfElement(dateOfBirthElement);
        getReusableActions().staticWait(2000);
        String date = dateOfBirthElement.getText();
        System.out.println(date);
        reporter.softAssert(dateOfBirthElement.getText().contains("*"), "VALID FIELD - \"" + date.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + date.toUpperCase() + "\"", "INVALID : FIELD - \"" + date.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + date.toUpperCase() + "\"");
    }

    public void validatePostalSectionMasked() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(postalCodeElement);
        getReusableActions().staticWait(2000);
        String postal = postalCodeElement.getText();
        System.out.println(postal);
        reporter.softAssert(postalCodeElement.getText().contains("*"), "VALID FIELD - \"" + postal.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + postal.toUpperCase() + "\"", "INVALID : FIELD - \"" + postal.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + postal.toUpperCase() + "\"");
    }

    public void validateDateOfBirthSectionUnMasked() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(dateOfBirthElement);
        getReusableActions().staticWait(2000);
        String date = dateOfBirthElement.getText();
        System.out.println(date);
        reporter.softAssert(!(dateOfBirthElement.getText()).contains("*"), "VALID FIELD - \"" + date.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + date.toUpperCase() + "\"", "INVALID : FIELD - \"" + date.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + date.toUpperCase() + "\"");
    }

    public void validatePostalSectionUnMasked() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(postalCodeElement);
        getReusableActions().staticWait(2000);
        String postal = postalCodeElement.getText();
        System.out.println(postal);
        reporter.softAssert(!(postalCodeElement.getText()).contains("*"), "VALID FIELD - \"" + postal.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + postal.toUpperCase() + "\"", "INVALID : FIELD - \"" + postal.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + postal.toUpperCase() + "\"");
    }

    public void validateEmailSectionUnMasked() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(emailElement);
        getReusableActions().staticWait(2000);
        String email = emailElement.getText();
        System.out.println(email);
        reporter.softAssert(!(emailElement.getText()).contains("*"), "VALID FIELD - \"" + email.toUpperCase() + "\" EXPECTED VALUE MATCH WITH ACTUAL VALUE \"" + email.toUpperCase() + "\"", "INVALID : FIELD - \"" + email.toUpperCase() + "\" EXPECTED VALUE IS NOT MATCHED WITH ACTUAL VALUE \"" + email.toUpperCase() + "\"");
    }

    public void champLoginAgain() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(channelLogOut);
        getReusableActions().staticWait(500);
        channelLogOut.click();
        getReusableActions().staticWait(1000);
        getReusableActions().closeCurrentWindow();
        getReusableActions().switchToMainWindow();
        getReusableActions().staticWait(2000);
        champWelcome.click();
        champLogOut.click();
        champLogInAgain.click();
        getReusableActions().staticWait(2000);
    }

    public String getAccountBalanceAmount() {
        String currentAccountBalance;
        currentAccountBalance = accountBalanceValue.getText();
        System.out.println("=== Value is == > " + currentAccountBalance);
        currentAccountBalance = currentAccountBalance.replace("$", "");
        System.out.println("==== Result >>>> " + (int) Float.parseFloat(currentAccountBalance));
        reporterSnapshot(accountBalanceValue, "account balance", "^\\$[0-9]+\\.[0-9][0-9]", "MATCHES");
        return currentAccountBalance;
    }


    public void validateRemainingAmountAddedToAccountBalance(String previousAccBalance, String currentAccountBalance, String planValue,String voucher){
    reporter.reportLogWithScreenshot("acc balance");
     int remainingValue = Integer.parseInt(voucher) - Integer.parseInt(planValue);
     System.out.println("Remaining Value Before Adding Of Previous Acc  Value == "+remainingValue);
//     remainingValue = remainingValue + Integer.parseInt(previousAccBalance);
     remainingValue = remainingValue + (int)Float.parseFloat(previousAccBalance);
     System.out.println("Remaining Value After Adding Of Previous Acc Value == "+remainingValue);
     String totalValueAsString = String.valueOf((remainingValue));
     String totalValue = ("$"+totalValueAsString+".00");
     System.out.println("Total Value == "+totalValue);
     System.out.println("Current Account Balance Value  == "+accountBalanceValue.getText());
     reporterSnapshot(accountBalanceValue,totalValue,"","GEN");
    }

    public void validateSavedCCSection() {
        reporterSnapshot(savedCardText, "Saved cards", "", "GEN");
        reporterSnapshot(securelyStoreText, "Securely store up to 5 cards.", "", "GEN");
       /* savedCCDetails.isDisplayed();*/
    }

    public void validateManagePinUavailableForCare() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollToMiddleOfPage();
        getReusableActions().staticWait(1000);
        reporterSnapshot(null, "Manage Account Pin", String.valueOf(
                managePINList == null ? 0 : managePINList.size()), "HIDDEN");
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollToBottomOfPage();
        getReusableActions().staticWait(1000);
        reporterSnapshot(null, "Manage Account Pin", String.valueOf(
                managePINList == null ? 0 : managePINList.size()), "HIDDEN");

    }
        public void validateCurrentProviderDetails () {
            getReusableActions().scrollToElement(currentCarrier);
            getReusableActions().staticWait(2000);
            reporterSnapshot(currentCarrier, "CURRENT CARRIER", "", "COMMON");
        }

        public void validateErrorMessageForInvalidInput () {
            scrollToMiddleOfElement(accountNumber);
            getReusableActions().staticWait(2000);
            phoneSerialNumber.sendKeys("1");
            phoneSerialNumber.sendKeys(Keys.TAB);
            getReusableActions().staticWait(2000);
            getReusableActions().executeJavaScriptClick(accountNumber);
            accountNumber.sendKeys("1");
            accountNumber.sendKeys(Keys.TAB);
            getReusableActions().staticWait(2000);
            getReusableActions().executeJavaScriptClick(accountPin);
            accountPin.sendKeys("1");
            accountPin.sendKeys(Keys.TAB);
            getReusableActions().staticWait(2000);
            reporterSnapshot(imeiErrorMessage, "serial number", "", "common");
            reporterSnapshot(accountNoErrorMessage, "unable to recognize your account", "", "common");
            reporterSnapshot(pinNoErrorMessage, "unable to recognize your PIN", "", "common");

        }

        public void validateAutoPayDateFormat () {
            getReusableActions().scrollToElement(enrolledOn);
            reporterSnapshot(enrolledOn, "Enrolled on", "", "COMMON");
            String dateText = enrolledOn.getText();
            String date = dateText.substring(dateText.indexOf("on") + 3);
            SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
            try {
                dateFormat.parse(date);
                reporter.reportLogWithScreenshot("VALID FIELD - \"" + enrolledOn.getText() + "\" ARE DISPLAYED EXPECTED FORMAT SUCCESSFULLY");
            } catch (Exception e) {
                reporter.reportLogWithScreenshot("INVALID : FIELD - \"" + enrolledOn.getText() + "\" ARE NOT DISPLAYED EXPECTED FORMAT SUCCESSFULLY");
            }

        }
        public void setNACDataStatus (String phoneNumber, String status){
            setUsedNACStatus1(phoneNumber, status);

        }
    public void setNewNACDataStatus(String phoneNumber, String status){
        setUsedNACStatus2(phoneNumber,status);

    }
    public void validateProrationOverrideOnReviePage() {
        getReusableActions().staticWait(2000);
        reporterSnapshot(prorationOverride, "proration Override", "", "Enable");
        prorationOverride.click();
        getReusableActions().staticWait(2000);
        String amount=prorationOverirdeAmount.getText();
        System.out.println("Proration Amount -- "+amount);
        getReusableActions().staticWait(2000);
        prorationAmount.sendKeys(amount);
        getReusableActions().staticWait(2000);
        confirmProrationOverride.click();
        getReusableActions().staticWait(4000);
        scrollToMiddleOfElement(ProrationOverride);
        getReusableActions().staticWait(2000);
        reporterSnapshot(ProrationOverride,ProrationOverride.getText(),"","Display");
    }
    public void validateAccountBalanceSame(String previousAccBalance){
        getReusableActions().staticWait(2000);
        scrollToMiddleOfElement(accountBalanceValue);
        getReusableActions().staticWait(2000);
        System.out.println("Previous Account Balance -- "+previousAccBalance);
        System.out.println("Current Account Balance -- "+accountBalanceValue.getText());
        reporterSnapshot(accountBalanceValue,previousAccBalance,"","common");
    }
    public void validatePortInRequstSuccessWindow() {
        getReusableActions().staticWait(5000);
        getReusableActions().waitForElementVisibility(PortInReqSucessWindow, 20);
        reporterSnapshot(PortInReqSucessWindow, "Port-in request successful", "", "Common");
        getReusableActions().staticWait(2000);
        backToDashBoard.click();
        getReusableActions().staticWait(2000);
    }
    public void validateDashBoardComponent() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollToTopOfPage();
        getReusableActions().staticWait(1000);
        reporterSnapshot(cussearchLink,"Back to customer search","","COMMON");
        reporterSnapshot(dashboardText,"Customer dashboard","","COMMON");
        getReusableActions().javascriptScrollByVisibleElement(dashboardText);
        getReusableActions().staticWait(1000);
        reporterSnapshot(dashBoardButton,"DashBoard Tab","","DISPLAY");
        reporterSnapshot(ppcLink,"QUICK LINKS","","DISPLAY");
    }
    public void validateAutopayBlockinRetail() {
        scrollToMiddleOfElement(autoPayBlock);
        getReusableActions().staticWait(1000);
        reporterSnapshot(autoPayBlock, "autoPay Block", "", "display");
    }
    public void closeandOpenRetailCustomerSearchPage() {
        getReusableActions().staticWait(4000);
        getReusableActions().closeCurrentWindow();
        getReusableActions().switchToMainWindow();
        getReusableActions().staticWait(2000);
        envButton.click();
        getReusableActions().switchToNewWindow();
        getReusableActions().staticWait(3000);
    }
    public void validateCCSectionInRetailerCorporate() {
        getReusableActions().staticWait(4000);
        getReusableActions().executeJavaScript("document.body.style.zoom='70%'");
        getReusableActions().staticWait(4000);
        reporterSnapshot(deleteBtnCC,"Credit Card Delete Option","","Display");
        getReusableActions().staticWait(1000);
        reporterSnapshot(selectAnothercardMessage,"To delete this card, select another to use for auto-pay","","Display");
        getReusableActions().staticWait(1000);
        reporterSnapshot(null, "Assign to Auto Pay Option", String.valueOf(
                assignAutopayLink == null ? 0 : assignAutopayLink.size()), "HIDDEN");
    }
    public void validatePLanUsageCircle() {
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(lookingGood.get(0));//dataUsage
        reporterSnapshot(dataUsage,"N/A","","COMMON");
    }
    public void openNewCustomerSearch() {
        getReusableActions().staticWait(2000);
        scrollToMiddleOfElement(newCustomersearch);
        newCustomersearch.click();
        getReusableActions().staticWait(2000);
        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(tabs2.size()-1));
        getReusableActions().staticWait(4000);
    }
}


