package com.bilgeadam.polychallenge;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public Circle(int radius) {
        super("Black");
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("The area of the circle : " + Math.PI * Math.pow(getRadius(), 2));
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
