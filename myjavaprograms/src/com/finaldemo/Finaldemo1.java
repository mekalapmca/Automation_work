package com.finaldemo;

public class Finaldemo1 {

	public static void main(String[] args) {
		
		Finaldemo1 obj1=new Finaldemo1();
		obj1.show();
	}
	public void show()
	{
		int marks=90;
		marks=95;
		final int FINAL_MARKS=85; //once inilize the final we cannot change the value
		System.out.println(FINAL_MARKS);
	}

}
