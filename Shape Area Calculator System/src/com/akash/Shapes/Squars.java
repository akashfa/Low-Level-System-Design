package com.akash.Shapes;

public class Squars implements Shapes {
  double side;
  
  public Squars(double side){
	  this.side=side;
  }
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(side, 2);
	}

}
