package com.qa.singleresp;

public class Driver extends Car {
   
	private int mileage;
    
    public Driver() {
    	
    }    

    
    public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	// functionality
    public void drive(int milesDriven){
        this.setMileage(this.getMileage() + milesDriven);
    }
}