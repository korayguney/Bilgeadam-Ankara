package com.bilgeadam.basicconcepts.bmiexample;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        double height;
        double result;

        System.out.println("Enter your weight: ");
        weight = scanner.nextDouble();
        System.out.println("Enter your height: ");
        height = scanner.nextDouble();
        //result = weight / (height * height);
        result = weight / Math.pow(height, 2);

        String preStr = "You are ";
        if (result < 18.5) {
            System.out.println(preStr + "underwight");
        } else if (result >= 18.5 && result < 25.0) {
            System.out.println(preStr + "normal");
        } else if (result >= 25 && result < 30) {
            System.out.println(preStr + "overweight");
        } else if (result >= 30 ) {
            System.out.println(preStr + "very overweight");
        }

    }
}
