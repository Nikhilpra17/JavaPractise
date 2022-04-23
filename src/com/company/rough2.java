package com.company;

import java.util.Scanner;

import javax.print.FlavorException;

public class rough2 {
    public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   int k = scan.nextInt();

   int []array = {32, 656, 65,98,54,21,3};
   

   Boolean bool = false;
   for (int m = 0; m <array.length; m++){
       if (array[m] == k){
           bool = true;
            }
       }
       if (bool == true){
           System.out.println("Value is present in the array");
       }else{
           System.out.println("Value is not present");
       }
   }

    }
