package com.bilgeadam.accessmodifier.subpackage1;

public class AccessModifierTest {
    public static void main(String[] args) {
        new AccessModifierTest().bar();
    }

    public void bar() {
        AccessModifiers accessModifiers = new AccessModifiers();
        System.out.println(accessModifiers.publicStr);
        System.out.println(accessModifiers.protectedStr);
        System.out.println(accessModifiers.defaultStr);
    }
}
