package com.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayExample {

    public static void main(String[] args) {

        Integer[] array = {12,1,4,6,7,5};
        // by using collection here Convert array int list

        List<Integer> list = Arrays.asList(array);
        Collections.reverse(list);
        System.out.println("Reverse Arrray: "+Arrays.toString(array));

        // another way

        int[] numbers = {2,35,78,8,55,44};
        int[] reverseArray = new int[numbers.length];

        for (int i=0;i<numbers.length;i++){
            reverseArray[i] = numbers[numbers.length-1-i];

        }
        System.out.println("reverseArray: "+Arrays.toString(reverseArray));
    }
}
