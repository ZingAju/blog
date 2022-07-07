package com.zingscoop.polymorphism;

public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("bark !!");
    }

    public void makeSound(int noOfTimes) {
        for (int i = 1; i <= noOfTimes; i++) {
            System.out.print(i + " ");
            makeSound();
        }
    }
    
}
