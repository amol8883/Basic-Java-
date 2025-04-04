package com.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArraysExample {

    public static void main(String[] args) {

     //   int[] array1 = new int[]{1,4,3,2}; this also use
     //   int[] array2 = new int[]{9,5,6,8}; this also use but below is simple to use

        int[] array1 = {1,4,3,2};
        int[] array2 = {9,5,6,8};

        int[] mergeArray = IntStream.concat(Arrays.stream(array1),Arrays.stream(array2)).toArray();
        System.out.println("MergeArray: "+ Arrays.toString(mergeArray));
        Arrays.sort(mergeArray);
        System.out.println("After Sort: "+Arrays.toString(mergeArray));


    }
}

