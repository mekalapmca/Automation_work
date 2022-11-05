package com.newtaskprograms;

public class Breakexecution {

	public static void main(String[] args) {
		int num[] = new int[5];
		num[0] = 12;
		num[1] = 34;
		num[2] = 66;
		num[3] = 85;
		num[4] = 900;
		int size = num.length;
		System.out.println("numbers list");
		for (int i = 0; i < size; i++) {
			System.out.println(num[i]);
			if (num[i] == 85) {
				
				break;
			}
		}
	}

}
