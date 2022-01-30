package com.bilgeadam.enumerations2;

public class Coffee {
    private CoffeeSize coffeeSize;

    public Coffee(CoffeeSize coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    enum CoffeeSize {
        TALL, GRANDE, VENTI;
    }

    public CoffeeSize getCoffeeSize() {
        return coffeeSize;
    }

    public void setCoffeeSize(CoffeeSize coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    public static void main(String[] args) {
        Coffee coffee = new Coffee(CoffeeSize.GRANDE);
        coffee.setCoffeeSize(CoffeeSize.VENTI);
        System.out.println(coffee.getCoffeeSize());
    }
}
