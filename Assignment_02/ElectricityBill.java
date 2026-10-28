package com.java.Assignments.Assignment_02;

import java.util.Scanner;

public class ElectricityBill {
	
	int bill;
	
	int calculateBill(int units) {
		if(units <= 100) {
			bill = units * 2;
		}else if(units <= 200) {
			bill = (100 * 2) + ((units - 100) * 3);
		}else {
			bill = (100 * 2) + (100 * 3) + (units -200) * 5;
		}
		
		return bill;
	}
	
	int addFixedCharge(int bill) {
		int fixedCharge = 50;
		return bill + fixedCharge;
	}
	
	void finalBill(int bill , int fixedCharge , int finalBill) {
		System.out.println("Energy Charge : " + bill);
		System.out.println("Fixed charge : " + fixedCharge);
		System.out.println("Final Bill : " + finalBill);
	}

	public static void main(String[] args) {
		ElectricityBill obj = new ElectricityBill();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units : ");
		int units = sc.nextInt();
		
		int bill = obj.calculateBill(units);
		
		int finalbill = obj.addFixedCharge(bill);
		
		obj.finalBill(bill, 50, finalbill);
		
	}

}


//4.Scenario: An electricity board calculates a household bill based on units consumed. 
//Requirements: 
//1. Create a class ElectricityBill. 
//2. Create a method calculateBill() that accepts the number of units consumed and 
//returns the bill amount using these slabs: 
//○ First 100 units: ₹2 per unit 
//○ Next 100 units: ₹3 per unit 
//○ Above 200 units: ₹5 per unit 
//3. Apply the rates progressively. For example, 250 units means 100 units at ₹2, 100 units 
//at ₹3, and 50 units at ₹5. 
//4. Create a method addFixedCharge() that accepts the bill amount and adds a fixed 
//charge of ₹50. 
//5. Create a method to display the final bill. 
//Sample input: 250 units. 
//Expected output: 
//Energy Charge: 750.0 
//Fixed Charge: 50.0 
//Final Bill: 800.0 