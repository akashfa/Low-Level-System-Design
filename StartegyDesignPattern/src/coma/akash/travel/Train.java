package coma.akash.travel;

public class Train implements Travel {

	@Override
	public void costCalculation() {
		System.out.println("Train Cost:: 40");

	}

	@Override
	public void timeEstimation() {
	
     System.out.println("Bus Time 2 hours");
	}

}
