package com.array;

import java.util.Arrays;

public class SortZerosAndOnes {
    public static void main(String[] args) {
        int[] array = {0,1,0,1,0,1,0,1};

        Arrays.sort(array);
        System.out.println("Sorted array  "+Arrays.toString(array));

        // count the numbers 0s
        int countZere =0;
        for (int num2 : array){
            if(num2==0){
             countZere++;
            }
        }

        for(int i=0; i< array.length;i++){
            if(i<countZere){
               array[i]=0;
            }else {
                array[i]=1;
            }
        }
        System.out.println("sort arry: "+array);
    }
}
