package oop;

// blueprint
public class Car {

    // instance variables (fields, class members, değişken, alan vs...)
    // states
    public String color = "Black";
    int capacity;
    protected double horsePower;
    String fuelType;
    boolean isManualTransmission;
    int modelYear;
    String modelName;

    // methods
    // behaviors
    public int accelerate(int speed) {
        int currentSpeed = 0; // --> local variable
        currentSpeed += 10;
        double lastSpeed = 85.70; // --> local variable
        lastSpeed++;
        currentSpeed++;
        capacity--;
        return (int) lastSpeed + speed;
    }

    public int accelerate(int speed, double rate) {
        int currentSpeed = 0;
        currentSpeed += 10;
        fuelType = "";
        double lastSpeed = 85.70;
        return (int) ((lastSpeed + speed) * rate);
    }

    public void getCarColor(){
        accelerate(100);
        int a; // --> local variable
        System.out.println(color);
    }
}

class CarImpl {
    public static void main(String[] args) {
        // create object of Car class
        Car car = new Car();
        System.out.println("Capacity : " + car.capacity);
        System.out.println("Color : " + car.color);
        System.out.println("Color : " + car.color);
        car.color = "Blue";
        System.out.println("Color : " + car.color);
        System.out.println("Color : " + car.color);
        System.out.println("hasManualTransmission ? : " + car.isManualTransmission);
        System.out.println("Last speed : " + car.accelerate(10));
        System.out.println("Last speed : " + car.accelerate(20));
        System.out.println("Last speed : " + car.accelerate(25));
        System.out.println("Last speed : " + car.accelerate(50, 0.9));

        car.getCarColor();
    }
}




