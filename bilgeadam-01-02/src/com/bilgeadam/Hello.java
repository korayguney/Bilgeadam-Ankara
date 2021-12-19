package com.bilgeadam;

// This is our first Hello class
public class Hello {
    // variable (field) , TR. değişken
    int firstnumber;
    int firstNumber;

    byte myByte = 127;
    short myShort = 32767;
    int myInteger = 3333;
    long myLong = 13461112344L;

    char myChar = 'a';

    float myFloat = 33.45f; // 32 bit
    double myDouble = 33.45; // 64 bit

    boolean myBoolean = false;

    int sumGrades, remainder, r2d2c3po;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello \" World!");
        System.out.println("Hello \n World!");
        System.out.println("Hello\tWorld!");
        System.out.println("Hello\\World!");
    }

    /**
     *
     * This method sums 2 integers
     *
     * @param a
     * @param b
     * @return int sum of parameters
     */
    public int sum(int a, int b){
      return a+b;
    }
}

