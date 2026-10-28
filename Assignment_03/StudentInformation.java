package com.java.Assignments.Assignment_03;

public class StudentInformation {
	
	int studentId;
	String StudentName;
	String Course;
	
	void displayDetails() {
		System.out.print(studentId + " " +  StudentName + " " + Course);
	}
	public static void main(String[] args) {
		StudentInformation obj = new StudentInformation();
		obj.displayDetails();

	}

}

//1.Scenario: A college wants to register a student with default information when no details are 
//provided. 
//Requirements: 
//1. Create a class Student with variables studentId, studentName, and course. 
//2. Create a class with no explicitly declared constructor and observe the default values 
//assigned to its instance variables. 
//3. Create a method displayDetails() to display the student information. 
//4. Create an object and call the display method. 
//Task: What values will be displayed if the variables are not initialized? 


// The output will be 0 null null :-the default values will be initialised for those variable