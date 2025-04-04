package com.objectClassMethods;

import javax.swing.border.EmptyBorder;

public class Example{
    private int id;
    private String name;

    public Example(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "ID "+id+" Name "+name;
    }
    @Override
    public int hashCode(){
        return id;
    }

    @Override
   public boolean equals(Object obj){

     try {
         Example emp1 = (Example)obj;
         if (name.equals(emp1.getName()) && id ==emp1.getId())
             return true;
         else
             return false;
     }catch (Exception ex) {
         return false;
     }
   }


    public static void main(String[] args) {
        Example emp1 = new Example(1,"Amol");
        Example emp2 = new Example(2,"jaypal");
        Example emp3 = new Example(1,"Amol");
        Example emp4 = emp1;
        System.out.println(emp1.toString()); // call toString Method from Object class

        System.out.println(emp1.hashCode()); // Call hashCode Method from Object class

        //   After call Equal() method then compare content of object
        System.out.println(emp1.equals(emp2)); // reference  comparison false  object ref comparison
        System.out.println(emp1.equals(emp3)); //  reference comparison false  object ref comparison
        System.out.println(emp1.equals(emp4));  //  same object reference  then true. object ref comparison

        System.out.println(emp1.getClass().getName()); // find the class name of help of this method
    }
}
