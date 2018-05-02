package com.bluestar.acmanufacture;

public class classTestAC {
	public static void main(String [] args)
	{
		Airconditioner ac = new Airconditioner();
		Water w = new Water ();
		Air a = ac.blow(w);
	}

}
