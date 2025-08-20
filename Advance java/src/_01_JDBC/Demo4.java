package _01_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo4 {
    public static void main(String[] args) throws java.sql.SQLException,ClassNotFoundException{

        //Loading Object
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connection With Driver manager
        String Query = "CREATE TABLE Employee (\n" +
                "    StudentID INT PRIMARY KEY,\n" +
                "    FirstName VARCHAR(50) NOT NULL,\n" +
                "    LastName VARCHAR(50),\n" +
                "    Age INT,\n" +
                "    Email VARCHAR(100) UNIQUE\n" +
                ")";

        //Create Statement Object
        Connection connection = DriverManager.getConnection(Constant.url,Constant.Username,Constant.Password);

        //Execute Querry
        Statement statement = connection.createStatement();

        //Close Connection
        statement.executeUpdate(Query);

        connection.close();
        System.out.println("Table created");
    }
}
