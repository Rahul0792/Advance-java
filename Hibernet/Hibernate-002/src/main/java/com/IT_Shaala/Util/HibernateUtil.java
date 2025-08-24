//package com.IT_Shaala.Util;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//public class HibernateUtil {
//private static SessionFactory sessionFactory;
//private static Configuration cfg = new Configuration();
//public static SessionFactory getSessionFactory() {
//    if (sessionFactory == null) {
//        cfg.configure("hibernate.cfg.xml");
//        cfg.buildSessionFactory();
//    }
//    return sessionFactory;
//}
//
//
//
package com.IT_Shaala.Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration cfg = new Configuration();
                cfg.configure("hibernate.cfg.xml");
                sessionFactory = cfg.buildSessionFactory();
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to create SessionFactory.");
            }
        }
        return sessionFactory;
    }
}
