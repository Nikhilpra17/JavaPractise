package com.company;

public class PowerofNumberRecursion {

	// Calculate power of number using recursion
	
	public static int numberPower(int n, int p) {
		if (p==0) {
			return 1;
		}
		return n * numberPower(n, p-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberPower(2, 10));
	}

}
