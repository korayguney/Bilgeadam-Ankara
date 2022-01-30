package com.bilgeadam.enumerations;

public enum CityEnum {
    ANKARA, ISTANBUL, IZMIR, ADANA, RIZE;
}

class TestCity {

    private int a;
    private String name;
    private CityEnum city;

    public TestCity(CityEnum city) {
        this.city = city;
    }

    public static void main(String[] args) {
        TestCity testCity = new TestCity(CityEnum.ANKARA);
    }
}
