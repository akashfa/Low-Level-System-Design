package com.coffee.decotator;

public class SugarDecotator extends CoffeeDecotator {

	public SugarDecotator(Coffee coffee) {
		super(coffee);
		
	}
	@Override
	public String getDetail() {
		
		return coffee.getDetail()+" Sugar";
	}

	@Override
	public double cost() {
		
		return coffee.cost()+20;
	}
}
