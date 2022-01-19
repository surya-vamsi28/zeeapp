package com.zee.zee5app.dto;

import lombok.Data;

@Data

public class Series {
	private String series_id;
	private String series_name;
	private String series_category;
	private String series_release_date;
	private int series_seasons;
	private int series_total_episodes;
	private String series_language;
	private String series_hero;
	
	private Series() {
		System.out.println("done");
	}

}
