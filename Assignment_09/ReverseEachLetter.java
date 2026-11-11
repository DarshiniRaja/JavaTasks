package com.java.Assignments.Assignment_08;

import java.util.Scanner;

public class ReverseEachLetter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev = "";
		int start = 0,end;
		
		for(int i =start;i<str.length();i++) {
			if(str.charAt(i) == ' ' || i == str.length()-1)  {
				if(str.charAt(i) == ' ')
					end = i-1;
				else
					end = i;
			
			for(int j = end;j>=start;j--) {
				rev += str.charAt(j);
			}
			start = i + 1;
			rev += " ";
			}
		}
		
		System.out.println("The reversed word is "+ rev);
	}

}

//Q4. Reverse Each Word
//
//Write a Java program to reverse each word in a sentence without changing the order of the words.
//
//Input: Java is easy
//
//Expected Output: avaJ si ysae