package com.zee.zee5app.repository;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.dto.Register;

public interface MovieRepository {
	public String addMovie(Movie movie);
	public String updateMovie(String id, Movie movie);
	public Movie getMovieById(String id);
	public Movie[] getAllMovies();
	public String deleteMovieById(String id);


}
