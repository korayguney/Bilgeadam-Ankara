package com.bilgeadam.basicconcepts;

public class ConditionalExample {

    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);

        System.out.println("---- IF --------");

        String city = "ankara";
        int integerValue = 10;

        if (city == "ankara" || integerValue == 20) {
            System.out.println("Inside if section...");
        } else if (city == "Ankara") {
            System.out.println("Inside other if section...");
        } else {
            System.out.println("Inside else section...");
        }
    }
}
