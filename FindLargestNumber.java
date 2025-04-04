package basic.testProgram;

import java.util.Arrays;

public class FindLargestNumber {
    public static void main(String[] args) {
        // Given Numbers
        int[] numbers ={ 12,15,86,258,256,249,44,20};
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println("Largest number is ");
        System.out.println(numbers[numbers.length-1]);
        System.out.println("Find Second largest number ");
        System.out.println(numbers[numbers.length-1]);
        System.out.println("find the largest number help of Stream ");
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("largest number is : " +max);


    }
}
