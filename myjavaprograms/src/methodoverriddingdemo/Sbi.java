package methodoverriddingdemo;

public class Sbi extends Rbi {

	public static void main(String[] args) {
		Sbi obj1=new Sbi();
		obj1.homeloanrbi();
		Rbi obj2=new Rbi();
		obj2.homeloanrbi();
		
	}
	public void homeloanrbi()
	{
		System.out.println("Home loan int rate 8 %");
	}


}
