package topCodingQua;

import java.util.stream.IntStream;

public class Exam_01_PrintNumbers {

    public static void main(String[] args) {

        int a = 10; // print 10 numbers Ascending order
        for (int i = 0; i <= a; i++) {
            System.out.println(i);

        }
        // print 10 numbers desc order
        for (int i = a; i >= 0; i--) {
            System.out.println(i);
        }

        // Print 1 to 10 number without for loop
          // using Steam
        IntStream.range(10,20).forEach(n-> System.out.print(n+" "));



    }
}
