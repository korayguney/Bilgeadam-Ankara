package com.bilgeadam.passbyvalue;

public class City {
    // instance (member) variable, field, değişken
    private String name;

    public City(){
        System.out.println("Inside default constuctor of City...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
