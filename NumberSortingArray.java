package com.datastructures;

import java.util.Arrays;

public class NumberSortingArray {

    public static void main(String[] args) {

        int[] str ={1201,2225,1554,463,124};

        Arrays.sort(str);
        char start;

        for(int total :str) {
            System.out.println(total);
        }
    }
}
