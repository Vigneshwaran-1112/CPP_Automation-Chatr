package com.rogers.data.pojos;


import java.util.List;
import java.util.Map;

public class NacPortInData {
    private List<Map<String,String>> nacPortInData;

    public List<Map<String,String>> getNacPortInData(){
        return nacPortInData;
    }

    public void setNacPortInData(List<Map<String,String>> nacPortInData) {
        this.nacPortInData = nacPortInData;
    }
}
