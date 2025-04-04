package com.java50basic;

public class PalindromeChecker {

    public static boolean isPalindrome(String str){

        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());

    }


    public static void main(String[] args) {
        String str="aaawaaa";

       if (isPalindrome(str)){
           System.out.println(str+" is palindrome");
       }else {
           System.out.println(str+" is Not palindrome");
       }
       int num = 12321;
       String s1= String.valueOf(num);
        if (isPalindrome(s1)){
            System.out.println(s1+" is palindrome");
        }else {
            System.out. println(s1+" is Not palindrome");
        }
    }
}
