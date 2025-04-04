package com.multitreadingJava;

public class Company {

    int n;
    public void produce_item(int n){
       this.n=n;
        System.out.println("Produced : "+this.n);
    }

    public void consume_item(){

    }
}
