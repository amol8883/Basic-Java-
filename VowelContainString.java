package com.java50basic;

public class VowelContainString {

    public static String removeVowel(String inputString){
        StringBuilder result = new StringBuilder();
        String vowels= "aeiouAEIOU";

        for (int i=1;i<inputString.length();i++){
            char currentChar= inputString.charAt(i);
            if(vowels.indexOf(currentChar)==-1){
                result.append(currentChar);
            }

        }
        return result.toString();
    }

    public static void main(String[] args) {

        String inputString = " Hello word hdfkjheuryghberfjaaaAAAA";
         String result=  removeVowel(inputString);
        System.out.println(result);

    }
}
