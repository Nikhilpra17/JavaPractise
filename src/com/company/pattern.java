package com.company;

import java.util.*;

public class pattern {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int [] table = new int[N];

        for (int i = 0; i<N; i++){
        table[i] = scan.nextInt();    
        } 

        String temp = "" ;
        
        for (int p = 0; p<N; p++){
            if (table[p]<0){
                temp = temp + table[p] + " ";
            }
            
        }
        System.out.print(temp);
        
    }
}
