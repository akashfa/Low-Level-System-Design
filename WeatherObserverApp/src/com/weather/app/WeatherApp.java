package com.weather.app;

import com.weather.observer.CurrentConditionDisplay;
import com.weather.observer.StatisticsDisplay;
import com.weather.subject.WeatherStationImp;

public class WeatherApp {

	public static void main(String[] args) {
		
		WeatherStationImp weatherStation=new WeatherStationImp();
		
		CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay();
		StatisticsDisplay statisticsDisplay=new StatisticsDisplay();
		
		weatherStation.registerObserver(currentConditionDisplay);
		weatherStation.registerObserver(statisticsDisplay);
		
		weatherStation.setData(28.5f, 65f, 1013f);
		weatherStation.setData(30.2f, 70f, 1012f);

	}

}
