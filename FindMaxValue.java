package com.java50basic;

import java.util.Arrays;

public class FindMaxValue {


    public static char getLastchar(char[] array){

        if(array.length==0){

            throw new IllegalArgumentException("Array is Empty");

        }
        return array[array.length-1];
    }


    public static void main(String[] args) {

        char[] charArray= {'a','g','k','h','e','b','z','s'};
       Arrays.sort(charArray);

        char last= charArray[charArray.length-1];
        System.out.println("********LAST***** >>"+last);
        char lastChar= getLastchar(charArray);

        System.out.println("Lastchar Array "+lastChar);

        int[] arr= {22,334,555,66,78,33,999,888};

        System.out.println("Given array "+Arrays.toString(arr));
        //Arrays.sort(arr);
        System.out.println("Sorting Array "+ Arrays.toString(arr));
        int max= arr[0];  // accending arder
            for (int i=1;i<arr.length;i++){
                if(arr[i]> max)
                    max=arr[i];
            }

        System.out.println("Largest in given array is "+max);
    }






}


