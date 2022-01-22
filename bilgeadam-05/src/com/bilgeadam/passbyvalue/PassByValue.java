package com.bilgeadam.passbyvalue;

public class PassByValue {
    // primitive types
    public static void main(String[] args) {
        new PassByValue().someMethod();
    }

    void someMethod() {
        int x = 3;
        changeValue(x); // x
        System.out.println("x= " + x); // 3? 5?
    }

    public void changeValue(int x) {
        x += 2; // 5
        System.out.println("x= " + x); // 5
    }

}
