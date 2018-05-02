package com.camlin.Marker;

public class ConstructorMarker {
	String color;
	int price = 50;
	String Brand = "Camlin";
	
	ConstructorMarker (String color){
		this.color = color;
		}
	public static void main (String [] args) {
		ConstructorMarker m1 = new ConstructorMarker("Black");
		System.out.println(m1.color+" " +m1.price+" " + m1.Brand);
		ConstructorMarker m2 = new ConstructorMarker("Green");
		System.out.println(m2.color+" " +m2.price+" " + m2.Brand);
	}

}
