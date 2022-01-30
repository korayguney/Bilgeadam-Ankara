package com.bilgeadam.enumerations2;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Arrays;
import java.util.function.Consumer;

public class TestCoffeeSizes {
    public static void main(String[] args) {
        CoffeeSize coffee1 = CoffeeSize.LARGE;
        CoffeeSize coffee2 = CoffeeSize.MEDIUM;
        CoffeeSize coffee3 = CoffeeSize.SMALL;
        CoffeeSize coffee4 = CoffeeSize.SMALL;

        CoffeeSize[] coffeeSizes = {coffee1, coffee2, coffee3, coffee4};

        int totalPrice = 0;

        for (CoffeeSize coffeeSize : coffeeSizes) {
            totalPrice += coffeeSize.getPrice();
            System.out.println("Purchased coffee size : " + coffeeSize.getCommersialName());
        }

        System.out.println("Total price of coffees : " + totalPrice + " TL.");

        if (coffee1 == CoffeeSize.LARGE) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        switch (coffee1) {
            case LARGE:
                System.out.println("Size is large...");
                break;
            case MEDIUM:
                System.out.println("Size is medium...");
                break;
            case SMALL:
                System.out.println("Size is small...");
                break;
            default:
                System.out.println("Size is not detected...");
                break;
        }

        CoffeeSize smallCoffeSizeEnum = CoffeeSize.valueOf("SMALL");
        System.out.println("valueOf ---> " + smallCoffeSizeEnum);

        CoffeeSize[] coffeeSizes1 = CoffeeSize.values();
        System.out.println(Arrays.toString(coffeeSizes1));

        System.out.println("---------------------------");
        Arrays.stream(coffeeSizes1).forEach(System.out::println);
        System.out.println("---------------------------");

        for (CoffeeSize coffeeSize : coffeeSizes1) {
            System.out.println(coffeeSize.getCommersialName());
        }

        for (DayOfWeek value : DayOfWeek.values()) {
            System.out.println(value);
        }

        for (Month value : Month.values()) {
            System.out.println(value);
        }


    }
}
