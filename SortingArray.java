package com.java50basic;

import java.util.Arrays;

public class SortingArray {


    public static void main(String[] args) {

        int[] aaray= {1,4,3,7,2,8,-3,5,9};
        Arrays.sort(aaray);
        System.out.println(Arrays.toString(aaray));

        char[] ch= {'a', 'c','f','y','e','b'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        String[] str= {"bandgeamol", "amolbandge", "eegrt","cat","cut","amol"};

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

    }
}
