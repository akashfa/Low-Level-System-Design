package com.akash.Calculate;

import com.akash.Shapes.Shapes;

public class AreaCalculator {
      
	public double areaCalculator(Shapes[]shapes) {
		double area=0;
		for(Shapes shape:shapes) {
			area+=shape.area();
		}
		return area;
	}
}
