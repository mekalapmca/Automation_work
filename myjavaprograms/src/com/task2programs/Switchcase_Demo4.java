package com.task2programs;

public class Switchcase_Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "five";
		String value=str.toLowerCase();
		switch (value) {
		case "one":
			System.out.println("One");
			break;
		case "two":
			System.out.println("Two");
			break;
		case "three":
			System.out.println("Three");
			break;
		case "four":
			System.out.println("Four");
			break;
		default:
			System.out.println("No Match");
			break;
		}
	}
}
