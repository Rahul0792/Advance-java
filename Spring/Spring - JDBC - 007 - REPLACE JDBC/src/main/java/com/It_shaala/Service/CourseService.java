package com.It_shaala.Service;

import com.It_shaala.Dao.CourseDao;
import com.It_shaala.Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseDao courseDao;

    public void Add(Course course) {
        courseDao.Add(course);
    }

    public void update(Course course) {
        courseDao.update(course);
    }

    public void delete(Course course) {
        courseDao.delete(course);
    }

    public Course finfById(int id) {
        return courseDao.finfById(id);
    }

    public List<Course> findAll() {
        return courseDao.findAll();
    }
}



