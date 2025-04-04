package collectionDataSrtucture.listConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exam_02UsingListReverseOperationOnString {

    public static void main(String[] args) {

        String str= "Amol Bandge patil";
        String[] words = str.split("\\s+");


        for (String st: words){
            System.out.println(st);
        }
        System.out.println(words.length);
        System.out.println(words[1]);

        List<String> list =new ArrayList<>(Arrays.asList(words));

        for (String s : list){
            System.out.print(s+" ");

        }
        System.out.println();
       for(int i= list.size()-1;i>=0;i--){
           System.out.print(list.get(i)+" ");
       }
        System.out.println();
         // reverse Each words
        for (String stt:list ){
            StringBuilder sb = new StringBuilder(stt).reverse();
            System.out.print(sb+ ", ");
        }
        System.out.println();
        Collections.reverse(list);  // reverse list logic
        list.forEach(w-> System.out.print(w+" "));

        /*
        for(int i=0;i<list.size();i++){
            String resultWord= new StringBuilder(list.get(i)).reverse().toString();
            list.set(i,resultWord);
        }

        System.out.println(list);
        for (String w: list){
            System.out.print(w+",");
        }
    */

    }
}
