package com.bilgeadam.basicconcepts;

public class StringConcatination {
    public static void main(String[] args) {
        System.out.println(4 + (3 + 1) + " Bilgeadam " + 4 + (3 + 1));
        //System.out.println("Hello " + new Student());
    }

   static class Student extends Object {
       String name = "Ramazan";
       int age = 25;

       @Override
       public String toString() {
           return name;
       }
   }
}
