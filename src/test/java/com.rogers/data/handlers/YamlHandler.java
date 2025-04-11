package com.rogers.data.handlers;

import com.rogers.data.pojos.*;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class YamlHandler {

	public static SauceSettings getSauceSettings(String strSauceSettingLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(SauceSettings.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strSauceSettingLocation));
		SauceSettings sauceSettings = yaml.load(inputStream);
		return sauceSettings;
	}

	public static HeaderFooterLinks getHeaderLinks(String strHeaderLinkLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(HeaderFooterLinks.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strHeaderLinkLocation));
		HeaderFooterLinks headerFooterLinks = yaml.load(inputStream);
		return headerFooterLinks;
	}

	public static SearchBar getSearchItem(String strSearchItemLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(SearchBar.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strSearchItemLocation));
		SearchBar searchBar = yaml.load(inputStream);
		return searchBar;
	}

	public static RCRT_495_Check_Serviceability getCheckServiceability(String strSearchItemLocation)
			throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(RCRT_495_Check_Serviceability.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strSearchItemLocation));
		RCRT_495_Check_Serviceability CheckServiceability = yaml.load(inputStream);
		return CheckServiceability;
	}

	public static PageTitle getPageTitle(String strPageTitleLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(PageTitle.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strPageTitleLocation));
		PageTitle pageTitle = yaml.load(inputStream);
		return pageTitle;
	}

	public static BreadcrumbTexts getBreadcrumbTexts(String strBreadcrumbTextsLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(BreadcrumbTexts.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strBreadcrumbTextsLocation));
		BreadcrumbTexts breadcrumbTexts = yaml.load(inputStream);
		return breadcrumbTexts;
	}

	public static RCRT_2480_Tiles_Advantage_Mobility_Section getTilesAdvantageMobility(String strTilesAdvantageMobility)
			throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(RCRT_2480_Tiles_Advantage_Mobility_Section.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strTilesAdvantageMobility));
		RCRT_2480_Tiles_Advantage_Mobility_Section tilesAdvantageMobility = yaml.load(inputStream);
		return tilesAdvantageMobility;
	}
	
	public static TravelDestination getTravelDestination(String strTravelDestinationLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(TravelDestination.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strTravelDestinationLocation));
		TravelDestination travelDestination = yaml.load(inputStream);
		return travelDestination;
	}
	
	public static PricingCard getPricingCard(String strPricingCardLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(PricingCard.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strPricingCardLocation));
		PricingCard pricingCardLocation = yaml.load(inputStream);
		return pricingCardLocation;
	}
	
	public static Province getProvince(String strProvinceLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(Province.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strProvinceLocation));
		Province provinceLocation = yaml.load(inputStream);
		return provinceLocation;
	}

	public static LandingPageData getLandingPageData(String strLandingPageDataLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(LandingPageData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strLandingPageDataLocation));
		LandingPageData landingPageDataLocation = yaml.load(inputStream);
		return landingPageDataLocation;
	}
	public static DBConfig getdbEnv(String strdbEnvLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(DBConfig.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strdbEnvLocation));
		DBConfig dbEnvLocation = yaml.load(inputStream);
		return dbEnvLocation;
	}
	public static AccountData getAccountData(String straccountDataLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(AccountData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + straccountDataLocation));
		AccountData accountDataLocation = yaml.load(inputStream);
		return accountDataLocation;
	}
	public static CityData getCityData(String strcityDataLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(CityData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strcityDataLocation));
		CityData cityDataLocation = yaml.load(inputStream);
		return cityDataLocation;
	}
	public static CreditCardData getCreditCardData(String strcreditCardDataLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(CreditCardData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strcreditCardDataLocation));
		CreditCardData creditCardDataLocation = yaml.load(inputStream);
		return creditCardDataLocation;
	}
	public static CustomerData getCustomerData(String strcustomerDataLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(CustomerData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strcustomerDataLocation));
		CustomerData customerDataLocation = yaml.load(inputStream);
		return customerDataLocation;
	}
	public static PlanData getPlanData(String strplanDataLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(PlanData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strplanDataLocation));
		PlanData planDataLocation = yaml.load(inputStream);
		return planDataLocation;
	}
	public static ServiceProvider getServiceProvider(String strServiceProviderLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(ServiceProvider.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strServiceProviderLocation));
		ServiceProvider ServiceProviderLocation = yaml.load(inputStream);
		return ServiceProviderLocation;
	}
	public static MiscData getMiscData(String strmiscDataLocation) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(MiscData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strmiscDataLocation));
		MiscData miscDataLocation = yaml.load(inputStream);
		return miscDataLocation;
	}
	public static NacData getNacData(String strnacData) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(NacData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strnacData));
		NacData nacData = yaml.load(inputStream);
		return nacData;
	}
	public static NacPortInData getNacPortInData(String strnacPortInData) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(NacPortInData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strnacPortInData));
		NacPortInData nacPortInData = yaml.load(inputStream);
		return nacPortInData;
	}
	public static RegisterData getRegisterData(String strregisterData) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(RegisterData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strregisterData));
		RegisterData registerData = yaml.load(inputStream);
		return registerData;
	}
	public static AcctMgmtData getAcctMgmtData(String stracctMgmtData) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(AcctMgmtData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + stracctMgmtData));
		AcctMgmtData acctMgmtData = yaml.load(inputStream);
		return acctMgmtData;
	}

	public static CareNacData getCareNacData(String strcareNacData) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(CareNacData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strcareNacData));
		CareNacData careNacData = yaml.load(inputStream);
		return careNacData;
	}
	public static PpcData getPpcData(String strppcData) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(PpcData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strppcData));
		PpcData ppcData = yaml.load(inputStream);
		return ppcData;
	}
	public static GtpData getGtpData(String strgtpData) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(GtpData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strgtpData));
		GtpData gtpData = yaml.load(inputStream);
		return gtpData;
	}

	public static AtpData getAtpData(String stratpData) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(AtpData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + stratpData));
		AtpData atpData = yaml.load(inputStream);
		return atpData;
	}
	public static HisRptData getHisRptData(String strhisrptData) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(HisRptData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strhisrptData));
		HisRptData hisrptData = yaml.load(inputStream);
		return hisrptData;
	}
	public static carecustomerdata getCareCustomerData(String strcarecustomerdata) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(carecustomerdata.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") +  strcarecustomerdata));
		carecustomerdata carecustomerdata = yaml.load(inputStream);
		return carecustomerdata;
	}
	public static RetailData getRetailData(String strretailData) throws FileNotFoundException {
		Yaml yaml = new Yaml(new Constructor(RetailData.class));
		InputStream inputStream;

		inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strretailData));
		RetailData retailData = yaml.load(inputStream);
		return retailData;
	}


}
