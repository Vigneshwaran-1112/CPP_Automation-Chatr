package com.rogers.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.List;
import java.util.*;

import static com.rogers.test.base.BaseTest.getDB;

public class AccountManagementPage extends BasePage {
    @FindBy(xpath = "//h1[contains(text(),'Hello')]")
    WebElement welcomeBanner;
    @FindBy(xpath = "//a[@class='history-cta']")
    WebElement accountHistoryCTA;
    @FindBy(xpath = "//h2[contains(text(),'History reports')]")
    WebElement historyReportsBanner;
    @FindBy(xpath = "//*[contains(text(),'Change SIM')]")
    WebElement simSwapButton;
    @FindBy(xpath = "//input[@id='ds-form-input-id-0']")
    WebElement CurrentSimNumber;
    @FindBy(xpath = "//div/lib-sim-swap/div/div/span[2]")//span[@class='bold ng-star-inserted']
    WebElement getCurrentCtn;
    @FindBy(xpath = "//div/form/div/button/span/span")
    WebElement saveButton;
    @FindBy(xpath = "(//input[@type='tel'])[2]")
    WebElement newSimNumberSection;
    @FindBy(xpath = "//*[contains(text(),'changed successfully')]")
    WebElement popUp;
    @FindBy(xpath = "//*[contains(text(),'exactly as')]")
    WebElement simNumberMessage;
    @FindBy(xpath = "(//*[@role='img'])[2]")
    WebElement greenCheckMark;
    @FindBy(xpath = "//*[@id=\"ds-tabs-0-tab-2\"]")
    WebElement profileCTA;
    @FindBy(xpath = "//button[contains(@title,'Manage')]")
    WebElement manageSavedCardCTA;
    @FindBy(xpath = "//span[@title='Delete card']")
    WebElement deleteCardCTA;
    @FindBy(xpath = "//span[contains(text(),'8881')]")
    WebElement card8881;
    @FindBy(xpath = "(//span[@title='Delete'])[1]")
    WebElement deleteCard8881CTA;
    @FindBy(xpath = "//p[contains(text(),'want to delete')]")
    WebElement deleteCardText;
    @FindBy(xpath = "//button[contains(@title,'Delete')]")
    WebElement yesDeleteCTA;
    @FindBy(xpath = "//button[contains(@title,'Don')]")
    WebElement noCancelCTA;
    @FindBy(xpath = "//p[contains(text(),'5 cards')]")
    WebElement storeUpCCLimit;
    @FindBy(xpath = "//*[contains(text(),'Add a card')]")
    WebElement addCardCTA;
    @FindBy(xpath = "//input[@id='credit-card-input']")
    WebElement creditCardInput;
    @FindBy(xpath = "//input[@id='month-year-input']")
    WebElement monthInput;
    @FindBy(xpath = "//input[@id='security-code-input']")
    WebElement ccvInput;
    @FindBy(xpath = "//input[@formcontrolname='firstName']")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@formcontrolname='lastName']")
    WebElement lastNameField;
    @FindBy(xpath = "//app-address-autocomplete//input")
    WebElement addressInput;
    @FindBy(xpath = "//ul[@role='listbox']/li")
    WebElement autoCompleteAddress;
    @FindBy(xpath = "//input[@formcontrolname='postalCode']")
    WebElement postalCode;
    @FindBy(xpath = "//span[contains(text(),'Save')]")
    WebElement saveCTA;
    @FindBy(xpath = "//button[@variant='secondary']")
    WebElement cancelCTA;
    @FindBy(xpath = "//h3[contains(text(),'Saved')]")
    WebElement savedCardsHeader;
    @FindBy(xpath = "(//button[@title='Close']/preceding::p)[8]")
    WebElement cardSavedText;
    @FindBy(xpath = "//p[contains(text(),'Are you sure you want to cancel?')]")
    WebElement cancelSaveText;
    @FindBy(xpath = "//button[@title='Cancel desc']")
    WebElement yesCancelCTA;
    @FindBy(xpath = "//button[@title='Dismiss desc']")
    WebElement noDismissCTA;
    @FindBy(xpath = "//h3[contains(text(),'Add new card')]")
    WebElement addNewCardText;
    @FindBy(xpath = "//h3[contains(text(),'Billing Details')]")
    WebElement billingDetailsText;
    @FindBy(css = "ds-input-label[class='ng-tns-c22-2']") //p[class='mgey-16'] p
    WebElement newSIMMessage;
    @FindBy(xpath = "(//span[@role='img'])[3]")
    WebElement greenCheckMark2;
    @FindBy(xpath = "//span[contains(text(),'History')]")
    WebElement historyReports;
    @FindBy(xpath = "(//button[@role='tab'])[5]")
    WebElement orderHistoryCTA;
    @FindBy(xpath = "//span[contains(text(),'Past 30 days')]")
    WebElement pastThirtyDays;
    @FindBy(xpath = "//span[contains(text(),'Status')][2]")
    WebElement statusButton;
    @FindBy(xpath = "//span[contains(text(),'All')]")
    WebElement allButton;
    @FindBy(xpath = "//span[contains(text(),'Apply Filters')]")
    WebElement applyFilterButton;
    @FindBy(xpath = "//button[contains(text(),'Status')]")
    WebElement sortByStatus;
    @FindBy(xpath = "//*[@id=\"ds-tabs-0-tabPanel-1\"]/lib-order-history/div/app-table-content/ds-table-container/div[1]")
    WebElement tablePresent;
    @FindBy(xpath = "//table[@role='grid']/tbody/tr/td[6]")
    WebElement gettingStatusColumn;
    @FindBy(xpath = "//button[contains(text(),'Submitted By')]")
    WebElement submittedByButton;
    @FindBy(xpath = "//button[contains(text(),'Submitted On')]")
    WebElement submittedOnDateButton;
    @FindBy(xpath = "//button[contains(text(),'Last Updated On')]")
    WebElement lastUpdatedOnDateButton;
    @FindBy(xpath = "//span[contains(text(),'Manage account')]")
    WebElement managePIN;
    @FindBy(xpath = "//input[contains(@id,'newPin')]")
    WebElement newPINField;
    @FindBy(xpath = "//input[@id='confirmPin']")
    WebElement confirmPINField;
    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    WebElement mPinSubmitButton;
    @FindBy(xpath = "//*[contains(text(),'Success!')]")
    WebElement successMessage;
    @FindBy(xpath = "//span[contains(text(),'Go')]")
    WebElement goToAccountButton;
    @FindBy(xpath = "(//span[text()='Error! Enter a 4-digit PIN.'])[1]")
    WebElement errorMessageNewPin;
    @FindBy(xpath = "(//span[text()='Error! Enter a 4-digit PIN.'])[2]")
    WebElement errorMessageConfirmPin;
    @FindBy(xpath = "//span[@role='alert']")
    WebElement errorMessageMismatch;
    @FindBy(xpath = "//span[@class='ds-icon d-inline-flex cds-icon-hide']")
    WebElement firstEyeIcon;
    @FindBy(xpath = "//span[@class='ds-icon d-inline-flex cds-icon-show']")
    WebElement firstEyeIcon1;
    @FindBy(xpath = "//span[@class='ds-icon d-inline-flex cds-icon-hide']")
    WebElement secondEyeIcon;
    @FindBy(xpath = "//span[@class='ds-icon d-inline-flex cds-icon-show']")
    WebElement secondEyeIcon1;
    @FindBy(xpath = "(//span[text()='Error! PIN must contain exactly 4 digits. Try again.'])[1]")
    WebElement fourDigitErrorMessage1;
    @FindBy(xpath = "(//span[text()='Error! PIN must contain exactly 4 digits. Try again.'])[2]")
    WebElement fourDigitErrorMessage2;
    @FindBy(xpath = "//span[contains(text(),'Your account balance')]")
    WebElement accountBalanceText;
    @FindBy(xpath = "//span[contains(text(),'Your account balance')]//ancestor::lib-balance-details//span[3]")
    WebElement accountBalanceValue;
    @FindBy(xpath = "//span[contains(text(),'Account status')]")
    WebElement accountStatusText;
    @FindBy(xpath = "//span[contains(text(),'Account status')]//ancestor::lib-status-details//span[3]")
    WebElement accountStatusValue;
    @FindBy(xpath = "//a[contains(@title,'Account history')]")
    WebElement accountHistoryLink;
    @FindBy(xpath = "//a[normalize-space()='Learn more']")
    WebElement accountDetailsLink;
    @FindBy(xpath = "//span[contains(text(),'Your anniversary date')]")
    WebElement anniversaryDateText;
    @FindBy(xpath = "//span[contains(text(),'Your anniversary date')]/following-sibling::span[3]")
    WebElement anniversaryText;
    @FindBy(xpath = "//span[contains(text(),'Your anniversary date')]/following-sibling::span[1]")
    WebElement anniversaryDateValue;
    @FindBy(xpath = "//button[contains(@aria-label,'chatr')]")
    WebElement myChatrButton;
    @FindBy(xpath = "//h4[normalize-space()='Auto-pay']")
    WebElement autoPayBlock;
    @FindBy(xpath = "//*[@id=\"ds-tabs-0-tab-1\"]")
    WebElement currentPlanCTA;
    @FindBy(xpath = "//*[@id=\"ds-tabs-0-tab-0\"]")
    WebElement myChatr;
    @FindBy(xpath = "//button[contains(@aria-label,'Plan details')]")
    WebElement currentPlanButton;
    @FindBy(xpath = "//span[contains(text(),'Change plan')]/ancestor::button")
    WebElement changePlanButton;
    @FindBy(xpath = "//button[@title='Review other plans']")
    WebElement ppcChangePlanButton;
    @FindBy(xpath = "//span[text()='First name ']/following-sibling::span")
    WebElement firstNameProfile;
    @FindBy(xpath = "//span[text()='Last name ']/following-sibling::span")
    WebElement lastNameProfile;
    @FindBy(xpath = "(//span[@class='option-title text-bold']/following-sibling::span)[1]")
    WebElement dataUsage;
    @FindBy(xpath = "(//span[@class='option-title text-bold']/following-sibling::span)[3]")
    WebElement talkUsage;
    @FindBy(xpath = "(//span[@class='option-title text-bold']/following-sibling::span)[5]")
    WebElement textUsage;
    @FindBy(xpath = "//a[@title='Get add-ons']")//a[contains(@title,'Get add-ons')]
    WebElement addOnsBlock;
    @FindBy(xpath = "//a[normalize-space()='Use this card for auto-pay']")
    WebElement assignAutopay;
    @FindBy(xpath = "(//div[@aria-hidden='true'])[3]")
    WebElement checkboxAutopay;
    @FindBy(xpath = "(//button[@role='button'])[6]")
    WebElement yesButtonOption;
    @FindBy(xpath = "(//div/span)[7]")
    WebElement firstSaveCard;
    @FindBy(xpath = "(//div/span)[11]")
    WebElement secondSaveCard;
    @FindBy(xpath = "//span[contains(text(),'Back to My chatr')]")
    WebElement backToChatr;
    @FindBy(xpath = "//button[@title='Edit']//span[@role='text']")
    WebElement mPinEditButton;
    @FindBy(xpath = "//a[@role='link']")
    WebElement mPinManageAcctPINLink;
    @FindBy(xpath = "//div[contains(text(),'5 cards')]")
    WebElement storeUpCCLimitViaChgPlan;
    @FindBy(xpath = "//span[contains(text(),'Manage add-ons')]")//span[contains(text(),'Manage')]//span[contains(text(),' Get add-ons ')]
    WebElement manageAddOn;
    @FindBy(xpath = "//span[contains(text(),'Get add-ons')]")
    WebElement getAddOn;
    @FindBy(xpath = "//h5[contains(text(),'customize your experience')]")
    WebElement eligibleAddons;
    @FindBy(xpath = "//h4[contains(text(),'Active')]")
    WebElement activeAddons;
    @FindBy(xpath = "//*[contains(text(),'Top-up')]")
    WebElement topUpCTA;
    @FindBy(xpath = "(//*[contains(text(),\"Top-up\")])[1]")
    WebElement topUpFooter;
    @FindBy(xpath = "//*[contains(text(),\"$\")]")
    WebElement balance$;
    @FindBy(xpath = "(//div[@class=\"ds-radioButton__innerCircle\"])[1]")
    WebElement creditCardRadioBtn;
    @FindBy(xpath = "//div[2]/ds-radio-button[1]/label[1]/div[1]/div[1]")
    // @FindBy(xpath = "//div[contains(text(),'hatr top-up card')]")
            ////div[2]/ds-radio-button[1]/label[1]/div[1]/div[1]
    WebElement chatrTopUpRadioBtn;
    @FindBy(xpath = "//*[@formcontrolname=\"amount\"]")
    WebElement topUpAmtField;
    @FindBy(xpath = "//*[contains(@formcontrolname,'mount')]")
    WebElement topUpAmtFieldMAO;
    @FindBy(xpath = "(//ds-error/span)[1]")
    WebElement errorExceeds300$;
    @FindBy(xpath = "//a[@title=\"Select add-on link\"]")
    WebElement selectAddOnLink;
    @FindBy(xpath = "//label[@class=\"ds-checkboxLabel d-inline-flex align-items-start\"]/div")
    WebElement addOnCheckbox;
    @FindBy(xpath = "(//*[contains(text(),\"Total\")])[1]")
    WebElement totalDueToday;
    @FindAll({@FindBy(xpath = "//*[contains(text(),\"Order summary\")]"),@FindBy(xpath = "//*[contains(text(),\"Order Summary\")]")})  //PPC - Order summary
    WebElement orderSummary;
    @FindBy(xpath = "//button[contains(@title,'Continue')]")
    WebElement continueBtnMAO;
    @FindBy(xpath = "(//span[contains(text(),\"Continue\")])[2]")
    WebElement continueBtn;
    @FindBy(xpath = "//span[contains(text(),\"edit\")]")
    WebElement editBtn_NewAddon;
    @FindBy(xpath = "//*[@class=\"ds-checkbox__box my-12\"])[1]")
    WebElement MAOTnCcheckbox1;
    @FindBy(xpath = "//span[contains(text(),\"Please check the checkbox in order to proceed\")]")
    WebElement MAOcheckbox_error;
    @FindBy(xpath = "//span[contains(text(),\" Show top-up options \")]")
    List<WebElement> showTopUpOptions;
    @FindBy(xpath = "//span[contains(text(),\" Address \")]")
    List<WebElement> listAddressElements;
    @FindBy(xpath = "//p[contains(text(),\"Use other card\")]")
    WebElement useOtherCard;
    @FindBy(xpath = "//*[contains(text(),'card PIN before')]")
    WebElement topUpWithoutPinError;
    @FindBy(xpath = "//*[@class=\"dsa-orderTable__copy text-bold\"]")
    WebElement accountBalUsedInDollars;
    @FindBy(xpath = "//*[@class=\"ds-price__amountDollars text-semi ng-star-inserted\"]")
    WebElement addOnAmountInDollars;
    @FindBy(xpath = "//*[contains(text(),\"Change plan\")]")
    WebElement changePlanBtn;
    @FindBy(xpath = "//*[contains(text(),\"Proceed\")]")
    WebElement planProceedBtn;
    @FindBy(xpath = "(//*[@class=\"ds-checkbox__box my-12\"])[2]")
    WebElement MAOTnCcheckbox2;
    @FindBy(xpath = "//button[@title=\"Save summary Description\"]//span/span")
    WebElement saveSummaryButton;
    @FindBy(xpath = "//span[contains(text(),\"Order #:\")]")
    WebElement orderNum;
    @FindBy(xpath = "//span[contains(text(),\"Order created:\")]")
    WebElement orderCreatedDate;
    @FindBy(xpath = "//span[contains(text(),\"Place of contract:\")]")
    WebElement placeOfContract;
    //@FindBy(xpath ="(//input[contains(@type,'tel')])[3]")
    //@FindBy(xpath ="//*[normalize-space()='Top-up card PIN']")
    //@FindBy(xpath="(//*[contains(@id,'ds-form-input')])[2]")
    //@FindBy(xpath="(//*[contains(@class,'ds-formField__input')])[2]")
    @FindBy(xpath = "(//input[contains(@type,'tel')])[3]")
    //@FindBy(xpath ="//*[normalize-space()='Top-up card PIN']")
    //@FindBy(xpath="(//*[contains(@id,'ds-form-input')])[2]")
    // @FindBy(xpath="(//*[contains(@class,'ds-formField__input')])[2]")
    WebElement topUpCardField;
    @FindBy(xpath = "//*[contains(text(),\"Data Autopay Bonus 2Gb\")]")
    List<WebElement> autopayBonusBlock;
    @FindBy(xpath = "//span[contains(text(),'add-ons to your')]")
    WebElement cardEmpty;
    @FindBy(xpath = "//span[contains(text(),'have an order pending')]")
    WebElement inFlightMsg;
    @FindBy(xpath = "//span[contains(text(),'Your account is expired')]")
    WebElement expiryAcctMsg;
    @FindBy(xpath = "//span[contains(text(),'Sign out')]")
    WebElement signOutBtn;
    @FindBy(xpath = "//h3[normalize-space()='Manage add-ons']")
    WebElement manageAddOnHeading;
    @FindBy(xpath = "//ds-error//span[@role='img']")
    WebElement errorMsgIcon;
    @FindBy(xpath = "//h3[contains(text(),'Review')]")
    WebElement h1OrderReviewPageMAO;
    @FindBy(xpath = "//p[contains(text(),'Anniversary date')]")
    WebElement h1AnniversaryDateMAO;
    @FindBy(xpath = "//div[contains(text(),'Newly selected')]")
    WebElement h2OrderReviewPageMAO;
    @FindBy(xpath = "(//span[@role='text'])[1]")
    WebElement h2EditBtnMAO;
    @FindBy(xpath = "//app-order-review-tile/div/div/app-addon/div[1]")
    WebElement h2OverAllFrameMAO;
    @FindBy(xpath = "//div[contains(text(),'Payment details')]")
    WebElement h3PaymentDetailsMAO;
    @FindBy(xpath = "(//span[@role='text'])[2]")
    WebElement paymentEditBtnMAO;
    @FindBy(xpath = "//p[contains(text(),'ACCOUNT BALANCE')]")
    WebElement h3AccountBalanceMAO;
    @FindBy(xpath = "//p[contains(text(),'Top-up details')]")
    WebElement h3TopupDetailsMAO;
    @FindBy(xpath = "//p[contains(text(),'chatr top-up card ')]")
    WebElement h3TopupMethodMAO;
    @FindBy(xpath = "//span[contains(text(),'Order Summary')]")
    WebElement h1OrderSummaryCartMAO;
    @FindBy(xpath = "(//span[@class=\"detail-value text-right text-bold word-wrap\"])[8]")
    WebElement profileAddress;
    @FindBy(xpath = "(//span[@class=\"detail-value text-right text-bold word-wrap\"])[9]")
    WebElement profileCity;
    @FindBy(xpath = "(//span[@class=\"detail-value text-right text-bold word-wrap\"])[11]")
    WebElement profilePostalCode;
    @FindBy(xpath = "//span[contains(text(),'Details')]")
    WebElement profileDetailsButton;
    @FindBy(xpath = "//span[contains(text(),'Manage add-ons')]")
    WebElement changePlan;
    @FindBy(xpath = "//span[contains(text(),'Your account is expired. You can not change your plan nor purchase add-ons if your account is not active')]")
    WebElement expiredAccount;
    @FindBy(xpath = "//span[contains(text(),'An order is currently being processed')]")
    WebElement pendingOrders;
    @FindBy(xpath = "//span[contains(text(),'Manage add-ons')]")
    WebElement selectAddOn;
    @FindBy(xpath = "//span[contains(text(),'Not enough money')]")
    WebElement inSufficientBalance;
    @FindBy(xpath = "//span[contains(text(),'card not found')]")
    WebElement voucherErrorInvalidPin;
    @FindBy(xpath = "//a[contains(@title,'Assign for autopay')]")
    WebElement assignAutopayBonus;
    @FindBy(xpath = "//span[contains(text(),'No, cancel')]")
    WebElement noCancelButton;
    @FindBy(xpath = "//span[contains(text(),'Used for auto-pay')]")
    WebElement usedForAutoPay;
    @FindBy(xpath = "(//div[contains(text(),'Card details')])[1]/following-sibling::div")
    WebElement creditCardPaymentSummary;
    @FindBy(xpath = "//input[@formcontrolname='topUpAmount']")
    WebElement extraMoneyField;
    @FindBy(xpath = "//*[contains(text(),'Plan')]")
    WebElement ppcButtonRetail;
    //@FindBy(xpath = "//span[contains(text(),'Select add-ons')]")
    @FindBy(xpath="//*[contains(@title,'add-ons')]")
    WebElement selectAddOnMAO;
    @FindBy(xpath = "//*[contains(text(),'under $300')]")
    WebElement ccTopUpError;
    @FindBy(xpath = "//*[contains(text(),'$0.01')]")
    WebElement zeroTopUpError;
    @FindBy(xpath = "//span[contains(text(),'Enroll')]")
    WebElement enroll;
    @FindBy(xpath = "//ds-checkbox/label/div[1]")
    WebElement autoPayCheckBox;
    @FindBy(xpath = "//p[contains(text(),'your payment card information')]")
    List<WebElement> saveCreditCardCheckBox;

    @FindBy(xpath = "//button[contains(@aria-label,'Profile')]")
    WebElement profileTabBtn;
    @FindBy(xpath = "//input[@inputmode='numeric']")
    WebElement topUpCardFieldSS;
    @FindBy(xpath = "//ds-radio-group/div/ds-selection/label/span")
    WebElement useAnotherCard;
    @FindAll({@FindBy(xpath = "//input[@value='[object Object]']/following-sibling::span"), @FindBy(xpath = "//h3[normalize-space()='Saved cards']")})
    WebElement saveCreditCard;
    @FindBy(xpath = "//*[contains(text(),'Change SIM ')]")
    WebElement simChangeButton;
    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    WebElement submitButton;
    @FindBy(xpath = "(//span[contains(text(),'customer dashboard')])[2]")
    WebElement backToDashInPopUp;
    @FindBy(xpath = "//*[contains(text(),'SIM change limit reached')]")
    WebElement simChangeAlertMessage;
    @FindBy(xpath = "//h2[contains(text(),'Add')]")
    WebElement addOnExisting;
    @FindBy(xpath = "//span[contains(text(),'Change SIM card')]")
    WebElement changeSimCardButton;
    @FindBy(xpath = "//lib-saved-card")
    List<WebElement> listcard8881;
    @FindBy(xpath = "//*[@id=\"ds-tabs-0-tab-1\"]")
    WebElement paymentCardTab;
    @FindBy(xpath = "//p[contains(text(),'SIM card changed successfully')]")
    WebElement changeSimSuccessPopUp;
    @FindBy(xpath = "//span[contains(text(),' Back to customer dashboard ')]")
    WebElement backToDashboard;
    @FindBy(xpath = "//app-top-banner[1]/ul[1]/li[4]/span[2]/span[2]")
    WebElement simCardNumber;
    @FindBy(xpath = "//lib-saved-cards/div[2]/span")
    WebElement noSavedCards;
    @FindBy(xpath = "//p[contains(text(),'******')]")
   List< WebElement> voucherPin;
    @FindBy(xpath = "(//span[contains(text(),'Error! PIN ')])[1]")
     WebElement newPinError;
    @FindBy(xpath = "(//span[contains(text(),'Error! PIN ')])[1]")
    WebElement confirmPinError;
    @FindBy(xpath = "//h2[contains(text(),'Account infor')]")
    WebElement accountDetailsBanner;
    @FindBy(xpath = "(//span[contains(@class,'detail-value text')])[5]") //6
    WebElement accountPinStatus;
    @FindBy(xpath = "(//span[@role='img'])[2]")
    WebElement newPinEye;
    @FindBy(xpath = "(//span[@role='img'])[3]")
    WebElement confirmPinEye;
    @FindBy(xpath = "(//span[contains(text(),'Back to My cha')])[2]")
    WebElement backToChatRInPopUp;
    @FindBy(xpath = "//lib-saved-card/div/div/div/button/span/ds-icon/span")
    WebElement editIcon;
    @FindBy(xpath = "//input[@formcontrolname='expirationDate']")
    WebElement expiryDateInput;

    @FindBy(xpath = "//span[contains(text(),'date is incorrect')]")
    WebElement expiryDateError;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    WebElement saveBtn;
    @FindBy(xpath = "//p[contains(text(),'Card saved successfully!')]")
    WebElement cardSavedSuccess;
    @FindBy(xpath = "//span[contains(text(),'OK')]")
    WebElement okButton;
    @FindBy(xpath = "//span[contains(text(),'Visa: Expires ')][1]")
    WebElement changedExpDate;
    @FindBy(xpath = "(//span[contains(text(),'Learn more')])[3]")
    WebElement internationalTalkSaver;
    @FindBy(xpath = "//h1[contains(text(),'long distance')]")
    WebElement longDistance;
    @FindBy(xpath = "//input[@id='countrySelect_input']")
    WebElement destinationDropdown;
    @FindBy(xpath = "//li[@id='countrySelect_input_Canada & US|index~1']")
    WebElement canadaAndUS;
    @FindBy(xpath = "//table[@id='activePlanUSGrid1']")
    WebElement longDistanceRates;
    @FindBy(xpath = "(//span[contains(text(),'Roaming Rates')])[4]")
    WebElement roamingRatesLink;
    @FindBy(xpath = "//li[@id='countrySelect_input_US|index~1']")
    WebElement countryUS;
    @FindBy(xpath = "//iframe[@class]")
    WebElement ccDetailsFrame;
    @FindBy(xpath = "//div[contains(text(),'Mastercard')]")//(//*[@class='ds-radioButton__innerCircle'])[1]")
    WebElement radioButtonCreditCard;
    @FindBy(xpath = "//div[contains(text(),'tr top-up')]")//(//*[@class='ds-radioButton__outerCircle my-12'])[4]")
    WebElement radioButtonVoucher;
    @FindBy(xpath = "//lib-saved-card/div/div/div/button/span/ds-icon")
    List<WebElement> editCCIcon;
    @FindBy(xpath = "//*[contains(text(),'Add a card')]")
    List<WebElement> addCCIcon;
    @FindBy(xpath = "//h4[contains(text(),'Promotions')]")
    WebElement promationDetail;
    @FindBy(xpath = "//span[@class='dsa-orderTable__totalPrice text-right']//div[@class='ds-price__amountDollars text-semi align-self-start ng-star-inserted'][normalize-space()='0']")
    WebElement totalDueTodayAmound;
    @FindBy(xpath = "//ds-accordion-panel[1]/div[1]/button[1]/div[1]/div[1]/p[1]/span[1]")
    WebElement addonInPlanPage;
    @FindBy(xpath = "//ds-checkbox[1]/label[1]/div[2]/p[1]")
    WebElement oneTimeDataddon;
    @FindBy(xpath = "//app-order-review-tile/div/div[3]/app-addon/div[1]/div[1]/span[1]")
    WebElement oneTimeDataddonReviewPage;
    @FindBy(xpath = "//lib-saved-card[1]/div[1]/div[1]/div[1]/span[1]")
    WebElement expiryDate;
    @FindBy(xpath = "//h2[normalize-space()='Add-ons']")
    WebElement addonBlockInDashBoard;

    public AccountManagementPage(WebDriver driver) {
        super(driver);
    }

    public void goToAccountHistory() {
        //welcomeBanner.isDisplayed();
        getReusableActions().staticWait(2000);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", accountHistoryCTA);
        getReusableActions().clickWhenReady(accountHistoryCTA, 10);
        //accountHistoryCTA.click();
        //when opened a new tab, added code to switch to new tab
        int setSize = getDriver().getWindowHandles().size();
        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(setSize - 1));
        getReusableActions().staticWait(2000);
        historyReportsBanner.isDisplayed();
        reporterSnapshot(historyReportsBanner, "history Reports Banner", "", "display");
          }

    public void clickOnSimSwap() {
        getReusableActions().javascriptScrollByVisibleElement(simSwapButton);
        getReusableActions().isElementVisible(simSwapButton);
        reporterSnapshot(simSwapButton, "sim Swap", "", "NULL");
        simSwapButton.click();
    }

    public void enterCurrentSimNumber(String oldSimNumber) {
        getReusableActions().isElementVisible(CurrentSimNumber);
       // getReusableActions().clickWhenReady(CurrentSimNumber);
        getReusableActions().staticWait(2000);
        CurrentSimNumber.click();
        getReusableActions().isElementVisible(simNumberMessage);
        //reporter.softAssert(simNumberMessage.getText().equals("SIM number has to have 20 digits"), simNumberMessage.getText(), "Invalid message");
        reporterSnapshot(simNumberMessage, "exactly as", "", "common");
        //reporter.reportLogWithScreenshot("populate first 8 digit sim card number");
        CurrentSimNumber.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        CurrentSimNumber.sendKeys(oldSimNumber);
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(greenCheckMark);
        reporterSnapshot(greenCheckMark, oldSimNumber, "", "visible");

    }

    public String getCurrentCTN() {
        getReusableActions().staticWait(5000);
        String currentCTN = getCurrentCtn.getText().replace("-", "");
        reporterSnapshot(getCurrentCtn, currentCTN, "", "NULL");
        return currentCTN;
    }

    public void clickOnSaveButton() {
        getReusableActions().isElementVisible(saveButton);
        getReusableActions().staticWait(3000);
        saveButton.click();
    }

    public void enterNewSimNumber(String newSimNumber) {
        getReusableActions().javascriptScrollByVisibleElement(newSimNumberSection);
        getReusableActions().isElementVisible(newSimNumberSection);
        newSimNumberSection.click();
        getReusableActions().staticWait(2000);
        newSimNumberSection.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
        newSimNumberSection.sendKeys(newSimNumber);
        getReusableActions().staticWait(2000);
        reporterSnapshot(newSimNumberSection, newSimNumber, "", "NULL");
    }

    public void popUpFieldValidate() {
        getReusableActions().waitForElementVisibility(popUp);
        //reporter.softAssert(popUp.getText().equals("The SIM card has been changed"), popUp.getText(), "Invalid popUp message");
        reporterSnapshot(popUp, "changed successfully", "", "Common");
    }

    public void goToProfile() {
        getReusableActions().staticWait(3000);
/*        getReusableActions().clickWhenReady(profileCTA, 10);
        getReusableActions().staticWait(2000);*/
        getReusableActions().javascriptScrollByVisibleElement(profileCTA);
        getReusableActions().staticWait(1000);
        //profileCTA.click();
        getReusableActions().executeJavaScriptClick(profileCTA);
        //reporter.softAssert(profileCTA.isDisplayed(), "profile CTA is Display","profile CTA is not Display");
        reporterSnapshot(profileCTA, "Profile", "", "display");
    }

    public void goToManageSavedCards() {
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollByVisibleElement(manageSavedCardCTA);
        reporterSnapshot(manageSavedCardCTA, "Manage CC", "", "display");
        manageSavedCardCTA.click();
        getReusableActions().staticWait(5000);
    }

    public void validateStoreUpLimit() {
        getReusableActions().javascriptScrollByVisibleElement(storeUpCCLimit);
        reporterSnapshot(storeUpCCLimit, "5 card", "", "common");
    }

    public void validateStoreUpLimitViaChangePlan() {
        getReusableActions().javascriptScrollByVisibleElement(storeUpCCLimitViaChgPlan);
        reporterSnapshot(storeUpCCLimitViaChgPlan, "5 card", "", "common");
    }

    public void clickOnDeleteSavedCard() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(deleteCard8881CTA);
        deleteCard8881CTA.click();
    }

    public void clickOnYesConfirm() {
        getReusableActions().clickWhenReady(yesDeleteCTA, 10);
    }

    public void clickOnNoCancel() {
        getReusableActions().clickWhenReady(noCancelCTA, 10);
    }

    public void validateConfirmDeleteModal() {
        //reporter.softAssert(getReusableActions().isElementVisible(deleteCardText), deleteCardText.getText(), "Delete Card text is not showing");
        reporterSnapshot(deleteCardText, "want to delete", "", "Common");
        yesDeleteCTA.isDisplayed();
        noCancelCTA.isDisplayed();
    }

    public void setCardDetails(String creditCard, String expDate, String cvv) {
        WebElement ccDetailsFrame = getDriver().findElement(By.xpath("//iframe[@class]"));
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame, 30);
        getReusableActions().javascriptScrollByVisibleElement(creditCardInput);
        getReusableActions().clickWhenReady(creditCardInput, 10);
        creditCardInput.sendKeys(creditCard);
        getReusableActions().clickWhenReady(monthInput, 10);
        monthInput.sendKeys(expDate);
        getReusableActions().clickWhenReady(ccvInput, 10);
        ccvInput.sendKeys(cvv);
        //reporter.reportLogWithScreenshot("Credit card details are populated");
        reporterSnapshot(ccvInput, "Credit Card Details", "", "NULL");
        getDriver().switchTo().defaultContent();
    }

    public void validateCardDetailsEmpty() {
        WebElement ccDetailsFrame = getDriver().findElement(By.xpath("//iframe[@class]"));
        getReusableActions().waitForFrameToBeAvailableAndSwitchToIt(ccDetailsFrame, 30);
        getReusableActions().scrollToElement(ccvInput);
        reporterSnapshot(creditCardInput, "Credit Card", "", "empty");
        reporterSnapshot(monthInput, "Expiry Date", "", "empty");
        reporterSnapshot(ccvInput, "CVV", "", "empty");
        getDriver().switchTo().defaultContent();
    }

    public void setAddress(String city) {
        getReusableActions().javascriptScrollByVisibleElement(addressInput);
        addressInput.click();
        addressInput.sendKeys(city);
        getReusableActions().isElementVisible(autoCompleteAddress, 10);
        getReusableActions().clickWhenReady(autoCompleteAddress, 10);
        //Second time Address is Populating
        getReusableActions().isElementVisible(autoCompleteAddress, 10);
        getReusableActions().clickWhenReady(autoCompleteAddress, 10);
        waitForAttributeToBeNotEmpty(postalCode, "value", 10);
        reporter.reportLogWithScreenshot("Address is populated");
    }

    public void validateSavedCardsText() {
        getReusableActions().staticWait(3000);
        //reporter.softAssert(getReusableActions().isElementVisible(savedCardsHeader), savedCardsHeader.getText(), "");
        reporterSnapshot(savedCardsHeader, "Saved Card", "", "visible");
    }

    public void validateCardIsNotPresent(int countCC) {
        getReusableActions().staticWait(3000);
        countCC = countCC - 1;
        int actCC = getCardCountPresent();
        String expCount = Integer.toString(countCC);
        String actCount = Integer.toString(actCC);
        reporterSnapshot(card8881, expCount, actCount, "compare");
    }

    public void clickAddCard() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(addCardCTA);
        getReusableActions().staticWait(2000);
        //addCardCTA.click();
        getReusableActions().executeJavaScriptClick(addCardCTA);
        getReusableActions().staticWait(2000);
    }

    public void setName(String firstName, String lastName) {
        //getReusableActions().clickWhenReady(firstNameField,10);
        firstNameField.sendKeys(firstName);
        //getReusableActions().clickWhenReady(lastNameField,10);
        lastNameField.sendKeys(lastName);
    }

    public void clickSave() {
        getReusableActions().staticWait(2000);
        if (saveCreditCardCheckBox.size() >= 1) {
            saveCreditCardCheckBox.get(0).click();
        }
        getReusableActions().clickWhenReady(saveCTA, 10);
    }

    public void validateCardSavedModal() {
        getReusableActions().staticWait(7000);
        reporterSnapshot(cardSavedText, "Card Save", "", "visible");

    }

    public void validateCardIsPresent() {
        //reporter.softAssert(getReusableActions().isElementVisible(card8881), "Card has been saved", "Card has been not saved");
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='50%'");
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(card8881);
        getReusableActions().staticWait(1000);
        reporterSnapshot(card8881, "Card Saved", "", "VISIBLE");
        getReusableActions().staticWait(3000);
        getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
        getReusableActions().staticWait(4000);
    }

    public void clickCancel() {
        getReusableActions().clickWhenReady(cancelCTA, 10);
    }

    public void validateCancelAddModal() {
        reporter.softAssert(getReusableActions().isElementVisible(cardSavedText), "Card Cancel modal is appearing", "Card cancel modal is not appearing");
        getReusableActions().isElementVisible(yesCancelCTA, 10);
        getReusableActions().isElementVisible(noDismissCTA, 10);
    }

    public void clickYesCancel() {
        getReusableActions().clickWhenReady(yesCancelCTA, 10);
    }

    public void clickNoCancel() {
        getReusableActions().clickWhenReady(noCancelCTA, 10);
    }

    public void validateAddCardDetailsScreen() {
        getReusableActions().isElementVisible(billingDetailsText, 10);
        reporter.softAssert(getReusableActions().isElementVisible(billingDetailsText), "Still in add card flow", "Not in add card flow");
    }

    public void validateNoAddCardDetailsScreen() {
        reporter.softAssert(getReusableActions().isElementVisible(welcomeBanner), "Not in the add card flow", "Still in the add card flow");
    }

    public void validateSuccessfulGreenCheckMarkInNewSimField() {
        getReusableActions().staticWait(1000);
//        getReusableActions().javascriptScrollByVisibleElement(newSIMMessage);
//        reporterSnapshot(newSIMMessage, "New Sim Number", "", "visible");
        reporterSnapshot(greenCheckMark2, "Validate New SIM", "", "visible");
    }

    public void clickOnHistoryReports() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(historyReports);
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(historyReports, 10);
        getReusableActions().staticWait(2000);
        //reporter.reportLogWithScreenshot("Welcome to History Report page");
        //ArrayList<String> tabs2 = new ArrayList<String> (getDriver().getWindowHandles());
        //getDriver().switchTo().window(tabs2.get(1));
        //historyReportsBanner.isDisplayed();
    }

    public void clickOnOrderTab() {
        getReusableActions().javascriptScrollByVisibleElement(orderHistoryCTA);
        getReusableActions().isElementVisible(orderHistoryCTA);
        getReusableActions().clickWhenReady(orderHistoryCTA, 10);
    }

    public void clickOnPastThirtyDays() {
        getReusableActions().javascriptScrollByVisibleElement(pastThirtyDays);
        getReusableActions().isElementVisible(pastThirtyDays);
        // getReusableActions().clickWhenReady(pastThirtyDays,10);
        getReusableActions().staticWait(3000);
        pastThirtyDays.click();
        reporter.reportLogWithScreenshot("Past Thirty Day Button is clicked");
    }

    public void clickOnStatusButton() {
        getReusableActions().javascriptScrollByVisibleElement(statusButton);
        getReusableActions().isElementVisible(statusButton);
        getReusableActions().staticWait(4000);
        getReusableActions().clickWhenReady(statusButton, 20);
        getReusableActions().staticWait(3000);
    }

    public void clickOnAllButton() {
        getReusableActions().javascriptScrollByVisibleElement(allButton);
        getReusableActions().isElementVisible(allButton);
        getReusableActions().clickWhenReady(allButton, 10);
        reporter.reportLogWithScreenshot("All Button is clicked");
    }

    public void clickOnApplyFilterButton() {
        getReusableActions().javascriptScrollByVisibleElement(applyFilterButton);
        getReusableActions().isElementVisible(applyFilterButton);
        getReusableActions().clickWhenReady(applyFilterButton, 10);
        reporter.reportLogWithScreenshot("Apply Filter Button is clicked");
    }

    public void clickOnSortByStatusButton() {
        getReusableActions().javascriptScrollByVisibleElement(sortByStatus);
        getReusableActions().isElementVisible(sortByStatus);
        //getReusableActions().waitForElementTobeClickable(sortByStatus,10);
        // sortByStatus.click();
        getReusableActions().staticWait(3000);
        sortByStatus.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Status Sorted by Alphabetical order");
    }

    public void clickOnSortByStatusButtonDesc() {
        getReusableActions().javascriptScrollByVisibleElement(sortByStatus);
        getReusableActions().isElementVisible(sortByStatus);
        //getReusableActions().waitForElementTobeClickable(sortByStatus,10);
        // sortByStatus.click();
        getReusableActions().staticWait(3000);
        sortByStatus.click();
        getReusableActions().staticWait(3000);
        sortByStatus.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Status Sorted by Alphabetical order");
    }

    public void clickOnSortBySubmitOrderButtonDesc() {
        getReusableActions().javascriptScrollByVisibleElement(submittedByButton);
        getReusableActions().isElementVisible(submittedByButton);

        getReusableActions().staticWait(3000);
        submittedByButton.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Submitted by Sorted in alphabetical order");
        submittedByButton.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Submitted by Sorted in reverse alphabetical order");
    }

    public void clickOnStatusColumn() {
        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[6]"));
        System.out.println("Number of elements:" + columnstatus.size());

        for (int i = 0; i < columnstatus.size(); i++) {
            System.out.println(columnstatus.get(i).getText());
        }

    }

    public void clickOnSubmittedByColumn() {
        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[5]"));
        System.out.println("Number of elements:" + columnstatus.size());

        for (int i = 0; i < columnstatus.size(); i++) {
            System.out.println(columnstatus.get(i).getText());
        }

    }

    public void validateTableScreenAsc() {
        getReusableActions().isElementVisible(tablePresent, 10);
        reporter.softAssert(getReusableActions().isElementVisible(tablePresent), "Status Sorted in Alphabetical order", " Alphabetically Sorted table not present");
       /* String[] ex = {"Completed", "In Progress"};
        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[6]"));
        System.out.println("Number of elements:" + columnstatus.size());
        int listsize = columnstatus.size();
        int lastrecord = listsize - 1;
        reporter.softAssert((ex[0]), columnstatus.get(0).getText(), "Alphabetically sorted", "Not alphabetically sorted");
        reporter.softAssert((ex[1]), columnstatus.get(lastrecord).getText(), "Alphabetically sorted", "Not alphabetically sorted"); */
        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[6]"));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();

        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        reporter.softAssert(sortedList.equals(obtainedList), "Status is sorted in alphabetical order", "Status is not sorted in  Alphabetical order");

    }

    public void validateTableScreenDesc() {
        getReusableActions().isElementVisible(tablePresent, 10);
        reporter.softAssert(getReusableActions().isElementVisible(tablePresent), "Status Sorted in Reverse Alphabetical order", "  Reverse Alphabetically Sorted table not present");

        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[6]"));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();

        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        reporter.softAssert(sortedList.equals(obtainedList), "Status is sorted in reverse alphabetical order", "Status is not sorted in reverse Alphabetical order");

    }

    public void validateTableScreen() {
        getReusableActions().isElementVisible(tablePresent, 10);
        reporter.softAssert(getReusableActions().isElementVisible(tablePresent), "Submitted By Sorted in Reverse Alphabetical order", "  Reverse Alphabetically Sorted table not present");
        /*String[] ex = {"testing care", ""};
        List<WebElement> columnsubmitby = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[5]"));
        System.out.println("Number of elements:" + columnsubmitby.size());
        int listsize = columnsubmitby.size();
        int lastrecord = listsize-1;
        reporter.softAssert((ex[0]),columnsubmitby.get(0).getText(),"Reverse Alphabetically sorted","Not reverse alphabetically sorted");
        reporter.softAssert((ex[1]),columnsubmitby.get(lastrecord).getText()," Reverse Alphabetically sorted","Not reverse alphabetically sorted");
      */

        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[5]"));
        System.out.println("Number of elements:" + columnstatus.size());
        ArrayList<String> obtainedList = new ArrayList<>();

        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        reporter.softAssert(sortedList.equals(obtainedList), "Submitted-By is sorted in reverse alphabetical order", "Submitted By is not sorted in reverse Alphabetical order");


    }
    public void clickOnRefreshButton() throws AWTException {
        Robot robot = new Robot();
        // getReusableActions().clickWhenReady(locationButton,10);
        robot.delay(4000);
        robot.keyPress(KeyEvent.VK_F5);
        robot.delay(2000);
        reporter.reportLogWithScreenshot(" Screen Refresh F5 ");
        robot.keyPress(KeyEvent.VK_ENTER);
    }

    public void validateDefaultStateSubmitByOrder() {

        getReusableActions().isElementVisible(tablePresent, 10);
        reporter.softAssert(getReusableActions().isElementVisible(tablePresent), "Submitted By column is arranged in default state", "Submitted By is not arranged in default state");
        reporter.reportLogWithScreenshot("Default Content of Submitted- By column is displayed");

        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[5]"));
        System.out.println("Number of elements:" + columnstatus.size());

        ArrayList<String> obtainedList = new ArrayList<>();

        for (WebElement we : columnstatus) {
            obtainedList.add(we.getText());
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList) {
            sortedList.add(s);
        }

        reporter.softAssert(sortedList.equals(obtainedList), "Submitted-By is sorted in reverse alphabetical order", "Submitted By is not sorted in reverse Alphabetical order");
    }

    public void clickOnSortBySubmittedOnDateButton() {
        getReusableActions().javascriptScrollByVisibleElement(submittedOnDateButton);
        getReusableActions().isElementVisible(submittedOnDateButton);

        getReusableActions().staticWait(4000);
        submittedOnDateButton.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Submitted On Sorted from Old to New Order");

        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[2]"));
        System.out.println("Number of elements:" + columnstatus.size());

        for (int i = 0; i < columnstatus.size(); i++) {
            System.out.println(columnstatus.get(i).getText());
        }
        List<Date> obtainedList = new ArrayList<Date>();

        String date;
        for (WebElement we : columnstatus) {
            date = we.getText();

            int Date = Integer.parseInt(date.replaceAll("\\D.*", ""));
            SimpleDateFormat dateFormatter
                    = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
            Date Date1 = null;
            try {
                Date1 = dateFormatter.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            obtainedList.add(Date1);
        }
        ArrayList<Date> sortedList = new ArrayList<>();

        for (Date s : obtainedList) {
            sortedList.add(s);
        }

        Collections.sort(sortedList, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
        Collections.sort(sortedList);

        reporter.softAssert(sortedList.equals(sortedList), "Submitted On is sorted in order", "Submitted On is not sorted in order");
        getReusableActions().staticWait(3000);
        submittedOnDateButton.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Submitted On Sorted from New to old order");
    }

    public void clickOnSubmittedOnColumn() {
        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[2]"));
        System.out.println("Number of elements:" + columnstatus.size());

        for (int i = 0; i < columnstatus.size(); i++) {
            System.out.println(columnstatus.get(i).getText());
        }

    }

    public void validateTableScreenSubmittedOn() {
        getReusableActions().isElementVisible(tablePresent, 10);
        reporter.softAssert(getReusableActions().isElementVisible(tablePresent), "Submitted On Sorted in Reverse order", "  Reverse Sorted table not present");

        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[2]"));
        System.out.println("Number of elements:" + columnstatus.size());

        List<Date> obtainedList = new ArrayList<Date>();

        String date;
        for (WebElement we : columnstatus) {
            date = we.getText();

            int Date = Integer.parseInt(date.replaceAll("\\D.*", ""));
            SimpleDateFormat dateFormatter
                    = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
            Date Date1 = null;
            try {
                Date1 = dateFormatter.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            obtainedList.add(Date1);
        }
        ArrayList<Date> sortedList = new ArrayList<>();

        for (Date s : obtainedList) {
            sortedList.add(s);
        }

        Collections.sort(sortedList, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        reporter.softAssert(sortedList.equals(sortedList), "Submitted On is sorted in reverse order", "Submitted On is not sorted in reverse order");

    }

    public void clickOnSortByLastUpdatedOnDateButton() {
        getReusableActions().javascriptScrollByVisibleElement(lastUpdatedOnDateButton);
        getReusableActions().isElementVisible(lastUpdatedOnDateButton);

        getReusableActions().staticWait(3000);
        lastUpdatedOnDateButton.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Last Updated On Sorted from Old to New Order");

        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[3]"));
        System.out.println("Number of elements:" + columnstatus.size());

        for (int i = 0; i < columnstatus.size(); i++) {
            System.out.println(columnstatus.get(i).getText());
        }
        List<Date> obtainedList = new ArrayList<Date>();

        String date;
        for (WebElement we : columnstatus) {
            date = we.getText();

            int Date = Integer.parseInt(date.replaceAll("\\D.*", ""));
            SimpleDateFormat dateFormatter
                    = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
            Date Date1 = null;
            try {
                Date1 = dateFormatter.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            obtainedList.add(Date1);
        }
        ArrayList<Date> sortedList = new ArrayList<>();

        for (Date s : obtainedList) {
            sortedList.add(s);
        }

        Collections.sort(sortedList, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
        Collections.sort(sortedList);

        reporter.softAssert(obtainedList.equals(sortedList), "Last Updated On is sorted in order", "Last Updated On is not sorted in order");
        getReusableActions().staticWait(3000);
        lastUpdatedOnDateButton.click();
        getReusableActions().staticWait(3000);
        reporter.reportLogWithScreenshot("Last Updated Sorted from New to old order");
    }

    public void clickOnLastUpdatedOnColumn() {
        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[3]"));
        System.out.println("Number of elements:" + columnstatus.size());

        for (int i = 0; i < columnstatus.size(); i++) {
            System.out.println(columnstatus.get(i).getText());
        }
    }

    public void validateTableScreenLastUpdatedOn() {
        getReusableActions().isElementVisible(tablePresent, 10);
        reporter.softAssert(getReusableActions().isElementVisible(tablePresent), "Last Updated On Sorted in Reverse order", "  Reverse Sorted table not present");

        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//table[@role='grid']/tbody/tr/td[3]"));
        System.out.println("Number of elements:" + columnstatus.size());

        List<Date> obtainedList = new ArrayList<Date>();

        String date;
        for (WebElement we : columnstatus) {
            date = we.getText();

            int Date = Integer.parseInt(date.replaceAll("\\D.*", ""));
            SimpleDateFormat dateFormatter
                    = new SimpleDateFormat("yyyy/MM/dd,HH:mm:ss");
            Date Date1 = null;
            try {
                Date1 = dateFormatter.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            obtainedList.add(Date1);
        }
        ArrayList<Date> sortedList = new ArrayList<>();

        for (Date s : obtainedList) {
            sortedList.add(s);
        }

        Collections.sort(sortedList, new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        reporter.softAssert(sortedList.equals(obtainedList), "Submitted On is sorted in reverse order", "Submitted On is not sorted in reverse order");
    }

    public void goTOPaymentHistory() {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", historyReports);
        getReusableActions().clickWhenReady(historyReports, 10);
        historyReports.click();
        //when opened a new tab, added code to switch to new tab

        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(1));
        historyReportsBanner.isDisplayed();
    }

    public void clickOnMPIN() {
        getReusableActions().staticWait(1000);
        scrollToMiddleOfElement(managePIN);
        getReusableActions().staticWait(500);
        //reporter.softAssert(managePIN.isDisplayed(), "manage pin display", "manage pin not display");
        reporterSnapshot(managePIN, "Manage PIN", "", "display");
        getReusableActions().clickWhenReady(managePIN, 10);
        getReusableActions().staticWait(3000);
    }

    public void setNewPin(String pin) {
        getReusableActions().javascriptScrollByVisibleElement(newPINField);
        newPINField.click();
        newPINField.sendKeys(pin);
        getReusableActions().staticWait(2000);
        confirmPINField.click();
        confirmPINField.sendKeys(pin);
        //reporter.reportLogWithScreenshot("pin is confirm");
        reporterSnapshot(newPINField, "PIN Confirm", "", "NULL");
    }

    public void clickOnSubmitButton() {
        //getReusableActions().javascriptScrollByVisibleElement(mPinSubmitButton);
        //reporter.softAssert(mPinSubmitButton.isEnabled(), "submit button is enabled", "submit button not enabled");
        mPinSubmitButton.click();

    }

    public void validateSuccessModel() {
        getReusableActions().staticWait(6000);
        getReusableActions().executeJavaScript("document.body.style.zoom='70%'");
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(successMessage);
        reporterSnapshot(successMessage, "Success Message", "", "display");
    }

    public void validateErrorMessageInputFields() {
        getReusableActions().javascriptScrollByVisibleElement(errorMessageNewPin);
        //reporter.softAssert(errorMessageNewPin.getText().equals("A value is required"),errorMessageNewPin.getText(),"error message not display");
        //reporter.softAssert(errorMessageConfirmPin.getText().equals("A value is required"),errorMessageConfirmPin.getText(),"error message not display");
        reporterSnapshot(errorMessageNewPin, "Error! Enter a 4-digit PIN.", "", "gen");
        reporterSnapshot(errorMessageConfirmPin, "Error! Enter a 4-digit PIN.", "", "gen");

    }

    public void validateErrorMessageForInputNotMatch(String pin1, String pin2) {
        newPINField.click();
        newPINField.sendKeys(pin1);
        getReusableActions().staticWait(2000);
        confirmPINField.click();
        confirmPINField.sendKeys(pin2);
        mPinSubmitButton.click();
        //reporter.softAssert(errorMessageMismatch.getText().equals("PIN numbers do not match"),errorMessageMismatch.getText(),"error message not display");
        reporterSnapshot(errorMessageMismatch, "t match, try again.", "", "common");
    }

    public void validateEyeIconWithOutCrossMarks(String pin) {
        getReusableActions().javascriptScrollByVisibleElement(newPINField);
        getReusableActions().staticWait(2000);
        newPINField.click();
        newPINField.sendKeys(pin);
        getReusableActions().staticWait(2000);
        confirmPINField.click();
        confirmPINField.sendKeys(pin);
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(firstEyeIcon, 10);
        //reporter.softAssert(firstEyeIcon1.isDisplayed(),"first eye-icon without cross","first icon with cross");
        reporterSnapshot(firstEyeIcon1, "PIN Eye icon", "", "display");
        //reporter.softAssert(newPINField.getAttribute("value").equals(pin),"New pin is visible","New pin is not visible");
        reporterSnapshot(newPINField, pin, "", "value");
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(secondEyeIcon, 10);
        //reporter.softAssert(confirmPINField.getAttribute("value").equals(pin),"Confirm pin is visible","Confirm pin is not visible");
        reporterSnapshot(secondEyeIcon1, "Confirm PIN Eye icon", "", "display");
        reporterSnapshot(confirmPINField, pin, "", "value");
        //getReusableActions().staticWait(2000);
        //reporter.softAssert(secondEyeIcon1.isDisplayed(),"second eye-icon without cross","second icon with cross");
    }

    public void clickGoToAccount() {
        getReusableActions().staticWait(4000);
        reporterSnapshot(cardSavedSuccess, "Card saved successfully", "", "common");
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(goToAccountButton, 10);
        getReusableActions().staticWait(2000);
        getDriver().navigate().refresh();
        //goToAccountButton.click();
        getReusableActions().staticWait(5000);
    }

    public void validateAccountManagementPinPage() {
        getReusableActions().staticWait(2000);
        reporter.softAssert(getDriver().getCurrentUrl().equals("https://chatr-qa-auto.qa01.eks.rogers.com/account"), "account page display", "account page not display");
        getReusableActions().javascriptScrollByVisibleElement(managePIN);
        reporter.softAssert(managePIN.isDisplayed(), "manage pin link show", "manage pin link not show");
    }

    public void validateErrorForLessThanFourDigit(String pin1, String pin2) {
        getReusableActions().javascriptScrollByVisibleElement(newPINField);
        newPINField.click();
        newPINField.sendKeys(pin1);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(fourDigitErrorMessage1.getText().equals("PIN number has to have 4 digits"),fourDigitErrorMessage1.getText(),"error message not show");
        confirmPINField.click();
        confirmPINField.sendKeys(pin2);
        getReusableActions().staticWait(2000);
        //reporter.softAssert(fourDigitErrorMessage1.getText().equals("PIN number has to have 4 digits"),fourDigitErrorMessage1.getText(),"error message not show");
        reporterSnapshot(fourDigitErrorMessage1, "Error! PIN must contain exactly 4 digits. Try again.", "", "GEN");
        reporterSnapshot(fourDigitErrorMessage2, "Error! PIN must contain exactly 4 digits. Try again.", "", "GEN");
    }

    public void validateAccountBalanceDetails() {
        getReusableActions().javascriptScrollByVisibleElement(accountBalanceText);
        //reporter.softAssert(accountBalanceText.isDisplayed()
        //                && accountHistoryLink.isDisplayed()
        //                && accountBalanceValue.getText().matches("^\\$[0-9]+\\.[0-9][0-9]"),
        //        "Balance Details are valid", "Balance Details are invalid");
        reporterSnapshot(accountBalanceText, "account Balance Text", "", "Display");
        reporterSnapshot(accountHistoryLink, "account History Link", "", "Display");
        reporterSnapshot(accountBalanceValue, "account Balance value", "^\\$[0-9]+\\.[0-9][0-9]", "MATCHES");
    }

    public void validateAccountStatusDetails(String Status) {
        getReusableActions().javascriptScrollByVisibleElement(accountStatusText);
        //reporter.softAssert(accountStatusText.isDisplayed()
        //        && accountDetailsLink.isDisplayed()
        //        && (accountStatusValue.getText().equals("Active") || accountStatusValue.getText().equals("Expired"
        //)), "Account Status details are valid", "Account Status details are invalid");
        reporterSnapshot(accountStatusText, "account Status Text", "", "Display");
        reporterSnapshot(accountDetailsLink, "account Details Link", "", "Display");
        reporterSnapshot(accountStatusValue, Status, "", "Gen");
    }

    public void validateAnniversaryDetails() {
        //reporter.softAssert(anniversaryDateText.isDisplayed()
        //        && anniversaryText.getText().equals("Make sure you have enough balance on your account prior to this date.")
        //        && anniversaryDateValue.getText().matches("(January|February|March|April|May|June|July|August|September" +
        //        "|October|November|December) [0-9]*[0-9]"), "Anniversary Details are valid", "Anniversary Details are Invalid");
        reporterSnapshot(anniversaryDateText, "anniversary Date Text", "", "Display");
        reporterSnapshot(anniversaryText, "Make sure you have enough balance on your account prior to this date.", "", "Display");
        reporterSnapshot(anniversaryDateValue, "anniversary Date Value", "(January|February|March|April|May|June|July|August|September|October|November|December)" +
                " [0-9]*[0-9]", "MATCHES");
        getReusableActions().staticWait(3000);
    }

    public void validateMyChatrOnDashBoard() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(myChatrButton);
        reporterSnapshot(myChatrButton, "My Chatr Button", "", "display");
    }

    public void validateAutoPayBlock() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(autoPayBlock);
        //reporter.softAssert(autoPayBlock.isDisplayed(),autoPayBlock.getText(),"autoPay block not display");
        reporterSnapshot(autoPayBlock, autoPayBlock.getText(), "", "Gen");
    }

    public void selectProfileTab(String options) {
        switch (options) {
            case "My chatr":
                getReusableActions().clickWhenReady(myChatr, 10);
                myChatr.click();
                break;
            case "current plan":
                getReusableActions().clickWhenReady(currentPlanCTA, 10);
                currentPlanCTA.click();
                break;
            case "profile cta":
                getReusableActions().staticWait(2000);
                //getReusableActions().clickWhenReady(profileCTA, 10);
                profileCTA.click();
                break;
        }
    }

    public void clickOnCurrentPlan() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(currentPlanButton);
        getReusableActions().isElementVisible(currentPlanButton);
        currentPlanButton.click();
        getReusableActions().staticWait(3000);
    }

    public void clickOnchangePlan() {
        getReusableActions().staticWait(4000);
        List<WebElement> columnStatus = getDriver().findElements(By.xpath("//ds-icon[@name='exclamation-triangle']"));
        int tempActualCnt = columnStatus.size();
        if (tempActualCnt > 1) {
            for (int i = 0; i < 4; i++) {
                Robot r = null;
                try {
                    r = new Robot();
                    r.keyPress(KeyEvent.VK_CONTROL);
                    r.keyPress(KeyEvent.VK_R);
                    r.delay(100);
                    r.keyPress(KeyEvent.VK_ENTER);
                    getReusableActions().staticWait(1000);
                    r.keyRelease(KeyEvent.VK_CONTROL);
                    r.keyRelease(KeyEvent.VK_R);
                    r.keyRelease(KeyEvent.VK_ENTER);
                } catch (AWTException e) {
                    throw new RuntimeException(e);
                }

                getReusableActions().staticWait(5000);
                List<WebElement> columnStatus1 = getDriver().findElements(By.xpath("//ds-icon[@name='exclamation-triangle']"));
                int tempActualCnt1 = columnStatus1.size();
                if (tempActualCnt1 <= 0) {
                    currentPlanButton.click();
                    getReusableActions().staticWait(2000);
                    break;
                }
            }
        }
        scrollToMiddleOfElement(changePlanButton);
        getReusableActions().staticWait(1000);
        reporterSnapshot(changePlanButton, "change Plan", "", "NULL");
        changePlanButton.click();
        getReusableActions().staticWait(5000);
    }

    public void clickOnchangePlanRetail() {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(ppcButtonRetail);
        ppcButtonRetail.click();
        getReusableActions().staticWait(3000);
        reporterSnapshot(ppcButtonRetail, "PPC", "", "NULL");
    }

    public void clickOnRefreshPage() throws AWTException {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_R);
        r.delay(100);
        r.keyPress(KeyEvent.VK_ENTER);
    }

    public void validateProfileInformation(String firstname, String lastname) {
        reporter.softAssert(firstNameProfile.getText().equals(firstname), "Firstname on profile page : " + firstNameProfile.getText(), "firstname on profile not same");
        reporter.softAssert(lastNameProfile.getText().equals(lastname), "Lastname on profile page : " + lastNameProfile.getText(), "lastname on profile not same");
    }

    public void validatePlanUsageSummery() {
        getReusableActions().staticWait(4000);
        getReusableActions().executeJavaScript("document.body.style.zoom='70%'");
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(addOnsBlock);
        reporterSnapshot(dataUsage, "data Usage", "", "display");
        reporterSnapshot(talkUsage, "talk Usage", "", "display");
        reporterSnapshot(textUsage, "text Usage", "", "display");
    }

    public void validateAddOnsBlock() {
        getReusableActions().staticWait(4000);
        getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(myChatrButton);
        reporterSnapshot(addonBlockInDashBoard, "One Time Add-on", "", "Display");
    }

    public void clickOnAssignAutopayLink() {
        getReusableActions().javascriptScrollByVisibleElement(assignAutopay);
        getReusableActions().staticWait(1000);
        //reporter.softAssert(assignAutopay.isDisplayed(),"autopay links visible","autopay links not visible");
        reporterSnapshot(assignAutopay, "assign Auto pay", "", "display");
        assignAutopay.click();
    }

    public void clickOnCheckBoxForAutopay() {
        checkboxAutopay.click();
        getReusableActions().staticWait(2000);
    }

    public void clickOnYesOptionOnAutopay() {
        getReusableActions().staticWait(2000);
        //reporter.softAssert(yesButtonOption.isEnabled(),"yes option is enabled","yes option is disable");
        reporterSnapshot(yesButtonOption, "yes Button Option", "", "enable");
        yesButtonOption.click();
        getReusableActions().staticWait(5000);
    }

    public String getFirstSaveCC() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(firstSaveCard);
        //reporter.softAssert(firstSaveCard.isDisplayed(),"Before swap CC :"+firstSaveCard.getText().substring(15),"credit card not display");
        reporterSnapshot(firstSaveCard, firstSaveCard.getText().substring(15), "", "display");
        String getFirstCC = firstSaveCard.getText().substring(15);
        return getFirstCC;
    }

    public void validateSaveCCSwap(String saveCC) {
        getReusableActions().staticWait(2000);
        scrollToMiddleOfElement(firstSaveCard);
        String AfterswapCC = firstSaveCard.getText().substring(15);
        //reporter.softAssert(!AfterswapCC.equals(saveCC),"After save CC :"+AfterswapCC,"Credit card not swap");
        reporterSnapshot(firstSaveCard, AfterswapCC, saveCC, "NOTMATCH");
    }

    public void clickOnEditButton() {
        getReusableActions().javascriptScrollByVisibleElement(mPinEditButton);
        //getReusableActions().javascriptScrollByVisibleElement(mPinSubmitButton);
        //reporter.softAssert(mPinSubmitButton.isEnabled(), "submit button is enabled", "submit button not enabled");
        mPinEditButton.click();
        getReusableActions().staticWait(1000);
        reporterSnapshot(addressInput, "Edit Account Info Details", "", "NULL");
    }

    public void clickOnManageAcctPINLink() {
        getReusableActions().javascriptScrollByVisibleElement(mPinManageAcctPINLink);
        mPinManageAcctPINLink.click();
        getReusableActions().staticWait(1000);
        reporterSnapshot(addressInput, "Manage Account Link", "", "NULL");
    }

    public void clickManageBtn() {
        getReusableActions().staticWait(3000);
        if (getDriver().findElements(By.xpath("//span[contains(text(),'Manage add-ons')]")).size() == 0) {
           // getReusableActions().javascriptScrollByVisibleElement(getAddOn);
            scrollToMiddleOfElement(getAddOn);
            getReusableActions().staticWait(1000);
            reporterSnapshot(getAddOn, "Get Add-On", "", "NULL");
            getReusableActions().clickWhenReady(getAddOn, 10);
        } else {
           // getReusableActions().javascriptScrollByVisibleElement(manageAddOn);
            scrollToMiddleOfElement(manageAddOn);
            getReusableActions().staticWait(1000);
            reporterSnapshot(getAddOn, "Manage Add-On", "", "NULL");
            getReusableActions().clickWhenReady(manageAddOn, 10);
        }
    }

    public void validateEligibleAddOn() {
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollByVisibleElement(eligibleAddons);
        //reporter.softAssert(eligibleAddons.isDisplayed(),"Eligible  addons are displayed","Eligible  addons are not displayed");
        reporterSnapshot(eligibleAddons, "Eligible Add-On", "", "display");
    }

    public void validateCurrentAddOn() {
        getReusableActions().javascriptScrollByVisibleElement(activeAddons);
        //reporter.softAssert(activeAddons.isDisplayed(),"Currently active addons are displayed","Currently active addons are not displayed");
        reporterSnapshot(activeAddons, "Active Add-On", "", "display");
    }

    public void clickTopUpCTA() {
        getReusableActions().clickWhenReady(topUpCTA, 10);
        getReusableActions().staticWait(1000);
    }

    public void clickTopUpFooterCTA() {
        getReusableActions().javascriptScrollByVisibleElement(topUpFooter);
        getReusableActions().clickWhenReady(topUpFooter, 10);
        getReusableActions().staticWait(1000);
    }

    public void validateOrderExceeds300Error() {
        String balanceText = balance$.getText().substring(1);
        System.out.println(balanceText);
        clickTopUpCTA();
        creditCardRadioBtn.click();
        //topUpAmtField.sendKeys(balanceText);
        topUpAmtField.sendKeys("301");
        getReusableActions().staticWait(3000);
        //getReusableActions().javascriptScrollByVisibleElement(errorExceeds300$);
        System.out.println(errorExceeds300$.getText());
        reporter.softAssert(errorExceeds300$.isDisplayed(), "expected error is displayed", "expected error is not displayed");
    }

    public void clickSelectAddOnLink() {
        getReusableActions().clickWhenReady(selectAddOnLink, 10);
    }

    public void validateWindow(String urlParam) {
        getReusableActions().staticWait(3000);
        reporter.softAssert(getDriver().getCurrentUrl().contains(urlParam), urlParam + " is displayed", urlParam + " is not displayed");
    }

    public void validateAddOnCheckbox() {
        if (!addOnCheckbox.isSelected()) {
            getReusableActions().staticWait(2000);
            getReusableActions().javascriptScrollByVisibleElement(addOnCheckbox);
            //reporter.reportLogWithScreenshot("addOn checkbox is not selected");
            reporterSnapshot(addOnCheckbox, "Add on", "", "select");
        } else {
            reporter.reportLogWithScreenshot("addOn checkbox is selected");

        }
    }

    public void clickAddOnCheckbox() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(addOnCheckbox);
        getReusableActions().clickWhenReady(addOnCheckbox, 3);
        reporterSnapshot(addOnCheckbox, "Add-On", "", "NULL");
        getReusableActions().staticWait(6000);
    }

    public void validateOrderSummary(String passCondition) {
        getReusableActions().staticWait(6000);
        if (passCondition.equalsIgnoreCase("empty")) {
            getReusableActions().javascriptScrollByVisibleElement(addOnCheckbox);
            //reporterSnapshot(addOnCheckbox,"Add On","","NULL");
            reporterSnapshot(continueBtnMAO, "Continue", "", "NOTENABLE");
            getReusableActions().staticWait(2000);
            getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
            getReusableActions().staticWait(4000);
            getReusableActions().javascriptScrollByVisibleElement(orderSummary);
            getReusableActions().staticWait(2000);
            reporterSnapshot(cardEmpty, "Add-on Not Added In Order Summary", "", "display");
            getReusableActions().staticWait(2000);
            getReusableActions().executeJavaScript("document.body.style.zoom='100%'");
            getReusableActions().staticWait(4000);
        } else {
            getReusableActions().javascriptScrollByVisibleElement(addOnCheckbox);
            //reporterSnapshot(addOnCheckbox,"Add On","","NULL");
            reporterSnapshot(continueBtnMAO, "Continue", "", "ENABLE");
            getReusableActions().javascriptScrollByVisibleElement(orderSummary);
            reporterSnapshot(totalDueToday, "Add-on Added In Order Summary", "", "display");
        }

    }

    public void validateMAOBtn_inflight_Order() {
        //getReusableActions().javascriptScrollByVisibleElement(inFlightMsg);
        //reporter.softAssert(!manageAddOn.isEnabled(),"MAO Btn is disabled","MAO Btn is not disabled");
        scrollToMiddleOfElement(inFlightMsg);
        reporterSnapshot(inFlightMsg, "An order is currently being processed", "", "common");
    }

    public void validateMAOBtn_Expired_Account() {
        getReusableActions().javascriptScrollByVisibleElement(inFlightMsg);
        //reporter.softAssert(!selectAddOnLink.isEnabled(),"selectAddOn Btn is disabled","selectAddOn Btn is not disabled");
        reporterSnapshot(inFlightMsg, "currently being processed", "", "common");
    }

    public void validateMAOBtn_inprogress_Order() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(manageAddOnHeading);
        reporterSnapshot(manageAddOnHeading, "Manage add-On", "", "display");
        getReusableActions().javascriptScrollByVisibleElement(continueBtnMAO);
        reporterSnapshot(continueBtnMAO, "Continue", "", "NOTENABLE");
        //reporter.softAssert(!manageAddOn.isEnabled(),"MAO Btn is disabled","MAO Btn is not disabled");
        //reporter.softAssert(!selectAddOnLink.isEnabled(),"selectAddOn Btn is disabled","selectAddOn Btn is not disabled");
    }

    public void validate_TnC_not_Checked() {
        getReusableActions().javascriptScrollByVisibleElement(MAOTnCcheckbox1);
        reporter.softAssert(!MAOTnCcheckbox1.isSelected(), "MAO checkbox is not selected", "MAO Btn is selected");
        getReusableActions().javascriptScrollByVisibleElement(MAOcheckbox_error);
        reporter.softAssert(MAOcheckbox_error.isDisplayed(), "checkbox unchecked error is displayed", "checkbox unchecked error is not displayed");
    }

    public void validate_quick_link_Edit() {
        getReusableActions().javascriptScrollByVisibleElement(editBtn_NewAddon);
        reporter.softAssert(editBtn_NewAddon.isEnabled(), "Edit New Addon Btn is enabled", "EditNew Addon Btn is not enabled");
        getReusableActions().clickWhenReady(editBtn_NewAddon);
        getReusableActions().staticWait(2000);
        validateWindow("manage-add-ons");
    }

    public void clickContinueBtn_MAO() {
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollByVisibleElement(continueBtnMAO);
        //continueBtnMAO.click();
        getReusableActions().executeJavaScriptClick(continueBtnMAO);
    }

    public void clickContinueBtn() {
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollByVisibleElement(continueBtn);
        continueBtn.click();
        getReusableActions().staticWait(3000);
        reporterSnapshot(continueBtn, "continue", "", "NULL");
    }

    public void clickSignOut() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(signOutBtn);
        signOutBtn.click();
        getReusableActions().staticWait(5000);
        reporterSnapshot(signOutBtn, "Sign Out", "", "NULL");
    }

    public void clickCreditCardRadioBtn(String option) {
        getReusableActions().staticWait(3000);
        if (showTopUpOptions.size() > 0) {
            showTopUpOptions.get(0).click();
        }
        getReusableActions().javascriptScrollToMiddleOfPage();
        //getReusableActions().javascriptScrollByVisibleElement(radioButtonCreditCard);
        if (option.contains("Credit")) {
            getReusableActions().isElementVisible(radioButtonCreditCard);
            getReusableActions().javascriptScrollByVisibleElement(radioButtonCreditCard);
            radioButtonCreditCard.click();
        } else {
            getReusableActions().isElementVisible(radioButtonVoucher);
            getReusableActions().javascriptScrollByVisibleElement(radioButtonVoucher);
            radioButtonVoucher.click();
        }

    }

    public void validateOrderReviewPageMAO() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(h3PaymentDetailsMAO);
        reporterSnapshot(h1OrderSummaryCartMAO, "Order Summary Cart", "", "display");
        getReusableActions().javascriptScrollByVisibleElement(h1OrderReviewPageMAO);
        reporterSnapshot(h1OrderReviewPageMAO, "Review", "", "display");
        reporterSnapshot(h1AnniversaryDateMAO, "Anniversary Date", "", "display");
        getReusableActions().javascriptScrollByVisibleElement(h2OrderReviewPageMAO);
        reporterSnapshot(h2OrderReviewPageMAO, "New add-on section", "", "display");
        reporterSnapshot(h2EditBtnMAO, "Add-On Edit", "", "display");
        reporterSnapshot(h2OverAllFrameMAO, "New Add-On Details", "", "display");
        getReusableActions().javascriptScrollByVisibleElement(h3PaymentDetailsMAO);
        reporterSnapshot(h3PaymentDetailsMAO, "Payment Details", "", "display");
        reporterSnapshot(paymentEditBtnMAO, "payment Edit", "", "display");
        //reporterSnapshot(h3AccountBalanceMAO,"Account Balance","","display");
        reporterSnapshot(h3TopupDetailsMAO, "Top-Up Details", "", "display");
        reporterSnapshot(h3TopupMethodMAO, "chatr top-up card", "", "common");
        //reporter.softAssert(listAddressElements.size()==0,"VALID FIELD - \"" + "ADDRESS DETAILS" + "\" ARE NOT DISPLAYED SUCCESSFULLY","INVALID : FIELD - \"" + "ADDRESS DETAILS" + "\" ARE DISPLAYED SUCCESSFULLY");
    }

    public void validateOrderReviewPageCCMAO() {
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollByVisibleElement(h1OrderReviewPageMAO);
        reporterSnapshot(h1OrderReviewPageMAO, "Review", "", "display");
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        reporterSnapshot(orderSummary, "Order Summary Cart", "", "display");
        reporterSnapshot(h1AnniversaryDateMAO, "Anniversary Date", "", "display");
        getReusableActions().javascriptScrollByVisibleElement(h2OrderReviewPageMAO);
        reporterSnapshot(h2OrderReviewPageMAO, "New add-on section", "", "display");
        reporterSnapshot(h2EditBtnMAO, "Add-On Edit", "", "display");
        reporterSnapshot(h2OverAllFrameMAO, "New Add-On Details", "", "display");
        getReusableActions().javascriptScrollByVisibleElement(h3PaymentDetailsMAO);
        reporterSnapshot(h3PaymentDetailsMAO, "Payment Details", "", "display");
        reporterSnapshot(paymentEditBtnMAO, "payment Edit", "", "display");
        //reporterSnapshot(h3AccountBalanceMAO,"Account Balance","","display");
        //reporterSnapshot(h3PaymentDetailsMAO, "Payment Details", "", "display");
        //reporterSnapshot(h3TopupMethodMAO,"chatr top-up card","","Gen");
        reporter.softAssert(listAddressElements.size() == 0, "VALID FIELD - \"" + "ADDRESS DETAILS" + "\" ARE NOT DISPLAYED SUCCESSFULLY", "INVALID : FIELD - \"" + "ADDRESS DETAILS" + "\" ARE DISPLAYED SUCCESSFULLY");
    }

    public void clickOnUseOtherCard() {
        //getReusableActions().clickWhenReady(continueBtnMAO,3);
        getReusableActions().staticWait(2000);
        useOtherCard.click();
    }

    public void clickOnChatrTOpUpRadioBtn() {
        //getReusableActions().clickWhenReady(continueBtnMAO,3);
        getReusableActions().staticWait(2000);
        chatrTopUpRadioBtn.click();
    }

    public void validateTopUpWithoutPin() {
        getReusableActions().staticWait(2000);
        /*getReusableActions().javascriptScrollByVisibleElement(topUpWithoutPinError);*/
        scrollToMiddleOfElement(topUpWithoutPinError);
        reporterSnapshot(topUpWithoutPinError, "top-up card pin", "", "common");
    }

    public void validateAddOnAmountWithCart() {
        getReusableActions().javascriptScrollByVisibleElement(addOnAmountInDollars);
        reporter.reportLogWithScreenshot("addOnAmountInDollars");
        System.out.println(addOnAmountInDollars.getText() + ".00");
        getReusableActions().javascriptScrollByVisibleElement(accountBalUsedInDollars);
        reporter.reportLogWithScreenshot("accountBalUsedInDollars");
        System.out.println(accountBalUsedInDollars.getText().replace("$", "").substring(0, 1));
        reporter.softAssert((addOnAmountInDollars.getText()).contentEquals(accountBalUsedInDollars.getText().replace("$", "").split(".")[0]), "Add On amount and Account balance amount matches", "Add On amount and Account balance amount doesnt match");
    }

    public void clickOnChangePlanBtn() {
        //getReusableActions().clickWhenReady(continueBtnMAO,3);
        getReusableActions().javascriptScrollToMiddleOfPage();
        getReusableActions().staticWait(5000);
        changePlanBtn.click();
    }

    public void clickOnPlanProceedBtn() {
        //getReusableActions().clickWhenReady(continueBtnMAO,3);
        getReusableActions().staticWait(2000);
        planProceedBtn.click();
    }

    public void clickOnAutopayConsentCheckbox() {
        //getReusableActions().clickWhenReady(continueBtnMAO,3);
        getReusableActions().staticWait(2000);
        MAOTnCcheckbox1.click();
    }

    public void selectOrderReviewCheckboxes() {
        //getReusableActions().clickWhenReady(continueBtnMAO,3);
        getReusableActions().staticWait(2000);
        MAOTnCcheckbox1.click();
        getReusableActions().staticWait(2000);
        MAOTnCcheckbox2.click();
        getReusableActions().staticWait(2000);
    }

    public void clickOnSaveSummary() {
        getReusableActions().staticWait(2000);
        saveSummaryButton.click();
        getReusableActions().staticWait(2000);
        getReporter().reportLogWithScreenshot("Summary Description Saved ");
    }

    public void validatePPEOrderReview() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(orderNum);
        getReporter().softAssert(orderNum.isDisplayed(), "Order Number is displayed", "Order Number is not displayed");
        getReusableActions().javascriptScrollByVisibleElement(orderCreatedDate);
        getReporter().softAssert(orderCreatedDate.isDisplayed(), "Order Created is displayed", "Order Created is not displayed");
        getReusableActions().javascriptScrollByVisibleElement(placeOfContract);
        getReporter().softAssert(placeOfContract.isDisplayed(), "Place Of Contract is displayed", "Place Of Contract is not displayed");
    }

 /*   public void enterValidTopUpVoucher(String voucherPin) {
        String[] strArray = voucherPin.split(";");
        System.out.println(strArray.length);
        for (int i = 0; i <= strArray.length - 1; i++) {
            System.out.println(strArray[i]);
            voucherPin = strArray[i];
            System.out.println("voucherPin - "+ voucherPin);
            int cnt = getDriver().findElements(By.xpath("//input[contains(@type,'tel')]")).size();
            String locator = "(//input[contains(@type,'tel')])[%s]";
            locator = String.format(locator,cnt);
            WebElement topUpCardField= getDriver().findElement(By.xpath(locator));
            if (i == 0){
                WebDriverWait wait = new WebDriverWait(getDriver(), 3);
                //wait.until(ExpectedConditions.elementToBeClickable(topUpCardField));
                wait.until(ExpectedConditions.elementToBeClickable(topUpCardField));
                topUpCardField.clear();
                topUpCardField.sendKeys(voucherPin);
                getReusableActions().staticWait(4000);
            }
            if (getDriver().findElements(By.xpath("//ds-error//span[@role='img']")).size() > 0) {
                topUpCardField.clear();
                topUpCardField.sendKeys(voucherPin);
                getReusableActions().staticWait(4000);
            } else
                break;
        }
        reporterSnapshot(topUpCardField, voucherPin, "", "NULL");
    }*/

    public void enterTopUpMAO(String topup) {
        getReusableActions().staticWait(1000);
        getReusableActions().javascriptScrollByVisibleElement(topUpAmtFieldMAO);
        topUpAmtFieldMAO.clear();
        topUpAmtFieldMAO.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        topUpAmtFieldMAO.clear();
        topUpAmtFieldMAO.click();
        topUpAmtFieldMAO.sendKeys(topup);
        reporterSnapshot(topUpAmtFieldMAO, topup, "", "NULL");
        ;
    }

    public void validateTopUpAmtMAO(String topup) {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(topUpAmtFieldMAO);
        reporterSnapshot(topUpAmtFieldMAO, topup, "", "Gen");
    }

    public void validateTopUpExtraAmtMAO(String topup) {
        getReusableActions().staticWait(3000);
        WebElement orderSummaryExtraAmt = getDriver().findElement(By.xpath("//span[normalize-space()='$" + topup + ".00']"));
        getReusableActions().javascriptScrollByVisibleElement(orderSummaryExtraAmt);
        String expTopUp = "$"+topup+".00";
        reporterSnapshot(orderSummaryExtraAmt, expTopUp, "", "common");
    }

    public void clickPaymentEditbtnMAO() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(paymentEditBtnMAO);
        paymentEditBtnMAO.click();
        getReusableActions().staticWait(2000);
        reporterSnapshot(paymentEditBtnMAO, "payment Edit", "", "NULL");
    }

    public void validateAutopayBonus() {
        reporter.softAssert(autopayBonusBlock.get(0).isDisplayed(), "Autopay Bonus Block is added", "Autopay Bonus Block is not added");
    }

    public void validateNoAutopayBonus() {
        reporter.softAssert(autopayBonusBlock.isEmpty(), "Autopay Bonus Block is not added", "Autopay Bonus Block is added");
    }

    public void validateOrderSummaryAccBal() {
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(orderSummary);
        reporter.softAssert(accountBalUsedInDollars.isDisplayed(), "Account balance validated", "account balance is not displayed");
    }

    public void validateSavedCC() {
        reporter.softAssert(chatrTopUpRadioBtn.isDisplayed(), "voucher option is still displayed", "voucher option not displayed");
        getReusableActions().staticWait(3000);
        chatrTopUpRadioBtn.click();
        reporter.softAssert(!creditCardRadioBtn.isSelected(), "Able to toggle to Voucher payment", "Voucher toggle is not valiadated");
    }

    public void openDirectURL(String url) {
        getReusableActions().staticWait(3000);
        getDriver().get(url);
    }

    public String getDetailsfromProfile(String ExpVal) {
        String actualVal = "";
        getReusableActions().staticWait(2000);
        switch (ExpVal.toUpperCase()) {
            case "ADDRESS":
                getReusableActions().javascriptScrollByVisibleElement(profileAddress);
                actualVal = profileAddress.getText().trim();
                break;
            case "CITY":
                getReusableActions().javascriptScrollByVisibleElement(profileCity);
                actualVal = profileCity.getText().trim();
                break;
            case "POSTALCODE":
                getReusableActions().javascriptScrollByVisibleElement(profilePostalCode);
                actualVal = profilePostalCode.getText().trim();
                break;
        }
        return actualVal;
    }

    public void validatePromotionUsage() {
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScriptClick(profileDetailsButton);
        getReusableActions().javascriptScrollByVisibleElement(promationDetail);
        //profileDetailsButton.click();
        reporterSnapshot(promationDetail, "Promotion Usage", "", "display");
    }

    public void validatePPCPromotionDetails() {
        String flag = "";
        getReusableActions().staticWait(5000);
        List<WebElement> columnstatus = getDriver().findElements(By.xpath("//span[contains(text(),'Details')]"));
        int objCnt = columnstatus.size();
        for (int i = 5; i < objCnt; i++) {
            WebElement objDetailsButton = getDriver().findElement(By.xpath("(//span[contains(text(),'Details')])[" + i + "]"));
            getReusableActions().javascriptScrollByVisibleElement(objDetailsButton);
            getReusableActions().executeJavaScriptClick(objDetailsButton);
            //objDetailsButton.click();
            if (getDriver().findElements(By.xpath("(//h4[contains(text(),'Promotions')])[1]")).size() > 0) {
                flag = "true";
                break;
            } else
                flag = "false";
        }
        if (flag.toUpperCase().equals("TRUE"))
            getReusableActions().staticWait(2000);
            getReusableActions().executeJavaScript("document.body.style.zoom='60%'");
            getReusableActions().staticWait(2000);
            reporterSnapshot(profileDetailsButton, "Promotion Details", "", "null");
    }

    public void validateAddonIsDisabled() {
        getReusableActions().javascriptScrollByVisibleElement(manageAddOn);//manageAddOn
        //reporter.softAssert(!changePlan.isEnabled(), "Account is Not allowed to Mao page", "Account is Not allowed to Mao page");
        reporterSnapshot(manageAddOn, "get AddOn", "", "NOTENABLE");
    }

    public void validateErrorMessageForExpiredAccount() {
        //reporter.softAssert(expiredAccount.getText().equals("Your account is expired. You can not change your plan nor purchase add-ons if your account is not active"), "Valid message for Expired Account", "Not Valid message for Expired Account");
        reporterSnapshot(expiredAccount, "Your account is expired. You can not change your plan nor purchase add-ons if your account is not active", "", "gen");
    }

    public void validateErrorMessageForPendingOrders() {
        //reporter.softAssert(pendingOrders.getText().equals("You have an order pending. You can not change your plan nor purchase add-ons until your order is completed"), "Account have Pending Orders", "Account dont have pending orders");
        reporterSnapshot(pendingOrders, "An order is currently being processed", "", "common");
    }

    public void clickOnSelectAddOn() {
        getReusableActions().isElementVisible(selectAddOn, 20);
        getReusableActions().javascriptScrollByVisibleElement(selectAddOn);
        getReusableActions().clickWhenReady(selectAddOn);
    }

    public void validateAccountInsufficientBalance() {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(inSufficientBalance, 10);
        scrollToMiddleOfElement(inSufficientBalance);
        getReusableActions().staticWait(1000);
        //reporter.softAssert(inSufficientBalance.getText().equals("Insufficient account balance"), "Account is with Insufficient Balance", "Account is not with Insufficient Balance");
        reporterSnapshot(inSufficientBalance, "Not enough money", "", "Common");
    }

    public void validateVoucherErrorInvalidPin() {
        getReusableActions().staticWait(2000);
       scrollToMiddleOfElement(voucherErrorInvalidPin);
        reporterSnapshot(voucherErrorInvalidPin, "card not found", "", "common");
    }

    public void clickOnAssignForAutoPay() {
        getReusableActions().staticWait(2000);
        //reporter.softAssert(assignAutopayBonus.isDisplayed(), "Assign Autopay Link is visible", "Assign Autopay link is not visible");
        reporterSnapshot(assignAutopayBonus, "assign Autopay Bonus", "", "display");
        getReusableActions().staticWait(3000);
        assignAutopayBonus.click();
        getReusableActions().staticWait(2000);


    }

    public void clickOnNoCancelButton() {
        getReusableActions().isElementVisible(noCancelButton);
        //reporter.softAssert(noCancelButton.isEnabled(), "No cancel button is enabled", "No cancel button is disabled");
        reporterSnapshot(noCancelButton, "no Cancel Button", "", "enable");
        getReusableActions().staticWait(2000);
        noCancelButton.click();
        getReusableActions().staticWait(2000);
    }

    public void validateNoDataChange() {
        getReusableActions().staticWait(2000);
        reporterSnapshot(usedForAutoPay, "used For AutoPay", "", "display");
    }

    public void validateCreditCardPaymentSummary(String creditCard) {
        getReusableActions().staticWait(3000);
        System.out.println(creditCardPaymentSummary.getText());
        reporterSnapshot(creditCardPaymentSummary, creditCard.substring(12,16),"", "common");
    }

    public void validateExtraMoneyAmt(String topUpAmt) {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(continueBtnMAO);
/*        extraMoneyField.click();
        getReusableActions().staticWait(2000);
        extraMoneyField.sendKeys(topUpAmt);
        extraMoneyField.sendKeys(Keys.TAB);*/
        reporterSnapshot(continueBtnMAO, "continue", "", "ENABLE");
        //reporterSnapshot(topUpAmtFieldMAO,topUpAmt,"","value");
    }

    public void clickManageBtnRetail() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(selectAddOnMAO);
        getReusableActions().clickWhenReady(selectAddOnMAO, 10);
/*

        if (getDriver().findElements(By.xpath("//span[contains(text(),'Manage add-ons')]")).size() == 0) {
            getReusableActions().javascriptScrollByVisibleElement(getAddOn);
            getReusableActions().clickWhenReady(getAddOn, 10);}
        else {
            getReusableActions().javascriptScrollByVisibleElement(manageAddOn);
            getReusableActions().clickWhenReady(manageAddOn, 10);
        }
*/
        reporterSnapshot(selectAddOnMAO, "Manage Add-On", "", "NULL");
    }

    public void validateCCTopUpError(String topUp_0, String topUp_320) {
        //enterTopUpMAO(topUp_0);
        topUpAmtFieldMAO.sendKeys(topUp_0);
        getReusableActions().staticWait(2000);
        topUpAmtFieldMAO.sendKeys(Keys.TAB);
        getReusableActions().staticWait(2000);
       // reporterSnapshot(ccTopUpError, "Zero Topup", "", "DISPLAY");
        reporterSnapshot(zeroTopUpError, "$0.01", "", "common");
        getReusableActions().staticWait(2000);
        topUpAmtFieldMAO.click();
       // getReusableActions().executeJavaScriptClick(topUpAmtFieldMAO);
        getReusableActions().staticWait(2000);
        topUpAmtFieldMAO.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        getReusableActions().staticWait(2000);
        topUpAmtFieldMAO.sendKeys(Keys.DELETE);
        getReusableActions().staticWait(2000);
        topUpAmtFieldMAO.sendKeys(topUp_320);
        //enterTopUpMAO(topUp_320);
        getReusableActions().staticWait(2000);
        topUpAmtFieldMAO.sendKeys(Keys.TAB);
        getReusableActions().staticWait(2000);
        //reporterSnapshot(ccTopUpError, "Topup More 300", "", "DISPLAY");
        reporterSnapshot(ccTopUpError, "$300", "", "common");
    }

    public void clickOnEnroll() {
        getReusableActions().isElementVisible(enroll);
        getReusableActions().clickWhenReady(enroll);
    }

    public void clickOnAutoPayCheckBox() {
        getReusableActions().staticWait(10000);
        getReusableActions().isElementVisible(autoPayCheckBox, 10);
        getReusableActions().scrollToElement(autoPayCheckBox);
        getReusableActions().clickWhenReady(autoPayCheckBox, 20);
    }

    public void clickOnPlanDetails() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(currentPlanButton);
        getReusableActions().isElementVisible(currentPlanButton);
        currentPlanButton.click();
    }

    public void clickOnProfileTab() {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(profileTabBtn);
        getReusableActions().isElementVisible(profileTabBtn);
        profileTabBtn.click();
    }

    public void enterValidTopUpVoucherSS(String voucher) {
//        String[] strArray = voucher.split(";");
//        for (int i = 0; i <= strArray.length - 1; i++) {
//            voucher = strArray[i];
//            if (i == 0) {
//               // getReusableActions().javascriptScrollByVisibleElement(topUpCardFieldSS);
//                scrollToMiddleOfElement(topUpCardFieldSS);
//                topUpCardFieldSS.click();
//                topUpCardFieldSS.sendKeys(voucher);
//                getReusableActions().staticWait(2000);
//            }
//            if (errorMsgIcon.isDisplayed()) {
//                topUpCardFieldSS.click();
//                topUpCardFieldSS.sendKeys(voucher);
//                getReusableActions().staticWait(2000);
//            } else
//                break;
//        }
        getReusableActions().staticWait(3000);
        scrollToMiddleOfElement(topUpCardFieldSS);
        topUpCardFieldSS.click();
        topUpCardFieldSS.sendKeys(voucher);
        getReusableActions().staticWait(2000);
        reporterSnapshot(topUpCardFieldSS, voucher, "", "NULL");
        getReusableActions().staticWait(3000);
    }

    public void clickOnchangePlanPPC() {
        getReusableActions().staticWait(2000);
        getReusableActions().isElementVisible(changePlanBtn);
        changePlanBtn.click();
        getReusableActions().staticWait(3000);
        reporterSnapshot(changePlanBtn, "PPC", "", "NULL");
    }

    public String getCurrentPlanValue() {
        getReusableActions().staticWait(3000);
        String currentPlanVal = getDriver().findElement(By.xpath("//div[contains(@class,'plan-main-content')]/div/ds-price/div/div/div[2]")).getText();
        return currentPlanVal;
    }

    public String findLowerMSFPlan(String currentMSF) {
        getReusableActions().staticWait(3000);
        int currentMSFint = 0;
        int temp = 5;
        for (int i = 0; i < 4; i++) {

            currentMSFint = Integer.parseInt(currentMSF.trim()) - temp;
            System.out.println(currentMSFint);

            String planXpath = "//div[.//*[contains(.,'" + currentMSFint + "')]][contains(@class, 'plan-price')]/following-sibling::div[contains(@class, 'plan-select')]/button";
            List<WebElement> planValueWise = getDriver().findElements(By.xpath(planXpath));
            if (planValueWise.size() > 0) {
                break;
            } else {
                temp = temp + 5;
            }

        }
        return String.valueOf(currentMSFint);
    }

    public String findHigherMSFPlan(String currentMSF) {
        getReusableActions().staticWait(3000);
        int currentMSFint = 0;
        int temp = 5;
        for (int i = 0; i < 4; i++) {

            currentMSFint = Integer.parseInt(currentMSF.trim()) + temp;
            System.out.println(currentMSFint);

            String planXpath = "//div[.//*[contains(.,'" + currentMSFint + "')]][contains(@class, 'plan-price')]/following-sibling::div[contains(@class, 'plan-select')]/button";
            List<WebElement> planValueWise = getDriver().findElements(By.xpath(planXpath));
            if (planValueWise.size() > 0) {
                break;
            } else {
                temp = temp + 5;
            }

        }
        return String.valueOf(currentMSFint);
    }

    public void validateCreditCardDetailsAndSelectAnotherCard(String cardNumber, String expiryDate, String cvv) {
        //String AllCardXpath = "//span[@class='ds-selection__labelFocus d-inline-block bradius-4 position-relative d-flex justify-content-center align-items-center py-12 px-16 px-md-24 w-100']";
        String AllCardXpath = "//ds-selection[@tabindex='null']";
        //String AddCardText="//*[contains(text(),' Add a card ')]";

        getReusableActions().staticWait(2000);
        int maxCards = 5;
        getReusableActions().javascriptScrollByVisibleElement(saveCreditCard);
        List<WebElement> AllCard = getDriver().findElements(By.xpath(AllCardXpath));
        int noOfCards = AllCard.size();
        // if (noOfCards <= maxCards)
        if ((noOfCards <= maxCards) && (getReusableActions().isElementVisible(useAnotherCard))) {

            useAnotherCard.click();
            reporterSnapshot(useAnotherCard, "Select Another Card", "", "DISPLAY");
            setCardDetails(cardNumber, expiryDate, cvv);
        } else {
            reporterSnapshot(useAnotherCard, "Select Another Card", "", "NOTVISIBLE");
        }


    }
    public void validateAddedCardIsPresent(int count) {
        String AllCardXpath = "//ds-selection[@tabindex='null']";
        getReusableActions().javascriptScrollByVisibleElement(saveCreditCard);
        List<WebElement> AllCard = getDriver().findElements(By.xpath(AllCardXpath));
        int noOfCards = AllCard.size();
        System.out.println("Count" + count);
        System.out.println("noOfCards" + noOfCards);
        reporterSnapshot(saveCreditCard, Integer.toString(count + 1), Integer.toString(noOfCards), "compare");
    }

    public int getAddedCardCount() {
        String AllCardXpath = "//ds-selection[@tabindex='null']";
        getReusableActions().javascriptScrollByVisibleElement(saveCreditCard);
        List<WebElement> AllCard = getDriver().findElements(By.xpath(AllCardXpath));
        int noOfCards = AllCard.size();
        System.out.println("noOfCards" + noOfCards);
        return noOfCards;
    }

    public void clickOnSimChange() {
        getReusableActions().javascriptScrollByVisibleElement(simChangeButton);
        getReusableActions().staticWait(1000);
        getReusableActions().isElementVisible(simChangeButton);
        reporterSnapshot(simChangeButton, "sim Change", "", "NULL");
        getReusableActions().clickWhenReady(simChangeButton, 10);
    }
    public void validateErrorMessage4thAttemptOfSimSwap(){
        getReusableActions().staticWait(1000);
        for(int i=1;i<4;i++) {
            clickOnSimChange();
            getReusableActions().staticWait(1000);
            if(getReusableActions().isElementVisible(simChangeAlertMessage)) {
                reporterSnapshot(simChangeAlertMessage,"Daily Sim Change Limit Reached","","COMMON");
                break;
            }else{
                getReusableActions().switchToNewWindow();
                String newSimNumber = getDB().getSIMSerialNumber();
                System.out.println("new sim number " + newSimNumber);
                enterNewSimNumber(newSimNumber);
                System.out.println(" loop Count  "+i);
                submitButton.click();
                getReusableActions().staticWait(4000);
                reporterSnapshot(backToDashInPopUp,"Back To Dash Board","","NULL");
                backToDashInPopUp.click();
                getReusableActions().staticWait(2000);
            }
        }
    }
    public void validateExistingAddOnAmount() {
        getReusableActions().javascriptScrollByVisibleElement(addOnExisting);
        getReusableActions().staticWait(1000);
        reporter.reportLogWithScreenshot("addOnAmountInDollars");
        System.out.println(addOnAmountInDollars.getText() + ".00");
        getReusableActions().javascriptScrollByVisibleElement(changePlanBtn);
    }

    /**
     * For TC CPP_45057
     */
    public void clickOnChangeSimCardButton() {
        getReusableActions().staticWait(7000);
        getReusableActions().waitForElementTobeClickable(changeSimCardButton, 10);
        getReusableActions().javascriptScrollByVisibleElement(changeSimCardButton);
        getReusableActions().isElementVisible(changeSimCardButton);
        reporterSnapshot(changeSimCardButton, "Change SIM card", "", "NULL");
        getReusableActions().clickWhenReady(changeSimCardButton, 10);
    }

    /**
     * For TC CPP_45057
     */
    public void validateChangeSimSuccessPopUp() {
        getReusableActions().waitForElementVisibility(changeSimSuccessPopUp);
        reporterSnapshot(changeSimSuccessPopUp, "SIM card changed successfully", "", "GEN");
        backToDashboard.click();
        getReusableActions().staticWait(5000);
    }

    /**
     * For TC CPP_45057
     */
    public void validateSimNumberChangedInDashboard(String changedSimNumber) {
        getReusableActions().staticWait(10000);
        //getReusableActions().waitForAllElementsToBeRefreshedAndVisible(simCardNumber,10);

        getReusableActions().waitForElementVisibility(simCardNumber);
        String currentSimNumber;
        currentSimNumber = simCardNumber.getText();
        currentSimNumber = currentSimNumber.substring(20);
        String changed = changedSimNumber.substring(16);
        System.out.println("============= Changed is " + changed);
        System.out.println("==========>>>>> " + currentSimNumber);
        reporterSnapshot(simCardNumber, changed,currentSimNumber, "COMPARE");
    }


    public int getCardCountPresent() {
        getReusableActions().staticWait(3000);
        int CCcount = listcard8881.size();
        return CCcount;
    }

    public void validateCardIsPresentCnt(int countCC) {
        getReusableActions().staticWait(3000);
        int actCC = getCardCountPresent();
        String expCount = Integer.toString(countCC);
        String actCount = Integer.toString(actCC);
        reporterSnapshot(card8881, expCount, actCount, "compare");
    }

    public void goToPaymentCards() {
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(paymentCardTab);
        paymentCardTab.click();
        getReusableActions().staticWait(2000);
        reporterSnapshot(paymentCardTab, "Payment Card CC", "", "display");
        getReusableActions().staticWait(4000);
    }
    public void validateCCNotSaved(){
    getReusableActions().staticWait(3000);
    getReusableActions().scrollToElement(noSavedCards);
    reporterSnapshot(noSavedCards,"No saved cards.","","GEN");

    }
    public void clickOnGetAddons(){
        getReusableActions().waitForElementVisibility(addOnsBlock);
        getReusableActions().scrollToElement(addOnsBlock);
        reporterSnapshot(addOnsBlock, "Get add-ons", "", "COMMON");
        addOnsBlock.click();
    }

    public void validatingPaymentDetailsVoucher(){
        getReusableActions().staticWait(4000);
        getReusableActions().javascriptScrollByVisibleElement(h3PaymentDetailsMAO);
        reporterSnapshot(h3PaymentDetailsMAO, "Payment Details", "", "display");
        reporterSnapshot(h3TopupDetailsMAO, "Top-Up Details", "", "display");
        reporterSnapshot(h3TopupMethodMAO, "chatr top-up card", "", "common");
        reporterSnapshot(voucherPin.get(0),"******","","common");
        reporterSnapshot(null,"only one voucher PIN visible", String.valueOf(
                voucherPin !=null ? 0 : voucherPin.size()), "HIDDEN");
    }

    public void clickOnEditIcon(){
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollToMiddleOfPage();
        reporterSnapshot(editIcon,"Edit CC Icon","","DISPLAY");
        editIcon.click();
    }

    public String getExpiryDate(){
        String oldExpiryDate = changedExpDate.getText();
        System.out.println("Old Expiry Date is "+oldExpiryDate);
        return oldExpiryDate;
    }


    public void enterInvalidExpiryDetails(){
        getReusableActions().waitForElementVisibility(expiryDateInput);
        reporterSnapshot(expiryDateInput,"Expiry date","","DISPLAY");
        expiryDateInput.click();
        expiryDateInput.sendKeys(Keys.BACK_SPACE);
        expiryDateInput.sendKeys("11/11");
        expiryDateInput.sendKeys(Keys.ENTER);
    }
    public void validateErrorMessageInvalidExpiryDate(){
        getReusableActions().staticWait(3000);
        getReusableActions().waitForElementVisibility(expiryDateError);
        reporterSnapshot(expiryDateError,"Error! The card expiry date is incorrect.","","COMMON");
    }
    public String enterNewCCExpiryDate(String oldExpDate,String expDate,String expDate1){

        getReusableActions().waitForElementVisibility(expiryDateInput);
        reporterSnapshot(expiryDateInput,"Expiry date","","DISPLAY");
        expiryDateInput.click();
        for(int i=0;i<=4;i++){
        expiryDateInput.sendKeys(Keys.BACK_SPACE);}
        if(oldExpDate.contains("11/24")){
            expiryDateInput.sendKeys(expDate);
            expiryDateInput.sendKeys(Keys.ENTER);
            return expDate;
        }else{
            expiryDateInput.sendKeys(expDate1);
            expiryDateInput.sendKeys(Keys.ENTER);
            return expDate1;
        }

    }

    public void validateChangedExpiryDate(String expDate){
        getReusableActions().staticWait(5000);
        getReusableActions().javascriptScrollToMiddleOfPage();
        getReusableActions().waitForElementVisibility(changedExpDate,10);
        reporterSnapshot(changedExpDate,"Visa: Expires "+expDate,"","GEN");
    }

    public void clickOnSave(){
        reporterSnapshot(saveBtn,"Save","","GEN");
        saveBtn.click();
        getReusableActions().staticWait(3000);
        reporterSnapshot(cardSavedSuccess,"Card saved successfully!","","COMMON");
        okButton.click();
    }

    public void validateMaximum5SavedCards(String cardNumber, String expiryDate, String cvv) {
        String AllCardXpath = "//ds-selection[@tabindex='null']";
        getReusableActions().staticWait(2000);
        int maxCards = 5;
        getReusableActions().javascriptScrollByVisibleElement(saveCreditCard);
        List<WebElement> AllCard = getDriver().findElements(By.xpath(AllCardXpath));
        int noOfCards = AllCard.size();
        if ((noOfCards <= maxCards) && (getReusableActions().isElementVisible(useAnotherCard))) {
            useAnotherCard.click();
            reporterSnapshot(useAnotherCard, "Select Another Card", "", "DISPLAY");
            setCardDetails(cardNumber, expiryDate, cvv);
        } else {
            reporterSnapshot(useAnotherCard, "Select Another Card", "", "NOTVISIBLE");
        }
    }

    public void switchToLatestTab() {
        int setSize = getDriver().getWindowHandles().size();
        ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs2.get(setSize - 1));
        getReusableActions().staticWait(2000);
    }
    public void validateErrorMessageNewPinAndConfirmPin(String wrongPin) {
        getReusableActions().staticWait(3000);
        getReusableActions().javascriptScrollByVisibleElement(newPINField);
        getReusableActions().executeJavaScriptClick(newPinEye);
        getReusableActions().executeJavaScriptClick(confirmPinEye);
        getReusableActions().staticWait(2000);
        newPINField.clear();
        newPINField.click();
        newPINField.sendKeys(wrongPin);
        getReusableActions().staticWait(2000);
        confirmPINField.clear();
        confirmPINField.click();
        confirmPINField.sendKeys(wrongPin);
        if(wrongPin.length()<=3) {
            reporterSnapshot(newPinError, newPinError.getText(), "", "DISPLAY");
            reporterSnapshot(confirmPinError, confirmPinError.getText(), "", "DISPLAY");
        }
        getReusableActions().staticWait(2000);
        getReusableActions().executeJavaScriptClick(newPinEye);
        getReusableActions().executeJavaScriptClick(confirmPinEye);
    }
    public void validatePinStatus(String expected){
        String[] expString = expected.split(" ");
        System.out.println(" Option 1 = "+expString[0]);
        System.out.println(" Option 2 = "+expString[1]);
        getReusableActions().staticWait(2000);
        getReusableActions().javascriptScrollByVisibleElement(accountDetailsBanner);
        getReusableActions().staticWait(1000);
        if(expString[0].contains(accountPinStatus.getText())) {
            reporterSnapshot(accountPinStatus, expString[0].toUpperCase(), "", "COMMON");
        }else{
            if(expString[1].contains(accountPinStatus.getText())){
                reporterSnapshot(accountPinStatus, expString[1].toUpperCase(), "", "COMMON");
            }
        }
    }
    public void validatePinSuccessfullySetByUser(String pin){
        getReusableActions().staticWait(2000);
        //getReusableActions().javascriptScrollByVisibleElement(newPINField);
        getReusableActions().staticWait(1000);
        scrollToMiddleOfElement(newPINField);
        newPINField.click();
        newPINField.sendKeys(pin);
        getReusableActions().staticWait(2000);
        confirmPINField.click();
        confirmPINField.sendKeys(pin);
        reporterSnapshot(confirmPINField,"PIN","","DISPLAY");
        getReusableActions().staticWait(1000);
        mPinSubmitButton.click();
        getReusableActions().staticWait(2000);
        reporterSnapshot(successMessage,successMessage.getText(),"","DISPLAY");
    }
    public void clickOnBackToChatR(){
        getReusableActions().staticWait(2000);
        backToChatRInPopUp.click();
        getReusableActions().staticWait(3000);
    }
    public void validateAddOrEditCCNotAvailable() {
        reporterSnapshot(null, "Add a card", String.valueOf(
                addCCIcon == null ? 0 : addCCIcon.size()), "HIDDEN");
        reporterSnapshot(null, "edit CC", String.valueOf(
                editCCIcon == null ? 0 : editCCIcon.size()), "HIDDEN");
    }
    public void validateOrderSummaryDetails(String condition) {
        getReusableActions().staticWait(6000);
        if (condition.equalsIgnoreCase("empty")) {
            getReusableActions().javascriptScrollByVisibleElement(orderSummary);
            reporterSnapshot(orderSummary, "Cart Empty", "", "display");
        } else {
            getReusableActions().javascriptScrollByVisibleElement(orderSummary);
            reporterSnapshot(totalDueToday, "Plan Value Added", "", "display");
        }
    }
    public void validateEligibleAddOnINRetailPlanPage() {
        getReusableActions().javascriptScrollByVisibleElement(addonInPlanPage);
        reporterSnapshot(oneTimeDataddon, "Eligible Add-On", "", "display");
    }
    public void validateAddOnINReViewPage() {
        getReusableActions().javascriptScrollByVisibleElement(oneTimeDataddonReviewPage);
        reporterSnapshot(oneTimeDataddonReviewPage,oneTimeDataddonReviewPage.getText(),"","display");
    }
    public void validateCardUpdate(String previousdate){
        previousdate = "Visa: expires "+previousdate;
        getReusableActions().staticWait(2000);
        reporterSnapshot(expiryDate,previousdate,"","NOTCOMMON");
    }
    public void clickSaveAlone() {
        getReusableActions().staticWait(2000);
        getReusableActions().clickWhenReady(saveCTA, 10);
    }
    public int getAddedCardCountForSS() {
        getReusableActions().javascriptScrollByVisibleElement(saveCreditCard);
        int noOfCards =  listcard8881.size();
        System.out.println("Number Of Cards Saved == "+noOfCards);
        return noOfCards;
    }
}