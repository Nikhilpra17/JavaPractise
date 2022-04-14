package com.company;
import java.util.*;

public class adjacentValueInArray{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();

        int[] array = {5, 3, 65, 56,15, 98, 54, 21, 21, 54, 21};
        boolean value = false;
        for (int i =1; i <array.length; i++){
           if (Math.abs(array[i]-array[i-1])== k){
               value = true;
           } 
        }
        System.out.println(value);

    }
}