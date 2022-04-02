package com.company;
import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();

        if (a%4 == 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}
