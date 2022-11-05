package thiskeyworddemo;

public class MyDrivers {
	public MyDrivers()
	{
		this("JDBC");
		System.out.println("Loading my Drivers");
	}
	public MyDrivers(String name)
	{
		this(10);
		System.out.println("Loading my Drivers =name is"+name);
	}
	public MyDrivers(int count)
	{
		System.out.println("Loading my Drivers = count is" +count);
	}
	public void display()
	{
		System.out.println("i am in display");
	}

	public static void main(String[] args) {
		MyDrivers obj1=new MyDrivers();
		obj1.display();
		

	}

}
