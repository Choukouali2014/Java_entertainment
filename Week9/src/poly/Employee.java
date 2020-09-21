package poly;

public class Employee {
	private String name;
	private String address;
	private int number;
	
	public Employee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	public void mailCheck() {
		System.out.println("Mailing 1 a check to "+ this.name +" and "+ this.address);
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String newName) {
		name = newName;
	}
	public void setAddress(String newAddres) {
		address = newAddres;
	}
	public int getNumber() {
		return number;
	}
}
