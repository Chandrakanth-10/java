package org.calculator.calculatorapp;

public class Petrol {
	void calculateAmountOfPetrol(double money){
			double liters = money/74.38;
			System.out.println("You get "+liters);
		}
		public static void main(String[] args) {
			Petrol p = new Petrol();
			p.calculateAmountOfPetrol(1456.35);
		}
}
