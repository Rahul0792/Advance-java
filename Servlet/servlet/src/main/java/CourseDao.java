import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDao  {
    public static  final String URL = "jdbc:mysql://localhost:3306/rahul?useSSL=false&serverTimezone=UTC";
    public static  final String USERNAME = "root";
    public static  final String PASSWORD = "8180079414";

    public List<Course> getAllCourses() throws SQLException {
        List<Course> courseList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("MySQL JDBC Driver not found", e);
        }

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement();

//             ResultSet rs = statement.executeQuery("SELECT * FROM course")) {
//            while (rs.next()) {
//                Course course = new Course();
//                course.setId(rs.getInt("Id"));
//                course.setName(rs.getString("name"));
//                course.setPrice(rs.getInt("Price"));
//                courseList.add(course);
//            }

            ResultSet rs = statement.executeQuery("SELECT * FROM course")) {
                while (rs.next()) {
                    Course course = new Course();
                    course.setId(rs.getInt("Id"));
                    course.setName(rs.getString("Name"));
                    course.setPrice(rs.getInt("Price"));
                    courseList.add(course);
                }
            }
        return courseList;
        }
    }


