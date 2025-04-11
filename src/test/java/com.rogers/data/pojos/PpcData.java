package com.rogers.data.pojos;


import java.util.List;
import java.util.Map;

public class PpcData {
    private List<Map<String,String>> ppcData;

    public List<Map<String,String>> getPpcData(){
        return ppcData;
    }

    public void setPpcData(List<Map<String,String>> ppcData) {
        this.ppcData = ppcData;
    }
}
