package topCodingQua;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Exam_04_Factorial {

    public static long factorial(int n){
        if (n==0|| n==1)
        return 1;
        return n* factorial(n-1);
    }

    public static void main(String[] args) {
        int num=5;
        long factorial = LongStream.rangeClosed(1,num).reduce(1,(a,b)->a*b);

        System.out.println("Factorial "+num+" is "+factorial);

        System.out.println(" facorial  "+num+" is "+factorial(num));


        int n= 5;
        BigInteger factorialbig= BigInteger.ONE;

        for (int i=1;i<=n;i++){
            factorialbig= factorialbig.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorialbig);

    }
}
