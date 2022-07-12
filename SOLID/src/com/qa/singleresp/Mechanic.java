package com.qa.singleresp;

public class Mechanic extends Car {
	
	private String colour;
	
	public Mechanic() {
		
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	// functionality
    public void repaint(String colour){
        this.setColour(colour);
    }
	
}
