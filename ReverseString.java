package basic.testProgram;

public class ReverseString {
    public static void main(String[] args) {
        String  str= "abcdefg";
        StringBuilder sb = new StringBuilder(str).reverse();
        System.out.println("Reverse the String "+sb);

    }
}
