package com.string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeString {

    // Using a Custom Method
    public static String mergeString(String str7,String str8,String delimiter){
        return str7 +delimiter +str8;
    }



    public static void main(String[] args) {
        String str1 ="Amol";
        String str2 = "Bandge";

        String mergeString  = str1.concat(" ").concat(str2);
        System.out.println("Merge two String: "+mergeString);

        //
        String str3 = "Hello";
        String str4 = "World";

        // Merge using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(str3).append(" ").append(str4);

        String mergedString = sb.toString();

        System.out.println("Merged String: " + mergedString);

        // Merge using Streams
        String margeString2 = Stream.of(str3, str4).collect(Collectors.joining(" "));
        System.out.println("Using Stream merge: "+margeString2);

        //Using a Custom Method
         String merge78= mergeString(str1,str2," ");
        System.out.println("MergeString "+merge78);




    }
}
