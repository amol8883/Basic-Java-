package com.array;

public class FindDuplicate {


    public static void main(String[] args) {
        // find the duplicate in array

        int[] arr = {1,2,5,7,6,2,5};
        for(int i= 0; i<arr.length;i++){
            for(int j= i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    System.out.println("Find duplicate "+arr[i]);
                }
            }
        }
        // Find duplicate in String Array
        String [] str= {"amol", "soham","ram","amol"};

        for(int i= 0; i<str.length;i++){
            for(int j= i+1; j<str.length; j++){
                if (str[i].equals(str[j])){
                    System.out.println("Find duplicate "+str[i]);
                }
            }
        }

        // find the duplicate in char
        char[] ch = {'a','c','g','d','f','g','r','a'};
        for(int i= 0; i<ch.length;i++){
            for(int j= i+1; j<ch.length; j++){
                if (ch[i]==(ch[j])){
                    System.out.println("Find duplicate "+ch[i]);
                }
            }
        }

    }

}
