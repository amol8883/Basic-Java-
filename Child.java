package com.oopsCocepts.Polymorphism;

public class Child extends Father{

    static float percentage;
    static{
        percentage = 50.0f;
        System.out.println("child percentage is "+percentage);
    }


    @Override
    public void dailyWork(int a, String name) {
        super.dailyWork(a, name);

        System.out.println("execute child method_1"+ name);

    }

    @Override
    public void dailyWork(int a, String name, String address) {
        super.dailyWork(a, name, address);
        System.out.println("execute child method_2");

    }

    public static void main(String[] args) {
        Child ch1= new Child();
        ch1.dailyWork(111,"amol","Kirla");
        ch1.dailyWork(222,"java");
        System.out.println("*************************");
        Father fa = new Father();
        fa.dailyWork(333,"last");

    }

}
