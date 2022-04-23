package com.company;

import java.util.*;

public class rough3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Length of initial table");
        int N = scan.nextInt();
        
        System.out.println("Enter the table data");
        int [] table = new int[N];
        for (int i = 0 ; i < N; i ++){
            table[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(table));
        
        System.out.println("Enter the value which you wanted to add in the ARRAY");
        int Y = scan.nextInt();

        System.out.println("Enter the Position at which you wanted to add the value in the ARRAY");
        int X = scan.nextInt();

        int [] updatedTable = new int[table.length + 1];

        for (int i = 0 ; i < updatedTable.length ; i ++ ){
            if (i < X-1 ){
            updatedTable[i] = table[i];
            } else if (i == X -1){
                updatedTable[i] = Y;
            } else {
                updatedTable[i] = table[i-1];
            }

        }
        // System.out.println("The initial Table : "+ Arrays.toString(table));
        // System.out.println("The updated Table : "+ Arrays.toString(updatedTable));
        
        for (int i = 0; i< updatedTable.length; i++){
            String temp ="";
                  temp = temp + updatedTable[i] + " ";
    
            System.out.print(temp);
        }
    }


        }