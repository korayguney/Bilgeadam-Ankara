package com.bilgeadam.inheritance;

public class TestInheritance {
    public static void main(String[] args) {

        Dog dog = new Dog("Fifi");
        dog.sleeping();
      //  dog.setName("Fifi");
        dog.play();
        System.out.println(dog);

        System.out.println(dog.getName());

        Cat cat = new Cat("Coffee");
        cat.sleeping();

        Dog dog2 = new Dog();
        System.out.println(dog2);

        Kangal sivasKangali = new Kangal();
        sivasKangali.eating();
        sivasKangali.sleeping();
    }
}
