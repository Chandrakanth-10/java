package com.bigbazzar.apprealexample;

public class Appereal {
	String type;
	String color;
	char size;
	}

	public static void main(String[] args) {
		Appereal a1 = new Appereal("Jean", "blue", 'M');
		a1.showDetails();

		Appereal a2 = new Appereal("tShirt", "Black", 'L');
		a2.showDetails();
	}

	Appereal(String type, String color, char size) {
		this.type = type;
		this.size = size;
		this.color = "black";
	}

	Appereal(String type, char size) {
		this.type = type;
		this.size = size;
		this.color = "Black";
	}

	void showDetails() {
		System.out.println(this.type + " " + this.color + " " + this.size);
	}

}
