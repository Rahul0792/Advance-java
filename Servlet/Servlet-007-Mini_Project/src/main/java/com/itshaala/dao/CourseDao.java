package com.itshaala.dao;

import com.itshaala.model.Course;
import com.itshaala.util.DbConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class CourseDao {

    public void addCourse( Course course) {
    Connection conn = DbConnectionUtil.getConnection();
    String querry = "INSERT INTO course (name, duration, price, description)VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = null;
    try{
        preparedStatement = conn.prepareStatement(querry);
        preparedStatement.setString(1, course.getName());
        preparedStatement.setString(2, course.getDuration());
        preparedStatement.setInt(3, course.getPrice());
        preparedStatement.setString(4, course.getDescription());
        preparedStatement.executeUpdate();
        conn.close();
    } catch (SQLException e){
        System.out.println(e.getMessage() + " Sql Exception");
    }finally {
        System.out.println("Course Created .. ");
    }
    }

    public void UpdateCourse(Course course){
        Connection conn = DbConnectionUtil.getConnection();
        String querry = "UPDATE course SET name = ?, duration = ?, price = ?, description = ? WHERE id = ?";
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = conn.prepareStatement(querry);
            preparedStatement.setString(1, course.getName());
            preparedStatement.setString(2, course.getDuration());
            preparedStatement.setInt(3, course.getPrice());
            preparedStatement.setString(4, course.getDescription());
            preparedStatement.setInt(5,course.getId());
            preparedStatement.executeUpdate();
            conn.close();

        } catch (SQLException e){
            System.out.println(e.getMessage() + " Sql Exception");
        }finally {
            System.out.println("Course Updated  .. ");
        }
    };

    public void deleteCourse(int courseId){
        Connection conn = DbConnectionUtil.getConnection();
        String querry = "DELETE FROM course WHERE id = ?;\n";
        PreparedStatement preparedStatement = null;
        try{
            preparedStatement = conn.prepareStatement(querry);
            preparedStatement.setInt(5,courseId);
            preparedStatement.executeUpdate();
            conn.close();

        } catch (SQLException e){
            System.out.println(e.getMessage() + " Sql Exception");
        }finally {
            System.out.println("Course Deleted  .. ");
        }
    };

    public Course getCourseById(int courseId){
        Connection conn = DbConnectionUtil.getConnection();
        String querry = "select * from course where id = ? ";
        PreparedStatement preparedStatement = null;
        Course course = null;
        try{
            preparedStatement = conn.prepareStatement(querry);

            preparedStatement.setInt(1, courseId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                course = new Course();
                course.setId(resultSet.getInt("id"));
                course.setName(resultSet.getString("name"));
                course.setDuration(resultSet.getString("duration"));
                course.setPrice(resultSet.getInt("price"));
                course.setDescription(resultSet.getString("description"));
            }
            conn.close();
            return course;
        } catch (SQLException e){
            System.out.println(e.getMessage() + " Sql Exception");
        }finally {
            System.out.println("Course Created .. ");
        }
        return null;
    }

    public List<Course> getAllCourses(){
        Connection conn = DbConnectionUtil.getConnection();
        String querry = "select * from course";
        PreparedStatement preparedStatement = null;
       List<Course> courses = new ArrayList<Course>();
        try{
            preparedStatement = conn.prepareStatement(querry);

            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                Course course = new Course();
                course.setId(resultSet.getInt("id"));
                course.setName(resultSet.getString("name"));
                course.setDuration(resultSet.getString("duration"));
                course.setPrice(resultSet.getInt("price"));
                course.setDescription(resultSet.getString("description"));
                courses.add(course);
            }
            conn.close();
            return courses;
        } catch (SQLException e){
            System.out.println(e.getMessage() + " Sql Exception");
        }finally {
            System.out.println("Course Created .. ");
        }
        return null;
    }

}
