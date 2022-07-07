package com.zingscoop.polymorphism;

public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Meowing !!");
    }

    public void makeSound(int noOfTimes) {
        for (int i = 1; i <= noOfTimes; i++) {
            System.out.print(i + " ");
            makeSound();
        }
    }
    
}
