package com.oopsCocepts.Inheritance.Hierarchical;

public class Child1 extends Father {

    int a;
    public Child1(int a){
        this.a = a;
        System.out.println(a);
    }

    public static void main(String[] args) {

        Child1 ch = new Child1(10000);
        ch.modelName();
    }

}
