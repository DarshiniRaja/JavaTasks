package com.java.basics.patterns;

public class PalindromeTraingular {

	public static void main(String[] args) {
		int n =4 ;
		for(int i=1;i<=n;i++) {
			for(int k =n-i;k>0;k--) {
				System.out.print("  ");	
			}
			for(int j=i-1;j>0;j--) {
				System.out.print(j+1 + " ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}

//      1 
//    2 1 2 
//  3 2 1 2 3 
//4 3 2 1 2 3 4
