package com.weather.observer;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements IObserver {
   List<Float>tempratuers=new ArrayList<>();
	@Override
	public void update(float tempratuer, float humidity, float pressure) {
		tempratuers.add(tempratuer);
		display();

	}
	public void display() {
	
	   float sum=0;
	   
	   for(float temp:tempratuers) {
		   sum+=temp;
	   }
	   float avg=sum/tempratuers.size();
	   System.out.println("Avg tempratuer::  "+avg);
	}

}
