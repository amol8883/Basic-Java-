package basic.testProgram;

import java.util.Arrays;

public class SortStringForLoop {
    public static void main(String[] args) {
      // Approach
        // Sort the String without using sort() method
        String str ="java";
        char temp;
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            for (int j=i+1; j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr);
        //Approach 2
        char[] arr2 = str.toCharArray();
        Arrays.sort(arr2);
        System.out.println(new String(arr));
    }
}
