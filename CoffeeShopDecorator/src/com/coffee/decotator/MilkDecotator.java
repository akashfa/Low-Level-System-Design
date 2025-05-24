package com.coffee.decotator;

public class MilkDecotator extends CoffeeDecotator{

	public MilkDecotator(Coffee coffee) {
		super(coffee);
	}
	@Override
	public String getDetail() {
		
		return super.coffee.getDetail()+" Milk";
	}

	@Override
	public double cost() {
		
		return super.coffee.cost()+15;
	}
}
