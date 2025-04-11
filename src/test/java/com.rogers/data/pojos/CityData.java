package com.rogers.data.pojos;


import java.util.List;
import java.util.Map;

public class CityData {
    private List<Map<String,String>> cityData;

    public List<Map<String,String>> getCityData(){
        return cityData;
    }

    public void setCityData(List<Map<String,String>> cityData) {
        this.cityData = cityData;
    }
}
