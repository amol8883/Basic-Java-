package com.it;

import java.util.Arrays;
import java.util.Locale;

public class ATOZCharacterCount {

    public static void main(String[] args) {

        String str= "adsjhhjkhjhjhAAAdGg";
        int[] count = new int[26];
        str=str.toLowerCase();

        for (char c: str.toCharArray()){
            if (c >='a' && c<='z'){
          count[c-'a']++;
              //  System.out.print(c+" ");
            }
        }
        for (char i='a'; i<='z';++i){
            System.out.println(i+" :"+count[i-'a']);
        }

     //

            }
}
