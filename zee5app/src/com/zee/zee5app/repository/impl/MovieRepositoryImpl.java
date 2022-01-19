package com.zee.zee5app.repository.impl;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.repository.MovieRepository;

public class MovieRepositoryImpl implements MovieRepository {
	private static MovieRepository repository;
	public static MovieRepository getInstance() {
		if(repository==null) {
			repository = new MovieRepositoryImpl();
		}
		return repository;
	}
	private Movie[] movies = new Movie[10];
	private static int count = -1;

	@Override
	public String addMovie(Movie movie) {
		// TODO Auto-generated method stub
		if(count == movies.length-1) {
			Movie temp[] = new Movie[movies.length*2];
			
			System.arraycopy(movies, 0, temp, 0, movies.length);
			movies = temp;
			movies[++count] = movie;
			return "array is full";
		}
		movies[++count] = movie;
		return "success";
	}

	@Override
	public String updateMovie(String id, Movie movie1) {
		// TODO Auto-generated method stub
		int count1 = 0;
		for (Movie movie : movies) {
			if(movie != null && movie.getMovie_id().equals(id)) {
				movies[count1] = movie1;
				return("Completed");
			}
			count1++;
			
		}
		return("Not Completed");
	}

	@Override
	public Movie getMovieById(String id) {
		// TODO Auto-generated method stub
		for (Movie movie : movies) {
			if(movie!= null && movie.getMovie_id().equals(id)  ) {
				return( movie);
			}
		}
		return(null);
	}

	@Override
	public Movie[] getAllMovies() {
		// TODO Auto-generated method stub
		return movies;
	}

	@Override
	public String deleteMovieById(String id) {
		// TODO Auto-generated method stub
		int count1 = 0;
		for (Movie movie : movies) {
			
			if(movie!= null && movie.getMovie_id().equals(id)  ) {
				System.arraycopy(movies, count1+1, movies, count1, movies.length-count1-1);
				movies[movies.length-1] = null;
				return("Completed");
			}
			count1++;
		}
		
		return("Not Completed");
	}

}
