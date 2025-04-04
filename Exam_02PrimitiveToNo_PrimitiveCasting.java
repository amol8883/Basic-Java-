package mostImportantTyepCasting;

import java.io.PrintStream;

public class Exam_02PrimitiveToNo_PrimitiveCasting {

    public static void main(String[] args) {
        byte bytes = 127;
        String str= String.valueOf(bytes);
        System.out.println(str);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
       // System.out.println(str.charAt(3));
        try {
                System.out.println(str.charAt(4));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Exception: Index out of bounds! Continuing execution...");


        }

    }

}
