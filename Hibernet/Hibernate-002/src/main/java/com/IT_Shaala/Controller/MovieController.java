package com.IT_Shaala.Controller;

import com.IT_Shaala.Model.Movie;
import com.IT_Shaala.Service.MovieService;

import java.util.List;

public class MovieController {

    private   MovieService movieService = new MovieService();

    public void addMovie(Movie movie){
        movieService.addMovie(movie);
    }

    public void updateMovie(Movie movie){
        movieService.updateMovie(movie);
    }

    public void deleteMovie(Movie movie){
        movieService.deleteMovie(movie);
    }

    public Movie getMovieById(int id) {
        return movieService.getMovieById(id);
    }

    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }
}
