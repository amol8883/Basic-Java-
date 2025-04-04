package basic.testProgram;

import java.util.Arrays;

public class ReverseWordsInString {

    public static void main(String[] args) {

        String str = "amol bandge patil ";
        String[] words = str.split(" ");
        //  String reverse= "";
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
           System.out.print(sb + " ");
            //  reverse=reverse+sb.toString()+" ";
        }
        //  System.out.println(reverse);

        System.out.println();
        //  Best and Short way to string word reverse

        String str2 = "Amol Bandge Patil";
        StringBuilder sb2= new StringBuilder(str2).reverse(); //  String are reverse 1st way
        System.out.print(sb2);
        System.out.println();
  // used array reverse word
        String[] words_1 = str2.split(" ");
        for (String w:words_1){
           StringBuilder sb = new StringBuilder(w).reverse(); // String word reverse
            System.out.print(sb+" ");
           //sb.reverse();
            //System.out.print(sb+" ");
        }
        System.out.println();
        // reverse String but word not reverse
        String str3 = "sham sundar patil";
        String[] words_3= str3.split(" ");
       String result= "";
       for (int i=words_3.length-1;i>=0;i--){
           result=result+  words_3[i]+" ";

       }
        System.out.println(result.trim());
    }

}




