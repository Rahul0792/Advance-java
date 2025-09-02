package com.It_shaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws ClassNotFoundException{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Course course = context.getBean("course", Course.class);
        System.out.println(course);
    }
}
