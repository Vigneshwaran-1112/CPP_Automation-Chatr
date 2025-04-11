package com.rogers.test.tests.desktop.selfServe;


import com.rogers.data.handlers.TestDataHandler;
import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

public class StoreLocator_Test extends BaseTest {

/*
    @Test(groups = { "SSSLT","Regression","Scrum"})
    public void CPP_25863_Search_Store_using_PinCode() {
        String postalCode = TestDataHandler.miscData.getMiscData().get(0).get("postalCode");
        String store = TestDataHandler.miscData.getMiscData().get(0).get("store");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(postalCode);
        getStoreLocatorPage().validateDefaultFilterValue();
        getStoreLocatorPage().selectStore(store);
        getStoreLocatorPage().validateChatrStore();
        getStoreLocatorPage().validateGetDirectionLink();
    }
    @Test(groups = { "SSSLT", "Regression","Scrum"})
    public void CPP_25864_Search_Store_using_CityName() {

        String city = TestDataHandler.miscData.getMiscData().get(0).get("city");
        String store = TestDataHandler.miscData.getMiscData().get(0).get("store");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(city);
        getStoreLocatorPage().validateDefaultFilterValue();
        getStoreLocatorPage().selectStore(store);
        getStoreLocatorPage().validateChatrStore();
        getStoreLocatorPage().validateGetDirectionLink();
        getStoreLocatorPage().validateRetailerStores();
    }
    @Test(groups = { "SSSLT","Scrum"})
    public void CPP_25436_Search_Store_using_Location() throws AWTException {
        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStoreUsingLocation();
        getStoreLocatorPage().validateChatrStore();
        getStoreLocatorPage().validateGetDirectionLink();
    }
    @Test(groups = { "SSSLT","Regression","Scrum" })
    public void CPP_27968_Validate_Retailer_Stores(){
        String city = TestDataHandler.miscData.getMiscData().get(0).get("city");
        String store = TestDataHandler.miscData.getMiscData().get(1).get("store");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(city);
        getStoreLocatorPage().validateDefaultFilterValue();
        getStoreLocatorPage().selectStore(store);
        getStoreLocatorPage().validateRetailerStore();
        getStoreLocatorPage().validateGetDirectionLink();
    }

    @Test(groups = { "SSSLT","Scrum"})
    public void CPP_25863_Validate_Store_Details_Map() {
        String city = TestDataHandler.miscData.getMiscData().get(0).get("city");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(city);
        getStoreLocatorPage().validateStoreLocatorMap();
    }
*/
    /*    @Test(groups = {"SSSLT", "DAYONE", "qaAuto","pthree"})
    public void CPP_24717_Validate_LanguageChangeStoreLocatorPage() {
        getHeaderComponent().clickStore();
        getHeaderComponent().changeLanguage("French");
        getStoreLocatorPage().validatePageLanguageChangeToFrench();
        getHeaderComponent().changeLanguage("English");
        getStoreLocatorPage().validatePageLanguageChangeToEnglish();
    }*/
    @Test(groups = {"SSSLT", "DAYONE", "qaAuto","pthree"})
    public void CPP_24717_validateSearch_Store_using_PinCode() {
        String postalCode = TestDataHandler.miscData.getMiscData().get(0).get("postalCode");
        String store = TestDataHandler.miscData.getMiscData().get(0).get("store");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(postalCode);
        getStoreLocatorPage().validateDefaultFilterValue();
        getStoreLocatorPage().selectStore(store);
        getStoreLocatorPage().validateChatrStore();
        getStoreLocatorPage().validateStoreLocatorMap();
        getStoreLocatorPage().validateGetDirectionLink();
    }
    @Test(groups = {"SSSLT", "DAYONE", "qaAuto","pfour"})
    public void CPP_25911_validatePredictive_TextGenerator_cityName() {
        String city = TestDataHandler.miscData.getMiscData().get(0).get("city");
        String store = TestDataHandler.miscData.getMiscData().get(0).get("store");
        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(city);
        getStoreLocatorPage().validatePredictiveTextGenerator();
        getStoreLocatorPage().validateDefaultFilterValue();
        getStoreLocatorPage().selectStore(store);
        getStoreLocatorPage().validateChatrStore();
        getStoreLocatorPage().validateGetDirectionLink();
    }
    @Test(groups = {"SSSLT", "DAYONE", "qaAuto","pfour"})
    public void CPP_26012_Validate_Retailer_StoresCity() {
        String city = TestDataHandler.miscData.getMiscData().get(0).get("city");
        String store = TestDataHandler.miscData.getMiscData().get(0).get("storeR");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(city);
        getStoreLocatorPage().validateDefaultFilterValue();
        getStoreLocatorPage().selectStore(store);
        getStoreLocatorPage().validateRetailerStore();
        getStoreLocatorPage().validateGetDirectionLink();
    }
    @Test(groups = {"SSSLT", "DAYONE", "qaAuto","pthree"})
    public void CPP_27079_Validate_SearchFunctionality() {
        String city = TestDataHandler.miscData.getMiscData().get(0).get("city");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(city);
        getStoreLocatorPage().validateDefaultFilterValue();
        getStoreLocatorPage().validateStore();
        getStoreLocatorPage().validateGetDirectionLink();
    }
    @Test(groups = {"SSSLT", "DAYONE", "qaAuto","pthree"})
    public void CPP_24705_Validate_getDirectionLink() {
        String city = TestDataHandler.miscData.getMiscData().get(0).get("city");
        String store = TestDataHandler.miscData.getMiscData().get(0).get("store");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(city);
        getStoreLocatorPage().selectStore(store);
        getStoreLocatorPage().validateGetDirectionLink();
    }
    @Test(groups = {"SSSLT", "DAYONE", "qaAuto","pone"})
    public void CPP_24707_Validate_DefaultFilterValue() {
        String city = TestDataHandler.miscData.getMiscData().get(0).get("city");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(city);
        getStoreLocatorPage().validateDefaultFilterValue();
    }

    @Test(groups = {"SSSLT", "DAYONE", "qaAuto","pthree"})
    public void CPP_27729_Validate_StoreTimingFrench() {
        String postalCode = TestDataHandler.miscData.getMiscData().get(0).get("postalCode");

        getHeaderComponent().clickStore();
        getHeaderComponent().changeLanguage("French");
        getStoreLocatorPage().searchStore(postalCode);
        getStoreLocatorPage().validate24hoursStoreTimingsFrench();
    }
    @Test(groups = {"SSSLT", "DAYONE", "qaAuto","pthree"})
    public void CPP_27730_Validate_StoreTimingEnglish() {
        String postalCode = TestDataHandler.miscData.getMiscData().get(0).get("postalCode");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(postalCode);
        getStoreLocatorPage().validate12hoursStoreTimingsEnglish();
    }
    @Test(groups = { "SSSLT","DAYONE","qaAuto","pfour"})
    public void CPP_27726_Validate_location_Mark_On_Map_Store(){
        String city = TestDataHandler.miscData.getMiscData().get(0).get("city");
        String store = TestDataHandler.miscData.getMiscData().get(0).get("store");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(city);
        getStoreLocatorPage().validateDefaultFilterValue();
        getStoreLocatorPage().selectStore(store);
        getStoreLocatorPage().validateLocationMarkOnMap();
    }

    @Test(groups = {"SSSLT","DAYONE","qaAuto","pfour"})
    public void CPP_26071_Validate_Retail_Store_On_Map() {
        String city = TestDataHandler.miscData.getMiscData().get(0).get("city");
        String store = TestDataHandler.miscData.getMiscData().get(0).get("storeR");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(city);
        getStoreLocatorPage().validateDefaultFilterValue();
        getStoreLocatorPage().selectStore(store);
        getStoreLocatorPage().validateRetailerStore();
        getStoreLocatorPage().validateStoreLocatorMap();
    }

    @Test(groups = { "SSSLT","DAYONE","qaAuto","pfour"})
    public void CPP_26072_Validate_Chatr_Store_On_Map() {
        String city = TestDataHandler.miscData.getMiscData().get(0).get("city");
        String store = TestDataHandler.miscData.getMiscData().get(0).get("store");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(city);
        getStoreLocatorPage().validateDefaultFilterValue();
        getStoreLocatorPage().selectStore(store);
        getStoreLocatorPage().validateChatrStore();
        getStoreLocatorPage().validateStoreLocatorMap();
    }

    @Test(groups = { "SSSLT","DAYONE","qaAuto","pfour"})
    public void CPP_25918_Validate_user_Able_To_See_Details_On_Search_Icon_Map(){
        String city = TestDataHandler.miscData.getMiscData().get(0).get("city");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(city);
        getStoreLocatorPage().validateDefaultFilterValue();
        getStoreLocatorPage().validateStoreLocatorMap();
        getStoreLocatorPage().validate12hoursStoreTimingsEnglish();
    }

    @Test(groups = { "SSSLT","DAYONE","qaAuto","pfour"})
    public void CPP_27588_Validate_pin_Number_On_Map(){
        String city = TestDataHandler.miscData.getMiscData().get(0).get("city");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(city);
        getStoreLocatorPage().validateDefaultFilterValue();
        getStoreLocatorPage().validateDetectLocation();
    }

    @Test(groups = { "SSSLT","DAYONE","qaAuto","pfour"})
    public void CPP_27765_Validate_Map_Zoom_In_Region_Where_Store_Locate() {
        String city = TestDataHandler.miscData.getMiscData().get(0).get("city");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(city);
        getStoreLocatorPage().validateDefaultFilterValue();
        getStoreLocatorPage().validateStoreLocatorMap1();

    }
    @Test(groups = { "SSSLT","DAYONE","qaAuto","pthree"})
    public void CPP_24711_Validate_LanguageEntirePageChangeStoreLocatorPage() {

        getHeaderComponent().clickStore();
        getHeaderComponent().changeLanguage("French");
        getStoreLocatorPage().validatePageLanguageChangeToFrench();
        getHeaderComponent().changeLanguage("English");
        getStoreLocatorPage().validatePageLanguageChangeToEnglish();
    }
    @Test(groups = {"SSSLT", "DAYONE", "qaAuto"})
    public void CPP_27745_validatePredictive_TextGenerator_cityName() {
        String city = TestDataHandler.miscData.getMiscData().get(0).get("city");
        String store = TestDataHandler.miscData.getMiscData().get(0).get("store");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(city);
        getStoreLocatorPage().validatePredictiveTextGenerator();
        getStoreLocatorPage().validateDefaultFilterValue();
        getStoreLocatorPage().selectStore(store);
        getStoreLocatorPage().validateChatrStore();
        getStoreLocatorPage().validateGetDirectionLink();
    }
    @Test(groups = {"SSSLT", "DAYONE", "qaAuto"})
    public void CPP_28947_validateSearch_Store_Pagination() {
        String postalCode = TestDataHandler.miscData.getMiscData().get(0).get("postalCode");
        String store = TestDataHandler.miscData.getMiscData().get(0).get("store");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(postalCode);
        getStoreLocatorPage().validateDefaultFilterValue();
        getStoreLocatorPage().selectStore(store);
        getStoreLocatorPage().validateChatrStore();
    }
    @Test(groups = {"SSSLT", "DAYONE", "qaAuto","pfour"})
    public void CPP_31104_Validate_Chatr_Stores_Email_NotPresent_Storelocator_page_Desktop_View() {
        String city = TestDataHandler.miscData.getMiscData().get(0).get("city");

        getHeaderComponent().clickStore();
        getStoreLocatorPage().searchStore(city);
        getStoreLocatorPage().validateNoEmailIDShown();
    }

    }

