package com.camlin.Marker;

public class Marker {
	String color;
	int price = 50;
	String Brand = "Camlin";
	
	void showDetails(){
		System.out.println(color+" " +price+" " + Brand);
		
	}
	
	public static void main (String [] args) {
		Marker m1 = new Marker();
		System.out.println(m1);
		m1.showDetails();
		m1.color = "Black";
		m1.showDetails();
		
		Marker m2 = new Marker();
		System.out.println(m2);
		m2.showDetails();
		m2.color = "Red";
		m2.showDetails();
		
	}

}
	