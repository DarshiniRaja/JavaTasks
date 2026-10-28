package com.java.Assignments.Assignment_02;

import java.util.Scanner;

public class ShoppingCart {
	int discount;
	double calculateTotal(double price1, double price2, double price3) {
		return price1 + price2 + price3;
	}
	double calculateDiscount(double totalPrice , String membership) {
		if(membership.equalsIgnoreCase("Gold")) {
			discount = 20;
		}else if(membership.equalsIgnoreCase("Silver")) {
			discount = 10;
		}else {
			discount = 5;
		}
		
		
		return totalPrice * (discount / 100.0);
	}
	
	double calculateFinalAmount(double Total,double discount) {
		return Total - discount;
	}
	
	void displayAmount(double total,double discount,double finalAmount) {
		System.out.println("Total Price : " + total);
		System.out.println("Discount Price : " + discount);
		System.out.println("Final Amount : " + finalAmount);
	}
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    ShoppingCart obj = new ShoppingCart();
	    System.out.println("Enter prices of three products : ");
	    double price1 = sc.nextDouble();
	    double price2 = sc.nextDouble();
	    double price3 = sc.nextDouble();
	    System.out.println("Enter the membership type [Gold / Silver / Regular] : ");
	    String membership = sc.next();
	    double total = obj.calculateTotal(price1, price2, price3);
	    double discount = obj.calculateDiscount(total, membership);
	    double finalAmount = obj.calculateFinalAmount(total, discount);
	    
	    obj.displayAmount(total, discount, finalAmount);
	}

}

//3.Scenario: An online shopping application calculates the final bill based on the purchase 
//amount and membership type. 
//Requirements: 
//1. Create a class ShoppingCart. 
//2. Create a method calculateTotal() that accepts the prices of three products and 
//returns the total. 
//3. Create a method calculateDiscount() that accepts the total and membership type. 
//Apply: 
//○ Gold: 20% discount 
//○ Silver: 10% discount 
//○ Regular: 5% discount 
//4. Create a method calculateFinalAmount() that returns the amount after discount. 
//5. Create a method to display the total, discount, and final amount. 
//Sample input: ₹2,000, ₹1,500, ₹500; membership = Gold. 
//Expected output: 
//Total Amount: 4000.0 
//Discount: 800.0 
//Final Amount: 3200.0 