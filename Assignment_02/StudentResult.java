package com.java.Assignments.Assignment_02;

import java.util.Scanner;

public class StudentResult {
	
	double calculateTotal(double m1,double m2,double m3,double m4,double m5) {
		double totalMark = m1+m2+m3+m4+m5;
		return totalMark;
	}
	double calculateAverage(double total) {
		return total / 5;
	}
	String calculateGrade(double average) {
		if(average >= 90) {
			return "A";
		}else if (average >= 75 && average <= 89) {
			return "B";
		}else if (average >= 50 && average <= 74) {
			return "C";
		}
		else {
			return "Fail";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 subject Marks");
		double m1 = sc.nextInt();
		double m2 = sc.nextInt();
		double m3 = sc.nextInt();
		double m4 = sc.nextInt();
		double m5 = sc.nextInt();
		StudentResult obj = new StudentResult();
		double totalMark = obj.calculateTotal(m1, m2, m3, m4, m5);
		double average = obj.calculateAverage(totalMark);
		System.out.println("Your Grade is " + obj.calculateGrade(average));
	}

}

//2.Scenario: A college wants to calculate students' results based on five subject marks. 
//Requirements: 
//1. Create a class StudentResult. 
//2. Create a method calculateTotal() that accepts five subject marks and returns the 
//total. 
//3. Create a method calculateAverage() that accepts the total and returns the average. 
//4. Create a method calculateGrade() that accepts the average and returns a grade: 
//○ 90 and above: A 
//○ 75–89: B 
//○ 50–74: C 
//○ Below 50: Fail 
//5. Create a method to display the total, average, and grade. 
//Sample input: 85, 78, 92, 88, 77. 
//Expected output: 
//Total: 420 
//Average: 84.0 
//Grade: B