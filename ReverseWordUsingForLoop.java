package basic.testProgram;

public class ReverseWordUsingForLoop {

    public static void main(String[] args) {

        String str =  "Welcome to pune ";
        String[] words =str.split(" ");
        String result="";
        for (String word :words){
              String reverseWord= "";
            for (int i=word.length()-1;i>=0;i--){
                reverseWord=reverseWord+word.charAt(i);
            }
            result= result+reverseWord+" ";
        }
        System.out.println(result);

    }
}
