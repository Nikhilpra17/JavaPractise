package com.company;
public class Solution {
    public int solve(int A) {
        int sum = 0;
        if (A >=1 && A <= 500){
            for (int i = 1; i <= A; i++ ){
                if (i % 2 == 0){
                    sum = sum + i;
                }
                // System.out.println(sum);
            }
            Long ab = new Long(67);
            Long aa = Long.valueOf(67);
        }
        return sum;
    }
}
