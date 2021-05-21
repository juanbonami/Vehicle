package com.qa.garage;

public class Rv extends Vehicle {
	
	boolean hasToilet;
	double retailPrice;

	Rv(boolean toilet, double totalPrice, String c, int mpgC, int mpgH, double ftc) {
		super(c, mpgC, mpgH, ftc);
		hasToilet = toilet;
		retailPrice = totalPrice;
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
	
	@Override
	public double getSalesTax() {
		double price;
		price = salesTax * retailPrice;
		return retailPrice + price;
		
	}
	
	
}
