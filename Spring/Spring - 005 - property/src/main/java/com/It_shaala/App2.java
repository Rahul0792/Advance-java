package com.It_shaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Environment environment = context.getEnvironment();
        System.out.println(environment.getProperty("id"));
        System.out.println(environment.getProperty("name"));
        System.out.println(environment.getProperty("description"));

    }
}
