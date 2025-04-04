package basic.testProgram;

import java.util.Scanner;

public class ScannerClassUSing {

    public static void main(String[] args) {

        System.out.println("Enter input value");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb =new StringBuilder(str).reverse();
        System.out.println(sb);



    }
}
