package com.oopsCocepts.Polymorphism;

interface MyWifi{
    void connectToNetwork(String network);
    String[] getNetworks();

}
interface  MyCamera{

    void takeSnap();
    void recordVideo();
}
interface MediaPlayer {
   void playMusic();
 }
 class   MyCellPhone{  // this is super call
    void callNumber(Long phoneNumber){
        System.out.println("calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Calling.....");
    }
}

class  SmartPhone extends MyCellPhone implements MyWifi,MyCamera,MediaPlayer {

    @Override
    public void takeSnap(){
        System.out.println("Tacking snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Tacking Videos snap");
        System.out.println("recording 4k videos");
    }
    @Override
    public void playMusic() {
        System.out.println("Play Videos");
    }
    @Override
    public void connectToNetwork(String network) {
        System.out.println("Use this network = "+network);

    }
    @Override
    public String[] getNetworks() {

        String[] networkList ={"ganeshKrupp,freeVeryTime, jioCable"};
        for ( String  st : networkList){
            System.out.println("Getting Network list>>>  "+st);
        }
       return  networkList;
    }
}

 public class BestPractice_Polymorphism {

    public static void main(String[] args) {
        MyWifi wifi = new SmartPhone();  // only call Wifi Interface methods  This is Polymorphism
        wifi.getNetworks();
        // wifi.takeSnap;  another method not call, only reference call method allow
        wifi.connectToNetwork("ganeshKrupp");
        // but we want to all over all method to crete new objects

        System.out.println("****************************************");
        // call the on=object of extend and implements class
        SmartPhone sp = new SmartPhone();
        sp.takeSnap();
        sp.recordVideo();
        sp.playMusic();
        sp.getNetworks();
        sp.connectToNetwork("jioCable");
        // parent call methods  also call help of sp reference
        sp.callNumber(9545434732l);
        sp.pickCall();

    }

}
