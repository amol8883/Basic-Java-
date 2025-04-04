package com.it;

public class ReverseString {

    public static void main(String[] args) {

    String st = "Amol Bandge";
    System.out.println("Before Execution " +st.length());

    String rev = new StringBuffer(st).reverse().toString();
    System.out.println("After Execution " +rev);



    // Other way to rever the string


        String str2 = "ABCD";
        String rev2=" ";
        int len= str2.length();

        for(int i= len-1;i>=0;i--){
           rev2= rev2+str2.charAt(i);
        }
        System.out.println("ReverseString is "+rev2);
    }
}
