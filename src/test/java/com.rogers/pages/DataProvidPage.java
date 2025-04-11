package com.rogers.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

import java.util.List;
public class DataProvidPage {


    @DataProvider(name = "PlanValue_3G")
    public Object[][] testData_3G() {
        return new Object[][] {
                {"plan25", "25"},
                {"Plan30", "30"},
                {"plan35", "35"},
                {"plan40", "40"},
                {"Plan50", "50"},
                {"plan60", "60"},
                {"plan70", "70"},
        };
    }
    @DataProvider(name = "PlanValue_4G")
    public Object[][] testData_4G() {
        return new Object[][] {
                {"plan40", "40"},
                {"Plan45", "45"},
                {"plan55", "55"},
                {"plan65", "65"},
                {"Plan75", "75"},
        };
    }
}
