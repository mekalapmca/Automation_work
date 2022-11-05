package superkeyworddemo;

public class Subclass extends Parentclass{
	public Subclass()
	{
		System.out.println("i am in child class");
	}
	public  Subclass(String name)
	{
		super(name);
		System.out.println("i am in child class cons=" +name);
	}

	public static void main(String[] args) {
		 Subclass obj1=new Subclass("Mekala");
		
	}

}
