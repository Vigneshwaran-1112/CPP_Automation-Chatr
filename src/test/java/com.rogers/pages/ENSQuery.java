package com.rogers.pages;

import com.rogers.data.pojos.DBConfig;
import com.rogers.data.pojos.DBHandlerENS;
import org.json.JSONObject;
import org.json.XML;
import org.xml.sax.SAXException;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

import static com.rogers.data.pojos.DBHandlerENS.ensDBConnection;

public class ENSQuery {

    private DBHandlerENS ens_connection;
    private String ensdbConnectionQueryPoint;
    private static DBConfig dbConfig;
    private static String notification_id;
    public static Map<Object, Object> result;

    //String CTN= FileUtilities.ReadPropertiesFile_NACBFF("phoneFNumberFinal");
    public ENSQuery() throws FileNotFoundException {
//        this.v21_connection = new DBHandler(TestDataHandler.dbConfig.getdbEnv());
        this.ens_connection = new DBHandlerENS(getDatabaseEnv());
        switch (getDatabaseEnv().toLowerCase()) {
//        switch (TestDataHandler.dbConfig.getdbEnv().toLowerCase()){
            case "qa4":
                this.ensdbConnectionQueryPoint = "QA4APPBL19";
                break;
            case "qa3":
                this.ensdbConnectionQueryPoint = "QA6APPBL26";
                break;
            default:
                this.ensdbConnectionQueryPoint = "QA2APPBL02";
        }
    }

    public DBConfig getdbEnvENS(String strdbEnvLocation) throws FileNotFoundException {
        Yaml yaml = new Yaml(new Constructor(DBConfig.class));
        InputStream inputStream;
        inputStream = new FileInputStream(new File(System.getProperty("user.dir") + strdbEnvLocation));
        DBConfig dbEnvLocation = yaml.load(inputStream);
        return dbEnvLocation;
    }

    public String getDatabaseEnv() throws FileNotFoundException {
        String env = "";
        dbConfig = getdbEnvENS("/src/test/resources/test-data/DBConfig.yml");
        env = dbConfig.getdbEnv();
        System.out.println("envENS" + env);
        return env;
    }

    public String getNotificationID(String emailId) {
        Map<Object, Object> result = ens_connection.ensexecuteQuery("select EMAIL_ADDRESS.notification_id from NOTIFICATION_TEMPLATE inner JOIN EMAIL_ADDRESS ON EMAIL_ADDRESS.NOTIFICATION_ID = NOTIFICATION_TEMPLATE.NOTIFICATION_ID where EMAIL_ADDRESS.email= '" + emailId + "' and NOTIFICATION_TEMPLATE.TEMPLATE_TYPE = 'EAS_OTP' ORDER BY NOTIFICATION_TEMPLATE.NOTIFICATION_ID ASC");
        //Map<Object, Object> result = ens_connection.ensexecuteQuery("select * from (select EMAIL_ADDRESS.notification_id from NOTIFICATION_TEMPLATE inner JOIN EMAIL_ADDRESS ON EMAIL_ADDRESS.NOTIFICATION_ID = NOTIFICATION_TEMPLATE.NOTIFICATION_ID where EMAIL_ADDRESS.email= '" +emailId+ "' and NOTIFICATION_TEMPLATE.TEMPLATE_TYPE = 'EAS_OTP')t where t.rn=1" );
        notification_id = result.get("NOTIFICATION_ID").toString();
        System.out.println("notification_id" + notification_id);
        return notification_id;
    }


    public String getOTPMail(String notification_id) throws ParserConfigurationException, IOException, SAXException {

        Map<Object, Object> objMap = ens_connection.ensexecuteQuery("select content_xml from notification_content where notification_id='" + notification_id + "'");
        // System.out.println("Ver code is "+objMap.get("Verification_Code").toString());
        String res = objMap.toString();
        String otpcode = res.substring(151, 157);
        return otpcode;

    }

    public String getBSS() throws ParserConfigurationException, IOException, SAXException {

        Map<Object, Object> objMap = ens_connection.ensexecuteQuery("SELECT * FROM public.order_request where ctn ='4373076389'");
        // System.out.println("Ver code is "+objMap.get("Verification_Code").toString());
        String res = objMap.toString();
        return res;

    }


    /*public String getSubStatus(String CTN){
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
        String query5 = "select  UNIT_ESN from  "+dbConnectionQueryPoint+".physical_device where subscriber_No='" +CTN+ "'and CUSTOMER_ID in (select BAN from "+dbConnectionQueryPoint+".prov_ban_list) and IMSI IS NOT NULL  ORDER BY ROWNUM DESC OFFSET 0 ROWS FETCH FIRST 1 ROW ONLY";
        System.out.println(query5);
        //String result= String.valueOf(v21_connection.v21executeQuery(query5));

       Map<Object, Object> objectObjectMap = v21_connection.v21executeQuery(query5);
       return objectObjectMap.get("UNIT_ESN").toString();
        //return result.toString();
    }
    public boolean getSIMNumber_V21(String CTN){
        String query5 = "select  UNIT_ESN from  "+dbConnectionQueryPoint+".physical_device where subscriber_No='" +CTN+ "'and CUSTOMER_ID in (select BAN from "+dbConnectionQueryPoint+".prov_ban_list) and IMSI IS NOT NULL and ROWNUM=1 ";
        System.out.println(query5);
        String result= String.valueOf(v21_connection.v21executeQuery(query5));
        return result.matches(FileUtilities.ReadPropertiesFile("NewSerialNumber_SimSwap"));
       // Map<Object, Object> objectObjectMap = v21_connection.v21executeQuery(query5);
        //return objectObjectMap.get("UNIT_ESN").toString();
        //return result.toString();
    }

    public Map<Object, Object> getOrderID(String CTN){
        String query = "select BAN,EXTERNAL_ID, ACT_CD, ORDER_ID from "+dbConnectionQueryPoint+".CSM_Prepaid_Tracking WHERE SUBSCRIBER_NO='" + CTN + "' AND ACT_CD='NAC'";
        System.out.println("The get orderid query :" +query);
        Map<Object, Object> objectObjectMap = v21_connection.v21executeQuery(query);
        return objectObjectMap;
        //return objectObjectMap.get("ORDER_ID").toString();
    }
    public String getCTNStatus(){
        String CTN_Status=null;
        //
        String query6 =  "select CTN_STATUS from "+dbConnectionQueryPoint+".CTN_INV where CTN ='"+CTN +"'";
        //2505522021
        System.out.println("The getCTNStatus query :" +query6);
       Map<Object, Object> objectObjectMap = v21_connection.v21executeQuery(query6);
         CTN_Status= objectObjectMap.get("CTN_STATUS").toString();
        return CTN_Status;
    }
    public String getCTNStatus(String CTN){
        String query6 =  "select CTN_STATUS from "+dbConnectionQueryPoint+".CTN_INV where CTN ='" +CTN + "'";
        Map<Object, Object> objectObjectMap = v21_connection.v21executeQuery(query6);
        return objectObjectMap.get("CTN_STATUS").toString();
    }
*/
    public String orderDetail(String notification_id, String type) throws ParserConfigurationException, IOException, SAXException {

        Map<Object, Object> objMap = ens_connection.ensexecuteQuery("select content_xml from notification_content where notification_id='" + notification_id + "'");
        // System.out.println("Ver code is "+objMap.get("Verification_Code").toString());
        String res = objMap.toString();
        System.out.println("Notifiaction Message --- " + res);
        String otpcode = null;
        if (type.equals("CPP_ADDON_ENROLLMENT")) {
            // CTN                          ORDER                               MSF VALUE
            otpcode = res.substring(406, 416) + ";" + res.substring(2349, 2356) + ";" + res.substring(2073, 2075);
        }
        if (type.equals("CPP_ORDER_ACTIVATION")) {
            // CTN                          ORDER                               PLAN VALUE
            otpcode = res.substring(406, 416) + ";" + res.substring(873, 880) + ";" + res.substring(591, 593);
        }
        if (type.equals("CPP_PPC_CONFIRMATION")) {
            // CTN                          ORDER                               PLAN VALUE
            otpcode = res.substring(406, 416) + ";" + res.substring(2180, 2187) + ";" + res.substring(589, 591);
        }
        return otpcode;

    }

    public String getOrderID(String emailId, String temp) {
        Map<Object, Object> result = ens_connection.ensexecuteQuery("select EMAIL_ADDRESS.notification_id from NOTIFICATION_TEMPLATE inner JOIN EMAIL_ADDRESS ON EMAIL_ADDRESS.NOTIFICATION_ID = NOTIFICATION_TEMPLATE.NOTIFICATION_ID where EMAIL_ADDRESS.email= '" + emailId + "' and NOTIFICATION_TEMPLATE.TEMPLATE_TYPE = '" + temp + "' ORDER BY NOTIFICATION_TEMPLATE.NOTIFICATION_ID ASC");
        //Map<Object, Object> result = ens_connection.ensexecuteQuery("select * from (select EMAIL_ADDRESS.notification_id from NOTIFICATION_TEMPLATE inner JOIN EMAIL_ADDRESS ON EMAIL_ADDRESS.NOTIFICATION_ID = NOTIFICATION_TEMPLATE.NOTIFICATION_ID where EMAIL_ADDRESS.email= '" +emailId+ "' and NOTIFICATION_TEMPLATE.TEMPLATE_TYPE = 'EAS_OTP')t where t.rn=1" );
        notification_id = result.get("NOTIFICATION_ID").toString();
        System.out.println("notification_id" + notification_id);
        return notification_id;
    }

    public String getProductorderID(String emailId,String template) throws SQLException {
        String res = "";
        ensDBConnection("qa1");
        // result = ens_connection.ensexecuteQuery("select EMAIL_ADDRESS.notification_id from NOTIFICATION_TEMPLATE inner JOIN EMAIL_ADDRESS ON EMAIL_ADDRESS.NOTIFICATION_ID = NOTIFICATION_TEMPLATE.NOTIFICATION_ID where EMAIL_ADDRESS.email= '" + emailId + "' and NOTIFICATION_TEMPLATE.TEMPLATE_TYPE = 'CPP_ORDER_ACTIVATION'");
        result = ens_connection.ensexecuteQuery("select EMAIL_ADDRESS.notification_id from NOTIFICATION_TEMPLATE inner JOIN EMAIL_ADDRESS ON EMAIL_ADDRESS.NOTIFICATION_ID = NOTIFICATION_TEMPLATE.NOTIFICATION_ID where EMAIL_ADDRESS.email= '" + emailId + "' and NOTIFICATION_TEMPLATE.TEMPLATE_TYPE = '" + template + "'");
        System.out.println("the result is " + result.size());
        System.out.println("the result is " + result.values());
        System.out.println("the result is " + result.isEmpty());
        if (result.size() != 1) {
            System.out.println("the result is " + result.values());
            notification_id = result.get("NOTIFICATION_ID").toString();
            System.out.println("notification_id" + notification_id);
            Map<Object, Object> objMap = ens_connection.ensexecuteQuery("select content_xml from notification_content where notification_id='" + notification_id + "'");
            res = objMap.toString();
            System.out.println("Result is " + res);
            System.out.println("Ver code is " + objMap.values().toString());
            JSONObject xmlJSONObj = XML.toJSONObject(objMap.values().toString());
            System.out.println(xmlJSONObj);
            /* String productorderID = xmlJSONObj.getString("OrderNumber");
            System.out.println("The Productorder id is: " + productorderID);*/
        } else {
            ensDBConnection("qa4");
           // result = ens_connection.ensexecuteQuery("select EMAIL_ADDRESS.notification_id from NOTIFICATION_TEMPLATE inner JOIN EMAIL_ADDRESS ON EMAIL_ADDRESS.NOTIFICATION_ID = NOTIFICATION_TEMPLATE.NOTIFICATION_ID where EMAIL_ADDRESS.email= '" + emailId + "' and NOTIFICATION_TEMPLATE.TEMPLATE_TYPE = 'CPP_ORDER_ACTIVATION'");
            result = ens_connection.ensexecuteQuery("select EMAIL_ADDRESS.notification_id from NOTIFICATION_TEMPLATE inner JOIN EMAIL_ADDRESS ON EMAIL_ADDRESS.NOTIFICATION_ID = NOTIFICATION_TEMPLATE.NOTIFICATION_ID where EMAIL_ADDRESS.email= '" + emailId + "' and NOTIFICATION_TEMPLATE.TEMPLATE_TYPE = '" + template + "'");
            System.out.println("the result is " + result.values());
            if (result.size() != 1) {
                notification_id = result.get("NOTIFICATION_ID").toString();
                System.out.println("notification_id" + notification_id);
                Map<Object, Object> objMap = ens_connection.ensexecuteQuery("select content_xml from notification_content where notification_id='" + notification_id + "'");
                res = objMap.toString();
                System.out.println("Result is " + res);
                System.out.println("Ver code is " + objMap.values().toString());
                JSONObject xmlJSONObj = XML.toJSONObject(objMap.values().toString());
                System.out.println(xmlJSONObj);
                /* String productorderID = xmlJSONObj.getString("OrderNumber");
                System.out.println("The Productorder id is: " + productorderID);*/
            }
        }
        String otpcode = res;
        return otpcode;
    }


}

