package superkeyworddemo;

public class Childclass extends Baseclass{
	int int_rate=10;

	public static void main(String[] args) {
		 Childclass obj1=new  Childclass();
		 obj1.showmeIntrateprivatebank();
		
		

	}
	public void showmeIntrate()
	{
		System.out.println("i am in child class");
	}
	public void showmeIntrateprivatebank()
	{
		super.showmeIntrate();
		System.out.println("Current Int rate from RBI= "+super.int_rate);
	}

}
