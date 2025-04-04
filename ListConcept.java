package com.java50basic;

import java.util.ArrayList;
import java.util.Arrays;

public class ListConcept {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList();
        list.add(11);
        list.add(12);
        list.add(10);
        list.add(14);
        list.add(13);

        int[] num={1,2,3,4,5,6,7};

        for (int a: num){
            if(a%2!=0){
                System.out.print(a +" ");
            }


        }
        System.out.println("Odd Number");
    }
}
