package com.qa.garage;

public class Vehicle {
	protected double salesTax = 0.0625;
	private String color;
	private int mpgCity;
	private int mpgHighway;
	private double fuelTankCapacity;
	
	Vehicle( String c, int mpgC, int mpgH, double ftc) {
//		this.salesTax = st;
		this.color = c;
		this.mpgCity = mpgC;
		this.mpgHighway = mpgH;
		this.fuelTankCapacity = ftc;
	}

	public double getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMpgCity() {
		return mpgCity;
	}

	public void setMpgCity(int mpgCity) {
		this.mpgCity = mpgCity;
	}

	public int getMpgHighway() {
		return mpgHighway;
	}

	public void setMpgHighway(int mpgHighway) {
		this.mpgHighway = mpgHighway;
	}

	public double getFuelTankCapacity() {
		return fuelTankCapacity;
	}

	public void setFuelTankCapacity(double fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}

	
}


