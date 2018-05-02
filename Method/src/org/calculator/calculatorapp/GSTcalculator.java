package org.calculator.calculatorapp;

public class GSTcalculator {
	void calculateGST(double productPrice){
		double GST = productPrice * 0.18;
		double totalcost = productPrice + GST;
		System.out.println("The base Price Of The Product is" +productPrice);
		System.out.println("GST Of The Product Is " + GST);
		System.out.println("Total Cost of the product is " +totalcost );
		
	}
	public static void main(String[] args) {
		GSTcalculator g =new GSTcalculator();
		g.calculateGST(155.35);
	}
}
