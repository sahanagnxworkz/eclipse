package com.xworkz.interfaceProgram.ruler;

public interface ArmyRule {
	boolean idName();

	boolean idNumber();

	double phoneNumber();

	boolean address();

	static boolean dispaly() {
		System.out.println("static mehtod");
		return true;
	}
}
