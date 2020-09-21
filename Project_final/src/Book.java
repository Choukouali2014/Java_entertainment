

public class Book {
	private int ISBN;
	private String title;
	private String author;
	private int qty;
	private int issuedBook;
	private int returnB;
	public Book() {}
	public Book(int iSBN, String title, String author, int qty) {
		ISBN = iSBN;
		this.title = title;
		this.author = author;
		this.qty = qty;
		this.issuedBook=0;
		this.setReturnB(0);
	}
	
	
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getIssuedBook() {
		return issuedBook;
	}
	public void setIssuedBook(int issuedBook) {
		this.issuedBook = issuedBook;
	}
	public int getReturnB() {
		return returnB;
	}
	public void setReturnB(int returnB) {
		this.returnB = returnB;
	}
	
	
	
	
	
	
}
