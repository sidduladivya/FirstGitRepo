package com.infy.model;

public class Movie {

	private Integer movieId;
	private String name;
	private Float rating;
	
	
	public Movie(Integer movieId, String name, Float rating) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.rating = rating;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getRating() {
		return rating;
	}
	public void setRating(Float rating) {
		this.rating = rating;
	}
}
