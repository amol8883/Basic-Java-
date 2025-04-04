package com.datastructures;

public class Example {
    public static void main(String[] args) {

        String[] str=  {"adada","adade","erere","adada"};
        String target= "adada";
        int count = 0;
        char c='d';
        //int[] num ={12,45,546,458};
  //char[] ct={'g','k','u'};
        for (int i=0; i<str.length;i++){
           // System.out.println(str[i]);

            for(int j=0;j<str[i].length();j++) {

                if (str[i].charAt(j) == c) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
