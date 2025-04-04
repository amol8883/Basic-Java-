package com.InterfaceInJava;

// in interface allow two or more implementation interface in class( e.g. class A implements Interface1, Interface2)
public interface Bike {

  // final int press=2; // inside variable as default final if declare or not,  its constant
    // only allow abstract  method
    void applyBreak(int decrement);
    void speedUp(int Increment);

}
interface SportsBike{  // public and final variable declared default

  void ApplyDiskbreak();

/* // java 8 not allow private method in interface but java 9 use private and call internally another method same interface
   private void greet(){
        System.out.println("Good Morning");
    }
*/
    // default method allow interface
    default void flashLight(){
     //   greet();  call private method java 9
        System.out.println("if not override call parent interface  method");
    }


}
// in class implement two or more Interface, this is not done by in Abstraction class
class  Hero implements Bike,SportsBike {

    public void applyBreak(int decrement) {

        System.out.println("Apply Break");
    }

    public void speedUp(int Increment) {
        System.out.println("Apply Speed");
    }

    public void ApplyDiskbreak() {
        System.out.println("Apply Disk Break");
    }

    // default method override declare as public.
    public void flashLight(){
        System.out.println("if we override default method in child class then execute child method");
    }

    public static void main(String[] args) {
        Hero h1  = new Hero();
        h1.applyBreak(1);
        h1.speedUp(45);
        h1.ApplyDiskbreak();
        h1.flashLight();
    }

}


