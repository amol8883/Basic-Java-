package basic.testProgram;

public class FibonacciNumber {
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);


    }
    public static void main(String[] args) {

        int num =10;
       System.out.println(" number is :"+num+ " is fibonacci "+fibonacci(num));
        System.out.println();

        // another way
        int number=10;
        int a=0,b=1;
        System.out.print("Fibonacci Number :"+ a+" "+b);
        for (int i=2;i<number;i++){
            int next = a+b;
            System.out.print(" "+next);
            a=b;
            b=next;

        }

    }
}
