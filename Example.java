package basic.testProgram;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String str =sc.nextLine(); // input string:  amol bangdge patil
        String[] words= str.split(" "); // o/p : bandge amol
        String result="";
        for (String word : words) {
            String reverseWord = "";
            for (int i = word.length()-1; i >= 0; i--) {

             reverseWord =reverseWord+word.charAt(i);
            }
            result=reverseWord+" ";
        }
        System.out.println(result);

    }

}
