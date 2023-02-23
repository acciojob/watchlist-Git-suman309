package com.driver;

import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class MovieRepository {
    private HashMap<String, Movie> movieDetails;
    private HashMap<String, Director> directorDetails;
    private HashMap<String, List<String>> directorMoviePair;

    public MovieRepository() {
        this.movieDetails = new HashMap<>();
        this.directorDetails = new HashMap<>();
        this.directorMoviePair = new HashMap<>();
    }
    public void addMovie(Movie m){
        movieDetails.put(m.getName(),m); //ham name ko get krge GS s & hm me store krge
    }
    public void addDirector(Director d){
        directorDetails.put(d.getName(),d);
    }


}
