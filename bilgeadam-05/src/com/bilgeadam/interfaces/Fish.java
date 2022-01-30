package com.bilgeadam.interfaces;

public class Fish extends Animal implements Pet, Pet2, Pet3 {

    private String petName;

    @Override
    public void eat() {
        System.out.println("The fish is eating fish meal");
    }

    @Override
    public String getName() {
        return this.getPetName();
    }

    @Override
    public void setName(String name) {
        this.setPetName(name);
    }

    @Override
    public void play() {
        System.out.println("Playing with fish...");
    }

    // backward compatibility...
    @Override
    public void staticMethod1() {

    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public void foo() {

    }

    @Override
    public void bar() {

    }

    @Override
    public void gree() {

    }

    @Override
    public void defaultMethod() {
        System.out.println("Inside fish default method...");
    }

    public static void main(String[] args) {
        Pet fish = new Fish();
        Pet.staticMethod();
        fish.defaultMethod();

    }
}
