package com.bilgeadam.polymorphismintro;

// superclass
public class Animal{
    public void makeSound(){
        System.out.println("No Sound");
    }

    public static void eat(){
        System.out.println("Eating something else...");
    }

    public void makeSound(String sound){
        System.out.println(sound);
    }
}

// subclass
class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Hav hav...");
    }

    public static void eat(){
        System.out.println("Eating meat...");
    }

    @Override
    public void makeSound(String sound){
        System.out.println("Dog  " + sound);
    }
}

// subclass
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Miyav miyav...");
    }
}

class TestClass{
    public static void main(String[] args){
        Animal animal = new Dog(); // polymorphism
        animal.makeSound(); // hav hav...
        animal.eat();

        Cat myCat;
        Dog myDog;

        if(animal instanceof Cat) {
            myCat = (Cat) animal; // explicit (developer responsibility) --> downcasting
            myCat.makeSound();
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
