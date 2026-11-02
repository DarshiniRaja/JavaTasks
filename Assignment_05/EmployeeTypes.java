package com.java.Assignments.Assignment_05;


class Employeee{
	String name;
	double salary;
	void displayEmployeeDetails() {
		System.out.println("Employee name is " + name);
		System.out.println("Employee salary is " + salary);
	}
}
class Developer extends Employeee{
    String programmingLang;
    void displayDeveloperDetails() {
    	displayEmployeeDetails();
    	System.out.println("Developer's Language is " + programmingLang);
    }
	
}

class Tester extends Employeee{
    String TestingTool;
    void displayTesterDetails() {
    	displayEmployeeDetails();
    	System.out.println("Tester's Tool is " + TestingTool);
    }
	
}



public class EmployeeTypes {

	public static void main(String[] args) {
		Developer emp1 = new Developer();
		Tester emp2 = new Tester();
		
		emp1.name = "Darsha";
		emp1.salary = 50000.0;
		emp1.programmingLang = "JAVA";
		
		emp2.name = "Durga";
		emp2.salary = 80000.0;
		emp2.TestingTool = "Selenium";
		
		System.out.println("---------Developer's Details--------");
		emp1.displayDeveloperDetails();
		
		System.out.println("---------Tester's Details--------");
		emp2.displayTesterDetails();
	}

}


//Inheritance Assignment

//1.A company has a base class Employee with attributes name and salary. 
//Two subclasses, Developer and Tester, inherit from Employee.
//Each subclass has an additional attribute: programmingLanguage for Developer and testingTool for Tester.
//Write a Java program using inheritance to display the details of both employees.