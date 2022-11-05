package com.newtaskprograms;

public class Printpattern {

	public static void main(String[] args) {
		int i = 0;
		int num = 6;
		for (i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
