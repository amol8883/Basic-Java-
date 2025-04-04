package com.oopsCocepts.Encapsulation;

public class Child extends GroupOfMechanism {

 String role;
 double payment;

    public Child(int id, String name, String address, String role, double payment) {
        super(id, name, address);
        this.role = role;
        this.payment = payment;
    }

    public Child(int id, String name, String address) {
        super(id, name, address);
    }

    public static void main(String[] args) {
        Child ch = new Child(1,"Amol","Kirla");
        Child ch2 = new Child(1,"amol","pune","java Developer",25000);
        ch.getId();
        System.out.println(ch.getId());
        ch.getName();
        System.out.println(ch.getName());
        ch.getAddress();
        System.out.println(ch.getAddress());
        System.out.println(ch2.role);
        System.out.println(ch2.payment);
        System.out.println(ch2.getId());




    }


}
