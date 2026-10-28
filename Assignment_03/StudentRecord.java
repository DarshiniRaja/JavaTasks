package com.java.Assignments.Assignment_03;

public class StudentRecord {
	int rollNo;
	String Name;
	double marks;
	StudentRecord(int rollNumber, String studentName, int marks) {
		this.rollNo = rollNumber; 
		this.Name = studentName; 
		this.marks = marks; 
	} 
	StudentRecord(StudentRecord student) { 
		this.rollNo = student.rollNo;
		this.Name = student.Name;
		this.marks = student.marks;
	}
	void displayRecord() {
		System.out.println("Roll Number: " + rollNo);
		System.out.println("Student Name: " + Name); 
		System.out.println("Marks: " + marks);
		System.out.println("------------------------");
	}
	public static void main(String[] args) {
		StudentRecord original = new StudentRecord(101, "Priya", 85); 
		StudentRecord copied = new StudentRecord(original); 
		copied.marks = 95; 
		System.out.println("Original Student Record:");
		original.displayRecord();
		System.out.println("Copied Student Record:");
		copied.displayRecord();

	}

}

//5.Scenario: A school needs to create a new student record by copying the details of an existing 
//student. 
//Requirements: 
//1. Create a class StudentRecord with rollNumber, studentName, and marks. 
//2. Create a parameterized constructor to initialize the original student's details. 
//3. Create a copy constructor that accepts another StudentRecord object and copies its 
//values. 
//4. Create an original student object and a copied student object. 
//5. Change the copied student's marks and display both records. 
//Task: Verify that changing the copied object's marks does not change the original object's 
//marks.