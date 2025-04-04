package com.datastructures;

public class CharacterCount {


    public static void main(String[] args) {


        String str = "abmfhccdd";
        char target = 'w';
        int count = 0;

        for (char i = 'a'; i <= 'd'; i++) {
            if (i == target) {
                count++;
            }
           // System.out.println(i);
        }
        System.out.println(target + "   is  " + count);

        System.out.println(".......................................");
        String[] strArr = {"sasats","asdd","asdtasd"};

        char targerc= 't';
        int totalcount= 0;


        for (String st:strArr) {
            for (char c :st.toCharArray()){
                if (c==targerc){
                    totalcount++;
                }
              //  System.out.println(c);
            }
           // System.out.println(st);
        }
        System.out.println(targerc+" is "+totalcount);

        System.out.println(".......................................");




    }

}

