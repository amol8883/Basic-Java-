package basic.testProgram;

public class AddTwoString {
    public static void main(String[] args) {

        String str1 = "Amol";
        String str2 = "Patil";

        // 1St way to solve
        String addString = str1 + " " + str2;
        System.out.println(addString);

        // 2nd way to solve
        String result = str1.concat(" ").concat(str2);
        System.out.println("Using concat() method result is : " + result);

        // 3rd way to solve

        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(" ").append(str2);
        System.out.println("Using StringBuilder in append : "+sb.toString());


    }
}
