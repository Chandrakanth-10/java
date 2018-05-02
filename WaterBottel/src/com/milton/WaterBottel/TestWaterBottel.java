package com.milton.WaterBottel;

public class TestWaterBottel {
	public static void main(String[] args) {
		System.out.println("Milk is Present");
		Milk doodh = new Milk();
		System.out.println(doodh);
		System.out.println("Bottel is present");
		Bottel b = new Bottel();
		System.out.println("Storing the milk in the bottle");
		b.store(doodh);
		System.out.println("Completed");

	}

}
