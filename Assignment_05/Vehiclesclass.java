package com.java.Assignments.Assignment_05;

class Vehicle{
	
	void start() {
		System.out.println("Vehicle is starting");
	}
	void stop() {
		System.out.println("Vehicle is stopping");
	}
}

class Car extends Vehicle{
	void displayType() {
		System.out.println("Vehicle Type is Car");
	}
}

class Bike extends Vehicle{
	void displayType() {
		System.out.println("Vehicle Type is Bike");
	}
}


public class Vehiclesclass {
	public static void main(String[] args) {
		Car car = new Car();
		Bike bike = new Bike();
		
		car.displayType();
		car.start();
		car.stop();
		System.out.println("---------------------");
	    bike.displayType();
	    bike.start();
	    bike.stop();
		
	}

}
