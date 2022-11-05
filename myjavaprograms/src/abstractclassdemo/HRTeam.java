package abstractclassdemo;

public class HRTeam extends ITDepart {

	public static void main(String[] args) {
		HRTeam hr=new HRTeam();
		hr.goodies();
		hr.salary();
		hr.work();
		hr.bonus();
		
		ITDepart it=new HRTeam();
		it.goodies();
		it.salary();
		it.work();
		

	}
	public void bonus()
	{
		System.out.println("bonus is 1 lakh");
	}
	public void salary()
	{
		System.out.println("5LPA");
	}

}
