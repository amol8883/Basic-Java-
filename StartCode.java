package Fremwork;
// import all packages
import java.util.*;
import java.lang.*;
public class StartCode {

    public static void main(String[] args) {

        System.out.println("Welcome to Java");
/*
        Creating collction


 */
        String s = "AmolBandge";
        String rev="";


        for (int i= s.length()-1;i>=0;i--){

             rev= rev+s.charAt(i);

        }
        System.out.println(rev);

    }



}
