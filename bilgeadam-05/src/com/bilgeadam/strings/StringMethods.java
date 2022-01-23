package com.bilgeadam.strings;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String test = "Hello Bilgeadam";
        String test1 = "    Hello Bilgeadam    ";
        String test2 = null;
        String test3 = null;
        String testIgnoreCase = "HELLO Bilgeadam";

        System.out.println(test.charAt(0));

        test = test.concat(" from Ankara");
        System.out.println(test);

        System.out.println(test.contains("ll"));

        System.out.println(test1.equalsIgnoreCase(testIgnoreCase));

        System.out.println(test.isEmpty());

        if (test2 != null) {
            test1 = test1.concat(test2);
        }

        System.out.println(test.length());

        String[] testArr = test.split(" ");
        for (int i = 0; i < testArr.length; i++) {
            System.out.println((i + 1) + " : " + testArr[i]);
        }

        System.out.println(test.substring(5));

        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase(Locale.ROOT));

        System.out.println(test1);
        System.out.println(test1.trim());

        String name = "Hasan";
        String surname = "Kaya";
        int age = 35;
        System.out.println("Adı : " + name + ", Soyadı: " + surname);
        String newStr = String.format("Adı : %s, Soyadı: %s, yaşı : %d" , name, surname, age);
        System.out.println(newStr);
        System.out.printf("Adı : %s, Soyadı: %s" , name, surname);

        StringUtils.defaultIfBlank(test3, "Test 3 is not blank");
        System.out.println("Test 3 --->" + test3);
    }
}
