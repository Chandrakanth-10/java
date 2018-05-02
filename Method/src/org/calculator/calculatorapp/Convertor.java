package org.calculator.calculatorapp;

public class Convertor {
	double convertCelciusToFahrenheit(double celcius) {
		double fahrenheit = celcius * 1.8 + 32;
		return fahrenheit;
	}
	
	public static void main(String[]args) {
		Convertor c = new Convertor();
		double fahrenhit = c.convertCelciusToFahrenheit(38);
		System.out.println(fahrenhit);
		System.out.println(c.convertCelciusToFahrenheit(100.4));
	}

}
