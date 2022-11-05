package com.task3programs;

public class Matchingstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result1 = "Automation";
		String result2 = "automation";
		boolean compare_status = result1.equals(result2);
		boolean compare_status1 = result1.equalsIgnoreCase(result2);
		System.out.println("Comparing " + result1 + " and " + result2 + " : " + compare_status);
		System.out.println("Comparing " + result1 + " and " + result2 + " : " + compare_status1);


	}

}
