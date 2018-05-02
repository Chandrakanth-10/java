package com.coffeeday.vendingproject;

public class VendingMachine {
	coffee prepare(coffeebeans c) {
		System.out.println("Fill coffee beans");
		System.out.println("Prepare coffee");
		coffee co = new coffee();
		System.out.println("Returing coffee to the Buyer");
		return co;
	}

	coldwater prepare(water w) {
		System.out.println("Fill Water");
		System.out.println("Processes Water");
		coldwater wo = new coldwater();
		System.out.println("Returing Cold water to the Buyer");
		return wo;
	}

	applejuice prepare(apple a) {
		System.out.println("Fill the machine with Apples");
		System.out.println("Prepare Apple Juice");
		applejuice aj = new applejuice();
		System.out.println("Returing apple juice to the Buyer");
		return aj;
	}
}
