package com.Maven.dao;

import com.Maven.model.Course;
import com.Maven.util.ConnectionUtil;

import java.sql.Connection;
import java.util.List;

public class CourseDao {
    public void addCourse(Course course){
        Connection connection = ConnectionUtil.getConnection();
    }
    public void updateCourse(Course course){
        Connection connection = ConnectionUtil.getConnection();

    }
    public void deleteCourse(int id){
        Connection connection = ConnectionUtil.getConnection();

    }
    public void getCourse(int id){
        Connection connection = ConnectionUtil.getConnection();

    }
    public List<Course> getAllCourses(){
        Connection connection = ConnectionUtil.getConnection();
        return null;}
}
