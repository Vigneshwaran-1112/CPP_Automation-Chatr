package com.rogers.data.pojos;


import java.util.List;
import java.util.Map;

public class PlanData {
    private List<Map<String,String>> planData;

    public List<Map<String,String>> getPlanData(){
        return planData;
    }

    public void setPlanData(List<Map<String,String>> planData) {
        this.planData = planData;
    }
}
