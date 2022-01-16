package com.bilgeadam.encapsulation;

public class TestBankCustomer {
    public static void main(String[] args) {

        BankCustomer bankCustomer = new BankCustomer(135);

        // business rule --> age can be max.100
       // bankCustomer.setAge(135);

        System.out.println("Bank customer age is " + bankCustomer.getAge());

    }
}
