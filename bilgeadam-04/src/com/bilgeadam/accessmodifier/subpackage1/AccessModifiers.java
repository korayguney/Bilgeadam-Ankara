package com.bilgeadam.accessmodifier.subpackage1;

public class AccessModifiers {

    private String privateStr = "privateStr";
    protected String protectedStr = "protectedStr";
    public String publicStr = "publicStr";
    String defaultStr = "defaultStr";   // default access modifier


    private void foo(){
        privateStr = "Test";
        int a = 1;
        System.out.println(a);
    }

    class InnerAccessModifiers {

    }
}
