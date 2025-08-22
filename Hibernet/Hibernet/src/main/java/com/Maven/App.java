package com.Maven;

import com.Maven.controller.CourseController;
import com.Maven.model.Course;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();
       /* Course course = Course.builder()
                .id(3)
                .name("DevOps with AWS")
                .price(1000)
                .duration("1 week")
                .description("AWS, Linux, Docker, Kubernetis")
                .build();
        courseController.updateCourse(course);*/

        // System.out.println(courseController.getCourse(3));
        courseController.getAllCourses().forEach(System.out::println);
    }
}