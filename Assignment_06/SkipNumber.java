package com.java.Assignments.Assignment_06;

public class SkipNumber {

	public static void main(String[] args) {
		
		for(int i=1;i<=30;i++) {
			if(i%3==0) {
				continue;
			}else {
				System.out.println(i);
			}
		}

	}

}


//Q5. Skip Multiples of 3
//
//Print numbers from 1 to 30, but skip all numbers divisible by 3.
//
//- Use: for and continue