package org.calculator.calculatorapp;

public class USDconvertor {
	void convertRupeesToUSD(double rupees) {
		double USD = rupees / 64.8;
		double commission = USD*0.03;
		double totalValue = USD - commission;
		System.out.println("Total Conversion Value is" +USD);
		System.out.println("Total Commission Taken is  " +commission);
		System.out.println("Final dollars Yet to get is " +totalValue );
	}
	public static void main(String[] args) {
		USDconvertor g =new USDconvertor();
		g.convertRupeesToUSD(156666);
		
	}

}
