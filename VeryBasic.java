package basic.testProgram;

import java.nio.charset.StandardCharsets;

public class VeryBasic {

    public static void main(String[] args) {

        //convert to int String
        int num = 12345;
        String str = String.valueOf(num);
        System.out.println(str);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));

        // convert String into array
        System.out.println("Covert the String into ArrayString");
        String str1 = "Jyoti Amol Bandge ";
        String[] str2 = str1.split(" ");
        for (String word : str2){
            System.out.print(word+" ");
            System.out.println(word.charAt(1) );
        }
        int num2 = 12345;
        String str5= ""+num2;
        System.out.println(str5);
        System.out.println(str5.length());
        System.out.println(str5.charAt(1));
        System.out.println();
        char[] ch= String.valueOf(num).toCharArray();
        System.out.println(ch.length);
        System.out.println(ch[1]);
        for (char c: ch){
            System.out.print(c+" ");

        }




    }
}
