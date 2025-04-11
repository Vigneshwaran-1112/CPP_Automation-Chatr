package com.rogers.data.pojos;

import java.util.List;
import java.util.Map;

public class carecustomerdata {
    private List<Map<String,String>> careCustomerData;

    public List<Map<String,String>> getCareCustomerData(){
        return careCustomerData;
    }

    public void setCareCustomerData(List<Map<String,String>> careCustomerData) {
        this.careCustomerData = careCustomerData;
    }
}
