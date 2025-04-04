package com.it;

public class SwappingNumber {

    public static void main(String[] args) {


        int a= 10;
        int b= 20;

        //using 3rd variable swap the number

        int c= a; // current value of c is 10
        a=b; //     current value of a is 20
        b=c;  //    current value of b is 10

        System.out.println("value od a is " +a+ " And value od b "+b);


        int p= 10;
        int q= 20;

        p = p*q; //200
        q=p/q;  //10
        p=p/q; //20

        System.out.println(p+ " "+q);


        // another

        int x= 10;
        int y= 20;

        x= x+y;  //30
        y=x-y; //10
        x=x-y;  // 20
        System.out.println("x is "+x+ " AND Y IS "+y);
    }


}
