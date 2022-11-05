package com.task3programs;

public class Arithmeticdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmeticdemo obj1 = new Arithmeticdemo();
		obj1.sum();
		obj1.sub();
		obj1.mul();
		obj1.div();

	}

	public void sum() { // without arguments
		int a = 80;
		int b = 30;
		int c = a + b;
		System.out.println("The Addition of two numbers are:" + c);
	}

	public void sub() {
		int x = 40;
		int y = 30;
		int result = x - y;
		System.out.println("The Subtraction of two numbers are:" + result);
	}

	public void mul() {
		int a = 20;
		int b = 50;
		int c = a * b;
		System.out.println("The Multiplication of two numbers are:" + c);

	}

	public void div() {
		double a = 23.34;
		double b = 12.78;
		double c = a / b;
		System.out.println("The Division of two numbers are:" + c);

	}
}
