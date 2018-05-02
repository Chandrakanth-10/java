package com.qucha.waterbottelmanufacture;

public class TestWaterBottel {
	public static void main(String[] args) {
		WaterBottel w1 = new WaterBottel();
		WaterBottel w2 = new WaterBottel();
		WaterBottel w3 = new WaterBottel();

		w1.color = "blue";
		w3.price = 500;

		System.out.println(w1); //
		System.out.println(w2);//
		System.out.println(w3);//
		System.out.println(w2.shape);

	}

}
