package com.bilgeadam.strings;

public class StringBufferAndStringBuilder {
    public static void main(String[] args) {

        // String
        // immutable
        String str = "Koray";
        System.out.println("String memory ID : "  + str.hashCode());
        str += " Güney";
        System.out.println("String memory ID : "  + str.hashCode());
        System.out.println("String : " + str);

        // mutable (değiştirilebilir)
        // asyncronized (non-thread-safe)
        // faster run
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Koray");
        System.out.println("StringBuilder memory ID : "  + stringBuilder.hashCode());
        stringBuilder.append(" Güney");
        System.out.println("StringBuilder memory ID : "  + stringBuilder.hashCode());
        System.out.println("String Builder : " + stringBuilder);

        // mutable (değiştirilebilir)
        // syncronized (thread-safe)
        // slower run
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Koray");
        System.out.println("stringBuffer memory ID : "  + stringBuffer.hashCode());
        stringBuffer.append(" Güney");
        System.out.println("stringBuffer memory ID : "  + stringBuffer.hashCode());
        System.out.println("stringBuffer : " + stringBuffer);




    }
}
