package com.zee.zee5app.repository;

import com.zee.zee5app.dto.Movie;

public class MovieRepositor2y {
	
	private Movie[] movies = new Movie[10];
	private static int count = -1;
	private MovieRepository() {
		
	}
	private static MovieRepository movieRepository;
	public static MovieRepository getInstance() {
		if(movieRepository==null)
			movieRepository = new MovieRepository();
		return movieRepository;
	}
	
	public String addMovie(Movie movie) {
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
	
	public Movie[] getMovies() {
		return movies;
		
	}

	
	public Movie getMovieById(String id) 
	{
		for (Movie movie : movies) {
			if(movie!= null && movie.getMovie_id().equals(id)  ) {
				return( movie);
			}
		}
		return(null);
	}
	
	
	public String updateMovie(String id ,  Movie movie1) {
		int count1 = 0;
		for (Movie movie : movies) {
			if(movie!= null && movie.getMovie_id().equals(id)) {
				movies[count1] = movie1;
				return("Completed");
			}
			count1++;
			
		}
		return("Not Completed");
		
	}

	public String deleteMovie(String id) {
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



