
public interface BankInterface {
	void credit(Long accountNumber, double amount);
	 boolean debit(Long accountNumber, double amount);
}
