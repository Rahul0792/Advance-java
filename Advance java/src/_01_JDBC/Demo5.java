package _01_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo5 {
    public static void main(String[] args) throws ClassNotFoundException ,java.sql.SQLException{

        //Loading Object
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connection With Driver manager
        Connection connection = DriverManager.getConnection(Constant.url,Constant.Username,Constant.Password);

        //Create Statement Object
        Statement statement = connection.createStatement();

        //Execute Querry
        statement.execute("DROP TABLE IF EXISTS Rohan;\n");

        //Close Connection
        connection.close();

        System.out.println("Table Droppedd  !!!!!!!!");
    }
}
