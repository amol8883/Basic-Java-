package java8Features.streamApi;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

import java.util.HashMap;
import java.util.Map;

public class Exam_04CountEachInteger {
    public static void main(String[] args) {

        int number =123469764;
        String str= String.valueOf(number);
        char[] chars =str.toCharArray();
       // this is wrong
        int[] it= new int[str.length()];

        for (int i=0;i<str.length();i++){
            it[i]=str.charAt(i)-'0';
        }

        Map<Integer,Integer> countInt2=new HashMap<>();
        for (int num2 :it){
            countInt2.put(num2,countInt2.getOrDefault(num2,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry: countInt2.entrySet()){

            System.out.print(entry.getKey()+"="+entry.getValue()+", ");
        }

        System.out.println("'\n___________________________________________________________\n");


        Map<Integer,Integer> countInt=new HashMap<>();
        for (char ch:chars){
            int num = Character.getNumericValue(ch); // Convert char to int
            countInt.put(num,countInt.getOrDefault(num,0)+1);

        }

     for (Map.Entry<Integer,Integer> entry: countInt.entrySet()){

         System.out.print(entry.getKey()+"="+entry.getValue()+", ");
     }
    }

}
