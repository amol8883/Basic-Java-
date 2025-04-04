package com.array;

public class Array2DExample {

    public static void main(String[] args) {

        int[][] flats = new int[2][3];
        flats[0][0]= 01;
        flats[0][1]= 02;
        flats[0][2]= 03;

        flats[1][0]= 11;
        flats[1][1]= 12;
        flats[1][2]= 13;

        //ArrayIndexOutOfBoundsException
    //    flats[2][0]= 21;
    //    flats[2][1]= 22;
    //    flats[2][2]= 23;

        for (int i=0; i<flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }


    }
}
