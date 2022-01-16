package com.bilgeadam.encapsulation;

public class BankCustomer {

    // instance variable
    private String name;
    private int age;
    private double salary;

    // constuctors
    public BankCustomer() {
    }

    public BankCustomer(String name, int age, double salary) {
        this.name = name;
        setAge(age);
        this.salary = salary;
    }

    public BankCustomer(String name) {
        this.name = name;
    }

    public BankCustomer(int age) {
        // business rule --> age can be max.100
        setAge(age);
    }


    // getter & setter
    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        // business rule --> age can be max.100
        if(age > 100) {
            System.out.println("Your input is not accepted!");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
