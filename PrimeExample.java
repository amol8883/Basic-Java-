package com.it;

public class PrimeExample {

    public static void main(String[] args) {
        int result;
        //boolean flag= false;
        int flag=0;

        int num=8;

        result =num/2;              //=0
        if (num==0||num==1){
            System.out.println(num+" Number is not prime");
        }else
            for (int i=2;i<=result;i++){
             if(num%i==0) {
                 System.out.println(num + " Number is not prime");
                 //flag= true;
                  flag=1;
                 break;
              }
            }
            if (flag==0)  // (!flag)
            {
                System.out.println(num + " Number is prime");
            }

    }
}
