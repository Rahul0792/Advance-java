package _01_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLOutput;
import java.sql.Statement;

public class Demo6 {
    public static void main(String[] args) throws ClassNotFoundException,java.sql.SQLException{
        //Loading Object
        Class.forName("com.mysql.cj.jdbc.Driver");

//      Connection With Driver manager
        Connection connection = DriverManager.getConnection(Constant.url,Constant.Username,Constant.Password);

//      Statement creation
        Statement statement = connection.createStatement();

//      Querry Execute
        statement.execute("CREATE TABLE IF NOT EXISTS Rohan (\n" +
                "    StudentID INT PRIMARY KEY,\n" +
                "    FirstName VARCHAR(50) NOT NULL,\n" +
                "    LastName VARCHAR(50),\n" +
                "    Age INT,\n" +
                "    Email VARCHAR(100) UNIQUE\n" +
                ");");
        statement.executeUpdate("INSERT INTO Rohan (StudentID, FirstName, LastName, Age, Email)\n" +
                "VALUES\n" +
                "(1, 'Rahul', 'Khilari', 22, 'rahul@example.com'),\n" +
                "(2, 'Priya', 'Patil', 23, 'priya@example.com'),\n" +
                "(3, 'Amit', 'Sharma', 24, 'amit@example.com'),\n" +
                "(4, 'Sneha', 'Deshmukh', 21, 'sneha@example.com'),\n" +
                "(5, 'Rohit', 'Jadhav', 22, 'rohit@example.com')");

//      Connection Close
        connection.close();
        System.out.println("Insert and updated !!!!!!!!!");
    }
}
