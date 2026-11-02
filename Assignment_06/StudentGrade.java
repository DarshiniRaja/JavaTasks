package com.java.Assignments.Assignment_06;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mark");
		int marks = sc.nextInt();
		if(marks >= 90 && marks <= 100) {
			System.out.println("Your Grade is A");
		}else if(marks >= 75 && marks <= 89) {
			System.out.println("Your Grade is B");
		}else if(marks >= 50 && marks <= 74) {
			System.out.println("Your Grade is C");
		}else if(marks < 50 && marks >=0) {
			System.out.println("You Fail");
		}else {
			System.err.println("Invalid mark");
		}
		

	}

}

//Q3. Student Grade System
//
//Accept marks and display grades:
//
//90–100: A
//
//75–89: B
//
//50–74: C
//
//Below 50: Fail
//
//Invalid marks: Display an error message.