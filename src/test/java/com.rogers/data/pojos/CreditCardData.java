package com.rogers.data.pojos;


import java.util.List;
import java.util.Map;

public class CreditCardData {
    private List<Map<String,String>> creditCardData;

    public List<Map<String,String>> getCreditCardData(){
        return creditCardData;
    }

    public void setCreditCardData(List<Map<String,String>> creditCardData) {
        this.creditCardData = creditCardData;
    }
}
