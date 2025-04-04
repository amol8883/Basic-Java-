package com.string;

import java.nio.charset.StandardCharsets;

public class SpecificMethods {
    public static void main(String[] args) {

        String str = " amolbandge ";
        String str2 = "amolbandge";

        System.out.println("Length of string str "+str.length()); // return int  values
        System.out.println("Length of string str2 "+str2.length());
        System.out.println(str.trim());
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str2.substring(4)); // start 0 to3 =4
        System.out.println(str2.substring(4,10)); // if end 11 exception rises
        System.out.println(str2.replace('a','k')); // change 'a to k'
        System.out.println(str2.replace("amol","sachin"));
        System.out.println(str2.replace("bandge","BandgePatil"));
        System.out.println(str2.startsWith("am"));
        System.out.println(str.startsWith(" am"));// start with space also calculate
        System.out.println(str.endsWith("ge")); // end with space thats with false
        System.out.println(str2.charAt(0));   // find a
        System.out.println(str2.indexOf("m"));
        String modifyName = "harryaaarryccd";
        System.out.println(modifyName.indexOf("rry")); // frist find in index 2
        System.out.println(modifyName.indexOf("rtry")); // not found output -1
        System.out.println(modifyName.indexOf("rry", 4)); // start searching index 4  // output -8 index
        System.out.println(modifyName.lastIndexOf("ccd"));
        System.out.println(modifyName.lastIndexOf("aaa"));
        System.out.println(modifyName.lastIndexOf("aa",4)); //not found starting string output -1
        System.out.println(modifyName.lastIndexOf("aar",8)); // output 6


    }
}
