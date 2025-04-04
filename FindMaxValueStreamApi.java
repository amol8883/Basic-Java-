package com.java50basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMaxValueStreamApi {

    public static void main(String[] args) {

        int[] arr= {10,15,86,358,889,1035,123};



       int max= Arrays.stream(arr).max().getAsInt();

        System.out.println("Stream API max value in array "+max);
     int[] array=new int[]{1,2,3,4,6,811,9};
        Arrays.sort(array);

        System.out.println("Max value in array "+ array[array.length-1]);

        int[] ar= {15,25,35,45,55,65,75,85,95,115,20};

        // Using Collection find the largest value in array/ list

        ArrayList list = new ArrayList();
        list.add(21);
        list.add(23);
        list.add(87);
        list.add(96);
        list.add(98);
        list.add(22);

        Object[] o= list.toArray();
        for (Object a: o){
            System.out.print(a+", ");
        }

       Collections.sort(list);



        //System.out.println("List of array "+ list);
       // System.out.println("ArrayList "+Collections.max(list));
       // System.out.println("List of array "+ list);

        System.out.println(Arrays.toString(ar));
        for (int i=0; i<ar.length;i++){
            list.add(ar[i]);
        }
        System.out.println("Array only "+Collections.max(list));

    }

}
