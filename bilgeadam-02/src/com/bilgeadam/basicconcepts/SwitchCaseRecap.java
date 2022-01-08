package com.bilgeadam.basicconcepts;

import java.util.Scanner;

public class SwitchCaseRecap {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double weight;
        double height;
        double result;
        String gender = null;

        System.out.println("Enter your weight: ");
        weight = scanner.nextDouble();
        System.out.println("Enter your height: ");
        height = scanner.nextDouble();
        result = weight / Math.pow(height, 2);
        System.out.println("Enter your gender: ");
        gender = scanner.next();
        char[] c = gender.toCharArray();

        double[] rangeArr = calculateBmi(c[0]);

        String preStr = "You are ";
        if (result < rangeArr[0]) {
            System.out.println(preStr + "underwight");
        } else if (result >= rangeArr[0] && result < rangeArr[1]) {
            System.out.println(preStr + "normal");
        } else if (result >= rangeArr[1] && result < rangeArr[2]) {
            System.out.println(preStr + "overweight");
        } else if (result >= rangeArr[2] ) {
            System.out.println(preStr + "very overweight");
        }

    }

    public static double[] calculateBmi(char gender) {
        double[] rangeArr = new double[3];
        switch (gender) {
            case 'F':
                rangeArr[0] = 18.5;
                rangeArr[1] = 25.5;
                rangeArr[2] = 30.5;
                break;
            case 'M':
                rangeArr[0] = 20;
                rangeArr[1] = 27;
                rangeArr[2] = 32.5;
                break;
        }
        return rangeArr;
    }


}
