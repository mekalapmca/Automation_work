package com.task3programs;

public class Arithmetic_Witharguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic_Witharguments obj1 = new Arithmetic_Witharguments();
		obj1.add(20, 30);
		obj1.sub(60, 30);
		obj1.mul(20, 20);
		obj1.div(6.9, 20.67);

	}

	public void add(int a, int b) {             // with arguments 

		int c = a + b;
		System.out.println("The Addition of two numbers are : " + a + " + " + b + " = " + c);
	}

	public void sub(int x, int y) {

		int result = x - y;
		System.out.println("The Subtraction of two numbers are : " + x + " - " + y + " = " + result);
	}

	public void mul(int a, int b) {

		double c = a * b;
		System.out.println("The Multiplication of two numbers are : " + a + " * " + b + " = " + c);

	}

	public void div(double x, double y) {

		double result = x / y;
		System.out.println("The Division of two numbers are : " + x + " / " + y + " = " + result);

	}
}
