package com.oopsCocepts.Inheritance.Single;

public class Child extends Father {
   int count = 1;

    public static void main(String[] args) {

      Child ch = new Child();
        System.out.println(ch.count);
       System.out.println(ch.price);
       System.out.println(ch.mobile);

    }
}
