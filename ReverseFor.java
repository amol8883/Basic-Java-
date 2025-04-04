package basic.testProgram;

public class ReverseFor {

    public static void main(String[] args) {
            // using fir loop reverse the char
        String str = "Hello Hi";
        char[] ch = str.toCharArray();
        for(int i=ch.length-1;i>0;i--){
            System.out.print(ch[i]);

        }
        System.out.println(" ");
        // second approach
        for (int i= str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));

        }

    }
}
