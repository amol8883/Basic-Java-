package com.objectClassMethods;

import java.util.concurrent.Callable;
/*
note - crete and return a copy of object
     two types of cloning shallow and deep cloning
   -  the process of bitwise operation copy of object call shallow
   - if have main object any reference variable contain called deep cloning.
 */
class Address {
    private int fNo; // only create properties

    public Address(int fNo) {
        this.fNo = fNo;
    }

    public int getfNo() {
        return fNo;
    }

    public void setfNo(int fNo) {
        this.fNo = fNo;
    }
}


public class CloneConcepts implements Cloneable {
    private int id;
    private String name;
    private Address address;

    public CloneConcepts(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override // Deep cloning
    protected Object clone() throws CloneNotSupportedException {
        Address addr = new Address(address.getfNo());
        CloneConcepts cls = new CloneConcepts(id,name,addr);
        return cls;
    }

    public static void main(String[] args)throws CloneNotSupportedException {
        Address adr1 = new Address(404);
        CloneConcepts cl = new CloneConcepts(1,"Amol",adr1); // declare primitive and reference and object
        CloneConcepts cl2 =(CloneConcepts) cl.clone(); // help of clone()  method duplicate can create // shallow cloning

     //   System.out.println("1St Object "+cl.getId()+" , "+cl.getName()+" ,"+cl.getAddress().getfNo());
     //   System.out.println("2nd Object "+cl2.getId()+" , "+cl2.getName()+" ,"+cl.getAddress().getfNo());

        cl.setId(2); // change 1st object value
        cl.setName("jaypal");
        adr1.setfNo(403); // if we can change then duplicate also change overcame this problem use @Override Clone().
        System.out.println("After changing on obj1    **********");
        System.out.println("1St Object "+cl.getId()+" , "+cl.getName()+" ,"+cl.getAddress().getfNo());
        System.out.println("2nd Object has Duplicate "+cl2.getId()+" , "+cl2.getName()+" ,"+cl2.getAddress().getfNo());


    }
}
