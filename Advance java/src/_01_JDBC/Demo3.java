package _01_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo3 {
    public static void main(String[] args) throws ClassNotFoundException ,java.sql.SQLException{
        //Loading Object
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/rahul?useSSL=false&serverTimezone=UTC";
        String Username = "root";
        String Password = "8180079414";

        // Connection With Driver manager
        Connection connection = DriverManager.getConnection(url,Username,Password);

        //Create Statement Object
        Statement statement = connection.createStatement();

        //Execute Querry
        ResultSet resultSet = statement.executeQuery("Select * from students");
        while(resultSet.next()){
            System.out.println(
                    "ID: " + resultSet.getInt("StudentID") + "\t" +
                            "First Name: " + resultSet.getString("FirstName") + "\t" +
                            "Last Name: " + resultSet.getString("LastName") + "\t" +
                            "Age: " + resultSet.getInt("Age") + "\t" +
                            "Email: " + resultSet.getString("Email")
            );

        }

        //Close Connection
        resultSet.close();
            statement.close();
            connection.close();
    }
}
