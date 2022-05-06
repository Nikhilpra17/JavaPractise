package com.company;

public class TimeComplexity2 {

	// Function which print the pair from the given array
	// Find time complexity for the same
	
	static void arrayPair(int[] number) {
		
		for (int i = 0; i<number.length; i++) { // --------------------- O(N)
			for (int k = 0; k<number.length; k++) { // ----------------- O(N)
				System.out.print(number[i]+ ""+ number[k]+ " "); // ---- O(1)
			}
			System.out.println(); // ----------------------------------- O(1)
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arra = {1,2,3,4,5};
		arrayPair(arra);
	}

}
