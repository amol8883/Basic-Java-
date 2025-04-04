package topCodingQua;

public class Exam_02_PrimeNumber {

    public static void main(String[] args) {
        // Given number is Prime or Not
        int num =29;
        boolean isPrime =true;
        if(num<=1){
            isPrime=false;
            for (int i=2;i<=num;i++){
                if (num%i==0){
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println(num+"  is prime");
        }else{
            System.out.println(num+"  is Not prime");
        }
    }
}
