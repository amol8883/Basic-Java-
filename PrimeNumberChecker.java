package com.it;

 public class PrimeNumberChecker {

    public static void main(String[] args) {

        int numberToCheck = 5;
        if (isPrime(numberToCheck)) {
            System.out.println(numberToCheck + " is prime Number");
        } else {
            System.out.println(numberToCheck + " is not prime Number");
        }
    }

    public static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }
        for (int i=2; i<=Math.sqrt(number); i++) {
            if (number % i==0){
                return false;
            }
        }
        return true;
    }
 }