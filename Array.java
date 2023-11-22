package Fremwork;

import java.util.Scanner;

public class Array {


    public static void main(String[] args) {

     /*   int number[] =new int[5];  // Static Array
        number[0]=10;
        number[1]=20;
        number[2]=20;
        number[3]=30;
        number[4]=40;
       // number[5]=50;

        for (int i=0; i<5;i++){
            System.out.println(number[i]);

            }
*/

     /*     int size,i;           // Dimensional array
        Scanner sc= new Scanner(System.in);
        System.out.println("Inter the Size of array");

        size= sc.nextInt();
        int number[]= new int[size];
        for (i =0;i<size;i++){
            number[i]=sc.nextInt();
        }
        System.out.println("Print Array Elements");

        for (i=0;i<size;i++){
            System.out.print(number[i]+" ");
        }

      */

      String  size;
        int i;
        Scanner sr= new Scanner(System.in);
        System.out.println("Inter the Size of array");

        size=sr.next();
      String village[]= new String[Integer.parseInt((size))];

      for (i=0;i<size; i++){
          System.out.println(village[i]);
      }
      System.out.println("Enter Village Name");
      for (i=0;i<size; i++){

          System.out.println(village[i]=" ");
        }


     }

    }

