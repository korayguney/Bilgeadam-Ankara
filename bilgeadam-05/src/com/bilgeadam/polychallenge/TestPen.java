package com.bilgeadam.polychallenge;

public class TestPen {
    public static void main(String[] args) {

        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(15, 25);
        Shape triangle =  new Triangle(25, 10);
        Pen pen = new Pen();

        pen.draw(circle);
        pen.draw(rectangle);
       // pen.draw(triangle);

        pen.changeColor("Red", circle);
        pen.changeColor("Yellow", rectangle);

    }
}
