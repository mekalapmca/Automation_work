package com.singledimentionalarray;

public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int student_id[]=new int[5];             
		student_id[0]=45;
		student_id[1]=65;
		student_id[2]=78;
		student_id[3]=59;
		student_id[4]=89;
		System.out.println("Students id is:" +student_id[3]);
		int sizeofarray=student_id.length;                      // Length of array
		System.out.println("Length of array is:" + sizeofarray);
		
		for (int i=0;i<sizeofarray;i++)
		{
			System.out.println("Students id is:" +student_id[i]);
			
		}

	}

}
