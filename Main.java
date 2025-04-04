package com.it;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String str="00000455475656786768787897878888";
        int[] count = new int[10];
        str= str.toLowerCase();

        for(char c : str.toCharArray()){
            if (c>='0' && c<='9'){
                count[c-'0']++;

            }

        }

        for(char i ='0';i<='9';++i){
            System.out.println(i+ " :"+count[i-'0']);
        }

    }
}
