package com.akash.context;

import coma.akash.travel.Travel;

public class TravelContext {
    Travel travel;
    
    public void setContext(Travel travel){
    	this.travel=travel;
    }
    public void showDetailed() {
    	travel.costCalculation();
    	travel.timeEstimation();
    }
}
