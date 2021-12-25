package com.bilgeadam.basicconcepts;

public class AritmeticOperatorTest {

    public static void main(String[] args) {
        System.out.println("Inside main method...");

        int a = 15;
        int b = 5;

        System.out.println("Sum : " + (a + b));
        System.out.println("Subs. : " + (a - b));
        System.out.println("Multiply : " + (a * b));
        System.out.println("Devide : " + (a / b));

        System.out.println("----------");

        System.out.println(a * b + b / 2);

        System.out.println("--- shorthand operator ----");
        int c = 10;
        c += 5;  //c = c + 5;
        c -= 5;
        c *= 5;
        c /= 5;

        c++; // c = c + 1;
        c--; // c = c - 1;

        System.out.println(c);

        System.out.println("------------------");
        int x = 2;
        int z = ++x; //x++;
        int y = --x;

        System.out.println(" x : " + x); // 2
        System.out.println(" z : " + z); // 2 - 3
        System.out.println(" y : " + y); // 3
        System.out.println(" x : " + x); // 2


        System.out.println("-------------------");
        int m = 12;
        int n = m;
        m++;
        System.out.println(m);
        System.out.println(n);

    }


}
