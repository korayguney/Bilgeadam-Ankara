package com.bilgeadam.inheritance;

public class Animal {
    private String name = "Jessy";
    private int lifeTime;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int lifeTime) {
        this.name = name;
        this.lifeTime = lifeTime;
    }

    public void eating(){

    }

    public void sleeping(){
        System.out.println("The animal sleeps 12 hours!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", lifeTime=" + lifeTime +
                '}';
    }
}
