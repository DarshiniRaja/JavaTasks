package com.java.Assignments.Assignment_08;

import java.util.Scanner;

public class SecondMostRepChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int[] freq = new int[256];
		for(char ch : str.toCharArray()) {
			freq[ch]++;
		}
		
		int first = Integer.MIN_VALUE,second = Integer.MIN_VALUE;
		for(int count : freq) {
			if(count > first) {
				second = first;
				first = count;
			}
			if(count > second  && count != first) {
				second = count;
			}
		}
		
		for(char ch : str.toCharArray()) {
			if(freq[ch] == second) {
				System.out.print("The second most repeated character is " + (char)ch) ;
				return;
			}
		}
		
		

	}

}

//Q5. Find the Second Most Repeated Character
//
//Write a Java program to find the second most frequently occurring character in a String.
//
//Input: aabbcccdddd
//
//Expected Output: c (frequency: 3)