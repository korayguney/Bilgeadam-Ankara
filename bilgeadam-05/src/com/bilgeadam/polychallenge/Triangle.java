package com.bilgeadam.polychallenge;

public class Triangle extends Shape {

    private int baseWeight;
    private int height;

    public Triangle(int weight, int height, String color) {
        super(color);
        this.baseWeight = weight;
        this.height = height;
    }

    public Triangle(int weight, int height) {
        super("Blue");
        this.baseWeight = weight;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Area of the triangle : " + (getHeight() * getBaseWeight()) / 2);
    }

    public int getBaseWeight() {
        return baseWeight;
    }

    public void setBaseWeight(int baseWeight) {
        this.baseWeight = baseWeight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}

