package com.rogers.data.handlers;

import com.rogers.data.pojos.*;
import org.testng.ITestNGMethod;

import java.io.FileNotFoundException;
import java.util.List;



public class TestDataHandler {
	public static SauceSettings sauceSettings;
	public static HeaderFooterLinks headerFooterLinks;
	public static SearchBar searchBar;
	public static RCRT_495_Check_Serviceability checkServiceability;
	public static PageTitle pageTitle;
	public static BreadcrumbTexts breadcrumbTexts;
	public static RCRT_2480_Tiles_Advantage_Mobility_Section tilesAdvantageMobility;
	public static TravelDestination travelDestination;
	public static PricingCard pricingCard;
	public static Province province;
	public static LandingPageData landingPageData;
	public static DBConfig dbConfig;
	public static AccountData accountData;
	public static CityData cityData;
	public static CreditCardData creditCardData;
	public static CustomerData customerData;
	public static PlanData planData;
	public static  ServiceProvider  serviceProvider;
	public static MiscData miscData;
	public static NacData nacData;
	public static GtpData gtpData;
	public static AtpData atpData;
	public static HisRptData hisrptData;
	public static NacPortInData nacPortInData;
	public static RegisterData registerData;
	public static AcctMgmtData acctMgmtData;
	public static CareNacData careNacData;
	public static PpcData ppcData;
	public static carecustomerdata carecustomerdata;
	public static RetailData retailData;

	public static String filePath = "/src/test/resources/test-data/env/";

	public static void dataInit(List<ITestNGMethod> lstTestMethodName) throws FileNotFoundException {
		String updatedPath = filePath.replace("env", System.getProperty("Environment").toLowerCase());
		sauceSettings = YamlHandler.getSauceSettings("/src/test/resources/test-data/SauceSettings.yml");
		headerFooterLinks = YamlHandler.getHeaderLinks(updatedPath + "HeaderFooterLinks.yml");
	}

	public  static void dataInit() throws FileNotFoundException {

		String updatedPath = filePath.replace("env", System.getProperty("Environment"));
		sauceSettings = YamlHandler.getSauceSettings("/src/test/resources/test-data/SauceSettings.yml");
		headerFooterLinks = YamlHandler.getHeaderLinks(updatedPath + "HeaderFooterLinks.yml");
		searchBar = YamlHandler.getSearchItem(updatedPath + "SearchBar.yml");
		checkServiceability = YamlHandler.getCheckServiceability(updatedPath + "CheckServiceability.yml");
		pageTitle = YamlHandler.getPageTitle(updatedPath + "PageTitle.yml");
		breadcrumbTexts = YamlHandler.getBreadcrumbTexts(updatedPath + "BreadcrumbTexts.yml");
		travelDestination = YamlHandler.getTravelDestination(updatedPath + "TravelDestination.yml");
		tilesAdvantageMobility = YamlHandler.getTilesAdvantageMobility(updatedPath + "TilesAdvantageMobility.yml");
		pricingCard = YamlHandler.getPricingCard(updatedPath + "PricingCard.yml");
		province = YamlHandler.getProvince(updatedPath + "province.yml");
		landingPageData = YamlHandler.getLandingPageData(updatedPath + "LandingPageData.yml");
		dbConfig = YamlHandler.getdbEnv("/src/test/resources/test-data/DBConfig.yml");
		accountData = YamlHandler.getAccountData(updatedPath + "AccountData.yml");
		cityData = YamlHandler.getCityData(updatedPath + "CityData.yml");
		creditCardData = YamlHandler.getCreditCardData(updatedPath + "CreditCardData.yml");
		customerData = YamlHandler.getCustomerData(updatedPath + "CustomerData.yml");
		planData = YamlHandler.getPlanData(updatedPath + "PlanData.yml");
		//serviceProvider = YamlHandler.getServiceProvider(updatedPath + "ServiceProvider.yml");
		miscData = YamlHandler.getMiscData(updatedPath + "MiscData.yml");
		nacData = YamlHandler.getNacData(updatedPath + "NacData.yml");
		gtpData = YamlHandler.getGtpData(updatedPath + "GtpData.yml");
		atpData = YamlHandler.getAtpData(updatedPath + "AtpData.yml");
		hisrptData = YamlHandler.getHisRptData(updatedPath + "HistoryReportData.yml");
		nacPortInData = YamlHandler.getNacPortInData(updatedPath + "NacPortInData.yml");
		registerData = YamlHandler.getRegisterData(updatedPath + "RegisterData.yml");
		acctMgmtData = YamlHandler.getAcctMgmtData(updatedPath + "AcctMgmtData.yml");
		careNacData = YamlHandler.getCareNacData(updatedPath + "CareNacData.yml");
		ppcData = YamlHandler.getPpcData(updatedPath + "PpcData.yml");
		carecustomerdata = YamlHandler.getCareCustomerData(updatedPath + "carecustomerdata.yml");
		retailData = YamlHandler.getRetailData(updatedPath + "RetailData.yml");

	}
}
