import java.util.ArrayList;
import java.util.List;

public class Admin implements Users{
	private String lastName;
	private String firstName;
	private String dateBirth;
	private String address;
	private String city;
	private int id;
	Librarian librarian;
	public List<Librarian> listT=new ArrayList<Librarian>();
	public Admin() {}
	public Admin(String lastName, String firstName, String dateBirth, String address, String city, int id) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.dateBirth = dateBirth;
		this.address = address;
		this.city = city;
		this.id = id;
	}
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
	public boolean deteleLibrarian(int id) {
			for(Librarian str:listT) {
				if(str.getId() == id) {
				listT.remove(str);
					return true;
				}
				else {
					return false;
				}
			}
			return false;
			
		
	}
	public  Librarian viewLibrarian(int id) {
		Librarian librarian1 = new Librarian();
		///for(int i=0;i<listT.size();i++)
		for(Librarian str:listT){
			if(str.getId() == id) {
				librarian1.setAddress(str.getAddress());
				librarian1.setFirstName(str.getFirstName());
				librarian1.setLastName(str.getLastName());
				librarian1.setCity(str.getCity());
				librarian1.setDateBirth(str.getDateBirth());
				librarian1.setId(str.getId());
				return librarian1;
			}
			
		}
		return librarian1;
		
		
	}
	//add librarian going to be a list of library
	public String addLibrarian(int id, String lastName, String firstName, String dateBirth, String address, String city) {
		Librarian librarian = new Librarian();
		librarian.setAddress(address);
		librarian.setFirstName(firstName);
		librarian.setLastName(lastName);
		librarian.setCity(city);
		librarian.setDateBirth(dateBirth);
		librarian.setId(id);
		listT.add(librarian);
		return "Add successful";
	}

	public void  logout(int id) {
		System.out.println("Logout Successful");	
	}

	
	public void login(String username,String pass){
		if(getFirstName() == username && getLastName() == pass) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Try Again !!!!");
		}
	}
	
	
	
}
