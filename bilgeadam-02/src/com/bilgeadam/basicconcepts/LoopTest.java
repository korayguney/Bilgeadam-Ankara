package com.bilgeadam.basicconcepts;

public class LoopTest {
    public static void main(String[] args) {
        // testWithWhileLoop();
        // testWithDoWhileLoop();
        // testWithForLoop();
        testWithForLoop2();
        // testWithForLoopOuter();
    }

    private static void testWithForLoop2() {
        int a = 0;
        for (int i = 100; i >= 0; i--) {
            a += i;
        }
        System.out.println("Sum : " + a);
    }

    private static void testWithForLoopOuter() {
        outer:
        for (int i = 0; i < 100; i++) {
            for (int x = 0; x < 50; x++) {
                if (x < 30) {
                    System.out.println("i=" + i + " x=" + x);
                } else {
                    break outer;
                }
            }
        }
    }

    private static void testWithForLoop() {
        int a = 0;
        for (int i = 0; i <= 100; i++) {
            if (i == 10) {
                continue;
            }
            a += i;
        }

        System.out.println("Sum : " + a); // 5040

    }

    private static void testWithDoWhileLoop() {
        int i = 0;
        int a = 0;

        do {
            a += i; //a = a + i;
            i++;
            // System.out.println("Inside do section");
        } while (i <= 100);

        System.out.println("Sum : " + a);
    }

    private static void testWithWhileLoop() {
        int i = 0;
        int a = 0;

        while (i <= 100) {
            a += i; //a = a + i;
            i++;
            // System.out.println("Now value of i : " + i);
        }

        System.out.println("Sum : " + a);
    }
}
