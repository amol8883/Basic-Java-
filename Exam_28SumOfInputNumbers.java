package topCodingQua;

import java.util.LinkedList;

public class Exam_28SumOfInputNumbers {

    public static void main(String[] args) {

        LinkedList<Integer>list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        LinkedList<Integer>list2 = new LinkedList<>();
        list.descendingIterator().forEachRemaining(list2::add);
        System.out.println(list2);

        for (int num: list2){
            System.out.print(num+" ");
        }
        System.out.println();


        //given number sum but given number in Simple string
        String str= "25 25 25 25 50 50 50 ";
        String[] arr =str.split("\\s+");  // covert into String Array
        int[] intArr = new int[arr.length];

        for(int i=0;i<intArr.length;i++){
            intArr[i]=Integer.parseInt(arr[i]);

        }
        int sum =0;
        for (int num : intArr){
            sum=sum+num;// sum+=num;
            System.out.println(num);
        }
        System.out.println("Sum of toatal: "+sum);

    }
}
