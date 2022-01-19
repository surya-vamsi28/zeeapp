package com.zee.zee5app.repository;

import com.zee.zee5app.dto.Series;

public class SeriesRepository2 {
	
	private Series[] seriess = new Series[10];
	private static int count = -1;
	private SeriesRepository() {
		
	}
	private static SeriesRepository seriesRepository;
	public static SeriesRepository getInstance() {
		if(seriesRepository==null)
			seriesRepository = new SeriesRepository();
		return seriesRepository;
	}
	
	public String addSeries(Series series) {
		if(count == seriess.length-1) {
			Series temp[] = new Series[seriess.length*2];
			
			System.arraycopy(seriess, 0, temp, 0, seriess.length);
			seriess = temp;
			seriess[++count] = series;
			return "array is full";
		}
		seriess[++count] = series;
		return "success";
		}
	public Series[] getSeriess() {
		return seriess;
		
	}

	
	public Series getSeriesById(String id) 
	{
		for (Series series : seriess) {
			if(series!= null && series.getSeries_id().equals(id)  ) {
				return( series);
			}
		}
		return(null);
	}
	
	
	public String updateSeries(String id ,  Series series1) {
		int count1 = 0;
		for (Series series : seriess) {
			if(series!= null && series.getSeries_id().equals(id)) {
				seriess[count1] = series1;
				return("Completed");
			}
			count1++;
			
		}
		return("Not Completed");
		
	}

	public String deleteSeries(String id) {
		int count1 = 0;
		for (Series series : seriess) {
			
			if(series!= null && series.getSeries_id().equals(id)  ) {
				System.arraycopy(seriess, count1+1, seriess, count1, seriess.length-count1-1);
				seriess[seriess.length-1] = null;
				return("Completed");
			}
			count1++;
		}
		
		return("Not Completed");
	}
	}




