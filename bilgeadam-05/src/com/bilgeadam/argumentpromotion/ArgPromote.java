package com.bilgeadam.argumentpromotion;

import java.math.BigDecimal;

public class ArgPromote {
    double c = 12.56;
    float f = 12.45f;

    public static void main(String[] args) {
        double d = 3 + 3.1233; // implicitly casting
        long l = 3 + 12000L; // implicitly casting
        new ArgPromote().someMethod();
    }

    void someMethod() {
        doSomething((int) c); // explicitly casting
        doSomething((float) c); // explicitly casting
    }

    void doSomething(int d) {
        System.out.println(d);
    }

    void doSomething(float d) {

    }
}
