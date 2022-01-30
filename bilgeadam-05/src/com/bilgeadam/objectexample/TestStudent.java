package com.bilgeadam.objectexample;

public class TestStudent {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student("Ali", "Veli", 18, 11111111111L, Gender.MALE);
       // Student student2 = new Student("Ali", "Veli", 21, 11111111111L, "M");
        Student student3 = student1.clone();
        student3.setSecondName("Kaya");
        student3.setSsid(11111111112L);
        System.out.println(student1);

        //System.out.println(student1);
        System.out.println(student1.equals(student3)); // true

    }
}
