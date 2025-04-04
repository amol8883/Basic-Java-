package topCodingQua;

import java.util.*;

public class Exam_25KeyValueConceptsDetails {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("dove","senator","ponds","dove", "pen","oilPausch","pen","senator","pen", "cup","cup", "pen");

        Scanner sc = new Scanner(System.in);
      //  List<String> str= Collections.singletonList(sc.nextLine());
        List<String> str = Arrays.asList(sc.nextLine().split(" "));

        getQuantityProducts(str);
        getQuantityProducts(list);

    }

    private static void getQuantityProducts(List<String> list) {

        Map<String,Integer> count=new HashMap<>();
        for (String str: list){
            count.put(str,count.getOrDefault(str,0)+1);
        }
        for (Map.Entry<String, Integer> entry: count.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

    }

}
