
public class BankB extends Bank {
	public void getBalance() {
		System.out.println("Your deposit is : $150");
	}

	
	public void credit(Long accountNumber, double amount) {
		
		System.out.println("Credit rejected");
	}

	
	public boolean debit(Long accountNumber, double amount) {
		
		return false;
	}
	
	public static void main(String args[]) {
		BankB bankb=new BankB();
		bankb.getBalance();
		bankb.credit(1234567890123456L, 105454.00);
	}
}
