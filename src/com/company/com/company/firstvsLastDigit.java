package com.company;
import java.util.*;

public class firstvsLastDigit {
    public static void main(String[] args){
        // Scanner scan = new Scanner(System.in);
        // int num = scan.nextInt();

        // for (int i = 1; i <= num; i++){
        //     int number = scan.nextInt();
        //     String numberAsString = Integer.toString(number);
        //     ArrayList<Character> arrlist = new ArrayList<>();
        //     for(int k=0; k < numberAsString.length(); k++){
        //         arrlist.add(numberAsString.charAt(k));
        //     }
        //     System.out.println(arrlist);
        //     System.out.println(arrlist.get(0)+" "+arrlist.get(arrlist.size()-1));
        // }
            firstandlast();
    }
    static void firstandlast(){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++){
            int number = scan.nextInt();
            String numberAsString = Integer.toString(number);
            int rpt = numberAsString.length() - 1 ;
            System.out.println( numberAsString.charAt(0)+ " "+numberAsString.charAt(rpt));

        }
        scan.close();
    }
}
