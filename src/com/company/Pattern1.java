package com.company;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1= scan.nextInt();

        for (int i=1; i<=num1; i++) {
            for (int k = num1; k > i; k--){
                System.out.print(" ");
            }
            for (int l = 1 ; l <=i; l++){
                System.out.print("*");
            }
            for (int m = 1 ; m <i ; m++){
                System.out.print("*");
            }
            for (int u = num1-1; u >=i; u -- ) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
