package com.oopsCocepts.Inheritance.Single;

public class SuperKeywords {

    int a;

    public SuperKeywords(int a) {
        this.a = a;
        System.out.println(a);
    }
    public void f1(){
        System.out.println("execute parent method f1 1st help of super keyword");
    }
    public void p1(){
        System.out.println("execute parent method p1 1st help of super keyword");
    }
}
class Example extends SuperKeywords {

    public Example(int c) {
          super(c);
        System.out.println("I'm constructor");
    }
    public int f2(){
        super.f1();
        System.out.println("execute child method");
        super.p1();
        return 10;
        // super.f1(); not uue after return.
    }

    public static void main(String[] args) {
        Example ex =  new Example(10);
        ex.f2();

    }
}
