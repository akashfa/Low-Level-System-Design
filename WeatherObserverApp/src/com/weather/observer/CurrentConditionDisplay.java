package com.weather.observer;

public class CurrentConditionDisplay implements IObserver {
   private float temprature;
   private float humidity;
	@Override
	public void update(float tempratuer, float humidity, float pressure) {
		this.temprature=tempratuer;
		this.humidity=humidity;
		display();

	}
	public void display() {
	
	   System.out.println("Temprature:: "+temprature+" Humidity:: "+humidity);	
	}

}
