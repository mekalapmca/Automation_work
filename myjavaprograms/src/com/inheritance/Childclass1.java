package com.inheritance;

public class Childclass1 extends Baseclass {

	public static void main(String[] args) {
		//create object for childclass and call baseclass methods
		Childclass1 obj1=new Childclass1(); 
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		
	}
	public void mul()
	{
		System.out.println("Child class multiplication is 234:");
	}
	public void div()
	{
		System.out.println("Child class multiplication is 34:");

	}

}
