package com.rogers.data.pojos;


import java.util.List;
import java.util.Map;

public class CareNacData {
    private List<Map<String,String>> careNacData;

    public List<Map<String,String>> getCareNacData(){
        return careNacData;
    }

    public void setCareNacData(List<Map<String,String>> careNacData) {
        this.careNacData = careNacData;
    }
}
