package com.java50basic;

public class OddEvenNumber {


    public static boolean oddEven(int num) {

        if(num%2==0){
            System.out.println(" Given number is Even");
            return true;
        }else {
            System.out.println("Given number is Odd");
            return false;
        }

    }

    public static void main(String[] args) {

        final boolean b = oddEven(1);


    }
}
