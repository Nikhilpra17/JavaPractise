package com.company;

public class TimeComplexity1 {

	//Function which sum and multiply the product of Array
	//Find time complexity for the same
	
	public static void sum_n_Product(int[] number) {
		int summation = 0; // --------------------------- O(1)
		int value = 1; // ------------------------------- O(1)
		for (int i =0; i<number.length; i++) { //-------- O(N)
			summation += number[i]; // ------------------ O(1)
		}
		for (int i =0; i<number.length; i++) { //-------- O(N)
			value = value*number[i]; // ----------------- O(1)
		}
		
		System.out.println(summation); // --------------- O(1)
		System.out.println(value); // ------------------- O(1)
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arra = {1,3,4,5};
		sum_n_Product(arra);
	}

}
