package com.IT_Shaala;

import com.IT_Shaala.Controller.MovieController;
import com.IT_Shaala.Model.Movie;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        MovieController controller = new MovieController();
        Movie movie = new Movie();
        movie.setTitle("Ram");
        movie.setYear("2009");
        movie.setDirector("Kapil show");
        movie.setGender("Male");
        controller.addMovie(movie);
    }
}
