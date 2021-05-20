package com.qa.garage;

public class Car extends Vehicle {
	
	// field from Car class
	int seats;
	double retailPrice;

	Car(int numOfSeats, String c, int mpgC, int mpgH, double ftc) {
		super(c, mpgC, mpgH, ftc);
		seats = numOfSeats;
		retailPrice = 1600.52;
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
	
	
	
}
		