package com.java50basic;

public class ReverseString {


    public static void main(String[] args) {
        String str= "Amol Bandge";
        int size=  str.length();
        System.out.println(size);
        for(int i=0; i<size;i++){
           System.out.print(str.charAt(str.length()-i-1));



       }
    }
}
