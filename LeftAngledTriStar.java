package com.java.basics.patterns;

public class LeftAngledTriStar {

	public static void main(String[] args) {
		//LEFT HALF PYRAMID
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5-i;j++) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(" *");
//			}
//			
//			System.out.println();
//		}
		
		//REVERSE LEFT HALF PYRAMID
		for(int i=5;i>0;i--) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			
			System.out.println();
		}

	}

}
