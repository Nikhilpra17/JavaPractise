package com.company;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
	
		// 6,5,3,1,8,7,2,4
		
		int[] data = {6,5,3,1,8,7,2,4};
		
		for (int i = 0; i < data.length; i++) {
			for (int k =i+1 ; k <data.length; k ++) {
				if (data[k]<data[i]) {
					int temp = data[k];
					data[k] = data[i];
					data[i] = temp;
				}
			}
			System.out.println(Arrays.toString(data));
		}
System.out.println(Arrays.toString(data));
	}

}
