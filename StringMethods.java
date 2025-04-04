package com.string;

public class StringMethods {

    // declare string have two ways
    //A String in Java is a sequence of characters.
    //Immutable: Once a String object is created, it cannot be changed.

    String str= new String("Amol");
    //str="sohma";
    String str2= "Bandge";
    // Equal method check the content of string
    boolean isEqual = str.equals("Hello"); //
    String fullName = str+ " "+str2;

    public void evaluteMethod(){

        System.out.println("Find the length of amol = "+str.length());// Output 4
        System.out.println("Find specific index " +str.charAt(0)); //  Output A
        System.out.println("Substring "+ str.substring(0,2));      // Am
        System.out.println("Substring "+ str.substring(1));        // mol
        System.out.println(isEqual);// false
        System.out.println(fullName);// Amol Bandge
        System.out.println(str.concat(str2));
        //System.out.println(str.trim());
        System.out.println(str instanceof String); // true


        // StringBuffer
        StringBuffer sbf =  new StringBuffer("Hello");
        sbf.append(" word");

        StringBuilder sbl = new StringBuilder("Hello");
        sbl.append(" word");

        System.out.println(sbf);
        System.out.println(sbl);


    }
    public static void main(String[] args) {
        StringMethods obj= new StringMethods();
        System.out.println(obj.str);
        System.out.println(obj.str2);
        obj.evaluteMethod();

    }

}
