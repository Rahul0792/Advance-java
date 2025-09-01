package com.It_shaala.dao;

import com.It_shaala.model.Course;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class Coursedao {

    public  void addCourse(Course course){
        System.out.println("Course Added...");

    }

    public void updateCourse(Course course){
        System.out.println("Course updated...");
    }

    public void deleteCourse(Course course){
        System.out.println("Course Deleted...");
    }

    public Course getCourseById(int id){
        System.out.println("Course Retrieved...");
        return null;
    }

    public List<Course> getAllCourses(){
        System.out.println("Course Retribed All Course...");
        return null;
    }
}
