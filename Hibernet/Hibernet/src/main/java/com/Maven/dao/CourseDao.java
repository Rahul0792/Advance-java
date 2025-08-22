package com.Maven.dao;

import com.Maven.model.Course;
import com.Maven.util.ConnectionUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.util.List;

public class CourseDao {
    public void addCourse(Course course){
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(course);
        tx.commit();
        session.close();
        sessionFactory.close();
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
