package com.it;

public class ArmstrongNumberEx {

    // Finally, result and number are compared. If equal, it is an Armstrong number. If not, it isn't.
   // 153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
    //153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.


    public static void main(String[] args) {

        int number =1373;
        int originalNumber= number;
        int remainder, result=0;

        while (originalNumber!=0){

            remainder= originalNumber%10;

               result+=Math.pow(remainder,3);

            originalNumber/=10;
        }
          if(result==number)
              System.out.println(number +" is an armstrong Number");
          else
              System.out.println(number +" isn't an armstrong Number");


    }
}
