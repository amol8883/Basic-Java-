package topCodingQua;

public class Exam_12IsPrime {
    public  static boolean isPrime(int n){
        if (n==0 || n==1){
             return false;
        }
        if(n==2){
            return true;
        }
        for (int i=2;i<=n;i++){
            if(n%2==0){
              return false;
            }


        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(6));
        System.out.println(isPrime(2));



    }
}
