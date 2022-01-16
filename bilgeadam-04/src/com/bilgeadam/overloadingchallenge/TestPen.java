package com.bilgeadam.overloadingchallenge;

public class TestPen {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(15, 25);
        Pen pen = new Pen();
        System.out.println("Area of circle : " + pen.draw(circle));
        System.out.println("Area of rectangle : " + pen.draw(rectangle));

        System.out.println("Circle previous color: " + circle.getColor());
        pen.changeColor("Red", circle);
        System.out.println("Circle next color: " + circle.getColor());

        System.out.println("rectangle previous color: " + rectangle.getColor());
        pen.changeColor("Yellow", rectangle);
        System.out.println("rectangle next color: " + rectangle.getColor());

    }
}
