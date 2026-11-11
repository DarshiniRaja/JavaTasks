package com.java.Assignments.Assignment_08;

import java.util.Scanner;

public class firstNonRepeatedChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] freq = new int[256];
		for(char ch : str.toCharArray()) {
			freq[ch]++;
		}
		for(char ch : str.toCharArray()) {
			if(freq[ch] == 1) {
				System.out.print("The First non-repeated character in string is "+ (char)ch);
				return;
			}
		}

	}

}


//Q1. First Non-Repeated Character
//
//Write a Java program to find the first character that appears only once in a String.
//
//Input: swiss
//
//Expected Output: w