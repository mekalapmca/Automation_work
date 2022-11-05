package com.polymorphism;

public class Polymorphismdemo1 {

	public static void main(String[] args) {

		Polymorphismdemo1 obj1 = new Polymorphismdemo1();
		//Classname objectname=new classname();
		obj1.add(23, 20);
		obj1.add(20, 20, 20);
		obj1.add(20.30, 20.30);
		obj1.add(20, 20.33);

	}

	public void add(int a, int b) {      //passing two arguments with same data type

		int c = a + b;
		System.out.println("sum of two numbers are:" + c);
	}

	public void add(int a, int b, int d) {     // passing three arguments with same data type
		int c = a + b + d;
		System.out.println("sum of Three numbers are:" + c);
	}

	public void add(double a, double b) {   // using double data type
		double c = a + b;
		System.out.println("sum of two numbers are:" + c);
	}

	public void add(int a, double b) {       // order of arguments

		double c = a + b;
		System.out.println("sum of two numbers are:" + c);
	}

}
