package com.string;

public class ReferenceString{

    String str = "amol";
    String str1 = new String("mohan");

    String str2  = new  StringBuffer(str1).reverse().toString();
    String str3  = new StringBuilder(str).reverse().toString();

    public static void main(String[] args) {

        ReferenceString rs = new ReferenceString();
        System.out.println(rs.str2);
        System.out.println(rs.str3);
    }
}
