package com.bilgeadam.interfaces;

public interface Pet extends Pet4,Pet5 {
    String getName();
    void setName(String name);
    void play();
    void staticMethod1();

    static void staticMethod(){
        System.out.println("Inside static method of interface");
    }

    default void defaultMethod(){
        System.out.println("Inside default method of interface");
    }
}
