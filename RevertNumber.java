package com.java50basic;

public class RevertNumber {

    public static void main(String[] args) {

    String num = "12345677";
    int size= num.length();
    for (int i=0;i<size;i++){
        System.out.print(num.charAt(num.length()-i-1));
    }
}
}
