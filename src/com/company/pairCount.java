package com.company;
import java.util.*;

public class pairCount {

    public int[] counting(int a, int[]array){
        
    }
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("No of Arrays: ");
        int k = scan.nextInt();

        for (int i = 1 ; i <=k; i++){
            System.out.println("Length of Arrays: ");
            int pp = scan.nextInt();
            int [] array = new int[pp];
            for (int ij = 0; ij<array.length; ij++){
                array[ij] = scan.nextInt();
            }
            System.out.println(Arrays.toString(array));
            
            for (int pl = 0; pl<array.length; pl++){
                int count = 0;
                for (int m = 0; m<array.length; m ++){
                    if (array[pl] == array[m]){
                        count ++;
                    }
                if (count == 1);
                String temp = " ";
                temp = array[m] + " ";
                System.out.print(temp.trim());
                }
            }
        }
        

    }
}

