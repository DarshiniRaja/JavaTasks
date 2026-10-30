package com.java.Assignments.Assignment_04;

class EmployeeDetails{
	String dept = "IT";
	int Exp = 4;
	
	void Responsibility() {
		System.out.println("Responsibility Differs based on Role");
	}
}


class Developer12 extends EmployeeDetails{
//	@Override
	void Responsibility() {
		System.out.println("Developer's role is to develop the product");
	}
	
}
class Manager12 extends EmployeeDetails{
//	@Override
	void Responsibility() {
		System.out.println("Manager's role is to manage the team and assign works to Team members");
	}
}

public class EmployeeDetailsTask{

	public static void main(String[] args) {
		EmployeeDetails emp1 = new Developer12();
		EmployeeDetails emp2 = new Manager12();
		
		System.out.println(emp1.dept + " " + emp1.Exp);
		emp1.Responsibility();
		System.out.println(emp2.dept + " " + emp2.Exp);
		emp2.Responsibility();
	}

}


//4. A company has different employee types: Developer and Manager.
//Both share common employee details, but each has a different responsibility description.
//Write a Java program using inheritance and method overriding to display the responsibilities of each employee type.
