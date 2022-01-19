package com.zee.zee5app.service;

import com.zee.zee5app.dto.Series;
import com.zee.zee5app.repository.SeriesRepository;


public class SeriesService {

	private SeriesRepository repository = SeriesRepository.getInstance();
	private SeriesService() {
		
	}
static SeriesService service = null;

public static SeriesService getInstance() {
	if(service==null) {
		service = new SeriesService();
	}
	return service;
}
public String addSeries(Series series) {
	return this.repository.addSeries(series);
}
public Series getSeriesById(String id) {
	return repository.getSeriesById(id);
}
public Series[] getSeriess() {
	return repository.getSeriess();
	
}
public String updateSeries(String id , Series series) {
	return repository.updateSeries(id, series);
}
public String deleteSeries(String id) {
	return repository.deleteSeries(id);
}
}



