package com.java.Assignments.Assignment_04;

public class StudentDetails {
	String StudentName;
	int Age;
	
	StudentDetails(String name){
		this.StudentName = name;
		this.Age = 0;
	}
	StudentDetails(String name, int age){
		this.StudentName = name;
		this.Age = age;
	}
	
	void displayDetails() {
		System.out.println("Student's Name : " + StudentName );
		System.out.println("Student's Age : " + Age);
		
		System.out.println("-----------------------");
	}

	public static void main(String[] args) {
		StudentDetails s1 = new StudentDetails("Guhan");
		StudentDetails s2 = new StudentDetails("Durga" , 19);
		
		s1.displayDetails();
		s2.displayDetails();
	}

}
