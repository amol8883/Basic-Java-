package java8Features.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.logging.SocketHandler;

public class Exam_02StudentResults {
    public static void main(String[] args) {
        //list of marks
        List<Integer> marks= Arrays.asList(39,95,48,66,75);
        System.out.println("Sort using stream: ");
        marks.stream().sorted().forEach(System.out::println);
        System.out.println("Total marks: "+ marks.stream().mapToInt(Integer::intValue).sum());
        System.out.println("cout by using Stream "+marks.stream().count());
        System.out.println("Average "+marks.stream().mapToInt(Integer::intValue).average());
    }
}
