package com.java50basic;

public class RevertLogic {

    public static String revertString(String inputString){

        StringBuilder result = new StringBuilder(inputString);
        result.reverse();
        return result.toString();

    }

    public static void main(String[] args) {

        String inputString = "Computer Applications";

        System.out.println(inputString.length());
       System.out.println(inputString.charAt(7));
        System.out.println(inputString.indexOf(" "));
        System.out.println(inputString);

        String result= revertString(inputString);



        System.out.println(result);
    }
}
