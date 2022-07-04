package com.zingscoop.encapsulation;

public class Dog {

    private int hungry = 41;
    private int energy = 41;

    public void feed () {
        System.out.println("Feed ...");
        hungry--;
        energy++;
    }

    public void sleep() {
        System.out.println("Sleep ...");
        energy++;
        hungry++;
    }

    public void play() {
        System.out.println("Play ...");
        energy--;
        hungry++;
    }

    public int getHungry() {
        return hungry;
    }
    public int getEnergy() {
        return energy;
    }
}
