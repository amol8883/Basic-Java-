package topCodingQua;

import basic.testProgram.FibonacciNumber;

public class Exam_08_FibonacciSeries {
    public static void main(String[] args) {
        //FibonacciSeries
        // 0 1 2 3 5 8 13 21 31 total 10 num

        int num= 10;
        int a= 0,b=1;
        System.out.print("Fibonacci Number "+ a+" "+b);
        for (int i=2;i<num;i++) {
            int next = a + b;
            System.out.print(" "+next);
            a=b;
            b=next;

        }

        }


    }

