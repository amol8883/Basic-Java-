package com.it;

public class UnitConverter {


    public static void main(String[] args) {

        double checkdistance = 2;
        int choice=1;
        int choice2=2;
        System.out.println("Enter Choice Number 1/2");
        if(choice==1) {
            double km = milesKilometers(checkdistance);
            System.out.println(km);
        }else if(choice2==2){
            double ml = kilometerMiles(checkdistance);
            System.out.println(ml);
        }else{
            System.out.println("wrong input");
        }
    }


    private static double milesKilometers(double miles){
        return miles * 60964;
     }
    private static double kilometerMiles(double kilometer){

        return kilometer * 0.621372;
    }

}
