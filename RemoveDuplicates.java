package com.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

// Using Stream remove duplicate

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] array= {1,5,8,7,3,5,9,7,5,6};

        int[] unique = Arrays.stream(array).distinct().toArray();
        System.out.println("Removed Duplicate: "+Arrays.toString(unique));

        // Convert the array to a Set
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : array){
             set.add(num);
        }

        System.out.println("Array with duplicates removed: " +set);

        /*

        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }

        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
     */

    }
}
