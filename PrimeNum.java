package basic.testProgram;

public class PrimeNum {
    public static void main(String[] args) {
        int num =1;
        boolean isPrime = true;

        if(num<=1){
            isPrime =false;

        }else{
            for (int i=2; i<num;i++){
                if (num%2==0){
                    isPrime =false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println(num+" is Number prime number");
        }else {
            System.out.println(num + " is Number is not prime");
        }
    }
}
