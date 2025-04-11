package com.rogers.data.pojos;


import java.util.List;
import java.util.Map;

public class ServiceProvider {
    private List<Map<String,String>> serviceProvider;

    public List<Map<String,String>> getServiceProvider(){
        return serviceProvider;
    }
    public void setServiceProvider(List<Map<String,String>> serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}
