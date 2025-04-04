package com.java50basic;

public class SwapingNumber {

    public static void main(String[] args) {
     // Using two variable swap the number
        int a=10, b= 20;

        System.out.println("Before Swapping the a= "+a+ " And b ="+b);

        a=a+b;
        a=a-b;
        b=a-b;
        System.out.println("After Swapping the a= "+a+ " And b ="+b);



    }
}
