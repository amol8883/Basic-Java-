package basic.testProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExampleStream {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(5234,2554,2648,2459,4569,2554);
        List<Integer> list= new ArrayList<>(num);
        List<Integer> decOrder= new ArrayList<>(num);

         list.stream().sorted().forEach(System.out::println);


        System.out.println("*******************");
        list.stream().distinct().forEach(System.out::println);


        Optional<Integer> firstNum= list.stream().findFirst();
        if (firstNum.isPresent()){
            System.out.println("First num is given list "+firstNum.get());
        }else {
            System.out.println("this is Empty");
        }





    }
}

