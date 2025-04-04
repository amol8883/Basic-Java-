package com.string;

public class Example {

    int a=12345;
    String st;

    {
       // st = String.valueOf(a);
       //  st= Integer.toString(a);
       st =  a +"";
        StringBuilder sb = new StringBuilder(st).reverse();
        System.out.println(" reverse int value using String "+ sb);
    }


    public static void main(String[] args) {

        Example ex = new Example();
        System.out.println("reverse int value "+ex.st);


     int number = 12345;
     int reverse = 0;

     while (number!=0){
     int digit = number%10;
     reverse =reverse*10+digit;
     number/=10;
     }
        System.out.println(reverse);

     String str = "amol";
     StringBuilder sbl = new StringBuilder(str).reverse();
     System.out.println(sbl);

     String str2= Integer.toString(number);
        System.out.println("New String "+str2);















    }

}
