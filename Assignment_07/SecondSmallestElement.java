package com.java.Assignments.Assignment_07;

import java.util.Scanner;

public class SecondSmallestElement {
	
	 static int SecondSmallest(int[] arr) {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for(int num : arr) {
			if(num < first) {
				second = first;
				first = num;
			}
			if(num < second && num != first) {
				second = num;
			}
		}
		return second;
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Second Smallest Element in the array is " + SecondSmallest(arr));
		
	}

}
