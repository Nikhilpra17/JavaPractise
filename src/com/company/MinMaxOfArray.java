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
		    
		    int leftpointer = 0;
		    int rightpointer = arr.length-1;
//		    for (int i =0 ; i < arr.length; i++){
//		    if (arr.length %2 == 0)	
		    	while (leftpointer< rightpointer) {
		    		if (arr[leftpointer] < arr[rightpointer]) {
		    			smallest = arr[leftpointer];
		    			rightpointer --;
		    			
		    		}else {
		    			smallest = arr[rightpointer];
		    			leftpointer ++;
		    		}
		    		
		    }
		    System.out.println(smallest);
	}

}
