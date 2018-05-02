package org.calculator.calculatorapp;

public class Calculatorthree {
	int add(int num1, int num2, int num3) {
		int res = num1 + num2 + num3;
		return res;
	}

	public static void main(String[] args) {
		Calculatorthree c = new Calculatorthree();
		int result = c.add(25, 35, 30);
		System.out.println(result);
	}
}
