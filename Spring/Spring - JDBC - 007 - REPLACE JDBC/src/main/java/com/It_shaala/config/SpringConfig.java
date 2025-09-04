package com.It_shaala.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.naming.Name;
import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.It_shaala")
@PropertySource("classpath*:Application.properties")
public class SpringConfig {

@Autowired
    private Environment environment;

    @Bean
    public JdbcTemplate jdbcTemplate() {

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource DS = new DriverManagerDataSource();

//        DS.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        DS.setUrl("jdbc:mysql://localhost:3306/rahul?useSSL=false&serverTimezone=UTC");
//        DS.setUsername("root");
//        DS.setPassword("8180079414");

        DS.setDriverClassName(environment.getProperty("mysql.driver.class"));
        DS.setUrl(environment.getProperty("mysql.url"));
        DS.setUsername(environment.getProperty("mysql.username"));
        DS.setPassword(environment.getProperty("mysql.password"));

        return DS;
    }

}
