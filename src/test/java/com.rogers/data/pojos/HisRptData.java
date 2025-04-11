package com.rogers.data.pojos;


import java.util.List;
import java.util.Map;

public class HisRptData {
    private List<Map<String,String>> hisrptData;

    public List<Map<String,String>> getHisRptData(){
        return hisrptData;
    }

    public void setHisrptData(List<Map<String,String>> hisrptData) {
        this.hisrptData = hisrptData;
    }
}
