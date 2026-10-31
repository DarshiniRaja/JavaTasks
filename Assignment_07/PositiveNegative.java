package com.java.Assignments.Assignment_07;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int PosCount = 0 , NegCount = 0, ZeroCount = 0;
		
		for(int num : arr) {
			if(num == 0) {
				ZeroCount++;
			}
			else if(num > 0){
				PosCount++;
			}
			else {
				NegCount++;
			}
		}
		
		System.out.println("Positive numbers count in array is " + PosCount);
		System.out.println("Negative numbers count in array is " + NegCount);
		System.out.println("Zeroes count in array is " + ZeroCount);
	}

}
