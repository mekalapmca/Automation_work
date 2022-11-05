package com.newtaskprograms;

public class Oddnumbers {

	public static void main(String[] args) {
		System.out.println("Odd numbers are:");
		for (int i = 1; i < 50; i++) {
			int b = i % 2;
			if (b == 1) {
				System.out.println(i);
			}
		}

	}

}
