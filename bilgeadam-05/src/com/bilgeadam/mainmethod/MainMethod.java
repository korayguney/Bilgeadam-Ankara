package com.bilgeadam.mainmethod;

public class MainMethod {
    public static void main(String[] args) {
       if(args.length == 0) {
           System.out.println("There isn't any argument!");
       } else {
           for (int i = 0; i < args.length; i++) {
               System.out.println((i + 1) + ".argument : " + args[i]);
           }
       }
    }
}
