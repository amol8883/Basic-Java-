package topCodingQua;

import java.util.Arrays;

public class Exam_00TypeCasting {
    // Primitive data types
    public static void main(String[] args) {

        byte a = 10;
        short b = 20;
        char c = 'z';
        int i = 30;
        float f = 10.0f;
        double d = 11l;
        long l = 25899;
        boolean bl = true;

        int num=a;   // big=small possible
        num=b;
        num=c;
        num=(int)f;
        num=(int)d;
        num= (int)l;
        //num=(int)bl;
        long lo=num;
        lo=c;
        lo=(long)d;


        // Non-Primitive

        int num1 = 123411;
        String str= String.valueOf(num1);
        char ch =(char) num1;
        char[] ch1=String.valueOf(num1).toCharArray();
        System.out.println(ch1);
        System.out.println(ch1[1]);
        float[] fk={(float) num1};

        System.out.println(Arrays.toString(fk));

    }

}
