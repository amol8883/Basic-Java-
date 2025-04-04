package basic.testProgram;

public class CalculateVowelAndConsonants {

    public static void main(String[] args) {
        int vowels=0;
        int consonants =0;
        String str= "anvgkioqeraw";
        System.out.println("total length is :  "+str.length());
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (c=='a'||c=='e'||c=='i'|| c=='o'||c=='u'){
                 vowels++;
            }else {
                consonants++;


            }
        }
        System.out.println("Vowel Count is : "+vowels);
        System.out.println("consonants Count is : "+consonants);
    }

}
