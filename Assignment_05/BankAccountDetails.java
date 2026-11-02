package com.java.Assignments.Assignment_05;

class BankAccount{
	void displayBankAccount() {
		System.out.println("Displaying Bank Account Details");
	}
}

class SavingsAccount extends BankAccount{
	
	void displaySavingsAccount() {
		displayBankAccount();
		System.out.println("Displaying Savings Account Details");
	}
}

class PremiumSavingsAccount extends SavingsAccount{
	void displayPremiumSavingsAccount() {
		displaySavingsAccount();
		System.out.println("Displaying Premium Savings Account Details");
	}
}

public class BankAccountDetails {

	public static void main(String[] args) {
		
		PremiumSavingsAccount obj = new PremiumSavingsAccount();
		obj.displayPremiumSavingsAccount();
		

	}

}
