package basic.testProgram;

import java.util.logging.SocketHandler;

public class FindCharInString {
    public static void main(String[] args) {


        String str = "awerfginghgkiur";
        if (str.contains("a")){
            System.out.println("a is present in this String");

        }else {
            System.out.println("a is not present in this String");
        }
    // 2ns step
        System.out.println("******************************");
        char target ='q';
        boolean found =false;

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                found = true;
                break;
            }
        }
            if (found){
                System.out.println("q is present in string");
            }else{
                System.out.println("q is not present in string");
            }

        System.out.println("********************************");

        //3rd step
        if (str.indexOf('a')!=-1){
            System.out.println(" a is Available in string");

        }else{
            System.out.println("Available in string");
        }
    }
}
