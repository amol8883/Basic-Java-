package com.java50basic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveElements {

    public static int[] removeTheElement(int[] array,int element){
        if (array==null || element<0 || element>=array.length){

            return array;
        }
           return IntStream.range(0,array.length).filter(i -> i!=element).map(i->array[i]).toArray();
    }




    public static void main(String[] args){
        int[] array=  {1,2,3,4,5,6,7,8};

        System.out.println("OriganalArray"+ Arrays.toString(array));
        int remove= 3;

       int[] newArray= removeTheElement(array,remove);

        System.out.println(Arrays.toString(newArray));


    }
}
