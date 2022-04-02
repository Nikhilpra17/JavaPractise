package com.company;
import java.util.Scanner;
import java.text.DecimalFormat;

 public class roughy {
     public static void main(String[] args) {

         for (int i = 1; i <= 3; i++) {
             for (int g = 1; g <= 3 - i; g++) {
                 System.out.print("$");
             }
             for (int d = 1; d <= i; d++) {
                 System.out.print("*");
             }
             System.out.print("\n");
         }
     }
 }
