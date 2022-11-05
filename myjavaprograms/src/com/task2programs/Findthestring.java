package com.task2programs;

public class Findthestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "This is orange juice";
		String word1 = "orange";
		boolean status = word.contains(word1);
		boolean status1 = word.startsWith("This");
		boolean status2 = word.endsWith("juice");
		boolean status3 = word.equals("This");
		boolean status4 = word.equals("This is orange juice");
		boolean status5 = word.equalsIgnoreCase("This is Orange juice");
		System.out.println("The contains method result status:" + status + " " + word1);
		System.out.println("The startswith method result status:" + status1);
		System.out.println("The endswith method result status:" + status2);
		System.out.println("The equalsmethod result status:" + status3);
		System.out.println("The equalsmethod result status:" + status4);
		System.out.println("The equalsIgnoreCase method result status:" + status5);
	}

}
