package constructordemo;

public class Marks {
	int result;

	public static void main(String[] args) {
		Marks m = new Marks(70);
		m.displyResult();

	}

	public Marks(int marks) {
		result = marks;
	}

	public void displyResult() {
		System.out.println("Final marks of students" + result);
	}

}
