package com.task2programs;

public class Comparetostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "Mekala";
		String string2 = "MekaLA";
		boolean compare_status = string1.equals(string2);
		boolean compare_status1 = string1.equalsIgnoreCase(string2);
		System.out.println("Comparing " + string1 + " and " + string2 + " : " + compare_status);
		System.out.println("Comparing " + string1 + " and " + string2 + " : " + compare_status1);

	}

}
