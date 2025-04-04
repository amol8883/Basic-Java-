package topCodingQua;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Exam_10_ReverseWordOrder {

    public static void main(String[] args) {


        String input = "Jyoti Amol Bandge";

        List<String> words = Arrays.asList(input.split(" "));
        Collections.reverse(words);
        String reversed = words.stream().collect(Collectors.joining(" "));

        System.out.println("Input: "+input);
        System.out.println("Reversed :"+ reversed);

    }
}
