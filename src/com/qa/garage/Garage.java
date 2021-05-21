package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	public static void main(String[] args) {
		
		Car c = new Car(4, 16000 , "red", 22, 25, 50.4);
		Motorcycle m = new Motorcycle(120, 10500, "green", 23, 27, 30.3);
		Rv r = new Rv(true, 32200, "grey", 18, 25, 60.1);
		
		
		
		addVehicle(c);
		addVehicle(m);
		addVehicle(r);
		
		bill(garage);
		
	}
	
	// garage 
	static List<Vehicle> garage = new ArrayList<>();
	
	// returns price after tax
	static void bill(List<Vehicle> vehicle) {
		for (Vehicle v : vehicle) {
			System.out.println(v.getSalesTax());
		}
	}
	
	
	
	// adds an instance of a Vehicle to the List (Garage)
	static List<Vehicle> addVehicle(Vehicle v) {
		 garage.add(v);
		return garage;
	}
	
	
	// deletes Vehicle
	static List<Vehicle> deleteVehicle(Vehicle v) {
		garage.remove(v);
		return garage;
	}
}


