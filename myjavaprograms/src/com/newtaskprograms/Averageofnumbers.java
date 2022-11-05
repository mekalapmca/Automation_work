package com.newtaskprograms;

public class Averageofnumbers {

	public static void main(String[] args) {
		double add[] = new double[5];
		add[0] = 10;
		add[1] = 90.78;
		add[2] = 111;
		add[3] = 8989;
		add[4] = 7876;
		int size = add.length;
		double b = 0;
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			b = b + add[i];
		}
		double Avg=b/size;
		System.out.println(b);
		System.out.println("Average: "+Avg);


	}

}
