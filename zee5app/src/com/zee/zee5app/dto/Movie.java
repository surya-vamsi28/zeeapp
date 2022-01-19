package com.zee.zee5app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data


public class Movie {
	private String movie_id;
	private String movie_name;
	private String movie_category;
	private String movie_Release_Date;
	private String movie_trailer;
	private String movie_language;
	private String movie_hero;
	private int movie_length;
	
	public  Movie() {
		
		
		
	}
	
}
