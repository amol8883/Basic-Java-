package topCodingQua;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

public class Exam_23KyeValueCount {

    public static void main(String[] args) {


        String str = "Helllo Word"; // Input String
        str = str.toLowerCase();
        char[] chars=str.toCharArray();

        Map<Character,Integer> countChar =new HashMap<>();
        for (char ch : chars) {
            if (ch != ' ') { //Ignore spaces

                countChar.put(ch, countChar.getOrDefault(ch, 0) + 1);
            }
        }
         for (Map.Entry<Character,Integer> entry : countChar.entrySet()){
             if (entry.getKey()=='h' || entry.getKey()=='l'|| entry.getKey()=='d') {

                 System.out.print(entry.getKey() + "=" + entry.getValue() + ", ");
             }

         }






    }
}
