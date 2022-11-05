package com.programs;

public class Localvariables {
	//int roll = 10;                   //  Global variable or Instance variable
	//double marks = 80.5;
	
	
	int c;    //Non static instance variable
	
	public static void main(String[] args) {  // static method
		// TODO Auto-generated method stub
		//int x = 90;                        //Local variable
		//System.out.println(x);
		
		//Localvariables obj1=new Localvariables();   // object creation
		//obj1.show();
	//}
	//public void show()                              // Method or Function
	//{
		//System.out.println("Roll num" +roll +" " + "and marks are" +marks);
	//}
		
		
		Localvariables a = new Localvariables();
		System.out.println(a.c);
	}
	public void show()      //Non static method
	{
		System.out.println(c);
	}

}


	



