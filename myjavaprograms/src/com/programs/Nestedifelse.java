package com.programs;

public class Nestedifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "IE";
		if (browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("TC executed on chrome:");
		}
		else if (browser.equalsIgnoreCase("Firefox"))
		{
			System.out.println("TC executed on Firefox:");
		}
		else if (browser.equalsIgnoreCase("IE"))
		{
			System.out.println("TC executed on IE:");
		}
		else 
		{
			System.out.println("Kindly provide valid browser names:");
		}
		
		}

	}


