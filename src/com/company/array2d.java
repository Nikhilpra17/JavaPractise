package com.company;

public class array2d {
        public static void main(String[] args) {

            double [][] price = {
                    {12.99, 8.99, 9.99, 10.49, 11.99},
                    {0.99, 1.99, 2.49, 1.49, 2.99},
                    {8.99, 7.99, 9.49, 9.99, 10.99}

            };


            for (int i = 0; i < price.length; i ++) {
                switch (i) {
                    case 0:
                        System.out.print("Baking: ");
                        break;
                    case 1:
                        System.out.print("Beverage: ");
                        break;
                    case 2:
                        System.out.print("Cereal: ");
                        break;
                }
                for (int k = 0; k < price[i].length; k++) {
                    System.out.print(price[i][k] + "    ");
                }
                System.out.println();
            }

        }
    }

