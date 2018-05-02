package com.benz.carmanufacture;

public class TestCar {
	public static void main(String [] args) {
		System.out.println("Creating a Car Object");
		Car c = new Car();
		System.out.println("Creating Petrol object");
		Petrol p = new Petrol();
		System.out.println("Filling the Car With Petrol");
		Smoke s = c.fill(p);
		System.out.println("recived Smoke");
		
	}

}
