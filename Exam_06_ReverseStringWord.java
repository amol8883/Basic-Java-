package topCodingQua;

public class Exam_06_ReverseStringWord {

    public static void main(String[] args) {
        String str = "Amol Bandge patil";
        String[] words= str.split(" ");
       // String result= "";
        for (String word: words){
            StringBuffer result = new StringBuffer(word).reverse();
            System.out.print(result+" ");

        }



    }
}
