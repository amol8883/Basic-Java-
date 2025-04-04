package collectionDataSrtucture.mapConcepts;

import java.util.HashMap;
import java.util.Map;

public class Exam_02CountEachLetter {

    public static void main(String[] args) {

        String str= "Hello Word";
         str=  str.toLowerCase();
        char[] arr =str.toCharArray();
        for (char c: arr){
            if (c!=' ') {
                System.out.print(c + " ");
            }
        }
        HashMap<Character,Integer> countChar = new HashMap<>();
        for (char ch: arr){
            if (ch!=' ') {
                countChar.put(ch, countChar.getOrDefault(ch, 0) + 1);
            }
        }
        for (Map.Entry<Character,Integer> entry : countChar.entrySet()){
            System.out.print(entry.getKey()+"="+entry.getValue()+", ");

        }





    }

}
