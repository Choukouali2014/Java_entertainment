
public class BankC extends Bank {
	public void getBalance() {
		System.out.println("Your deposit is : $200");
	}

	
	public void credit(Long accountNumber, double amount) {
		
		System.out.println("Credit approved");
	}

	
	public boolean debit(Long accountNumber, double amount) {
		
		return false;
	}
	
	public static void main(String args[]) {
		BankC bankc=new BankC();
		bankc.getBalance();
		bankc.credit(1234567890123456L, 105454.00);
	}
}
