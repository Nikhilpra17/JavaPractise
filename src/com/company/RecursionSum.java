package com.company;

public class RecursionSum {

	// Find the sum of positive number using Recursion
	
	public static int sum(int n) {
		if (n ==1) {
			return n;
		}
		return n + sum(n-1);
	}
	
	// Find the sum of the digit of positive integer using recursion 
	
	public static int sumDigit(int n) {
		if (n == 0) {
			return 0;
		}
		return (n%10)+sumDigit(n/10);
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(sumDigit(729));

	}

}
