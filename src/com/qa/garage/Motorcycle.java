package com.qa.garage;

public class Motorcycle extends Vehicle {
	
	int topSpeed;
	double retailPrice;
	
	Motorcycle(int speed, String c, int mpgC, int mpgH, double ftc) {
		super(c, mpgC, mpgH, ftc);
		topSpeed = speed;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
	

}
