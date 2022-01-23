package com.bilgeadam.inheritance;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sleeping() {
        System.out.println("The cat sleeps 14 hours in a day!");
    }
}
