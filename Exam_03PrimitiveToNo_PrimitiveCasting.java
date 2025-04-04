package mostImportantTyepCasting;

public class Exam_03PrimitiveToNo_PrimitiveCasting {
    public static void main(String[] args) {
        // 1st step convert all  P to N-P data Types
       // 1st- String
        byte bytes= 127;
        String str =String.valueOf(bytes);
        System.out.println(str);

        short srt = 12354;
        str= String.valueOf(srt);
        System.out.println(str);

        int num   = 1235456789;
        str= String.valueOf(num);
        System.out.println(str);
        System.out.println(str.length());

        float flt = 123456789.0f;
        str= String.valueOf(flt);
        System.out.println(str);
        System.out.println(str.length());

        double dl = 2135478995d;
        str=String.valueOf(dl);
        System.out.println(str);
        System.out.println(str.length());








    }
}
