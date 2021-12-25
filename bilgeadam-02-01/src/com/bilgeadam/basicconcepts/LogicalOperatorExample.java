package com.bilgeadam.basicconcepts;

public class LogicalOperatorExample {

    public static void main(String[] args) {

        //conditional_AND();
        //logical_AND();

        int x = 0;
        if((x != 0) && (1/x > 1)) {
            System.out.println("Inside of second if");
        }
    }

    private static void logical_AND() {
        int x = 0;
        if (false & (1 == ++x)) {
            System.out.println("Inside in if...");
        }
        System.out.println(x); // 1
    }

    private static void conditional_AND() {
        int x = 0;
        if (false && (1 == ++x)) {
            System.out.println("Inside in if...");
        }
        System.out.println(x); // 0
    }


}
