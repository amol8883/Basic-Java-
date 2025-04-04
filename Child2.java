package com.oopsCocepts.Inheritance.Hierarchical;

public class Child2 {


    int b;
    public Child2(int b){
        this.b = b;
        System.out.println(b);
    }

    public static void main(String[] args) {

        Child1 ch = new Child1(20000);
        ch.modelName();
    }

}
