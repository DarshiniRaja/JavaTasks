package com.java.Assignments.Assignment_05;

class Person{
	String name;
	int age;
	Person(String name, int age){
		 this.name = name;
	     this.age = age;

	     System.out.println("Person Constructor Called");
	}
	
}

class Student extends Person{
	
	int Rno;
   
	Student(String name, int age, int Rno) {
		super(name, age);
		this.Rno = Rno;

	    System.out.println("Student Constructor Called");
	}
	 void displayDetails() {

	        System.out.println("Student Name: " + name);
	        System.out.println("Student Age: " + age);
	        System.out.println("Student Roll Number: " + Rno);
	    }
	
}

public class PersonTask {
	public static void main(String[] args) {
		  Student s = new Student("Darshini", 22, 101);

	      s.displayDetails();

	}

}


//5. A university application has a parent class Person with a parameterized constructor that accepts name and age. 
//A subclass Student has an additional attribute rollNumber.
//The subclass must initialize the parent attributes using super().
//Write a Java program demonstrating constructor execution in inheritance using super() and display all student details.