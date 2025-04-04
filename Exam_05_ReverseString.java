package topCodingQua;

public class Exam_05_ReverseString {

    public static void main(String[] args) {
        String str = "Amol Bandge Patil";
        String result = new StringBuilder(str).reverse().toString();
        StringBuffer sb = new StringBuffer(str).reverse();
        System.out.println(result);
        System.out.println(sb);
    }
}
