package topCodingQua;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Exam_29ReverseStringInList {
    public static void main(String[] args) {
        // given Dtring
        String str=  "Amol wandge patil";
        String[] words= str.split("\\s+"); //convert into Array
        List<String> list = new ArrayList<>(Arrays.asList(words)); // convert into ArrayList

        System.out.println("ArrayList: ");
        for(String s: list) {
            System.out.print(s + " ");
        }
        System.out.println("\nUsing Collections to reverse the list:  ");
        Collections.reverse(list);
        list.forEach(w-> System.out.print(w+" "));
        System.out.println("\nUsing Collections to reverse the Each Word:  ");

        List<String> list2 = new ArrayList<>(Arrays.asList(words)); // convert into
        for (String s1: list2) {
                StringBuffer sb = new StringBuffer(s1).reverse();
                System.out.print(sb + " ");
        }
      Collections.sort(list2);
        System.out.println(list2);




    }
}
