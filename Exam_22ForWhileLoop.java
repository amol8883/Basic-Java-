package topCodingQua;

public class Exam_22ForWhileLoop {

    public static void main(String[] args) {

        //print the 1 to 10 numbers using for loop
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");

        }
        System.out.println("\n reverse: ");
        for (int i = 10; i>= 0; i--) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("Using While Loop");

        int i = 1;
        while(i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n reverse: ");
        int j = 10;
        while(j >= 0) {
            System.out.print(j + " ");
            j--;
        }
    }
}
