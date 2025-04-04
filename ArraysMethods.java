package com.datastructures;

import java.util.Arrays;

public class ArraysMethods {

    public static void main(String[] args) {

        int[] num= {22,56,352,440,505,117,9,2};


        //Sorting a array
        Arrays.sort(num);
        System.out.println("Sorting Array "+ Arrays.toString(num));

        for(int i:num){
            System.out.print(" "+i);


        }
        System.out.println("         >>>>>>>>>>>>");
        for(int j=0;j<num.length;j++){
            System.out.print(" "+num[j]);
        }
        System.out.println("         >>>>>>>>>>>>");

        //search for element
        int[] num2= {22,56,352,440,505,117,9,2};
         Arrays.sort(num2);
        int index= Arrays.binarySearch(num2, 9);  // Index is 1
        System.out.println("Index of 9 "+index);

        int[] copyArray= Arrays.copyOf(num2,11);

        System.out.println(copyArray.length);




    }
}
