package com.bilgeadam.constant;

public class ConstantExample {
    // Constant
    private final double dollarRate = 13.50;
    private final double euroRate;
    private static final double STERLINE_RATE = 18.00;

    public ConstantExample(){
        this.euroRate = 15.00;
    }

    public ConstantExample(double euroRate) {
        this.euroRate = euroRate;
    }
}
