package java8Features.streamApi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exam_01BasicMethods {
    public static void main(String[] args) {
        // we can use list interface duplicate be allow
        List<String> names= Arrays.asList("amol", "jyoti", "mahi","sham","Aram","jyoti");

        List<String>  removeDuplicate= new ArrayList<>(names);
     //   removeDuplicate.stream().distinct().forEach(System.out::println);
        System.out.println("*******");
       // removeDuplicate.stream().sorted().forEach(System.out::println);
       // System.out.println(names);
     List<String> newList =   removeDuplicate.stream()
                .distinct()
                .filter(s -> s.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(newList);

        List<String> newList2 =   removeDuplicate.stream()
                .distinct()
                .filter(s -> s.toLowerCase().endsWith("i")).collect(Collectors.toList());
        System.out.println(newList2);
     List<String> list3 = newList2.stream().sorted().collect(Collectors.toList());
        System.out.println(list3);

        System.out.println("+++++++++++++++++++");

        List<Integer> list5 = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 2, 3, 1);

        Map<String,Long> result5= names.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result5);

        System.out.println("////");






        Map<Integer,Integer> fremap= new HashMap<>();
        for (Integer number : list5) {
            fremap.put(number, fremap.getOrDefault(number, 0) + 1);
        }


        String result= fremap.entrySet()
                .stream()
                .map(entry->entry.getKey()+"="+ entry.getValue())
                .collect(Collectors.joining(", "));
        System.out.println(result);

    }

}
