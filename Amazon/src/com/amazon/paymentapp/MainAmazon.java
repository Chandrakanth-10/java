package com.amazon.paymentapp;

public class MainAmazon {
	public static void main(String[] args) {
		System.out.println("Opening the Amazon Website");
		Amazon a = new Amazon();
		System.out.println("We have debit Card");
		DebitCard d = new DebitCard();
		System.out.println("making the Payment using Debit Card");
		Product product = a.pay(d);
		System.out.println(product);
		System.out.println("Recived the Product");

	}

}
