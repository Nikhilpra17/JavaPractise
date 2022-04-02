package com.company;

public class Main{

    public static void staticTest(String [] args) {
        System.out.println("I am Nikhil");
    }

    public void nonStatic(){
        System.out.println("This is an non static example");
    }

    public static void main(String [] args){
        Main MainObject = new Main();
        System.out.println("Hello this beautiful world!!!!");
        MainObject.nonStatic();



    }
}
