package com.newtaskprograms;

public class Studentabovemark {

	public static void main(String[] args) {
		int marks[] = new int[5];
		marks[0] = 98;
		marks[1] = 12;
		marks[2] = 89;
		marks[3] = 55;
		marks[4] = 35;
		int size = marks.length;
		System.out.println("Student marks above 80 are below");
		for (int i = 0; i < size; i++) {
			if(marks[i]>80)
			{
				System.out.println(marks[i]);
			}
		}
	}
}
