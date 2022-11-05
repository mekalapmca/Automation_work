package com.newtaskprograms;

public class Sumof5numbers {

	public static void main(String[] args) {
		double sum[] = new double[5];
		sum[0] = 10;
		sum[1] = 90.78;
		sum[2] = 111;
		sum[3] = 8989;
		sum[4] = 7876;
		int size = sum.length;
		double a = 0;

		for (int i = 0; i < size; i++) {
			a = a + sum[i];
		}
		double Avg=a/size;
		System.out.println(a);
		System.out.println(size);
		System.out.println("Average: "+Avg);

	}

}
