package com.java50basic;

import java.util.ArrayList;
import java.util.Arrays;

public class elementRemove {

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);;
        list.add(44);
        list.add(5);
        list.add(6);
        System.out.println(list);
        list.remove(2);
        System.out.println(list.remove(Integer.valueOf(84)));
        System.out.println(list);
        for (int i: list){
            System.out.print(i+", ");
        }

        System.out.println("*************************************");

        int[] arr ={9,8,7,6,5,3,2};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.stream(arr).max());


    }
}
