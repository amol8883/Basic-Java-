package com.it;

import java.util.Arrays;

public class ProblemSolveTest {

    public static void main(String[] args) {

        int[] number= {3, -3, 45, 2, -19, -7, 56, 45};

        int[] positiveNumber= separatePositiveNumber(number);
        int[] negativeNumber=separateNegativeNumber(number);

        // print the separated array

        System.out.println("Original Arrays "+Arrays.toString(number));
        System.out.println("Positive Arrays " +Arrays.toString(positiveNumber) );
        System.out.println("Negative Array "+Arrays.toString(negativeNumber));

    }
    // filter positive/ Negative Number Use Function

    private static int[] separatePositiveNumber(int[] number){
        return Arrays.stream(number).filter(num ->num >0).toArray();
    }

    private static int[] separateNegativeNumber(int[] number){
        return Arrays.stream(number).filter(num -> num <=0).toArray();

    }
}

