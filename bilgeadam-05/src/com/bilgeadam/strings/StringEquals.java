package com.bilgeadam.strings;

public class StringEquals {
    public static void main(String[] args) {
        // String literals [String Common(Constant) Pool]
        String str1 = "Bilgeadam";
        String str2 = "Bilgeadam";
       // str2 = "Ankara";

        // text check
        if(str1.equals(str2)) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are NOT equal");
        }

        // memory address
        if(str1 == str2) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are NOT equal");
        }

        System.out.println("----------------------");
        // String objects
        String str3 = new String("Bilgeadam");
        String str4 = new String("Bilgeadam");

        // text check
        if(str3.equals(str4)) {
            System.out.println("str3 and str4 are equal");
        } else {
            System.out.println("str3 and str4 are NOT equal");
        }

        // memory address
        if(str3 == str4) {
            System.out.println("str3 and str4 are equal");
        } else {
            System.out.println("str3 and str4 are NOT equal");
        }

        // hashcode
        System.out.println("str1 : " + System.identityHashCode(str1));
        System.out.println("str2 : " + System.identityHashCode(str2));
        System.out.println("str3 : " + System.identityHashCode(str3));
        System.out.println("str4 : " + System.identityHashCode(str4));

    }
}
