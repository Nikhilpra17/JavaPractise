package com.company;
import java.util.*;

public class frequencyInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();

        int[] array = {5, 3, 65, 56,15, 98, 54, 21, 21, 54, 21};
        int count = 0;
         for (int i = 0; i<array.length; i++){
             if (array[i] == k){
                 count ++;
             }
         }
         System.out.println(count);

    }
}
