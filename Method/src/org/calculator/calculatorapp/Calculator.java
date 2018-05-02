package org.calculator.calculatorapp;


public class Calculator {
	int add(int num1, int num2) {
		int res = num1 + num2;
		return res;

	}
	
	
	int mul(int num1, int num2) {
		int res = num1 * num2;
		return res;
	}
	
	int convertHoursToMinutes(int num) {
		int res = num * 60;
		return res;
	}
	
	int div(int num1, int num2) {
		int res = num1 / num2;
		return res;
	}
	
	int cubeofNumber (int num ) {
		int res = num * num * num;
		return res;
		}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int result = c.add(25, 35);
		System.out.println(result);
		System.out.println(c.add(21,21));
		System.out.println(c.mul(10, 5));
		System.out.println(c.cubeofNumber((5)));
		System.out.println(c.convertHoursToMinutes(48));
		
	}
}
