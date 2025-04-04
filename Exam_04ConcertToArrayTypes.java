package mostImportantTyepCasting;

import java.util.HashMap;
import java.util.Map;

public class Exam_04ConcertToArrayTypes {
    public static void main(String[] args) {


        int num = 11329189;   // given number
        String str = String.valueOf(num); // convert into string
        char[] chars = str.toCharArray(); // convert onto char Array
        System.out.println(chars.length);   // size of array =8>  0-7=8

        int[] arr = new int[str.length()];
         for (int i=0; i<arr.length;i++){
             arr[i]=str.charAt(i)-'0';

         }
        for (int num1:arr){
            System.out.print(num1+",");
        }





/*

              // count of each number repeat count
        Map<Integer,Integer> countNo = new HashMap<>();
        for (int no:chars){
            int digit =Character.getNumericValue(no);
            countNo.put(digit,countNo.getOrDefault(digit,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : countNo.entrySet()){
            System.out.print(entry.getKey()+"="+entry.getValue()+",");
        }

        System.out.println("\n_______________________________");
         */
    }


}
