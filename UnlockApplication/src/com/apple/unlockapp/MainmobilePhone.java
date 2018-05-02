package com.apple.unlockapp;

public class MainmobilePhone {
	public static void main(String [] args) {
		System.out.println("Opening the Mobile Phone");
		MobilePhone m = new MobilePhone();
		System.out.println("Unlock the phone using Mobile phone");
		m.unlock(1234);
		System.out.println("This phone is unlocked using Pin");
		
	}

}
