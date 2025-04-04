package com.string;

public class FindDuplicate {

    public static void main(String[] args) {

        String [] str= {"amol", "soham","ram","Amol","amol", "ram"};
        for(int i= 0; i<str.length;i++){
            for(int j= i+1; j<str.length; j++){
                if (str[i].equals(str[j])){
                    System.out.println("Find duplicate "+str[i]);
                }
            }
        }
    }




}
