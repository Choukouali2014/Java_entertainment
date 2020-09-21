import java.util.ArrayList;
import java.util.List;

public class Librarian implements Users{
	
	private int id;
	private String lastName;
	private String firstName;
	private String dateBirth;
	private String address;
	private String city;
	public List<Book> listB=new ArrayList<Book>();
	 Librarian(int id, String lastName, String firstName, String dateBirth, String address, String city) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.dateBirth = dateBirth;
		this.address = address;
		this.city = city;
	}


	public Librarian() {
		
	}

	
	public void issueBook(int isbn) {
		String resul = "";
		for(Book str:listB) {
			if(str.getISBN()==isbn) {
				int index = listB.indexOf(str);
				listB.get(index).setIssuedBook(1);
				resul = "This book : "+ str.getTitle()+" "+str.getAuthor() + " have an issue";
			}else {
				resul=" Book not in database ";
			}
		}
		System.out.println(resul);
	}
	
	public  Book viewBook(int isbn) {
		Book vBook = new Book();
		for(Book str:listB) {
			if(str.getISBN()==isbn) {
				vBook.setAuthor(str.getAuthor());
				vBook.setISBN(str.getISBN());
				vBook.setQty(str.getQty());
				vBook.setTitle(str.getTitle());
				return vBook;
			}
		}
		return vBook;
		
	}
	public List<Book> viewIssue(){
		Book vBook = new Book();
		List<Book> listI=new ArrayList<Book>();
		for(Book str:listB) {
			if(str.getIssuedBook()==1) {
				vBook.setAuthor(str.getAuthor());
				vBook.setISBN(str.getISBN());
				vBook.setQty(str.getQty());
				vBook.setTitle(str.getTitle());
				listI.add(vBook);
			}
		}
		return listI;
		
	}
	
	public List<Book>viewReturn(){
		Book vBook = new Book();
		List<Book> listR=new ArrayList<Book>();
		for(Book str:listB) {
			if(str.getReturnB()==1) {
				vBook.setAuthor(str.getAuthor());
				vBook.setISBN(str.getISBN());
				vBook.setQty(str.getQty());
				vBook.setTitle(str.getTitle());
				listR.add(vBook);
			}
		}
		return listR;
		
	}
	public void returnBook(int isbn) {
		String resul="";
		for(Book str:listB) {
			if(str.getISBN()==isbn) {
				int index = listB.indexOf(str); 
				listB.get(index).setReturnB(1);
				resul = "Return book : "+ str.getTitle()+" "+str.getAuthor() + " successfully";
			}else {
				resul=" Book not in database ";
			}
			
		}
		System.out.println(resul);
		
	}
	public String addBook(int iSBN, String title, String author, int qty) {
		Book book = new Book();
		book.setAuthor(author);
		book.setISBN(iSBN);
		book.setQty(qty);
		book.setTitle(title);
		listB.add(book);
		return "You added "+book.getTitle()+" Successfully";
			
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		
	}
}
