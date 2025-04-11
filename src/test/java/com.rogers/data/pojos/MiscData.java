package com.rogers.data.pojos;

import java.util.List;
import java.util.Map;

public class MiscData {
    private List<Map<String,String>> miscData;

    public List<Map<String,String>> getMiscData(){
        return miscData;
    }

    public void setMiscData(List<Map<String,String>> miscData) {
        this.miscData = miscData;
    }
}
