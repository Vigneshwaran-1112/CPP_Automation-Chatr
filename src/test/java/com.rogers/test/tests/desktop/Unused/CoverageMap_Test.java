package com.rogers.test.tests.desktop.Unused;

import com.rogers.test.base.BaseTest;
import org.testng.annotations.Test;

public class CoverageMap_Test extends BaseTest {

/*    @Test(groups = { "CoverageMap","qaAuto","Scrum"})
    public void CPP_26849_Validate_AlertMessage_In_CoverageMap(){
        getHeaderComponent().clickCoverageMap();
        getCoverageMapPage().validateAlertMessage();
    }*/
    @Test(groups = { "CoverageMap","onetoone","qaAuto","pfour"})
    public void CPP_24699_Validate_CoverageMap_change_The_Language(){
        getHeaderComponent().clickCoverageMap();
        getHeaderComponent().changeLanguage("French");
        getCoverageMapPage().validateCoveragePageInFrench();
        getHeaderComponent().changeLanguage("English");
        getCoverageMapPage().validateCoveragePageInEnglish();
    }



}
