package com.java50basic;

import java.util.Arrays;

public class FindListChar {

    public static char getLastChar(char[] array){

        if(array==null){
            throw new IllegalArgumentException("Array is Empty");
        }
        return array[array.length-1];

    }

    public static void main(String[] args) {

        char[] charList= {'b','e','t','h','m'};
        //Arrays.sort(charList);   using sorting find by order
        char last1= charList[charList.length-1];
        System.out.println("last  : "+last1);
        //find last use fun
        char lastChar= getLastChar(charList);
        System.out.println(" last char in given array "+lastChar);

    }
}


