package com.programs;

public class Objectdemo {
	int x=10;                               // Non static method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objectdemo obj1 = new Objectdemo();       // object creation
		obj1.sum();
		System.out.println(obj1 .x);
			//int y=obj1.x;
			//System.out.println(y);
			
				
		
		
	}
	public void sum()           // Non static method
	{
	int x=5;
	int y=6;
	int c = x+y;
	System.out.println("addition of two numbers:" +c);
	}
}
