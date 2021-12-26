package com.bilgeadam.basicconcepts;

public class SwitchExample {
    static String str;

    public static void main(String[] args) {

        int i = 1;

        switch (i) {
            case 1:
                str = "1- This is " + i;
                break;
            case 2:
                str = "2- This is " + i;
                break;
            case 3:
                str = "3- This is " + i;
                break;
            default:
                str = "Not found!";
                break;
        }

        System.out.println(str);

    }
}
