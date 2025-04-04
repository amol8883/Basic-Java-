package topCodingQua;

public class Exam_16FibonacciSeries {
    public static int fibonacciNumber(int num){
        if (num<=1){
            return num;
        }
        return fibonacciNumber(num-1)+fibonacciNumber(num-2);

    }

    public static void main(String[] args) {
        int sequenceLength=10;
        System.out.print("A Fibonacci Series "+sequenceLength+" Numbers: ");
       for (int i=0;i<=sequenceLength;i++){
           System.out.print(fibonacciNumber(i)+" ");

       }
    }
}
