package com.java.Assignments.Assignment_03;

public class BankAccount {
	int accountNumber;
	String holderName;
	double balance;

	BankAccount(){
		accountNumber = 101;
		holderName = "Darshini";
		balance = 40000.0;
	}
	
	void display() {
		System.out.println(accountNumber + " " + holderName + " " + balance);
		
		System.out.println("---------------------");
	}
	public static void main(String[] args) {
		BankAccount account1  = new BankAccount();
		BankAccount account2 = new BankAccount();
		
		account1.display();
		account2.display();
		

	}

}

//2.Scenario: A bank automatically creates a savings account with predefined initial details. 
//Requirements: 
//1. Create a class BankAccount with accountNumber, holderName, and balance. 
//2. Create a no-argument constructor that initializes them to 1001, "Priya", and 5000.0. 
//3. Create a method displayAccount() to display the details. 
//4. Create two objects and display their details. 
//Task: Explain how the no-argument constructor initializes each object. 