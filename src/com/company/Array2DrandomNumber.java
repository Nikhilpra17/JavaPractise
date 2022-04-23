//package com.company;
//
//public class Array2DrandomNumber {
//    public static void main(String[] args) {
//        int[][] table = new int[100][10];
//
//        // Task 3 – Create a 2D array with 100 rows and 10 columns.
//
//
//        /** Task 4
//         *
//         * 1. Using a nested loop, populate the array with random numbers.
//         * 2. Then, pass the updated array into print2DArray.
//         *
//         */
//        for (int i = 0; i < table.length; i++) {
//            for (int p = 0; p < table[i].length; p++) {
//                table[i][p] = random();
//            }
//
//        print2array(table);
//
//    }
//
//    public static int random() {
//        double num1 = Math.random() * 100;
//        int num = (int) num1 + 1;
//        return num;
//    }
//
//    public static void print2array(int[][] table) {
//        for (int i = 0; i < table.length; i++) {
//            for (int p = 0; p < table[i].length; p++) {
//                System.out.println(table[i][p] + " ");
//            }
//        }
//        /** Task 2
//         * Function name: print2DArray
//         * @param array ( int[][] )
//         *
//         * Inside the function:
//         *
//         *   1. prints the array such that:
//         *        • Each row takes up one line.
//         *        • There's a space between each value.
//         */
//    }
//}