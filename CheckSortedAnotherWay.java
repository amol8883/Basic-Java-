package com.array;

public class CheckSortedAnotherWay {

    public static boolean isSorted(int[] array ){

        for (int i=0;i<array.length-1;i++) {
            if (array[i] > array[i + 1]) {
              return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,7,8};
        if (isSorted(array)){
            System.out.println("is sorted");
        }else{
            System.out.println("is Not Sorted");
        }
    }
}
