package com.coffee.decotator;

public abstract class CoffeeDecotator implements Coffee {
    protected Coffee coffee;
    
    public CoffeeDecotator(Coffee coffee) {
    	this.coffee=coffee;
    }
    
	@Override
	public String getDetail() {
		
		return coffee.getDetail();
	}

	@Override
	public double cost() {
		
		return coffee.cost();
	}

}
