package com.company;
import java.util.*;

class Rough{
	public static void main(String[] args) {
	
		int[] num = {2,1,7,3,4};
		int target = 6;
//		int [] array = new int{2};
//		
//		
//		for (int i =0; i<num.length; i++) {
//			for (int k =1; k <num.length; k++) {
//				int sum = num[i] + num[k];
//				ArrayList<Integer> numsz = new ArrayList<Integer>();
//				if (target == sum) {
//					numsz.add(i);
//					numsz.add(k);
//					System.out.println(numsz);
//				}
//			}
//		}
		
		int [] aa = twoSum(num,target);
		System.out.println(Arrays.toString(aa));
		
		
	}
	 public static int[] twoSum(int[] nums, int target) {
	        
		 int [] value = new int[2];
		 for (int i =0; i<nums.length; i++) {
			for (int k =1; k <nums.length; k++) {
				int sum = nums[i] + nums[k];
					if (target== sum) {
						value[0] = i;
						value[1] = k;
				}
			}
         }
	 return value;
 }
}