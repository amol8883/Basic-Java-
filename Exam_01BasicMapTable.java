package collectionDataSrtucture.mapConcepts;

import java.util.Hashtable;
import java.util.Map;

public class Exam_01BasicMapTable {
    public static void main(String[] args) {
        //Hashtable ht = new Hashtable();
       // Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
       // Hashtable<Integer,String> ht = new Hashtable<Integer,String>(2);
       // Hashtable<Integer,String> ht = new Hashtable<Integer,String>(2,80.5f);


        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(101,"A");
        ht.put(102,"b");
        ht.put(103,"C");
        ht.put(104,"D");
        ht.put(105,"D");
        ht.put(106,"D");
        System.out.println(ht);     // one slate { 1 2 3 5  }

        System.out.println(ht.keySet());
        for (Integer num: ht.keySet()){     // using for loop insidiously 1 2 3 4
            System.out.print(num+" ");

        }
        System.out.println();

        System.out.println(ht.values());
        for (String str :ht.values()){
            System.out.print(str+" ");
        }
        System.out.println("\n");
        ht.remove(106);
        System.out.println(ht);

        System.out.println(ht.containsKey(101));
        System.out.println(ht.containsValue("f"));
        System.out.println(ht.isEmpty());
        System.out.println(ht.size());
        System.out.println(ht.replace(105,"X"));
        System.out.println(ht.replace(101,"X"));
        System.out.println(ht);

        System.out.println(ht.entrySet());
        for (Map.Entry entry: ht.entrySet()){
            System.out.print(entry+" ");
        }

    }
}
