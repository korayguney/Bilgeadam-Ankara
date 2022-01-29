package com.bilgeadam.polymorphismintro;

public class Animal{
    public void makeSound(){
        System.out.println("No Sound");
    }

    public void makeSound(String sound){
        System.out.println(sound);
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Hav hav...");
    }

    @Override
    public void makeSound(String sound){
        System.out.println("Dog  " + sound);
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Miyav miyav...");
    }
}

class TestClass{
    public static void main(String[] args){
        Animal animal = new Dog(); // polymorphism
       // animal.makeSound("Hav hav");

        Cat myCat;
        Dog myDog;

        if(animal instanceof Cat) {
            myCat = (Cat) animal; // explicit (developer responsibility) --> downcasting
        } else {
            System.out.println("Animal is not a type of cat!");
        }

        if(animal instanceof Dog) {
            myDog = (Dog) animal; // explicit (developer responsibility) --> downcasting
            Animal animal1 = myDog; // implicit (JVM responsibility) --> upcasting
            animal1.makeSound();
        } else {
            System.out.println("Animal is not a type of dog!");
        }
    }
}
