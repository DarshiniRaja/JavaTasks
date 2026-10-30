package com.java.Assignments.Assignment_04;

public class BankingApplication {
	
	private String Name;
	private double balance;
	
	BankingApplication(String Name,double balance){
		this.Name = Name;
		if(balance >= 0) {
			this.balance = balance;
		}else {
			this.balance = 0;
		}
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount <= 0 ) {
			System.out.println("Invalid Deposit");
		}else {
			balance += amount;
			System.out.println("Deposited Amount : ₹ " + amount);
		}
	}
	
	public void withdraw(double amount) {
		if(amount < 0) {
			System.out.println("Invalid amount");
		}else if(amount > balance) {
			System.out.println("Insufficient balance");
		}else {
			balance -= amount;
			System.out.println("Withdrawal Amount : ₹ " + amount);
		}
	}
	public static void main(String[] args) {
		BankingApplication account = new BankingApplication("Darshini",50000.0);
		
		System.out.println("Account Holder Name : " + account.Name);
	    System.out.println("Initial Balance : ₹ " + account.balance);
	    
	    account.deposit(20000.0);
	    account.withdraw(5000.0);
	    System.out.println(account.getBalance());
	    account.withdraw(25000.0);
	    System.out.println(account.getBalance());
	}

}

//3. A banking application stores an account holder's name and balance. 
//The balance should not be modified directly from outside the class, and withdrawals must not exceed the available balance.
//Implement encapsulation using private variables, getters, setters where appropriate, and a withdrawal method.