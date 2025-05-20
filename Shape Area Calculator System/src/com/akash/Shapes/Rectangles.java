package com.akash.Shapes;

public class Rectangles implements Shapes {
    
	
	double width;
	double hight;
	
	public Rectangles(double width,double hight){
		this.width=width;
		this.hight=hight;
	}
	@Override
	public double area() {
		
		return width*hight;
	}

}
