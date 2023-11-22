package com.it;

public class CheckAge {

   static void checkAge(int age){

       if(age<18){
           System.out.println("you are not eligible for vot");
       }else{
           System.out.println("you are  eligible for vot");
       }

    }

    public static void main(String[] args) {
 checkAge(20);


    }
}
