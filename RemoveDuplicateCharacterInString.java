package basic.testProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacterInString {

    public static void main(String[] args) {
        // if have given one String
        String str ="Programming";
        // remove the duplicate character in this String using char[]

        //Approach 1
        char[] arr= str.toCharArray(); // like arr= {'p','r','o'.....etc };
        StringBuilder sb=new StringBuilder();
      //  System.out.println(arr[0]); // P
      //  System.out.println(arr.length); // 11
        for (int i=0;i<arr.length;i++){
            boolean repeat=false;
            for (int j= i+1;j<arr.length;j++){
               if (arr[i]==arr[j]){
                   repeat= true;
                   break;

               }
            }
            if (!repeat){
             sb.append(arr[i]);
            }
        }
        System.out.println(sb);

        // Approach 2
        // using set interface
        StringBuilder sb1 = new StringBuilder(); // using mutable string
        Set <Character> set = new LinkedHashSet<>();
        for (int i= 0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for (Character c: set){
            sb1.append(c);
        }
        System.out.println(sb1);

        // Approach 3 using lambda and foreach
        StringBuilder sb2 = new StringBuilder();
        str.chars().distinct().forEach(c -> sb2.append((char)c));
        System.out.println(sb2);
    }
}
