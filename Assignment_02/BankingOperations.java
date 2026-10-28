package com.java.Assignments.Assignment_02;

import java.util.Scanner;

public class BankingOperations {
	
	double balance = 2000 ;
	
	double deposit(double balance,double depositAmount) {
		balance =  balance + depositAmount;
		return balance;
	}
	
	double withdraw(double balance, double withdrawAmount) {
		if(withdrawAmount > balance) {
			System.out.println("InSufficient Balance for withdrawal amount");
			return 0;
		}
		balance =  balance - withdrawAmount;
		return balance;
	}
	
	double checkBalance() {
		return balance;
	}
	
	void displayTransactionSummary(double deposit,double withdraw , double finalAmount) {
		System.out.println("Deposited Amount :" + deposit);
		System.out.println("Withdrawal Amount : " + withdraw);
		System.out.println("Final Amount : " + finalAmount );
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankingOperations obj = new BankingOperations();
		System.out.println("Initial Balance :" + obj.balance );
		System.out.println("Enter the amount to deposit :" );
		double depositAmount = sc.nextDouble();
		double AmountAfterDeposit = obj.deposit(obj.balance,depositAmount);
		System.out.println("Enter the amount to Withdraw :" );
		double withdrawalAmount = sc.nextDouble();
		double AmountAfterWithdrawal = obj.withdraw(obj.balance, withdrawalAmount);
		obj.displayTransactionSummary(depositAmount, withdrawalAmount,AmountAfterWithdrawal);
	}

}
//5.Scenario: A bank needs a simple application to perform deposits, withdrawals, and balance 
//checks. 
//Requirements: 
//1. Create a class BankingOperations. 
//2. Create a method deposit() that accepts the current balance and deposit amount and 
//returns the updated balance. 
//3. Create a method withdraw() that accepts the current balance and withdrawal amount. 
//If sufficient funds are unavailable, display an appropriate message. 
//4. Create a method checkBalance() that accepts the current balance and displays it. 
//5. Create a method displayTransactionSummary() that displays the deposit amount, 
//withdrawal amount, and final balance. 
//6. Call all methods from main() without using constructors. 
//Sample input: 
//● Initial balance: ₹5,000 
//● Deposit: ₹2,000 
//● Withdrawal: ₹1,500 
//Expected output: 
//Initial Balance: 5000.0 
//Deposited: 2000.0 
//Withdrawn: 1500.0 
//Final Balance: 5500.0