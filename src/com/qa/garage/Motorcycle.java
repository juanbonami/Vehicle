package com.qa.garage;

public class Motorcycle extends Vehicle {
	
	int topSpeed;
	double retailPrice;
	
	Motorcycle(String name, int speed, double totalPrice, String c, int mpgC, int mpgH, double ftc) {
		super(name, c, mpgC, mpgH, ftc);
		topSpeed = speed;
		retailPrice = totalPrice;
		this.id = 1;
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
	
	@Override
	public double getSalesTax() {
		double price;
		price = salesTax * retailPrice;
		return retailPrice + price;
		
	}
	

}
