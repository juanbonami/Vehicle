package com.qa.garage;

public class Car extends Vehicle {
	
	// field from Car class
	int seats;

	Car(int numOfSeats, String c, int mpgC, int mpgH, double ftc) {
		super(c, mpgC, mpgH, ftc);
		seats = numOfSeats;
	}
}
		