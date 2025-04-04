package com.datastructures;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
       // int length = numbers.length;
       // System.out.println(length);
        System.out.println(numbers[1]);



        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("second way to find value for each");

  String[] strs = {"ram","Sham","raj","roy"};
        for(String st : strs){
            System.out.println(st);
            }
        System.out.println(strs[1]);


        Arrays.sort(strs);
        System.out.println("///////////////");
        for (String str : strs){
            System.out.println(str);

        }

        int[] num = new int[5];
        num[0]=10;   // num[0]first element
        num[1]=20;
        num[2]=30;
        num[3]=40;
        num[4]=50; // 0 to 4 = size 5  num[4] last element
        //  num[5]=60;
        //   num[6]=70;  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException size 5
        for (int t : num) {
            System.out.println(t);
        }

    }

}
