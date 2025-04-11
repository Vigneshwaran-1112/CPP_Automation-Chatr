package com.rogers.test.base;


import com.rogers.data.handlers.ExcelUtility;
import com.rogers.data.handlers.JavaUtility;
import com.rogers.data.handlers.TestDataHandler;
import com.rogers.pages.*;
import com.rogers.test.commonflows.VerifyInENS;
import com.rogers.test.listeners.report.Listener;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.http.client.ClientProtocolException;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Optional;
import utils.BrowserDrivers;
import utils.DigiAutoCustomException;
import utils.Reporter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class BaseTest {

	protected static Reporter reporter;
	protected HashMap<String, String> xmlTestParameters;
	Map<String, String> sauceParameters;
	protected static final ThreadLocal<V21Query> V21DBConnectionThreadLocal = new ThreadLocal<>();
	protected BrowserDrivers browserDrivers;
	protected String suiteName;
	private Map<String, String> RunParameters;
	private WebDriverWait wait;
	protected static final ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<HomePage> HomePageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<HeaderComponent> HeaderComponentThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<StoreLocatorPage> StoreLocatorPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<CP_HomePage> CarePortalHomePagePageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<CP_DashBoard> CarePortalDashboardPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<PlanPage> PlanPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<SimPage> SimPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<PaymentPage> PaymentPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<ReviewOrderPage> ReviewOrderPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<OrderConfirmationPage> OrderConfirmationPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<SignInPage> SignInPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<TopUpFormPage> TopUpFormPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<TopUpPage> TopUpPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<AccountManagementPage> AccountManagementPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<HistoryReportsPage> HistoryReportsPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<CoverageMapPage> CoverageMapPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<GeneralEnquiryPage> GeneralEnquiryPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<LeadGenPage> LeadGenPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<LandingPage> LandingPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<EnrollAutoPayPage> EnrollAutoPayPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<ChampPage> ChampPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<RegisterPage> RegisterPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<EASPage> EASPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<ENSHomePage> ENSHomePageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<ENSNotificationViewPage> ENSNotificationViewPageThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<VerifyInENS> VerifyInENSThreadLocal = new ThreadLocal<>();
	protected static final ThreadLocal<PPCPage> PPCPageThreadLocal = new ThreadLocal<>();
//	protected static final ThreadLocal<BasePage> BasePageThreadLocal = new ThreadLocal<>();

	ExcelUtility excelUtility;

	public BaseTest() {
		browserDrivers = new BrowserDrivers();
	}


	/**
	 * @return the reporter
	 */
	public static Reporter getReporter() {
		return reporter;
	}

	/**
	 * @return the Homepagethreadlocal
	 */
	protected static HomePage getHomePageThreadLocal() {
		return HomePageThreadLocal.get();
	}

	public static HeaderComponent getHeaderComponent() {
		return HeaderComponentThreadLocal.get();
	}

	protected static StoreLocatorPage getStoreLocatorPage() {
		return StoreLocatorPageThreadLocal.get();
	}

	protected static CP_HomePage getCarePortalHomePage() {
		return CarePortalHomePagePageThreadLocal.get();
	}

	public static CP_DashBoard getCarePortalDashBoard() {
		return CarePortalDashboardPageThreadLocal.get();
	}

	public static SimPage getSimPage() {
		return SimPageThreadLocal.get();
	}

	public static PlanPage getPlanPage() {
		return PlanPageThreadLocal.get();
	}

	protected static GeneralEnquiryPage getGeneralEnquiryPage() {
		return GeneralEnquiryPageThreadLocal.get();
	}

	public static PaymentPage getPaymentPage() {
		return PaymentPageThreadLocal.get();
	}

	public static ReviewOrderPage getReviewOrderPage() {
		return ReviewOrderPageThreadLocal.get();
	}

	public static OrderConfirmationPage getOrderConfirmationPage() {
		return OrderConfirmationPageThreadLocal.get();
	}

	public static SignInPage getSignInPage() {
		return SignInPageThreadLocal.get();
	}

	public static TopUpFormPage getTopUpFormPage() {
		return TopUpFormPageThreadLocal.get();
	}

	protected static TopUpPage getTopUpPage() {
		return TopUpPageThreadLocal.get();
	}

	public static AccountManagementPage getAccountManagementPage() {
		return AccountManagementPageThreadLocal.get();
	}

	protected static HistoryReportsPage getHistoryReportsPage() {
		return HistoryReportsPageThreadLocal.get();
	}

	protected static CoverageMapPage getCoverageMapPage() {
		return CoverageMapPageThreadLocal.get();
	}

	protected static LeadGenPage getLeadGenPage() {
		return LeadGenPageThreadLocal.get();
	}

	protected static LandingPage getLandingPage() {
		return LandingPageThreadLocal.get();
	}

	protected static EnrollAutoPayPage getAutoPay() {
		return EnrollAutoPayPageThreadLocal.get();
	}

	protected static ChampPage getChampPage() {
		return ChampPageThreadLocal.get();
	}

	protected static RegisterPage getRegisterPage() {
		return RegisterPageThreadLocal.get();
	}

	public static EASPage getEASPage() {
		return EASPageThreadLocal.get();
	}
//	public static BasePage getBasePage() {
//		return BasePageThreadLocal.get();
//	}

	public static ENSHomePage getENSHomePage() {
		return ENSHomePageThreadLocal.get();
	}

	public static ENSNotificationViewPage getENSNotificationViewPage() {
		return ENSNotificationViewPageThreadLocal.get();
	}

	public static VerifyInENS getVerifyInEns() {
		return VerifyInENSThreadLocal.get();
	}

	protected static PPCPage getPPCPage() {
		return PPCPageThreadLocal.get();
	}

	private void init() {
		HomePageThreadLocal.set(new HomePage(getDriver()));
		V21DBConnectionThreadLocal.set(new V21Query());
		HeaderComponentThreadLocal.set(new HeaderComponent(getDriver()));
		StoreLocatorPageThreadLocal.set(new StoreLocatorPage(getDriver()));
		CarePortalHomePagePageThreadLocal.set(new CP_HomePage(getDriver()));
		CarePortalDashboardPageThreadLocal.set(new CP_DashBoard(getDriver()));
		PlanPageThreadLocal.set(new PlanPage(getDriver()));
		SimPageThreadLocal.set(new SimPage(getDriver()));
		PaymentPageThreadLocal.set(new PaymentPage(getDriver()));
		ReviewOrderPageThreadLocal.set(new ReviewOrderPage(getDriver()));
		OrderConfirmationPageThreadLocal.set(new OrderConfirmationPage(getDriver()));
		SignInPageThreadLocal.set(new SignInPage(getDriver()));
		TopUpFormPageThreadLocal.set(new TopUpFormPage(getDriver()));
		TopUpPageThreadLocal.set(new TopUpPage(getDriver()));
		AccountManagementPageThreadLocal.set(new AccountManagementPage(getDriver()));
		HistoryReportsPageThreadLocal.set(new HistoryReportsPage(getDriver()));
		CoverageMapPageThreadLocal.set(new CoverageMapPage(getDriver()));
		GeneralEnquiryPageThreadLocal.set(new GeneralEnquiryPage(getDriver()));
		LeadGenPageThreadLocal.set(new LeadGenPage(getDriver()));
		LandingPageThreadLocal.set(new LandingPage(getDriver()));
		EnrollAutoPayPageThreadLocal.set(new EnrollAutoPayPage(getDriver()));
		ChampPageThreadLocal.set(new ChampPage(getDriver()));
		RegisterPageThreadLocal.set(new RegisterPage(getDriver()));
		EASPageThreadLocal.set(new EASPage(getDriver()));
		ENSHomePageThreadLocal.set(new ENSHomePage(getDriver()));
		VerifyInENSThreadLocal.set(new VerifyInENS(getDriver()));
		ENSNotificationViewPageThreadLocal.set(new ENSNotificationViewPage(getDriver()));
		PPCPageThreadLocal.set(new PPCPage(getDriver()));
	}

	public static WebDriver getDriver() {
		return webDriverThreadLocal.get();
	}

	public void setDriver(WebDriver driver) {
		webDriverThreadLocal.set(driver);
	}

	public void closeSession() {
		getDriver().quit();
	}

	public static V21Query getDB() {
		return V21DBConnectionThreadLocal.get();
	}

	public void setImplictWait(WebDriver driver, long seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	public void startSession(String strUrl, String strBrowser, String strLanguage, Method currentTestMethodName,
							 boolean bypassCaptcha,String groupName,boolean EASFlag) throws ClientProtocolException, IOException {
		RunParameters = getExecutionParameters(strBrowser, strLanguage, EASFlag);
		strBrowser = RunParameters.get("Browser").toLowerCase();
		strLanguage = RunParameters.get("Language").toLowerCase();
		if (strBrowser.toLowerCase().contains("sauce")) {
			sauceParameters = initializeSauceParamsMap(strBrowser);
		}
		if(strBrowser.toLowerCase().contains("saucemacchrome")){
			strBrowser = "saucechrome";
		}
		webDriverThreadLocal.set(browserDrivers.driverInit(strBrowser, sauceParameters, currentTestMethodName, groupName));
//		captcha_bypass_handlers = new CaptchaBypassHandlers(getDriver());
//		captcha_bypass_handlers.captchaBypassUrlLoginFlows(strUrl);
		Listener.setDriver(getDriver());
		getDriver().get(strUrl);
		setImplictWait(getDriver(), 10);
		getDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		init();
//		if (!strBrowser.toLowerCase().contains("android") && !strBrowser.toLowerCase().contains("ios")
//				&& !strBrowser.toLowerCase().contains("mobile")) {
//			getDriver().manage().window().maximize();
//		}
		setSessionStorage(strUrl);

//		if (getHomePageThreadLocal().verifyLinks()) {
//			if (!strBrowser.toLowerCase().contains("android") && !strBrowser.toLowerCase().contains("ios")
//					&& !strBrowser.toLowerCase().contains("mobile")) {
//				getDriver().manage().window().maximize();
//			}
//			setSessionStorage(strUrl);
//		} else {
//			new AssertionError("URL Not Loaded");
//		}
	}

	/**
	 * To get parameters from XML file, it is called in TestListener.
	 *
	 * @return HashMap of test parameters
	 */
	public HashMap<String, String> getXMLParameters() {
		return xmlTestParameters;
	}

	/**
	 * Declare the sauce capabilities as ENUM type
	 */
	public enum SauceCapabilities {
		seleniumVersion, maxDuration, commandTimeout, idleTimeout, build, browserVersion, appiumVersion, deviceName,
		deviceOrientation, platformVersion, platformName, screenResolution
	}

	/**
	 * To start a session using given url, browser, language and test case group
	 * name.
	 *
	 * @param strLanguage string of test Language
	 * @param strBrowser  string of browser name
	 * @return HashMap of test TestParameters
	 */
	public static HashMap<String, String> getExecutionParameters(String strBrowser, String strLanguage, Boolean EASFlag) {
		if (System.getProperty("Browser") == null || System.getProperty("Browser").isEmpty()) {
			System.setProperty("Browser", strBrowser);
		}
		if (System.getProperty("Language") == null || System.getProperty("Language").isEmpty()) {
			System.setProperty("Language", strLanguage);
		}
		if (System.getProperty("Browser").equals("") && strBrowser.isEmpty()) {
			System.setProperty("Browser", "chrome");
		}
		if (System.getProperty("Language").equals("") && strLanguage.isEmpty()) {
			System.setProperty("Language", "en");
		}
		//strBrowser = System.getProperty("Browser");
		if(EASFlag) {
			strBrowser = "saucemacchrome";
		}
		else{
			strBrowser = System.getProperty("Browser");
		}
		strLanguage = System.getProperty("Language");
		HashMap<String, String> TestParameters = new HashMap<>();
		TestParameters.put("Browser", strBrowser);
		TestParameters.put("Language", strLanguage);
		return TestParameters;
	}

	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() throws FileNotFoundException {
		TestDataHandler.dataInit();
		System.out.println("Data File initialized at before Suite");
	}

	@BeforeMethod(alwaysRun = true)
	@Parameters({"strBrowser", "strLanguage"})
	public void beforeTest(@Optional("chrome") String strBrowser, @Optional("en") String strLanguage,
						   ITestContext testContext, Method method) throws ClientProtocolException, IOException {
		boolean eas = false;
		String qaURL = TestDataHandler.landingPageData.getSelfServeLandingPage();
		System.setProperty("QaUrl", qaURL);
		System.out.println(strBrowser);
		System.out.println(strLanguage);
		System.out.println(qaURL);
		Test testClass = method.getAnnotation(Test.class);
		for (int i = 0; i < testClass.groups().length; i++) {
			if (testClass.groups()[i].equals("EAS")) {
				System.setProperty("PageLoadStrategy", "NONE");
				eas = true;
			}
		}
		if(eas){
			if((System.getenv("BUILD_BUILDNUMBER")==null) || System.getenv("BUILD_BUILDNUMBER").equals("") || System.getProperty("Browser").equals("chromemobile") || System.getProperty("Browser").equals("sauceandroidchrome")){
				startSession(System.getProperty("QaUrl"), strBrowser, strLanguage, method, false,"selfserve",false);;
			}
			else {
				startSession(System.getProperty("QaUrl"), strBrowser, strLanguage, method, false,"",true);
			}
		}
		else {
			startSession(System.getProperty("QaUrl"), strBrowser, strLanguage, method, false,"",false);
		}
/*		startSession(System.getProperty("QaUrl"), strBrowser, strLanguage, method, false);
		System.out.println(System.getProperty("PageLoadStrategy"));*/
	}


	@AfterMethod(alwaysRun = true)
	public void afterTest(ITestResult result) {
		if (getDriver() != null) {
			deleteSessionStorage();
			closeSession();
		}
	}

	/**
	 * This method will initialize a hash map with the sauce parameters
	 *
	 * @param strBrowser string containing the browser name for sauce
	 * @return Hash map with sauce capabilities
	 */
	private Map<String, String> initializeSauceParamsMap(String strBrowser) {
		Map<String, String> sauceOptions = new HashMap<>();
		sauceOptions.put(SauceCapabilities.seleniumVersion.toString(),
				TestDataHandler.sauceSettings.getSauceOptions().getSeleniumVersion());
		sauceOptions.put(SauceCapabilities.maxDuration.toString(),
				TestDataHandler.sauceSettings.getSauceOptions().getMaxDuration());
		sauceOptions.put(SauceCapabilities.commandTimeout.toString(),
				TestDataHandler.sauceSettings.getSauceOptions().getCommandTimeout());
		sauceOptions.put(SauceCapabilities.idleTimeout.toString(),
				TestDataHandler.sauceSettings.getSauceOptions().getIdleTimeout());
		sauceOptions.put(SauceCapabilities.build.toString(),
				TestDataHandler.sauceSettings.getSauceOptions().getBuild());

		switch (strBrowser.toLowerCase()) {
			case "saucechrome":
				sauceOptions.put(SauceCapabilities.platformName.toString(),
						TestDataHandler.sauceSettings.getMutableChromeCapabilities().getPlatformName());
				sauceOptions.put(SauceCapabilities.browserVersion.toString(),
						TestDataHandler.sauceSettings.getMutableChromeCapabilities().getBrowserVersion());
				sauceOptions.put(SauceCapabilities.screenResolution.toString(),
						TestDataHandler.sauceSettings.getMutableChromeCapabilities().getScreenResolution());
				break;
			case "saucemacchrome":
				sauceOptions.put(SauceCapabilities.platformName.toString(),
						TestDataHandler.sauceSettings.getMutableSafariCapabilities().getPlatformName());
				sauceOptions.put(SauceCapabilities.browserVersion.toString(),
						TestDataHandler.sauceSettings.getMutableChromeCapabilities().getBrowserVersion());
				sauceOptions.put(SauceCapabilities.screenResolution.toString(),
						TestDataHandler.sauceSettings.getMutableChromeCapabilities().getScreenResolution());
				break;
			case "saucefirefox":
				sauceOptions.put(SauceCapabilities.platformName.toString(),
						TestDataHandler.sauceSettings.getMutableFireFoxCapabilities().getPlatformName());
				sauceOptions.put(SauceCapabilities.browserVersion.toString(),
						TestDataHandler.sauceSettings.getMutableFireFoxCapabilities().getBrowserVersion());
				break;
			case "sauceedge":
				sauceOptions.put(SauceCapabilities.platformName.toString(),
						TestDataHandler.sauceSettings.getMutableEdgeCapabilities().getPlatformName());
				sauceOptions.put(SauceCapabilities.browserVersion.toString(),
						TestDataHandler.sauceSettings.getMutableEdgeCapabilities().getBrowserVersion());
				break;
			case "saucesafari":
				sauceOptions.put(SauceCapabilities.platformName.toString(),
						TestDataHandler.sauceSettings.getMutableSafariCapabilities().getPlatformName());
				sauceOptions.put(SauceCapabilities.browserVersion.toString(),
						TestDataHandler.sauceSettings.getMutableSafariCapabilities().getBrowserVersion());
				break;
			case "sauceandroidchrome":
				sauceOptions.put(SauceCapabilities.appiumVersion.toString(),
						TestDataHandler.sauceSettings.getAndroidChromeCapabilities().getAppiumVersion());
				sauceOptions.put(SauceCapabilities.deviceName.toString(),
						TestDataHandler.sauceSettings.getAndroidChromeCapabilities().getDeviceName());
				sauceOptions.put(SauceCapabilities.deviceOrientation.toString(),
						TestDataHandler.sauceSettings.getAndroidChromeCapabilities().getDeviceOrientation());
				sauceOptions.put(SauceCapabilities.platformVersion.toString(),
						TestDataHandler.sauceSettings.getAndroidChromeCapabilities().getPlatformVersion());
				sauceOptions.put(SauceCapabilities.platformName.toString(),
						TestDataHandler.sauceSettings.getAndroidChromeCapabilities().getPlatformName());
				break;
			case "sauceioschrome":
				sauceOptions.put(SauceCapabilities.appiumVersion.toString(),
						TestDataHandler.sauceSettings.getIosSafariCapabilities().getAppiumVersion());
				sauceOptions.put(SauceCapabilities.deviceName.toString(),
						TestDataHandler.sauceSettings.getIosSafariCapabilities().getDeviceName());
				sauceOptions.put(SauceCapabilities.deviceOrientation.toString(),
						TestDataHandler.sauceSettings.getIosSafariCapabilities().getDeviceOrientation());
				sauceOptions.put(SauceCapabilities.platformVersion.toString(),
						TestDataHandler.sauceSettings.getIosSafariCapabilities().getPlatformVersion());
				sauceOptions.put(SauceCapabilities.platformName.toString(),
						TestDataHandler.sauceSettings.getIosSafariCapabilities().getPlatformName());
				break;

		}

		return sauceOptions;
	}

	public void setSessionStorage(String strUrl) {
		Cookie sessionStorage = new Cookie("Analytics_Test_Filter", "1", ".com", "/business", null);
		getDriver().manage().addCookie(sessionStorage);
	}

	public void deleteSessionStorage() {
		getDriver().manage().deleteCookieNamed("Analytics_Test_Filter");
	}

	public void deleteAllCookies() {
		getDriver().manage().deleteAllCookies();
	}

//	public void waitForElementTobeClickable(WebElement element, long timeOutSeconds) {
//		try {
//			wait = new WebDriverWait(getDriver(), timeOutSeconds);
//			wait.until(ExpectedConditions.elementToBeClickable(element));
//		} catch (Exception e) {
//
//			throw new DigiAutoCustomException(e);
//		}
//	}

	public void staticWait(long timeMillis) {
		try {
			Thread.sleep(timeMillis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//	public void waitForElementsVisible(WebElement webElement, long timeoutSeconds) {
//		wait = new WebDriverWait(getDriver(), timeoutSeconds);
//		wait.until(ExpectedConditions.visibilityOfAllElements(webElement));
//	}

	public void javascriptScrollByVisibleElement(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) getDriver();
			//This will scroll the page till the element is found
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {

			throw new DigiAutoCustomException(e);
		}
	}
/*	public static void main(String[] args) {
		// Set ChromeDriver path
		WebDriverManager.chromedriver().setup();

		// Define Chrome options
		ChromeOptions options = new ChromeOptions();

		// Define mobile emulation settings
		options.addArguments("--window-size=360,640"); // Set desired window size
		options.addArguments("--user-agent=YOUR_USER_AGENT_STRING"); // Set desired user agent
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-gpu");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");


		// Create Chrome WebDriver instance with defined options
		ChromeDriver driver = new ChromeDriver();
		//DevTools dt =driver.getDevTools();

		// Navigate to a mobile site
		driver.get("https://auto2-cpp.chatrwireless.com/");
		driver.manage().window().maximize();
	}*/
}



