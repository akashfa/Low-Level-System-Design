package coma.akash.travel;

public class Car implements Travel {

	@Override
	public void costCalculation() {
		System.out.println("Car Cost:: 500");

	}

	@Override
	public void timeEstimation() {
	
     System.out.println("Car time 5 hours");
	}

}
