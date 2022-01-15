package hw1;

import java.util.Scanner;

public class ConsoleIntegerExample {

    // Take integer inputs from user by console until the user writes “e”
    // (Ask user to write e to exit after every integer input ).
    // Then print average and total of all numbers

    private static int averageTotal = 0;
    private static int inputNumber = 0;
    private static int average = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        for (; ; ) {
            System.out.println("Enter a new input : (Enter 'e' for exit)");
            input = scanner.next();
            if (!input.equals("e")) {
                averageTotal += Integer.valueOf(input);
                inputNumber++;
            } else {
                average = averageTotal / inputNumber;
                break;
            }
        }
        System.out.println("Average : " + average);
    }
}
