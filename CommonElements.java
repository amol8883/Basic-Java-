package com.array;

import javafx.scene.effect.SepiaTone;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElements {

    public static void main(String[] args) {
        int[] array1 = {2,3,5,7,9,7};
        int[] array2 = {3,4,6,8,9,2};

        System.out.println("common elements");
        for (int i =0;i<array1.length;i++){
            for (int j=0;j<array2.length;j++){

               if(array1[i]==array2[j]){
                   System.out.println(array1[i]+ " ");
                   break;
               }
            }
        }

        // convert array into list
        List<Integer> list1 = Arrays.stream(array1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(array2).boxed().collect(Collectors.toList());

        List<Integer> commonElements=list1.stream().filter(list2::contains)
                                                   .distinct()
                                                   .collect(Collectors.toList());
        System.out.println("CommonElements: "+commonElements);

        Set<Integer> set = new HashSet<>();
        for (int num : array1){
            set.add(num);
        }
         Set<Integer> commonElements2 = new HashSet<>();
        for (int num : array2){
            if(set.contains(num)) {
                commonElements2.add(num);
            }
        }
        System.out.println("CommonElemets:>>>>   "+commonElements2);

    }
}
