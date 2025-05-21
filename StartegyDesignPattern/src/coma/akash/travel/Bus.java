package coma.akash.travel;

public class Bus implements Travel {

	@Override
	public void costCalculation() {
		System.out.println("Bus Cost:: 300");

	}

	@Override
	public void timeEstimation() {
		System.out.println("Bus Time:: 3 hours");

	}

}
