package com.java.Assignments.Assignment_04;

abstract class Payment{
	abstract void processPayment();
}

class UPIPayment extends Payment{
	void processPayment() {
		System.out.println("Paying through UPI");
	}
}

class CreditCardPayment extends Payment{
	void processPayment() {
		System.out.println("Paying through Credit Card");
	}
}

public class PaymentTask {

	public static void main(String[] args) {
		Payment pay1 = new UPIPayment();
		Payment pay2 = new CreditCardPayment();
		
		pay1.processPayment();
		pay2.processPayment();

	}

}

//5. An online payment application supports UPI and credit card payments. 
//Both payment methods must implement a common payment operation, but their processing logic differs.
//Create an abstract class named Payment with an abstract method processPayment(). 
//Implement it in UPIPayment and CreditCardPayment classes and demonstrate runtime polymorphism.