package com.zee.zee5app.service;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.dto.Series;

public interface SeriesService {
	
	public String addSeries(Series series);
	public String updateSeries(String id, Series series);
	public Series getSeriesById(String id);
	public Series[] getAllSeriess();
	public String deleteSeriesById(String id);



}

