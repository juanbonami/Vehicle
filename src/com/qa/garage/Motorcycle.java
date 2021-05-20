package com.qa.garage;

public class Motorcycle extends Vehicle {
	
	int topSpeed;
	
	Motorcycle(int speed, String c, int mpgC, int mpgH, double ftc) {
		super(c, mpgC, mpgH, ftc);
		topSpeed = speed;
	}

}
