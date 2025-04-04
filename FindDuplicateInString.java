package com.string;

public class FindDuplicateInString {

    public static void main(String[] args) {
        String str= "Programming";
        StringBuilder result= new StringBuilder();
        char[] ch = str.toCharArray();
        for (int i=0; i<ch.length;i++){
            boolean rep= false;
          for (int j=i+1; j<ch.length;j++){
                if (ch[i]==ch[j]){
                    rep=true;
                    break;
                }
          }
          if (!rep){
              result.append(ch[i]);
          }

        }
        System.out.println(result);


        }
    }

