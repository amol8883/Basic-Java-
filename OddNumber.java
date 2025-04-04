package com.java50basic;

import java.util.ArrayList;
import java.util.List;

public class OddNumber {

    public static boolean onlyOddNumber(List<Integer> list){

        for (int i: list){
            if(i%2==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(11);

        // Call the onlyOddNumbers function and print the result
        boolean allOdd = onlyOddNumber(numbers);
        System.out.println("Are all numbers odd? " + allOdd);

    }

}

