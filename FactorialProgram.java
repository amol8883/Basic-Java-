package com.it;

import java.util.Scanner;

public class FactorialProgram {

    //4! = 4*3*2*1 = 24

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i,fact =1;
        System.out.println("Check enter Number facter");
        int Number =sc.nextInt();

        for(i=1;i<=Number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of " + Number +" is: "+ fact);
    }
}