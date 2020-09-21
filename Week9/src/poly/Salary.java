package poly;

public class Salary extends Employee{
	private double salary;
	public Salary(String name, String address, int number,double salary) {
		super(name, address, number);
		stSalary(salary);
	}
	public void mailCheck() {
		//super.mailCheck();
		System.out.println("Within mailCheck of Salary class");
		System.out.println("Mailing check to "+ getName() +" with salary "+ getSalary() );
	}
	public double getSalary() {
		return salary;
	}
	public void stSalary(double newSalary) {
		if(newSalary >=0.0) {
			salary = newSalary;
		}
	}
	
}
