package com.company;
import java.util.Locale;
import java.util.Scanner;
import java.math.*;

public class rough2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int p = 1; p <= i; p++) {
                System.out.print("*");
            }for (int o = 1; o<=num-i; o --){
                System.out.print(" ");}
//            }for (int k = 1; k<=num - i; k --){
//                System.out.print(" ");
//            }for (int m = 1; m<=i; m++){
//                System.out.print("*");
//            }
                System.out.println();

            }

        }
    }




