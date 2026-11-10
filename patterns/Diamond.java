package com.java.basics.patterns;

public class Diamond {

	public static void main(String[] args) {
		//LEFT HALF PYRAMID
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			
			for(int j=1;j<=i;j++) { //number of elements of row
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		//REVERSE LEFT HALF PYRAMID
		for(int i=4;i>0;i--) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

}
