package mostImportantTyepCasting;

public class Exam_01PrimitiveDataCasting {
    public static void main(String[] args) {
        byte b=10;
        short s= 20;
        int i =30;
        float fl =30.0f;
        char ch ='a';
        long lg =3545434732l;
        double dl =35511464685d;
        boolean present =true;
        System.out.println("Print same conversion");
        s=b;       // byte to short
        System.out.println("Print "+s);
        b=(byte) s; // using type casting
        System.out.println("Print "+b);
        s=(short)i;  // int to short casting long to small
        System.out.println("Print "+s);
        s=(short)fl;   // float to short
        System.out.println("Print "+s);
        i=b;
        i=s;
        i=(int)fl; //casting
        fl=i;
        i=(int)dl;//casting
        i=ch;
        ch=(char)i; //casting
        ch=(char)fl; //casting
        ch=(char)lg; //casting
        lg=ch;
        dl=fl;
        fl=(float) dl;
        fl=(float) lg;
        dl=lg;
        lg=(long)dl;



    }
}
