package com.java.Assignments.Assignment_06;

import java.util.Scanner;

public class LoginAttempt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = "Darsha@10";
		
		int attempt = 3;
		while(attempt > 0) {
			System.out.println("Enter your password");
			String userPass = sc.nextLine();
			if(userPass.equals(password)) {
				System.out.println("Login Successful");
				break;
			}
			else {
				System.err.println("Invalid Password");
				attempt--;
			}
			
		}

	}

}

//Q4. Login Attempt System
//
//A user has three login attempts. If the password is correct, display “Login Successful” and stop the loop. Otherwise, display “Invalid Password.”
//
//- Use: while and break