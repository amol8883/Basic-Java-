package com.array;

import java.util.Arrays;

// Array is reference data type to declare same data type multiple value assign at time

public class Example {
// call array inside  static block, methods and constructors
    // declaration array
    static int[] arr2 = new int[]{1,2,3,4,5}; // also declare static
    int[] arr = new int[]{1,2,3,4,5}; // definition

    {
        System.out.println("block");
        for(int num :arr) {
            System.out.println(num);
        }
    }
  public Example() {
      System.out.println("constructor");
      for (int num2 : arr) {
          System.out.println(num2);
      }

  }

  public int[] getNumbers(){

        return new int[]{11,12,13,14,15};
  }

  public void getString(String[] str) {
      for (String st : str) {
          System.out.println(st);
      }
  }

    public static void main(String[] args) {

        Example ex = new Example(); // when we create objets,constructor, static and non_static block execute

        System.out.println(Arrays.toString( ex.getNumbers()));
        String[] data = new String[]{"aa","bb","cc"};
        ex.getString(data);

    }

}
