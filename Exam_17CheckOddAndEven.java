package topCodingQua;

import java.util.*;

public class Exam_17CheckOddAndEven {

    public static void separateOddEven(List<Integer> numbers){
        List<Integer>  oddNumber = new ArrayList<>();
        Set<Integer> odd = new LinkedHashSet<>(oddNumber); // remove duplicate using set interface

        List<Integer>  evenNumber = new ArrayList<>();
        Set<Integer> even = new LinkedHashSet<>(evenNumber); // remove duplicate using set interface

        for (Integer i:numbers) {

            if (i%2!=0) {
                odd.add(i);
                oddNumber.add(i);

            }else{
                even.add(i);
                evenNumber.add(i);

            }
        }
            System.out.println("OddNumbers :" + odd);
        System.out.println("OddNumbers with duplicate also :" + oddNumber);

            System.out.println("EvenNumbers :" + even);
        System.out.println("EvenNumbers with duplicate also :" + evenNumber);


    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,14,13,18,17,19,35,27,27,50,2,98,55,22,44,60);
        separateOddEven(list);

    }
}
