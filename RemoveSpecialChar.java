package basic.testProgram;

public class RemoveSpecialChar {

    public static void main(String[] args) {

        String str= "r!oh%it$sha*rm@a";
         String plainString  = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(plainString);
    }
}
