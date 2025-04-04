package topCodingQua;

import javafx.scene.effect.SepiaTone;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exam_18ListInDuplicateSeparateHashSet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,4,5,2,5,1,8,99,44,33,2,5,99,33);
        Set<Integer> duplicate= getDuplicate(numbers);

        System.out.println("Duplicate Numbers :"+duplicate);

    }

    public static Set<Integer> getDuplicate(List<Integer> numbers) {
        Set<Integer> seen= new HashSet<>();
        Set<Integer> duplicates= new HashSet<>();
        for (Integer num :numbers  ){
            if (!seen.add(num)){
                duplicates.add(num);

            }
        }
        return duplicates;



    }
}
