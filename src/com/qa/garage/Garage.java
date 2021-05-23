package com.qa.garage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garage {
		
		 static List<Vehicle> g = new ArrayList<Vehicle>(Arrays.asList(
				new Car("honda", 4, 16000 , "red", 22, 25, 50.4),
				new Motorcycle("ducati", 120, 10500, "green", 23, 27, 30.3),
				new Rv("Entegra", true, 32200, "grey", 18, 25, 60.1)));
		 
		 static List<Vehicle> garage = new ArrayList<Vehicle>(g);
	
	
	
	// returns price after tax
	static void bill(List<Vehicle> vehicle) {
		for (Vehicle v : vehicle) {
			System.out.println(v.getSalesTax());
		}
	}
	
	// adds by id
	public static void addId(int id) {
		for (Vehicle v : g) {
			if (id == v.id) {
				garage.add(v);
				System.out.println(garage);
			}
		}
	}
	
	// adds by type
	public static void addType(String s) {
	for (Vehicle v : g) {
		if (s == v.getVehicleType()) {
			g.add(v);
			}
		}
	}
	
	
	// deletes by id
	 public static void deleteId(int id) {
		 for (Vehicle v : g) {
			if (id == v.id) {
				g.remove(v);
				}
			}
	 	}
	 
	 // deletes by type
	 public static void deleteType(String s) {
		 for (Vehicle v : g) {
				if (s == v.getVehicleType()) {
					g.add(v);
				}
			}
	 	}
	 
	 
	 
}


