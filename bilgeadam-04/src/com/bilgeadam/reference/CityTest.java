package com.bilgeadam.reference;

import com.bilgeadam.test.Test;
import com.bilgeadam.test100.Test2;
import com.bilgeadam.test100.Test3;

import java.util.List;

public class CityTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test test = new Test();
        com.bilgeadam.test100.Test test1 = new com.bilgeadam.test100.Test();
        List list;
        java.awt.List list2;

        Test2 test2 = new Test2();
        Test3 test3 = new Test3();
        String str = new String();

        City city = new City();
        city.name = "Ankara";
        System.out.println("city : " + city.name); // Ankara

        // derin-kopyalama (deep-copy)
        // City city2 = city;

        // sığ-kopyalama (swallow-copy)
        City city2 = (City) city.clone();
        city2.name = "Istanbul";

        System.out.println("city : " + city.name); // Ankara
        System.out.println("city2 : " + city2.name); // Istanbul
        city.name = "Berlin";
        System.out.println("city2 : " + city2.name); // ???

        int a = 3;
        int b = a;
        b++;
        System.out.println(a);
        System.out.println(b);

    }
}
