package com.java50basic;

public class PrimeNumberCheck {

    public static boolean isPrime(int n){
        if(n==0 || n ==1){
          return false;
        }

        if(n==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(n) ;i++){
              if(n%i ==0){
                  return false;
              }
        }
/*
        for(int i=2;i<=n/2;i++){
            if (n%2==0){
                return true;
            }
        }
*/
        return true;
    }

    public static void main(String[] args) {

        int n= 8;
         boolean b = isPrime(n);
        System.out.println(n+" isPrime Number: "+b );

    }
}
