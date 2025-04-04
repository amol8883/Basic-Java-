package com.oopsCocepts.Inheritance;

public class ThisAndSuper {

    private int roll_no;
    private String name ;

    public ThisAndSuper() {
        this(12,"samo");
    }

    private String address;


    public ThisAndSuper(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;

    }

    public void callMethods(){
        this.display();

    }    public void display(){
        System.out.println("student roll_no "+roll_no+" and name "+name);
    }

    public static void main(String[] args) {
        ThisAndSuper tse = new ThisAndSuper();
        ThisAndSuper ts= new ThisAndSuper(11,"amol");
        ts.display();
        tse.display();
        ts.callMethods();

    }
}
