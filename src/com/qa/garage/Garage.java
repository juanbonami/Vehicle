package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	public static void main(String[] args) {
//		 List<Vehicle> garage = new ArrayList<>();
//		garage.add(new Car(4, "red", 22, 25, 50.4));
//		garage.add(new Motorcycle(120, "green", 23, 27, 30.3));
//		garage.add(new Rv(true, "grey", 18, 25, 60.1));
		bill(garageInventory());
		
	}
	
	static void bill(List<Vehicle> vehicle) {
		for (Vehicle v : vehicle) {
			System.out.println(v.getColor());
		}
	}
	
	static List<Vehicle> garageInventory() {
		 List<Vehicle> garage = new ArrayList<>();
		garage.add(new Car(4, "red", 22, 25, 50.4));
		garage.add(new Motorcycle(120, "green", 23, 27, 30.3));
		garage.add(new Rv(true, "grey", 18, 25, 60.1));
		
		return garage;
	}
}
