package com.bilgeadam.statics;

public class TestCreditCard {
    private static int test;

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard();
        CreditCard card3 = new CreditCard();
        CreditCard card4 = new CreditCard();
        CreditCard card5 = new CreditCard();
        CreditCard card6 = new CreditCard();

        System.out.println("Total issued credit card " + CreditCard.getCounter());
        new TestCreditCard().foo();
        System.out.println(test);
    }

    public void foo(){
        bar();
        System.out.println(test);
    }

    public static void bar(){

    }
}
