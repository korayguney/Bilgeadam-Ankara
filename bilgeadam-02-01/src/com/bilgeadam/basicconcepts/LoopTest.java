package com.bilgeadam.basicconcepts;

public class LoopTest {
    public static void main(String[] args) {
        //testWithWhileLoop();
        testWithDoWhileLoop();

    }

    private static void testWithDoWhileLoop() {
        int i = 0;
        int a = 0;

        do {
            a += i; //a = a + i;
            i++;
            System.out.println("Inside do section");
        } while(i >= 100);

        System.out.println("Sum : "+ a);
    }

    private static void testWithWhileLoop() {
        int i = 0;
        int a = 0;

        while (i <= 100) {
            a += i; //a = a + i;
            i++;
           // System.out.println("Now value of i : " + i);
        }

        System.out.println("Sum : "+ a);
    }
}
