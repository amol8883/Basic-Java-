package basic.testProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindLastElementList {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("one", "two", "three","four","Five" , "six");
        String lst = list.stream().skip(list.size()-1).findFirst().get();
        System.out.println("Last element in list : "+lst);
        List<Integer> list2 = Arrays.asList(225,251,586,999,259,257,365);
        System.out.println(list2);
        System.out.println("Second last elements******");
        Integer lst2 = list2.stream().skip(list2.size()-2).findFirst().get();
        System.out.println(lst2);


    }
}
