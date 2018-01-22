package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("123456789");
		BankAccount acc2 = new BankAccount("134356589");
		BankAccount acc3 = new BankAccount("534566789");

	}

}

class BankAccount {
	//properties of bank account
	private static int id = 1000;
	private String accountNumber; //id, random 2-digit number + first 2 of SSN
	private String routingNumber;
	private String name;
	private String SSN;
	private double balance;
	
	//constructors
	
	public BankAccount(String SSN) {
		System.out.println("New Account Created.");
		id++;
		this.SSN = SSN;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int)(Math.random() * 100);
		accountNumber = id + "" + random + SSN.substring(0,2);
		System.out.println(accountNumber);
	}
}
