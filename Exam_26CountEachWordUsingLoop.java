package topCodingQua;

public class Exam_26CountEachWordUsingLoop {

    public static void main(String[] args) {

        String str ="Hello word hello  amol word";
        str =str.toLowerCase();
        String[] words = str.split("\\s+");
        boolean[] connected= new boolean[words.length];

        System.out.println(words.length);
        //Use a boolean[] array to track whether a word has already been counted.
        boolean[] counted= new boolean[words.length];


        for (int i=0;i<words.length;i++ ){
             if (counted[i]) continue;

            int count =1;
            for (int j= i+1; j<words.length;j++){
                     if (words[i].equals(words[j])){
                     count++;
            //If a word is counted, it is marked as true in the counted array to avoid duplicate printing.
                  counted[j]=true;

                     }
            }
            System.out.println(words[i]+"  =  "+count);
        }
    }
}
