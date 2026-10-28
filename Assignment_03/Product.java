package com.java.Assignments.Assignment_03;

public class Product {
	int productId;
	String productName;
	double price;
	Product(){
		 productId = 101;
		 productName = "Unknown";
		 price = 0.0;
	}
	
	Product(int productId, String productName){
		this.productId = productId;
		this.productName = productName;
		this.price = 0.0;
	}

	Product(int productId, String productName,double price){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	void displayProducts() {
		System.out.println("Product ID :" + productId);
		System.out.println("Product Name :" + productName);
		System.out.println("Product Price :" + price);
		
		System.out.println("--------------------------");
	}

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product(102,"Laptop");
		Product p3 = new Product(103,"Mobile",45000.00);
		
		p1.displayProducts();
		p2.displayProducts();
		p3.displayProducts();
		

	}

}

//4.Scenario: An online shopping application allows products to be created with different levels of 
//information. 
//Requirements: 
//1. Create a class Product with productId, productName, and price. 
//2. Create three constructors: 
//○ A no-argument constructor. 
//○ A constructor accepting productId and productName. 
//○ A constructor accepting productId, productName, and price. 
//3. Initialize appropriate values in each constructor. 
//4. Create three objects, each using a different constructor. 
//5. Display all product details. 
//Task: Demonstrate how Java selects the correct constructor based on the arguments supplied. 