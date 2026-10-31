package com.java.Assignments.Assignment_07;

import java.util.Scanner;

public class LargestElement {
	
	 static int Largest(int[] arr) {
			int first = Integer.MIN_VALUE;
			
			for(int num : arr) {
				if(num > first) {
					first = num;
				}
			}
			return first;
		}
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The largest Element in the array is " + Largest(arr));

	}

}
