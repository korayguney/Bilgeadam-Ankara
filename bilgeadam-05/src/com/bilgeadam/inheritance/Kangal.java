package com.bilgeadam.inheritance;

public class Kangal extends Dog {

    @Override
    public void eating() {
        System.out.println("Kangal is eating meat!");
    }

    @Override
    public void sleeping() {
        System.out.println("Kangal is sleeping 6 hours!");
    }
}
