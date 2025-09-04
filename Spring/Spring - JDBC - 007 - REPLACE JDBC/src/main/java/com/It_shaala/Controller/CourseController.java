package com.It_shaala.Controller;

import com.It_shaala.Model.Course;
import com.It_shaala.Service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
@AllArgsConstructor
@Controller
public class CourseController {
//    @Autowired
    private CourseService courseService;
    public void Add(Course course){
        courseService.Add(course);
    }
    public void update(Course course){
        courseService.update(course);

    }
    public void delete(Course course){
        courseService.delete(course);
    }
    public Course finfById(int id){return courseService.finfById(id);}
    public List<Course> findAll(){
        return courseService.findAll();
    }
}