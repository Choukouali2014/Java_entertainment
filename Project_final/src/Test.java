
public class Test {

	public static void main(String[] args) {

		Admin admin = new Admin("lastName", "firstName", "dateBirth","address", "city", 1);
		String result1 = admin.addLibrarian(1, "frank", "leonel", "03-19-7897", "Westbard Ave", "bethesda");
		String result =admin.addLibrarian(2, "frank2", "leonel2", "03-19-7897", "Westbard Ave", "bethesda");
		System.out.println(result1+" - "+result);
		Librarian first = admin.viewLibrarian(1);
		first.addBook(15467894, "Long Way home", "Sarro", 2);
		first.addBook(415467894, "Long Way home1", "Sarro", 5);
		first.issueBook(15467894);
		first.returnBook(415467894);
		admin.deteleLibrarian(1);
		for(Book str:first.listB) {
			if(str.getReturnB()==1)
				System.out.println(str.getReturnB());
			else
				System.out.println(str.getIssuedBook());
		}
		for(Librarian strng:admin.listT) {
			System.out.println(strng.getFirstName());
		}

	}

}
