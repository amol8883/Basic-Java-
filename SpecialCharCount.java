package com.string;

public class SpecialCharCount{

    public static void main(String[] args) {

        String str = "am ol@$&!";//
        int count = 0;
        String specialCharacterRemoved= " ";

        for (int i = 0;i<str.length();i++){
            if (!Character.isDigit(str.charAt(i))&& !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))){
             count++;
            }else{
                specialCharacterRemoved = specialCharacterRemoved+str.charAt(i);// character and digit and space
            }
        }

        if (count==0){
            System.out.println("Special character not found in String ");
        }else{
            System.out.println("The special character is "+count);
        }
        System.out.println("SpecialCharacterRemove"+specialCharacterRemoved);
    }

}
