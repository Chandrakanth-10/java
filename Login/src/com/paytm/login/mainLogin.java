package com.paytm.login;

public class mainLogin {
	public static void main(String[] args) {
		System.out.println("Opening the paytm Website");
		Login p = new Login();
		System.out.println("Tryin to Login");
		p.login(9876543210L, "aplha@123");

	}

}
