package basic.testProgram;

public class ReverseStringCharArray {
    public static void main(String[] args) {
        String str= "amol bandge";
        char[] chArr =str.toCharArray();
        for (int i=chArr.length-1;i>=0;i--){
            System.out.print(chArr[i]);
        }

    }
}
