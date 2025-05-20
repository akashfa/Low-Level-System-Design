package com.akash.Main;

import com.akash.Calculate.AreaCalculator;
import com.akash.Calculate.PrintArea;
import com.akash.Shapes.Circles;
import com.akash.Shapes.Rectangles;
import com.akash.Shapes.Shapes;
import com.akash.Shapes.Squars;

public class Main {
  
	public static void main(String[]args) {
		Shapes[]shape={
		                new Circles(5),
		                new Squars(4),
		                new Rectangles(3,6)
		                };
		
		
		AreaCalculator calculator=new AreaCalculator();
		double totalArea=calculator.areaCalculator(shape);
		
		PrintArea printArea=new PrintArea();
		System.out.println(printArea.printArea(totalArea));
	}
}
