package com.paytm.login;

public class Login {
	void login(Long mobilenumber, String password) {
		System.out.println("Logged in succesfully using:" + mobilenumber);
	}

	void login(String email, String password) {
		System.out.println("Logged in using" +email);
	}

}
