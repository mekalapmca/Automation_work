package com.task2programs;

public class Switchcase_demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 50;
		String size;
		switch (number) {
		case 29:
			size = "small";
			break;
		case 42:
			size = "Medium";
			break;
		case 44:
			size = "Large";
			break;
		case 48:
			size = "Extra Large";
			break;
		default:
			size = "Unknown";
			break;
		}
		System.out.println("Selected Size = " + size);
	}
}
