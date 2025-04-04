package com.java50basic;

public class ExceptionConcepts {
    public static void main(String[] args) {


        int a=1;
        int b=0;

        try{
     System.out.println(a/b);
     }
       catch(ArithmeticException e){
           System.out.println(e.toString());
        }


    try{
        System.out.println(a/b);
    }
    catch(ArithmeticException e) {
        System.out.println(e.getMessage());
    }


    }

}
