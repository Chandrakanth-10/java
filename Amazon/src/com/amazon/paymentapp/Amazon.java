package com.amazon.paymentapp;

public class Amazon {
	Product pay(Wallet w) {
		System.out.println("Accepted payment using Wallets");
		System.out.println("Product is Packed");
		Product p = new Product();
		System.out.println("Delivering the product to the Customer.");
		return p;
	}
	
	Product pay(CreditCard c) {
		System.out.println("Accepted payment using Wallets");
		System.out.println("Product is Packed");
		Product p = new Product();
		System.out.println("Delivering the product to the Customer.");
		return p;
	}
	
	Product pay(DebitCard d) {
		System.out.println("Accepted payment using Wallets");
		System.out.println("Product is Packed");
		Product p = new Product();
		System.out.println(p);
		System.out.println("Delivering the product to the Customer.");
		return p;
	}

}
