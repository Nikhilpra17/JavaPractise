package com.company;

import java.util.Scanner;

public class MinMaxOfArray {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
		int [] arr = {4,6,2,7,5};
		
		 int minimum = 0;
		    int maximum = 0;
		    int smallest = 0;
		    int largest=0;
		    
		    int leftpointer = 0;
		    int rightpointer = arr.length-1;
//		    
		    	while (leftpointer< rightpointer) {
		    		if (arr[leftpointer] < arr[rightpointer]) {
		    			smallest = arr[leftpointer];
		    			rightpointer --;
		    			
		    		}else {
		    			smallest = arr[rightpointer];
		    			leftpointer ++;
		    		}
		    		
		    }
		    System.out.println("Smallest: "+smallest);
	
	 int leftpointer1 = 0;
	 int rightpointer1 = arr.length-1;
	while (leftpointer1< rightpointer1) {
		if (arr[leftpointer1] < arr[rightpointer1]) {
			largest = arr[rightpointer1];
			leftpointer1 ++;
			
		}else {
			largest = arr[leftpointer1];
			rightpointer1 --;
		}
		
}
System.out.println("largest: "+largest);
}
}
