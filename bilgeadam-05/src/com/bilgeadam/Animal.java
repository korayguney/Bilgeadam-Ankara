package com.bilgeadam;

// superclass
// abstract class
public abstract class Animal{
    private String animalType;

    private void play(){
        System.out.println("The animal is playing...");
    }

    public abstract void makeSound();
    public abstract void eat();
}

// subclass
// concrete class
class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Hav hav...");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating meat");
    }

}

// subclass
// concrete class
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Miyav miyav...");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating cat meal");
    }
}

class TestAnimal {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound();
        cat.eat();
    }
}