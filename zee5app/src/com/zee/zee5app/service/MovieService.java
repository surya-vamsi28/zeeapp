package com.zee.zee5app.service;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.repository.MovieRepository;


public class MovieService {

	private MovieRepository repository = MovieRepository.getInstance();
	private MovieService() {
		
	}
static MovieService service = null;

public static MovieService getInstance() {
	if(service==null) {
		service = new MovieService();
	}
	return service;
}
public String addMovie(Movie movie) {
	return this.repository.addMovie(movie);
}
public Movie getMovieById(String id) {
	return repository.getMovieById(id);
}
public Movie[] getMovies() {
	return repository.getMovies();
	
}
public String updateMovie(String id , Movie movie) {
	return repository.updateMovie(id, movie);
}
public String deleteMovie(String id) {
	return repository.deleteMovie(id);
}
}



