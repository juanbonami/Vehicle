package com.qa.garage;

public class Car extends Vehicle {

	// field from Car class
	int seats;
	double retailPrice;

	Car(String name, int numOfSeats, double totalPrice, String c, int mpgC, int mpgH, double ftc) {
		super(name, c, mpgC, mpgH, ftc);
		seats = numOfSeats;
		retailPrice = totalPrice;
		this.id = 0;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
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
		