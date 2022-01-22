package com.bilgeadam.strings;

public class StringObject {
    public static void main(String[] args) {
        String newStr = new String("Hello ");
        String newStr2 = newStr;
        System.out.println(newStr.hashCode());
        newStr += "2022";
        System.out.println(newStr.hashCode());

        System.out.println(newStr);
        System.out.println(newStr2);
    }
}
