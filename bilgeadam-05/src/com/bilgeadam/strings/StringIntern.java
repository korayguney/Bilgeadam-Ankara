package com.bilgeadam.strings;

public class StringIntern {
    public static void main(String[] args) {
        String str1 = "Bilgeadam";
        String str2 = "Bilgeadam";

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1 == str2); // true

        String str3 = new String("2022");
        str3 = str3.intern();
        String str4 = "2022";

        System.out.println(str3.equals(str4)); // true
        System.out.println(str3 == str4); // true

    }

}
