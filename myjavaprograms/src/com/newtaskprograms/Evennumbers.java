package com.newtaskprograms;

public class Evennumbers {

	public static void main(String[] args) {
		System.out.println("Even numbers are:");
		for (int i = 0; i < 200; i++) {
			int a = i % 2;

			if (a == 0) {
				System.out.println(i);

			}
		}

	}

}
