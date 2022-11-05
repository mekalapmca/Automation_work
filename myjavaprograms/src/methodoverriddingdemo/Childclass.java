package methodoverriddingdemo;

public class Childclass extends Parentclass {

	public static void main(String[] args) {
		Childclass obj1 = new Childclass();
		obj1.display();
		Parentclass obj2 = new Parentclass();
		obj2.display();
		Parentclass obj3 = new Childclass();
		obj3.display();

	}

	public void display() {
		System.out.println("i am in child class displaymethod");
	}

	public void display(String name) {
		System.out.println("i am in child class displaymethod");
	}

}
