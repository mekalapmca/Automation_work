package com.task3programs;

public class Switch_Browsername {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser = "IE";
		String browser_name = browser.toLowerCase();
		switch (browser_name) {
		case "chrome":

			System.out.println("chrome browser selected");
			break;
		case "firefox":
			System.out.println("firefox browser selected");
			break;

		case "ie":
			System.out.println(" Internet Explorer browser selected");
			break;
		case "safari":
			System.out.println(" safari browser selected");
			break;
		default:
			System.out.println(" select correct browser");
			break;

		}
	}

}
