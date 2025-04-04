package com.java50basic;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        String stringWithSpace = "I Have more than two years experience in java ";
        String stringWithoutSpace  = stringWithSpace.replace(" ","");

        System.out.println("Using replace fun");
        System.out.println(stringWithoutSpace);

        System.out.println("Using ReplaceAll");
        String str= stringWithSpace.replaceAll("//s","");
        System.out.println(stringWithoutSpace);

        System.out.println(" @@@@@@@@@@@@@@@@@@@ Help of StringBuilder @@@@@@@@@@@@@@@@@@@@@@");
        String sentence= "java is OOPs languages";
        StringBuilder sb= new StringBuilder();

        for (int i=0;i<sentence.length();i++) {
            if(!Character.isWhitespace(sentence.charAt(i))) {
                sb.append(sentence.charAt(i));
            }
        }

        String StringWithoutSpace= sb.toString();
        System.out.println(StringWithoutSpace);



    }
}
