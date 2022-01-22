package com.bilgeadam.passbyvalue;

public class TestCity {
    public static void main(String[] args) {
        City city1 = new City();
        city1.setName("Ankara");
        City city2 = city1;

        changeCityName(city2);
        System.out.println("City1 name : " + city1.getName()); // İstanbul? Ankara?
    }

    private static void changeCityName(City city2) {
        city2.setName("Istanbul");
        System.out.println("City2 name : " + city2.getName()); // İstanbul
    }
}
