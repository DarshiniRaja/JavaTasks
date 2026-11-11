package com.java.Assignments.Assignment_08;

import java.util.Scanner;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder result = new StringBuilder();
		int[] freq = new int[256];
		for(char ch : str.toCharArray()) {
			freq[ch]++;
			if(freq[ch] == 1) {
				result.append((char)ch);
			}
		}
		
		System.out.print("Duplicates removed string is "+result);

	}

}

//Q2. Remove Duplicate Characters
//
//Write a Java program to remove duplicate characters while maintaining the original order.
//
//Input: programming
//
//Expected Output: progamin