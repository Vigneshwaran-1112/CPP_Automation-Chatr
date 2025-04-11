package com.rogers.data.pojos;


import java.util.List;
import java.util.Map;

public class NacData {
    private List<Map<String,String>> nacData;

    public List<Map<String,String>> getNacData(){
        return nacData;
    }

    public void setNacData(List<Map<String,String>> nacData) {
        this.nacData = nacData;
    }
}
