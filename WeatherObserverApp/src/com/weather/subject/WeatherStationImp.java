package com.weather.subject;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import com.weather.observer.IObserver;

public class WeatherStationImp implements ISubject {
	
	private List<IObserver>observers;
	private float temprature;
	private float humidity;
	private float pressure;
	
	public WeatherStationImp(){
	observers=new ArrayList<>();
	}

	@Override
	public void registerObserver(IObserver o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(IObserver o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyObserver() {
		for(IObserver observer:observers) {
			observer.update(temprature, humidity, pressure);
		}
			
		
	}

	
	public void setData(float tempratuer,float humidity,float pressure) {
		this.temprature=tempratuer;
		this.humidity=humidity;
		this.pressure=pressure;
		notifyObserver();
	}

}
