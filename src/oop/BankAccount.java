package oop;

public class BankAccount implements IRate {
	
	//Define Variables
	private String accountNumber;
	//static belongs to class, not instance
	//final = constant
	private final String routingNumber = "123456789";
	private String name;
	private String ssn;
	private String accountType;
	private double balance;
	
	//Constructors 
	//used to define / initialize properties of and object
	//implicitly called at instantiation 
	//Has to be same name as class
	//Constructors have no return type
	
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	//Overloading = calling same method name with different arguments
	
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
		this.accountType = accountType;
		
	}
	
	BankAccount(String accountType, double initDeposit) {
		System.out.println("NEW ACCOUNT: " + accountType);
		this.accountType = accountType;
		System.out.println("INITIAL DEPOSIT OF: " + initDeposit);
		this.balance = initDeposit;
	}
	
	
	//Define methods
	
	//getters and setters
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	public String getAccountType(){
		return accountType;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAccountNum(String account) {
		this.accountNumber = account;
	}
	
	public String getAcccountNum() {
		return accountNumber;
	}
	
	public String getRoutingNum() {
		return routingNumber;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	public void deposit(double amount) {
		balance += amount;
		showActivity("DEPOSIT", amount);
		checkBalance();
		
	}
	public void withdraw(double amount) {
		balance -= amount;
		showActivity("WITHDRAWL", amount);
		checkBalance();
	}
	
	private void showActivity(String activity, double amount){
		System.out.println("Showing recent activity");
		System.out.println(activity + ": " + amount);
	}
	
	public void checkBalance() {
		System.out.println("BALANCE: " + balance);
	}
	
	public void getStatus(){
		
	}
	@Override
	public String toString(){
		return "[ " + name + ". " + accountNumber + ". BALANCE: $" + balance +" ]";
	}
	
	//interface methods
	
	public void setRate(){
		System.out.println("Setting rate.");
	}
	
	public void increaseRate() {
		System.out.println("Incresing rate.");
	}
	
}
