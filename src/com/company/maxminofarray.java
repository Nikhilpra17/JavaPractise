package com.company;
import java.util.*;

public class maxminofarray {
    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        // int N = scan.nextInt();

        // int [] table = new int[N];
        // for(int i = 0; i<table.length; i++){
        //     table[i] = scan.nextInt();
        // }
        // int [] table = (int)args
        int[] table = new int[args.length];
for(int i = 0;i < table.length;i++)
{
   // Note that this is assuming valid input
   // If you want to check then add a try/catch 
   // and another index for the numbers if to continue adding the others (see below)
   table[i] = Integer.parseInt(args[i]);
}
        System.out.println(Arrays.toString(table));
       
        int max= table[0];

        for (int k = 1 ; k<table.length; k++){
            if (max<table[k]){
                max = table[k];
            }


        }

        int min = table[0];
        for (int m = 1; m <table.length; m++){
            if (table[m]<min){
                min = table[m];
            }
        }
        System.out.println(max + " " + min);


    }
}
    
