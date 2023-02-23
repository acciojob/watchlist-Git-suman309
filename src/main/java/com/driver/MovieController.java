package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    private MovieService ms;

    @PostMapping("/movies/add-movie")
    public ResponseEntity<String> addMovie(@RequestBody Movie m){
        ms.addMovie(m);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    @PostMapping("/movies/add-director")
    public ResponseEntity<String> addDirector(@RequestBody Director d){
        ms.addDirector(d);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

}
