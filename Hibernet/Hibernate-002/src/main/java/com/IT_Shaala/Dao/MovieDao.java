package com.IT_Shaala.Dao;

import com.IT_Shaala.Model.Movie;
import com.IT_Shaala.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.List;


public class MovieDao {
    public void addMovie(Movie movie) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(movie);
        transaction.commit();
        session.close();
        System.out.println("Movie Addes Successfully");
    }

    public void updateMovie(Movie movie) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Movie fetchMovie = session.find(Movie.class, movie.getId());
        if (fetchMovie != null) {
            Transaction transaction = session.beginTransaction();
            session.persist(movie);
            System.out.println("Movie Updated Successfully ...........");
            transaction.commit();
        }else {
            System.out.println("Movie Not Found  !!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        session.close();
    }

    public void deleteMovie(Movie movie) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Movie fetchMovie = session.find(Movie.class, movie.getId());
        if (fetchMovie != null) {
            Transaction transaction = session.beginTransaction();
            session.remove(movie);
            System.out.println("Movie Deleted Successfully ...........");
            transaction.commit();
        }else {
            System.out.println("Movie Not Found  !!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        session.close();
    }

    public Movie getMovieById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Movie fetchMovie = session.find(Movie.class, id);

        session.close();
        return fetchMovie;
    }

    public List<Movie> getAllMovies() {
        return null;
    }
}
