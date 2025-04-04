package topCodingQua;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Exam_09_ReverseStream {
    public static void main(String[] args) {
        String str = "Amol Vilas Bandge";
        String reversed = Arrays.stream(str.split(" "))
                .map(word->new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println("Input : "+str);
        System.out.println("Reversed :  " +reversed);

    }
}
