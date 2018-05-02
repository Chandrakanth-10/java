package com.coffeeday.vendingproject;

public class TestvendingMachine { 
	public static void main(String [] args) {
		System.out.println("Creating a Juice Vending Machine Object");
		VendingMachine v = new VendingMachine();
		System.out.println("Creating coffeebeans object");
		coffeebeans c = new coffeebeans();
		coffee co = v.prepare(c);
		System.out.println("recived coffee");
		
		System.out.println("Creating a Juice Vending Machine Object");
		System.out.println("Creating water object");
		water w = new water();
		coldwater wo = v.prepare(w);
		System.out.println("Recived Water");
		
		System.out.println("Creating a Juice Vending Machine Object");
		System.out.println("Creating Apple object");
		apple a = new apple();
		applejuice aj = v.prepare(a);
		System.out.println("Recived Apple Juice");
	}

}
