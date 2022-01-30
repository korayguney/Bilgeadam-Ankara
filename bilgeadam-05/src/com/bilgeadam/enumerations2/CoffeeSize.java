package com.bilgeadam.enumerations2;

public enum CoffeeSize {
    SMALL(15, "Tall"),
    MEDIUM(18, "Grande"),
    LARGE(21, "Venti");

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
}
