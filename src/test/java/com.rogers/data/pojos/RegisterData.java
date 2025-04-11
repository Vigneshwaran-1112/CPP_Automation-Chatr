package com.rogers.data.pojos;


import java.util.List;
import java.util.Map;

public class RegisterData {
    private List<Map<String,String>> registerData;

    public List<Map<String,String>> getRegisterData(){
        return registerData;
    }

    public void setRegisterData(List<Map<String,String>> registerData) {
        this.registerData = registerData;
    }
}
