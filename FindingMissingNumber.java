package com.array;

import java.util.Arrays;

public class FindingMissingNumber {

    public static void main(String[] args) {
        int[] array ={1,2,4,5,6,7};

        Arrays.sort(array);
        int missingNum = -1;

        for (int i=0;i<array.length;i++){
            if(array[i]!=i+1){
                missingNum = i+1;
                break;
            }
        }
    /*    if (missingNum==-1){
            missingNum=array.length+1;
        }
     */
        System.out.println("Missing number is : "+missingNum);
    }
}
