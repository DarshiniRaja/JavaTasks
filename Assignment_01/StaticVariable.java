package com.java.Assignments.Assignment_01;

public class StaticVariable {
	String EmployeeName;
	static int employeeCount = 0;
	
	void EmployeeCounter(String name) {
		EmployeeName = name;
		employeeCount++;
		
		System.out.println("Employee Name : " + EmployeeName);
		System.out.println("Total Employees : " + employeeCount);
		
		System.out.println("-------------------------------------");
	}
	public static void main(String[] args) {
		StaticVariable e1 = new StaticVariable();
		StaticVariable e2 = new StaticVariable();
		StaticVariable e3 = new StaticVariable();
		
		e1.EmployeeCounter("Aruna");
		e2.EmployeeCounter("Pooja");
		e3.EmployeeCounter("Reena");
		
		System.out.print("Final Employee Count : "+StaticVariable.employeeCount);
	}

}
