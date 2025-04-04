package basic.testProgram;

public class ReverseStringUsingFor {

    public static void main(String[] args) {
        String str = "amol bandge patil";
        String result = "";
        System.out.println("Before String :  " + str);
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        System.out.println("After String : " + result);

    }
}
