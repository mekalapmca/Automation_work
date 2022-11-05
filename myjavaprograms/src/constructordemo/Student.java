package constructordemo;

public class Student {
	int result; //default value is 0

	public static void main(String[] args) {
		Student obj1=new Student(1);
		obj1.displyResult();
	

	}
	public Student()
	{
		System.out.println("Wellcome to school");
	}
	public Student(String schoolname)
	{
		System.out.println("Wellcome to school name");
	}
	public Student(int rank)
	{
	System.out.println("Wellcome to school name whoch ranked");
    }
	public Student(String name, int rank)
	{
		System.out.println("Wellcome to school name whoch ranked");
	}
	public void displyResult()
	{
		System.out.println("Final marks of students"+result);
	}

	
	}
	


