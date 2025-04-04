package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Sorting array in accenting orders
public class SortArrayExample {

    public static void main(String[] args) {
        System.out.println("1st @@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        int[] numbers ={1,4,5,2,8,3};
        Arrays.sort(numbers);
        System.out.println("Sorted Array: "+ Arrays.toString(numbers));

        // using Stream array short
        System.out.println("2nd @@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        int[] num ={4,2,5,11,5,7,1};
        int[] sortedNumbers =  Arrays.stream(num).sorted().toArray();
        System.out.println("Sorted Array: " + Arrays.toString(sortedNumbers));


        // Using collection
        System.out.println("3rd @@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        List<Integer> numb = Arrays.asList(5,6,1,9,2,3);

        List<Integer> sortedArray = numb.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted array: "+ sortedArray);

        //
        System.out.println( "4th @@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Integer[] numbe = {5, 3, 8, 1, 2};

        // Sorting using Collections
        Arrays.sort(numbe);

        System.out.println("Sorted Array: " + Arrays.toString(numbe));


    }
}
