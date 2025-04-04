package com.methodHidig;


class Complex {
    public static void f1(){
        System.out.println("f1 method execute Complex class ");
    }

}
class Sample extends Complex{
    public static void f1(){
        System.out.println("   f1 method execute Sample class");

    }

}
public class ApplyStaticMethods {

    public static void main(String[] args) {
        Complex d1 = new Complex();
        d1.f1();
        Complex d2 = new Sample();
        d2.f1();
        Sample d3 = new Sample();
        d3.f1();

    }
}
