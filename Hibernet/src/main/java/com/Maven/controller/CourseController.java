package com.Maven.controller;

import com.Maven.model.Course;
import com.Maven.service.CourseService;

import java.util.List;

public class CourseController {
    private CourseService courseService = new CourseService();
    public void addCourse(Course course){
        courseService.addCourse(course);
    }
    public void updateCourse(Course course){
        courseService.updateCourse(course);
    }
    public void deleteCourse(int id){
        courseService.deleteCourse(id);
    }
    public void getCourse(int id){
        courseService.getCourse(id);
    }
    public List<Course> getAllCourses(){
        return null;
    }
}
