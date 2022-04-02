package com.company;
import java.util.*;

public class pizzaDeliveryArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pizza toppings do you want?.");
        int aa = scan.nextInt();
        scan.nextLine();

        String[] topping = new String[aa];

        System.out.println("Great, Enter each topping");
        for (int i= 0; i <topping.length; i++){
            System.out.println();
        }


        // Task 2 – Create the array here

        /** Task 3
         *  print Great, enter each topping!
         *  Create a for loop that runs through the length of the array.
         *
         */

        /** Task 4 – Pick up the user's toppings and store them in the array.
         *
         *  See the workbook article for more detail
         *
         */

        /** Task 5 –  Loop through the length of the array and print each topping
         *
         *  See the workbook article for more detail
         *
         */

        /** Task 6 –  Confirm the order
         *
         *  See the workbook article for more detail
         *
         */

        scan.close();
    }
}