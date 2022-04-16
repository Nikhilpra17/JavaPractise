package com.company;
import java.util.*;

public class primeNumberRange {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for (int i = 1; i < N; i++) {

            if (i == 1 || i == 0)
                continue;

            boolean prime = true;

            for (int p = 2; p <= i / 2; p++) {

                if (i % p == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime == true)
                System.out.println(i);

        }
    }
}

    
}
