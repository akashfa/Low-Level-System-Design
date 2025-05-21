package com.akash.main;

import com.akash.context.TravelContext;

import coma.akash.travel.Bus;
import coma.akash.travel.Car;
import coma.akash.travel.Train;

public class Main {

	public static void main(String[] args) {
	
		
		TravelContext context=new TravelContext();
		System.out.println("*****************Car Detailed ***************");
		context.setContext(new Car());
		context.showDetailed();
		
		System.out.println("*****************Bus Detailed ***************** ");
		context.setContext(new Bus());
		context.showDetailed();
		
		
		System.out.println("*****************Train Detailed******************* ");
		context.setContext(new Train());
		context.showDetailed();
		
	}

}
