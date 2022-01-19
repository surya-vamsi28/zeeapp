package com.zee.zee5app.service.impl;

import com.zee.zee5app.dto.Series;
import com.zee.zee5app.repository.SeriesRepository;
import com.zee.zee5app.repository.impl.SeriesRepositoryImpl;
import com.zee.zee5app.service.SeriesService;

public class SeriesServiceImpl implements SeriesService {
	private static SeriesService service;
	public static SeriesService getInstance() {
		if(service==null) {
			service = new SeriesServiceImpl();
		}
		return service;
	}
	
	SeriesRepository seriesRepository = SeriesRepositoryImpl.getInstance();

	@Override
	public String addSeries(Series series) {
		// TODO Auto-generated method stub
		return seriesRepository.addSeries(series);
	}

	@Override
	public String updateSeries(String id, Series series) {
		// TODO Auto-generated method stub
		return seriesRepository.updateSeries(id, series);
	}

	@Override
	public Series getSeriesById(String id) {
		// TODO Auto-generated method stub
		return seriesRepository.getSeriesById(id);
	}

	@Override
	public Series[] getAllSeriess() {
		return seriesRepository.getAllSeriess();
	}

	@Override
	public String deleteSeriesById(String id) {
		// TODO Auto-generated method stub
		return seriesRepository.deleteSeriesById(id);
	}


}

