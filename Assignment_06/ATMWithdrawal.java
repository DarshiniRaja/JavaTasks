package com.java.Assignments.Assignment_06;

import java.util.Scanner;

public class ATMWithdrawal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double balance = 5000.0;
		int PIN = 6377;
		System.out.println("Enter the PIN");
		int userPIN = sc.nextInt();
		System.out.println("Enter the amount to withdraw");
		int withdrawAmount = sc.nextInt();
		if(userPIN == PIN && withdrawAmount <= balance) {
			System.out.println("Successfully withdrawed");
		}
		else if(withdrawAmount > balance) {
			System.out.println("Invalid balance");
		}
		else {
			System.out.println("Incorrect PIN or data");
		}

	}

}

//
//Q1.ATM Withdrawal
//
//An ATM allows withdrawal only if the PIN is correct and the account balance is sufficient. Otherwise, display the appropriate error message.
//
//Use: if-else
//
//Test cases: Correct PIN and sufficient balance; incorrect PIN; insufficient balance.