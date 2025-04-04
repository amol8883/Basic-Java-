package topCodingQua;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Exam_03_OddEvenNumbers {


    public static void main(String[] args) {

        // 1st Approach
      int num= 10;
        if (num%2==0){
            System.out.println("this is Even Number");
        }else {
            System.out.println("this this odd Number");
        }


        // 2nd Approach

        int start=1,end = 10;

        System.out.println("Even Numbers");

        for (int i=start;i<=end;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }

        }

        System.out.println("\n***********************************");

        System.out.println("Odd Numbers");

        for (int i=start;i<=end;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }

        }
        System.out.println();

        // 3rd Approach
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i=1;i<=num;i++){
            if (i%2==0){
               evenNumbers.add(i);
            }else {
                oddNumbers.add(i);
            }

        }

        System.out.println("EvenNumbers :"+evenNumbers);
        System.out.println("OddNumbers   :" +oddNumbers);

        System.out.println("&&&&&&&&&&&&&&&&&&");
        // 4th approach
        System.out.println("Print Even Numbers");
        IntStream.range(1,10).filter(n->n%2==0).forEach(n-> System.out.println(n+" "));

        System.out.println("Print Odd Number");
        IntStream.range(1,10).filter(n->n%2!=0).forEach(n-> System.out.println(n+" "));








    }
}
