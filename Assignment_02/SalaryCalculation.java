package com.java.Assignments.Assignment_02;

import java.util.Scanner;

public class SalaryCalculation {
		
	  double calculateSalary(double basicSalary , double allowance) {
		  double grossSalary = basicSalary + allowance;
		  return grossSalary;
	  }
	  
	  double calculateNetSalary(double grossSalary , double deductions) {
		  double netSalary = grossSalary - deductions;
		  return netSalary;
	  }
	  
	  void displayDetails(String EmpName, double grossSalary, double netSalary ) {
		  System.out.println("Employee Name : " + EmpName);
		  System.out.println("Gross Salary : " + grossSalary);
		  System.out.println("Net Salary : " + netSalary);
		  
		  System.out.println("-------------------------------");
	  }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String EmpName = sc.nextLine();
		System.out.println("Enter your Basic Salary : ");
		double basicSalary = sc.nextDouble();
		System.out.println("Enter your Allowances : ");
		double allowance = sc.nextDouble();
		System.out.println("Enter your Deductions : ");
		double deductions = sc.nextDouble();
		
		 SalaryCalculation obj = new  SalaryCalculation ();
		 double gross = obj.calculateSalary(basicSalary, allowance);
		 double net = obj.calculateNetSalary(gross, deductions);
		 obj.displayDetails(EmpName, gross, net);
	}

}


//1.Scenario: A company wants to calculate the monthly salary of its employees, including
//allowances and deductions.System.out.println("Enter your Allowances : ");
//Requirements:
//1. Create a class EmployeeSalary.
//2. Create a method calculateSalary() that accepts basic salary and allowance and
//returns the gross salary.
//3. Create a method calculateNetSalary() that accepts gross salary and deductions
//and returns the net salary.
//4. Create a method displayDetails() to display the employee name, gross salary, and
//net salary.
//5. Call all methods from main() without using a constructor.
//Sample input: Basic salary = ₹25,000, Allowance = ₹5,000, Deductions = ₹2,000.
//Expected output:
//Gross Salary: 30000.0
//Net Salary: 28000.0