package com.It_shaala.controller;

import com.It_shaala.model.Course;
import com.It_shaala.service.CourseService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CourseController {
//    Object Creation
    private CourseService courseService;

//    Field Base

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }

    public void updateCourse(Course course){
        courseService.updateCourse(course);
    }


    public void deleteCourse(Course course){
        courseService.deleteCourse(course);
    }


    public Course getCourseById(int id){
        return courseService.getCourseById(id);
    }


    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
}
