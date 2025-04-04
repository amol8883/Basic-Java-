package com.oopsCocepts.Inheritance.Multilevel;

public class Child extends Father {

    String count ;

    public void runFast(){
        count="10km";
        System.out.println("child run daily "+count);
    }

    public static void main(String[] args) {
        Child ch  = new Child();
        ch.walk();
        ch.run_walk();
        ch.runFast();
    }
}
