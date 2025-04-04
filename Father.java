package com.oopsCocepts.Polymorphism;

public class Father {

    static String str =null;
    static String  str2 =str;
     static{
         System.out.println("use static block for execute static keyword ");
         System.out.println("static block execute");
         System.out.println(str);
         System.out.println(str2);
     }

    //Methods overloading concept
    public void dailyWork(int a, String name){
        System.out.println("execute Father method_1 "+name);

    }
    public void dailyWork(int a, String name,String address){

        System.out.println("execute Father method_2 "+a+" "+name+" "+address);

    }

}
