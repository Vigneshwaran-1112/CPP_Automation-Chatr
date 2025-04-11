package com.rogers.data.pojos;


import java.util.List;
import java.util.Map;

public class AtpData {
    private List<Map<String,String>> atpData;

    public List<Map<String,String>> getAtpData(){
        return atpData;
    }

    public void setAtpData(List<Map<String,String>> atpData) {
        this.atpData = atpData;
    }
}
