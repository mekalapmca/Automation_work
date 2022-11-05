package com.task2programs;

public class Arithmetic {
	

	public static void main(String[] args) {
		
		
	
		Arithmetic obj1 = new Arithmetic();
		obj1.addition();// 30
		obj1.addition();// 30
		obj1.addition(5, 89);// 94
		obj1.addition();// 30
		obj1.addition(100, 200); // 300
	}

	public void addition() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("The addition of two numbers:" + c);
	}

	public void addition(int a, int b) {
		int c = a + b;
		System.out.println("The addition of two numbers:" + c);
	}
	

}

