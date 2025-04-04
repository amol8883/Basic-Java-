package com.datastructures;

import java.util.Arrays;

public class FindString {

    public static void main(String[] args) {
        String[] str = {"ram","sham","ajay","vijay","suman","ram"};
        int count=0;
        String target="sham";

        Arrays.sort(str); // Sorting a string

        for (String total :str){
            if (total==target){
                count++;
            }
            System.out.println(total);// display all arraylist
        }
        System.out.println("target String is " + target+ " and count is "+ count); // Target string and count

        System.out.println("............................");











    }
}
