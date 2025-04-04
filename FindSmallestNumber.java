package basic.testProgram;

import java.util.Arrays;

public class FindSmallestNumber {

    public static void main(String[] args) {

        int[] numbers= {20,25,18,125,357,24,55,11,68,88};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("smallest number in array is " +numbers[0]);
        System.out.println("Second smallest number in array is " +numbers[1]);

    }
}
