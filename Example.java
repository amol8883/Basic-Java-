package com.exceptionHandling;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class Example {

    int[] numbers = {2,4,6,8,10,12};


    void showNumbers(){
        System.out.println("Length of Array is  "+numbers.length);
        try {
            System.out.println(numbers[10]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("not valid input");
        }finally {
            System.out.println("please select in rang od array value");
        }
        for (int a :numbers){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        Example ex =new Example();

        ex.showNumbers();

    }
}
