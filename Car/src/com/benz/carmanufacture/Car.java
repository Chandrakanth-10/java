package com.benz.carmanufacture;

public class Car {
	Smoke fill(Petrol p) {
		System.out.println("Fill Petrol");
		System.out.println("Generating Smoke");
		Smoke s = new Smoke();
		System.out.println("Returing Smoke");
		return s;
	}

	Smoke fill(Diesel d) {
		System.out.println("Accepting Diesel");
		System.out.println("Generating Smoke");
		Smoke s = new Smoke();
		System.out.println("Returing Smoke");
		return s;
	}

	Smoke fill(Gasoline G) {
		System.out.println("Accepting Gasoline");
		System.out.println("Generating Smoke");
		Smoke s = new Smoke();
		System.out.println("Returing Smoke");
		return s;
	}

}
