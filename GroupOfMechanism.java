package com.oopsCocepts.Encapsulation;

public class GroupOfMechanism {


    private int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

   public GroupOfMechanism(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    private String name;
    private String address;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
