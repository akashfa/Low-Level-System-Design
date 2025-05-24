package com.coffee.decotator;

public class CoffeeApp {

	public static  void main(String[] args) {
		
		 Coffee myCoffee= new SimpleCoffee();
		 System.out.println(myCoffee.getDetail()+" $ "+myCoffee.cost());
		 
		 myCoffee=new MilkDecotator(myCoffee);
		 System.out.println(myCoffee.getDetail()+" $ "+myCoffee.cost());
		 
		 myCoffee=new SugarDecotator(myCoffee);
		 System.out.println(myCoffee.getDetail()+" $ "+myCoffee.cost());
		 
	}

}
