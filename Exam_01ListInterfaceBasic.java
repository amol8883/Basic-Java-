package collectionDataSrtucture.listConcepts;

import java.util.*;

public class Exam_01ListInterfaceBasic {

    public static void main(String[] args) {
        /* List interface  implements  ArrayList class
        1.input order is preserved
        2.Duplicate is allow
         */

        List<Integer> list= new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        System.out.println(list);
        for (int num : list ){
            System.out.print(num+" ");
        }
        System.out.println("//////////////////////");
      List<Integer> list2 = Arrays.asList(10,20,70,30,50,40);


        for (int no: list2){

            System.out.print(no+" ");
        }

        Collections.sort(list2);
        System.out.println("Ascending order "+list2);
        Collections.sort(list2,Collections.reverseOrder());
        System.out.println("Descending order "+list2);
        System.out.println(list2);


    }

}
