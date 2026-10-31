package com.java.Assignments.Assignment_07;

import java.util.Scanner;

public class CountEvenOrOdd {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int EvenCount = 0 , OddCount = 0;
		
		for(int num : arr) {
			if(num % 2 == 0) {
				EvenCount++;
			}
			else {
				OddCount++;
			}
		}
		
		System.out.println("Even numbers in array is " + EvenCount);
		System.out.println("Odd numbers in array is " + OddCount);
		
	}

}

//Write a program to count how many even and odd numbers are present in an array.