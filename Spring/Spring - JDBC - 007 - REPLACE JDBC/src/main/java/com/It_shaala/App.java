package com.It_shaala;

import com.It_shaala.Controller.CourseController;
import com.It_shaala.Model.Course;
import com.It_shaala.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        CourseController courseController = context.getBean(CourseController.class);
        courseController.Add(Course.builder()
                .name("Rahul")
                .id(101)
                .price(5000)
                .description("Bharadi")
                .duration("1 month").build());
        System.out.println( "Hello World!" );
    }
}
