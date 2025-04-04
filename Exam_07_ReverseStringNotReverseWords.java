package topCodingQua;

public class Exam_07_ReverseStringNotReverseWords {

    public static void main(String[] args) {
        String str = "Amol Bandge Patil";
        String[] words =str.split(" ");
        String result="";
        for (int i=words.length-1;i>=0;i--){
            result=result+words[i]+" ";
        }
        System.out.println(result);

    }
}
