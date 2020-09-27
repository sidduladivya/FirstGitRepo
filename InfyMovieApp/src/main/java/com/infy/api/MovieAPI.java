package com.infy.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.model.Movie;

@CrossOrigin 
@RestController
@RequestMapping("MovieAPI")
public class MovieAPI {

	
	
	@GetMapping(value = "getAllMovies")
	public List<Movie> getAllMovies(){
		Movie movie1 = new Movie(101, "Abcd", 2.4f);
		Movie movie2 = new Movie(101, "Abcd", 2.4f);
		Movie movie3 = new Movie(101, "Abcd", 2.4f);
		Movie movie4 = new Movie(101, "Abcd", 2.4f);
		Movie movie5 = new Movie(101, "Abcd", 2.4f);
		List<Movie> movies = new ArrayList<>();
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		movies.add(movie4);
		movies.add(movie5);
		
		return movies;
	}
	
	
}
