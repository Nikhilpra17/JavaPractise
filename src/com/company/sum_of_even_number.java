package com.company;

public class sum_of_even_number {
    public static void main(String[] args) {
        int sum=0;
        int n=10;
        for (int i = 0; i<n ; i++){
            sum = sum+(i*5);
        }
        System.out.print("the sum of the series is: ");
        System.out.println(sum);
    }
}
