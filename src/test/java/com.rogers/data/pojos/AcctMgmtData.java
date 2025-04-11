package com.rogers.data.pojos;


import java.util.List;
import java.util.Map;

public class AcctMgmtData {
    private List<Map<String,String>> acctMgmtData;

    public List<Map<String,String>> getAcctMgmtData(){
        return acctMgmtData;
    }

    public void setAcctMgmtData(List<Map<String,String>> acctMgmtData) {
        this.acctMgmtData = acctMgmtData;
    }
}
