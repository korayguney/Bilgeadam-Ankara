package com.bilgeadam.basicconcepts;

public class PrimitiveTypeDefaultExample {

    static byte myByte;
    static short myShort;
    static int myInteger;
    static long myLong;
    static char myChar;
    static float myFloat;
    static double myDouble;
    static boolean myBoolean;

    public static void main(String[] args) {
        System.out.println(myByte);  // 0
        System.out.println(myShort); // 0
        System.out.println(myInteger); // 0
        System.out.println(myLong); // 0
        System.out.println(myChar); // null (Ascii empty character)
        System.out.println(myFloat); // 0.0
        System.out.println(myDouble); // 0.0
        System.out.println(myBoolean); // false
    }
}
