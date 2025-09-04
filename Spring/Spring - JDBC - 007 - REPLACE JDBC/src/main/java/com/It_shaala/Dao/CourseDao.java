package com.It_shaala.Dao;
import com.It_shaala.Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CourseDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void Add(Course course){
    String querry = "insert into course(name,price,description,duration) values(?,?,?,?)";
    jdbcTemplate.update(querry,course.getName()  ,course.getPrice(),
            course.getDescription(),course.getDuration());
        System.out.println("Cource Added");
    }
    public void update(Course course){

    }
    public void delete(Course course){}
    public Course finfById(int id){return null;}
    public List<Course> findAll(){
        return null;
    }
}
