package com.it;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        System.out.println("Enter a String ");

        Scanner sc =new Scanner(System.in);
        //int no= sc.nextInt();
        String str= sc.nextLine();

        String str2 = new StringBuffer(str).reverse().toString();
        System.out.println(str2);

        System.out.println("||||||||||||||||||||||");
        char target = 'a';
        int count=0;

        for(char c : str.toCharArray()){
            if (c==target || c==Character.toUpperCase(target)) {
                count++;
            }
        }
        System.out.println("target character is "+target+ " and count is "+ count);

    }
}
