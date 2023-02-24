package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository mr;

    public void addMovie(Movie m){
        mr.addMovie(m);
    }
    public void addDirector(Director d){
        mr.addDirector(d);
    }

    public void addMovieDirectorPair(String movieName, String directorName){
        mr.addMovieDirectorPair(movieName,directorName);
    }

    public Movie getMovieByName(String movieName){
        return mr.getMovieByName(movieName);
    }
    public Director getDirectorByName(String directorName){
        return mr.getDirectorByName(directorName);
    }

    public List<String> getMoviesByDirectorName(String directorName){
        return mr.getMoviesByDirectorName(directorName);
    }

    public List<String> allMoviesList() {
        return mr.allMoviesList();
    }

    public void deleteByDirectorName(String directorName) {
        mr.deleteByDirectorName(directorName);
    }

    public void deleteAllDirector() {
        mr.deleteAllDirector();
    }
}
