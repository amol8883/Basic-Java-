package topCodingQua;

import java.util.HashMap;
import java.util.Map;

public class Exam_24StringWordCount {

    public static void main(String[] args) {

        // Given single string
        String str= "Amol bandge Patil jyoti   bandge patil  and Jyoti  pathede";
        str= str.toLowerCase();
        String[] arr = str.split("\\s+");


        System.out.println("Convert String to String[]:   ");
        for (int i=0;i<arr.length;i++){
            System.out.print("\""+arr[i]+"\"");
            if(i<arr.length-1){
                System.out.print(",");
            }

        }
        System.out.println();
        Map<String,Integer> countWord= new HashMap<>();
        for(String st: arr){
            countWord.put(st,countWord.getOrDefault(st,0)+1);
        }

        for (Map.Entry<String,Integer> entry : countWord.entrySet())
            System.out.print(entry.getKey()+"="+entry.getValue()+",");





    }
}
