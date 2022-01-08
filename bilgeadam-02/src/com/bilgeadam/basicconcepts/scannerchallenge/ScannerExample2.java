package com.bilgeadam.basicconcepts.scannerchallenge;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {

        System.out.println("How many dollar do you have?");
        Scanner scanner = new Scanner(System.in);
        double dollarAmount = scanner.nextDouble();

        double turkishLiraValue = 7.63;

        System.out.println(dollarAmount + " US Dollar equals to " + (dollarAmount * turkishLiraValue) + " ₺");

    }
}
