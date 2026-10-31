package com.java.Assignments.Assignment_07;

import java.util.Scanner;

public class AverageOfElements {
	
	static double average(int[] arr) {
		int sum = 0;
		int n = arr.length;
		for(int num : arr) {
			sum += num;
		}
		return sum / n;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Average in array is " + average(arr));
		
		
	}

}
