package topCodingQua;

public class Exam_11_SwapNumbersWithoutTemp {

    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before Swapping Number "+ a+"  "+b+" ");
        a=a+b; // 30
        b=a-b;   // 30-20=10
        a=a-b; // 20
        System.out.println("After Swapping Number "+ a+"  "+b+" ");
    }
}
