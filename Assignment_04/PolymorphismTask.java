package com.java.Assignments.Assignment_04;


class Calculator{
	int add(int a, int b) {
		return a + b;
	}
	double add(double a, double b) {
		return a + b;
	}
}

class Employee{
	int calculateBonus() {
		return 1000;
	}
}

class Manager extends Employee{
	int calculateBonus() {
		return 5000;
	}
}

class Developer extends Employee{
	int calculateBonus() {
		return 3000;
	}
}
public class PolymorphismTask {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
	    System.out.println("Integer Addition: " + calc.add(10, 20));
	    System.out.println("Decimal Addition: " + calc.add(10.5, 20.5));
	    
	    Employee emp1 = new Manager();
	    Employee emp2 = new Developer();
	    
	    System.out.println("Manager Bonus : " + emp1.calculateBonus());
	    System.out.println("Developer Bonus : " + emp2.calculateBonus());
	}

}	
