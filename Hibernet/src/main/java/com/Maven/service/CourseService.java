package com.Maven.service;

import com.Maven.dao.CourseDao;
import com.Maven.model.Course;

import java.util.List;

public class CourseService {
    private CourseDao courseDao = new CourseDao();
    public void addCourse(Course course){
        courseDao.addCourse(course);
    }
    public void updateCourse(Course course){
        courseDao.updateCourse(course);
    }
    public void deleteCourse(int id){
        courseDao.deleteCourse(id);
    }
    public List<Course> getCourse(int id){
        return courseDao.getAllCourses();
    }
    public List<Course> getAllCourses(){return null;}
}
