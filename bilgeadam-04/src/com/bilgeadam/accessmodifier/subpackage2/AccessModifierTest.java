package com.bilgeadam.accessmodifier.subpackage2;

import com.bilgeadam.accessmodifier.subpackage1.AccessModifiers;

public class AccessModifierTest extends AccessModifiers {
    public static void main(String[] args) {
        new AccessModifierTest().bar();
    }

    public void bar() {
        AccessModifiers accessModifiers = new AccessModifiers();
        System.out.println(accessModifiers.publicStr);
        System.out.println(this.protectedStr);
      //  System.out.println(accessModifiers.defaultStr);
    }
}
