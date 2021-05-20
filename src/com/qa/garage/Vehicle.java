package com.qa.garage;

public class Vehicle {
	private String color;
	private int mpgCity;
	private int mpgHighway;
	private double fuelTankCapacity;
	
	Vehicle(String c, int mpgC, int mpgH, double ftc) {
		this.color = c;
		this.mpgCity = mpgC;
		this.mpgHighway = mpgH;
		this.fuelTankCapacity = ftc;
	}
}


