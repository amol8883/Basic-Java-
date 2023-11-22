package com.it;

import java.util.Scanner;

public class PalindromeEx1 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Check Enter Number ");
        int no= sc.nextInt();
        int temp=no;
        int rev=0,rem;

        while (temp!=0){
            rem=temp%10;  //121%10 =1
            rev=rev*10+rem; //0*10+1=1
            temp=temp/10;   // 121/10= 12.samething
        }

        if (no==rev){
            System.out.println(no+" is palindrome");
        }else {
            System.out.println(no+" is not palindrome");
        }
    }
}
