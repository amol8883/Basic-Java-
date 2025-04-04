package com.java50basic;

import java.util.HashSet;
// HashSet is implementation of  Set interface
// and set implementation of  Collection interface
// when we add data stature soring bt list
// only one null value is allowed
// null value first array list
//duplicate not allowed

public class UsingCollectionSorting {

    public static void main(String[] args) {

        // Hash is technic using collection find integer number as sorting
        HashSet<Integer> list = new HashSet<>();
        list.add(5);
        list.add(12);
        list.add(null);
        list.add(53);
        list.add(54);
        list.add(43);
        list.add(null);
        list.add(43);
        System.out.println(list);
        System.out.println(list.remove(59));
        System.out.println(list);
    }
}
