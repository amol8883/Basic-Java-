package basic.testProgram;

public class ReverseIntNumber {
    public static void main(String[] args) {
        // the given number
        int num=12345;
        int rev=0;

        while (num!=0){
            int digit = num%10;
            rev= rev*10+digit;
            num=num/10;

        }
        System.out.println("Reverse the Number "+rev);


    }
}
