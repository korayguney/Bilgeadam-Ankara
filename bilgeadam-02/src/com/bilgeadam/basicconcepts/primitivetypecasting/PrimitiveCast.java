package com.bilgeadam.basicconcepts.primitivetypecasting;

public class PrimitiveCast {
    public static void main(String[] args) {
        double d1 = 2344.2333;
        double d2 = 12233.4333;
        int sum = (int) d1 + (int) d2;
        double d3 = d1 + d2;

        System.out.println(d3);
        System.out.println(sum);
        final int a = 10;
        double v = a;
        v = v + 10;
        System.out.println(v);
        //a = 30;
        final int b = 20;
        byte c = a + b;
    }
}
