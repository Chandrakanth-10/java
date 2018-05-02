package org.calculator.calculatorapp;

public class Hello {
	
	void greet() {
		System.out.println("Hello");
	}
	void greet(String name) {
		System.out.println("Hello " +name);
	}
	public static void main(String[] args) {
		Hello g = new Hello ();
		g.greet();
		g.greet("Ricky");
		
	}
}
