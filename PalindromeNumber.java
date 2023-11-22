package com.it;

import java.util.Scanner;

public class PalindromeNumber {


    public static void main(String[] args) {


        String original,reverse ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number/String to check if it a palindrome");
        original=sc.nextLine();
        int length= original.length();

        for(int i=length-1;i>=0;--i)
            reverse= reverse+original.charAt(i);
            if(original.equals(reverse))
                System.out.println("Enter String/Number is palindrome");
            else
                System.out.println("Enter String/Number isn't palindrome");


    }

}



