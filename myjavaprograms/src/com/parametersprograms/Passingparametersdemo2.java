package com.parametersprograms;

public class Passingparametersdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passingparametersdemo2 obj1=new Passingparametersdemo2();
		int sum =obj1.add(40, 50);
		System.out.println("addition result is:" +sum);
		double result= obj1.sub(50, 80);
		System.out.println("subtraction result is:" +result);
		
	}
	public int add(int a,int b)
	{
		int c = a+b;
		return  c ;
	}
	public double sub(double x , double y)
	{
		double result = x-y;
		return result;
	}

	
	
	}


