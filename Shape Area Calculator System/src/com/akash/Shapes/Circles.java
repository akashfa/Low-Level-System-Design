package com.akash.Shapes;

public class Circles implements Shapes {
  double radius;
    
   public Circles(double radius){
	   this.radius=radius;
   }
   

@Override
public double area() {
	
	return Math.PI*Math.pow(radius, 2);
}
  
}
