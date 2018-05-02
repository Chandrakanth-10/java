package org.calculator.calculatorapp;

public class Calculatortwo {
	int add(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}

	public static void main(String[] args) {
		Calculatortwo c = new Calculatortwo ();
		int result = c.add(25, 35);
	    System.out.println(result);
	}
}