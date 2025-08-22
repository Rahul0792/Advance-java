package com.Maven.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static Connection conn = null;
    public static  final String URL = "jdbc:mysql://localhost:3306/rahul?useSSL=false&serverTimezone=UTC";
    public static  final String USERNAME = "root";
    public static  final String PASSWORD = "8180079414";
    public static  final String DRIVER = "com.mysql.cj.jdbc.Driver";

    static {
        try{
            Class.forName(DRIVER);
        }catch (ClassNotFoundException exe){
            System.out.println("Class Not Found");
        }
    }
    public static Connection getConnection() {
        if(conn == null){
            try{
                DriverManager.getConnection(URL,USERNAME,PASSWORD);
            }catch (SQLException exe){
                System.out.println("Connection Failed ....!!!");
            }
        }
        return conn;
    }
}
