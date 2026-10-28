package com.java.Assignments.Assignment_03;

public class Employee {
	int employeeId;
	String employeeName;
	double salary;
    
	Employee(int id, String name, double salary){
		this.employeeId = id;
		this.employeeName = name;
		this.salary = salary;
	}
	
	double calculateAnnualSalary() {
		double annualSalary = salary * 12;
		return annualSalary;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Darsha",25000.0);
		Employee e2 = new Employee(102,"Aadhi",50000.0);
		Employee e3 = new Employee(103,"Durga",80000.0);
		
		System.out.println("The annual salary of employee " + e1.employeeName +" is "+e1.calculateAnnualSalary());
		System.out.println("The annual salary of employee " + e2.employeeName +" is "+e2.calculateAnnualSalary());
		System.out.println("The annual salary of employee " + e3.employeeName +" is "+e3.calculateAnnualSalary());
	}

}

//3.Scenario: A company needs to store different employee details when each employee joins. 
//Requirements: 
//1. Create a class Employee with employeeId, employeeName, and salary. 
//2. Create a parameterized constructor that accepts all three values. 
//3. Create a method calculateAnnualSalary() that calculates annual salary. 
//4. Create three employee objects with different details and display their annual salaries. 
//Sample input: 
//● Employee 1: 101, "Arun", 25000 
//● Employee 2: 102, "Divya", 35000 
//● Employee 3: 103, "Kumar", 40000 
//Task: Calculate and display the annual salary for each employee. 