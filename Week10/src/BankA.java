
public class BankA extends Bank {

	
	public void getBalance() {
		System.out.println("Your deposit is : $100");
	}

	
	public void credit(Long accountNumber, double amount) {
		
		
		System.out.println("credit on process");
	}

	public boolean debit(Long accountNumber, double amount) {
		
		return false;
	}
	
	public static void main(String args[]) {
		BankA banka=new BankA();
		banka.getBalance();
		banka.credit(1234567890123456L, 105454.00);
	}

}
