package com.company;
import java.util.*;

public class TimeComplexity3 {
	
	// Create a program which take array as a parameter and reverse it.
	// Find time complexity for the same
	
	public static int[] reverse(int[] number) {
		int [] number2 = new int [number.length];
		
		for (int i =0; i<number.length; i++) {
			number2[i]= number[number.length-1-i];
		}
		
		return number2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arra = {1,2,3,4,5,6,7};
		
		int [] koi = reverse(arra);
		System.out.println(Arrays.toString(koi));
	}

}
