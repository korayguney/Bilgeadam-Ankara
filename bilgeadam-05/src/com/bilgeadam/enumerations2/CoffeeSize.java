package com.bilgeadam.enumerations2;

public enum CoffeeSize {
    SMALL(15, "Tall") {
        @Override
        public double calculatePriceWithDollar() {
            return getPrice() * 0.13;
        }
    },
    MEDIUM(18, "Grande"){
        @Override
        public double calculatePriceWithDollar() {
            return getPrice() * 0.13;
        }
    },
    LARGE(21, "Venti") {
        @Override
        public double calculatePriceWithDollar() {
            return getPrice() * 0.13;
        }
    };

    private int price;
    private String commersialName;

    CoffeeSize(int price, String commersialName) {
        this.price = price;
        this.commersialName = commersialName;
    }

    public int getPrice() {
        return price;
    }

    public String getCommersialName() {
        return commersialName;
    }

    public abstract double calculatePriceWithDollar();
}
