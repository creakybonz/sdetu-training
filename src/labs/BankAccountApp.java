package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("123434789","Cameron Sills",4500);
		acc1.deposit(1400.45);
		acc1.deposit(24.95);
		System.out.println("Balance: " + acc1.getBalance());
		
	}

}

class BankAccount {
	//properties of bank account
	private static int id = 1000;
	private String accountNumber; //id, random 2-digit number + first 2 of SSN
	private static final String routingNumber = "123456789";
	private String name;
	private String SSN;
	private double balance;
	
	
	//constructors
	
	public BankAccount(String SSN, String name, double initDeposit) {
		System.out.println("New Account Created.");
		id++;
		this.SSN = SSN;
		this.name = name;
		balance = initDeposit;
		setAccountNumber();
		System.out.println(toString());
	}
	
	private void setAccountNumber() {
		int random = (int)(Math.random() * 100);
		accountNumber = id + "" + random + SSN.substring(0,2);
		System.out.println(accountNumber);
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public double getBalance(){
		return balance;
	}
	
	@Override
	public String toString(){
		return "Name: " + name + "\nAccount Nuber: " + accountNumber + "\nRouting Number: " + routingNumber + "\nBalance: " + balance;
	}
}
