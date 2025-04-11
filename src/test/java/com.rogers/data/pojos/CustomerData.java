package com.rogers.data.pojos;


import java.util.List;
import java.util.Map;

public class CustomerData {
    private List<Map<String,String>> customerData;

    public List<Map<String,String>> getCustomerData(){
        return customerData;
    }

    public void setCustomerData(List<Map<String,String>> customerData) {
        this.customerData = customerData;
    }
}
