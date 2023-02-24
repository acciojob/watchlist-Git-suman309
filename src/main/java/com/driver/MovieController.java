package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @PutMapping("/movies/add-movie-director-pair")
    public ResponseEntity<String> addMovieDirectorPair(@RequestParam String movieName, @RequestParam String directorName){
        ms.addMovieDirectorPair(movieName,directorName);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }
    @GetMapping("/movies/get-movie-by-name/{name}")
    public ResponseEntity<Movie> getMovieByName(@PathVariable String name){
    Movie movieDetails = ms.getMovieByName(name);
    return new ResponseEntity<>(movieDetails,HttpStatus.OK);
    }
    @GetMapping("/movies/get-director-by-name/{name}")
    public ResponseEntity<Director> getDirectorByName(@PathVariable String name){
        Director d = ms.getDirectorByName(name);
        return new ResponseEntity<>(d,HttpStatus.OK);
    }
    @GetMapping("/movies/get-movies-by-director-name/{director}")
    public ResponseEntity<List<String>> getMoviesByDirectorName(@PathVariable String director){
        List<String> movieList =ms.getMoviesByDirectorName(director);
        return new ResponseEntity<>(movieList,HttpStatus.FOUND);
    }

    @GetMapping("/movies/get-all-movies")
    public ResponseEntity<List<String>> findAllMovies(){
        List<String> movies = ms.allMoviesList();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @DeleteMapping("/movies/delete-director-by-name")
    public ResponseEntity<String> deleteDirectorByName(@RequestParam(value = "director") String directorName){
        ms.deleteByDirectorName(directorName);
        return new ResponseEntity<>("Success", HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/movies/delete-all-directors")
    public ResponseEntity<String> deleteAllDirectors(){
        ms.deleteAllDirector();
        return new ResponseEntity<>("Success", HttpStatus.ACCEPTED);
    }





}
