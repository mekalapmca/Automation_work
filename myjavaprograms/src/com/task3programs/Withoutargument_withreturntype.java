package com.task3programs;

import com.task2programs.Arithmetic;

public class Withoutargument_withreturntype {
	int display()
	{
		return 10;
	}
	int display1()
	{
		int a=5;
		int b=54;
		int c=a+b;
		return c;
	}

	public static void main(String[] args) {
		Withoutargument_withreturntype  obj2=new Withoutargument_withreturntype();
		System.out.println(obj2.display1());
	
		}
	
}
