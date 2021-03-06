package com.qa.garage;

public class Rv extends Vehicle {
	
	boolean hasToilet;
	double retailPrice;

	Rv(String name, boolean toilet, double totalPrice, String c, int mpgC, int mpgH, double ftc) {
		super(name, c, mpgC, mpgH, ftc);
		hasToilet = toilet;
		retailPrice = totalPrice;
		this.id = 2;
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
