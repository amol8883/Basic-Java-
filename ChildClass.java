package com.oopsCocepts.Atsraction;

public class ChildClass extends ParentClass {


    @Override
    public void play() {
        System.out.println("execute child method ");
    }

    @Override
    public void play(int e) {

        System.out.println("execute child method "+e);

    }

    public static void main(String[] args) {
        ChildClass ch2  = new ChildClass();
        ch2.play();
        ch2.play(22);
    }
}
