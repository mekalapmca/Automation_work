package com.task2programs;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "AutomationProject";
		System.out.println("The Length of the string is :" + txt.length());
		if (txt.length() > 10) {
			System.out.println("This is a Big String : " + txt);
		} else {
			System.out.println("This is a Small String: " + txt);
		}
	}
}
