package org.calculator.calculatorapp;

public class Calculatorfour {
	int add(int num1, int num2, int num3, int num4) {
		int res = num1 + num2 + num3 + num4;
		return res;
	}

	public static void main(String[] args) {
		Calculatorfour c = new Calculatorfour();
		int result = c.add(25, 35, 30, 40);
		System.out.println(result);
	}
}
