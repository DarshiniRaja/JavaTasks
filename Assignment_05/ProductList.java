package com.java.Assignments.Assignment_05;


class Product{
	int productId;
	double price;
	
}
class Electronics extends Product{
	void displayCategory() {
		System.out.println("Product Id is " + productId);
		System.out.println("Product price is " + price);
		System.out.println("Product Category is Electronics");
	}
}

class Clothing extends Product{
	void displayCategory() {
		System.out.println("Product Id is " + productId);
		System.out.println("Product price is " + price);
		System.out.println("Product Category is Clothing");
	}
}
class Books extends Product{
	void displayCategory() {
		System.out.println("Product Id is " + productId);
		System.out.println("Product price is " + price);
		System.out.println("Product Category is Books");
	}
}

public class ProductList {

	public static void main(String[] args) {
		
		Electronics elec = new Electronics();
		Clothing cloth = new Clothing();
		Books book = new Books();
		
		elec.productId = 100;
		elec.price = 500.0;
		elec.displayCategory();
		System.out.println("--------------------");
		
		cloth.productId =105;
		cloth.price = 2000;
		cloth.displayCategory();
		System.out.println("--------------------");
		
		book.productId = 110;
		book.price = 250;
		book.displayCategory();
		

	}

}
