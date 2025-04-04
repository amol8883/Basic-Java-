package com.array;

import java.util.stream.IntStream;

public class CheckSortedArray {

    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,7,8};

        //Using Stream
        boolean isSorted = IntStream.range(0,array.length-1).allMatch(i->array[i] <=array[i+1]);


        if (isSorted){
            System.out.println("The array is sorted in ascending order");
        }else{
            System.out.println("The array is Not sorted in ascending order");

        }
    }
}
