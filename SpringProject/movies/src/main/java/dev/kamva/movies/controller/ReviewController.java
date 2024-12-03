package dev.kamva.movies.controller;

import dev.kamva.movies.model.Movie;
import dev.kamva.movies.model.Reviews;
import dev.kamva.movies.service.ReviewService;
import dev.kamva.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @Autowired
    private MovieService movieService;

    @PostMapping("/api/v1/reviews")
    public ResponseEntity<Reviews> createReview(@RequestBody Map<String, String> payload) {
        // Retrieve the movie from the database by IMDb ID
        Movie movie = movieService.findMovieByImdbId(payload.get("imdbId"));

        if (movie == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Return 404 if movie not found
        }

        // Create a new review using the review body and the movie
        Reviews newReview = reviewService.createReview(payload.get("reviewBody"), movie);

        // Return the created review
        return new ResponseEntity<>(newReview, HttpStatus.CREATED);
    }


}