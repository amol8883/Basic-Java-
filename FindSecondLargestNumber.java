package com.array;

import java.util.Arrays;

public class FindSecondLargestNumber {


    public static void main(String[] args) {

        int[] numbers ={15,25,35,98,62,36,49,83,88,52};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        if(numbers.length<2) {
            System.out.println("At list have 2 content");

            return;
        }else {
            int largestNum = numbers[numbers.length - 2];

            System.out.println(largestNum);
        }
        System.out.println("*******************************");

        int largest =numbers[numbers.length-1];
        int second_largest = Integer.MIN_VALUE;
        

        for(int i= numbers.length-2;i>=0;i--){
            if(numbers[i]<largest){
                second_largest =numbers[i];
                break;
            }
        }

        if(second_largest==Integer.MAX_VALUE){

            System.out.println("no found second largest number");
        }else {
            System.out.println("secondLargest "+second_largest);

        }
    }
}
