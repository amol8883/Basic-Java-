package topCodingQua;

public class Exam_15PrintFibonacci {

    public static void fibonacciSeriesSequence(int count){
        int a=0,b=1;

        for (int i=1;i<=count;i++){
            System.out.print(a+", ");
            int c=a+b;
            a=b;
            b=c;

        }
    }


    public static void main(String[] args) {
        fibonacciSeriesSequence(12);


    }



}
