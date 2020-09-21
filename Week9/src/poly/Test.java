package poly;

public class Test {
	public static void main(String args[]) {
		Salary sal = new Salary("Frank","5401 Westbard",12,12.25);
		Employee empl = new Salary("Dev App","CA",2,45.50);
		System.out.println("Appel de la fonction mailCheck utilisant Salary");
		sal.mailCheck();
		System.out.println("Appel de la fonction mailCheck utilisant Employee");
		empl.mailCheck();
		
		
	}
}
