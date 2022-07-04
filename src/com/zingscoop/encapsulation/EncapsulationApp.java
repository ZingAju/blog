package com.zingscoop.encapsulation;

public class EncapsulationApp {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // System.out.println("Energy of Dog ? -> " + dog.energy); // can't do it, since energy state is private.
        
        dog.feed();
        System.out.println("Energy --> " + dog.getEnergy());
        System.out.println("Hungry --> " + dog.getHungry());

        dog.play();
        System.out.println("Energy --> " + dog.getEnergy());
        System.out.println("Hungry --> " + dog.getHungry());

        dog.sleep();
        System.out.println("Energy --> " + dog.getEnergy());
        System.out.println("Hungry --> " + dog.getHungry());

    }
    
}
