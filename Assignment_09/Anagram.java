package com.java.Assignments.Assignment_08;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine().trim().toLowerCase();
		String str2 = sc.nextLine().trim().toLowerCase();
		int[] freq = new int[256];
		if(str1.length() != str2.length()) {
			return;
		}
		for(int i=0;i<str1.length();i++) {
			freq[str1.charAt(i)]++;
			freq[str2.charAt(i)]--;
		}
		
		for(char ch : str1.toCharArray()) {
			if(freq[ch] != 0) {
				System.out.println("Not an Anagram");
				return;
			}
		}
		
		System.out.println("Strings are Anagram");

	}

}

//Q3. Check Anagram
//
//Write a Java program to check whether two Strings contain the same characters in a different order.
//
//Input: listen, silent
//
//Expected Output: Anagram