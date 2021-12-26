package com.bilgeadam.basicconcepts;

public class LogicalOperatorExample {

    public static void main(String[] args) {

       // conditional_AND();
       // logical_AND();
        System.out.println(!false);
      // int x = 0;
      // if ((x != 0) && (1 / x > 1)) {
      //     System.out.println("Inside of second if");
      // }

        //testOr();
    }

    private static void logical_AND() {
        int x = 0;
        if (false & (1 == ++x)) {
            System.out.println("Inside in if...");
        }
        System.out.println(x); // 1
    }

    private static void conditional_AND() {
        // circuit breaker

        int x = 0;
        if (false && (1 == ++x)) {
            System.out.println("Inside in if...");
        }
        System.out.println(x); // 0
    }


    public static void testOr() {
        System.out.println(false || false); // false
        System.out.println(false || true);  // true
        System.out.println(true || false); // true --> circuit breaker
        System.out.println(true | false); // true --> non circuit breaker
        System.out.println(true || true); // true

        System.out.println("----------------");

        System.out.println(false && false); // false --> circuit breaker
        System.out.println(false && true);  // false --> circuit breaker
        System.out.println(true && false); // false --> circuit breaker
        System.out.println(true && true); // true --> circuit breaker


    }
}
