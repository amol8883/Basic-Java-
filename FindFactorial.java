package basic.testProgram;

import java.util.Scanner;

public class FindFactorial {

    // Recursive method to calculate factorial
    public static long factorial(int n){
       // if (n==0 || n==1){
      //  return 1;
     //   }
 return n * factorial(n-1); // Recursive call
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();

        System.out.println("numbers is: "+number+" its factorial is "+factorial(number));



    }

}
