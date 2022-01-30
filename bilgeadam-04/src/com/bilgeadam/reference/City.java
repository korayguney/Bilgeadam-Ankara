package com.bilgeadam.reference;

public class City implements Cloneable {
    // instance (member) variable, field, değişken
    String name;

    public City(){
        System.out.println("Inside default constuctor of City...");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
