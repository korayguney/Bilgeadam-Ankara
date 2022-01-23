package com.bilgeadam.inheritance;

public class Dog extends Animal {

    private String familyName;

    public Dog(String name) {
        super(name, 15);
        this.familyName= "aaa";
    }

    public Dog(String name, int lifeTime) {
        super(name, lifeTime);
    }

     public Dog(){
         super("Lessie");
         this.familyName = "Baskul Ailesi";
     }


    public void play() {
        System.out.println("Dog is playing with ball");
    }

    @Override
    public void sleeping() {
        System.out.println("The animal sleeps 9 hours!");
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "familyName='" + familyName + '\'' +
                "} " + super.toString();
    }
}


