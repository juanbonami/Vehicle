package com.qa.garage;

public class Rv extends Vehicle {
	
	boolean hasToilet;
	double retailPrice;

	Rv(boolean toilet ,String c, int mpgC, int mpgH, double ftc) {
		super(c, mpgC, mpgH, ftc);
		hasToilet = toilet;
	}

	public boolean isHasToilet() {
		return hasToilet;
	}

	public void setHasToilet(boolean hasToilet) {
		this.hasToilet = hasToilet;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
	
	

}
