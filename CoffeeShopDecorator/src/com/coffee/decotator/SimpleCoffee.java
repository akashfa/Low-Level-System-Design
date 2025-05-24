package com.coffee.decotator;

public class SimpleCoffee implements Coffee {

	@Override
	public String getDetail() {
		
		return "Simple Coffee";
	}

	@Override
	public double cost() {
		
		return 10;
	}

}
