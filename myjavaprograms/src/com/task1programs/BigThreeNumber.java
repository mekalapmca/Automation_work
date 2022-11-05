package com.task1programs;

public class BigThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 80;
		int b = 80;
		int c = 80;
		if (a > b && a > c) {
			System.out.println("a is the biggest number:" + a);

		} else if (b > a && b > c) {
			System.out.println("b is the biggest number:" + b);
		} else if (c > a && c > b) {
			System.out.println("c is the biggest number:" + c);
		} else {
			System.out.println("Either numbers are big: A value is " + a + "B Value is " + b + "C value is " + c);
		}
	}
}
