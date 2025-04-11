package com.rogers.data.pojos;


import java.util.List;
import java.util.Map;

public class GtpData {
    private List<Map<String,String>> gtpData;

    public List<Map<String,String>> getGtpData(){
        return gtpData;
    }

    public void setGtpData(List<Map<String,String>> gtpData) {
        this.gtpData = gtpData;
    }
}
