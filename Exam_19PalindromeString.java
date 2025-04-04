package topCodingQua;

public class Exam_19PalindromeString {
    public static void main(String[] args) {

        String str1= "a madam     a";

        String str2 = str1.replaceAll("\\s", ""); //is remove space
        StringBuffer sb= new StringBuffer(str2).reverse();
        System.out.println("Original String: \"" + str1 + "\"");
        System.out.println("String without spaces: \"" + str2 + "\"");

        if (str2.contentEquals(sb)){
            System.out.println("is palindrome");

        }else {
            System.out.println("not palindrome");

        }

    }
}
