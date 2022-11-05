package com.newtaskprograms;

public class Breakexecution2 {

	public static void main(String[] args) {
		String name[] = new String[5];
		name[0] = "Java";
		name[1] = "JavaScript";
		name[2] = "Selenium";
		name[3] = "Python";
		name[4] = "Sakthi";
		int size = name.length;
		System.out.println("numbers list");
		for (int i = 0; i < size; i++) {
			System.out.println(name[i]);
			if (name[i].equals("Selenium")) {
				
				break;
			}
		}
	}
}
