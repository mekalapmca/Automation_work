package interfaceprograms;

public class Advancedcalc implements Calc {

	public static void main(String[] args) {

	    Advancedcalc obj1 = new Advancedcalc();
		//Calc obj1=new Advancedcalc();
		obj1.add();
		obj1.sub();
		obj1.calculatecos();
		obj1.calculatesin();
	}

	public void calculatecos() {
		System.out.println("i am in cos method:");
	}

	public void calculatesin() {
		System.out.println("i am in sin method:");
	}

	public void add() {
		System.out.println("i am in add method:");
	}

	public void sub() {
		System.out.println("i am in sub method:");
	}

}
