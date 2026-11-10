package com.java.basics.patterns;

import java.util.Scanner;

public class NumberTriangularPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//4
		for(int i=1;i<=n;i++) {
			for(int k =1;k<=n-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}

//   1 
//  2 2 
// 3 3 3 
//4 4 4 4 
