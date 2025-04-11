package com.rogers.data.pojos;


import java.util.List;
import java.util.Map;

public class AccountData {
    private List<Map<String,String>> accountData;

    public List<Map<String,String>> getAccountData(){
        return accountData;
    }

    public void setAccountData(List<Map<String,String>> accountData) {
        this.accountData = accountData;
    }
}
