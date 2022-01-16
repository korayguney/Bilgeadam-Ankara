package com.bilgeadam.overloadingchallenge;

public class Pen {

    // overloading ...
    public double draw(Circle c) {
        double area = Math.PI * Math.pow(c.getRadius() , 2);
        return area;
    }

    public double draw(Rectangle r) {
        double area = r.getHeight() * r.getWeight();
        return area;
    }

    public String changeColor(String color, Rectangle r) {
        r.setColor(color);
        return r.getColor();
    }

    public String changeColor(String color, Circle r) {
        r.setColor(color);
        return r.getColor();
    }

}
