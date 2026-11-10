package com.java.basics.patterns;

public class StarTriangle {

	public static void main(String[] args) {
		// RIGHT HALF PYRAMID
//		for(int i=1;i<=5;i++) { //number of rows
//			for(int j=1;j<=i;j++) { //number of elements of row
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		

		// REVERSE RIGHT HALF PYRAMID
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
