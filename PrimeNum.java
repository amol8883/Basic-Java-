package com.it;

public class PrimeNum {

    public static void main(String[] args) {

        int num = 12;
        int result;
        //int flag = 0;
        boolean flag =false;

        result = num / 2;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not prime ");
        }else
            for (int i = 2; i <= result; i++) {
                if (num % 2 == 0) {
                    System.out.println(num + " is not prime");
                     flag=true;
                    //flag = 0;
                    break;
                }
            }
            if (!flag) {
                System.out.println(num + " is prime");
            }



    }
}
