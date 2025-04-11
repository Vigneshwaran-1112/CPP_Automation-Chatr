package com.rogers.data.pojos;


import java.util.List;
import java.util.Map;

public class RetailData {
    private List<Map<String,String>> retailData;

    public List<Map<String,String>> getRetailData(){
        return retailData;
    }

    public void setRetailData(List<Map<String,String>> retailData) {
        this.retailData = retailData;
    }
}
