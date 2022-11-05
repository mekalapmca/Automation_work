package com.parametersprograms;

public class Parametersdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parametersdemo1 obj1 = new Parametersdemo1();
		obj1.sum(20, 30);
		obj1.sub(50, 20);

	}

	public void sum(int a, int b) {
		int c = a + b;
		System.out.println("The addition number is:" + c);
	}

	public void sub(double x, double y) {
		double result = x - y;
		System.out.println("The subtraction is :" + result);
	}

}
