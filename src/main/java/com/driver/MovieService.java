package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
