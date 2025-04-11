package com.rogers.data.pojos;

import org.testng.Assert;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class DBHandlerENS {

    private String env;

    private Map<Object, Object> resultMap;
    private static Connection ensConnection;

    public DBHandlerENS(String env) {
        this.env = env;
        switch (env.toLowerCase()) {
            case "sft02":
                try {
                    System.out.println("Establishing connection to ENS - SFT06 QA4");//ENS_RGENSSFT04_READ == R0g3r5!/r3ad0nly --> 03   // ENS_RGENSSFT05_READ == R0g3r5! -->04  // ENS_RGENSSFT02_READ==R0g3r5!-->01
                    this.ensConnection = DriverManager.getConnection("jdbc:oracle:thin:@exa012ldc-npe.rci.rogers.com:1531/ENSQA2_SN", "ENS_RGENSSFT04_READ", "R0g3r5!"); //

                    //this.v21Connection = DriverManager.getConnection("jdbc:oracle:thin:@exa010ldcs-npe.rci.rogers.com:1526/V21QA4_SN.rci.rogers.com", "qa4env19sel", "qa4env19sel");//QA4APPBL19
                    System.out.println(this.ensConnection +"Establishing connection to ENS - SFT06 QA4");

                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "qa3":
                try {
                    System.out.println("Establishing connection to ENS - SFT06 QA3");
                    // this.v21Connection = DriverManager.getConnection("jdbc:oracle:thin:@BHPDB474:1526:V21QA6", "QA6SEL", "QA6SEL");//QA6APPBL26
                    this.ensConnection = DriverManager.getConnection("jdbc:oracle:thin:@exa012l-npe.rci.rogers.com:1531/ENSQA2_SN", "ENS_RGENSSFT04_READ", "rogers1a");//QA6APPBL26
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "qa1":
                try {
                    System.out.println("Establishing connection to ENS - SFT06 QA1");
                    // this.v21Connection = DriverManager.getConnection("jdbc:oracle:thin:@BHPDB474:1526:V21QA6", "QA6SEL", "QA6SEL");//QA6APPBL26
                    this.ensConnection = DriverManager.getConnection("jdbc:oracle:thin:@exa012ldc-npe.rci.rogers.com:1531/ENSQA2_SN", "ENS_RGENSSFT02_READ", "rogers1a");//QA6APPBL26
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "bss":
                try {
                    System.out.println("Establishing connection to BSS - SFT06 QA1");
                    // this.v21Connection = DriverManager.getConnection("jdbc:oracle:thin:@BHPDB474:1526:V21QA6", "QA6SEL", "QA6SEL");//QA6APPBL26
                    this.ensConnection = DriverManager.getConnection("jdbc:postgresql:@sc-881997976762-pp-wyi5jtiitn4u2-dbinstance-zlfkpuj8fdpf.clccww8hp8pv.ca-central-1.rds.amazonaws.com:5432/chatrbsscasldb", "casldbuser", "caslqa105");//QA6APPBL26
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    System.out.println("Establishing connection to ENS - SFT02 QA");  //ENS_RGENSSFT04_READ == r3ad0nly -->  03  // ENS_RGENSSFT05_READ == R0g3r5! -->04  // ENS_RGENSSFT02_READ==R0g3r5!-->01
                    this.ensConnection = DriverManager.getConnection("jdbc:oracle:thin:@exa012ldc-npe.rci.rogers.com:1531/ENSQA2_SN", "ENS_RGENSSFT04_READ", "R0g3r5!");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

    public Map<Object, Object> ensexecuteQuery(String query) {
        resultMap = new HashMap<>();
        try {
            Statement statement = ensConnection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet result = statement.executeQuery(query);
            System.out.println(result.getFetchSize());
            int columnCount = result.getMetaData().getColumnCount();
            result.last();
            int lastRow = result.getRow();
            resultMap.put("TotalRowsCount", lastRow);
            boolean first = result.first();
            System.out.println("Moved to First row back" + first);
            System.out.println("----------------------------- result getFetch size" + result.getFetchSize() + " :  result.getRow()" + result.getRow() + ":" + columnCount);
            ResultSetMetaData meta = result.getMetaData();
            if (result.getRow() != 0) {
                do {
                    for (int count = 1; count <= columnCount; count++) {
                        System.out.println(Thread.currentThread().getName() + ":" + meta.getColumnLabel(count) + ":" + result.getString(count));
                        resultMap.put(meta.getColumnLabel(count), result.getString(count));
                    }
                } while (result.next());
            } else {
                System.out.println("No rows are retrieved for the query");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return resultMap;
    }

    public void ensexecuteQuery(String query, boolean multipleRows) {
        try {
            Statement statement = ensConnection.createStatement();
            ResultSet result = statement.executeQuery(query);
            System.out.println(result.getFetchSize());
            int columnCount = result.getMetaData().getColumnCount();
            result.last();
            int lastRowCount = result.getRow();
            System.out.println("----------------------------- result getFetch size" + result.getFetchSize() + " :  result.getRow()" + result.getRow() + ":" + columnCount);

            ResultSetMetaData meta = result.getMetaData();
            while (result.next()) {
                for (int count = 1; count <= columnCount; count++) {
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void ensDBConnection(String env) throws SQLException {
        switch (env.toLowerCase()) {
            case "qa1":
                Connection ensConnection;
                try {

                    System.out.println("Establishing connection to ENS - QA1");//ENS_RGENSSFT04_READ
                    ensConnection = DriverManager.getConnection("jdbc:oracle:thin:@exa012ldc-npe.rci.rogers.com:1531/ENSQA2_SN", "ENS_RGENSSFT02_READ", "R0g3r5!");
                    System.out.println(ensConnection + "Establishing connection to ENS - QA1");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "qa4":
                try {
                    System.out.println("Establishing connection to ENS - QA4");//ENS_RGENSSFT04_READ
                    ensConnection = DriverManager.getConnection("jdbc:oracle:thin:@exa012ldc-npe.rci.rogers.com:1531/ENSQA2_SN", "ENS_RGENSSFT05_READ", "R0g3r5!");
                    System.out.println(ensConnection + "Establishing connection to ENS - QA4");
                } catch (SQLException e) {

                    e.printStackTrace();

                }
                break;

            default:
                try {

                    System.out.println("Establishing connection to ENS - SFT02 QA");
                    ensConnection = DriverManager.getConnection("jdbc:oracle:thin:@exa012l-npe.rci.rogers.com:1531/ENSQA2_SN.rci.rogers.com", "ENS_RGENSSFT02_READ", "rogers1a");

                } catch (SQLException e) {

                    e.printStackTrace();

                }

        }

    }
}
