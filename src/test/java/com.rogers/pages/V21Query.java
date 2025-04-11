package com.rogers.pages;

import com.rogers.data.handlers.DBHandler;
import com.rogers.data.handlers.TestDataHandler;

import java.util.Map;

public class V21Query {

    private DBHandler v21_connection;
    private String dbConnectionQueryPoint;
    public V21Query(){
        this.v21_connection = new DBHandler(TestDataHandler.dbConfig.getdbEnv());
        switch (TestDataHandler.dbConfig.getdbEnv().toLowerCase()){
            case "sft04":
                this.dbConnectionQueryPoint = "QA4APPBL19";
                break;
            case "sft06":
                this.dbConnectionQueryPoint = "QA6APPBL26";
                break;
            default:
                this.dbConnectionQueryPoint = "QA2APPBL02";
        }
    }

    public String getSIMSerialNumber(){
        String sim = null;
//        Map<Object, Object> result = v21_connection.v21executeQuery("SELECT SERIAL_NUMBER FROM "+dbConnectionQueryPoint+".serial_item_inv SAMPLE(1) WHERE SERIAL_NUMBER LIKE '%893027204019%' and CURR_POSSESSION='A' and ROWNUM <= 1");
        Map<Object, Object> result = v21_connection.v21executeQuery("SELECT SERIAL_NUMBER,ITEM_ID FROM serial_item_inv WHERE SERIAL_NUMBER LIKE '%893027204019%' and CURR_POSSESSION='A' and ROWNUM <= 1 order by sys_creation_date desc");
        sim = result.get("SERIAL_NUMBER").toString();
        return sim;
    }

    public String getSubStatus(String CTN){
        String query = "select SUB_STATUS from "+dbConnectionQueryPoint+".subscriber WHERE SUBSCRIBER_NO='" + CTN + "'";
        Map<Object, Object> objectObjectMap = v21_connection.v21executeQuery(query);
        return objectObjectMap.get("SUB_STATUS").toString();
    }

    public int getSOCCount(String CTN){
        Map<Object, Object> query6= v21_connection.v21executeQuery("select SOC from  "+dbConnectionQueryPoint+".Service_Agreement where subscriber_No='"+CTN+"' and CUSTOMER_ID in " +
                "(select BAN from "+dbConnectionQueryPoint+".prov_ban_list)");
        return (int) query6.get("TotalRowsCount");
    }
    public String getBAN(String CTN){
        String query1 = "select BAN from "+dbConnectionQueryPoint+".CSM_Prepaid_Tracking WHERE SUBSCRIBER_NO='" + CTN + "' AND ACT_CD='NAC'";
        Map<Object, Object> objectObjectMap = v21_connection.v21executeQuery(query1);
        return objectObjectMap.get("BAN").toString();

    }
    public String getACT_CD(String CTN){
        String query2 = "select ACT_CD from "+dbConnectionQueryPoint+".CSM_Prepaid_Tracking WHERE SUBSCRIBER_NO='" + CTN + "' AND ACT_CD='NAC'";
        Map<Object, Object> objectObjectMap = v21_connection.v21executeQuery(query2);
        return objectObjectMap.get("ACT_CD").toString();

    }
    public String getProductOrderID(String CTN){
        String query3 = "select ORDER_ID from "+dbConnectionQueryPoint+".CSM_Prepaid_Tracking WHERE SUBSCRIBER_NO='" + CTN + "' AND ACT_CD='NAC'";
        Map<Object, Object> objectObjectMap = v21_connection.v21executeQuery(query3);
        return objectObjectMap.get("ORDER_ID").toString();

    }
    public String getBANStatus(String BAN){
        String query4 = "select BAN, STATUS from "+dbConnectionQueryPoint+".Prov_BAN_List where BAN='"+BAN+"'";
        Map<Object, Object> objectObjectMap = v21_connection.v21executeQuery(query4);
        return objectObjectMap.get("STATUS").toString();
    }
    public String getSIMNumber(String CTN){
        String query5 = "select UNIT_ESN from  "+dbConnectionQueryPoint+".physical_device where subscriber_No='" +CTN+ "'and SW_STATE_IND = 'Y' and CUSTOMER_ID in (select BAN from "+dbConnectionQueryPoint+".prov_ban_list) and IMSI IS NOT NULL";
        System.out.println(query5);
        Map<Object, Object> objectObjectMap = v21_connection.v21executeQuery(query5);
        return objectObjectMap.get("UNIT_ESN").toString();
    }

    public String getOrderID(String CTN){
        String query = "select BAN, ACT_CD, ORDER_ID from "+dbConnectionQueryPoint+".CSM_Prepaid_Tracking WHERE SUBSCRIBER_NO='" + CTN + "' AND ACT_CD='NAC'";
        Map<Object, Object> objectObjectMap = v21_connection.v21executeQuery(query);
        return objectObjectMap.get("ORDER_ID").toString();
    }
    public String getCTNStatus(String CTN){
        String query6 =  "select CTN_STATUS from "+dbConnectionQueryPoint+".CTN_INV where CTN ='" +CTN + "'";
        Map<Object, Object> objectObjectMap = v21_connection.v21executeQuery(query6);
        return objectObjectMap.get("CTN_STATUS").toString();
    }
}
