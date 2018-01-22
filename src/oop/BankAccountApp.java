package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		//Creating a new bank account >> think instantiate object
		BankAccount acc1 = new BankAccount();
		acc1.setName("John Doe");
		acc1.setAccountNum("123454165");
		acc1.deposit(1000);
		
		acc1.deposit(100);
		acc1.withdraw(300);
		
		acc1.setRate();
		acc1.increaseRate();
		
		
		
		/*
		BankAccount acc2 = new BankAccount("Checking Account");
		BankAccount acc3 = new BankAccount("Checking Account", 5000.0);
		
		acc3.checkBalance();
		System.out.println(acc1.toString());
		
		//demo for inheritance
		
		CDAccount cd1 = new CDAccount();
		cd1.name = "George Catanza";
		cd1.balance = 10000;
		cd1.accountType = "CD";
		cd1.accountNumber = "14232";
		cd1.toString();*/
		
	}

}
