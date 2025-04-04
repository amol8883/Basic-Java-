package com.java50basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CharacterCountInString {

    public static void main(String[] args) {

        String str = "Application Program";

        ArrayList<Character> al = new ArrayList();
        for (int i=0;i<str.length();i++){
            al.add(str.charAt(i));
        }

        HashMap<Character,Integer> hm= new HashMap();
        for(int i=0; i<str.length();i++){
            hm.putIfAbsent(al.get(i), Collections.frequency(al,al.get(i)));

        }
        for (Map.Entry<Character,Integer> e : hm.entrySet()){
            System.out.println("Character is "+e.getKey()+" And its count is "+ e.getValue());

        }
    }
}
