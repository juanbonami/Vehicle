package com.qa.garage;

public class Rv extends Vehicle {
	
	boolean hasToilet;

	Rv(boolean toilet ,String c, int mpgC, int mpgH, double ftc) {
		super(c, mpgC, mpgH, ftc);
		hasToilet = toilet;
	}

}
