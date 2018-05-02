package org.calculator.calculatorapp;


public class Testmultiply {
	int multiply(int num1, int num2) {
		int res = num1 * num2;
		return res;

	}
	
	public static void main(String[] args) {
		Testmultiply c = new Testmultiply();
		int result = c.multiply(25, 35);
		System.out.println(result);
		System.out.println(c.multiply(21,21));
		
	}
}
