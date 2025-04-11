package com.rogers.data.handlers;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class DBHandler {

    private String env;
    private static Connection v21Connection;
    private Map<Object,Object> resultMap;

    public DBHandler(String env){
        this.env = env;
        switch (env.toLowerCase()){
            case "sft04":
                try {
                    System.out.println("Establishing connection to V21 - SFT04");
                   // this.v21Connection = DriverManager.getConnection("jdbc:oracle:thin:@BHPDB473:1526:V21QA4", "QA4SEL", "QA4SEL");//QA4APPBL19
                    this.v21Connection = DriverManager.getConnection("jdbc:oracle:thin:@exa010ldcs-npe.rci.rogers.com:1526/V21QA4_SN.rci.rogers.com", "qa4env19sel", "qa4env19sel");//QA4APPBL19
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "sft06":
                try {
                    System.out.println("Establishing connection to V21 - SFT06");
                   // this.v21Connection = DriverManager.getConnection("jdbc:oracle:thin:@BHPDB474:1526:V21QA6", "QA6SEL", "QA6SEL");//QA6APPBL26
                    this.v21Connection = DriverManager.getConnection("jdbc:oracle:thin:@exa010ldcs-npe.rci.rogers.com:1526/V21QA6_SN.rci.rogers.com", "qa6env26sel", "qa6env26sel");//QA6APPBL26
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    System.out.println("Default connection to the V21 - SFT02");
                    //this.v21Connection = DriverManager.getConnection("jdbc:oracle:thin:@BHPDB471:1526:V21QA2", "QA2SEL", "QA2SEL");//QA2APPBL02
                    this.v21Connection = DriverManager.getConnection("jdbc:oracle:thin:@exa010ldcs-npe.rci.rogers.com:1526/V21QA2_SN.rci.rogers.com", "qa2env02sel", "qa2env02sel");//QA2APPBL02
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

    public Map<Object,Object> v21executeQuery(String query)  {
        resultMap = new HashMap<>();
        try {
            Statement statement = v21Connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet result = statement.executeQuery(query);
            System.out.println(result.getFetchSize());
            int columnCount = result.getMetaData().getColumnCount();
            result.last();
            int lastRow = result.getRow();
            resultMap.put("TotalRowsCount",lastRow);
            boolean first = result.first();
            System.out.println("Moved to First row back" + first);
            System.out.println("----------------------------- result getFetch size" + result.getFetchSize() + " :  result.getRow()" + result.getRow() + ":"  +columnCount);
            ResultSetMetaData meta = result.getMetaData();
            if (result.getRow()!=0) {
                do {
                    for (int count = 1; count <= columnCount; count++) {
                        System.out.println(Thread.currentThread().getName() + ":" + meta.getColumnLabel(count) + ":" + result.getString(count));
                        resultMap.put(meta.getColumnLabel(count), result.getString(count));
                    }
                } while (result.next());
            }else{
                System.out.println("No rows are retrieved for the query");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultMap;
    }
    public void v21executeQuery(String query,boolean multipleRows)  {
        try {
            Statement statement = v21Connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            System.out.println(result.getFetchSize());
            int columnCount = result.getMetaData().getColumnCount();
            result.last();
            int lastRowCount = result.getRow();
            System.out.println("----------------------------- result getFetch size" + result.getFetchSize() + " :  result.getRow()" + result.getRow() + ":"  +columnCount);

            ResultSetMetaData meta = result.getMetaData();
            while (result.next()) {
                for (int count = 1; count <= columnCount; count++) {
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
