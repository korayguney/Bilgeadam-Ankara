package com.bilgeadam.constant;

public class ConstantExample {
    // Constant
    private final double dollarRate = 13.50;
    private final double euroRate;
    public static final double STERLINE_RATE = 18.00;

    public ConstantExample(){
        this.euroRate = 15.00;
    }

    public ConstantExample(double euroRate) {
        this.euroRate = euroRate;
    }

    public void tryToChangeConstantValues(){
       // this.dollarRate = 14.50;
       // this.euroRate = 20.00;
       // this.STERLINE_RATE = 22;
    }

}

class SubConstantExample {
    public static void main(String[] args) {
        // ConstantExample.STERLINE_RATE = 45;
        ConstantExample example = new ConstantExample();
    }
}
